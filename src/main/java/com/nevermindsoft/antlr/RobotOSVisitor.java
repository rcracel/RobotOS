// Generated from RobotOS.g4 by ANTLR 4.1

package com.nevermindsoft.antlr;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RobotOSParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RobotOSVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RobotOSParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull RobotOSParser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link RobotOSParser#multiplication_division_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication_division_operation(@NotNull RobotOSParser.Multiplication_division_operationContext ctx);

	/**
	 * Visit a parse tree produced by {@link RobotOSParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull RobotOSParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link RobotOSParser#power_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower_operation(@NotNull RobotOSParser.Power_operationContext ctx);

	/**
	 * Visit a parse tree produced by {@link RobotOSParser#binary_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_operation(@NotNull RobotOSParser.Binary_operationContext ctx);

	/**
	 * Visit a parse tree produced by {@link RobotOSParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(@NotNull RobotOSParser.LineContext ctx);

	/**
	 * Visit a parse tree produced by {@link RobotOSParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(@NotNull RobotOSParser.ExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link RobotOSParser#addition_subtraction_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition_subtraction_operation(@NotNull RobotOSParser.Addition_subtraction_operationContext ctx);

	/**
	 * Visit a parse tree produced by {@link RobotOSParser#unary_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operation(@NotNull RobotOSParser.Unary_operationContext ctx);

	/**
	 * Visit a parse tree produced by {@link RobotOSParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(@NotNull RobotOSParser.PrintContext ctx);

	/**
	 * Visit a parse tree produced by {@link RobotOSParser#atomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomic(@NotNull RobotOSParser.AtomicContext ctx);
}