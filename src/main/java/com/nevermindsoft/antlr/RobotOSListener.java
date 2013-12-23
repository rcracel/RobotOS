// Generated from RobotOS.g4 by ANTLR 4.1

package com.nevermindsoft.antlr;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RobotOSParser}.
 */
public interface RobotOSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RobotOSParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull RobotOSParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RobotOSParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull RobotOSParser.AssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link RobotOSParser#multiplication_division_operation}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication_division_operation(@NotNull RobotOSParser.Multiplication_division_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RobotOSParser#multiplication_division_operation}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication_division_operation(@NotNull RobotOSParser.Multiplication_division_operationContext ctx);

	/**
	 * Enter a parse tree produced by {@link RobotOSParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull RobotOSParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RobotOSParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull RobotOSParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link RobotOSParser#power_operation}.
	 * @param ctx the parse tree
	 */
	void enterPower_operation(@NotNull RobotOSParser.Power_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RobotOSParser#power_operation}.
	 * @param ctx the parse tree
	 */
	void exitPower_operation(@NotNull RobotOSParser.Power_operationContext ctx);

	/**
	 * Enter a parse tree produced by {@link RobotOSParser#binary_operation}.
	 * @param ctx the parse tree
	 */
	void enterBinary_operation(@NotNull RobotOSParser.Binary_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RobotOSParser#binary_operation}.
	 * @param ctx the parse tree
	 */
	void exitBinary_operation(@NotNull RobotOSParser.Binary_operationContext ctx);

	/**
	 * Enter a parse tree produced by {@link RobotOSParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(@NotNull RobotOSParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link RobotOSParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(@NotNull RobotOSParser.LineContext ctx);

	/**
	 * Enter a parse tree produced by {@link RobotOSParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull RobotOSParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RobotOSParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull RobotOSParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link RobotOSParser#addition_subtraction_operation}.
	 * @param ctx the parse tree
	 */
	void enterAddition_subtraction_operation(@NotNull RobotOSParser.Addition_subtraction_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RobotOSParser#addition_subtraction_operation}.
	 * @param ctx the parse tree
	 */
	void exitAddition_subtraction_operation(@NotNull RobotOSParser.Addition_subtraction_operationContext ctx);

	/**
	 * Enter a parse tree produced by {@link RobotOSParser#unary_operation}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operation(@NotNull RobotOSParser.Unary_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RobotOSParser#unary_operation}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operation(@NotNull RobotOSParser.Unary_operationContext ctx);

	/**
	 * Enter a parse tree produced by {@link RobotOSParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull RobotOSParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link RobotOSParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull RobotOSParser.PrintContext ctx);

	/**
	 * Enter a parse tree produced by {@link RobotOSParser#atomic}.
	 * @param ctx the parse tree
	 */
	void enterAtomic(@NotNull RobotOSParser.AtomicContext ctx);
	/**
	 * Exit a parse tree produced by {@link RobotOSParser#atomic}.
	 * @param ctx the parse tree
	 */
	void exitAtomic(@NotNull RobotOSParser.AtomicContext ctx);
}