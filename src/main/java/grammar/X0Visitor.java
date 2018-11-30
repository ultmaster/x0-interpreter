// Generated from /Users/Scott/IdeaProjects/x0/src/main/resources/X0.g4 by ANTLR 4.7
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link X0Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface X0Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link X0Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(X0Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link X0Parser#procedureList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureList(X0Parser.ProcedureListContext ctx);
	/**
	 * Visit a parse tree produced by {@link X0Parser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(X0Parser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link X0Parser#procedureArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureArgument(X0Parser.ProcedureArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link X0Parser#declarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationList(X0Parser.DeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link X0Parser#declarationStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStat(X0Parser.DeclarationStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link X0Parser#constDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDecl(X0Parser.ConstDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identDeclElementary}
	 * labeled alternative in {@link X0Parser#identDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentDeclElementary(X0Parser.IdentDeclElementaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identDeclArray}
	 * labeled alternative in {@link X0Parser#identDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentDeclArray(X0Parser.IdentDeclArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link X0Parser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(X0Parser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeInt}
	 * labeled alternative in {@link X0Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeInt(X0Parser.TypeIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeChar}
	 * labeled alternative in {@link X0Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeChar(X0Parser.TypeCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeStr}
	 * labeled alternative in {@link X0Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeStr(X0Parser.TypeStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeFloat}
	 * labeled alternative in {@link X0Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeFloat(X0Parser.TypeFloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeBool}
	 * labeled alternative in {@link X0Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBool(X0Parser.TypeBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varElementary}
	 * labeled alternative in {@link X0Parser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarElementary(X0Parser.VarElementaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varArray}
	 * labeled alternative in {@link X0Parser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarArray(X0Parser.VarArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link X0Parser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(X0Parser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by {@link X0Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(X0Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link X0Parser#continueStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStat(X0Parser.ContinueStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link X0Parser#breakStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStat(X0Parser.BreakStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link X0Parser#returnStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStat(X0Parser.ReturnStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link X0Parser#exitStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExitStat(X0Parser.ExitStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link X0Parser#ifStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(X0Parser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link X0Parser#whileStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStat(X0Parser.WhileStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link X0Parser#forStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStat(X0Parser.ForStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link X0Parser#doWhileStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStat(X0Parser.DoWhileStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link X0Parser#repeatUntilStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatUntilStat(X0Parser.RepeatUntilStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link X0Parser#writeStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteStat(X0Parser.WriteStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link X0Parser#readStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStat(X0Parser.ReadStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link X0Parser#compoundStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStat(X0Parser.CompoundStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link X0Parser#expressionStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStat(X0Parser.ExpressionStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAssign}
	 * labeled alternative in {@link X0Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAssign(X0Parser.ExprAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprSelfIncrease}
	 * labeled alternative in {@link X0Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSelfIncrease(X0Parser.ExprSelfIncreaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprSelfDecrease}
	 * labeled alternative in {@link X0Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSelfDecrease(X0Parser.ExprSelfDecreaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprSimpleWrapper}
	 * labeled alternative in {@link X0Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSimpleWrapper(X0Parser.ExprSimpleWrapperContext ctx);
	/**
	 * Visit a parse tree produced by {@link X0Parser#callExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpr(X0Parser.CallExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link X0Parser#callArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallArgument(X0Parser.CallArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionExprSimple}
	 * labeled alternative in {@link X0Parser#simpleExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionExprSimple(X0Parser.ConditionExprSimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionExprRecursive}
	 * labeled alternative in {@link X0Parser#simpleExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionExprRecursive(X0Parser.ConditionExprRecursiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionTermNot}
	 * labeled alternative in {@link X0Parser#conditionTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionTermNot(X0Parser.ConditionTermNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionTermRecursive}
	 * labeled alternative in {@link X0Parser#conditionTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionTermRecursive(X0Parser.ConditionTermRecursiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link X0Parser#conditionFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionFactor(X0Parser.ConditionFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExprRecursive}
	 * labeled alternative in {@link X0Parser#additiveExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExprRecursive(X0Parser.AdditiveExprRecursiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExprDefault}
	 * labeled alternative in {@link X0Parser#additiveExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExprDefault(X0Parser.AdditiveExprDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termDefault}
	 * labeled alternative in {@link X0Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermDefault(X0Parser.TermDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termRecursive}
	 * labeled alternative in {@link X0Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermRecursive(X0Parser.TermRecursiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorRecursive}
	 * labeled alternative in {@link X0Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorRecursive(X0Parser.FactorRecursiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorVariable}
	 * labeled alternative in {@link X0Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorVariable(X0Parser.FactorVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorLiteral}
	 * labeled alternative in {@link X0Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorLiteral(X0Parser.FactorLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorCall}
	 * labeled alternative in {@link X0Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorCall(X0Parser.FactorCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalInteger}
	 * labeled alternative in {@link X0Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralInteger(X0Parser.LiteralIntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalString}
	 * labeled alternative in {@link X0Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralString(X0Parser.LiteralStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalBool}
	 * labeled alternative in {@link X0Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralBool(X0Parser.LiteralBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalFloat}
	 * labeled alternative in {@link X0Parser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralFloat(X0Parser.LiteralFloatContext ctx);
}