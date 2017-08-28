// Generated from Precondition.g4 by ANTLR 4.7

package star.precondition;

import gov.nasa.jpf.symbc.numeric.Comparator;
import gov.nasa.jpf.symbc.numeric.Operator;
import star.formula.*;
import star.formula.expression.*;
import star.formula.heap.*;
import star.formula.pure.*;

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
		PRE=1, NULL=2, EQEQ=3, EQ=4, NE=5, GE=6, GT=7, LE=8, LT=9, PLUS=10, MINUS=11, 
		MUL=12, DIV=13, LB=14, RB=15, CM=16, SM=17, OR=18, AND=19, PT=20, STAR=21, 
		ID=22, INT=23, DOUBLE=24, WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PRE", "NULL", "EQEQ", "EQ", "NE", "GE", "GT", "LE", "LT", "PLUS", "MINUS", 
		"MUL", "DIV", "LB", "RB", "CM", "SM", "OR", "AND", "PT", "STAR", "ID", 
		"INT", "DOUBLE", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u0087\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\7\27n\n\27\f\27"+
		"\16\27q\13\27\3\30\3\30\3\30\7\30v\n\30\f\30\16\30y\13\30\5\30{\n\30\3"+
		"\31\3\31\3\31\3\31\3\32\6\32\u0082\n\32\r\32\16\32\u0083\3\32\3\32\2\2"+
		"\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\3\2\7\5\2C\\aa"+
		"c|\6\2\62;C\\aac|\3\2\63;\3\2\62;\5\2\13\f\17\17\"\"\2\u008a\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\3\65\3\2\2\2\59\3\2\2\2\7>\3\2\2\2\tA\3\2\2\2\13C\3"+
		"\2\2\2\rF\3\2\2\2\17I\3\2\2\2\21K\3\2\2\2\23N\3\2\2\2\25P\3\2\2\2\27R"+
		"\3\2\2\2\31T\3\2\2\2\33W\3\2\2\2\35Y\3\2\2\2\37[\3\2\2\2!]\3\2\2\2#_\3"+
		"\2\2\2%a\3\2\2\2\'d\3\2\2\2)f\3\2\2\2+i\3\2\2\2-k\3\2\2\2/z\3\2\2\2\61"+
		"|\3\2\2\2\63\u0081\3\2\2\2\65\66\7r\2\2\66\67\7t\2\2\678\7g\2\28\4\3\2"+
		"\2\29:\7p\2\2:;\7w\2\2;<\7n\2\2<=\7n\2\2=\6\3\2\2\2>?\7?\2\2?@\7?\2\2"+
		"@\b\3\2\2\2AB\7?\2\2B\n\3\2\2\2CD\7#\2\2DE\7?\2\2E\f\3\2\2\2FG\7@\2\2"+
		"GH\7?\2\2H\16\3\2\2\2IJ\7@\2\2J\20\3\2\2\2KL\7>\2\2LM\7?\2\2M\22\3\2\2"+
		"\2NO\7>\2\2O\24\3\2\2\2PQ\7-\2\2Q\26\3\2\2\2RS\7/\2\2S\30\3\2\2\2TU\7"+
		",\2\2UV\7,\2\2V\32\3\2\2\2WX\7\61\2\2X\34\3\2\2\2YZ\7*\2\2Z\36\3\2\2\2"+
		"[\\\7+\2\2\\ \3\2\2\2]^\7.\2\2^\"\3\2\2\2_`\7=\2\2`$\3\2\2\2ab\7~\2\2"+
		"bc\7~\2\2c&\3\2\2\2de\7(\2\2e(\3\2\2\2fg\7<\2\2gh\7<\2\2h*\3\2\2\2ij\7"+
		",\2\2j,\3\2\2\2ko\t\2\2\2ln\t\3\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3"+
		"\2\2\2p.\3\2\2\2qo\3\2\2\2r{\7\62\2\2sw\t\4\2\2tv\t\5\2\2ut\3\2\2\2vy"+
		"\3\2\2\2wu\3\2\2\2wx\3\2\2\2x{\3\2\2\2yw\3\2\2\2zr\3\2\2\2zs\3\2\2\2{"+
		"\60\3\2\2\2|}\5/\30\2}~\7\60\2\2~\177\5/\30\2\177\62\3\2\2\2\u0080\u0082"+
		"\t\6\2\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\b\32\2\2\u0086\64\3\2\2"+
		"\2\7\2owz\u0083\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}