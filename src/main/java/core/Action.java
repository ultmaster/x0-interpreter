package core;

import core.data.*;
import core.interrupt.BreakInterrupt;
import core.interrupt.ContinueInterrupt;
import core.interrupt.ReturnInterrupt;
import grammar.X0BaseVisitor;
import grammar.X0Parser;

import javax.xml.crypto.Data;
import java.util.*;
import java.util.stream.Collectors;

public class Action extends X0BaseVisitor {
    private X0Parser parser;
    private Scanner cin;
    private Stack<Map<String, DataType>> dataStack;
    private Map<String, DataType> globals;
    private Map<String, X0Parser.ProcedureContext> procedures;
    private boolean debugFlag;

    public Action(X0Parser parser) {
        this.parser = parser;
        cin = new Scanner(System.in);
        dataStack = new Stack<>();
        procedures = new HashMap<>();
        debugFlag = false;
    }

    public void setDebug(boolean debug) {
        debugFlag = debug;
    }

    @Override
    public Object visitProcedureList(X0Parser.ProcedureListContext ctx) {
        ctx.procedure().forEach(procedure -> procedures.put(visitIdent(procedure.ident()), procedure));
        return null;
    }

    @Override
    public Object visitProgram(X0Parser.ProgramContext ctx) {
        globals = new HashMap<>();
        accumulateDeclarationList(ctx.declarationList(0), globals);
        dataStack.push(new HashMap<>());
        visitProcedureList(ctx.procedureList());
        visitDeclarationList(ctx.declarationList(1));
        Object ret = this.visit(ctx.statementList());
        dataStack.pop();
        return ret;
    }

    private ElementaryType callProcedure(String name, List<DataType> arguments) {
        X0Parser.ProcedureContext proc = procedures.get(name);
        if (proc == null) {
            throw new RuntimeException("Procedure '" + name + "' not found.");
        }
        // argument mapping
        dataStack.push(new HashMap<>());

        if (arguments.size() != proc.procedureArgument().size()) {
            throw new RuntimeException(String.format("Procedure '%s' arguments: expected %d, found %d",
                    name, proc.procedureArgument().size(), arguments.size()));
        }
        for (int i = 0; i < arguments.size(); ++i) {
            DataType d = arguments.get(i);
            if (proc.procedureArgument(i).REF() == null)
                try {
                    d = (DataType) d.clone();
                } catch (CloneNotSupportedException e) {
                    throw new RuntimeException("Procedure argument does not support clone here.");
                }
            addDeclaredIdent(dataStack.peek(), visitIdent(proc.procedureArgument(i).ident()), d);
        }
        visitDeclarationList(proc.declarationList());
        try {
            visitStatementList(proc.statementList());
        } catch (ReturnInterrupt e) {
            if (e.data != null) {
                dataStack.pop();  // clean up
                return e.data;
            }
        } catch (ContinueInterrupt | BreakInterrupt e) {
            throw new RuntimeException("Loop structure not found for continue/break.");
        }
        dataStack.pop();
        return new X0Boolean(false);
    }

    @Override
    public Object visitCallExpr(X0Parser.CallExprContext ctx) {
        List<DataType> arguments = ctx.expression().stream().map(exp -> (DataType) visit(exp)).collect(Collectors.toList());
        return callProcedure(visitIdent(ctx.ident()), arguments);
    }

    @Override
    public Integer visitTypeInt(X0Parser.TypeIntContext ctx) {
        return X0Parser.INT;
    }

    @Override
    public Integer visitTypeChar(X0Parser.TypeCharContext ctx) {
        return X0Parser.CHAR;
    }

    @Override
    public Integer visitTypeStr(X0Parser.TypeStrContext ctx) {
        return X0Parser.STR;
    }

    @Override
    public Integer visitTypeFloat(X0Parser.TypeFloatContext ctx) {
        return X0Parser.FLOAT;
    }

    @Override
    public Integer visitTypeBool(X0Parser.TypeBoolContext ctx) {
        return X0Parser.BOOL;
    }

    @Override
    public String visitIdent(X0Parser.IdentContext ctx) {
        return ctx.getText();
    }

    private class IdentDeclParsingResult {
        IdentDeclParsingResult(String ident, List<Integer> dimensions) {
            this.ident = ident;
            this.dimensions = dimensions;
        }

