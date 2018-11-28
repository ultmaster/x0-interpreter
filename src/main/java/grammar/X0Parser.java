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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, COMMENT=16, 
		INT=17, CHAR=18, STR=19, ID_STRING=20, NUM=21, PLUS=22, MINUS=23, MUL=24, 
		DIV=25, MOD=26, GT=27, GEQ=28, LT=29, LEQ=30, EQ=31, NEQ=32, STRING=33, 
		WS=34;
	public static final int
		RULE_program = 0, RULE_declarationList = 1, RULE_declarationStat = 2, 
		RULE_ident = 3, RULE_type = 4, RULE_var = 5, RULE_statementList = 6, RULE_statement = 7, 
		RULE_ifStat = 8, RULE_whileStat = 9, RULE_forStat = 10, RULE_writeStat = 11, 
		RULE_readStat = 12, RULE_compoundStat = 13, RULE_expressionStat = 14, 
		RULE_expression = 15, RULE_simpleExpr = 16, RULE_relationExpr = 17, RULE_additiveExpr = 18, 
		RULE_term = 19, RULE_factor = 20, RULE_literal = 21;
	public static final String[] ruleNames = {
		"program", "declarationList", "declarationStat", "ident", "type", "var", 
		"statementList", "statement", "ifStat", "whileStat", "forStat", "writeStat", 
		"readStat", "compoundStat", "expressionStat", "expression", "simpleExpr", 
		"relationExpr", "additiveExpr", "term", "factor", "literal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main'", "'{'", "'}'", "';'", "'['", "']'", "'if'", "'('", "')'", 
		"'else'", "'while'", "'for'", "'write'", "'read'", "'='", null, "'int'", 
		"'char'", "'str'", null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'>'", 
		"'>='", "'<'", "'<='", "'=='", "'!='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "COMMENT", "INT", "CHAR", "STR", "ID_STRING", 
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
			setState(44);
			match(T__0);
			setState(45);
			match(T__1);
			setState(46);
			declarationList();
			setState(47);
			statementList();
			setState(48);
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
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << STR))) != 0)) {
				{
				{
				setState(50);
				declarationStat();
				}
				}
				setState(55);
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
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new DeclElementaryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				type();
				setState(57);
				ident();
				setState(58);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new DeclArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				type();
				setState(61);
				ident();
				setState(62);
				match(T__4);
				setState(63);
				match(NUM);
				setState(64);
				match(T__5);
				setState(65);
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
			setState(69);
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
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new TypeIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(INT);
				}
				break;
			case CHAR:
				_localctx = new TypeCharContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(CHAR);
				}
				break;
			case STR:
				_localctx = new TypeStrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
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
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new VarElementaryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				ident();
				}
				break;
			case 2:
				_localctx = new VarArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				ident();
				setState(78);
				match(T__4);
				setState(79);
				expression();
				setState(80);
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
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(84);
				statement();
				}
				}
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << ID_STRING) | (1L << NUM) | (1L << PLUS) | (1L << MINUS) | (1L << STRING))) != 0) );
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
		public ForStatContext forStat() {
			return getRuleContext(ForStatContext.class,0);
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
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				ifStat();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				whileStat();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				readStat();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				writeStat();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 5);
				{
				setState(93);
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
				setState(94);
				expressionStat();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 7);
				{
				setState(95);
				forStat();
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
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__6);
			setState(99);
			match(T__7);
			setState(100);
			expression();
			setState(101);
			match(T__8);
			setState(102);
			statement();
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(103);
				match(T__9);
				setState(104);
				statement();
				}
				break;
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
			setState(107);
			match(T__10);
			setState(108);
			match(T__7);
			setState(109);
			expression();
			setState(110);
			match(T__8);
			setState(111);
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

	public static class ForStatContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitForStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatContext forStat() throws RecognitionException {
		ForStatContext _localctx = new ForStatContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__11);
			setState(114);
			match(T__7);
			setState(115);
			expression();
			setState(116);
			match(T__3);
			setState(117);
			expression();
			setState(118);
			match(T__3);
			setState(119);
			expression();
			setState(120);
			match(T__8);
			setState(121);
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
		enterRule(_localctx, 22, RULE_writeStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__12);
			setState(124);
			expression();
			setState(125);
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
		enterRule(_localctx, 24, RULE_readStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__13);
			setState(128);
			var();
			setState(129);
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
		enterRule(_localctx, 26, RULE_compoundStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__1);
			setState(132);
			statementList();
			setState(133);
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
		enterRule(_localctx, 28, RULE_expressionStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << ID_STRING) | (1L << NUM) | (1L << PLUS) | (1L << MINUS) | (1L << STRING))) != 0)) {
				{
				setState(135);
				expression();
				}
			}

			setState(138);
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
		enterRule(_localctx, 30, RULE_expression);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new ExprAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				var();
				setState(141);
				match(T__14);
				setState(142);
				expression();
				}
				break;
			case 2:
				_localctx = new ExprSimpleWrapperContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
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
		enterRule(_localctx, 32, RULE_simpleExpr);
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				additiveExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
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
		enterRule(_localctx, 34, RULE_relationExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			additiveExpr(0);
			setState(152);
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
			setState(153);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_additiveExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AdditiveExprDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(156);
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

			setState(159);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(166);
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
					setState(161);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(162);
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
					setState(163);
					term(0);
					}
					} 
				}
				setState(168);
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
		public TerminalNode MOD() { return getToken(X0Parser.MOD, 0); }
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(170);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(177);
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
					setState(172);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(173);
					((TermRecursiveContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						((TermRecursiveContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(174);
					factor();
					}
					} 
				}
				setState(179);
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
		enterRule(_localctx, 40, RULE_factor);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				_localctx = new FactorRecursiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(T__7);
				setState(181);
				expression();
				setState(182);
				match(T__8);
				}
				break;
			case ID_STRING:
				_localctx = new FactorVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				var();
				}
				break;
			case NUM:
			case STRING:
				_localctx = new FactorLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
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
		enterRule(_localctx, 42, RULE_literal);
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				_localctx = new LiteralIntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(NUM);
				}
				break;
			case STRING:
				_localctx = new LiteralStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
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
		case 18:
			return additiveExpr_sempred((AdditiveExprContext)_localctx, predIndex);
		case 19:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u00c3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\7\3\66\n\3\f\3\16\39\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4F\n\4\3\5\3\5\3\6\3\6\3\6\5\6M\n\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7U\n\7\3\b\6\bX\n\b\r\b\16\bY\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tc\n\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nl\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\20\5\20\u008b\n\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u0094\n\21\3\22\3\22\5\22\u0098\n\22\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\5\24\u00a0\n\24\3\24\3\24\3\24\3\24\3\24\7\24\u00a7\n\24"+
		"\f\24\16\24\u00aa\13\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00b2\n\25"+
		"\f\25\16\25\u00b5\13\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00bd\n\26"+
		"\3\27\3\27\5\27\u00c1\n\27\3\27\2\4&(\30\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,\2\5\3\2\35\"\3\2\30\31\3\2\32\34\2\u00c2\2.\3\2\2\2"+
		"\4\67\3\2\2\2\6E\3\2\2\2\bG\3\2\2\2\nL\3\2\2\2\fT\3\2\2\2\16W\3\2\2\2"+
		"\20b\3\2\2\2\22d\3\2\2\2\24m\3\2\2\2\26s\3\2\2\2\30}\3\2\2\2\32\u0081"+
		"\3\2\2\2\34\u0085\3\2\2\2\36\u008a\3\2\2\2 \u0093\3\2\2\2\"\u0097\3\2"+
		"\2\2$\u0099\3\2\2\2&\u009d\3\2\2\2(\u00ab\3\2\2\2*\u00bc\3\2\2\2,\u00c0"+
		"\3\2\2\2./\7\3\2\2/\60\7\4\2\2\60\61\5\4\3\2\61\62\5\16\b\2\62\63\7\5"+
		"\2\2\63\3\3\2\2\2\64\66\5\6\4\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2"+
		"\2\678\3\2\2\28\5\3\2\2\29\67\3\2\2\2:;\5\n\6\2;<\5\b\5\2<=\7\6\2\2=F"+
		"\3\2\2\2>?\5\n\6\2?@\5\b\5\2@A\7\7\2\2AB\7\27\2\2BC\7\b\2\2CD\7\6\2\2"+
		"DF\3\2\2\2E:\3\2\2\2E>\3\2\2\2F\7\3\2\2\2GH\7\26\2\2H\t\3\2\2\2IM\7\23"+
		"\2\2JM\7\24\2\2KM\7\25\2\2LI\3\2\2\2LJ\3\2\2\2LK\3\2\2\2M\13\3\2\2\2N"+
		"U\5\b\5\2OP\5\b\5\2PQ\7\7\2\2QR\5 \21\2RS\7\b\2\2SU\3\2\2\2TN\3\2\2\2"+
		"TO\3\2\2\2U\r\3\2\2\2VX\5\20\t\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2"+
		"\2Z\17\3\2\2\2[c\5\22\n\2\\c\5\24\13\2]c\5\32\16\2^c\5\30\r\2_c\5\34\17"+
		"\2`c\5\36\20\2ac\5\26\f\2b[\3\2\2\2b\\\3\2\2\2b]\3\2\2\2b^\3\2\2\2b_\3"+
		"\2\2\2b`\3\2\2\2ba\3\2\2\2c\21\3\2\2\2de\7\t\2\2ef\7\n\2\2fg\5 \21\2g"+
		"h\7\13\2\2hk\5\20\t\2ij\7\f\2\2jl\5\20\t\2ki\3\2\2\2kl\3\2\2\2l\23\3\2"+
		"\2\2mn\7\r\2\2no\7\n\2\2op\5 \21\2pq\7\13\2\2qr\5\20\t\2r\25\3\2\2\2s"+
		"t\7\16\2\2tu\7\n\2\2uv\5 \21\2vw\7\6\2\2wx\5 \21\2xy\7\6\2\2yz\5 \21\2"+
		"z{\7\13\2\2{|\5\20\t\2|\27\3\2\2\2}~\7\17\2\2~\177\5 \21\2\177\u0080\7"+
		"\6\2\2\u0080\31\3\2\2\2\u0081\u0082\7\20\2\2\u0082\u0083\5\f\7\2\u0083"+
		"\u0084\7\6\2\2\u0084\33\3\2\2\2\u0085\u0086\7\4\2\2\u0086\u0087\5\16\b"+
		"\2\u0087\u0088\7\5\2\2\u0088\35\3\2\2\2\u0089\u008b\5 \21\2\u008a\u0089"+
		"\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7\6\2\2\u008d"+
		"\37\3\2\2\2\u008e\u008f\5\f\7\2\u008f\u0090\7\21\2\2\u0090\u0091\5 \21"+
		"\2\u0091\u0094\3\2\2\2\u0092\u0094\5\"\22\2\u0093\u008e\3\2\2\2\u0093"+
		"\u0092\3\2\2\2\u0094!\3\2\2\2\u0095\u0098\5&\24\2\u0096\u0098\5$\23\2"+
		"\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098#\3\2\2\2\u0099\u009a\5"+
		"&\24\2\u009a\u009b\t\2\2\2\u009b\u009c\5&\24\2\u009c%\3\2\2\2\u009d\u009f"+
		"\b\24\1\2\u009e\u00a0\t\3\2\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2"+
		"\u00a0\u00a1\3\2\2\2\u00a1\u00a2\5(\25\2\u00a2\u00a8\3\2\2\2\u00a3\u00a4"+
		"\f\4\2\2\u00a4\u00a5\t\3\2\2\u00a5\u00a7\5(\25\2\u00a6\u00a3\3\2\2\2\u00a7"+
		"\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\'\3\2\2\2"+
		"\u00aa\u00a8\3\2\2\2\u00ab\u00ac\b\25\1\2\u00ac\u00ad\5*\26\2\u00ad\u00b3"+
		"\3\2\2\2\u00ae\u00af\f\4\2\2\u00af\u00b0\t\4\2\2\u00b0\u00b2\5*\26\2\u00b1"+
		"\u00ae\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4)\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\7\n\2\2\u00b7\u00b8"+
		"\5 \21\2\u00b8\u00b9\7\13\2\2\u00b9\u00bd\3\2\2\2\u00ba\u00bd\5\f\7\2"+
		"\u00bb\u00bd\5,\27\2\u00bc\u00b6\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb"+
		"\3\2\2\2\u00bd+\3\2\2\2\u00be\u00c1\7\27\2\2\u00bf\u00c1\7#\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1-\3\2\2\2\21\67ELTYbk\u008a\u0093"+
		"\u0097\u009f\u00a8\u00b3\u00bc\u00c0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}