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
		T__17=18, DecimalFloatingPointLiteral=19, COMMENT=20, CONST=21, RETURN=22, 
		INT=23, CHAR=24, STR=25, FLOAT=26, BOOL=27, TRUE=28, FALSE=29, CONTINUE=30, 
		BREAK=31, AND=32, OR=33, NOT=34, FUNCTION=35, REF=36, ID_STRING=37, NUM=38, 
		PLUS=39, MINUS=40, MUL=41, DIV=42, MOD=43, GT=44, GEQ=45, LT=46, LEQ=47, 
		EQ=48, NEQ=49, STRING=50, WS=51;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "DecimalFloatingPointLiteral", "ExponentPart", "COMMENT", "CONST", 
		"RETURN", "INT", "CHAR", "STR", "FLOAT", "BOOL", "TRUE", "FALSE", "CONTINUE", 
		"BREAK", "AND", "OR", "NOT", "FUNCTION", "REF", "ID_STRING", "NUM", "PLUS", 
		"MINUS", "MUL", "DIV", "MOD", "GT", "GEQ", "LT", "LEQ", "EQ", "NEQ", "STRING", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main'", "'{'", "'}'", "'('", "','", "')'", "';'", "'='", "'['", 
		"']'", "'if'", "'else'", "'while'", "'for'", "'write'", "'read'", "'++'", 
		"'--'", null, null, "'const'", "'return'", "'int'", "'char'", "'str'", 
		"'float'", "'bool'", "'true'", "'false'", "'continue'", "'break'", "'and'", 
		"'or'", "'not'", "'function'", "'ref'", null, null, "'+'", "'-'", "'*'", 
		"'/'", "'%'", "'>'", "'>='", "'<'", "'<='", "'=='", "'!='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "DecimalFloatingPointLiteral", 
		"COMMENT", "CONST", "RETURN", "INT", "CHAR", "STR", "FLOAT", "BOOL", "TRUE", 
		"FALSE", "CONTINUE", "BREAK", "AND", "OR", "NOT", "FUNCTION", "REF", "ID_STRING", 
		"NUM", "PLUS", "MINUS", "MUL", "DIV", "MOD", "GT", "GEQ", "LT", "LEQ", 
		"EQ", "NEQ", "STRING", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0156\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\5\24\u00a9\n\24\3\24\5\24\u00ac\n\24\3\24\3\24\3\24\5\24"+
		"\u00b1\n\24\3\24\3\24\3\24\5\24\u00b6\n\24\3\25\3\25\3\25\5\25\u00bb\n"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u00c3\n\26\f\26\16\26\u00c6\13"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3"+
		"$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\7\'\u0126\n\'\f\'\16"+
		"\'\u0129\13\'\3(\6(\u012c\n(\r(\16(\u012d\3)\3)\3*\3*\3+\3+\3,\3,\3-\3"+
		"-\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63"+
		"\3\64\3\64\7\64\u014c\n\64\f\64\16\64\u014f\13\64\3\64\3\64\3\65\3\65"+
		"\3\65\3\65\4\u00c4\u014d\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\2+\26-\27/\30\61"+
		"\31\63\32\65\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_\60"+
		"a\61c\62e\63g\64i\65\3\2\b\4\2GGgg\4\2C\\c|\5\2\62;C\\c|\3\2\62;\6\2\f"+
		"\f\17\17$$^^\5\2\13\f\17\17\"\"\2\u015f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2+"+
		"\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2"+
		"i\3\2\2\2\3k\3\2\2\2\5p\3\2\2\2\7r\3\2\2\2\tt\3\2\2\2\13v\3\2\2\2\rx\3"+
		"\2\2\2\17z\3\2\2\2\21|\3\2\2\2\23~\3\2\2\2\25\u0080\3\2\2\2\27\u0082\3"+
		"\2\2\2\31\u0085\3\2\2\2\33\u008a\3\2\2\2\35\u0090\3\2\2\2\37\u0094\3\2"+
		"\2\2!\u009a\3\2\2\2#\u009f\3\2\2\2%\u00a2\3\2\2\2\'\u00b5\3\2\2\2)\u00b7"+
		"\3\2\2\2+\u00be\3\2\2\2-\u00cc\3\2\2\2/\u00d2\3\2\2\2\61\u00d9\3\2\2\2"+
		"\63\u00dd\3\2\2\2\65\u00e2\3\2\2\2\67\u00e6\3\2\2\29\u00ec\3\2\2\2;\u00f1"+
		"\3\2\2\2=\u00f6\3\2\2\2?\u00fc\3\2\2\2A\u0105\3\2\2\2C\u010b\3\2\2\2E"+
		"\u010f\3\2\2\2G\u0112\3\2\2\2I\u0116\3\2\2\2K\u011f\3\2\2\2M\u0123\3\2"+
		"\2\2O\u012b\3\2\2\2Q\u012f\3\2\2\2S\u0131\3\2\2\2U\u0133\3\2\2\2W\u0135"+
		"\3\2\2\2Y\u0137\3\2\2\2[\u0139\3\2\2\2]\u013b\3\2\2\2_\u013e\3\2\2\2a"+
		"\u0140\3\2\2\2c\u0143\3\2\2\2e\u0146\3\2\2\2g\u0149\3\2\2\2i\u0152\3\2"+
		"\2\2kl\7o\2\2lm\7c\2\2mn\7k\2\2no\7p\2\2o\4\3\2\2\2pq\7}\2\2q\6\3\2\2"+
		"\2rs\7\177\2\2s\b\3\2\2\2tu\7*\2\2u\n\3\2\2\2vw\7.\2\2w\f\3\2\2\2xy\7"+
		"+\2\2y\16\3\2\2\2z{\7=\2\2{\20\3\2\2\2|}\7?\2\2}\22\3\2\2\2~\177\7]\2"+
		"\2\177\24\3\2\2\2\u0080\u0081\7_\2\2\u0081\26\3\2\2\2\u0082\u0083\7k\2"+
		"\2\u0083\u0084\7h\2\2\u0084\30\3\2\2\2\u0085\u0086\7g\2\2\u0086\u0087"+
		"\7n\2\2\u0087\u0088\7u\2\2\u0088\u0089\7g\2\2\u0089\32\3\2\2\2\u008a\u008b"+
		"\7y\2\2\u008b\u008c\7j\2\2\u008c\u008d\7k\2\2\u008d\u008e\7n\2\2\u008e"+
		"\u008f\7g\2\2\u008f\34\3\2\2\2\u0090\u0091\7h\2\2\u0091\u0092\7q\2\2\u0092"+
		"\u0093\7t\2\2\u0093\36\3\2\2\2\u0094\u0095\7y\2\2\u0095\u0096\7t\2\2\u0096"+
		"\u0097\7k\2\2\u0097\u0098\7v\2\2\u0098\u0099\7g\2\2\u0099 \3\2\2\2\u009a"+
		"\u009b\7t\2\2\u009b\u009c\7g\2\2\u009c\u009d\7c\2\2\u009d\u009e\7f\2\2"+
		"\u009e\"\3\2\2\2\u009f\u00a0\7-\2\2\u00a0\u00a1\7-\2\2\u00a1$\3\2\2\2"+
		"\u00a2\u00a3\7/\2\2\u00a3\u00a4\7/\2\2\u00a4&\3\2\2\2\u00a5\u00a6\5O("+
		"\2\u00a6\u00a8\7\60\2\2\u00a7\u00a9\5O(\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00ac\5)\25\2\u00ab\u00aa\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00b6\3\2\2\2\u00ad\u00ae\7\60\2\2\u00ae\u00b0\5"+
		"O(\2\u00af\u00b1\5)\25\2\u00b0\u00af\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b6\3\2\2\2\u00b2\u00b3\5O(\2\u00b3\u00b4\5)\25\2\u00b4\u00b6\3\2\2"+
		"\2\u00b5\u00a5\3\2\2\2\u00b5\u00ad\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b6("+
		"\3\2\2\2\u00b7\u00ba\t\2\2\2\u00b8\u00bb\5Q)\2\u00b9\u00bb\5S*\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\u00bd\5O(\2\u00bd*\3\2\2\2\u00be\u00bf\7\61\2\2\u00bf\u00c0"+
		"\7,\2\2\u00c0\u00c4\3\2\2\2\u00c1\u00c3\13\2\2\2\u00c2\u00c1\3\2\2\2\u00c3"+
		"\u00c6\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c7\3\2"+
		"\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7,\2\2\u00c8\u00c9\7\61\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cb\b\26\2\2\u00cb,\3\2\2\2\u00cc\u00cd\7e\2\2"+
		"\u00cd\u00ce\7q\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7u\2\2\u00d0\u00d1"+
		"\7v\2\2\u00d1.\3\2\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5"+
		"\7v\2\2\u00d5\u00d6\7w\2\2\u00d6\u00d7\7t\2\2\u00d7\u00d8\7p\2\2\u00d8"+
		"\60\3\2\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7v\2\2\u00dc"+
		"\62\3\2\2\2\u00dd\u00de\7e\2\2\u00de\u00df\7j\2\2\u00df\u00e0\7c\2\2\u00e0"+
		"\u00e1\7t\2\2\u00e1\64\3\2\2\2\u00e2\u00e3\7u\2\2\u00e3\u00e4\7v\2\2\u00e4"+
		"\u00e5\7t\2\2\u00e5\66\3\2\2\2\u00e6\u00e7\7h\2\2\u00e7\u00e8\7n\2\2\u00e8"+
		"\u00e9\7q\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb\7v\2\2\u00eb8\3\2\2\2\u00ec"+
		"\u00ed\7d\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0\7n\2\2"+
		"\u00f0:\3\2\2\2\u00f1\u00f2\7v\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4\7w\2"+
		"\2\u00f4\u00f5\7g\2\2\u00f5<\3\2\2\2\u00f6\u00f7\7h\2\2\u00f7\u00f8\7"+
		"c\2\2\u00f8\u00f9\7n\2\2\u00f9\u00fa\7u\2\2\u00fa\u00fb\7g\2\2\u00fb>"+
		"\3\2\2\2\u00fc\u00fd\7e\2\2\u00fd\u00fe\7q\2\2\u00fe\u00ff\7p\2\2\u00ff"+
		"\u0100\7v\2\2\u0100\u0101\7k\2\2\u0101\u0102\7p\2\2\u0102\u0103\7w\2\2"+
		"\u0103\u0104\7g\2\2\u0104@\3\2\2\2\u0105\u0106\7d\2\2\u0106\u0107\7t\2"+
		"\2\u0107\u0108\7g\2\2\u0108\u0109\7c\2\2\u0109\u010a\7m\2\2\u010aB\3\2"+
		"\2\2\u010b\u010c\7c\2\2\u010c\u010d\7p\2\2\u010d\u010e\7f\2\2\u010eD\3"+
		"\2\2\2\u010f\u0110\7q\2\2\u0110\u0111\7t\2\2\u0111F\3\2\2\2\u0112\u0113"+
		"\7p\2\2\u0113\u0114\7q\2\2\u0114\u0115\7v\2\2\u0115H\3\2\2\2\u0116\u0117"+
		"\7h\2\2\u0117\u0118\7w\2\2\u0118\u0119\7p\2\2\u0119\u011a\7e\2\2\u011a"+
		"\u011b\7v\2\2\u011b\u011c\7k\2\2\u011c\u011d\7q\2\2\u011d\u011e\7p\2\2"+
		"\u011eJ\3\2\2\2\u011f\u0120\7t\2\2\u0120\u0121\7g\2\2\u0121\u0122\7h\2"+
		"\2\u0122L\3\2\2\2\u0123\u0127\t\3\2\2\u0124\u0126\t\4\2\2\u0125\u0124"+
		"\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"N\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012c\t\5\2\2\u012b\u012a\3\2\2\2"+
		"\u012c\u012d\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012eP\3"+
		"\2\2\2\u012f\u0130\7-\2\2\u0130R\3\2\2\2\u0131\u0132\7/\2\2\u0132T\3\2"+
		"\2\2\u0133\u0134\7,\2\2\u0134V\3\2\2\2\u0135\u0136\7\61\2\2\u0136X\3\2"+
		"\2\2\u0137\u0138\7\'\2\2\u0138Z\3\2\2\2\u0139\u013a\7@\2\2\u013a\\\3\2"+
		"\2\2\u013b\u013c\7@\2\2\u013c\u013d\7?\2\2\u013d^\3\2\2\2\u013e\u013f"+
		"\7>\2\2\u013f`\3\2\2\2\u0140\u0141\7>\2\2\u0141\u0142\7?\2\2\u0142b\3"+
		"\2\2\2\u0143\u0144\7?\2\2\u0144\u0145\7?\2\2\u0145d\3\2\2\2\u0146\u0147"+
		"\7#\2\2\u0147\u0148\7?\2\2\u0148f\3\2\2\2\u0149\u014d\7$\2\2\u014a\u014c"+
		"\n\6\2\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014e\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014e\u0150\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0151\7$"+
		"\2\2\u0151h\3\2\2\2\u0152\u0153\t\7\2\2\u0153\u0154\3\2\2\2\u0154\u0155"+
		"\b\65\2\2\u0155j\3\2\2\2\f\2\u00a8\u00ab\u00b0\u00b5\u00ba\u00c4\u0127"+
		"\u012d\u014d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}