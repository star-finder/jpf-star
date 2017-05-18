// Generated from InductivePred.g4 by ANTLR 4.7

package gov.nasa.jpf.star.inductive;

import gov.nasa.jpf.star.formula.*;
import gov.nasa.jpf.star.formula.heap.*;
import gov.nasa.jpf.star.formula.pure.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class InductivePredLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRED=1, NULL=2, EQEQ=3, EQ=4, NE=5, LB=6, RB=7, CM=8, SM=9, OR=10, AND=11, 
		PT=12, STAR=13, ID=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PRED", "NULL", "EQEQ", "EQ", "NE", "LB", "RB", "CM", "SM", "OR", "AND", 
		"PT", "STAR", "ID", "WS"
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


	public InductivePredLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "InductivePred.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21Q\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\6\17"+
		"G\n\17\r\17\16\17H\3\20\6\20L\n\20\r\20\16\20M\3\20\3\20\2\2\21\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"\3\2\4\4\2C\\c|\5\2\13\f\17\17\"\"\2R\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5&\3\2\2\2\7+\3\2\2\2\t.\3\2\2\2\13\60"+
		"\3\2\2\2\r\63\3\2\2\2\17\65\3\2\2\2\21\67\3\2\2\2\239\3\2\2\2\25;\3\2"+
		"\2\2\27>\3\2\2\2\31@\3\2\2\2\33C\3\2\2\2\35F\3\2\2\2\37K\3\2\2\2!\"\7"+
		"r\2\2\"#\7t\2\2#$\7g\2\2$%\7f\2\2%\4\3\2\2\2&\'\7p\2\2\'(\7w\2\2()\7n"+
		"\2\2)*\7n\2\2*\6\3\2\2\2+,\7?\2\2,-\7?\2\2-\b\3\2\2\2./\7?\2\2/\n\3\2"+
		"\2\2\60\61\7#\2\2\61\62\7?\2\2\62\f\3\2\2\2\63\64\7*\2\2\64\16\3\2\2\2"+
		"\65\66\7+\2\2\66\20\3\2\2\2\678\7.\2\28\22\3\2\2\29:\7=\2\2:\24\3\2\2"+
		"\2;<\7~\2\2<=\7~\2\2=\26\3\2\2\2>?\7(\2\2?\30\3\2\2\2@A\7/\2\2AB\7@\2"+
		"\2B\32\3\2\2\2CD\7,\2\2D\34\3\2\2\2EG\t\2\2\2FE\3\2\2\2GH\3\2\2\2HF\3"+
		"\2\2\2HI\3\2\2\2I\36\3\2\2\2JL\t\3\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2M"+
		"N\3\2\2\2NO\3\2\2\2OP\b\20\2\2P \3\2\2\2\5\2HM\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}