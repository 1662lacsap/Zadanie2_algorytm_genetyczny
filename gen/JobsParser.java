// Generated from /Users/anulka/Downloads/zadanie2czasy/src/main/java/Jobs.g4 by ANTLR 4.7.2

import java.util.LinkedList;
import java.util.HashSet;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JobsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, EQUALS=4, PARAM=5, INT=6, WHITESPACE=7;
	public static final int
		RULE_run = 0, RULE_size = 1, RULE_ignore = 2, RULE_values = 3, RULE_forEachValues = 4, 
		RULE_getINT = 5, RULE_end = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"run", "size", "ignore", "values", "forEachValues", "getINT", "end"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':'", "'end;'", "' :='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "EQUALS", "PARAM", "INT", "WHITESPACE"
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
	public String getGrammarFileName() { return "Jobs.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	int jobCount = 0;
	int counter = 0;

	int[][] times;

	public JobsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RunContext extends ParserRuleContext {
		public SizeContext n;
		public IgnoreContext ignore() {
			return getRuleContext(IgnoreContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public List<ValuesContext> values() {
			return getRuleContexts(ValuesContext.class);
		}
		public ValuesContext values(int i) {
			return getRuleContext(ValuesContext.class,i);
		}
		public RunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_run; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobsListener ) ((JobsListener)listener).enterRun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobsListener ) ((JobsListener)listener).exitRun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JobsVisitor ) return ((JobsVisitor<? extends T>)visitor).visitRun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RunContext run() throws RecognitionException {
		RunContext _localctx = new RunContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_run);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			((RunContext)_localctx).n = size();

			 jobCount = ((RunContext)_localctx).n.value;
			 if(jobCount>1000 || jobCount<1){
			       throw new NumberFormatException("Range 1<=n<=1000");
			  }
			   times = new int[jobCount+1][jobCount+1];

			setState(16);
			ignore();
			setState(18); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(17);
				values();
				}
				}
				setState(20); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INT );
			setState(22);
			match(T__0);
			setState(23);
			end();
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

	public static class SizeContext extends ParserRuleContext {
		public int value;
		public Token INT;
		public TerminalNode PARAM() { return getToken(JobsParser.PARAM, 0); }
		public TerminalNode EQUALS() { return getToken(JobsParser.EQUALS, 0); }
		public TerminalNode INT() { return getToken(JobsParser.INT, 0); }
		public SizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobsListener ) ((JobsListener)listener).enterSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobsListener ) ((JobsListener)listener).exitSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JobsVisitor ) return ((JobsVisitor<? extends T>)visitor).visitSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeContext size() throws RecognitionException {
		SizeContext _localctx = new SizeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(PARAM);
			setState(26);
			match(EQUALS);
			setState(27);
			((SizeContext)_localctx).INT = match(INT);
			((SizeContext)_localctx).value =  Integer.parseInt((((SizeContext)_localctx).INT!=null?((SizeContext)_localctx).INT.getText():null));
			setState(29);
			match(T__0);
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

	public static class IgnoreContext extends ParserRuleContext {
		public TerminalNode PARAM() { return getToken(JobsParser.PARAM, 0); }
		public TerminalNode EQUALS() { return getToken(JobsParser.EQUALS, 0); }
		public List<TerminalNode> INT() { return getTokens(JobsParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(JobsParser.INT, i);
		}
		public IgnoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ignore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobsListener ) ((JobsListener)listener).enterIgnore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobsListener ) ((JobsListener)listener).exitIgnore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JobsVisitor ) return ((JobsVisitor<? extends T>)visitor).visitIgnore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgnoreContext ignore() throws RecognitionException {
		IgnoreContext _localctx = new IgnoreContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ignore);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(PARAM);
			setState(32);
			match(T__1);
			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(33);
				match(INT);
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INT );
			setState(38);
			match(EQUALS);
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

	public static class ValuesContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(JobsParser.INT, 0); }
		public ForEachValuesContext forEachValues() {
			return getRuleContext(ForEachValuesContext.class,0);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobsListener ) ((JobsListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobsListener ) ((JobsListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JobsVisitor ) return ((JobsVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_values);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(INT);
			setState(41);
			forEachValues();
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

	public static class ForEachValuesContext extends ParserRuleContext {
		public ForEachValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forEachValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobsListener ) ((JobsListener)listener).enterForEachValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobsListener ) ((JobsListener)listener).exitForEachValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JobsVisitor ) return ((JobsVisitor<? extends T>)visitor).visitForEachValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForEachValuesContext forEachValues() throws RecognitionException {
		ForEachValuesContext _localctx = new ForEachValuesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_forEachValues);
		try {
			enterOuterAlt(_localctx, 1);
			{

			for(int i = 0; i < jobCount+1;i++){
			times[counter][i] = getINT().value;
			}
			counter++;

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

	public static class GetINTContext extends ParserRuleContext {
		public int value;
		public Token INT;
		public TerminalNode INT() { return getToken(JobsParser.INT, 0); }
		public GetINTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getINT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobsListener ) ((JobsListener)listener).enterGetINT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobsListener ) ((JobsListener)listener).exitGetINT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JobsVisitor ) return ((JobsVisitor<? extends T>)visitor).visitGetINT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetINTContext getINT() throws RecognitionException {
		GetINTContext _localctx = new GetINTContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_getINT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			((GetINTContext)_localctx).INT = match(INT);
			((GetINTContext)_localctx).value =  Integer.parseInt((((GetINTContext)_localctx).INT!=null?((GetINTContext)_localctx).INT.getText():null));
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

	public static class EndContext extends ParserRuleContext {
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobsListener ) ((JobsListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobsListener ) ((JobsListener)listener).exitEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JobsVisitor ) return ((JobsVisitor<? extends T>)visitor).visitEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__2);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t\65\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\6\2\25\n"+
		"\2\r\2\16\2\26\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\6\4%\n"+
		"\4\r\4\16\4&\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\2\2\t"+
		"\2\4\6\b\n\f\16\2\2\2/\2\20\3\2\2\2\4\33\3\2\2\2\6!\3\2\2\2\b*\3\2\2\2"+
		"\n-\3\2\2\2\f/\3\2\2\2\16\62\3\2\2\2\20\21\5\4\3\2\21\22\b\2\1\2\22\24"+
		"\5\6\4\2\23\25\5\b\5\2\24\23\3\2\2\2\25\26\3\2\2\2\26\24\3\2\2\2\26\27"+
		"\3\2\2\2\27\30\3\2\2\2\30\31\7\3\2\2\31\32\5\16\b\2\32\3\3\2\2\2\33\34"+
		"\7\7\2\2\34\35\7\6\2\2\35\36\7\b\2\2\36\37\b\3\1\2\37 \7\3\2\2 \5\3\2"+
		"\2\2!\"\7\7\2\2\"$\7\4\2\2#%\7\b\2\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'"+
		"\3\2\2\2\'(\3\2\2\2()\7\6\2\2)\7\3\2\2\2*+\7\b\2\2+,\5\n\6\2,\t\3\2\2"+
		"\2-.\b\6\1\2.\13\3\2\2\2/\60\7\b\2\2\60\61\b\7\1\2\61\r\3\2\2\2\62\63"+
		"\7\5\2\2\63\17\3\2\2\2\4\26&";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}