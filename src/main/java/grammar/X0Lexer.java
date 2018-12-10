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
		T__17=18, T__18=19, T__19=20, T__20=21, DecimalFloatingPointLiteral=22, 
		COMMENT=23, CHR=24, CONST=25, RETURN=26, INT=27, CHAR=28, STR=29, FLOAT=30, 
		BOOL=31, TRUE=32, FALSE=33, CONTINUE=34, BREAK=35, EXIT=36, AND=37, OR=38, 
		NOT=39, ODD=40, FUNCTION=41, XOR=42, REF=43, ID_STRING=44, NUM=45, PLUS=46, 
		MINUS=47, MUL=48, DIV=49, MOD=50, GT=51, GEQ=52, LT=53, LEQ=54, EQ=55, 
		NEQ=56, STRING=57, WS=58;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "DecimalFloatingPointLiteral", "ExponentPart", 
		"COMMENT", "CHR", "CONST", "RETURN", "INT", "CHAR", "STR", "FLOAT", "BOOL", 
		"TRUE", "FALSE", "CONTINUE", "BREAK", "EXIT", "AND", "OR", "NOT", "ODD", 
		"FUNCTION", "XOR", "REF", "ID_STRING", "NUM", "PLUS", "MINUS", "MUL", 
		"DIV", "MOD", "GT", "GEQ", "LT", "LEQ", "EQ", "NEQ", "STRING", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main'", "'{'", "'}'", "'('", "','", "')'", "';'", "'='", "'['", 
		"']'", "'if'", "'else'", "'while'", "'for'", "'do'", "'repeat'", "'until'", 
		"'write'", "'read'", "'++'", "'--'", null, null, "'chr'", "'const'", "'return'", 
		"'int'", "'char'", "'str'", "'float'", "'bool'", "'true'", "'false'", 
		"'continue'", "'break'", "'exit'", "'and'", "'or'", "'not'", "'odd'", 
		"'function'", "'xor'", "'ref'", null, null, "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'>'", "'>='", "'<'", "'<='", "'=='", "'!='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "DecimalFloatingPointLiteral", 
		"COMMENT", "CHR", "CONST", "RETURN", "INT", "CHAR", "STR", "FLOAT", "BOOL", 
		"TRUE", "FALSE", "CONTINUE", "BREAK", "EXIT", "AND", "OR", "NOT", "ODD", 
		"FUNCTION", "XOR", "REF", "ID_STRING", "NUM", "PLUS", "MINUS", "MUL", 
		"DIV", "MOD", "GT", "GEQ", "LT", "LEQ", "EQ", "NEQ", "STRING", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u0185\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\5\27\u00c7\n\27\3\27\5\27\u00ca\n\27\3\27\3\27\3\27\5\27\u00cf\n\27\3"+
		"\27\3\27\3\27\5\27\u00d4\n\27\3\30\3\30\3\30\5\30\u00d9\n\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\7\31\u00e1\n\31\f\31\16\31\u00e4\13\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\""+
		"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3"+
		"%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\7.\u0155\n.\f.\16"+
		".\u0158\13.\3/\6/\u015b\n/\r/\16/\u015c\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\67\3\67\38\38\38\39\3"+
		"9\39\3:\3:\3:\3;\3;\7;\u017b\n;\f;\16;\u017e\13;\3;\3;\3<\3<\3<\3<\4\u00e2"+
		"\u017c\2=\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\2\61\31\63\32\65\33\67\34"+
		"9\35;\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_\60a\61c\62e\63g\64i\65"+
		"k\66m\67o8q9s:u;w<\3\2\b\4\2GGgg\4\2C\\c|\5\2\62;C\\c|\3\2\62;\6\2\f\f"+
		"\17\17$$^^\5\2\13\f\17\17\"\"\2\u018e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i"+
		"\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2"+
		"\2\2\2w\3\2\2\2\3y\3\2\2\2\5~\3\2\2\2\7\u0080\3\2\2\2\t\u0082\3\2\2\2"+
		"\13\u0084\3\2\2\2\r\u0086\3\2\2\2\17\u0088\3\2\2\2\21\u008a\3\2\2\2\23"+
		"\u008c\3\2\2\2\25\u008e\3\2\2\2\27\u0090\3\2\2\2\31\u0093\3\2\2\2\33\u0098"+
		"\3\2\2\2\35\u009e\3\2\2\2\37\u00a2\3\2\2\2!\u00a5\3\2\2\2#\u00ac\3\2\2"+
		"\2%\u00b2\3\2\2\2\'\u00b8\3\2\2\2)\u00bd\3\2\2\2+\u00c0\3\2\2\2-\u00d3"+
		"\3\2\2\2/\u00d5\3\2\2\2\61\u00dc\3\2\2\2\63\u00ea\3\2\2\2\65\u00ee\3\2"+
		"\2\2\67\u00f4\3\2\2\29\u00fb\3\2\2\2;\u00ff\3\2\2\2=\u0104\3\2\2\2?\u0108"+
		"\3\2\2\2A\u010e\3\2\2\2C\u0113\3\2\2\2E\u0118\3\2\2\2G\u011e\3\2\2\2I"+
		"\u0127\3\2\2\2K\u012d\3\2\2\2M\u0132\3\2\2\2O\u0136\3\2\2\2Q\u0139\3\2"+
		"\2\2S\u013d\3\2\2\2U\u0141\3\2\2\2W\u014a\3\2\2\2Y\u014e\3\2\2\2[\u0152"+
		"\3\2\2\2]\u015a\3\2\2\2_\u015e\3\2\2\2a\u0160\3\2\2\2c\u0162\3\2\2\2e"+
		"\u0164\3\2\2\2g\u0166\3\2\2\2i\u0168\3\2\2\2k\u016a\3\2\2\2m\u016d\3\2"+
		"\2\2o\u016f\3\2\2\2q\u0172\3\2\2\2s\u0175\3\2\2\2u\u0178\3\2\2\2w\u0181"+
		"\3\2\2\2yz\7o\2\2z{\7c\2\2{|\7k\2\2|}\7p\2\2}\4\3\2\2\2~\177\7}\2\2\177"+
		"\6\3\2\2\2\u0080\u0081\7\177\2\2\u0081\b\3\2\2\2\u0082\u0083\7*\2\2\u0083"+
		"\n\3\2\2\2\u0084\u0085\7.\2\2\u0085\f\3\2\2\2\u0086\u0087\7+\2\2\u0087"+
		"\16\3\2\2\2\u0088\u0089\7=\2\2\u0089\20\3\2\2\2\u008a\u008b\7?\2\2\u008b"+
		"\22\3\2\2\2\u008c\u008d\7]\2\2\u008d\24\3\2\2\2\u008e\u008f\7_\2\2\u008f"+
		"\26\3\2\2\2\u0090\u0091\7k\2\2\u0091\u0092\7h\2\2\u0092\30\3\2\2\2\u0093"+
		"\u0094\7g\2\2\u0094\u0095\7n\2\2\u0095\u0096\7u\2\2\u0096\u0097\7g\2\2"+
		"\u0097\32\3\2\2\2\u0098\u0099\7y\2\2\u0099\u009a\7j\2\2\u009a\u009b\7"+
		"k\2\2\u009b\u009c\7n\2\2\u009c\u009d\7g\2\2\u009d\34\3\2\2\2\u009e\u009f"+
		"\7h\2\2\u009f\u00a0\7q\2\2\u00a0\u00a1\7t\2\2\u00a1\36\3\2\2\2\u00a2\u00a3"+
		"\7f\2\2\u00a3\u00a4\7q\2\2\u00a4 \3\2\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7"+
		"\7g\2\2\u00a7\u00a8\7r\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7c\2\2\u00aa"+
		"\u00ab\7v\2\2\u00ab\"\3\2\2\2\u00ac\u00ad\7w\2\2\u00ad\u00ae\7p\2\2\u00ae"+
		"\u00af\7v\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7n\2\2\u00b1$\3\2\2\2\u00b2"+
		"\u00b3\7y\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7v\2\2"+
		"\u00b6\u00b7\7g\2\2\u00b7&\3\2\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7g\2"+
		"\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7f\2\2\u00bc(\3\2\2\2\u00bd\u00be\7"+
		"-\2\2\u00be\u00bf\7-\2\2\u00bf*\3\2\2\2\u00c0\u00c1\7/\2\2\u00c1\u00c2"+
		"\7/\2\2\u00c2,\3\2\2\2\u00c3\u00c4\5]/\2\u00c4\u00c6\7\60\2\2\u00c5\u00c7"+
		"\5]/\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8"+
		"\u00ca\5/\30\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00d4\3\2"+
		"\2\2\u00cb\u00cc\7\60\2\2\u00cc\u00ce\5]/\2\u00cd\u00cf\5/\30\2\u00ce"+
		"\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d4\3\2\2\2\u00d0\u00d1\5]"+
		"/\2\u00d1\u00d2\5/\30\2\u00d2\u00d4\3\2\2\2\u00d3\u00c3\3\2\2\2\u00d3"+
		"\u00cb\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d4.\3\2\2\2\u00d5\u00d8\t\2\2\2"+
		"\u00d6\u00d9\5_\60\2\u00d7\u00d9\5a\61\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7"+
		"\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\5]/\2\u00db"+
		"\60\3\2\2\2\u00dc\u00dd\7\61\2\2\u00dd\u00de\7,\2\2\u00de\u00e2\3\2\2"+
		"\2\u00df\u00e1\13\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2"+
		"\2\2\u00e5\u00e6\7,\2\2\u00e6\u00e7\7\61\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00e9\b\31\2\2\u00e9\62\3\2\2\2\u00ea\u00eb\7e\2\2\u00eb\u00ec\7j\2\2"+
		"\u00ec\u00ed\7t\2\2\u00ed\64\3\2\2\2\u00ee\u00ef\7e\2\2\u00ef\u00f0\7"+
		"q\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2\7u\2\2\u00f2\u00f3\7v\2\2\u00f3\66"+
		"\3\2\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7v\2\2\u00f7"+
		"\u00f8\7w\2\2\u00f8\u00f9\7t\2\2\u00f9\u00fa\7p\2\2\u00fa8\3\2\2\2\u00fb"+
		"\u00fc\7k\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe\7v\2\2\u00fe:\3\2\2\2\u00ff"+
		"\u0100\7e\2\2\u0100\u0101\7j\2\2\u0101\u0102\7c\2\2\u0102\u0103\7t\2\2"+
		"\u0103<\3\2\2\2\u0104\u0105\7u\2\2\u0105\u0106\7v\2\2\u0106\u0107\7t\2"+
		"\2\u0107>\3\2\2\2\u0108\u0109\7h\2\2\u0109\u010a\7n\2\2\u010a\u010b\7"+
		"q\2\2\u010b\u010c\7c\2\2\u010c\u010d\7v\2\2\u010d@\3\2\2\2\u010e\u010f"+
		"\7d\2\2\u010f\u0110\7q\2\2\u0110\u0111\7q\2\2\u0111\u0112\7n\2\2\u0112"+
		"B\3\2\2\2\u0113\u0114\7v\2\2\u0114\u0115\7t\2\2\u0115\u0116\7w\2\2\u0116"+
		"\u0117\7g\2\2\u0117D\3\2\2\2\u0118\u0119\7h\2\2\u0119\u011a\7c\2\2\u011a"+
		"\u011b\7n\2\2\u011b\u011c\7u\2\2\u011c\u011d\7g\2\2\u011dF\3\2\2\2\u011e"+
		"\u011f\7e\2\2\u011f\u0120\7q\2\2\u0120\u0121\7p\2\2\u0121\u0122\7v\2\2"+
		"\u0122\u0123\7k\2\2\u0123\u0124\7p\2\2\u0124\u0125\7w\2\2\u0125\u0126"+
		"\7g\2\2\u0126H\3\2\2\2\u0127\u0128\7d\2\2\u0128\u0129\7t\2\2\u0129\u012a"+
		"\7g\2\2\u012a\u012b\7c\2\2\u012b\u012c\7m\2\2\u012cJ\3\2\2\2\u012d\u012e"+
		"\7g\2\2\u012e\u012f\7z\2\2\u012f\u0130\7k\2\2\u0130\u0131\7v\2\2\u0131"+
		"L\3\2\2\2\u0132\u0133\7c\2\2\u0133\u0134\7p\2\2\u0134\u0135\7f\2\2\u0135"+
		"N\3\2\2\2\u0136\u0137\7q\2\2\u0137\u0138\7t\2\2\u0138P\3\2\2\2\u0139\u013a"+
		"\7p\2\2\u013a\u013b\7q\2\2\u013b\u013c\7v\2\2\u013cR\3\2\2\2\u013d\u013e"+
		"\7q\2\2\u013e\u013f\7f\2\2\u013f\u0140\7f\2\2\u0140T\3\2\2\2\u0141\u0142"+
		"\7h\2\2\u0142\u0143\7w\2\2\u0143\u0144\7p\2\2\u0144\u0145\7e\2\2\u0145"+
		"\u0146\7v\2\2\u0146\u0147\7k\2\2\u0147\u0148\7q\2\2\u0148\u0149\7p\2\2"+
		"\u0149V\3\2\2\2\u014a\u014b\7z\2\2\u014b\u014c\7q\2\2\u014c\u014d\7t\2"+
		"\2\u014dX\3\2\2\2\u014e\u014f\7t\2\2\u014f\u0150\7g\2\2\u0150\u0151\7"+
		"h\2\2\u0151Z\3\2\2\2\u0152\u0156\t\3\2\2\u0153\u0155\t\4\2\2\u0154\u0153"+
		"\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\\\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015b\t\5\2\2\u015a\u0159\3\2\2\2"+
		"\u015b\u015c\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d^\3"+
		"\2\2\2\u015e\u015f\7-\2\2\u015f`\3\2\2\2\u0160\u0161\7/\2\2\u0161b\3\2"+
		"\2\2\u0162\u0163\7,\2\2\u0163d\3\2\2\2\u0164\u0165\7\61\2\2\u0165f\3\2"+
		"\2\2\u0166\u0167\7\'\2\2\u0167h\3\2\2\2\u0168\u0169\7@\2\2\u0169j\3\2"+
		"\2\2\u016a\u016b\7@\2\2\u016b\u016c\7?\2\2\u016cl\3\2\2\2\u016d\u016e"+
		"\7>\2\2\u016en\3\2\2\2\u016f\u0170\7>\2\2\u0170\u0171\7?\2\2\u0171p\3"+
		"\2\2\2\u0172\u0173\7?\2\2\u0173\u0174\7?\2\2\u0174r\3\2\2\2\u0175\u0176"+
		"\7#\2\2\u0176\u0177\7?\2\2\u0177t\3\2\2\2\u0178\u017c\7$\2\2\u0179\u017b"+
		"\n\6\2\2\u017a\u0179\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017d\3\2\2\2\u017c"+
		"\u017a\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0180\7$"+
		"\2\2\u0180v\3\2\2\2\u0181\u0182\t\7\2\2\u0182\u0183\3\2\2\2\u0183\u0184"+
		"\b<\2\2\u0184x\3\2\2\2\f\2\u00c6\u00c9\u00ce\u00d3\u00d8\u00e2\u0156\u015c"+
		"\u017c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}