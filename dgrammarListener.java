// Generated from dgrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link dgrammarParser}.
 */
public interface dgrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link dgrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(dgrammarParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link dgrammarParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(dgrammarParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link dgrammarParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(dgrammarParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link dgrammarParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(dgrammarParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link dgrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(dgrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link dgrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(dgrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link dgrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(dgrammarParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link dgrammarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(dgrammarParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link dgrammarParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(dgrammarParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link dgrammarParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(dgrammarParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link dgrammarParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(dgrammarParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link dgrammarParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(dgrammarParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link dgrammarParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarType(dgrammarParser.VarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link dgrammarParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarType(dgrammarParser.VarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link dgrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(dgrammarParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link dgrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(dgrammarParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link dgrammarParser#methodType}.
	 * @param ctx the parse tree
	 */
	void enterMethodType(dgrammarParser.MethodTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link dgrammarParser#methodType}.
	 * @param ctx the parse tree
	 */
	void exitMethodType(dgrammarParser.MethodTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link dgrammarParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(dgrammarParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link dgrammarParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(dgrammarParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link dgrammarParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void enterParameterType(dgrammarParser.ParameterTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link dgrammarParser#parameterType}.
	 * @param ctx the parse tree
	 */
	void exitParameterType(dgrammarParser.ParameterTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link dgrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(dgrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link dgrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(dgrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link dgrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(dgrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link dgrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(dgrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link dgrammarParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(dgrammarParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link dgrammarParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(dgrammarParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link dgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(dgrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link dgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(dgrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link dgrammarParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(dgrammarParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link dgrammarParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(dgrammarParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link dgrammarParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(dgrammarParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link dgrammarParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(dgrammarParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link dgrammarParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(dgrammarParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link dgrammarParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(dgrammarParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link dgrammarParser#arith_op}.
	 * @param ctx the parse tree
	 */
	void enterArith_op(dgrammarParser.Arith_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link dgrammarParser#arith_op}.
	 * @param ctx the parse tree
	 */
	void exitArith_op(dgrammarParser.Arith_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link dgrammarParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(dgrammarParser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link dgrammarParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(dgrammarParser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link dgrammarParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void enterEq_op(dgrammarParser.Eq_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link dgrammarParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void exitEq_op(dgrammarParser.Eq_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link dgrammarParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void enterCond_op(dgrammarParser.Cond_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link dgrammarParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void exitCond_op(dgrammarParser.Cond_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link dgrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(dgrammarParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link dgrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(dgrammarParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link dgrammarParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void enterInt_literal(dgrammarParser.Int_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link dgrammarParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void exitInt_literal(dgrammarParser.Int_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link dgrammarParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void enterChar_literal(dgrammarParser.Char_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link dgrammarParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void exitChar_literal(dgrammarParser.Char_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link dgrammarParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(dgrammarParser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link dgrammarParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(dgrammarParser.Bool_literalContext ctx);
}