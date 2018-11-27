// Generated from /Users/Scott/IdeaProjects/x0/src/main/resources/X0.g4 by ANTLR 4.7
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class X0Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, COMMENT=15, INT=16, CHAR=17, 
		STR=18, ID_STRING=19, NUM=20, PLUS=21, MINUS=22, MUL=23, DIV=24, GT=25, 
		GEQ=26, LT=27, LEQ=28, EQ=29, NEQ=30, STRING=31, WS=32;
	public static final int
		RULE_program = 0, RULE_declarationList = 1, RULE_declarationStat = 2, 
		RULE_ident = 3, RULE_type = 4, RULE_var = 5, RULE_statementList = 6, RULE_statement = 7, 
		RULE_ifStat = 8, RULE_whileStat = 9, RULE_writeStat = 10, RULE_readStat = 11, 
		RULE_compoundStat = 12, RULE_expressionStat = 13, RULE_expression = 14, 
		RULE_simpleExpr = 15, RULE_relationExpr = 16, RULE_additiveExpr = 17, 
		RULE_term = 18, RULE_factor = 19, RULE_literal = 20;
	public static final String[] ruleNames = {
		"program", "declarationList", "declarationStat", "ident", "type", "var", 
		"statementList", "statement", "ifStat", "whileStat", "writeStat", "readStat", 
		"compoundStat", "expressionStat", "expression", "simpleExpr", "relationExpr", 
		"additiveExpr", "term", "factor", "literal"
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

	@Override
	public String getGrammarFileName() { return "X0.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public X0Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__0);
			setState(43);
			match(T__1);
			setState(44);
			declarationList();
			setState(45);
			statementList();
			setState(46);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationListContext extends ParserRuleContext {
		public List<DeclarationStatContext> declarationStat() {
			return getRuleContexts(DeclarationStatContext.class);
		}
		public DeclarationStatContext declarationStat(int i) {
			return getRuleContext(DeclarationStatContext.class,i);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << STR))) != 0)) {
				{
				{
				setState(48);
				declarationStat();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationStatContext extends ParserRuleContext {
		public DeclarationStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStat; }
	 
		public DeclarationStatContext() { }
		public void copyFrom(DeclarationStatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclArrayContext extends DeclarationStatContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode NUM() { return getToken(X0Parser.NUM, 0); }
		public DeclArrayContext(DeclarationStatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitDeclArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclElementaryContext extends DeclarationStatContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public DeclElementaryContext(DeclarationStatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitDeclElementary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationStatContext declarationStat() throws RecognitionException {
		DeclarationStatContext _localctx = new DeclarationStatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declarationStat);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new DeclElementaryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				type();
				setState(55);
				ident();
				setState(56);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new DeclArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				type();
				setState(59);
				ident();
				setState(60);
				match(T__4);
				setState(61);
				match(NUM);
				setState(62);
				match(T__5);
				setState(63);
				match(T__3);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentContext extends ParserRuleContext {
		public TerminalNode ID_STRING() { return getToken(X0Parser.ID_STRING, 0); }
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(ID_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeStrContext extends TypeContext {
		public TerminalNode STR() { return getToken(X0Parser.STR, 0); }
		public TypeStrContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitTypeStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeIntContext extends TypeContext {
		public TerminalNode INT() { return getToken(X0Parser.INT, 0); }
		public TypeIntContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitTypeInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeCharContext extends TypeContext {
		public TerminalNode CHAR() { return getToken(X0Parser.CHAR, 0); }
		public TypeCharContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitTypeChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new TypeIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(INT);
				}
				break;
			case CHAR:
				_localctx = new TypeCharContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(CHAR);
				}
				break;
			case STR:
				_localctx = new TypeStrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				match(STR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	 
		public VarContext() { }
		public void copyFrom(VarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarElementaryContext extends VarContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public VarElementaryContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitVarElementary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarArrayContext extends VarContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarArrayContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitVarArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var);
		try {
			setState(80);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new VarElementaryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				ident();
				}
				break;
			case 2:
				_localctx = new VarArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				ident();
				setState(76);
				match(T__4);
				setState(77);
				expression();
				setState(78);
				match(T__5);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(82);
				statement();
				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << ID_STRING) | (1L << NUM) | (1L << PLUS) | (1L << MINUS) | (1L << STRING))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public WhileStatContext whileStat() {
			return getRuleContext(WhileStatContext.class,0);
		}
		public ReadStatContext readStat() {
			return getRuleContext(ReadStatContext.class,0);
		}
		public WriteStatContext writeStat() {
			return getRuleContext(WriteStatContext.class,0);
		}
		public CompoundStatContext compoundStat() {
			return getRuleContext(CompoundStatContext.class,0);
		}
		public ExpressionStatContext expressionStat() {
			return getRuleContext(ExpressionStatContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				ifStat();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				whileStat();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				readStat();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				writeStat();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 5);
				{
				setState(91);
				compoundStat();
				}
				break;
			case T__3:
			case T__7:
			case ID_STRING:
			case NUM:
			case PLUS:
			case MINUS:
			case STRING:
				enterOuterAlt(_localctx, 6);
				{
				setState(92);
				expressionStat();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatContext ifStat() throws RecognitionException {
		IfStatContext _localctx = new IfStatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifStat);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(T__6);
				setState(96);
				match(T__7);
				setState(97);
				expression();
				setState(98);
				match(T__8);
				setState(99);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(T__6);
				setState(102);
				match(T__7);
				setState(103);
				expression();
				setState(104);
				match(T__8);
				setState(105);
				statement();
				setState(106);
				match(T__9);
				setState(107);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitWhileStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatContext whileStat() throws RecognitionException {
		WhileStatContext _localctx = new WhileStatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(T__10);
			setState(112);
			match(T__7);
			setState(113);
			expression();
			setState(114);
			match(T__8);
			setState(115);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WriteStatContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WriteStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitWriteStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteStatContext writeStat() throws RecognitionException {
		WriteStatContext _localctx = new WriteStatContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_writeStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__11);
			setState(118);
			expression();
			setState(119);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReadStatContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ReadStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitReadStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadStatContext readStat() throws RecognitionException {
		ReadStatContext _localctx = new ReadStatContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_readStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__12);
			setState(122);
			var();
			setState(123);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundStatContext extends ParserRuleContext {
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public CompoundStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitCompoundStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatContext compoundStat() throws RecognitionException {
		CompoundStatContext _localctx = new CompoundStatContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_compoundStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__1);
			setState(126);
			statementList();
			setState(127);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitExpressionStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatContext expressionStat() throws RecognitionException {
		ExpressionStatContext _localctx = new ExpressionStatContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expressionStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << ID_STRING) | (1L << NUM) | (1L << PLUS) | (1L << MINUS) | (1L << STRING))) != 0)) {
				{
				setState(129);
				expression();
				}
			}

			setState(132);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprSimpleWrapperContext extends ExpressionContext {
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public ExprSimpleWrapperContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitExprSimpleWrapper(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAssignContext extends ExpressionContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprAssignContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitExprAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expression);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new ExprAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				var();
				setState(135);
				match(T__13);
				setState(136);
				expression();
				}
				break;
			case 2:
				_localctx = new ExprSimpleWrapperContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				simpleExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleExprContext extends ParserRuleContext {
		public AdditiveExprContext additiveExpr() {
			return getRuleContext(AdditiveExprContext.class,0);
		}
		public RelationExprContext relationExpr() {
			return getRuleContext(RelationExprContext.class,0);
		}
		public SimpleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitSimpleExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExprContext simpleExpr() throws RecognitionException {
		SimpleExprContext _localctx = new SimpleExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_simpleExpr);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				additiveExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				relationExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationExprContext extends ParserRuleContext {
		public Token op;
		public List<AdditiveExprContext> additiveExpr() {
			return getRuleContexts(AdditiveExprContext.class);
		}
		public AdditiveExprContext additiveExpr(int i) {
			return getRuleContext(AdditiveExprContext.class,i);
		}
		public TerminalNode GT() { return getToken(X0Parser.GT, 0); }
		public TerminalNode GEQ() { return getToken(X0Parser.GEQ, 0); }
		public TerminalNode LT() { return getToken(X0Parser.LT, 0); }
		public TerminalNode LEQ() { return getToken(X0Parser.LEQ, 0); }
		public TerminalNode EQ() { return getToken(X0Parser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(X0Parser.NEQ, 0); }
		public RelationExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitRelationExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationExprContext relationExpr() throws RecognitionException {
		RelationExprContext _localctx = new RelationExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_relationExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			additiveExpr(0);
			setState(146);
			((RelationExprContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GEQ) | (1L << LT) | (1L << LEQ) | (1L << EQ) | (1L << NEQ))) != 0)) ) {
				((RelationExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(147);
			additiveExpr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditiveExprContext extends ParserRuleContext {
		public AdditiveExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpr; }
	 
		public AdditiveExprContext() { }
		public void copyFrom(AdditiveExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AdditiveExprRecursiveContext extends AdditiveExprContext {
		public Token op;
		public AdditiveExprContext additiveExpr() {
			return getRuleContext(AdditiveExprContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(X0Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(X0Parser.MINUS, 0); }
		public AdditiveExprRecursiveContext(AdditiveExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitAdditiveExprRecursive(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditiveExprDefaultContext extends AdditiveExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(X0Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(X0Parser.MINUS, 0); }
		public AdditiveExprDefaultContext(AdditiveExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitAdditiveExprDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExprContext additiveExpr() throws RecognitionException {
		return additiveExpr(0);
	}

	private AdditiveExprContext additiveExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExprContext _localctx = new AdditiveExprContext(_ctx, _parentState);
		AdditiveExprContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_additiveExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AdditiveExprDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(150);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(153);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AdditiveExprRecursiveContext(new AdditiveExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_additiveExpr);
					setState(155);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(156);
					((AdditiveExprRecursiveContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
						((AdditiveExprRecursiveContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(157);
					term(0);
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TermDefaultContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermDefaultContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitTermDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TermRecursiveContext extends TermContext {
		public Token op;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode MUL() { return getToken(X0Parser.MUL, 0); }
		public TerminalNode DIV() { return getToken(X0Parser.DIV, 0); }
		public TermRecursiveContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitTermRecursive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(164);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermRecursiveContext(new TermContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(166);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(167);
					((TermRecursiveContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==MUL || _la==DIV) ) {
						((TermRecursiveContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(168);
					factor();
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FactorVariableContext extends FactorContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public FactorVariableContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitFactorVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorLiteralContext extends FactorContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public FactorLiteralContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitFactorLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactorRecursiveContext extends FactorContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FactorRecursiveContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitFactorRecursive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_factor);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				_localctx = new FactorRecursiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(T__7);
				setState(175);
				expression();
				setState(176);
				match(T__8);
				}
				break;
			case ID_STRING:
				_localctx = new FactorVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				var();
				}
				break;
			case NUM:
			case STRING:
				_localctx = new FactorLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				literal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LiteralStringContext extends LiteralContext {
		public TerminalNode STRING() { return getToken(X0Parser.STRING, 0); }
		public LiteralStringContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitLiteralString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralIntegerContext extends LiteralContext {
		public TerminalNode NUM() { return getToken(X0Parser.NUM, 0); }
		public LiteralIntegerContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitLiteralInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_literal);
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				_localctx = new LiteralIntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(NUM);
				}
				break;
			case STRING:
				_localctx = new LiteralStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return additiveExpr_sempred((AdditiveExprContext)_localctx, predIndex);
		case 18:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean additiveExpr_sempred(AdditiveExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00bd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2\3\3\7"+
		"\3\64\n\3\f\3\16\3\67\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4D\n\4\3\5\3\5\3\6\3\6\3\6\5\6K\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7S\n"+
		"\7\3\b\6\bV\n\b\r\b\16\bW\3\t\3\t\3\t\3\t\3\t\3\t\5\t`\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\np\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17"+
		"\5\17\u0085\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u008e\n\20\3"+
		"\21\3\21\5\21\u0092\n\21\3\22\3\22\3\22\3\22\3\23\3\23\5\23\u009a\n\23"+
		"\3\23\3\23\3\23\3\23\3\23\7\23\u00a1\n\23\f\23\16\23\u00a4\13\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\7\24\u00ac\n\24\f\24\16\24\u00af\13\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u00b7\n\25\3\26\3\26\5\26\u00bb\n\26\3"+
		"\26\2\4$&\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\5\3\2\33"+
		" \3\2\27\30\3\2\31\32\2\u00bc\2,\3\2\2\2\4\65\3\2\2\2\6C\3\2\2\2\bE\3"+
		"\2\2\2\nJ\3\2\2\2\fR\3\2\2\2\16U\3\2\2\2\20_\3\2\2\2\22o\3\2\2\2\24q\3"+
		"\2\2\2\26w\3\2\2\2\30{\3\2\2\2\32\177\3\2\2\2\34\u0084\3\2\2\2\36\u008d"+
		"\3\2\2\2 \u0091\3\2\2\2\"\u0093\3\2\2\2$\u0097\3\2\2\2&\u00a5\3\2\2\2"+
		"(\u00b6\3\2\2\2*\u00ba\3\2\2\2,-\7\3\2\2-.\7\4\2\2./\5\4\3\2/\60\5\16"+
		"\b\2\60\61\7\5\2\2\61\3\3\2\2\2\62\64\5\6\4\2\63\62\3\2\2\2\64\67\3\2"+
		"\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\5\3\2\2\2\67\65\3\2\2\289\5\n\6\2"+
		"9:\5\b\5\2:;\7\6\2\2;D\3\2\2\2<=\5\n\6\2=>\5\b\5\2>?\7\7\2\2?@\7\26\2"+
		"\2@A\7\b\2\2AB\7\6\2\2BD\3\2\2\2C8\3\2\2\2C<\3\2\2\2D\7\3\2\2\2EF\7\25"+
		"\2\2F\t\3\2\2\2GK\7\22\2\2HK\7\23\2\2IK\7\24\2\2JG\3\2\2\2JH\3\2\2\2J"+
		"I\3\2\2\2K\13\3\2\2\2LS\5\b\5\2MN\5\b\5\2NO\7\7\2\2OP\5\36\20\2PQ\7\b"+
		"\2\2QS\3\2\2\2RL\3\2\2\2RM\3\2\2\2S\r\3\2\2\2TV\5\20\t\2UT\3\2\2\2VW\3"+
		"\2\2\2WU\3\2\2\2WX\3\2\2\2X\17\3\2\2\2Y`\5\22\n\2Z`\5\24\13\2[`\5\30\r"+
		"\2\\`\5\26\f\2]`\5\32\16\2^`\5\34\17\2_Y\3\2\2\2_Z\3\2\2\2_[\3\2\2\2_"+
		"\\\3\2\2\2_]\3\2\2\2_^\3\2\2\2`\21\3\2\2\2ab\7\t\2\2bc\7\n\2\2cd\5\36"+
		"\20\2de\7\13\2\2ef\5\20\t\2fp\3\2\2\2gh\7\t\2\2hi\7\n\2\2ij\5\36\20\2"+
		"jk\7\13\2\2kl\5\20\t\2lm\7\f\2\2mn\5\20\t\2np\3\2\2\2oa\3\2\2\2og\3\2"+
		"\2\2p\23\3\2\2\2qr\7\r\2\2rs\7\n\2\2st\5\36\20\2tu\7\13\2\2uv\5\20\t\2"+
		"v\25\3\2\2\2wx\7\16\2\2xy\5\36\20\2yz\7\6\2\2z\27\3\2\2\2{|\7\17\2\2|"+
		"}\5\f\7\2}~\7\6\2\2~\31\3\2\2\2\177\u0080\7\4\2\2\u0080\u0081\5\16\b\2"+
		"\u0081\u0082\7\5\2\2\u0082\33\3\2\2\2\u0083\u0085\5\36\20\2\u0084\u0083"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\7\6\2\2\u0087"+
		"\35\3\2\2\2\u0088\u0089\5\f\7\2\u0089\u008a\7\20\2\2\u008a\u008b\5\36"+
		"\20\2\u008b\u008e\3\2\2\2\u008c\u008e\5 \21\2\u008d\u0088\3\2\2\2\u008d"+
		"\u008c\3\2\2\2\u008e\37\3\2\2\2\u008f\u0092\5$\23\2\u0090\u0092\5\"\22"+
		"\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092!\3\2\2\2\u0093\u0094"+
		"\5$\23\2\u0094\u0095\t\2\2\2\u0095\u0096\5$\23\2\u0096#\3\2\2\2\u0097"+
		"\u0099\b\23\1\2\u0098\u009a\t\3\2\2\u0099\u0098\3\2\2\2\u0099\u009a\3"+
		"\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\5&\24\2\u009c\u00a2\3\2\2\2\u009d"+
		"\u009e\f\4\2\2\u009e\u009f\t\3\2\2\u009f\u00a1\5&\24\2\u00a0\u009d\3\2"+
		"\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"%\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\b\24\1\2\u00a6\u00a7\5(\25\2"+
		"\u00a7\u00ad\3\2\2\2\u00a8\u00a9\f\4\2\2\u00a9\u00aa\t\4\2\2\u00aa\u00ac"+
		"\5(\25\2\u00ab\u00a8\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\'\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7\n\2\2"+
		"\u00b1\u00b2\5\36\20\2\u00b2\u00b3\7\13\2\2\u00b3\u00b7\3\2\2\2\u00b4"+
		"\u00b7\5\f\7\2\u00b5\u00b7\5*\26\2\u00b6\u00b0\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b6\u00b5\3\2\2\2\u00b7)\3\2\2\2\u00b8\u00bb\7\26\2\2\u00b9\u00bb"+
		"\7!\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb+\3\2\2\2\21\65C"+
		"JRW_o\u0084\u008d\u0091\u0099\u00a2\u00ad\u00b6\u00ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}