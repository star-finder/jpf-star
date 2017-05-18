// Generated from InductivePred.g4 by ANTLR 4.7

package gov.nasa.jpf.star.inductive;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class InductivePredParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRED=1, NULL=2, EQEQ=3, EQ=4, NE=5, LB=6, RB=7, CM=8, OR=9, AND=10, PT=11, 
		STAR=12, ID=13, WS=14;
	public static final int
		RULE_pred = 0, RULE_params = 1, RULE_param = 2, RULE_formulas = 3, RULE_formula = 4, 
		RULE_heapTerms = 5, RULE_heapTerm = 6, RULE_pointToTerm = 7, RULE_inductiveTerm = 8, 
		RULE_pureTerms = 9, RULE_pureTerm = 10, RULE_eqNullTerm = 11, RULE_neNullTerm = 12, 
		RULE_eqTerm = 13, RULE_neTerm = 14;
	public static final String[] ruleNames = {
		"pred", "params", "param", "formulas", "formula", "heapTerms", "heapTerm", 
		"pointToTerm", "inductiveTerm", "pureTerms", "pureTerm", "eqNullTerm", 
		"neNullTerm", "eqTerm", "neTerm"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'pred'", "'null'", "'=='", "'='", "'!='", "'('", "')'", "','", 
		"'||'", "'&'", "'->'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PRED", "NULL", "EQEQ", "EQ", "NE", "LB", "RB", "CM", "OR", "AND", 
		"PT", "STAR", "ID", "WS"
	};
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
	public String getGrammarFileName() { return "InductivePred.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public InductivePredParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PredContext extends ParserRuleContext {
		public TerminalNode PRED() { return getToken(InductivePredParser.PRED, 0); }
		public TerminalNode ID() { return getToken(InductivePredParser.ID, 0); }
		public TerminalNode LB() { return getToken(InductivePredParser.LB, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode RB() { return getToken(InductivePredParser.RB, 0); }
		public TerminalNode EQEQ() { return getToken(InductivePredParser.EQEQ, 0); }
		public FormulasContext formulas() {
			return getRuleContext(FormulasContext.class,0);
		}
		public PredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pred; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InductivePredListener ) ((InductivePredListener)listener).enterPred(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InductivePredListener ) ((InductivePredListener)listener).exitPred(this);
		}
	}

	public final PredContext pred() throws RecognitionException {
		PredContext _localctx = new PredContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pred);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(PRED);
			setState(31);
			match(ID);
			setState(32);
			match(LB);
			setState(33);
			params();
			setState(34);
			match(RB);
			setState(35);
			match(EQEQ);
			setState(36);
			formulas();
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

	public static class ParamsContext extends ParserRuleContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode CM() { return getToken(InductivePredParser.CM, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InductivePredListener ) ((InductivePredListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InductivePredListener ) ((InductivePredListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_params);
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				param();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				param();
				setState(40);
				match(CM);
				setState(41);
				params();
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

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(InductivePredParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InductivePredListener ) ((InductivePredListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InductivePredListener ) ((InductivePredListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(ID);
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

	public static class FormulasContext extends ParserRuleContext {
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public TerminalNode OR() { return getToken(InductivePredParser.OR, 0); }
		public FormulasContext formulas() {
			return getRuleContext(FormulasContext.class,0);
		}
		public FormulasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formulas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InductivePredListener ) ((InductivePredListener)listener).enterFormulas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InductivePredListener ) ((InductivePredListener)listener).exitFormulas(this);
		}
	}

	public final FormulasContext formulas() throws RecognitionException {
		FormulasContext _localctx = new FormulasContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formulas);
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				formula();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				formula();
				setState(49);
				match(OR);
				setState(50);
				formulas();
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

	public static class FormulaContext extends ParserRuleContext {
		public HeapTermsContext heapTerms() {
			return getRuleContext(HeapTermsContext.class,0);
		}
		public PureTermsContext pureTerms() {
			return getRuleContext(PureTermsContext.class,0);
		}
		public TerminalNode AND() { return getToken(InductivePredParser.AND, 0); }
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InductivePredListener ) ((InductivePredListener)listener).enterFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InductivePredListener ) ((InductivePredListener)listener).exitFormula(this);
		}
	}

	public final FormulaContext formula() throws RecognitionException {
		FormulaContext _localctx = new FormulaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_formula);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				heapTerms();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				pureTerms();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				heapTerms();
				setState(57);
				match(AND);
				setState(58);
				pureTerms();
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

	public static class HeapTermsContext extends ParserRuleContext {
		public HeapTermContext heapTerm() {
			return getRuleContext(HeapTermContext.class,0);
		}
		public TerminalNode STAR() { return getToken(InductivePredParser.STAR, 0); }
		public HeapTermsContext heapTerms() {
			return getRuleContext(HeapTermsContext.class,0);
		}
		public HeapTermsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heapTerms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InductivePredListener ) ((InductivePredListener)listener).enterHeapTerms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InductivePredListener ) ((InductivePredListener)listener).exitHeapTerms(this);
		}
	}

	public final HeapTermsContext heapTerms() throws RecognitionException {
		HeapTermsContext _localctx = new HeapTermsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_heapTerms);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				heapTerm();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				heapTerm();
				setState(64);
				match(STAR);
				setState(65);
				heapTerms();
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

	public static class HeapTermContext extends ParserRuleContext {
		public PointToTermContext pointToTerm() {
			return getRuleContext(PointToTermContext.class,0);
		}
		public InductiveTermContext inductiveTerm() {
			return getRuleContext(InductiveTermContext.class,0);
		}
		public HeapTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heapTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InductivePredListener ) ((InductivePredListener)listener).enterHeapTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InductivePredListener ) ((InductivePredListener)listener).exitHeapTerm(this);
		}
	}

	public final HeapTermContext heapTerm() throws RecognitionException {
		HeapTermContext _localctx = new HeapTermContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_heapTerm);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				pointToTerm();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				inductiveTerm();
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

	public static class PointToTermContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(InductivePredParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(InductivePredParser.ID, i);
		}
		public TerminalNode PT() { return getToken(InductivePredParser.PT, 0); }
		public TerminalNode LB() { return getToken(InductivePredParser.LB, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode RB() { return getToken(InductivePredParser.RB, 0); }
		public PointToTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointToTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InductivePredListener ) ((InductivePredListener)listener).enterPointToTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InductivePredListener ) ((InductivePredListener)listener).exitPointToTerm(this);
		}
	}

	public final PointToTermContext pointToTerm() throws RecognitionException {
		PointToTermContext _localctx = new PointToTermContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pointToTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(ID);
			setState(74);
			match(PT);
			setState(75);
			match(ID);
			setState(76);
			match(LB);
			setState(77);
			params();
			setState(78);
			match(RB);
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

	public static class InductiveTermContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(InductivePredParser.ID, 0); }
		public TerminalNode LB() { return getToken(InductivePredParser.LB, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode RB() { return getToken(InductivePredParser.RB, 0); }
		public InductiveTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inductiveTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InductivePredListener ) ((InductivePredListener)listener).enterInductiveTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InductivePredListener ) ((InductivePredListener)listener).exitInductiveTerm(this);
		}
	}

	public final InductiveTermContext inductiveTerm() throws RecognitionException {
		InductiveTermContext _localctx = new InductiveTermContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_inductiveTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(ID);
			setState(81);
			match(LB);
			setState(82);
			params();
			setState(83);
			match(RB);
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

	public static class PureTermsContext extends ParserRuleContext {
		public PureTermContext pureTerm() {
			return getRuleContext(PureTermContext.class,0);
		}
		public TerminalNode AND() { return getToken(InductivePredParser.AND, 0); }
		public PureTermsContext pureTerms() {
			return getRuleContext(PureTermsContext.class,0);
		}
		public PureTermsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pureTerms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InductivePredListener ) ((InductivePredListener)listener).enterPureTerms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InductivePredListener ) ((InductivePredListener)listener).exitPureTerms(this);
		}
	}

	public final PureTermsContext pureTerms() throws RecognitionException {
		PureTermsContext _localctx = new PureTermsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pureTerms);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				pureTerm();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				pureTerm();
				setState(87);
				match(AND);
				setState(88);
				pureTerms();
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

	public static class PureTermContext extends ParserRuleContext {
		public EqNullTermContext eqNullTerm() {
			return getRuleContext(EqNullTermContext.class,0);
		}
		public NeNullTermContext neNullTerm() {
			return getRuleContext(NeNullTermContext.class,0);
		}
		public EqTermContext eqTerm() {
			return getRuleContext(EqTermContext.class,0);
		}
		public NeTermContext neTerm() {
			return getRuleContext(NeTermContext.class,0);
		}
		public PureTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pureTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InductivePredListener ) ((InductivePredListener)listener).enterPureTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InductivePredListener ) ((InductivePredListener)listener).exitPureTerm(this);
		}
	}

	public final PureTermContext pureTerm() throws RecognitionException {
		PureTermContext _localctx = new PureTermContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pureTerm);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				eqNullTerm();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				neNullTerm();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				eqTerm();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				neTerm();
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

	public static class EqNullTermContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(InductivePredParser.ID, 0); }
		public TerminalNode EQ() { return getToken(InductivePredParser.EQ, 0); }
		public TerminalNode NULL() { return getToken(InductivePredParser.NULL, 0); }
		public EqNullTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqNullTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InductivePredListener ) ((InductivePredListener)listener).enterEqNullTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InductivePredListener ) ((InductivePredListener)listener).exitEqNullTerm(this);
		}
	}

	public final EqNullTermContext eqNullTerm() throws RecognitionException {
		EqNullTermContext _localctx = new EqNullTermContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_eqNullTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(ID);
			setState(99);
			match(EQ);
			setState(100);
			match(NULL);
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

	public static class NeNullTermContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(InductivePredParser.ID, 0); }
		public TerminalNode NE() { return getToken(InductivePredParser.NE, 0); }
		public TerminalNode NULL() { return getToken(InductivePredParser.NULL, 0); }
		public NeNullTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_neNullTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InductivePredListener ) ((InductivePredListener)listener).enterNeNullTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InductivePredListener ) ((InductivePredListener)listener).exitNeNullTerm(this);
		}
	}

	public final NeNullTermContext neNullTerm() throws RecognitionException {
		NeNullTermContext _localctx = new NeNullTermContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_neNullTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(ID);
			setState(103);
			match(NE);
			setState(104);
			match(NULL);
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

	public static class EqTermContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(InductivePredParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(InductivePredParser.ID, i);
		}
		public TerminalNode EQ() { return getToken(InductivePredParser.EQ, 0); }
		public EqTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InductivePredListener ) ((InductivePredListener)listener).enterEqTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InductivePredListener ) ((InductivePredListener)listener).exitEqTerm(this);
		}
	}

	public final EqTermContext eqTerm() throws RecognitionException {
		EqTermContext _localctx = new EqTermContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_eqTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(ID);
			setState(107);
			match(EQ);
			setState(108);
			match(ID);
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

	public static class NeTermContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(InductivePredParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(InductivePredParser.ID, i);
		}
		public TerminalNode NE() { return getToken(InductivePredParser.NE, 0); }
		public NeTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_neTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InductivePredListener ) ((InductivePredListener)listener).enterNeTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InductivePredListener ) ((InductivePredListener)listener).exitNeTerm(this);
		}
	}

	public final NeTermContext neTerm() throws RecognitionException {
		NeTermContext _localctx = new NeTermContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_neTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(ID);
			setState(111);
			match(NE);
			setState(112);
			match(ID);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20u\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5\67"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6?\n\6\3\7\3\7\3\7\3\7\3\7\5\7F\n\7\3\b"+
		"\3\b\5\bJ\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\5\13]\n\13\3\f\3\f\3\f\3\f\5\fc\n\f\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\2\2\21"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\2\2o\2 \3\2\2\2\4-\3\2\2\2\6"+
		"/\3\2\2\2\b\66\3\2\2\2\n>\3\2\2\2\fE\3\2\2\2\16I\3\2\2\2\20K\3\2\2\2\22"+
		"R\3\2\2\2\24\\\3\2\2\2\26b\3\2\2\2\30d\3\2\2\2\32h\3\2\2\2\34l\3\2\2\2"+
		"\36p\3\2\2\2 !\7\3\2\2!\"\7\17\2\2\"#\7\b\2\2#$\5\4\3\2$%\7\t\2\2%&\7"+
		"\5\2\2&\'\5\b\5\2\'\3\3\2\2\2(.\5\6\4\2)*\5\6\4\2*+\7\n\2\2+,\5\4\3\2"+
		",.\3\2\2\2-(\3\2\2\2-)\3\2\2\2.\5\3\2\2\2/\60\7\17\2\2\60\7\3\2\2\2\61"+
		"\67\5\n\6\2\62\63\5\n\6\2\63\64\7\13\2\2\64\65\5\b\5\2\65\67\3\2\2\2\66"+
		"\61\3\2\2\2\66\62\3\2\2\2\67\t\3\2\2\28?\5\f\7\29?\5\24\13\2:;\5\f\7\2"+
		";<\7\f\2\2<=\5\24\13\2=?\3\2\2\2>8\3\2\2\2>9\3\2\2\2>:\3\2\2\2?\13\3\2"+
		"\2\2@F\5\16\b\2AB\5\16\b\2BC\7\16\2\2CD\5\f\7\2DF\3\2\2\2E@\3\2\2\2EA"+
		"\3\2\2\2F\r\3\2\2\2GJ\5\20\t\2HJ\5\22\n\2IG\3\2\2\2IH\3\2\2\2J\17\3\2"+
		"\2\2KL\7\17\2\2LM\7\r\2\2MN\7\17\2\2NO\7\b\2\2OP\5\4\3\2PQ\7\t\2\2Q\21"+
		"\3\2\2\2RS\7\17\2\2ST\7\b\2\2TU\5\4\3\2UV\7\t\2\2V\23\3\2\2\2W]\5\26\f"+
		"\2XY\5\26\f\2YZ\7\f\2\2Z[\5\24\13\2[]\3\2\2\2\\W\3\2\2\2\\X\3\2\2\2]\25"+
		"\3\2\2\2^c\5\30\r\2_c\5\32\16\2`c\5\34\17\2ac\5\36\20\2b^\3\2\2\2b_\3"+
		"\2\2\2b`\3\2\2\2ba\3\2\2\2c\27\3\2\2\2de\7\17\2\2ef\7\6\2\2fg\7\4\2\2"+
		"g\31\3\2\2\2hi\7\17\2\2ij\7\7\2\2jk\7\4\2\2k\33\3\2\2\2lm\7\17\2\2mn\7"+
		"\6\2\2no\7\17\2\2o\35\3\2\2\2pq\7\17\2\2qr\7\7\2\2rs\7\17\2\2s\37\3\2"+
		"\2\2\t-\66>EI\\b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}