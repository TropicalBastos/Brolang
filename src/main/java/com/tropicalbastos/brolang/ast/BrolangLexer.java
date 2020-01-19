// Generated from Brolang.g4 by ANTLR 4.7.1
package com.tropicalbastos.brolang.ast;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BrolangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, BLOCK_OPEN=4, BLOCK_CLOSE=5, SAY=6, SET=7, TO=8, 
		INT=9, STRING=10, FLOAT=11, IF=12, EQUALS=13, AS=14, IS=15, ELSE=16, ID=17, 
		NEXT_STATEMENT=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "LETTER", "DIGIT", "BLOCK_OPEN", "BLOCK_CLOSE", 
		"SAY", "SET", "TO", "INT", "STRING", "FLOAT", "IF", "EQUALS", "AS", "IS", 
		"ELSE", "ID", "NEXT_STATEMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'brint'", "'bring'", "'broat'", "'{'", "'}'", "'bray'", "'set'", 
		"'to'", null, null, null, "'brif'", "'=='", "'bras'", "'bris'", "'brelse'", 
		null, "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "BLOCK_OPEN", "BLOCK_CLOSE", "SAY", "SET", "TO", 
		"INT", "STRING", "FLOAT", "IF", "EQUALS", "AS", "IS", "ELSE", "ID", "NEXT_STATEMENT", 
		"WS"
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


	public BrolangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Brolang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u009e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\6\f"+
		"U\n\f\r\f\16\fV\3\f\3\f\6\f[\n\f\r\f\16\f\\\5\f_\n\f\3\r\3\r\7\rc\n\r"+
		"\f\r\16\rf\13\r\3\r\3\r\3\16\6\16k\n\16\r\16\16\16l\3\16\3\16\6\16q\n"+
		"\16\r\16\16\16r\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\6\24\u008f\n\24\r\24\16\24\u0090\3\24\7\24\u0094\n\24\f\24\16\24"+
		"\u0097\13\24\3\25\3\25\3\26\3\26\3\26\3\26\2\2\27\3\3\5\4\7\5\t\2\13\2"+
		"\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23"+
		")\24+\25\3\2\b\4\2C\\c|\3\2\62;\4\2\f\f$$\5\2C\\aac|\6\2\62;C\\aac|\5"+
		"\2\13\13\17\17\"\"\2\u00a3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5\63\3\2"+
		"\2\2\79\3\2\2\2\t?\3\2\2\2\13A\3\2\2\2\rC\3\2\2\2\17E\3\2\2\2\21G\3\2"+
		"\2\2\23L\3\2\2\2\25P\3\2\2\2\27T\3\2\2\2\31`\3\2\2\2\33j\3\2\2\2\35t\3"+
		"\2\2\2\37y\3\2\2\2!|\3\2\2\2#\u0081\3\2\2\2%\u0086\3\2\2\2\'\u008e\3\2"+
		"\2\2)\u0098\3\2\2\2+\u009a\3\2\2\2-.\7d\2\2./\7t\2\2/\60\7k\2\2\60\61"+
		"\7p\2\2\61\62\7v\2\2\62\4\3\2\2\2\63\64\7d\2\2\64\65\7t\2\2\65\66\7k\2"+
		"\2\66\67\7p\2\2\678\7i\2\28\6\3\2\2\29:\7d\2\2:;\7t\2\2;<\7q\2\2<=\7c"+
		"\2\2=>\7v\2\2>\b\3\2\2\2?@\t\2\2\2@\n\3\2\2\2AB\t\3\2\2B\f\3\2\2\2CD\7"+
		"}\2\2D\16\3\2\2\2EF\7\177\2\2F\20\3\2\2\2GH\7d\2\2HI\7t\2\2IJ\7c\2\2J"+
		"K\7{\2\2K\22\3\2\2\2LM\7u\2\2MN\7g\2\2NO\7v\2\2O\24\3\2\2\2PQ\7v\2\2Q"+
		"R\7q\2\2R\26\3\2\2\2SU\5\13\6\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2"+
		"\2W^\3\2\2\2XZ\7\60\2\2Y[\5\13\6\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]"+
		"\3\2\2\2]_\3\2\2\2^X\3\2\2\2^_\3\2\2\2_\30\3\2\2\2`d\7$\2\2ac\n\4\2\2"+
		"ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\7$\2\2"+
		"h\32\3\2\2\2ik\5\13\6\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mn\3\2"+
		"\2\2np\7\60\2\2oq\5\13\6\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\34"+
		"\3\2\2\2tu\7d\2\2uv\7t\2\2vw\7k\2\2wx\7h\2\2x\36\3\2\2\2yz\7?\2\2z{\7"+
		"?\2\2{ \3\2\2\2|}\7d\2\2}~\7t\2\2~\177\7c\2\2\177\u0080\7u\2\2\u0080\""+
		"\3\2\2\2\u0081\u0082\7d\2\2\u0082\u0083\7t\2\2\u0083\u0084\7k\2\2\u0084"+
		"\u0085\7u\2\2\u0085$\3\2\2\2\u0086\u0087\7d\2\2\u0087\u0088\7t\2\2\u0088"+
		"\u0089\7g\2\2\u0089\u008a\7n\2\2\u008a\u008b\7u\2\2\u008b\u008c\7g\2\2"+
		"\u008c&\3\2\2\2\u008d\u008f\t\5\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3"+
		"\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0095\3\2\2\2\u0092"+
		"\u0094\t\6\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096(\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099"+
		"\7\f\2\2\u0099*\3\2\2\2\u009a\u009b\t\7\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\b\26\2\2\u009d,\3\2\2\2\13\2V\\^dlr\u0090\u0095\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}