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
		enterRule(_localctx, 0, RULE_pred);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(PRED);
			setState(31);
			((PredContext)_localctx).ID = match(ID);
			setState(32);
			match(LB);
			setState(33);
			((PredContext)_localctx).params = params();
			setState(34);
			match(RB);
			setState(35);
			match(EQEQ);
			setState(36);
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
		enterRule(_localctx, 2, RULE_params);
		try {
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				((ParamsContext)_localctx).param = param();

						((ParamsContext)_localctx).vars =  new Variable[1];
						_localctx.vars[0] = ((ParamsContext)_localctx).param.var;
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				((ParamsContext)_localctx).param = param();
				setState(43);
				match(CM);
				setState(44);
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
		enterRule(_localctx, 4, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
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
		enterRule(_localctx, 6, RULE_formulas);
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				((FormulasContext)_localctx).formula = formula();

						((FormulasContext)_localctx).fs =  new Formula[1];
						_localctx.fs[0] = ((FormulasContext)_localctx).formula.f;
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				((FormulasContext)_localctx).formula = formula();
				setState(56);
				match(OR);
				setState(57);
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
		enterRule(_localctx, 8, RULE_formula);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				((FormulaContext)_localctx).heapTerms = heapTerms();

						HeapFormula hFormula = ((FormulaContext)_localctx).heapTerms.hFormula;
						PureFormula pFormula = new PureFormula();
						((FormulaContext)_localctx).f =  new Formula(hFormula, pFormula);
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				((FormulaContext)_localctx).pureTerms = pureTerms();

						HeapFormula hFormula = new HeapFormula();
						PureFormula pFormula = ((FormulaContext)_localctx).pureTerms.pFormula;
						((FormulaContext)_localctx).f =  new Formula(hFormula, pFormula);
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				((FormulaContext)_localctx).heapTerms = heapTerms();
				setState(69);
				match(AND);
				setState(70);
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
		enterRule(_localctx, 10, RULE_heapTerms);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				((HeapTermsContext)_localctx).heapTerm = heapTerm();

						((HeapTermsContext)_localctx).hFormula =  new HeapFormula(((HeapTermsContext)_localctx).heapTerm.term);
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				((HeapTermsContext)_localctx).heapTerm = heapTerm();
				setState(79);
				match(STAR);
				setState(80);
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
		enterRule(_localctx, 12, RULE_heapTerm);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				((HeapTermContext)_localctx).pointToTerm = pointToTerm();

						((HeapTermContext)_localctx).term =  ((HeapTermContext)_localctx).pointToTerm.term;
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
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
		enterRule(_localctx, 14, RULE_pointToTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			((PointToTermContext)_localctx).root = match(ID);
			setState(94);
			match(PT);
			setState(95);
			((PointToTermContext)_localctx).type = match(ID);
			setState(96);
			match(LB);
			setState(97);
			((PointToTermContext)_localctx).params = params();
			setState(98);
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
		enterRule(_localctx, 16, RULE_inductiveTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			((InductiveTermContext)_localctx).ID = match(ID);
			setState(102);
			match(LB);
			setState(103);
			((InductiveTermContext)_localctx).params = params();
			setState(104);
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
		enterRule(_localctx, 18, RULE_pureTerms);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				((PureTermsContext)_localctx).pureTerm = pureTerm();

						((PureTermsContext)_localctx).pFormula =  new PureFormula(((PureTermsContext)_localctx).pureTerm.term);
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				((PureTermsContext)_localctx).pureTerm = pureTerm();
				setState(111);
				match(AND);
				setState(112);
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
		enterRule(_localctx, 20, RULE_pureTerm);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				((PureTermContext)_localctx).eqNullTerm = eqNullTerm();

						((PureTermContext)_localctx).term =  ((PureTermContext)_localctx).eqNullTerm.term;
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				((PureTermContext)_localctx).neNullTerm = neNullTerm();

						((PureTermContext)_localctx).term =  ((PureTermContext)_localctx).neNullTerm.term;
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				((PureTermContext)_localctx).eqTerm = eqTerm();

						((PureTermContext)_localctx).term =  ((PureTermContext)_localctx).eqTerm.term;
					
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
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
		enterRule(_localctx, 22, RULE_eqNullTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			((EqNullTermContext)_localctx).ID = match(ID);
			setState(132);
			match(EQ);
			setState(133);
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
		enterRule(_localctx, 24, RULE_neNullTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			((NeNullTermContext)_localctx).ID = match(ID);
			setState(137);
			match(NE);
			setState(138);
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
		enterRule(_localctx, 26, RULE_eqTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			((EqTermContext)_localctx).var1 = match(ID);
			setState(142);
			match(EQ);
			setState(143);
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
		enterRule(_localctx, 28, RULE_neTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			((NeTermContext)_localctx).var1 = match(ID);
			setState(147);
			match(NE);
			setState(148);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20\u009a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5?\n\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6L\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7V\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\b^\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13v\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0084\n\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		"\2\2\2\u0094\2 \3\2\2\2\4\61\3\2\2\2\6\63\3\2\2\2\b>\3\2\2\2\nK\3\2\2"+
		"\2\fU\3\2\2\2\16]\3\2\2\2\20_\3\2\2\2\22g\3\2\2\2\24u\3\2\2\2\26\u0083"+
		"\3\2\2\2\30\u0085\3\2\2\2\32\u008a\3\2\2\2\34\u008f\3\2\2\2\36\u0094\3"+
		"\2\2\2 !\7\3\2\2!\"\7\17\2\2\"#\7\b\2\2#$\5\4\3\2$%\7\t\2\2%&\7\5\2\2"+
		"&\'\5\b\5\2\'(\b\2\1\2(\3\3\2\2\2)*\5\6\4\2*+\b\3\1\2+\62\3\2\2\2,-\5"+
		"\6\4\2-.\7\n\2\2./\5\4\3\2/\60\b\3\1\2\60\62\3\2\2\2\61)\3\2\2\2\61,\3"+
		"\2\2\2\62\5\3\2\2\2\63\64\7\17\2\2\64\65\b\4\1\2\65\7\3\2\2\2\66\67\5"+
		"\n\6\2\678\b\5\1\28?\3\2\2\29:\5\n\6\2:;\7\13\2\2;<\5\b\5\2<=\b\5\1\2"+
		"=?\3\2\2\2>\66\3\2\2\2>9\3\2\2\2?\t\3\2\2\2@A\5\f\7\2AB\b\6\1\2BL\3\2"+
		"\2\2CD\5\24\13\2DE\b\6\1\2EL\3\2\2\2FG\5\f\7\2GH\7\f\2\2HI\5\24\13\2I"+
		"J\b\6\1\2JL\3\2\2\2K@\3\2\2\2KC\3\2\2\2KF\3\2\2\2L\13\3\2\2\2MN\5\16\b"+
		"\2NO\b\7\1\2OV\3\2\2\2PQ\5\16\b\2QR\7\16\2\2RS\5\f\7\2ST\b\7\1\2TV\3\2"+
		"\2\2UM\3\2\2\2UP\3\2\2\2V\r\3\2\2\2WX\5\20\t\2XY\b\b\1\2Y^\3\2\2\2Z[\5"+
		"\22\n\2[\\\b\b\1\2\\^\3\2\2\2]W\3\2\2\2]Z\3\2\2\2^\17\3\2\2\2_`\7\17\2"+
		"\2`a\7\r\2\2ab\7\17\2\2bc\7\b\2\2cd\5\4\3\2de\7\t\2\2ef\b\t\1\2f\21\3"+
		"\2\2\2gh\7\17\2\2hi\7\b\2\2ij\5\4\3\2jk\7\t\2\2kl\b\n\1\2l\23\3\2\2\2"+
		"mn\5\26\f\2no\b\13\1\2ov\3\2\2\2pq\5\26\f\2qr\7\f\2\2rs\5\24\13\2st\b"+
		"\13\1\2tv\3\2\2\2um\3\2\2\2up\3\2\2\2v\25\3\2\2\2wx\5\30\r\2xy\b\f\1\2"+
		"y\u0084\3\2\2\2z{\5\32\16\2{|\b\f\1\2|\u0084\3\2\2\2}~\5\34\17\2~\177"+
		"\b\f\1\2\177\u0084\3\2\2\2\u0080\u0081\5\36\20\2\u0081\u0082\b\f\1\2\u0082"+
		"\u0084\3\2\2\2\u0083w\3\2\2\2\u0083z\3\2\2\2\u0083}\3\2\2\2\u0083\u0080"+
		"\3\2\2\2\u0084\27\3\2\2\2\u0085\u0086\7\17\2\2\u0086\u0087\7\6\2\2\u0087"+
		"\u0088\7\4\2\2\u0088\u0089\b\r\1\2\u0089\31\3\2\2\2\u008a\u008b\7\17\2"+
		"\2\u008b\u008c\7\7\2\2\u008c\u008d\7\4\2\2\u008d\u008e\b\16\1\2\u008e"+
		"\33\3\2\2\2\u008f\u0090\7\17\2\2\u0090\u0091\7\6\2\2\u0091\u0092\7\17"+
		"\2\2\u0092\u0093\b\17\1\2\u0093\35\3\2\2\2\u0094\u0095\7\17\2\2\u0095"+
		"\u0096\7\7\2\2\u0096\u0097\7\17\2\2\u0097\u0098\b\20\1\2\u0098\37\3\2"+
		"\2\2\t\61>KU]u\u0083";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}