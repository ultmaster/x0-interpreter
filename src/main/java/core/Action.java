package core;

import core.data.DataType;
import core.data.X0Integer;
import core.data.ElementaryType;
import core.data.X0Number;
import grammar.X0BaseVisitor;
import grammar.X0Parser;

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
    public Boolean visitRelationExpr(X0Parser.RelationExprContext ctx) {
        ElementaryType a = (ElementaryType) visit(ctx.additiveExpr(0));
        ElementaryType b = (ElementaryType) visit(ctx.additiveExpr(1));
        int compareResult = a.compare(b);
        if (ctx.op.getType() == X0Parser.GT) return compareResult > 0;
        if (ctx.op.getType() == X0Parser.GEQ) return compareResult >= 0;
        if (ctx.op.getType() == X0Parser.LT) return compareResult < 0;
        if (ctx.op.getType() == X0Parser.LEQ) return compareResult <= 0;
        if (ctx.op.getType() == X0Parser.EQ) return compareResult == 0;
        if (ctx.op.getType() == X0Parser.NEQ) return compareResult != 0;
        return null;
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
}
