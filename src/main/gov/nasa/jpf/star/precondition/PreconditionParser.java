// Generated from Precondition.g4 by ANTLR 4.7

package gov.nasa.jpf.star.precondition;

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
public class PreconditionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRE=1, NULL=2, EQEQ=3, EQ=4, NE=5, LB=6, RB=7, CM=8, SM=9, OR=10, AND=11, 
		PT=12, STAR=13, ID=14, WS=15;
	public static final int
		RULE_pres = 0, RULE_tail = 1, RULE_pre = 2, RULE_params = 3, RULE_param = 4, 
		RULE_formula = 5, RULE_heapTerms = 6, RULE_heapTerm = 7, RULE_pointToTerm = 8, 
		RULE_inductiveTerm = 9, RULE_pureTerms = 10, RULE_pureTerm = 11, RULE_eqNullTerm = 12, 
		RULE_neNullTerm = 13, RULE_eqTerm = 14, RULE_neTerm = 15;
	public static final String[] ruleNames = {
		"pres", "tail", "pre", "params", "param", "formula", "heapTerms", "heapTerm", 
		"pointToTerm", "inductiveTerm", "pureTerms", "pureTerm", "eqNullTerm", 
		"neNullTerm", "eqTerm", "neTerm"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'pre'", "'null'", "'=='", "'='", "'!='", "'('", "')'", "','", "';'", 
		"'||'", "'&'", "'->'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PRE", "NULL", "EQEQ", "EQ", "NE", "LB", "RB", "CM", "SM", "OR", 
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
	public String getGrammarFileName() { return "Precondition.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PreconditionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PresContext extends ParserRuleContext {
		public Precondition[] ps;
		public PreContext pre;
		public TailContext tail;
		public PreContext pre() {
			return getRuleContext(PreContext.class,0);
		}
		public TailContext tail() {
			return getRuleContext(TailContext.class,0);
		}
		public PresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pres; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).enterPres(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).exitPres(this);
		}
	}

	public final PresContext pres() throws RecognitionException {
		PresContext _localctx = new PresContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pres);
		try {
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				((PresContext)_localctx).pre = pre();

						((PresContext)_localctx).ps =  new Precondition[1];
						_localctx.ps[0] = ((PresContext)_localctx).pre.p;
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				((PresContext)_localctx).pre = pre();
				setState(36);
				((PresContext)_localctx).tail = tail();

						int length = ((PresContext)_localctx).tail.ps.length + 1;
						((PresContext)_localctx).ps =  new Precondition[length];
						
						for (int i = 0; i < length; i++) {
							if (i == 0) _localctx.ps[0] = ((PresContext)_localctx).pre.p;
							else _localctx.ps[i] = ((PresContext)_localctx).tail.ps[i - 1];
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
		public Precondition[] ps;
		public PreContext pre;
		public TailContext tail;
		public TerminalNode SM() { return getToken(PreconditionParser.SM, 0); }
		public PreContext pre() {
			return getRuleContext(PreContext.class,0);
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
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).enterTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).exitTail(this);
		}
	}

	public final TailContext tail() throws RecognitionException {
		TailContext _localctx = new TailContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tail);
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(SM);
				setState(42);
				((TailContext)_localctx).pre = pre();

						((TailContext)_localctx).ps =  new Precondition[1];
						_localctx.ps[0] = ((TailContext)_localctx).pre.p;
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(SM);
				setState(46);
				((TailContext)_localctx).pre = pre();
				setState(47);
				((TailContext)_localctx).tail = tail();

						int length = ((TailContext)_localctx).tail.ps.length + 1;
						((TailContext)_localctx).ps =  new Precondition[length];
						
						for (int i = 0; i < length; i++) {
							if (i == 0) _localctx.ps[0] = ((TailContext)_localctx).pre.p;
							else _localctx.ps[i] = ((TailContext)_localctx).tail.ps[i - 1];
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

	public static class PreContext extends ParserRuleContext {
		public Precondition p;
		public Token ID;
		public FormulaContext formula;
		public TerminalNode PRE() { return getToken(PreconditionParser.PRE, 0); }
		public TerminalNode ID() { return getToken(PreconditionParser.ID, 0); }
		public TerminalNode EQEQ() { return getToken(PreconditionParser.EQEQ, 0); }
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public PreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).enterPre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).exitPre(this);
		}
	}

	public final PreContext pre() throws RecognitionException {
		PreContext _localctx = new PreContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(PRE);
			setState(53);
			((PreContext)_localctx).ID = match(ID);
			setState(54);
			match(EQEQ);
			setState(55);
			((PreContext)_localctx).formula = formula();

					Formula f = ((PreContext)_localctx).formula.f;
					
					((PreContext)_localctx).p =  new Precondition((((PreContext)_localctx).ID!=null?((PreContext)_localctx).ID.getText():null), f);
				
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
		public TerminalNode CM() { return getToken(PreconditionParser.CM, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_params);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				((ParamsContext)_localctx).param = param();

						((ParamsContext)_localctx).vars =  new Variable[1];
						_localctx.vars[0] = ((ParamsContext)_localctx).param.var;
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				((ParamsContext)_localctx).param = param();
				setState(62);
				match(CM);
				setState(63);
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
		public TerminalNode ID() { return getToken(PreconditionParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
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
		public TerminalNode AND() { return getToken(PreconditionParser.AND, 0); }
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).enterFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).exitFormula(this);
		}
	}

	public final FormulaContext formula() throws RecognitionException {
		FormulaContext _localctx = new FormulaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_formula);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				((FormulaContext)_localctx).heapTerms = heapTerms();

						HeapFormula hFormula = ((FormulaContext)_localctx).heapTerms.hFormula;
						PureFormula pFormula = new PureFormula();
						((FormulaContext)_localctx).f =  new Formula(hFormula, pFormula);
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				((FormulaContext)_localctx).pureTerms = pureTerms();

						HeapFormula hFormula = new HeapFormula();
						PureFormula pFormula = ((FormulaContext)_localctx).pureTerms.pFormula;
						((FormulaContext)_localctx).f =  new Formula(hFormula, pFormula);
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				((FormulaContext)_localctx).heapTerms = heapTerms();
				setState(78);
				match(AND);
				setState(79);
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
		public TerminalNode STAR() { return getToken(PreconditionParser.STAR, 0); }
		public HeapTermsContext heapTerms() {
			return getRuleContext(HeapTermsContext.class,0);
		}
		public HeapTermsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heapTerms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).enterHeapTerms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).exitHeapTerms(this);
		}
	}

	public final HeapTermsContext heapTerms() throws RecognitionException {
		HeapTermsContext _localctx = new HeapTermsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_heapTerms);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				((HeapTermsContext)_localctx).heapTerm = heapTerm();

						((HeapTermsContext)_localctx).hFormula =  new HeapFormula(((HeapTermsContext)_localctx).heapTerm.term);
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				((HeapTermsContext)_localctx).heapTerm = heapTerm();
				setState(88);
				match(STAR);
				setState(89);
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
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).enterHeapTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).exitHeapTerm(this);
		}
	}

	public final HeapTermContext heapTerm() throws RecognitionException {
		HeapTermContext _localctx = new HeapTermContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_heapTerm);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				((HeapTermContext)_localctx).pointToTerm = pointToTerm();

						((HeapTermContext)_localctx).term =  ((HeapTermContext)_localctx).pointToTerm.term;
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
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
		public TerminalNode PT() { return getToken(PreconditionParser.PT, 0); }
		public TerminalNode LB() { return getToken(PreconditionParser.LB, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode RB() { return getToken(PreconditionParser.RB, 0); }
		public List<TerminalNode> ID() { return getTokens(PreconditionParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PreconditionParser.ID, i);
		}
		public PointToTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointToTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).enterPointToTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).exitPointToTerm(this);
		}
	}

	public final PointToTermContext pointToTerm() throws RecognitionException {
		PointToTermContext _localctx = new PointToTermContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pointToTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			((PointToTermContext)_localctx).root = match(ID);
			setState(103);
			match(PT);
			setState(104);
			((PointToTermContext)_localctx).type = match(ID);
			setState(105);
			match(LB);
			setState(106);
			((PointToTermContext)_localctx).params = params();
			setState(107);
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
		public TerminalNode ID() { return getToken(PreconditionParser.ID, 0); }
		public TerminalNode LB() { return getToken(PreconditionParser.LB, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode RB() { return getToken(PreconditionParser.RB, 0); }
		public InductiveTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inductiveTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).enterInductiveTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).exitInductiveTerm(this);
		}
	}

	public final InductiveTermContext inductiveTerm() throws RecognitionException {
		InductiveTermContext _localctx = new InductiveTermContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_inductiveTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			((InductiveTermContext)_localctx).ID = match(ID);
			setState(111);
			match(LB);
			setState(112);
			((InductiveTermContext)_localctx).params = params();
			setState(113);
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
		public TerminalNode AND() { return getToken(PreconditionParser.AND, 0); }
		public PureTermsContext pureTerms() {
			return getRuleContext(PureTermsContext.class,0);
		}
		public PureTermsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pureTerms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).enterPureTerms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).exitPureTerms(this);
		}
	}

	public final PureTermsContext pureTerms() throws RecognitionException {
		PureTermsContext _localctx = new PureTermsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pureTerms);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				((PureTermsContext)_localctx).pureTerm = pureTerm();

						((PureTermsContext)_localctx).pFormula =  new PureFormula(((PureTermsContext)_localctx).pureTerm.term);
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				((PureTermsContext)_localctx).pureTerm = pureTerm();
				setState(120);
				match(AND);
				setState(121);
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
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).enterPureTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).exitPureTerm(this);
		}
	}

	public final PureTermContext pureTerm() throws RecognitionException {
		PureTermContext _localctx = new PureTermContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_pureTerm);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				((PureTermContext)_localctx).eqNullTerm = eqNullTerm();

						((PureTermContext)_localctx).term =  ((PureTermContext)_localctx).eqNullTerm.term;
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				((PureTermContext)_localctx).neNullTerm = neNullTerm();

						((PureTermContext)_localctx).term =  ((PureTermContext)_localctx).neNullTerm.term;
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				((PureTermContext)_localctx).eqTerm = eqTerm();

						((PureTermContext)_localctx).term =  ((PureTermContext)_localctx).eqTerm.term;
					
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
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
		public TerminalNode ID() { return getToken(PreconditionParser.ID, 0); }
		public TerminalNode EQ() { return getToken(PreconditionParser.EQ, 0); }
		public TerminalNode NULL() { return getToken(PreconditionParser.NULL, 0); }
		public EqNullTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqNullTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).enterEqNullTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).exitEqNullTerm(this);
		}
	}

	public final EqNullTermContext eqNullTerm() throws RecognitionException {
		EqNullTermContext _localctx = new EqNullTermContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_eqNullTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			((EqNullTermContext)_localctx).ID = match(ID);
			setState(141);
			match(EQ);
			setState(142);
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
		public TerminalNode ID() { return getToken(PreconditionParser.ID, 0); }
		public TerminalNode NE() { return getToken(PreconditionParser.NE, 0); }
		public TerminalNode NULL() { return getToken(PreconditionParser.NULL, 0); }
		public NeNullTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_neNullTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).enterNeNullTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).exitNeNullTerm(this);
		}
	}

	public final NeNullTermContext neNullTerm() throws RecognitionException {
		NeNullTermContext _localctx = new NeNullTermContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_neNullTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			((NeNullTermContext)_localctx).ID = match(ID);
			setState(146);
			match(NE);
			setState(147);
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
		public TerminalNode EQ() { return getToken(PreconditionParser.EQ, 0); }
		public List<TerminalNode> ID() { return getTokens(PreconditionParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PreconditionParser.ID, i);
		}
		public EqTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).enterEqTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).exitEqTerm(this);
		}
	}

	public final EqTermContext eqTerm() throws RecognitionException {
		EqTermContext _localctx = new EqTermContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_eqTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			((EqTermContext)_localctx).var1 = match(ID);
			setState(151);
			match(EQ);
			setState(152);
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
		public TerminalNode NE() { return getToken(PreconditionParser.NE, 0); }
		public List<TerminalNode> ID() { return getTokens(PreconditionParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PreconditionParser.ID, i);
		}
		public NeTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_neTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).enterNeTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).exitNeTerm(this);
		}
	}

	public final NeTermContext neTerm() throws RecognitionException {
		NeTermContext _localctx = new NeTermContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_neTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			((NeTermContext)_localctx).var1 = match(ID);
			setState(156);
			match(NE);
			setState(157);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21\u00a3\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\5\2*\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"\65\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5E\n"+
		"\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7U\n\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b_\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tg\n"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\177\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u008d\n\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\2\2"+
		"\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\2\2\u009d\2)\3\2\2\2\4\64"+
		"\3\2\2\2\6\66\3\2\2\2\bD\3\2\2\2\nF\3\2\2\2\fT\3\2\2\2\16^\3\2\2\2\20"+
		"f\3\2\2\2\22h\3\2\2\2\24p\3\2\2\2\26~\3\2\2\2\30\u008c\3\2\2\2\32\u008e"+
		"\3\2\2\2\34\u0093\3\2\2\2\36\u0098\3\2\2\2 \u009d\3\2\2\2\"#\5\6\4\2#"+
		"$\b\2\1\2$*\3\2\2\2%&\5\6\4\2&\'\5\4\3\2\'(\b\2\1\2(*\3\2\2\2)\"\3\2\2"+
		"\2)%\3\2\2\2*\3\3\2\2\2+,\7\13\2\2,-\5\6\4\2-.\b\3\1\2.\65\3\2\2\2/\60"+
		"\7\13\2\2\60\61\5\6\4\2\61\62\5\4\3\2\62\63\b\3\1\2\63\65\3\2\2\2\64+"+
		"\3\2\2\2\64/\3\2\2\2\65\5\3\2\2\2\66\67\7\3\2\2\678\7\20\2\289\7\5\2\2"+
		"9:\5\f\7\2:;\b\4\1\2;\7\3\2\2\2<=\5\n\6\2=>\b\5\1\2>E\3\2\2\2?@\5\n\6"+
		"\2@A\7\n\2\2AB\5\b\5\2BC\b\5\1\2CE\3\2\2\2D<\3\2\2\2D?\3\2\2\2E\t\3\2"+
		"\2\2FG\7\20\2\2GH\b\6\1\2H\13\3\2\2\2IJ\5\16\b\2JK\b\7\1\2KU\3\2\2\2L"+
		"M\5\26\f\2MN\b\7\1\2NU\3\2\2\2OP\5\16\b\2PQ\7\r\2\2QR\5\26\f\2RS\b\7\1"+
		"\2SU\3\2\2\2TI\3\2\2\2TL\3\2\2\2TO\3\2\2\2U\r\3\2\2\2VW\5\20\t\2WX\b\b"+
		"\1\2X_\3\2\2\2YZ\5\20\t\2Z[\7\17\2\2[\\\5\16\b\2\\]\b\b\1\2]_\3\2\2\2"+
		"^V\3\2\2\2^Y\3\2\2\2_\17\3\2\2\2`a\5\22\n\2ab\b\t\1\2bg\3\2\2\2cd\5\24"+
		"\13\2de\b\t\1\2eg\3\2\2\2f`\3\2\2\2fc\3\2\2\2g\21\3\2\2\2hi\7\20\2\2i"+
		"j\7\16\2\2jk\7\20\2\2kl\7\b\2\2lm\5\b\5\2mn\7\t\2\2no\b\n\1\2o\23\3\2"+
		"\2\2pq\7\20\2\2qr\7\b\2\2rs\5\b\5\2st\7\t\2\2tu\b\13\1\2u\25\3\2\2\2v"+
		"w\5\30\r\2wx\b\f\1\2x\177\3\2\2\2yz\5\30\r\2z{\7\r\2\2{|\5\26\f\2|}\b"+
		"\f\1\2}\177\3\2\2\2~v\3\2\2\2~y\3\2\2\2\177\27\3\2\2\2\u0080\u0081\5\32"+
		"\16\2\u0081\u0082\b\r\1\2\u0082\u008d\3\2\2\2\u0083\u0084\5\34\17\2\u0084"+
		"\u0085\b\r\1\2\u0085\u008d\3\2\2\2\u0086\u0087\5\36\20\2\u0087\u0088\b"+
		"\r\1\2\u0088\u008d\3\2\2\2\u0089\u008a\5 \21\2\u008a\u008b\b\r\1\2\u008b"+
		"\u008d\3\2\2\2\u008c\u0080\3\2\2\2\u008c\u0083\3\2\2\2\u008c\u0086\3\2"+
		"\2\2\u008c\u0089\3\2\2\2\u008d\31\3\2\2\2\u008e\u008f\7\20\2\2\u008f\u0090"+
		"\7\6\2\2\u0090\u0091\7\4\2\2\u0091\u0092\b\16\1\2\u0092\33\3\2\2\2\u0093"+
		"\u0094\7\20\2\2\u0094\u0095\7\7\2\2\u0095\u0096\7\4\2\2\u0096\u0097\b"+
		"\17\1\2\u0097\35\3\2\2\2\u0098\u0099\7\20\2\2\u0099\u009a\7\6\2\2\u009a"+
		"\u009b\7\20\2\2\u009b\u009c\b\20\1\2\u009c\37\3\2\2\2\u009d\u009e\7\20"+
		"\2\2\u009e\u009f\7\7\2\2\u009f\u00a0\7\20\2\2\u00a0\u00a1\b\21\1\2\u00a1"+
		"!\3\2\2\2\n)\64DT^f~\u008c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}