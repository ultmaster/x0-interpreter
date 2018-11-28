package core;

import core.data.*;
import grammar.X0BaseVisitor;
import grammar.X0Parser;

import javax.xml.bind.Element;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Action extends X0BaseVisitor {
    private X0Parser parser;
    private Scanner cin;
    private Stack<Map<String, DataType>> dataStack;

    public Action(X0Parser parser) {
        this.parser = parser;
        cin = new Scanner(System.in);
        dataStack = new Stack<>();
    }

    @Override
    public Object visitProgram(X0Parser.ProgramContext ctx) {
        Map<String, DataType> currentLayer = visitDeclarationList(ctx.declarationList());
        dataStack.push(currentLayer);
        Object ret = this.visit(ctx.statementList());
        dataStack.pop();
        return ret;
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
    public String visitIdent(X0Parser.IdentContext ctx) {
        return ctx.getText();
    }

    @Override
    public Map<String, DataType> visitDeclarationList(X0Parser.DeclarationListContext ctx) {
        Map<String, DataType> cur = new HashMap<>();
        for (X0Parser.DeclarationStatContext statContext : ctx.declarationStat()) {
            DataType decl = (DataType) this.visit(statContext);
            cur.put(decl.getIdent(), decl);
        }
        return cur;
    }

    @Override
    public DataType visitDeclElementary(X0Parser.DeclElementaryContext ctx) {
        int type = (Integer) this.visit(ctx.type());
        String name = (String) this.visit(ctx.ident());
        DataType data = null;
        if (type == X0Parser.INT || type == X0Parser.CHAR) {
            data = new X0Integer();
        }
        assert data != null;
        data.setIdent(name);
        return data;
    }

    @Override
    public ElementaryType visitVarElementary(X0Parser.VarElementaryContext ctx) {
        String ident = this.visitIdent(ctx.ident());
        DataType data = (DataType) dataStack.peek().get(ident);
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
            ((X0Integer) data).assign(new X0Integer(cin.nextLong()));
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
    public X0Integer visitRelationExpr(X0Parser.RelationExprContext ctx) {
        ElementaryType a = (ElementaryType) visit(ctx.additiveExpr(0));
        ElementaryType b = (ElementaryType) visit(ctx.additiveExpr(1));
        int compareResult = a.compare(b);
        boolean result = false;
        if (ctx.op.getType() == X0Parser.GT) result = compareResult > 0;
        else if (ctx.op.getType() == X0Parser.GEQ) result = compareResult >= 0;
        else if (ctx.op.getType() == X0Parser.LT) result = compareResult < 0;
        else if (ctx.op.getType() == X0Parser.LEQ) result = compareResult <= 0;
        else if (ctx.op.getType() == X0Parser.EQ) result = compareResult == 0;
        else if (ctx.op.getType() == X0Parser.NEQ) result = compareResult != 0;
        if (result) return new X0Integer(1);
        else return new X0Integer(0);
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
            if (cond.compareToZero() != 0)
                visit(ctx.statement());
            else break;
        }
        return null;
    }

    @Override
    public Object visitForStat(X0Parser.ForStatContext ctx) {
        visit(ctx.expression(0));
        while (true) {
            ElementaryType cond = (ElementaryType) visit(ctx.expression(1));
            if (cond.compareToZero() != 0) {
                visit(ctx.statement());
                visit(ctx.expression(2));
            } else break;
        }
        return null;
    }
}
