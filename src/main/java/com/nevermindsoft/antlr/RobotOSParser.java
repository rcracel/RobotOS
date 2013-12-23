// Generated from RobotOS.g4 by ANTLR 4.1

package com.nevermindsoft.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RobotOSParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, MULTIPLY=2, DIVIDE=3, PLUS=4, MINUS=5, ASSIGN=6, EXPONENT=7, 
		INCREASE=8, DECREASE=9, INT=10, DOUBLE=11, STRING=12, LPAR=13, RPAR=14, 
		PRINT=15, ID=16, NEW_LINE=17, WS=18;
	public static final String[] tokenNames = {
		"<INVALID>", "COMMENT", "'*'", "'/'", "'+'", "'-'", "'='", "'^'", "'++'", 
		"'--'", "INT", "DOUBLE", "STRING", "'('", "')'", "'print'", "ID", "NEW_LINE", 
		"WS"
	};
	public static final int
		RULE_atomic = 0, RULE_unary_operation = 1, RULE_power_operation = 2, RULE_multiplication_division_operation = 3, 
		RULE_addition_subtraction_operation = 4, RULE_binary_operation = 5, RULE_assignment = 6, 
		RULE_expr = 7, RULE_print = 8, RULE_line = 9, RULE_program = 10;
	public static final String[] ruleNames = {
		"atomic", "unary_operation", "power_operation", "multiplication_division_operation", 
		"addition_subtraction_operation", "binary_operation", "assignment", "expr", 
		"print", "line", "program"
	};

	@Override
	public String getGrammarFileName() { return "RobotOS.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public RobotOSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AtomicContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(RobotOSParser.INT, 0); }
		public TerminalNode ID() { return getToken(RobotOSParser.ID, 0); }
		public TerminalNode DOUBLE() { return getToken(RobotOSParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(RobotOSParser.STRING, 0); }
		public AtomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotOSListener ) ((RobotOSListener)listener).enterAtomic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotOSListener ) ((RobotOSListener)listener).exitAtomic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotOSVisitor ) return ((RobotOSVisitor<? extends T>)visitor).visitAtomic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomicContext atomic() throws RecognitionException {
		AtomicContext _localctx = new AtomicContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_atomic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operationContext extends ParserRuleContext {
		public AtomicContext atomic() {
			return getRuleContext(AtomicContext.class,0);
		}
		public TerminalNode DECREASE() { return getToken(RobotOSParser.DECREASE, 0); }
		public TerminalNode INCREASE() { return getToken(RobotOSParser.INCREASE, 0); }
		public TerminalNode MINUS() { return getToken(RobotOSParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(RobotOSParser.PLUS, 0); }
		public Unary_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotOSListener ) ((RobotOSListener)listener).enterUnary_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotOSListener ) ((RobotOSListener)listener).exitUnary_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotOSVisitor ) return ((RobotOSVisitor<? extends T>)visitor).visitUnary_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operationContext unary_operation() throws RecognitionException {
		Unary_operationContext _localctx = new Unary_operationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_unary_operation);
		int _la;
		try {
			setState(28);
			switch (_input.LA(1)) {
			case INCREASE:
			case DECREASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				_la = _input.LA(1);
				if ( !(_la==INCREASE || _la==DECREASE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(25); atomic();
				}
				break;
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(27); atomic();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Power_operationContext extends ParserRuleContext {
		public List<AtomicContext> atomic() {
			return getRuleContexts(AtomicContext.class);
		}
		public Unary_operationContext unary_operation(int i) {
			return getRuleContext(Unary_operationContext.class,i);
		}
		public TerminalNode EXPONENT() { return getToken(RobotOSParser.EXPONENT, 0); }
		public Binary_operationContext binary_operation() {
			return getRuleContext(Binary_operationContext.class,0);
		}
		public List<Unary_operationContext> unary_operation() {
			return getRuleContexts(Unary_operationContext.class);
		}
		public AtomicContext atomic(int i) {
			return getRuleContext(AtomicContext.class,i);
		}
		public Power_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotOSListener ) ((RobotOSListener)listener).enterPower_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotOSListener ) ((RobotOSListener)listener).exitPower_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotOSVisitor ) return ((RobotOSVisitor<? extends T>)visitor).visitPower_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Power_operationContext power_operation() throws RecognitionException {
		Power_operationContext _localctx = new Power_operationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_power_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case STRING:
			case ID:
				{
				setState(30); atomic();
				}
				break;
			case PLUS:
			case MINUS:
			case INCREASE:
			case DECREASE:
				{
				setState(31); unary_operation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(34); match(EXPONENT);
			setState(38);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(35); atomic();
				}
				break;

			case 2:
				{
				setState(36); unary_operation();
				}
				break;

			case 3:
				{
				setState(37); binary_operation();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multiplication_division_operationContext extends ParserRuleContext {
		public List<AtomicContext> atomic() {
			return getRuleContexts(AtomicContext.class);
		}
		public Unary_operationContext unary_operation(int i) {
			return getRuleContext(Unary_operationContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(RobotOSParser.MULTIPLY, 0); }
		public Binary_operationContext binary_operation() {
			return getRuleContext(Binary_operationContext.class,0);
		}
		public TerminalNode DIVIDE() { return getToken(RobotOSParser.DIVIDE, 0); }
		public List<Unary_operationContext> unary_operation() {
			return getRuleContexts(Unary_operationContext.class);
		}
		public AtomicContext atomic(int i) {
			return getRuleContext(AtomicContext.class,i);
		}
		public Multiplication_division_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplication_division_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotOSListener ) ((RobotOSListener)listener).enterMultiplication_division_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotOSListener ) ((RobotOSListener)listener).exitMultiplication_division_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotOSVisitor ) return ((RobotOSVisitor<? extends T>)visitor).visitMultiplication_division_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiplication_division_operationContext multiplication_division_operation() throws RecognitionException {
		Multiplication_division_operationContext _localctx = new Multiplication_division_operationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_multiplication_division_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case STRING:
			case ID:
				{
				setState(40); atomic();
				}
				break;
			case PLUS:
			case MINUS:
			case INCREASE:
			case DECREASE:
				{
				setState(41); unary_operation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(44);
			_la = _input.LA(1);
			if ( !(_la==MULTIPLY || _la==DIVIDE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(48);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(45); atomic();
				}
				break;

			case 2:
				{
				setState(46); unary_operation();
				}
				break;

			case 3:
				{
				setState(47); binary_operation();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Addition_subtraction_operationContext extends ParserRuleContext {
		public List<AtomicContext> atomic() {
			return getRuleContexts(AtomicContext.class);
		}
		public Unary_operationContext unary_operation(int i) {
			return getRuleContext(Unary_operationContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(RobotOSParser.MINUS, 0); }
		public Binary_operationContext binary_operation() {
			return getRuleContext(Binary_operationContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(RobotOSParser.PLUS, 0); }
		public List<Unary_operationContext> unary_operation() {
			return getRuleContexts(Unary_operationContext.class);
		}
		public AtomicContext atomic(int i) {
			return getRuleContext(AtomicContext.class,i);
		}
		public Addition_subtraction_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addition_subtraction_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotOSListener ) ((RobotOSListener)listener).enterAddition_subtraction_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotOSListener ) ((RobotOSListener)listener).exitAddition_subtraction_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotOSVisitor ) return ((RobotOSVisitor<? extends T>)visitor).visitAddition_subtraction_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Addition_subtraction_operationContext addition_subtraction_operation() throws RecognitionException {
		Addition_subtraction_operationContext _localctx = new Addition_subtraction_operationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_addition_subtraction_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case STRING:
			case ID:
				{
				setState(50); atomic();
				}
				break;
			case PLUS:
			case MINUS:
			case INCREASE:
			case DECREASE:
				{
				setState(51); unary_operation();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(54);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(58);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(55); atomic();
				}
				break;

			case 2:
				{
				setState(56); unary_operation();
				}
				break;

			case 3:
				{
				setState(57); binary_operation();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_operationContext extends ParserRuleContext {
		public Multiplication_division_operationContext multiplication_division_operation() {
			return getRuleContext(Multiplication_division_operationContext.class,0);
		}
		public Addition_subtraction_operationContext addition_subtraction_operation() {
			return getRuleContext(Addition_subtraction_operationContext.class,0);
		}
		public Power_operationContext power_operation() {
			return getRuleContext(Power_operationContext.class,0);
		}
		public Binary_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotOSListener ) ((RobotOSListener)listener).enterBinary_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotOSListener ) ((RobotOSListener)listener).exitBinary_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotOSVisitor ) return ((RobotOSVisitor<? extends T>)visitor).visitBinary_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_operationContext binary_operation() throws RecognitionException {
		Binary_operationContext _localctx = new Binary_operationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_binary_operation);
		try {
			setState(63);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60); power_operation();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61); multiplication_division_operation();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62); addition_subtraction_operation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public AtomicContext atomic() {
			return getRuleContext(AtomicContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(RobotOSParser.ASSIGN, 0); }
		public TerminalNode ID() { return getToken(RobotOSParser.ID, 0); }
		public Binary_operationContext binary_operation() {
			return getRuleContext(Binary_operationContext.class,0);
		}
		public Unary_operationContext unary_operation() {
			return getRuleContext(Unary_operationContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotOSListener ) ((RobotOSListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotOSListener ) ((RobotOSListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotOSVisitor ) return ((RobotOSVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); match(ID);
			setState(66); match(ASSIGN);
			setState(70);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(67); unary_operation();
				}
				break;

			case 2:
				{
				setState(68); binary_operation();
				}
				break;

			case 3:
				{
				setState(69); atomic();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public AtomicContext atomic() {
			return getRuleContext(AtomicContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Binary_operationContext binary_operation() {
			return getRuleContext(Binary_operationContext.class,0);
		}
		public Unary_operationContext unary_operation() {
			return getRuleContext(Unary_operationContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotOSListener ) ((RobotOSListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotOSListener ) ((RobotOSListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotOSVisitor ) return ((RobotOSVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr);
		try {
			setState(76);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72); atomic();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73); unary_operation();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74); binary_operation();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(75); assignment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotOSListener ) ((RobotOSListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotOSListener ) ((RobotOSListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotOSVisitor ) return ((RobotOSVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); match(PRINT);
			setState(79); expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEW_LINE() { return getToken(RobotOSParser.NEW_LINE, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotOSListener ) ((RobotOSListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotOSListener ) ((RobotOSListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotOSVisitor ) return ((RobotOSVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			switch (_input.LA(1)) {
			case PRINT:
				{
				setState(81); print();
				}
				break;
			case PLUS:
			case MINUS:
			case INCREASE:
			case DECREASE:
			case INT:
			case DOUBLE:
			case STRING:
			case ID:
				{
				setState(82); expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(85); match(NEW_LINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(RobotOSParser.EOF, 0); }
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotOSListener ) ((RobotOSListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotOSListener ) ((RobotOSListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotOSVisitor ) return ((RobotOSVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << INCREASE) | (1L << DECREASE) | (1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << PRINT) | (1L << ID))) != 0)) {
				{
				{
				setState(87); line();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\24b\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\3\3\3\3\3\3\3\5\3\37\n\3\3\4\3\4\5\4#\n\4\3\4\3\4\3\4"+
		"\3\4\5\4)\n\4\3\5\3\5\5\5-\n\5\3\5\3\5\3\5\3\5\5\5\63\n\5\3\6\3\6\5\6"+
		"\67\n\6\3\6\3\6\3\6\3\6\5\6=\n\6\3\7\3\7\3\7\5\7B\n\7\3\b\3\b\3\b\3\b"+
		"\3\b\5\bI\n\b\3\t\3\t\3\t\3\t\5\tO\n\t\3\n\3\n\3\n\3\13\3\13\5\13V\n\13"+
		"\3\13\3\13\3\f\7\f[\n\f\f\f\16\f^\13\f\3\f\3\f\3\f\2\r\2\4\6\b\n\f\16"+
		"\20\22\24\26\2\6\4\2\f\16\22\22\3\2\n\13\3\2\6\7\3\2\4\5i\2\30\3\2\2\2"+
		"\4\36\3\2\2\2\6\"\3\2\2\2\b,\3\2\2\2\n\66\3\2\2\2\fA\3\2\2\2\16C\3\2\2"+
		"\2\20N\3\2\2\2\22P\3\2\2\2\24U\3\2\2\2\26\\\3\2\2\2\30\31\t\2\2\2\31\3"+
		"\3\2\2\2\32\33\t\3\2\2\33\37\5\2\2\2\34\35\t\4\2\2\35\37\5\2\2\2\36\32"+
		"\3\2\2\2\36\34\3\2\2\2\37\5\3\2\2\2 #\5\2\2\2!#\5\4\3\2\" \3\2\2\2\"!"+
		"\3\2\2\2#$\3\2\2\2$(\7\t\2\2%)\5\2\2\2&)\5\4\3\2\')\5\f\7\2(%\3\2\2\2"+
		"(&\3\2\2\2(\'\3\2\2\2)\7\3\2\2\2*-\5\2\2\2+-\5\4\3\2,*\3\2\2\2,+\3\2\2"+
		"\2-.\3\2\2\2.\62\t\5\2\2/\63\5\2\2\2\60\63\5\4\3\2\61\63\5\f\7\2\62/\3"+
		"\2\2\2\62\60\3\2\2\2\62\61\3\2\2\2\63\t\3\2\2\2\64\67\5\2\2\2\65\67\5"+
		"\4\3\2\66\64\3\2\2\2\66\65\3\2\2\2\678\3\2\2\28<\t\4\2\29=\5\2\2\2:=\5"+
		"\4\3\2;=\5\f\7\2<9\3\2\2\2<:\3\2\2\2<;\3\2\2\2=\13\3\2\2\2>B\5\6\4\2?"+
		"B\5\b\5\2@B\5\n\6\2A>\3\2\2\2A?\3\2\2\2A@\3\2\2\2B\r\3\2\2\2CD\7\22\2"+
		"\2DH\7\b\2\2EI\5\4\3\2FI\5\f\7\2GI\5\2\2\2HE\3\2\2\2HF\3\2\2\2HG\3\2\2"+
		"\2I\17\3\2\2\2JO\5\2\2\2KO\5\4\3\2LO\5\f\7\2MO\5\16\b\2NJ\3\2\2\2NK\3"+
		"\2\2\2NL\3\2\2\2NM\3\2\2\2O\21\3\2\2\2PQ\7\21\2\2QR\5\20\t\2R\23\3\2\2"+
		"\2SV\5\22\n\2TV\5\20\t\2US\3\2\2\2UT\3\2\2\2VW\3\2\2\2WX\7\23\2\2X\25"+
		"\3\2\2\2Y[\5\24\13\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2"+
		"\2^\\\3\2\2\2_`\7\2\2\3`\27\3\2\2\2\16\36\"(,\62\66<AHNU\\";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}