package com.nevermindsoft.robotOS;

import com.nevermindsoft.antlr.RobotOSBaseVisitor;
import com.nevermindsoft.antlr.RobotOSLexer;
import com.nevermindsoft.antlr.RobotOSParser;
import com.nevermindsoft.robotOS.types.UndefinedValueHolder;
import com.nevermindsoft.robotOS.types.ValueHolder;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Created by rcracel on 12/22/13.
 */
public class RobotOSVisitorImpl extends RobotOSBaseVisitor<ValueHolder> {

    private static final String UNDEFINED = "<UNDEFINED>";

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     *
     * @param ctx
     */
    @Override
    public ValueHolder visitLine(@NotNull RobotOSParser.LineContext ctx) {
        return super.visitLine(ctx);
    }

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     *
     * @param ctx
     */
    @Override
    public ValueHolder visitPrint(@NotNull RobotOSParser.PrintContext ctx) {
        ValueHolder value = visitExpr( ctx.expr() );

        System.out.println( String.format( "%s", value == null ? "~null" : value.toString() ) );

        return value;
    }

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     *
     * @param ctx
     */
    @Override
    public ValueHolder visitAssignment(@NotNull RobotOSParser.AssignmentContext ctx) {
        return super.visitAssignment(ctx);
    }

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     *
     * @param ctx
     */
    @Override
    public ValueHolder visitProgram(@NotNull RobotOSParser.ProgramContext ctx) {
        return super.visitProgram(ctx);
    }

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     *
     * @param ctx
     */
    @Override
    public ValueHolder visitBinary_operation(@NotNull RobotOSParser.Binary_operationContext ctx) {
        ValueHolder result = null;

        //- As of right now, there are three potential types of terminal operators:
        //- * INT
        //- * DOUBLE
        //- * STRING
        //- * ID ( this one being a placeholder that will resolve to one of the previous three )

        System.out.println( ctx.children );

        ValueHolder lhs = visit( ctx.getChild( 0 ) );
        ValueHolder rhs = visit( ctx.getChild( 2 ) );

        //System.out.println("::> " + lhs + " " + ctx.getChild( 1 ) + " " + rhs );

        TerminalNode tn = (TerminalNode) ctx.getChild( 1 );
        switch ( tn.getSymbol().getType() ) {
            case RobotOSLexer.PLUS:     result = lhs.add( rhs ); break;
            case RobotOSLexer.MINUS:    result = lhs.subtract( rhs ); break;
            case RobotOSLexer.MULTIPLY: result = lhs.multiply( rhs ); break;
            case RobotOSLexer.DIVIDE:   result = lhs.divide( rhs ); break;
            case RobotOSLexer.EXPONENT: result = lhs.power( rhs ); break;
            default:
        }

        //System.out.println("== " + result);

        return result;
    }

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     *
     * @param ctx
     */
    @Override
    public ValueHolder visitExpr(@NotNull RobotOSParser.ExprContext ctx) {
        return super.visitExpr(ctx);
    }

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     *
     * @param ctx
     */
    @Override
    public ValueHolder visitUnary_operation(@NotNull RobotOSParser.Unary_operationContext ctx) {

        ValueHolder result;

        ValueHolder operator = visitAtomic( ctx.atomic() );

        TerminalNode tn = (TerminalNode) ctx.getChild( 1 );
        switch ( tn.getSymbol().getType() ) {
            case RobotOSLexer.INCREASE: result = operator.increase(); break;
            case RobotOSLexer.DECREASE: result = operator.decrease(); break;
            case RobotOSLexer.MINUS:    result = operator.swapSign(); break;
            case RobotOSLexer.PLUS:     result = operator; break;
            default: throw new UnsupportedOperationException();
        }

        return result;
    }

    /**
     * {@inheritDoc}
     * <p/>
     * The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.
     *
     * @param ctx
     */
    @Override
    public ValueHolder visitAtomic(@NotNull RobotOSParser.AtomicContext ctx) {
        ValueHolder<?> result;

        if ( ctx.DOUBLE() != null ) {
            result = ValueHolder.wrap( Double.parseDouble( ctx.getText() ) );
        } else if ( ctx.INT() != null ) {
            result = ValueHolder.wrap( Long.parseLong( ctx.getText() ) );
        } else if ( ctx.ID() != null ) {
            result = ValueHolder.wrap( 0L );
        } else if ( ctx.STRING() != null ) {
            result = ValueHolder.wrap( ctx.getText().substring( 1, ctx.getText().length() - 1 ) );
        } else {
            result = UndefinedValueHolder.instance();
        }

        return result;
    }

    //    /**
//     * {@inheritDoc}
//     * <p/>
//     * The default implementation returns the result of calling
//     * {@link #visitChildren} on {@code ctx}.
//     *
//     * @param ctx
//     */
//    @Override
//    public Object visitOperation(@NotNull RobotOSParser.OperationContext ctx) {
//        return super.visitOperation(ctx);
//    }
//
//    /**
//     * {@inheritDoc}
//     * <p/>
//     * The default implementation returns the result of calling
//     * {@link #visitChildren} on {@code ctx}.
//     *
//     * @param ctx
//     */
//    @Override
//    public Object visitBinary_operation(@NotNull RobotOSParser.Binary_operationContext ctx) {
//        Number left = (Number) visitUnary_operation(ctx.unary_operation(0));
//
//        List<TerminalNode> operators = ctx.
//        if ( operators != null ) {
//            for ( int index = 0 ; index < operators.size() ; index++ ) {
//                Number right = (Number) visitNumeric_operator( ctx.numeric_operator( index + 1 ) );
//                int operator = operators.get( index ).getSymbol().getType();
//
//                switch ( operator ) {
//                    case RobotOSLexer.PLUS:     left = Operations.plus( left, right ); break;
//                    case RobotOSLexer.MINUS:    left = Operations.minus( left, right ); break;
//                    case RobotOSLexer.MULTIPLY: left = Operations.multiply( left, right ); break;
//                    case RobotOSLexer.DIVIDE:   left = Operations.divide( left, right ); break;
//                    case RobotOSLexer.EXPONENT: left = Operations.exp( left, right ); break;
//                }
//            }
//        }
//    }
//
//    /**
//     * {@inheritDoc}
//     * <p/>
//     * The default implementation returns the result of calling
//     * {@link #visitChildren} on {@code ctx}.
//     *
//     * @param ctx
//     */
//    @Override
//    public Object visitUnary_operation(@NotNull RobotOSParser.Unary_operationContext ctx) {
//        return super.visitUnary_operation(ctx);
//    }
//
//
//    /**
//     * {@inheritDoc}
//     * <p/>
//     * The default implementation returns the result of calling
//     * {@link #visitChildren} on {@code ctx}.
//     *
//     * @param ctx
//     */
//    @Override
//    public Object visitProgram(@NotNull RobotOSParser.ProgramContext ctx) {
//        System.out.println("Starting Program");
//
//        Object result =  super.visitProgram(ctx);
//
//        System.out.println("Program Complete: " + result);
//
//        return result;
//    }
//
//    /**
//     * {@inheritDoc}
//     * <p/>
//     * The default implementation returns the result of calling
//     * {@link #visitChildren} on {@code ctx}.
//     *
//     * @param ctx
//     */
//    @Override
//    public Object visitExpr(@NotNull RobotOSParser.ExprContext ctx) {
//        System.out.println("Visiting Expression");
//
//          System.out.println("::::> " + left);
//
//        return left;
//    }
     

}
