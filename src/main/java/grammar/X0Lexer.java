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
		ID_STRING=18, NUM=19, PLUS=20, MINUS=21, MUL=22, DIV=23, GT=24, GEQ=25, 
		LT=26, LEQ=27, EQ=28, NEQ=29, WS=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "COMMENT", "INT", "CHAR", 
		"ID_STRING", "NUM", "PLUS", "MINUS", "MUL", "DIV", "GT", "GEQ", "LT", 
		"LEQ", "EQ", "NEQ", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main'", "'{'", "'}'", "';'", "'['", "']'", "'if'", "'('", "')'", 
		"'else'", "'while'", "'write'", "'read'", "'='", null, "'int'", "'char'", 
		null, null, "'+'", "'-'", "'*'", "'/'", "'>'", "'>='", "'<'", "'<='", 
		"'=='", "'!='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "COMMENT", "INT", "CHAR", "ID_STRING", "NUM", "PLUS", 
		"MINUS", "MUL", "DIV", "GT", "GEQ", "LT", "LEQ", "EQ", "NEQ", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00ac\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\7"+
		"\20r\n\20\f\20\16\20u\13\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\7\23\u0087\n\23\f\23\16\23\u008a"+
		"\13\23\3\24\6\24\u008d\n\24\r\24\16\24\u008e\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3s\2 \3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= \3\2\6\4\2C\\c|\5"+
		"\2\62;C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u00ae\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2"+
		"\2\2\5D\3\2\2\2\7F\3\2\2\2\tH\3\2\2\2\13J\3\2\2\2\rL\3\2\2\2\17N\3\2\2"+
		"\2\21Q\3\2\2\2\23S\3\2\2\2\25U\3\2\2\2\27Z\3\2\2\2\31`\3\2\2\2\33f\3\2"+
		"\2\2\35k\3\2\2\2\37m\3\2\2\2!{\3\2\2\2#\177\3\2\2\2%\u0084\3\2\2\2\'\u008c"+
		"\3\2\2\2)\u0090\3\2\2\2+\u0092\3\2\2\2-\u0094\3\2\2\2/\u0096\3\2\2\2\61"+
		"\u0098\3\2\2\2\63\u009a\3\2\2\2\65\u009d\3\2\2\2\67\u009f\3\2\2\29\u00a2"+
		"\3\2\2\2;\u00a5\3\2\2\2=\u00a8\3\2\2\2?@\7o\2\2@A\7c\2\2AB\7k\2\2BC\7"+
		"p\2\2C\4\3\2\2\2DE\7}\2\2E\6\3\2\2\2FG\7\177\2\2G\b\3\2\2\2HI\7=\2\2I"+
		"\n\3\2\2\2JK\7]\2\2K\f\3\2\2\2LM\7_\2\2M\16\3\2\2\2NO\7k\2\2OP\7h\2\2"+
		"P\20\3\2\2\2QR\7*\2\2R\22\3\2\2\2ST\7+\2\2T\24\3\2\2\2UV\7g\2\2VW\7n\2"+
		"\2WX\7u\2\2XY\7g\2\2Y\26\3\2\2\2Z[\7y\2\2[\\\7j\2\2\\]\7k\2\2]^\7n\2\2"+
		"^_\7g\2\2_\30\3\2\2\2`a\7y\2\2ab\7t\2\2bc\7k\2\2cd\7v\2\2de\7g\2\2e\32"+
		"\3\2\2\2fg\7t\2\2gh\7g\2\2hi\7c\2\2ij\7f\2\2j\34\3\2\2\2kl\7?\2\2l\36"+
		"\3\2\2\2mn\7\61\2\2no\7,\2\2os\3\2\2\2pr\13\2\2\2qp\3\2\2\2ru\3\2\2\2"+
		"st\3\2\2\2sq\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7,\2\2wx\7\61\2\2xy\3\2\2\2"+
		"yz\b\20\2\2z \3\2\2\2{|\7k\2\2|}\7p\2\2}~\7v\2\2~\"\3\2\2\2\177\u0080"+
		"\7e\2\2\u0080\u0081\7j\2\2\u0081\u0082\7c\2\2\u0082\u0083\7t\2\2\u0083"+
		"$\3\2\2\2\u0084\u0088\t\2\2\2\u0085\u0087\t\3\2\2\u0086\u0085\3\2\2\2"+
		"\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089&\3"+
		"\2\2\2\u008a\u0088\3\2\2\2\u008b\u008d\t\4\2\2\u008c\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f(\3\2\2\2"+
		"\u0090\u0091\7-\2\2\u0091*\3\2\2\2\u0092\u0093\7/\2\2\u0093,\3\2\2\2\u0094"+
		"\u0095\7,\2\2\u0095.\3\2\2\2\u0096\u0097\7\61\2\2\u0097\60\3\2\2\2\u0098"+
		"\u0099\7@\2\2\u0099\62\3\2\2\2\u009a\u009b\7@\2\2\u009b\u009c\7?\2\2\u009c"+
		"\64\3\2\2\2\u009d\u009e\7>\2\2\u009e\66\3\2\2\2\u009f\u00a0\7>\2\2\u00a0"+
		"\u00a1\7?\2\2\u00a18\3\2\2\2\u00a2\u00a3\7?\2\2\u00a3\u00a4\7?\2\2\u00a4"+
		":\3\2\2\2\u00a5\u00a6\7#\2\2\u00a6\u00a7\7?\2\2\u00a7<\3\2\2\2\u00a8\u00a9"+
		"\t\5\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\b\37\2\2\u00ab>\3\2\2\2\6\2s"+
		"\u0088\u008e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}