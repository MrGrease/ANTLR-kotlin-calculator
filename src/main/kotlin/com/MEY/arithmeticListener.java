// Generated from C:/Users/Greasemain/Dropbox/projects/Employment Projects/Antlr/antlr_calc/src/main/kotlin/com/MEY\arithmetic.g4 by ANTLR 4.8
package com.MEY;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link arithmeticParser}.
 */
public interface arithmeticListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link arithmeticParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(arithmeticParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link arithmeticParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(arithmeticParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Par}
	 * labeled alternative in {@link arithmeticParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterPar(arithmeticParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Par}
	 * labeled alternative in {@link arithmeticParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitPar(arithmeticParser.ParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Div}
	 * labeled alternative in {@link arithmeticParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterDiv(arithmeticParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link arithmeticParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitDiv(arithmeticParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link arithmeticParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterAdd(arithmeticParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link arithmeticParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitAdd(arithmeticParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link arithmeticParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterSub(arithmeticParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link arithmeticParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitSub(arithmeticParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sce}
	 * labeled alternative in {@link arithmeticParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterSce(arithmeticParser.SceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sce}
	 * labeled alternative in {@link arithmeticParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitSce(arithmeticParser.SceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Num}
	 * labeled alternative in {@link arithmeticParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterNum(arithmeticParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Num}
	 * labeled alternative in {@link arithmeticParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitNum(arithmeticParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mulp}
	 * labeled alternative in {@link arithmeticParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterMulp(arithmeticParser.MulpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mulp}
	 * labeled alternative in {@link arithmeticParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitMulp(arithmeticParser.MulpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Pow}
	 * labeled alternative in {@link arithmeticParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterPow(arithmeticParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Pow}
	 * labeled alternative in {@link arithmeticParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitPow(arithmeticParser.PowContext ctx);
}