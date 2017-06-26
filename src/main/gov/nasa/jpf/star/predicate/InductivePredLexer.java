// Generated from InductivePred.g4 by ANTLR 4.7

package gov.nasa.jpf.star.predicate;

import gov.nasa.jpf.star.formula.*;
import gov.nasa.jpf.star.formula.heap.*;
import gov.nasa.jpf.star.formula.pure.*;
import gov.nasa.jpf.star.formula.expression.*;
import gov.nasa.jpf.symbc.numeric.Comparator;
import gov.nasa.jpf.symbc.numeric.Operator;

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
		PRED=1, NULL=2, EQEQ=3, EQ=4, NE=5, GE=6, GT=7, LE=8, LT=9, PLUS=10, MINUS=11, 
		MUL=12, DIV=13, LB=14, RB=15, CM=16, SM=17, OR=18, AND=19, PT=20, STAR=21, 
		ID=22, INT=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"PRED", "NULL", "EQEQ", "EQ", "NE", "GE", "GT", "LE", "LT", "PLUS", "MINUS", 
		"MUL", "DIV", "LB", "RB", "CM", "SM", "OR", "AND", "PT", "STAR", "ID", 
		"INT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'pred'", "'null'", "'=='", "'='", "'!='", "'>='", "'>'", "'<='", 
		"'<'", "'+'", "'-'", "'**'", "'/'", "'('", "')'", "','", "';'", "'||'", 
		"'&'", "'::'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "PRED", "NULL", "EQEQ", "EQ", "NE", "GE", "GT", "LE", "LT", "PLUS", 
		"MINUS", "MUL", "DIV", "LB", "RB", "CM", "SM", "OR", "AND", "PT", "STAR", 
		"ID", "INT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u0082\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\7\27m\n\27\f\27\16\27"+
		"p\13\27\3\30\3\30\3\30\7\30u\n\30\f\30\16\30x\13\30\5\30z\n\30\3\31\6"+
		"\31}\n\31\r\31\16\31~\3\31\3\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\3\2\7\5\2C\\aac|\6\2\62;C\\aac|\3\2\63;\3\2\62;\5\2\13\f\17"+
		"\17\"\"\2\u0085\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\58\3\2\2\2\7=\3\2\2\2\t@\3\2"+
		"\2\2\13B\3\2\2\2\rE\3\2\2\2\17H\3\2\2\2\21J\3\2\2\2\23M\3\2\2\2\25O\3"+
		"\2\2\2\27Q\3\2\2\2\31S\3\2\2\2\33V\3\2\2\2\35X\3\2\2\2\37Z\3\2\2\2!\\"+
		"\3\2\2\2#^\3\2\2\2%`\3\2\2\2\'c\3\2\2\2)e\3\2\2\2+h\3\2\2\2-j\3\2\2\2"+
		"/y\3\2\2\2\61|\3\2\2\2\63\64\7r\2\2\64\65\7t\2\2\65\66\7g\2\2\66\67\7"+
		"f\2\2\67\4\3\2\2\289\7p\2\29:\7w\2\2:;\7n\2\2;<\7n\2\2<\6\3\2\2\2=>\7"+
		"?\2\2>?\7?\2\2?\b\3\2\2\2@A\7?\2\2A\n\3\2\2\2BC\7#\2\2CD\7?\2\2D\f\3\2"+
		"\2\2EF\7@\2\2FG\7?\2\2G\16\3\2\2\2HI\7@\2\2I\20\3\2\2\2JK\7>\2\2KL\7?"+
		"\2\2L\22\3\2\2\2MN\7>\2\2N\24\3\2\2\2OP\7-\2\2P\26\3\2\2\2QR\7/\2\2R\30"+
		"\3\2\2\2ST\7,\2\2TU\7,\2\2U\32\3\2\2\2VW\7\61\2\2W\34\3\2\2\2XY\7*\2\2"+
		"Y\36\3\2\2\2Z[\7+\2\2[ \3\2\2\2\\]\7.\2\2]\"\3\2\2\2^_\7=\2\2_$\3\2\2"+
		"\2`a\7~\2\2ab\7~\2\2b&\3\2\2\2cd\7(\2\2d(\3\2\2\2ef\7<\2\2fg\7<\2\2g*"+
		"\3\2\2\2hi\7,\2\2i,\3\2\2\2jn\t\2\2\2km\t\3\2\2lk\3\2\2\2mp\3\2\2\2nl"+
		"\3\2\2\2no\3\2\2\2o.\3\2\2\2pn\3\2\2\2qz\7\62\2\2rv\t\4\2\2su\t\5\2\2"+
		"ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wz\3\2\2\2xv\3\2\2\2yq\3\2\2\2"+
		"yr\3\2\2\2z\60\3\2\2\2{}\t\6\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3"+
		"\2\2\2\177\u0080\3\2\2\2\u0080\u0081\b\31\2\2\u0081\62\3\2\2\2\7\2nvy"+
		"~\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}