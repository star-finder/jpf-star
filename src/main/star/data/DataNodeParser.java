// Generated from DataNode.g4 by ANTLR 4.7

package star.data;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import star.formula.*;

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DataNodeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DATA=1, LC=2, RC=3, SM=4, DOT=5, ID=6, WS=7;
	public static final int
		RULE_datas = 0, RULE_tail = 1, RULE_data = 2, RULE_fields = 3, RULE_field = 4;
	public static final String[] ruleNames = {
		"datas", "tail", "data", "fields", "field"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'data'", "'{'", "'}'", "';'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DATA", "LC", "RC", "SM", "DOT", "ID", "WS"
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
	public String getGrammarFileName() { return "DataNode.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DataNodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DatasContext extends ParserRuleContext {
		public DataNode[] dns;
		public DataContext data;
		public TailContext tail;
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public TailContext tail() {
			return getRuleContext(TailContext.class,0);
		}
		public DatasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataNodeListener ) ((DataNodeListener)listener).enterDatas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataNodeListener ) ((DataNodeListener)listener).exitDatas(this);
		}
	}

	public final DatasContext datas() throws RecognitionException {
		DatasContext _localctx = new DatasContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_datas);
		try {
			setState(17);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(10);
				((DatasContext)_localctx).data = data();

						((DatasContext)_localctx).dns =  new DataNode[1];
						_localctx.dns[0] = ((DatasContext)_localctx).data.dn;
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(13);
				((DatasContext)_localctx).data = data();
				setState(14);
				((DatasContext)_localctx).tail = tail();

						int length = ((DatasContext)_localctx).tail.dns.length + 1;
						((DatasContext)_localctx).dns =  new DataNode[length];
						
						for (int i = 0; i < length; i++) {
							if (i == 0) _localctx.dns[0] = ((DatasContext)_localctx).data.dn;
							else _localctx.dns[i] = ((DatasContext)_localctx).tail.dns[i - 1];
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
		public DataNode[] dns;
		public DataContext data;
		public TailContext tail;
		public TerminalNode SM() { return getToken(DataNodeParser.SM, 0); }
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
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
			if ( listener instanceof DataNodeListener ) ((DataNodeListener)listener).enterTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataNodeListener ) ((DataNodeListener)listener).exitTail(this);
		}
	}

	public final TailContext tail() throws RecognitionException {
		TailContext _localctx = new TailContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tail);
		try {
			setState(28);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				match(SM);
				setState(20);
				((TailContext)_localctx).data = data();

						((TailContext)_localctx).dns =  new DataNode[1];
						_localctx.dns[0] = ((TailContext)_localctx).data.dn;
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				match(SM);
				setState(24);
				((TailContext)_localctx).data = data();
				setState(25);
				((TailContext)_localctx).tail = tail();

						int length = ((TailContext)_localctx).tail.dns.length + 1;
						((TailContext)_localctx).dns =  new DataNode[length];
						
						for (int i = 0; i < length; i++) {
							if (i == 0) _localctx.dns[0] = ((TailContext)_localctx).data.dn;
							else _localctx.dns[i] = ((TailContext)_localctx).tail.dns[i - 1];
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

	public static class DataContext extends ParserRuleContext {
		public DataNode dn;
		public Token ID;
		public FieldsContext fields;
		public TerminalNode DATA() { return getToken(DataNodeParser.DATA, 0); }
		public TerminalNode ID() { return getToken(DataNodeParser.ID, 0); }
		public TerminalNode LC() { return getToken(DataNodeParser.LC, 0); }
		public TerminalNode RC() { return getToken(DataNodeParser.RC, 0); }
		public FieldsContext fields() {
			return getRuleContext(FieldsContext.class,0);
		}
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataNodeListener ) ((DataNodeListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataNodeListener ) ((DataNodeListener)listener).exitData(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_data);
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(DATA);
				setState(31);
				((DataContext)_localctx).ID = match(ID);
				setState(32);
				match(LC);
				setState(33);
				match(RC);

						Variable[] fs = new Variable[0];
						((DataContext)_localctx).dn =  new DataNode((((DataContext)_localctx).ID!=null?((DataContext)_localctx).ID.getText():null), fs);
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				match(DATA);
				setState(36);
				((DataContext)_localctx).ID = match(ID);
				setState(37);
				match(LC);
				setState(38);
				((DataContext)_localctx).fields = fields();
				setState(39);
				match(RC);

						Variable[] fs = ((DataContext)_localctx).fields.fs;
						((DataContext)_localctx).dn =  new DataNode((((DataContext)_localctx).ID!=null?((DataContext)_localctx).ID.getText():null), fs);
					
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

	public static class FieldsContext extends ParserRuleContext {
		public Variable[] fs;
		public FieldContext field;
		public FieldsContext fields;
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode SM() { return getToken(DataNodeParser.SM, 0); }
		public FieldsContext fields() {
			return getRuleContext(FieldsContext.class,0);
		}
		public FieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataNodeListener ) ((DataNodeListener)listener).enterFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataNodeListener ) ((DataNodeListener)listener).exitFields(this);
		}
	}

	public final FieldsContext fields() throws RecognitionException {
		FieldsContext _localctx = new FieldsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fields);
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				((FieldsContext)_localctx).field = field();

						((FieldsContext)_localctx).fs =  new Variable[1];
						_localctx.fs[0] = ((FieldsContext)_localctx).field.f;
					
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				((FieldsContext)_localctx).field = field();
				setState(48);
				match(SM);
				setState(49);
				((FieldsContext)_localctx).fields = fields();

						int length = ((FieldsContext)_localctx).fields.fs.length + 1;
						((FieldsContext)_localctx).fs =  new Variable[length];
						
						for (int i = 0; i < length; i++) {
							if (i == 0) _localctx.fs[i] = ((FieldsContext)_localctx).field.f;
							else _localctx.fs[i] = ((FieldsContext)_localctx).fields.fs[i - 1];
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

	public static class FieldContext extends ParserRuleContext {
		public Variable f;
		public Token type;
		public Token name;
		public List<TerminalNode> ID() { return getTokens(DataNodeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DataNodeParser.ID, i);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataNodeListener ) ((DataNodeListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataNodeListener ) ((DataNodeListener)listener).exitField(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			((FieldContext)_localctx).type = match(ID);
			setState(55);
			((FieldContext)_localctx).name = match(ID);

					((FieldContext)_localctx).f =  new Variable((((FieldContext)_localctx).name!=null?((FieldContext)_localctx).name.getText():null), (((FieldContext)_localctx).type!=null?((FieldContext)_localctx).type.getText():null));
				
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t=\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\24\n\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\37\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4-\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\67"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\2\2;\2\23\3\2\2\2\4\36\3\2"+
		"\2\2\6,\3\2\2\2\b\66\3\2\2\2\n8\3\2\2\2\f\r\5\6\4\2\r\16\b\2\1\2\16\24"+
		"\3\2\2\2\17\20\5\6\4\2\20\21\5\4\3\2\21\22\b\2\1\2\22\24\3\2\2\2\23\f"+
		"\3\2\2\2\23\17\3\2\2\2\24\3\3\2\2\2\25\26\7\6\2\2\26\27\5\6\4\2\27\30"+
		"\b\3\1\2\30\37\3\2\2\2\31\32\7\6\2\2\32\33\5\6\4\2\33\34\5\4\3\2\34\35"+
		"\b\3\1\2\35\37\3\2\2\2\36\25\3\2\2\2\36\31\3\2\2\2\37\5\3\2\2\2 !\7\3"+
		"\2\2!\"\7\b\2\2\"#\7\4\2\2#$\7\5\2\2$-\b\4\1\2%&\7\3\2\2&\'\7\b\2\2\'"+
		"(\7\4\2\2()\5\b\5\2)*\7\5\2\2*+\b\4\1\2+-\3\2\2\2, \3\2\2\2,%\3\2\2\2"+
		"-\7\3\2\2\2./\5\n\6\2/\60\b\5\1\2\60\67\3\2\2\2\61\62\5\n\6\2\62\63\7"+
		"\6\2\2\63\64\5\b\5\2\64\65\b\5\1\2\65\67\3\2\2\2\66.\3\2\2\2\66\61\3\2"+
		"\2\2\67\t\3\2\2\289\7\b\2\29:\7\b\2\2:;\b\6\1\2;\13\3\2\2\2\6\23\36,\66";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}