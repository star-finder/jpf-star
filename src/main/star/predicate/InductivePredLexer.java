// Generated from InductivePred.g4 by ANTLR 4.7

package star.predicate;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class InductivePredLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRED=1, NULL=2, EQEQ=3, EQ=4, NE=5, GE=6, GT=7, LE=8, LT=9, PLUS=10, MINUS=11, 
		MUL=12, DIV=13, LB=14, RB=15, CM=16, SM=17, OR=18, AND=19, PT=20, STAR=21, 
		ID=22, INT=23, DOUBLE=24, WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PRED", "NULL", "EQEQ", "EQ", "NE", "GE", "GT", "LE", "LT", "PLUS", "MINUS", 
		"MUL", "DIV", "LB", "RB", "CM", "SM", "OR", "AND", "PT", "STAR", "ID", 
		"INT", "DOUBLE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'pred'", "'null'", "'=='", "'='", "'!='", "'>='", "'>'", "'<='", 
		"'<'", "'+'", "'-'", "'**'", "'/'", "'('", "')'", "','", "';'", "'||'", 
		"'&'", "'::'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PRED", "NULL", "EQEQ", "EQ", "NE", "GE", "GT", "LE", "LT", "PLUS", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u0088\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\7\27o\n\27"+
		"\f\27\16\27r\13\27\3\30\3\30\3\30\7\30w\n\30\f\30\16\30z\13\30\5\30|\n"+
		"\30\3\31\3\31\3\31\3\31\3\32\6\32\u0083\n\32\r\32\16\32\u0084\3\32\3\32"+
		"\2\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\3\2\7\5\2C\\"+
		"aac|\6\2\62;C\\aac|\3\2\63;\3\2\62;\5\2\13\f\17\17\"\"\2\u008b\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5:\3\2\2\2\7?\3\2\2\2\tB\3\2\2\2\13D"+
		"\3\2\2\2\rG\3\2\2\2\17J\3\2\2\2\21L\3\2\2\2\23O\3\2\2\2\25Q\3\2\2\2\27"+
		"S\3\2\2\2\31U\3\2\2\2\33X\3\2\2\2\35Z\3\2\2\2\37\\\3\2\2\2!^\3\2\2\2#"+
		"`\3\2\2\2%b\3\2\2\2\'e\3\2\2\2)g\3\2\2\2+j\3\2\2\2-l\3\2\2\2/{\3\2\2\2"+
		"\61}\3\2\2\2\63\u0082\3\2\2\2\65\66\7r\2\2\66\67\7t\2\2\678\7g\2\289\7"+
		"f\2\29\4\3\2\2\2:;\7p\2\2;<\7w\2\2<=\7n\2\2=>\7n\2\2>\6\3\2\2\2?@\7?\2"+
		"\2@A\7?\2\2A\b\3\2\2\2BC\7?\2\2C\n\3\2\2\2DE\7#\2\2EF\7?\2\2F\f\3\2\2"+
		"\2GH\7@\2\2HI\7?\2\2I\16\3\2\2\2JK\7@\2\2K\20\3\2\2\2LM\7>\2\2MN\7?\2"+
		"\2N\22\3\2\2\2OP\7>\2\2P\24\3\2\2\2QR\7-\2\2R\26\3\2\2\2ST\7/\2\2T\30"+
		"\3\2\2\2UV\7,\2\2VW\7,\2\2W\32\3\2\2\2XY\7\61\2\2Y\34\3\2\2\2Z[\7*\2\2"+
		"[\36\3\2\2\2\\]\7+\2\2] \3\2\2\2^_\7.\2\2_\"\3\2\2\2`a\7=\2\2a$\3\2\2"+
		"\2bc\7~\2\2cd\7~\2\2d&\3\2\2\2ef\7(\2\2f(\3\2\2\2gh\7<\2\2hi\7<\2\2i*"+
		"\3\2\2\2jk\7,\2\2k,\3\2\2\2lp\t\2\2\2mo\t\3\2\2nm\3\2\2\2or\3\2\2\2pn"+
		"\3\2\2\2pq\3\2\2\2q.\3\2\2\2rp\3\2\2\2s|\7\62\2\2tx\t\4\2\2uw\t\5\2\2"+
		"vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y|\3\2\2\2zx\3\2\2\2{s\3\2\2\2"+
		"{t\3\2\2\2|\60\3\2\2\2}~\5/\30\2~\177\7\60\2\2\177\u0080\5/\30\2\u0080"+
		"\62\3\2\2\2\u0081\u0083\t\6\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2"+
		"\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087"+
		"\b\32\2\2\u0087\64\3\2\2\2\7\2px{\u0084\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}