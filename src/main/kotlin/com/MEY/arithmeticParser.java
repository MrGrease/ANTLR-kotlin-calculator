// Generated from C:/Users/Greasemain/Dropbox/projects/Employment Projects/Antlr/antlr_calc/src/main/kotlin/com/MEY\arithmetic.g4 by ANTLR 4.8
package com.MEY;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class arithmeticParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, NUMBER=9, 
		WS=10;
	public static final int
		RULE_start = 0, RULE_operation = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "operation"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'^'", "'e'", "'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "NUMBER", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "arithmetic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public arithmeticParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arithmeticListener ) ((arithmeticListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arithmeticListener ) ((arithmeticListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arithmeticVisitor ) return ((arithmeticVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			operation(0);
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

	public static class OperationContext extends ParserRuleContext {
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	 
		public OperationContext() { }
		public void copyFrom(OperationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParContext extends OperationContext {
		public OperationContext inner;
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public ParContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arithmeticListener ) ((arithmeticListener)listener).enterPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arithmeticListener ) ((arithmeticListener)listener).exitPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arithmeticVisitor ) return ((arithmeticVisitor<? extends T>)visitor).visitPar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivContext extends OperationContext {
		public OperationContext left;
		public Token operator;
		public OperationContext right;
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public DivContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arithmeticListener ) ((arithmeticListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arithmeticListener ) ((arithmeticListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arithmeticVisitor ) return ((arithmeticVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddContext extends OperationContext {
		public OperationContext left;
		public Token operator;
		public OperationContext right;
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public AddContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arithmeticListener ) ((arithmeticListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arithmeticListener ) ((arithmeticListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arithmeticVisitor ) return ((arithmeticVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubContext extends OperationContext {
		public OperationContext left;
		public Token operator;
		public OperationContext right;
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public SubContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arithmeticListener ) ((arithmeticListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arithmeticListener ) ((arithmeticListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arithmeticVisitor ) return ((arithmeticVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SceContext extends OperationContext {
		public OperationContext left;
		public Token operator;
		public OperationContext right;
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public SceContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arithmeticListener ) ((arithmeticListener)listener).enterSce(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arithmeticListener ) ((arithmeticListener)listener).exitSce(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arithmeticVisitor ) return ((arithmeticVisitor<? extends T>)visitor).visitSce(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumContext extends OperationContext {
		public TerminalNode NUMBER() { return getToken(arithmeticParser.NUMBER, 0); }
		public NumContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arithmeticListener ) ((arithmeticListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arithmeticListener ) ((arithmeticListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arithmeticVisitor ) return ((arithmeticVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulpContext extends OperationContext {
		public OperationContext left;
		public Token operator;
		public OperationContext right;
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public MulpContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arithmeticListener ) ((arithmeticListener)listener).enterMulp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arithmeticListener ) ((arithmeticListener)listener).exitMulp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arithmeticVisitor ) return ((arithmeticVisitor<? extends T>)visitor).visitMulp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowContext extends OperationContext {
		public OperationContext left;
		public Token operator;
		public OperationContext right;
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public PowContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof arithmeticListener ) ((arithmeticListener)listener).enterPow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof arithmeticListener ) ((arithmeticListener)listener).exitPow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof arithmeticVisitor ) return ((arithmeticVisitor<? extends T>)visitor).visitPow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		return operation(0);
	}

	private OperationContext operation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperationContext _localctx = new OperationContext(_ctx, _parentState);
		OperationContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_operation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				_localctx = new NumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(7);
				match(NUMBER);
				}
				break;
			case T__0:
				{
				_localctx = new ParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(8);
				match(T__0);
				setState(9);
				((ParContext)_localctx).inner = operation(0);
				setState(10);
				match(T__1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(34);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(32);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new PowContext(new OperationContext(_parentctx, _parentState));
						((PowContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(14);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(15);
						((PowContext)_localctx).operator = match(T__2);
						setState(16);
						((PowContext)_localctx).right = operation(7);
						}
						break;
					case 2:
						{
						_localctx = new SceContext(new OperationContext(_parentctx, _parentState));
						((SceContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(17);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(18);
						((SceContext)_localctx).operator = match(T__3);
						setState(19);
						((SceContext)_localctx).right = operation(6);
						}
						break;
					case 3:
						{
						_localctx = new MulpContext(new OperationContext(_parentctx, _parentState));
						((MulpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(20);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(21);
						((MulpContext)_localctx).operator = match(T__4);
						setState(22);
						((MulpContext)_localctx).right = operation(5);
						}
						break;
					case 4:
						{
						_localctx = new DivContext(new OperationContext(_parentctx, _parentState));
						((DivContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(23);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(24);
						((DivContext)_localctx).operator = match(T__5);
						setState(25);
						((DivContext)_localctx).right = operation(4);
						}
						break;
					case 5:
						{
						_localctx = new AddContext(new OperationContext(_parentctx, _parentState));
						((AddContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(26);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(27);
						((AddContext)_localctx).operator = match(T__6);
						setState(28);
						((AddContext)_localctx).right = operation(3);
						}
						break;
					case 6:
						{
						_localctx = new SubContext(new OperationContext(_parentctx, _parentState));
						((SubContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_operation);
						setState(29);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(30);
						((SubContext)_localctx).operator = match(T__7);
						setState(31);
						((SubContext)_localctx).right = operation(2);
						}
						break;
					}
					} 
				}
				setState(36);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return operation_sempred((OperationContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean operation_sempred(OperationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\f(\4\2\t\2\4\3\t"+
		"\3\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\17\n\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3#\n\3\f\3\16\3&\13"+
		"\3\3\3\2\3\4\4\2\4\2\2\2,\2\6\3\2\2\2\4\16\3\2\2\2\6\7\5\4\3\2\7\3\3\2"+
		"\2\2\b\t\b\3\1\2\t\17\7\13\2\2\n\13\7\3\2\2\13\f\5\4\3\2\f\r\7\4\2\2\r"+
		"\17\3\2\2\2\16\b\3\2\2\2\16\n\3\2\2\2\17$\3\2\2\2\20\21\f\b\2\2\21\22"+
		"\7\5\2\2\22#\5\4\3\t\23\24\f\7\2\2\24\25\7\6\2\2\25#\5\4\3\b\26\27\f\6"+
		"\2\2\27\30\7\7\2\2\30#\5\4\3\7\31\32\f\5\2\2\32\33\7\b\2\2\33#\5\4\3\6"+
		"\34\35\f\4\2\2\35\36\7\t\2\2\36#\5\4\3\5\37 \f\3\2\2 !\7\n\2\2!#\5\4\3"+
		"\4\"\20\3\2\2\2\"\23\3\2\2\2\"\26\3\2\2\2\"\31\3\2\2\2\"\34\3\2\2\2\""+
		"\37\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\5\3\2\2\2&$\3\2\2\2\5\16\""+
		"$";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}