        String ident;

        List<Integer> dimensions;
    }

    private void addDeclaredIdent(Map<String, DataType> map, String ident, DataType data) {
        if (map.containsKey(ident)) {
            throw new RuntimeException("Duplicated key: " + ident);
        }
        map.put(ident, data);
    }

    @Override
    public IdentDeclParsingResult visitIdentDeclArray(X0Parser.IdentDeclArrayContext ctx) {
        String name = (String) this.visit(ctx.ident());
        List<Integer> dimensions = new ArrayList<>();
        for (X0Parser.ExpressionContext exp: ctx.expression()) {
            ElementaryType t = (ElementaryType) visit(exp);
            if (!(t instanceof X0Integer))
                throw new RuntimeException("Array dimensions should be integers");
            X0Integer tInt = (X0Integer) t;
            if (tInt.getVal().intValue() <= 0)
                throw new RuntimeException("Array dimensions should be greater than 0");
            dimensions.add(tInt.getVal().intValue());
        }
        return new IdentDeclParsingResult(name, dimensions);
    }

    @Override
    public IdentDeclParsingResult visitIdentDeclElementary(X0Parser.IdentDeclElementaryContext ctx) {
        String name = (String) this.visit(ctx.ident());
        return new IdentDeclParsingResult(name, null);
    }

