// Generated from Precondition.g4 by ANTLR 4.7

package star.precondition;

import java.util.List;

import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import gov.nasa.jpf.symbc.numeric.Comparator;
import gov.nasa.jpf.symbc.numeric.Operator;
import star.formula.Formula;
import star.formula.HeapFormula;
import star.formula.PureFormula;
import star.formula.Variable;
import star.formula.expression.BinaryExpression;
import star.formula.expression.Expression;
import star.formula.expression.LiteralExpression;
import star.formula.expression.VariableExpression;
import star.formula.heap.HeapTerm;
import star.formula.heap.InductiveTerm;
import star.formula.heap.PointToTerm;
import star.formula.pure.ComparisonTerm;
import star.formula.pure.EqNullTerm;
import star.formula.pure.EqTerm;
import star.formula.pure.NEqNullTerm;
import star.formula.pure.NEqTerm;
import star.formula.pure.PureTerm;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PreconditionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRE=1, NULL=2, EQEQ=3, EQ=4, NE=5, GE=6, GT=7, LE=8, LT=9, PLUS=10, MINUS=11, 
		MUL=12, DIV=13, LB=14, RB=15, CM=16, SM=17, OR=18, AND=19, PT=20, STAR=21, 
		ID=22, INT=23, DOUBLE=24, WS=25;
	public static final int
		RULE_pres = 0, RULE_tail = 1, RULE_pre = 2, RULE_params = 3, RULE_param = 4, 
		RULE_formula = 5, RULE_heapTerms = 6, RULE_heapTerm = 7, RULE_pointToTerm = 8, 
		RULE_inductiveTerm = 9, RULE_pureTerms = 10, RULE_pureTerm = 11, RULE_eqNullTerm = 12, 
		RULE_neNullTerm = 13, RULE_eqTerm = 14, RULE_neTerm = 15, RULE_comparisonTerm = 16, 
		RULE_comp = 17, RULE_exp = 18, RULE_ter = 19;
	public static final String[] ruleNames = {
		"pres", "tail", "pre", "params", "param", "formula", "heapTerms", "heapTerm", 
		"pointToTerm", "inductiveTerm", "pureTerms", "pureTerm", "eqNullTerm", 
		"neNullTerm", "eqTerm", "neTerm", "comparisonTerm", "comp", "exp", "ter"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'pre'", "'null'", "'=='", "'='", "'!='", "'>='", "'>'", "'<='", 
		"'<'", "'+'", "'-'", "'**'", "'/'", "'('", "')'", "','", "';'", "'||'", 
		"'&'", "'::'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PRE", "NULL", "EQEQ", "EQ", "NE", "GE", "GT", "LE", "LT", "PLUS", 
		"MINUS", "MUL", "DIV", "LB", "RB", "CM", "SM", "OR", "AND", "PT", "STAR", 
		"ID", "INT", "DOUBLE", "WS"
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
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				((PresContext)_localctx).pre = pre();

						((PresContext)_localctx).ps =  new Precondition[1];
						_localctx.ps[0] = ((PresContext)_localctx).pre.p;
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				((PresContext)_localctx).pre = pre();
				setState(44);
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
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				match(SM);
				setState(50);
				((TailContext)_localctx).pre = pre();

						((TailContext)_localctx).ps =  new Precondition[1];
						_localctx.ps[0] = ((TailContext)_localctx).pre.p;
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				match(SM);
				setState(54);
				((TailContext)_localctx).pre = pre();
				setState(55);
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
			setState(60);
			match(PRE);
			setState(61);
			((PreContext)_localctx).ID = match(ID);
			setState(62);
			match(EQEQ);
			setState(63);
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
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				((ParamsContext)_localctx).param = param();

						((ParamsContext)_localctx).vars =  new Variable[1];
						_localctx.vars[0] = ((ParamsContext)_localctx).param.var;
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				((ParamsContext)_localctx).param = param();
				setState(70);
				match(CM);
				setState(71);
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
			setState(76);
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
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				((FormulaContext)_localctx).heapTerms = heapTerms();

						HeapFormula hFormula = ((FormulaContext)_localctx).heapTerms.hFormula;
						PureFormula pFormula = new PureFormula();
						((FormulaContext)_localctx).f =  new Formula(hFormula, pFormula);
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				((FormulaContext)_localctx).pureTerms = pureTerms();

						HeapFormula hFormula = new HeapFormula();
						PureFormula pFormula = ((FormulaContext)_localctx).pureTerms.pFormula;
						((FormulaContext)_localctx).f =  new Formula(hFormula, pFormula);
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				((FormulaContext)_localctx).heapTerms = heapTerms();
				setState(86);
				match(AND);
				setState(87);
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
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				((HeapTermsContext)_localctx).heapTerm = heapTerm();

						((HeapTermsContext)_localctx).hFormula =  new HeapFormula(((HeapTermsContext)_localctx).heapTerm.term);
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				((HeapTermsContext)_localctx).heapTerm = heapTerm();
				setState(96);
				match(STAR);
				setState(97);
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
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				((HeapTermContext)_localctx).pointToTerm = pointToTerm();

						((HeapTermContext)_localctx).term =  ((HeapTermContext)_localctx).pointToTerm.term;
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
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
		public TerminalNode LT() { return getToken(PreconditionParser.LT, 0); }
		public TerminalNode GT() { return getToken(PreconditionParser.GT, 0); }
		public List<TerminalNode> ID() { return getTokens(PreconditionParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PreconditionParser.ID, i);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
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
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				((PointToTermContext)_localctx).root = match(ID);
				setState(111);
				match(PT);
				setState(112);
				((PointToTermContext)_localctx).type = match(ID);
				setState(113);
				match(LT);
				setState(114);
				match(GT);

						Variable[] vars = new Variable[1];
						vars[0] = new Variable((((PointToTermContext)_localctx).root!=null?((PointToTermContext)_localctx).root.getText():null), "");
						((PointToTermContext)_localctx).term =  new PointToTerm((((PointToTermContext)_localctx).type!=null?((PointToTermContext)_localctx).type.getText():null), vars);
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				((PointToTermContext)_localctx).root = match(ID);
				setState(117);
				match(PT);
				setState(118);
				((PointToTermContext)_localctx).type = match(ID);
				setState(119);
				match(LT);
				setState(120);
				((PointToTermContext)_localctx).params = params();
				setState(121);
				match(GT);

						int length = ((PointToTermContext)_localctx).params.vars.length + 1;
						
						Variable[] vars = new Variable[length];
						for (int i = 0; i < length; i++) {
							if (i == 0) vars[i] = new Variable((((PointToTermContext)_localctx).root!=null?((PointToTermContext)_localctx).root.getText():null), "");
							else vars[i] = ((PointToTermContext)_localctx).params.vars[i - 1];
						}
						
						((PointToTermContext)_localctx).term =  new PointToTerm((((PointToTermContext)_localctx).type!=null?((PointToTermContext)_localctx).type.getText():null), vars);
					
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
			setState(126);
			((InductiveTermContext)_localctx).ID = match(ID);
			setState(127);
			match(LB);
			setState(128);
			((InductiveTermContext)_localctx).params = params();
			setState(129);
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
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				((PureTermsContext)_localctx).pureTerm = pureTerm();

						((PureTermsContext)_localctx).pFormula =  new PureFormula(((PureTermsContext)_localctx).pureTerm.term);
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				((PureTermsContext)_localctx).pureTerm = pureTerm();
				setState(136);
				match(AND);
				setState(137);
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
		public ComparisonTermContext comparisonTerm;
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
		public ComparisonTermContext comparisonTerm() {
			return getRuleContext(ComparisonTermContext.class,0);
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
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				((PureTermContext)_localctx).eqNullTerm = eqNullTerm();

						((PureTermContext)_localctx).term =  ((PureTermContext)_localctx).eqNullTerm.term;
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				((PureTermContext)_localctx).neNullTerm = neNullTerm();

						((PureTermContext)_localctx).term =  ((PureTermContext)_localctx).neNullTerm.term;
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				((PureTermContext)_localctx).eqTerm = eqTerm();

						((PureTermContext)_localctx).term =  ((PureTermContext)_localctx).eqTerm.term;
					
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				((PureTermContext)_localctx).neTerm = neTerm();

						((PureTermContext)_localctx).term =  ((PureTermContext)_localctx).neTerm.term;
					
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(154);
				((PureTermContext)_localctx).comparisonTerm = comparisonTerm();

						((PureTermContext)_localctx).term =  ((PureTermContext)_localctx).comparisonTerm.term;
					
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
			setState(159);
			((EqNullTermContext)_localctx).ID = match(ID);
			setState(160);
			match(EQ);
			setState(161);
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
			setState(164);
			((NeNullTermContext)_localctx).ID = match(ID);
			setState(165);
			match(NE);
			setState(166);
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
			setState(169);
			((EqTermContext)_localctx).var1 = match(ID);
			setState(170);
			match(EQ);
			setState(171);
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
			setState(174);
			((NeTermContext)_localctx).var1 = match(ID);
			setState(175);
			match(NE);
			setState(176);
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

	public static class ComparisonTermContext extends ParserRuleContext {
		public PureTerm term;
		public ExpContext exp1;
		public CompContext comp;
		public ExpContext exp2;
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ComparisonTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).enterComparisonTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).exitComparisonTerm(this);
		}
	}

	public final ComparisonTermContext comparisonTerm() throws RecognitionException {
		ComparisonTermContext _localctx = new ComparisonTermContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comparisonTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			((ComparisonTermContext)_localctx).exp1 = exp(0);
			setState(180);
			((ComparisonTermContext)_localctx).comp = comp();
			setState(181);
			((ComparisonTermContext)_localctx).exp2 = exp(0);

					((ComparisonTermContext)_localctx).term =  new ComparisonTerm(((ComparisonTermContext)_localctx).comp.c, ((ComparisonTermContext)_localctx).exp1.e, ((ComparisonTermContext)_localctx).exp2.e);
				
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

	public static class CompContext extends ParserRuleContext {
		public Comparator c;
		public TerminalNode EQ() { return getToken(PreconditionParser.EQ, 0); }
		public TerminalNode NE() { return getToken(PreconditionParser.NE, 0); }
		public TerminalNode GE() { return getToken(PreconditionParser.GE, 0); }
		public TerminalNode GT() { return getToken(PreconditionParser.GT, 0); }
		public TerminalNode LE() { return getToken(PreconditionParser.LE, 0); }
		public TerminalNode LT() { return getToken(PreconditionParser.LT, 0); }
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).exitComp(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comp);
		try {
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				match(EQ);

						((CompContext)_localctx).c =  Comparator.EQ;
					
				}
				break;
			case NE:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(NE);

						((CompContext)_localctx).c =  Comparator.NE;
					
				}
				break;
			case GE:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				match(GE);

						((CompContext)_localctx).c =  Comparator.GE;
					
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 4);
				{
				setState(190);
				match(GT);

						((CompContext)_localctx).c =  Comparator.GT;
					
				}
				break;
			case LE:
				enterOuterAlt(_localctx, 5);
				{
				setState(192);
				match(LE);

						((CompContext)_localctx).c =  Comparator.LE;
					
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 6);
				{
				setState(194);
				match(LT);

						((CompContext)_localctx).c =  Comparator.LT;
					
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

	public static class ExpContext extends ParserRuleContext {
		public Expression e;
		public ExpContext exp1;
		public TerContext ter;
		public TerContext ter() {
			return getRuleContext(TerContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(PreconditionParser.PLUS, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(PreconditionParser.MINUS, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(199);
			((ExpContext)_localctx).ter = ter();

					((ExpContext)_localctx).e =  ((ExpContext)_localctx).ter.e;
				
			}
			_ctx.stop = _input.LT(-1);
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(212);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(202);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(203);
						match(PLUS);
						setState(204);
						((ExpContext)_localctx).ter = ter();

						          		Expression exp1 = ((ExpContext)_localctx).exp1.e;
						          		Expression exp2 = ((ExpContext)_localctx).ter.e;
						          		
						          		((ExpContext)_localctx).e =  new BinaryExpression(Operator.PLUS, exp1, exp2);
						          	
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(207);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(208);
						match(MINUS);
						setState(209);
						((ExpContext)_localctx).ter = ter();

						          		Expression exp1 = ((ExpContext)_localctx).exp1.e;
						          		Expression exp2 = ((ExpContext)_localctx).ter.e;
						          		
						          		((ExpContext)_localctx).e =  new BinaryExpression(Operator.MINUS, exp1, exp2);
						          	
						}
						break;
					}
					} 
				}
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class TerContext extends ParserRuleContext {
		public Expression e;
		public Token var1;
		public Token var2;
		public Token ID;
		public Token INT;
		public Token DOUBLE;
		public ExpContext exp;
		public TerminalNode MUL() { return getToken(PreconditionParser.MUL, 0); }
		public List<TerminalNode> ID() { return getTokens(PreconditionParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PreconditionParser.ID, i);
		}
		public TerminalNode DIV() { return getToken(PreconditionParser.DIV, 0); }
		public TerminalNode INT() { return getToken(PreconditionParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(PreconditionParser.DOUBLE, 0); }
		public TerminalNode LB() { return getToken(PreconditionParser.LB, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RB() { return getToken(PreconditionParser.RB, 0); }
		public TerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).enterTer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PreconditionListener ) ((PreconditionListener)listener).exitTer(this);
		}
	}

	public final TerContext ter() throws RecognitionException {
		TerContext _localctx = new TerContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ter);
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				((TerContext)_localctx).var1 = match(ID);
				setState(218);
				match(MUL);
				setState(219);
				((TerContext)_localctx).var2 = match(ID);

						Expression exp1 = new VariableExpression(new Variable((((TerContext)_localctx).var1!=null?((TerContext)_localctx).var1.getText():null), ""));
						Expression exp2 = new VariableExpression(new Variable((((TerContext)_localctx).var2!=null?((TerContext)_localctx).var2.getText():null), ""));
						
						((TerContext)_localctx).e =  new BinaryExpression(Operator.MUL, exp1, exp2);
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				((TerContext)_localctx).var1 = match(ID);
				setState(222);
				match(DIV);
				setState(223);
				((TerContext)_localctx).var2 = match(ID);

						Expression exp1 = new VariableExpression(new Variable((((TerContext)_localctx).var1!=null?((TerContext)_localctx).var1.getText():null), ""));
						Expression exp2 = new VariableExpression(new Variable((((TerContext)_localctx).var2!=null?((TerContext)_localctx).var2.getText():null), ""));
					
						((TerContext)_localctx).e =  new BinaryExpression(Operator.DIV, exp1, exp2);
					
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				((TerContext)_localctx).ID = match(ID);

						((TerContext)_localctx).e =  new VariableExpression(new Variable((((TerContext)_localctx).ID!=null?((TerContext)_localctx).ID.getText():null), ""));
					
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(227);
				((TerContext)_localctx).INT = match(INT);

						((TerContext)_localctx).e =  new LiteralExpression((((TerContext)_localctx).INT!=null?((TerContext)_localctx).INT.getText():null));
					
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(229);
				((TerContext)_localctx).DOUBLE = match(DOUBLE);

						((TerContext)_localctx).e =  new LiteralExpression((((TerContext)_localctx).DOUBLE!=null?((TerContext)_localctx).DOUBLE.getText():null));
					
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(231);
				match(LB);
				setState(232);
				((TerContext)_localctx).exp = exp(0);
				setState(233);
				match(RB);

						((TerContext)_localctx).e =  ((TerContext)_localctx).exp.e;
					
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u00f1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\62\n\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3=\n\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5M\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7]\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\bg\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\to\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\177\n\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008f\n\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a0\n\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u00c7\n\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00d7\n\24\f\24\16\24\u00da"+
		"\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00ef\n\25\3\25\2\3&\26\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(\2\2\2\u00f5\2\61\3\2\2\2\4<\3\2\2"+
		"\2\6>\3\2\2\2\bL\3\2\2\2\nN\3\2\2\2\f\\\3\2\2\2\16f\3\2\2\2\20n\3\2\2"+
		"\2\22~\3\2\2\2\24\u0080\3\2\2\2\26\u008e\3\2\2\2\30\u009f\3\2\2\2\32\u00a1"+
		"\3\2\2\2\34\u00a6\3\2\2\2\36\u00ab\3\2\2\2 \u00b0\3\2\2\2\"\u00b5\3\2"+
		"\2\2$\u00c6\3\2\2\2&\u00c8\3\2\2\2(\u00ee\3\2\2\2*+\5\6\4\2+,\b\2\1\2"+
		",\62\3\2\2\2-.\5\6\4\2./\5\4\3\2/\60\b\2\1\2\60\62\3\2\2\2\61*\3\2\2\2"+
		"\61-\3\2\2\2\62\3\3\2\2\2\63\64\7\23\2\2\64\65\5\6\4\2\65\66\b\3\1\2\66"+
		"=\3\2\2\2\678\7\23\2\289\5\6\4\29:\5\4\3\2:;\b\3\1\2;=\3\2\2\2<\63\3\2"+
		"\2\2<\67\3\2\2\2=\5\3\2\2\2>?\7\3\2\2?@\7\30\2\2@A\7\5\2\2AB\5\f\7\2B"+
		"C\b\4\1\2C\7\3\2\2\2DE\5\n\6\2EF\b\5\1\2FM\3\2\2\2GH\5\n\6\2HI\7\22\2"+
		"\2IJ\5\b\5\2JK\b\5\1\2KM\3\2\2\2LD\3\2\2\2LG\3\2\2\2M\t\3\2\2\2NO\7\30"+
		"\2\2OP\b\6\1\2P\13\3\2\2\2QR\5\16\b\2RS\b\7\1\2S]\3\2\2\2TU\5\26\f\2U"+
		"V\b\7\1\2V]\3\2\2\2WX\5\16\b\2XY\7\25\2\2YZ\5\26\f\2Z[\b\7\1\2[]\3\2\2"+
		"\2\\Q\3\2\2\2\\T\3\2\2\2\\W\3\2\2\2]\r\3\2\2\2^_\5\20\t\2_`\b\b\1\2`g"+
		"\3\2\2\2ab\5\20\t\2bc\7\27\2\2cd\5\16\b\2de\b\b\1\2eg\3\2\2\2f^\3\2\2"+
		"\2fa\3\2\2\2g\17\3\2\2\2hi\5\22\n\2ij\b\t\1\2jo\3\2\2\2kl\5\24\13\2lm"+
		"\b\t\1\2mo\3\2\2\2nh\3\2\2\2nk\3\2\2\2o\21\3\2\2\2pq\7\30\2\2qr\7\26\2"+
		"\2rs\7\30\2\2st\7\13\2\2tu\7\t\2\2u\177\b\n\1\2vw\7\30\2\2wx\7\26\2\2"+
		"xy\7\30\2\2yz\7\13\2\2z{\5\b\5\2{|\7\t\2\2|}\b\n\1\2}\177\3\2\2\2~p\3"+
		"\2\2\2~v\3\2\2\2\177\23\3\2\2\2\u0080\u0081\7\30\2\2\u0081\u0082\7\20"+
		"\2\2\u0082\u0083\5\b\5\2\u0083\u0084\7\21\2\2\u0084\u0085\b\13\1\2\u0085"+
		"\25\3\2\2\2\u0086\u0087\5\30\r\2\u0087\u0088\b\f\1\2\u0088\u008f\3\2\2"+
		"\2\u0089\u008a\5\30\r\2\u008a\u008b\7\25\2\2\u008b\u008c\5\26\f\2\u008c"+
		"\u008d\b\f\1\2\u008d\u008f\3\2\2\2\u008e\u0086\3\2\2\2\u008e\u0089\3\2"+
		"\2\2\u008f\27\3\2\2\2\u0090\u0091\5\32\16\2\u0091\u0092\b\r\1\2\u0092"+
		"\u00a0\3\2\2\2\u0093\u0094\5\34\17\2\u0094\u0095\b\r\1\2\u0095\u00a0\3"+
		"\2\2\2\u0096\u0097\5\36\20\2\u0097\u0098\b\r\1\2\u0098\u00a0\3\2\2\2\u0099"+
		"\u009a\5 \21\2\u009a\u009b\b\r\1\2\u009b\u00a0\3\2\2\2\u009c\u009d\5\""+
		"\22\2\u009d\u009e\b\r\1\2\u009e\u00a0\3\2\2\2\u009f\u0090\3\2\2\2\u009f"+
		"\u0093\3\2\2\2\u009f\u0096\3\2\2\2\u009f\u0099\3\2\2\2\u009f\u009c\3\2"+
		"\2\2\u00a0\31\3\2\2\2\u00a1\u00a2\7\30\2\2\u00a2\u00a3\7\6\2\2\u00a3\u00a4"+
		"\7\4\2\2\u00a4\u00a5\b\16\1\2\u00a5\33\3\2\2\2\u00a6\u00a7\7\30\2\2\u00a7"+
		"\u00a8\7\7\2\2\u00a8\u00a9\7\4\2\2\u00a9\u00aa\b\17\1\2\u00aa\35\3\2\2"+
		"\2\u00ab\u00ac\7\30\2\2\u00ac\u00ad\7\6\2\2\u00ad\u00ae\7\30\2\2\u00ae"+
		"\u00af\b\20\1\2\u00af\37\3\2\2\2\u00b0\u00b1\7\30\2\2\u00b1\u00b2\7\7"+
		"\2\2\u00b2\u00b3\7\30\2\2\u00b3\u00b4\b\21\1\2\u00b4!\3\2\2\2\u00b5\u00b6"+
		"\5&\24\2\u00b6\u00b7\5$\23\2\u00b7\u00b8\5&\24\2\u00b8\u00b9\b\22\1\2"+
		"\u00b9#\3\2\2\2\u00ba\u00bb\7\6\2\2\u00bb\u00c7\b\23\1\2\u00bc\u00bd\7"+
		"\7\2\2\u00bd\u00c7\b\23\1\2\u00be\u00bf\7\b\2\2\u00bf\u00c7\b\23\1\2\u00c0"+
		"\u00c1\7\t\2\2\u00c1\u00c7\b\23\1\2\u00c2\u00c3\7\n\2\2\u00c3\u00c7\b"+
		"\23\1\2\u00c4\u00c5\7\13\2\2\u00c5\u00c7\b\23\1\2\u00c6\u00ba\3\2\2\2"+
		"\u00c6\u00bc\3\2\2\2\u00c6\u00be\3\2\2\2\u00c6\u00c0\3\2\2\2\u00c6\u00c2"+
		"\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7%\3\2\2\2\u00c8\u00c9\b\24\1\2\u00c9"+
		"\u00ca\5(\25\2\u00ca\u00cb\b\24\1\2\u00cb\u00d8\3\2\2\2\u00cc\u00cd\f"+
		"\5\2\2\u00cd\u00ce\7\f\2\2\u00ce\u00cf\5(\25\2\u00cf\u00d0\b\24\1\2\u00d0"+
		"\u00d7\3\2\2\2\u00d1\u00d2\f\4\2\2\u00d2\u00d3\7\r\2\2\u00d3\u00d4\5("+
		"\25\2\u00d4\u00d5\b\24\1\2\u00d5\u00d7\3\2\2\2\u00d6\u00cc\3\2\2\2\u00d6"+
		"\u00d1\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\'\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\7\30\2\2\u00dc\u00dd"+
		"\7\16\2\2\u00dd\u00de\7\30\2\2\u00de\u00ef\b\25\1\2\u00df\u00e0\7\30\2"+
		"\2\u00e0\u00e1\7\17\2\2\u00e1\u00e2\7\30\2\2\u00e2\u00ef\b\25\1\2\u00e3"+
		"\u00e4\7\30\2\2\u00e4\u00ef\b\25\1\2\u00e5\u00e6\7\31\2\2\u00e6\u00ef"+
		"\b\25\1\2\u00e7\u00e8\7\32\2\2\u00e8\u00ef\b\25\1\2\u00e9\u00ea\7\20\2"+
		"\2\u00ea\u00eb\5&\24\2\u00eb\u00ec\7\21\2\2\u00ec\u00ed\b\25\1\2\u00ed"+
		"\u00ef\3\2\2\2\u00ee\u00db\3\2\2\2\u00ee\u00df\3\2\2\2\u00ee\u00e3\3\2"+
		"\2\2\u00ee\u00e5\3\2\2\2\u00ee\u00e7\3\2\2\2\u00ee\u00e9\3\2\2\2\u00ef"+
		")\3\2\2\2\17\61<L\\fn~\u008e\u009f\u00c6\u00d6\u00d8\u00ee";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}