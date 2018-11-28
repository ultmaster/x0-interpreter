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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		DecimalFloatingPointLiteral=18, COMMENT=19, INT=20, CHAR=21, STR=22, FLOAT=23, 
		BOOL=24, TRUE=25, FALSE=26, CONTINUE=27, BREAK=28, AND=29, OR=30, NOT=31, 
		ID_STRING=32, NUM=33, PLUS=34, MINUS=35, MUL=36, DIV=37, MOD=38, GT=39, 
		GEQ=40, LT=41, LEQ=42, EQ=43, NEQ=44, STRING=45, WS=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"DecimalFloatingPointLiteral", "ExponentPart", "COMMENT", "INT", "CHAR", 
		"STR", "FLOAT", "BOOL", "TRUE", "FALSE", "CONTINUE", "BREAK", "AND", "OR", 
		"NOT", "ID_STRING", "NUM", "PLUS", "MINUS", "MUL", "DIV", "MOD", "GT", 
		"GEQ", "LT", "LEQ", "EQ", "NEQ", "STRING", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main'", "'{'", "'}'", "';'", "'['", "']'", "'if'", "'('", "')'", 
		"'else'", "'while'", "'for'", "'write'", "'read'", "'='", "'++'", "'--'", 
		null, null, "'int'", "'char'", "'str'", "'float'", "'bool'", "'true'", 
		"'false'", "'continue'", "'break'", "'and'", "'or'", "'not'", null, null, 
		"'+'", "'-'", "'*'", "'/'", "'%'", "'>'", "'>='", "'<'", "'<='", "'=='", 
		"'!='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "DecimalFloatingPointLiteral", "COMMENT", 
		"INT", "CHAR", "STR", "FLOAT", "BOOL", "TRUE", "FALSE", "CONTINUE", "BREAK", 
		"AND", "OR", "NOT", "ID_STRING", "NUM", "PLUS", "MINUS", "MUL", "DIV", 
		"MOD", "GT", "GEQ", "LT", "LEQ", "EQ", "NEQ", "STRING", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u0130\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\5\23\u009d\n\23\3\23\5\23\u00a0\n\23\3\23\3\23\3"+
		"\23\5\23\u00a5\n\23\3\23\3\23\3\23\5\23\u00aa\n\23\3\24\3\24\3\24\5\24"+
		"\u00af\n\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u00b7\n\25\f\25\16\25\u00ba"+
		"\13\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3\"\3\"\7\"\u0100\n\"\f\"\16"+
		"\"\u0103\13\"\3#\6#\u0106\n#\r#\16#\u0107\3$\3$\3%\3%\3&\3&\3\'\3\'\3"+
		"(\3(\3)\3)\3*\3*\3*\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\7/\u0126\n"+
		"/\f/\16/\u0129\13/\3/\3/\3\60\3\60\3\60\3\60\4\u00b8\u0127\2\61\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\2)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37?"+
		" A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_\60\3\2\b\4\2GGgg\4\2C\\c|\5\2\62;C"+
		"\\c|\3\2\62;\6\2\f\f\17\17$$^^\5\2\13\f\17\17\"\"\2\u0139\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5f\3\2\2\2\7h\3\2\2"+
		"\2\tj\3\2\2\2\13l\3\2\2\2\rn\3\2\2\2\17p\3\2\2\2\21s\3\2\2\2\23u\3\2\2"+
		"\2\25w\3\2\2\2\27|\3\2\2\2\31\u0082\3\2\2\2\33\u0086\3\2\2\2\35\u008c"+
		"\3\2\2\2\37\u0091\3\2\2\2!\u0093\3\2\2\2#\u0096\3\2\2\2%\u00a9\3\2\2\2"+
		"\'\u00ab\3\2\2\2)\u00b2\3\2\2\2+\u00c0\3\2\2\2-\u00c4\3\2\2\2/\u00c9\3"+
		"\2\2\2\61\u00cd\3\2\2\2\63\u00d3\3\2\2\2\65\u00d8\3\2\2\2\67\u00dd\3\2"+
		"\2\29\u00e3\3\2\2\2;\u00ec\3\2\2\2=\u00f2\3\2\2\2?\u00f6\3\2\2\2A\u00f9"+
		"\3\2\2\2C\u00fd\3\2\2\2E\u0105\3\2\2\2G\u0109\3\2\2\2I\u010b\3\2\2\2K"+
		"\u010d\3\2\2\2M\u010f\3\2\2\2O\u0111\3\2\2\2Q\u0113\3\2\2\2S\u0115\3\2"+
		"\2\2U\u0118\3\2\2\2W\u011a\3\2\2\2Y\u011d\3\2\2\2[\u0120\3\2\2\2]\u0123"+
		"\3\2\2\2_\u012c\3\2\2\2ab\7o\2\2bc\7c\2\2cd\7k\2\2de\7p\2\2e\4\3\2\2\2"+
		"fg\7}\2\2g\6\3\2\2\2hi\7\177\2\2i\b\3\2\2\2jk\7=\2\2k\n\3\2\2\2lm\7]\2"+
		"\2m\f\3\2\2\2no\7_\2\2o\16\3\2\2\2pq\7k\2\2qr\7h\2\2r\20\3\2\2\2st\7*"+
		"\2\2t\22\3\2\2\2uv\7+\2\2v\24\3\2\2\2wx\7g\2\2xy\7n\2\2yz\7u\2\2z{\7g"+
		"\2\2{\26\3\2\2\2|}\7y\2\2}~\7j\2\2~\177\7k\2\2\177\u0080\7n\2\2\u0080"+
		"\u0081\7g\2\2\u0081\30\3\2\2\2\u0082\u0083\7h\2\2\u0083\u0084\7q\2\2\u0084"+
		"\u0085\7t\2\2\u0085\32\3\2\2\2\u0086\u0087\7y\2\2\u0087\u0088\7t\2\2\u0088"+
		"\u0089\7k\2\2\u0089\u008a\7v\2\2\u008a\u008b\7g\2\2\u008b\34\3\2\2\2\u008c"+
		"\u008d\7t\2\2\u008d\u008e\7g\2\2\u008e\u008f\7c\2\2\u008f\u0090\7f\2\2"+
		"\u0090\36\3\2\2\2\u0091\u0092\7?\2\2\u0092 \3\2\2\2\u0093\u0094\7-\2\2"+
		"\u0094\u0095\7-\2\2\u0095\"\3\2\2\2\u0096\u0097\7/\2\2\u0097\u0098\7/"+
		"\2\2\u0098$\3\2\2\2\u0099\u009a\5E#\2\u009a\u009c\7\60\2\2\u009b\u009d"+
		"\5E#\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e"+
		"\u00a0\5\'\24\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00aa\3"+
		"\2\2\2\u00a1\u00a2\7\60\2\2\u00a2\u00a4\5E#\2\u00a3\u00a5\5\'\24\2\u00a4"+
		"\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00aa\3\2\2\2\u00a6\u00a7\5E"+
		"#\2\u00a7\u00a8\5\'\24\2\u00a8\u00aa\3\2\2\2\u00a9\u0099\3\2\2\2\u00a9"+
		"\u00a1\3\2\2\2\u00a9\u00a6\3\2\2\2\u00aa&\3\2\2\2\u00ab\u00ae\t\2\2\2"+
		"\u00ac\u00af\5G$\2\u00ad\u00af\5I%\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3"+
		"\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\5E#\2\u00b1"+
		"(\3\2\2\2\u00b2\u00b3\7\61\2\2\u00b3\u00b4\7,\2\2\u00b4\u00b8\3\2\2\2"+
		"\u00b5\u00b7\13\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b9"+
		"\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb"+
		"\u00bc\7,\2\2\u00bc\u00bd\7\61\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\b\25"+
		"\2\2\u00bf*\3\2\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3"+
		"\7v\2\2\u00c3,\3\2\2\2\u00c4\u00c5\7e\2\2\u00c5\u00c6\7j\2\2\u00c6\u00c7"+
		"\7c\2\2\u00c7\u00c8\7t\2\2\u00c8.\3\2\2\2\u00c9\u00ca\7u\2\2\u00ca\u00cb"+
		"\7v\2\2\u00cb\u00cc\7t\2\2\u00cc\60\3\2\2\2\u00cd\u00ce\7h\2\2\u00ce\u00cf"+
		"\7n\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7v\2\2\u00d2"+
		"\62\3\2\2\2\u00d3\u00d4\7d\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7q\2\2\u00d6"+
		"\u00d7\7n\2\2\u00d7\64\3\2\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da\7t\2\2\u00da"+
		"\u00db\7w\2\2\u00db\u00dc\7g\2\2\u00dc\66\3\2\2\2\u00dd\u00de\7h\2\2\u00de"+
		"\u00df\7c\2\2\u00df\u00e0\7n\2\2\u00e0\u00e1\7u\2\2\u00e1\u00e2\7g\2\2"+
		"\u00e28\3\2\2\2\u00e3\u00e4\7e\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6\7p\2"+
		"\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7p\2\2\u00e9\u00ea"+
		"\7w\2\2\u00ea\u00eb\7g\2\2\u00eb:\3\2\2\2\u00ec\u00ed\7d\2\2\u00ed\u00ee"+
		"\7t\2\2\u00ee\u00ef\7g\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7m\2\2\u00f1"+
		"<\3\2\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5\7f\2\2\u00f5"+
		">\3\2\2\2\u00f6\u00f7\7q\2\2\u00f7\u00f8\7t\2\2\u00f8@\3\2\2\2\u00f9\u00fa"+
		"\7p\2\2\u00fa\u00fb\7q\2\2\u00fb\u00fc\7v\2\2\u00fcB\3\2\2\2\u00fd\u0101"+
		"\t\3\2\2\u00fe\u0100\t\4\2\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102D\3\2\2\2\u0103\u0101\3\2\2\2"+
		"\u0104\u0106\t\5\2\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0105"+
		"\3\2\2\2\u0107\u0108\3\2\2\2\u0108F\3\2\2\2\u0109\u010a\7-\2\2\u010aH"+
		"\3\2\2\2\u010b\u010c\7/\2\2\u010cJ\3\2\2\2\u010d\u010e\7,\2\2\u010eL\3"+
		"\2\2\2\u010f\u0110\7\61\2\2\u0110N\3\2\2\2\u0111\u0112\7\'\2\2\u0112P"+
		"\3\2\2\2\u0113\u0114\7@\2\2\u0114R\3\2\2\2\u0115\u0116\7@\2\2\u0116\u0117"+
		"\7?\2\2\u0117T\3\2\2\2\u0118\u0119\7>\2\2\u0119V\3\2\2\2\u011a\u011b\7"+
		">\2\2\u011b\u011c\7?\2\2\u011cX\3\2\2\2\u011d\u011e\7?\2\2\u011e\u011f"+
		"\7?\2\2\u011fZ\3\2\2\2\u0120\u0121\7#\2\2\u0121\u0122\7?\2\2\u0122\\\3"+
		"\2\2\2\u0123\u0127\7$\2\2\u0124\u0126\n\6\2\2\u0125\u0124\3\2\2\2\u0126"+
		"\u0129\3\2\2\2\u0127\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012a\3\2"+
		"\2\2\u0129\u0127\3\2\2\2\u012a\u012b\7$\2\2\u012b^\3\2\2\2\u012c\u012d"+
		"\t\7\2\2\u012d\u012e\3\2\2\2\u012e\u012f\b\60\2\2\u012f`\3\2\2\2\f\2\u009c"+
		"\u009f\u00a4\u00a9\u00ae\u00b8\u0101\u0107\u0127\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}