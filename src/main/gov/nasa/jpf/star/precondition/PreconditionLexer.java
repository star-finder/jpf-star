// Generated from Precondition.g4 by ANTLR 4.7

package gov.nasa.jpf.star.precondition;

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
public class PreconditionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRE=1, NULL=2, EQEQ=3, EQ=4, NE=5, LB=6, RB=7, CM=8, SM=9, OR=10, AND=11, 
		PT=12, STAR=13, ID=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PRE", "NULL", "EQEQ", "EQ", "NE", "LB", "RB", "CM", "SM", "OR", "AND", 
		"PT", "STAR", "ID", "WS"
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


	public PreconditionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Precondition.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21R\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\7\17"+
		"G\n\17\f\17\16\17J\13\17\3\20\6\20M\n\20\r\20\16\20N\3\20\3\20\2\2\21"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21\3\2\5\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2S\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5%\3\2\2\2\7*\3\2"+
		"\2\2\t-\3\2\2\2\13/\3\2\2\2\r\62\3\2\2\2\17\64\3\2\2\2\21\66\3\2\2\2\23"+
		"8\3\2\2\2\25:\3\2\2\2\27=\3\2\2\2\31?\3\2\2\2\33B\3\2\2\2\35D\3\2\2\2"+
		"\37L\3\2\2\2!\"\7r\2\2\"#\7t\2\2#$\7g\2\2$\4\3\2\2\2%&\7p\2\2&\'\7w\2"+
		"\2\'(\7n\2\2()\7n\2\2)\6\3\2\2\2*+\7?\2\2+,\7?\2\2,\b\3\2\2\2-.\7?\2\2"+
		".\n\3\2\2\2/\60\7#\2\2\60\61\7?\2\2\61\f\3\2\2\2\62\63\7*\2\2\63\16\3"+
		"\2\2\2\64\65\7+\2\2\65\20\3\2\2\2\66\67\7.\2\2\67\22\3\2\2\289\7=\2\2"+
		"9\24\3\2\2\2:;\7~\2\2;<\7~\2\2<\26\3\2\2\2=>\7(\2\2>\30\3\2\2\2?@\7/\2"+
		"\2@A\7@\2\2A\32\3\2\2\2BC\7,\2\2C\34\3\2\2\2DH\t\2\2\2EG\t\3\2\2FE\3\2"+
		"\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\36\3\2\2\2JH\3\2\2\2KM\t\4\2\2LK\3"+
		"\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\b\20\2\2Q \3\2\2\2\5"+
		"\2HN\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}