    @Override
    public Map<String, DataType> visitDeclarationStat(X0Parser.DeclarationStatContext ctx) {
        int type = (Integer) this.visit(ctx.type());
        Class typeObj = null;
        if (type == X0Parser.INT || type == X0Parser.CHAR) {
            typeObj = X0Integer.class;
        } else if (type == X0Parser.BOOL) {
            typeObj = X0Boolean.class;
        } else if (type == X0Parser.FLOAT) {
            typeObj = X0Float.class;
        } else if (type == X0Parser.STR) {
            typeObj = X0String.class;
        }
        assert typeObj != null;
        Map<String, DataType> ret = new HashMap<>();
        for (X0Parser.IdentDeclContext identDeclContext : ctx.identDecl()) {
            IdentDeclParsingResult t = (IdentDeclParsingResult) visit(identDeclContext);
            if (t.dimensions == null) {
                try {
                    DataType data = (DataType) typeObj.newInstance();
                    addDeclaredIdent(ret, t.ident, data);
                } catch (InstantiationException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            } else {
                @SuppressWarnings("unchecked") DataType data = new X0Array<>(typeObj, t.dimensions);
                addDeclaredIdent(ret, t.ident, data);
            }
        }
        return ret;
    }

    private void accumulateDeclarationList(X0Parser.DeclarationListContext ctx, Map<String, DataType> cur) {
        for (X0Parser.DeclarationStatContext statContext : ctx.declarationStat()) {
            visitDeclarationStat(statContext).forEach((k, v) -> addDeclaredIdent(cur, k, v));
        }
        if (debugFlag) {
            cur.forEach((key, val) -> System.err.println(key + "\t" + val.verboseInfo()));
        }
    }

    @Override
    public Object visitDeclarationList(X0Parser.DeclarationListContext ctx) {
        accumulateDeclarationList(ctx, dataStack.peek());
        return null;
    }

    private DataType locateDataByName(String name) {
        DataType data = dataStack.peek().get(name);
        if (data == null) {
            return globals.get(name);
        } return data;
    }

    @Override
    public ElementaryType visitVarArray(X0Parser.VarArrayContext ctx) {
        String ident = this.visitIdent(ctx.ident());
        DataType data = locateDataByName(ident);
        if (data == null || ! (data instanceof X0Array)) {
            throw new RuntimeException("Unable to find '" + ident + "' as an elementary type variable");
        }
        List<Integer> indices = new ArrayList<>();
        ctx.expression().forEach(num -> {
            X0Integer t = (X0Integer) this.visit(num);
            indices.add(t.getVal().intValue());
        });
        return ((X0Array) data).get(indices);
    }

    @Override
    public ElementaryType visitVarElementary(X0Parser.VarElementaryContext ctx) {
        String ident = this.visitIdent(ctx.ident());
        DataType data = locateDataByName(ident);
        if (data == null || ! (data instanceof ElementaryType)) {
            throw new RuntimeException("Unable to find '" + ident + "' as an elementary type variable");
        }
        return (ElementaryType) data;
    }

    @Override
    public Object visitWriteStat(X0Parser.WriteStatContext ctx) {
        System.out.println(this.visit(ctx.expression()).toString());
        return null;
    }

    @Override
    public Object visitReadStat(X0Parser.ReadStatContext ctx) {
        ElementaryType data = (ElementaryType) this.visit(ctx.var());
        if (data instanceof X0Integer) {
            data.assign(new X0Integer(cin.nextLong()));
        } else if (data instanceof X0Boolean) {
            data.assign(new X0Boolean(cin.nextInt()));
        } else if (data instanceof X0Float) {
            data.assign(new X0Float(cin.nextDouble()));
        } else if (data instanceof X0String) {
            data.assign(new X0String(cin.next()));
        } else {
            System.err.println("Read failed");
        }
        return null;
    }

    @Override
    public Object visitExpressionStat(X0Parser.ExpressionStatContext ctx) {
        super.visitExpressionStat(ctx);
        return null;
    }

    @Override
    public ElementaryType visitExprAssign(X0Parser.ExprAssignContext ctx) {
        ElementaryType lVal = (ElementaryType) visit(ctx.var());
        ElementaryType rVal = (ElementaryType) visit(ctx.expression());
        lVal.assign(rVal);
        return lVal;
    }

    @Override
    public ElementaryType visitConditionFactor(X0Parser.ConditionFactorContext ctx) {
        ElementaryType a = (ElementaryType) visit(ctx.additiveExpr(0));
        if (ctx.additiveExpr().size() > 1) {
            ElementaryType b = (ElementaryType) visit(ctx.additiveExpr(1));
            int compareResult = a.compare(b);
            boolean result = false;
            if (ctx.op.getType() == X0Parser.GT) result = compareResult > 0;
            else if (ctx.op.getType() == X0Parser.GEQ) result = compareResult >= 0;
            else if (ctx.op.getType() == X0Parser.LT) result = compareResult < 0;
            else if (ctx.op.getType() == X0Parser.LEQ) result = compareResult <= 0;
            else if (ctx.op.getType() == X0Parser.EQ) result = compareResult == 0;
            else if (ctx.op.getType() == X0Parser.NEQ) result = compareResult != 0;
            return new X0Boolean(result);
        } else return a;
    }

    @Override
    public ElementaryType visitConditionExprRecursive(X0Parser.ConditionExprRecursiveContext ctx) {
        ElementaryType a = (ElementaryType) visit(ctx.simpleExpr());
        ElementaryType b = (ElementaryType) visit(ctx.conditionTerm());
        return a.or(b);
    }

    @Override
    public ElementaryType visitConditionTermNot(X0Parser.ConditionTermNotContext ctx) {
        ElementaryType ret = (ElementaryType) visit(ctx.conditionFactor());
        if (ctx.NOT() != null) return ret.not();
        else return ret;
    }

    @Override
    public ElementaryType visitConditionTermRecursive(X0Parser.ConditionTermRecursiveContext ctx) {
        ElementaryType a = (ElementaryType) visit(ctx.conditionTerm());
        ElementaryType b = (ElementaryType) visit(ctx.conditionFactor());
        return a.and(b);
    }

    @Override
    public ElementaryType visitAdditiveExprRecursive(X0Parser.AdditiveExprRecursiveContext ctx) {
        ElementaryType a = (ElementaryType) visit(ctx.additiveExpr());
        ElementaryType b = (ElementaryType) visit(ctx.term());
        if (ctx.op.getType() == X0Parser.PLUS) {
            return a.add(b);
        } else if (ctx.op.getType() == X0Parser.MINUS) {
            return a.subtract(b);
        }
        return null;
    }

    @Override
    public ElementaryType visitAdditiveExprDefault(X0Parser.AdditiveExprDefaultContext ctx) {
        ElementaryType data = (ElementaryType) visit(ctx.term());
        if (ctx.MINUS() != null)
            return data.negative();
        return data;
    }

    @Override
    public ElementaryType visitTermDefault(X0Parser.TermDefaultContext ctx) {
        return (ElementaryType) visit(ctx.factor());
    }

    @Override
    public X0Number visitTermRecursive(X0Parser.TermRecursiveContext ctx) {
        X0Number a = (X0Number) visit(ctx.term());
        X0Number b = (X0Number) visit(ctx.factor());
        if (ctx.op.getType() == X0Parser.MUL) {
            return a.multiply(b);
        } else if (ctx.op.getType() == X0Parser.DIV) {
            return a.divide(b);
        } else if (ctx.op.getType() == X0Parser.MOD) {
            return a.mod(b);
        }
        return null;
    }

    @Override
    public ElementaryType visitFactorRecursive(X0Parser.FactorRecursiveContext ctx) {
        return (ElementaryType) visit(ctx.expression());
    }

    @Override
    public ElementaryType visitFactorVariable(X0Parser.FactorVariableContext ctx) {
        return (ElementaryType) visit(ctx.var());
    }

    @Override
    public ElementaryType visitFactorLiteral(X0Parser.FactorLiteralContext ctx) {
        return (ElementaryType) super.visitFactorLiteral(ctx);
    }

    @Override
    public X0Integer visitLiteralInteger(X0Parser.LiteralIntegerContext ctx) {
        return new X0Integer(Long.parseLong(ctx.getText()));
    }

    @Override
    public X0String visitLiteralString(X0Parser.LiteralStringContext ctx) {
        String r = ctx.STRING().getText();
        return new X0String(r.substring(1, r.length() - 1));
    }

    @Override
    public X0Boolean visitLiteralBool(X0Parser.LiteralBoolContext ctx) {
        return new X0Boolean(ctx.getText().equals("true"));
    }

    @Override
    public X0Float visitLiteralFloat(X0Parser.LiteralFloatContext ctx) {
        return new X0Float(Double.parseDouble(ctx.getText()));
    }

    @Override
    public Object visitIfStat(X0Parser.IfStatContext ctx) {
        ElementaryType cond = (ElementaryType) visit(ctx.expression());
        if (cond.compareToZero() != 0) {
            visit(ctx.statement(0));
        } else if (ctx.statement().size() > 1) {
            visit(ctx.statement(1));
        }
        return null;
    }

    @Override
    public Object visitWhileStat(X0Parser.WhileStatContext ctx) {
        while (true) {
            ElementaryType cond = (ElementaryType) visit(ctx.expression());
            if (cond.compareToZero() != 0) {
                try {
                    visit(ctx.statement());
                } catch (ContinueInterrupt e) {
                } catch (BreakInterrupt e) {
                    break;
                }
            } else break;
        }
        return null;
    }

    @Override
    public Object visitForStat(X0Parser.ForStatContext ctx) {
        visit(ctx.expression(0));
        while (true) {
            ElementaryType cond = (ElementaryType) visit(ctx.expression(1));
            if (cond.compareToZero() != 0) {
                try {
                    visit(ctx.statement());
                } catch (ContinueInterrupt e) {
                } catch (BreakInterrupt e) {
                    break;
                }
                visit(ctx.expression(2));
            } else break;
        }
        return null;
    }

    @Override
    public Object visitExprSelfDecrease(X0Parser.ExprSelfDecreaseContext ctx) {
        ElementaryType data = (ElementaryType) visit(ctx.var());
        data.assign(data.subtract(new X0Integer(1)));
        return data;
    }

    @Override
    public ElementaryType visitExprSelfIncrease(X0Parser.ExprSelfIncreaseContext ctx) {
        ElementaryType data = (ElementaryType) visit(ctx.var());
        data.assign(data.add(new X0Integer(1)));
        return data;
    }

    @Override
    public Object visitContinueStat(X0Parser.ContinueStatContext ctx) {
        throw new ContinueInterrupt();
    }

    @Override
    public Object visitBreakStat(X0Parser.BreakStatContext ctx) {
        throw new BreakInterrupt();
    }

    @Override
    public Object visitReturnStat(X0Parser.ReturnStatContext ctx) {
        if (ctx.expression() == null) {
            throw new ReturnInterrupt();
        } else {
            throw new ReturnInterrupt((ElementaryType) visit(ctx.expression()));
        }
    }
}
