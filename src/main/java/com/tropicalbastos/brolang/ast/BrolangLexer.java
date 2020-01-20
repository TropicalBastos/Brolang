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
		INT=9, STRING=10, FLOAT=11, IF=12, NOT_EQUALS=13, EQUALS=14, AS=15, IS=16, 
		AND=17, OR=18, ELSE=19, ID=20, NEXT_STATEMENT=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "LETTER", "DIGIT", "BLOCK_OPEN", "BLOCK_CLOSE", 
		"SAY", "SET", "TO", "INT", "STRING", "FLOAT", "IF", "NOT_EQUALS", "EQUALS", 
		"AS", "IS", "AND", "OR", "ELSE", "ID", "NEXT_STATEMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'brint'", "'bring'", "'broat'", "'{'", "'}'", "'bray'", "'set'", 
		"'to'", null, null, null, "'brif'", "'broesn't brequal'", "'brequals'", 
		"'bras'", "'bris'", "'brand'", "'bror'", "'brelse'", null, "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "BLOCK_OPEN", "BLOCK_CLOSE", "SAY", "SET", "TO", 
		"INT", "STRING", "FLOAT", "IF", "NOT_EQUALS", "EQUALS", "AS", "IS", "AND", 
		"OR", "ELSE", "ID", "NEXT_STATEMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u00c6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\f\6\f[\n\f\r\f\16\f\\\3\f\3\f\6\fa\n\f\r\f\16"+
		"\fb\5\fe\n\f\3\r\3\r\7\ri\n\r\f\r\16\rl\13\r\3\r\3\r\3\16\6\16q\n\16\r"+
		"\16\16\16r\3\16\3\16\6\16w\n\16\r\16\16\16x\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\6\27\u00b7"+
		"\n\27\r\27\16\27\u00b8\3\27\7\27\u00bc\n\27\f\27\16\27\u00bf\13\27\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\2\2\32\3\3\5\4\7\5\t\2\13\2\r\6\17\7\21\b\23"+
		"\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61"+
		"\30\3\2\b\4\2C\\c|\3\2\62;\4\2\f\f$$\5\2C\\aac|\6\2\62;C\\aac|\5\2\13"+
		"\13\17\17\"\"\2\u00cb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\3\63\3\2\2\2\59\3\2\2\2\7?\3\2\2\2\tE\3\2\2\2\13G\3\2\2\2"+
		"\rI\3\2\2\2\17K\3\2\2\2\21M\3\2\2\2\23R\3\2\2\2\25V\3\2\2\2\27Z\3\2\2"+
		"\2\31f\3\2\2\2\33p\3\2\2\2\35z\3\2\2\2\37\177\3\2\2\2!\u0090\3\2\2\2#"+
		"\u0099\3\2\2\2%\u009e\3\2\2\2\'\u00a3\3\2\2\2)\u00a9\3\2\2\2+\u00ae\3"+
		"\2\2\2-\u00b6\3\2\2\2/\u00c0\3\2\2\2\61\u00c2\3\2\2\2\63\64\7d\2\2\64"+
		"\65\7t\2\2\65\66\7k\2\2\66\67\7p\2\2\678\7v\2\28\4\3\2\2\29:\7d\2\2:;"+
		"\7t\2\2;<\7k\2\2<=\7p\2\2=>\7i\2\2>\6\3\2\2\2?@\7d\2\2@A\7t\2\2AB\7q\2"+
		"\2BC\7c\2\2CD\7v\2\2D\b\3\2\2\2EF\t\2\2\2F\n\3\2\2\2GH\t\3\2\2H\f\3\2"+
		"\2\2IJ\7}\2\2J\16\3\2\2\2KL\7\177\2\2L\20\3\2\2\2MN\7d\2\2NO\7t\2\2OP"+
		"\7c\2\2PQ\7{\2\2Q\22\3\2\2\2RS\7u\2\2ST\7g\2\2TU\7v\2\2U\24\3\2\2\2VW"+
		"\7v\2\2WX\7q\2\2X\26\3\2\2\2Y[\5\13\6\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2"+
		"\2\\]\3\2\2\2]d\3\2\2\2^`\7\60\2\2_a\5\13\6\2`_\3\2\2\2ab\3\2\2\2b`\3"+
		"\2\2\2bc\3\2\2\2ce\3\2\2\2d^\3\2\2\2de\3\2\2\2e\30\3\2\2\2fj\7$\2\2gi"+
		"\n\4\2\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2m"+
		"n\7$\2\2n\32\3\2\2\2oq\5\13\6\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2"+
		"\2st\3\2\2\2tv\7\60\2\2uw\5\13\6\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2"+
		"\2\2y\34\3\2\2\2z{\7d\2\2{|\7t\2\2|}\7k\2\2}~\7h\2\2~\36\3\2\2\2\177\u0080"+
		"\7d\2\2\u0080\u0081\7t\2\2\u0081\u0082\7q\2\2\u0082\u0083\7g\2\2\u0083"+
		"\u0084\7u\2\2\u0084\u0085\7p\2\2\u0085\u0086\7)\2\2\u0086\u0087\7v\2\2"+
		"\u0087\u0088\7\"\2\2\u0088\u0089\7d\2\2\u0089\u008a\7t\2\2\u008a\u008b"+
		"\7g\2\2\u008b\u008c\7s\2\2\u008c\u008d\7w\2\2\u008d\u008e\7c\2\2\u008e"+
		"\u008f\7n\2\2\u008f \3\2\2\2\u0090\u0091\7d\2\2\u0091\u0092\7t\2\2\u0092"+
		"\u0093\7g\2\2\u0093\u0094\7s\2\2\u0094\u0095\7w\2\2\u0095\u0096\7c\2\2"+
		"\u0096\u0097\7n\2\2\u0097\u0098\7u\2\2\u0098\"\3\2\2\2\u0099\u009a\7d"+
		"\2\2\u009a\u009b\7t\2\2\u009b\u009c\7c\2\2\u009c\u009d\7u\2\2\u009d$\3"+
		"\2\2\2\u009e\u009f\7d\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7k\2\2\u00a1"+
		"\u00a2\7u\2\2\u00a2&\3\2\2\2\u00a3\u00a4\7d\2\2\u00a4\u00a5\7t\2\2\u00a5"+
		"\u00a6\7c\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8\7f\2\2\u00a8(\3\2\2\2\u00a9"+
		"\u00aa\7d\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad\7t\2\2"+
		"\u00ad*\3\2\2\2\u00ae\u00af\7d\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7g\2"+
		"\2\u00b1\u00b2\7n\2\2\u00b2\u00b3\7u\2\2\u00b3\u00b4\7g\2\2\u00b4,\3\2"+
		"\2\2\u00b5\u00b7\t\5\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bd\3\2\2\2\u00ba\u00bc\t\6"+
		"\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be.\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7\f\2\2"+
		"\u00c1\60\3\2\2\2\u00c2\u00c3\t\7\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5"+
		"\b\31\2\2\u00c5\62\3\2\2\2\13\2\\bdjrx\u00b8\u00bd\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}