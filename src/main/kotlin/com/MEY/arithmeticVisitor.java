// Generated from C:/Users/Greasemain/Dropbox/projects/Employment Projects/Antlr/antlr_calc/src/main/kotlin/com/MEY\arithmetic.g4 by ANTLR 4.8
package com.MEY;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link arithmeticParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface arithmeticVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link arithmeticParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(arithmeticParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Par}
	 * labeled alternative in {@link arithmeticParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar(arithmeticParser.ParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link arithmeticParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(arithmeticParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link arithmeticParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(arithmeticParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link arithmeticParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(arithmeticParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sce}
	 * labeled alternative in {@link arithmeticParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSce(arithmeticParser.SceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Num}
	 * labeled alternative in {@link arithmeticParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(arithmeticParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mulp}
	 * labeled alternative in {@link arithmeticParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulp(arithmeticParser.MulpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Pow}
	 * labeled alternative in {@link arithmeticParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(arithmeticParser.PowContext ctx);
}