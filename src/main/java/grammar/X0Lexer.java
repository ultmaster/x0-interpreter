// Generated from /Users/Scott/IdeaProjects/x0/src/main/resources/X0.g4 by ANTLR 4.7
package grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class X0Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, COMMENT=15, INT=16, CHAR=17, 
		STR=18, ID_STRING=19, NUM=20, PLUS=21, MINUS=22, MUL=23, DIV=24, GT=25, 
		GEQ=26, LT=27, LEQ=28, EQ=29, NEQ=30, STRING=31, WS=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "COMMENT", "INT", "CHAR", 
		"STR", "ID_STRING", "NUM", "PLUS", "MINUS", "MUL", "DIV", "GT", "GEQ", 
		"LT", "LEQ", "EQ", "NEQ", "STRING", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main'", "'{'", "'}'", "';'", "'['", "']'", "'if'", "'('", "')'", 
		"'else'", "'while'", "'write'", "'read'", "'='", null, "'int'", "'char'", 
		"'str'", null, null, "'+'", "'-'", "'*'", "'/'", "'>'", "'>='", "'<'", 
		"'<='", "'=='", "'!='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "COMMENT", "INT", "CHAR", "STR", "ID_STRING", "NUM", 
		"PLUS", "MINUS", "MUL", "DIV", "GT", "GEQ", "LT", "LEQ", "EQ", "NEQ", 
		"STRING", "WS"
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


	public X0Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "X0.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u00bd\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\7\20v\n\20\f\20\16\20y\13\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\7\24\u008f\n\24\f\24\16\24\u0092\13\24\3\25\6\25\u0095\n\25\r\25\16\25"+
		"\u0096\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \7 \u00b3"+
		"\n \f \16 \u00b6\13 \3 \3 \3!\3!\3!\3!\4w\u00b4\2\"\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"\3\2\7\4\2C"+
		"\\c|\5\2\62;C\\c|\3\2\62;\6\2\f\f\17\17$$^^\5\2\13\f\17\17\"\"\2\u00c0"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\5H\3\2\2\2\7J\3\2\2"+
		"\2\tL\3\2\2\2\13N\3\2\2\2\rP\3\2\2\2\17R\3\2\2\2\21U\3\2\2\2\23W\3\2\2"+
		"\2\25Y\3\2\2\2\27^\3\2\2\2\31d\3\2\2\2\33j\3\2\2\2\35o\3\2\2\2\37q\3\2"+
		"\2\2!\177\3\2\2\2#\u0083\3\2\2\2%\u0088\3\2\2\2\'\u008c\3\2\2\2)\u0094"+
		"\3\2\2\2+\u0098\3\2\2\2-\u009a\3\2\2\2/\u009c\3\2\2\2\61\u009e\3\2\2\2"+
		"\63\u00a0\3\2\2\2\65\u00a2\3\2\2\2\67\u00a5\3\2\2\29\u00a7\3\2\2\2;\u00aa"+
		"\3\2\2\2=\u00ad\3\2\2\2?\u00b0\3\2\2\2A\u00b9\3\2\2\2CD\7o\2\2DE\7c\2"+
		"\2EF\7k\2\2FG\7p\2\2G\4\3\2\2\2HI\7}\2\2I\6\3\2\2\2JK\7\177\2\2K\b\3\2"+
		"\2\2LM\7=\2\2M\n\3\2\2\2NO\7]\2\2O\f\3\2\2\2PQ\7_\2\2Q\16\3\2\2\2RS\7"+
		"k\2\2ST\7h\2\2T\20\3\2\2\2UV\7*\2\2V\22\3\2\2\2WX\7+\2\2X\24\3\2\2\2Y"+
		"Z\7g\2\2Z[\7n\2\2[\\\7u\2\2\\]\7g\2\2]\26\3\2\2\2^_\7y\2\2_`\7j\2\2`a"+
		"\7k\2\2ab\7n\2\2bc\7g\2\2c\30\3\2\2\2de\7y\2\2ef\7t\2\2fg\7k\2\2gh\7v"+
		"\2\2hi\7g\2\2i\32\3\2\2\2jk\7t\2\2kl\7g\2\2lm\7c\2\2mn\7f\2\2n\34\3\2"+
		"\2\2op\7?\2\2p\36\3\2\2\2qr\7\61\2\2rs\7,\2\2sw\3\2\2\2tv\13\2\2\2ut\3"+
		"\2\2\2vy\3\2\2\2wx\3\2\2\2wu\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7,\2\2{|\7"+
		"\61\2\2|}\3\2\2\2}~\b\20\2\2~ \3\2\2\2\177\u0080\7k\2\2\u0080\u0081\7"+
		"p\2\2\u0081\u0082\7v\2\2\u0082\"\3\2\2\2\u0083\u0084\7e\2\2\u0084\u0085"+
		"\7j\2\2\u0085\u0086\7c\2\2\u0086\u0087\7t\2\2\u0087$\3\2\2\2\u0088\u0089"+
		"\7u\2\2\u0089\u008a\7v\2\2\u008a\u008b\7t\2\2\u008b&\3\2\2\2\u008c\u0090"+
		"\t\2\2\2\u008d\u008f\t\3\2\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091(\3\2\2\2\u0092\u0090\3\2\2\2"+
		"\u0093\u0095\t\4\2\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097*\3\2\2\2\u0098\u0099\7-\2\2\u0099,"+
		"\3\2\2\2\u009a\u009b\7/\2\2\u009b.\3\2\2\2\u009c\u009d\7,\2\2\u009d\60"+
		"\3\2\2\2\u009e\u009f\7\61\2\2\u009f\62\3\2\2\2\u00a0\u00a1\7@\2\2\u00a1"+
		"\64\3\2\2\2\u00a2\u00a3\7@\2\2\u00a3\u00a4\7?\2\2\u00a4\66\3\2\2\2\u00a5"+
		"\u00a6\7>\2\2\u00a68\3\2\2\2\u00a7\u00a8\7>\2\2\u00a8\u00a9\7?\2\2\u00a9"+
		":\3\2\2\2\u00aa\u00ab\7?\2\2\u00ab\u00ac\7?\2\2\u00ac<\3\2\2\2\u00ad\u00ae"+
		"\7#\2\2\u00ae\u00af\7?\2\2\u00af>\3\2\2\2\u00b0\u00b4\7$\2\2\u00b1\u00b3"+
		"\n\5\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7$"+
		"\2\2\u00b8@\3\2\2\2\u00b9\u00ba\t\6\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc"+
		"\b!\2\2\u00bcB\3\2\2\2\7\2w\u0090\u0096\u00b4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}