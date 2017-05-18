// Generated from InductivePred.g4 by ANTLR 4.7

package gov.nasa.jpf.star.inductive;

import gov.nasa.jpf.star.formula.*;
import gov.nasa.jpf.star.formula.heap.*;
import gov.nasa.jpf.star.formula.pure.*;

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
		PRED=1, NULL=2, EQEQ=3, EQ=4, NE=5, LB=6, RB=7, CM=8, SM=9, OR=10, AND=11, 
		PT=12, STAR=13, ID=14, WS=15;
	public static final int
		RULE_preds = 0, RULE_tail = 1, RULE_pred = 2, RULE_params = 3, RULE_param = 4, 
		RULE_formulas = 5, RULE_formula = 6, RULE_heapTerms = 7, RULE_heapTerm = 8, 
		RULE_pointToTerm = 9, RULE_inductiveTerm = 10, RULE_pureTerms = 11, RULE_pureTerm = 12, 
		RULE_eqNullTerm = 13, RULE_neNullTerm = 14, RULE_eqTerm = 15, RULE_neTerm = 16;
	public static final String[] ruleNames = {
		"preds", "tail", "pred", "params", "param", "formulas", "formula", "heapTerms", 
		"heapTerm", "pointToTerm", "inductiveTerm", "pureTerms", "pureTerm", "eqNullTerm", 
		"neNullTerm", "eqTerm", "neTerm"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'pred'", "'null'", "'=='", "'='", "'!='", "'('", "')'", "','", 
		"';'", "'||'", "'&'", "'->'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PRED", "NULL", "EQEQ", "EQ", "NE", "LB", "RB", "CM", "SM", "OR", 
		"AND", "PT", "STAR", "ID", "WS"
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
	public static class PredsContext extends ParserRuleContext {
		public InductivePred[] ips;
		public PredContext pred;
		public TailContext tail;
		public PredContext pred() {
			return getRuleContext(PredContext.class,0);
		}
		public TailContext tail() {
			return getRuleContext(TailContext.class,0);
		}
		public PredsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InductivePredListener ) ((InductivePredListener)listener).enterPreds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InductivePredListener ) ((InductivePredListener)listener).exitPreds(this);
		}
	}

	public final PredsContext preds() throws RecognitionException {
		PredsContext _localctx = new PredsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_preds);
		try {
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				((PredsContext)_localctx).pred = pred();

						((PredsContext)_localctx).ips =  new InductivePred[1];
						_localctx.ips[0] = ((PredsContext)_localctx).pred.ip;
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				((PredsContext)_localctx).pred = pred();
				setState(38);
				((PredsContext)_localctx).tail = tail();

						int length = ((PredsContext)_localctx).tail.ips.length + 1;
						((PredsContext)_localctx).ips =  new InductivePred[length];
						
						for (int i = 0; i < length; i++) {
							if (i == 0) _localctx.ips[0] = ((PredsContext)_localctx).pred.ip;
							else _localctx.ips[i] = ((PredsContext)_localctx).tail.ips[i - 1];
						}
					
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

	public static class TailContext extends ParserRuleContext {
		public InductivePred[] ips;
		public PredContext pred;
		public TailContext tail;
		public TerminalNode SM() { return getToken(InductivePredParser.SM, 0); }
		public PredContext pred() {
			return getRuleContext(PredContext.class,0);
		}
		public TailContext tail() {
			return getRuleContext(TailContext.class,0);
		}
		public TailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof InductivePredListener ) ((InductivePredListener)listener).enterTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof InductivePredListener ) ((InductivePredListener)listener).exitTail(this);
		}
	}

	public final TailContext tail() throws RecognitionException {
		TailContext _localctx = new TailContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tail);
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				match(SM);
				setState(44);
				((TailContext)_localctx).pred = pred();

						((TailContext)_localctx).ips =  new InductivePred[1];
						_localctx.ips[0] = ((TailContext)_localctx).pred.ip;
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(SM);
				setState(48);
				((TailContext)_localctx).pred = pred();
				setState(49);
				((TailContext)_localctx).tail = tail();

						int length = ((TailContext)_localctx).tail.ips.length + 1;
						((TailContext)_localctx).ips =  new InductivePred[length];
						
						for (int i = 0; i < length; i++) {
							if (i == 0) _localctx.ips[0] = ((TailContext)_localctx).pred.ip;
							else _localctx.ips[i] = ((TailContext)_localctx).tail.ips[i - 1];
						}
					
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

	public static class PredContext extends ParserRuleContext {
		public InductivePred ip;
		public Token ID;
		public ParamsContext params;
		public FormulasContext formulas;
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
		enterRule(_localctx, 4, RULE_pred);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(PRED);
			setState(55);
			((PredContext)_localctx).ID = match(ID);
			setState(56);
			match(LB);
			setState(57);
			((PredContext)_localctx).params = params();
			setState(58);
			match(RB);
			setState(59);
			match(EQEQ);
			setState(60);
			((PredContext)_localctx).formulas = formulas();

					Variable[] ps = ((PredContext)_localctx).params.vars;
					Formula[] fs = ((PredContext)_localctx).formulas.fs;
					
					((PredContext)_localctx).ip =  new InductivePred((((PredContext)_localctx).ID!=null?((PredContext)_localctx).ID.getText():null), ps, fs);
				
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
		public Variable[] vars;
		public ParamContext param;
		public ParamsContext params;
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
		enterRule(_localctx, 6, RULE_params);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				((ParamsContext)_localctx).param = param();

						((ParamsContext)_localctx).vars =  new Variable[1];
						_localctx.vars[0] = ((ParamsContext)_localctx).param.var;
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				((ParamsContext)_localctx).param = param();
				setState(67);
				match(CM);
				setState(68);
				((ParamsContext)_localctx).params = params();

						int length = ((ParamsContext)_localctx).params.vars.length + 1;
						((ParamsContext)_localctx).vars =  new Variable[length];
						
						for (int i = 0; i < length; i++) {
							if (i == 0) _localctx.vars[i] = ((ParamsContext)_localctx).param.var;
							else _localctx.vars[i] = ((ParamsContext)_localctx).params.vars[i - 1];
						}
					
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
		public Variable var;
		public Token ID;
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
		enterRule(_localctx, 8, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			((ParamContext)_localctx).ID = match(ID);

					((ParamContext)_localctx).var =  new Variable((((ParamContext)_localctx).ID!=null?((ParamContext)_localctx).ID.getText():null), "");
				
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
		public Formula[] fs;
		public FormulaContext formula;
		public FormulasContext formulas;
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
		enterRule(_localctx, 10, RULE_formulas);
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				((FormulasContext)_localctx).formula = formula();

						((FormulasContext)_localctx).fs =  new Formula[1];
						_localctx.fs[0] = ((FormulasContext)_localctx).formula.f;
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				((FormulasContext)_localctx).formula = formula();
				setState(80);
				match(OR);
				setState(81);
				((FormulasContext)_localctx).formulas = formulas();

						int length = ((FormulasContext)_localctx).formulas.fs.length + 1;
						((FormulasContext)_localctx).fs =  new Formula[length];
						
						for (int i = 0; i < length; i++) {
							if (i == 0) _localctx.fs[i] = ((FormulasContext)_localctx).formula.f;
							else _localctx.fs[i] = ((FormulasContext)_localctx).formulas.fs[i - 1];
						}
					
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
		public Formula f;
		public HeapTermsContext heapTerms;
		public PureTermsContext pureTerms;
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
		enterRule(_localctx, 12, RULE_formula);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				((FormulaContext)_localctx).heapTerms = heapTerms();

						HeapFormula hFormula = ((FormulaContext)_localctx).heapTerms.hFormula;
						PureFormula pFormula = new PureFormula();
						((FormulaContext)_localctx).f =  new Formula(hFormula, pFormula);
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				((FormulaContext)_localctx).pureTerms = pureTerms();

						HeapFormula hFormula = new HeapFormula();
						PureFormula pFormula = ((FormulaContext)_localctx).pureTerms.pFormula;
						((FormulaContext)_localctx).f =  new Formula(hFormula, pFormula);
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				((FormulaContext)_localctx).heapTerms = heapTerms();
				setState(93);
				match(AND);
				setState(94);
				((FormulaContext)_localctx).pureTerms = pureTerms();

						HeapFormula hFormula = ((FormulaContext)_localctx).heapTerms.hFormula;
						PureFormula pFormula = ((FormulaContext)_localctx).pureTerms.pFormula;
						((FormulaContext)_localctx).f =  new Formula(hFormula, pFormula);
					
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
		public HeapFormula hFormula;
		public HeapTermContext heapTerm;
		public HeapTermsContext heapTerms;
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
		enterRule(_localctx, 14, RULE_heapTerms);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				((HeapTermsContext)_localctx).heapTerm = heapTerm();

						((HeapTermsContext)_localctx).hFormula =  new HeapFormula(((HeapTermsContext)_localctx).heapTerm.term);
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				((HeapTermsContext)_localctx).heapTerm = heapTerm();
				setState(103);
				match(STAR);
				setState(104);
				((HeapTermsContext)_localctx).heapTerms = heapTerms();

						HeapFormula oldHeapFormula = ((HeapTermsContext)_localctx).heapTerms.hFormula;
						HeapTerm[] oldHeapTerms = oldHeapFormula.getHeapTerms();
						
						int length = oldHeapTerms.length + 1;
						HeapTerm[] newHeapTerms = new HeapTerm[length];
						
						for (int i = 0; i < length; i++) {
							if (i == 0) newHeapTerms[i] = ((HeapTermsContext)_localctx).heapTerm.term;
							else newHeapTerms[i] = oldHeapTerms[i - 1];
						}
						
						((HeapTermsContext)_localctx).hFormula =  new HeapFormula(newHeapTerms);
					
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
		public HeapTerm term;
		public PointToTermContext pointToTerm;
		public InductiveTermContext inductiveTerm;
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
		enterRule(_localctx, 16, RULE_heapTerm);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				((HeapTermContext)_localctx).pointToTerm = pointToTerm();

						((HeapTermContext)_localctx).term =  ((HeapTermContext)_localctx).pointToTerm.term;
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				((HeapTermContext)_localctx).inductiveTerm = inductiveTerm();

						((HeapTermContext)_localctx).term =  ((HeapTermContext)_localctx).inductiveTerm.term;
					
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
		public HeapTerm term;
		public Token root;
		public Token type;
		public ParamsContext params;
		public TerminalNode PT() { return getToken(InductivePredParser.PT, 0); }
		public TerminalNode LB() { return getToken(InductivePredParser.LB, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode RB() { return getToken(InductivePredParser.RB, 0); }
		public List<TerminalNode> ID() { return getTokens(InductivePredParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(InductivePredParser.ID, i);
		}
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
		enterRule(_localctx, 18, RULE_pointToTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			((PointToTermContext)_localctx).root = match(ID);
			setState(118);
			match(PT);
			setState(119);
			((PointToTermContext)_localctx).type = match(ID);
			setState(120);
			match(LB);
			setState(121);
			((PointToTermContext)_localctx).params = params();
			setState(122);
			match(RB);

					int length = ((PointToTermContext)_localctx).params.vars.length + 1;
					
					Variable[] vars = new Variable[length];
					for (int i = 0; i < length; i++) {
						if (i == 0) vars[i] = new Variable((((PointToTermContext)_localctx).root!=null?((PointToTermContext)_localctx).root.getText():null), "");
						else vars[i] = ((PointToTermContext)_localctx).params.vars[i - 1];
					}
					
					((PointToTermContext)_localctx).term =  new PointToTerm((((PointToTermContext)_localctx).type!=null?((PointToTermContext)_localctx).type.getText():null), vars);
				
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
		public HeapTerm term;
		public Token ID;
		public ParamsContext params;
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
		enterRule(_localctx, 20, RULE_inductiveTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			((InductiveTermContext)_localctx).ID = match(ID);
			setState(126);
			match(LB);
			setState(127);
			((InductiveTermContext)_localctx).params = params();
			setState(128);
			match(RB);

					((InductiveTermContext)_localctx).term =  new InductiveTerm((((InductiveTermContext)_localctx).ID!=null?((InductiveTermContext)_localctx).ID.getText():null), ((InductiveTermContext)_localctx).params.vars);
				
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
		public PureFormula pFormula;
		public PureTermContext pureTerm;
		public PureTermsContext pureTerms;
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
		enterRule(_localctx, 22, RULE_pureTerms);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				((PureTermsContext)_localctx).pureTerm = pureTerm();

						((PureTermsContext)_localctx).pFormula =  new PureFormula(((PureTermsContext)_localctx).pureTerm.term);
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				((PureTermsContext)_localctx).pureTerm = pureTerm();
				setState(135);
				match(AND);
				setState(136);
				((PureTermsContext)_localctx).pureTerms = pureTerms();

						PureFormula oldPureFormula = ((PureTermsContext)_localctx).pureTerms.pFormula;
						PureTerm[] oldPureTerms = oldPureFormula.getPureTerms();
						
						int length = oldPureTerms.length + 1;
						PureTerm[] newPureTerms = new PureTerm[length];
						
						for (int i = 0; i < length; i++) {
							if (i == 0) newPureTerms[i] = ((PureTermsContext)_localctx).pureTerm.term;
							else newPureTerms[i] = oldPureTerms[i - 1];
						}
						
						((PureTermsContext)_localctx).pFormula =  new PureFormula(newPureTerms);
					
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
		public PureTerm term;
		public EqNullTermContext eqNullTerm;
		public NeNullTermContext neNullTerm;
		public EqTermContext eqTerm;
		public NeTermContext neTerm;
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
		enterRule(_localctx, 24, RULE_pureTerm);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				((PureTermContext)_localctx).eqNullTerm = eqNullTerm();

						((PureTermContext)_localctx).term =  ((PureTermContext)_localctx).eqNullTerm.term;
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				((PureTermContext)_localctx).neNullTerm = neNullTerm();

						((PureTermContext)_localctx).term =  ((PureTermContext)_localctx).neNullTerm.term;
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				((PureTermContext)_localctx).eqTerm = eqTerm();

						((PureTermContext)_localctx).term =  ((PureTermContext)_localctx).eqTerm.term;
					
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(150);
				((PureTermContext)_localctx).neTerm = neTerm();

						((PureTermContext)_localctx).term =  ((PureTermContext)_localctx).neTerm.term;
					
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
		public PureTerm term;
		public Token ID;
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
		enterRule(_localctx, 26, RULE_eqNullTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			((EqNullTermContext)_localctx).ID = match(ID);
			setState(156);
			match(EQ);
			setState(157);
			match(NULL);

					Variable var = new Variable((((EqNullTermContext)_localctx).ID!=null?((EqNullTermContext)_localctx).ID.getText():null), "");
					
					((EqNullTermContext)_localctx).term =  new EqNullTerm(var);
				
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
		public PureTerm term;
		public Token ID;
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
		enterRule(_localctx, 28, RULE_neNullTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			((NeNullTermContext)_localctx).ID = match(ID);
			setState(161);
			match(NE);
			setState(162);
			match(NULL);

					Variable var = new Variable((((NeNullTermContext)_localctx).ID!=null?((NeNullTermContext)_localctx).ID.getText():null), "");
					
					((NeNullTermContext)_localctx).term =  new NEqNullTerm(var);
				
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
		public PureTerm term;
		public Token var1;
		public Token var2;
		public TerminalNode EQ() { return getToken(InductivePredParser.EQ, 0); }
		public List<TerminalNode> ID() { return getTokens(InductivePredParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(InductivePredParser.ID, i);
		}
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
		enterRule(_localctx, 30, RULE_eqTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			((EqTermContext)_localctx).var1 = match(ID);
			setState(166);
			match(EQ);
			setState(167);
			((EqTermContext)_localctx).var2 = match(ID);

					Variable var1 = new Variable((((EqTermContext)_localctx).var1!=null?((EqTermContext)_localctx).var1.getText():null), "");
					Variable var2 = new Variable((((EqTermContext)_localctx).var2!=null?((EqTermContext)_localctx).var2.getText():null), "");
					
					((EqTermContext)_localctx).term =  new EqTerm(var1, var2);
				
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
		public PureTerm term;
		public Token var1;
		public Token var2;
		public TerminalNode NE() { return getToken(InductivePredParser.NE, 0); }
		public List<TerminalNode> ID() { return getTokens(InductivePredParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(InductivePredParser.ID, i);
		}
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
		enterRule(_localctx, 32, RULE_neTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			((NeTermContext)_localctx).var1 = match(ID);
			setState(171);
			match(NE);
			setState(172);
			((NeTermContext)_localctx).var2 = match(ID);

					Variable var1 = new Variable((((NeTermContext)_localctx).var1!=null?((NeTermContext)_localctx).var1.getText():null), "");
					Variable var2 = new Variable((((NeTermContext)_localctx).var2!=null?((NeTermContext)_localctx).var2.getText():null), "");
					
					((NeTermContext)_localctx).term =  new NEqTerm(var1, var2);
				
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21\u00b2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2,\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3\67\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5J\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7W\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bd\n\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\tn\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\nv\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\5\r\u008e\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u009c\n\16\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\2\2\u00ac\2+"+
		"\3\2\2\2\4\66\3\2\2\2\68\3\2\2\2\bI\3\2\2\2\nK\3\2\2\2\fV\3\2\2\2\16c"+
		"\3\2\2\2\20m\3\2\2\2\22u\3\2\2\2\24w\3\2\2\2\26\177\3\2\2\2\30\u008d\3"+
		"\2\2\2\32\u009b\3\2\2\2\34\u009d\3\2\2\2\36\u00a2\3\2\2\2 \u00a7\3\2\2"+
		"\2\"\u00ac\3\2\2\2$%\5\6\4\2%&\b\2\1\2&,\3\2\2\2\'(\5\6\4\2()\5\4\3\2"+
		")*\b\2\1\2*,\3\2\2\2+$\3\2\2\2+\'\3\2\2\2,\3\3\2\2\2-.\7\13\2\2./\5\6"+
		"\4\2/\60\b\3\1\2\60\67\3\2\2\2\61\62\7\13\2\2\62\63\5\6\4\2\63\64\5\4"+
		"\3\2\64\65\b\3\1\2\65\67\3\2\2\2\66-\3\2\2\2\66\61\3\2\2\2\67\5\3\2\2"+
		"\289\7\3\2\29:\7\20\2\2:;\7\b\2\2;<\5\b\5\2<=\7\t\2\2=>\7\5\2\2>?\5\f"+
		"\7\2?@\b\4\1\2@\7\3\2\2\2AB\5\n\6\2BC\b\5\1\2CJ\3\2\2\2DE\5\n\6\2EF\7"+
		"\n\2\2FG\5\b\5\2GH\b\5\1\2HJ\3\2\2\2IA\3\2\2\2ID\3\2\2\2J\t\3\2\2\2KL"+
		"\7\20\2\2LM\b\6\1\2M\13\3\2\2\2NO\5\16\b\2OP\b\7\1\2PW\3\2\2\2QR\5\16"+
		"\b\2RS\7\f\2\2ST\5\f\7\2TU\b\7\1\2UW\3\2\2\2VN\3\2\2\2VQ\3\2\2\2W\r\3"+
		"\2\2\2XY\5\20\t\2YZ\b\b\1\2Zd\3\2\2\2[\\\5\30\r\2\\]\b\b\1\2]d\3\2\2\2"+
		"^_\5\20\t\2_`\7\r\2\2`a\5\30\r\2ab\b\b\1\2bd\3\2\2\2cX\3\2\2\2c[\3\2\2"+
		"\2c^\3\2\2\2d\17\3\2\2\2ef\5\22\n\2fg\b\t\1\2gn\3\2\2\2hi\5\22\n\2ij\7"+
		"\17\2\2jk\5\20\t\2kl\b\t\1\2ln\3\2\2\2me\3\2\2\2mh\3\2\2\2n\21\3\2\2\2"+
		"op\5\24\13\2pq\b\n\1\2qv\3\2\2\2rs\5\26\f\2st\b\n\1\2tv\3\2\2\2uo\3\2"+
		"\2\2ur\3\2\2\2v\23\3\2\2\2wx\7\20\2\2xy\7\16\2\2yz\7\20\2\2z{\7\b\2\2"+
		"{|\5\b\5\2|}\7\t\2\2}~\b\13\1\2~\25\3\2\2\2\177\u0080\7\20\2\2\u0080\u0081"+
		"\7\b\2\2\u0081\u0082\5\b\5\2\u0082\u0083\7\t\2\2\u0083\u0084\b\f\1\2\u0084"+
		"\27\3\2\2\2\u0085\u0086\5\32\16\2\u0086\u0087\b\r\1\2\u0087\u008e\3\2"+
		"\2\2\u0088\u0089\5\32\16\2\u0089\u008a\7\r\2\2\u008a\u008b\5\30\r\2\u008b"+
		"\u008c\b\r\1\2\u008c\u008e\3\2\2\2\u008d\u0085\3\2\2\2\u008d\u0088\3\2"+
		"\2\2\u008e\31\3\2\2\2\u008f\u0090\5\34\17\2\u0090\u0091\b\16\1\2\u0091"+
		"\u009c\3\2\2\2\u0092\u0093\5\36\20\2\u0093\u0094\b\16\1\2\u0094\u009c"+
		"\3\2\2\2\u0095\u0096\5 \21\2\u0096\u0097\b\16\1\2\u0097\u009c\3\2\2\2"+
		"\u0098\u0099\5\"\22\2\u0099\u009a\b\16\1\2\u009a\u009c\3\2\2\2\u009b\u008f"+
		"\3\2\2\2\u009b\u0092\3\2\2\2\u009b\u0095\3\2\2\2\u009b\u0098\3\2\2\2\u009c"+
		"\33\3\2\2\2\u009d\u009e\7\20\2\2\u009e\u009f\7\6\2\2\u009f\u00a0\7\4\2"+
		"\2\u00a0\u00a1\b\17\1\2\u00a1\35\3\2\2\2\u00a2\u00a3\7\20\2\2\u00a3\u00a4"+
		"\7\7\2\2\u00a4\u00a5\7\4\2\2\u00a5\u00a6\b\20\1\2\u00a6\37\3\2\2\2\u00a7"+
		"\u00a8\7\20\2\2\u00a8\u00a9\7\6\2\2\u00a9\u00aa\7\20\2\2\u00aa\u00ab\b"+
		"\21\1\2\u00ab!\3\2\2\2\u00ac\u00ad\7\20\2\2\u00ad\u00ae\7\7\2\2\u00ae"+
		"\u00af\7\20\2\2\u00af\u00b0\b\22\1\2\u00b0#\3\2\2\2\13+\66IVcmu\u008d"+
		"\u009b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}