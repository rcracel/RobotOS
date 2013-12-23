package com.nevermindsoft.antlr;
// Generated from RobotOS.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RobotOSLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, MULTIPLY=2, DIVIDE=3, PLUS=4, MINUS=5, ASSIGN=6, EXPONENT=7, 
		INCREASE=8, DECREASE=9, INT=10, DOUBLE=11, STRING=12, LPAR=13, RPAR=14, 
		PRINT=15, ID=16, NEW_LINE=17, WS=18;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"COMMENT", "'*'", "'/'", "'+'", "'-'", "'='", "'^'", "'++'", "'--'", "INT", 
		"DOUBLE", "STRING", "'('", "')'", "'print'", "ID", "NEW_LINE", "WS"
	};
	public static final String[] ruleNames = {
		"DIGIT", "ESCAPE", "COMMENT", "MULTIPLY", "DIVIDE", "PLUS", "MINUS", "ASSIGN", 
		"EXPONENT", "INCREASE", "DECREASE", "INT", "DOUBLE", "STRING", "LPAR", 
		"RPAR", "PRINT", "ID", "NEW_LINE", "WS"
	};


	public RobotOSLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RobotOS.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 2: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 19: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\24\u0089\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\3\3\4\3\4\7\4\63"+
		"\n\4\f\4\16\4\66\13\4\3\4\7\49\n\4\f\4\16\4<\13\4\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\6"+
		"\rS\n\r\r\r\16\rT\3\16\6\16X\n\16\r\16\16\16Y\3\16\3\16\6\16^\n\16\r\16"+
		"\16\16_\5\16b\n\16\3\17\3\17\3\17\7\17g\n\17\f\17\16\17j\13\17\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\6\23z"+
		"\n\23\r\23\16\23{\3\24\6\24\177\n\24\r\24\16\24\u0080\3\25\6\25\u0084"+
		"\n\25\r\25\16\25\u0085\3\25\3\25\3h\26\3\2\1\5\2\1\7\3\2\t\4\1\13\5\1"+
		"\r\6\1\17\7\1\21\b\1\23\t\1\25\n\1\27\13\1\31\f\1\33\r\1\35\16\1\37\17"+
		"\1!\20\1#\21\1%\22\1\'\23\1)\24\3\3\2\b\3\2\62;\5\2$$^^pp\4\2\f\f\17\17"+
		"\3\2c|\5\2\62\63aac|\5\2\13\f\17\17\"\"\u0091\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2"+
		"\2\5-\3\2\2\2\7\60\3\2\2\2\t?\3\2\2\2\13A\3\2\2\2\rC\3\2\2\2\17E\3\2\2"+
		"\2\21G\3\2\2\2\23I\3\2\2\2\25K\3\2\2\2\27N\3\2\2\2\31R\3\2\2\2\33W\3\2"+
		"\2\2\35c\3\2\2\2\37m\3\2\2\2!o\3\2\2\2#q\3\2\2\2%w\3\2\2\2\'~\3\2\2\2"+
		")\u0083\3\2\2\2+,\t\2\2\2,\4\3\2\2\2-.\7^\2\2./\t\3\2\2/\6\3\2\2\2\60"+
		"\64\7%\2\2\61\63\t\4\2\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64"+
		"\65\3\2\2\2\65:\3\2\2\2\66\64\3\2\2\2\679\n\4\2\28\67\3\2\2\29<\3\2\2"+
		"\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\b\4\2\2>\b\3\2\2\2?@\7,\2"+
		"\2@\n\3\2\2\2AB\7\61\2\2B\f\3\2\2\2CD\7-\2\2D\16\3\2\2\2EF\7/\2\2F\20"+
		"\3\2\2\2GH\7?\2\2H\22\3\2\2\2IJ\7`\2\2J\24\3\2\2\2KL\7-\2\2LM\7-\2\2M"+
		"\26\3\2\2\2NO\7/\2\2OP\7/\2\2P\30\3\2\2\2QS\5\3\2\2RQ\3\2\2\2ST\3\2\2"+
		"\2TR\3\2\2\2TU\3\2\2\2U\32\3\2\2\2VX\5\3\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2"+
		"\2\2YZ\3\2\2\2Za\3\2\2\2[]\7\60\2\2\\^\5\3\2\2]\\\3\2\2\2^_\3\2\2\2_]"+
		"\3\2\2\2_`\3\2\2\2`b\3\2\2\2a[\3\2\2\2ab\3\2\2\2b\34\3\2\2\2ch\7$\2\2"+
		"dg\5\5\3\2eg\13\2\2\2fd\3\2\2\2fe\3\2\2\2gj\3\2\2\2hi\3\2\2\2hf\3\2\2"+
		"\2ik\3\2\2\2jh\3\2\2\2kl\7$\2\2l\36\3\2\2\2mn\7*\2\2n \3\2\2\2op\7+\2"+
		"\2p\"\3\2\2\2qr\7r\2\2rs\7t\2\2st\7k\2\2tu\7p\2\2uv\7v\2\2v$\3\2\2\2w"+
		"y\t\5\2\2xz\t\6\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|&\3\2\2\2"+
		"}\177\t\4\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3"+
		"\2\2\2\u0081(\3\2\2\2\u0082\u0084\t\7\2\2\u0083\u0082\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0088\b\25\3\2\u0088*\3\2\2\2\16\2\64:TY_afh{\u0080\u0085";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}