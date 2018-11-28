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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		DecimalFloatingPointLiteral=18, COMMENT=19, INT=20, CHAR=21, STR=22, FLOAT=23, 
		BOOL=24, TRUE=25, FALSE=26, CONTINUE=27, BREAK=28, AND=29, OR=30, NOT=31, 
		ID_STRING=32, NUM=33, PLUS=34, MINUS=35, MUL=36, DIV=37, MOD=38, GT=39, 
		GEQ=40, LT=41, LEQ=42, EQ=43, NEQ=44, STRING=45, WS=46;
	public static final int
		RULE_program = 0, RULE_declarationList = 1, RULE_declarationStat = 2, 
		RULE_ident = 3, RULE_type = 4, RULE_var = 5, RULE_statementList = 6, RULE_statement = 7, 
		RULE_continueStat = 8, RULE_breakStat = 9, RULE_ifStat = 10, RULE_whileStat = 11, 
		RULE_forStat = 12, RULE_writeStat = 13, RULE_readStat = 14, RULE_compoundStat = 15, 
		RULE_expressionStat = 16, RULE_expression = 17, RULE_simpleExpr = 18, 
		RULE_conditionTerm = 19, RULE_conditionFactor = 20, RULE_additiveExpr = 21, 
		RULE_term = 22, RULE_factor = 23, RULE_literal = 24;
	public static final String[] ruleNames = {
		"program", "declarationList", "declarationStat", "ident", "type", "var", 
		"statementList", "statement", "continueStat", "breakStat", "ifStat", "whileStat", 
		"forStat", "writeStat", "readStat", "compoundStat", "expressionStat", 
		"expression", "simpleExpr", "conditionTerm", "conditionFactor", "additiveExpr", 
		"term", "factor", "literal"
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
			setState(50);
			match(T__0);
			setState(51);
			match(T__1);
			setState(52);
			declarationList();
			setState(53);
			statementList();
			setState(54);
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
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << STR) | (1L << FLOAT) | (1L << BOOL))) != 0)) {
				{
				{
				setState(56);
				declarationStat();
				}
				}
				setState(61);
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
		public List<TerminalNode> NUM() { return getTokens(X0Parser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(X0Parser.NUM, i);
		}
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
			int _alt;
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new DeclElementaryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				type();
				setState(63);
				ident();
				setState(64);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new DeclArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				type();
				setState(67);
				ident();
				setState(68);
				match(T__4);
				setState(69);
				match(NUM);
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(70);
						match(T__5);
						setState(71);
						match(T__4);
						setState(72);
						match(NUM);
						}
						} 
					}
					setState(77);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				setState(78);
				match(T__5);
				setState(79);
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
			setState(83);
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
	public static class TypeFloatContext extends TypeContext {
		public TerminalNode FLOAT() { return getToken(X0Parser.FLOAT, 0); }
		public TypeFloatContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitTypeFloat(this);
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
	public static class TypeBoolContext extends TypeContext {
		public TerminalNode BOOL() { return getToken(X0Parser.BOOL, 0); }
		public TypeBoolContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitTypeBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new TypeIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(INT);
				}
				break;
			case CHAR:
				_localctx = new TypeCharContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(CHAR);
				}
				break;
			case STR:
				_localctx = new TypeStrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				match(STR);
				}
				break;
			case FLOAT:
				_localctx = new TypeFloatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				match(FLOAT);
				}
				break;
			case BOOL:
				_localctx = new TypeBoolContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(89);
				match(BOOL);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
			int _alt;
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new VarElementaryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				ident();
				}
				break;
			case 2:
				_localctx = new VarArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				ident();
				setState(94);
				match(T__4);
				setState(95);
				expression();
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(96);
						match(T__5);
						setState(97);
						match(T__4);
						setState(98);
						expression();
						}
						} 
					}
					setState(103);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(104);
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
			setState(109); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(108);
				statement();
				}
				}
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << DecimalFloatingPointLiteral) | (1L << TRUE) | (1L << FALSE) | (1L << CONTINUE) | (1L << BREAK) | (1L << NOT) | (1L << ID_STRING) | (1L << NUM) | (1L << PLUS) | (1L << MINUS) | (1L << STRING))) != 0) );
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
		public ContinueStatContext continueStat() {
			return getRuleContext(ContinueStatContext.class,0);
		}
		public BreakStatContext breakStat() {
			return getRuleContext(BreakStatContext.class,0);
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
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				ifStat();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				whileStat();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				readStat();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				writeStat();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 5);
				{
				setState(117);
				compoundStat();
				}
				break;
			case T__3:
			case T__7:
			case T__15:
			case T__16:
			case DecimalFloatingPointLiteral:
			case TRUE:
			case FALSE:
			case NOT:
			case ID_STRING:
			case NUM:
			case PLUS:
			case MINUS:
			case STRING:
				enterOuterAlt(_localctx, 6);
				{
				setState(118);
				expressionStat();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 7);
				{
				setState(119);
				forStat();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(120);
				continueStat();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 9);
				{
				setState(121);
				breakStat();
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

	public static class ContinueStatContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(X0Parser.CONTINUE, 0); }
		public ContinueStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitContinueStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatContext continueStat() throws RecognitionException {
		ContinueStatContext _localctx = new ContinueStatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_continueStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(CONTINUE);
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

	public static class BreakStatContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(X0Parser.BREAK, 0); }
		public BreakStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitBreakStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatContext breakStat() throws RecognitionException {
		BreakStatContext _localctx = new BreakStatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_breakStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(BREAK);
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
		enterRule(_localctx, 20, RULE_ifStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__6);
			setState(129);
			match(T__7);
			setState(130);
			expression();
			setState(131);
			match(T__8);
			setState(132);
			statement();
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(133);
				match(T__9);
				setState(134);
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
		enterRule(_localctx, 22, RULE_whileStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__10);
			setState(138);
			match(T__7);
			setState(139);
			expression();
			setState(140);
			match(T__8);
			setState(141);
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
		enterRule(_localctx, 24, RULE_forStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(T__11);
			setState(144);
			match(T__7);
			setState(145);
			expression();
			setState(146);
			match(T__3);
			setState(147);
			expression();
			setState(148);
			match(T__3);
			setState(149);
			expression();
			setState(150);
			match(T__8);
			setState(151);
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
		enterRule(_localctx, 26, RULE_writeStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(T__12);
			setState(154);
			expression();
			setState(155);
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
		enterRule(_localctx, 28, RULE_readStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__13);
			setState(158);
			var();
			setState(159);
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
		enterRule(_localctx, 30, RULE_compoundStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__1);
			setState(162);
			statementList();
			setState(163);
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
		enterRule(_localctx, 32, RULE_expressionStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__15) | (1L << T__16) | (1L << DecimalFloatingPointLiteral) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ID_STRING) | (1L << NUM) | (1L << PLUS) | (1L << MINUS) | (1L << STRING))) != 0)) {
				{
				setState(165);
				expression();
				}
			}

			setState(168);
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
	public static class ExprSelfIncreaseContext extends ExpressionContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExprSelfIncreaseContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitExprSelfIncrease(this);
			else return visitor.visitChildren(this);
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
	public static class ExprSelfDecreaseContext extends ExpressionContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExprSelfDecreaseContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitExprSelfDecrease(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expression);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new ExprAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				var();
				setState(171);
				match(T__14);
				setState(172);
				expression();
				}
				break;
			case 2:
				_localctx = new ExprSelfIncreaseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(T__15);
				setState(175);
				var();
				}
				break;
			case 3:
				_localctx = new ExprSelfDecreaseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				match(T__16);
				setState(177);
				var();
				}
				break;
			case 4:
				_localctx = new ExprSimpleWrapperContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				simpleExpr(0);
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
		public SimpleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpr; }
	 
		public SimpleExprContext() { }
		public void copyFrom(SimpleExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConditionExprSimpleContext extends SimpleExprContext {
		public ConditionTermContext conditionTerm() {
			return getRuleContext(ConditionTermContext.class,0);
		}
		public ConditionExprSimpleContext(SimpleExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitConditionExprSimple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionExprRecursiveContext extends SimpleExprContext {
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode OR() { return getToken(X0Parser.OR, 0); }
		public ConditionTermContext conditionTerm() {
			return getRuleContext(ConditionTermContext.class,0);
		}
		public ConditionExprRecursiveContext(SimpleExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitConditionExprRecursive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExprContext simpleExpr() throws RecognitionException {
		return simpleExpr(0);
	}

	private SimpleExprContext simpleExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleExprContext _localctx = new SimpleExprContext(_ctx, _parentState);
		SimpleExprContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_simpleExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ConditionExprSimpleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(182);
			conditionTerm(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionExprRecursiveContext(new SimpleExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
					setState(184);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(185);
					match(OR);
					setState(186);
					conditionTerm(0);
					}
					} 
				}
				setState(191);
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

	public static class ConditionTermContext extends ParserRuleContext {
		public ConditionTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionTerm; }
	 
		public ConditionTermContext() { }
		public void copyFrom(ConditionTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConditionTermNotContext extends ConditionTermContext {
		public ConditionFactorContext conditionFactor() {
			return getRuleContext(ConditionFactorContext.class,0);
		}
		public TerminalNode NOT() { return getToken(X0Parser.NOT, 0); }
		public ConditionTermNotContext(ConditionTermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitConditionTermNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionTermRecursiveContext extends ConditionTermContext {
		public ConditionTermContext conditionTerm() {
			return getRuleContext(ConditionTermContext.class,0);
		}
		public TerminalNode AND() { return getToken(X0Parser.AND, 0); }
		public ConditionFactorContext conditionFactor() {
			return getRuleContext(ConditionFactorContext.class,0);
		}
		public ConditionTermRecursiveContext(ConditionTermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitConditionTermRecursive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionTermContext conditionTerm() throws RecognitionException {
		return conditionTerm(0);
	}

	private ConditionTermContext conditionTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionTermContext _localctx = new ConditionTermContext(_ctx, _parentState);
		ConditionTermContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_conditionTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ConditionTermNotContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(193);
				match(NOT);
				}
			}

			setState(196);
			conditionFactor();
			}
			_ctx.stop = _input.LT(-1);
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionTermRecursiveContext(new ConditionTermContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_conditionTerm);
					setState(198);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(199);
					match(AND);
					setState(200);
					conditionFactor();
					}
					} 
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class ConditionFactorContext extends ParserRuleContext {
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
		public ConditionFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionFactor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitConditionFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionFactorContext conditionFactor() throws RecognitionException {
		ConditionFactorContext _localctx = new ConditionFactorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_conditionFactor);
		int _la;
		try {
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				additiveExpr(0);
				setState(207);
				((ConditionFactorContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GEQ) | (1L << LT) | (1L << LEQ) | (1L << EQ) | (1L << NEQ))) != 0)) ) {
					((ConditionFactorContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(208);
				additiveExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				additiveExpr(0);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_additiveExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AdditiveExprDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(214);
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
				break;
			}
			setState(217);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AdditiveExprRecursiveContext(new AdditiveExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_additiveExpr);
					setState(219);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(220);
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
					setState(221);
					term(0);
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(228);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermRecursiveContext(new TermContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(230);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(231);
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
					setState(232);
					factor();
					}
					} 
				}
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		enterRule(_localctx, 46, RULE_factor);
		try {
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				_localctx = new FactorRecursiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(T__7);
				setState(239);
				expression();
				setState(240);
				match(T__8);
				}
				break;
			case ID_STRING:
				_localctx = new FactorVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				var();
				}
				break;
			case DecimalFloatingPointLiteral:
			case TRUE:
			case FALSE:
			case NUM:
			case PLUS:
			case MINUS:
			case STRING:
				_localctx = new FactorLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(243);
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
		public TerminalNode PLUS() { return getToken(X0Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(X0Parser.MINUS, 0); }
		public LiteralIntegerContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitLiteralInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralBoolContext extends LiteralContext {
		public TerminalNode TRUE() { return getToken(X0Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(X0Parser.FALSE, 0); }
		public LiteralBoolContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitLiteralBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralFloatContext extends LiteralContext {
		public TerminalNode DecimalFloatingPointLiteral() { return getToken(X0Parser.DecimalFloatingPointLiteral, 0); }
		public TerminalNode PLUS() { return getToken(X0Parser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(X0Parser.MINUS, 0); }
		public LiteralFloatContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitLiteralFloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_literal);
		int _la;
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new LiteralIntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(246);
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

				setState(249);
				match(NUM);
				}
				break;
			case 2:
				_localctx = new LiteralStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(STRING);
				}
				break;
			case 3:
				_localctx = new LiteralBoolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				_localctx = new LiteralFloatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(252);
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

				setState(255);
				match(DecimalFloatingPointLiteral);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return simpleExpr_sempred((SimpleExprContext)_localctx, predIndex);
		case 19:
			return conditionTerm_sempred((ConditionTermContext)_localctx, predIndex);
		case 21:
			return additiveExpr_sempred((AdditiveExprContext)_localctx, predIndex);
		case 22:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean simpleExpr_sempred(SimpleExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean conditionTerm_sempred(ConditionTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean additiveExpr_sempred(AdditiveExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0105\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\3\7\3<\n\3\f\3\16\3?\13\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4L\n\4\f\4\16\4O\13\4\3\4\3\4\3"+
		"\4\5\4T\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6]\n\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\7\7f\n\7\f\7\16\7i\13\7\3\7\3\7\5\7m\n\7\3\b\6\bp\n\b\r\b\16\b"+
		"q\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t}\n\t\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\f\u008a\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\22\5\22\u00a9\n\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00b6\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\7\24\u00be\n\24\f\24\16\24\u00c1\13\24\3\25\3\25\5\25\u00c5"+
		"\n\25\3\25\3\25\3\25\3\25\3\25\7\25\u00cc\n\25\f\25\16\25\u00cf\13\25"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u00d6\n\26\3\27\3\27\5\27\u00da\n\27\3"+
		"\27\3\27\3\27\3\27\3\27\7\27\u00e1\n\27\f\27\16\27\u00e4\13\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\7\30\u00ec\n\30\f\30\16\30\u00ef\13\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\5\31\u00f7\n\31\3\32\5\32\u00fa\n\32\3\32\3\32"+
		"\3\32\3\32\5\32\u0100\n\32\3\32\5\32\u0103\n\32\3\32\2\6&(,.\33\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\6\3\2).\3\2$%\3\2&"+
		"(\3\2\33\34\2\u0110\2\64\3\2\2\2\4=\3\2\2\2\6S\3\2\2\2\bU\3\2\2\2\n\\"+
		"\3\2\2\2\fl\3\2\2\2\16o\3\2\2\2\20|\3\2\2\2\22~\3\2\2\2\24\u0080\3\2\2"+
		"\2\26\u0082\3\2\2\2\30\u008b\3\2\2\2\32\u0091\3\2\2\2\34\u009b\3\2\2\2"+
		"\36\u009f\3\2\2\2 \u00a3\3\2\2\2\"\u00a8\3\2\2\2$\u00b5\3\2\2\2&\u00b7"+
		"\3\2\2\2(\u00c2\3\2\2\2*\u00d5\3\2\2\2,\u00d7\3\2\2\2.\u00e5\3\2\2\2\60"+
		"\u00f6\3\2\2\2\62\u0102\3\2\2\2\64\65\7\3\2\2\65\66\7\4\2\2\66\67\5\4"+
		"\3\2\678\5\16\b\289\7\5\2\29\3\3\2\2\2:<\5\6\4\2;:\3\2\2\2<?\3\2\2\2="+
		";\3\2\2\2=>\3\2\2\2>\5\3\2\2\2?=\3\2\2\2@A\5\n\6\2AB\5\b\5\2BC\7\6\2\2"+
		"CT\3\2\2\2DE\5\n\6\2EF\5\b\5\2FG\7\7\2\2GM\7#\2\2HI\7\b\2\2IJ\7\7\2\2"+
		"JL\7#\2\2KH\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2"+
		"PQ\7\b\2\2QR\7\6\2\2RT\3\2\2\2S@\3\2\2\2SD\3\2\2\2T\7\3\2\2\2UV\7\"\2"+
		"\2V\t\3\2\2\2W]\7\26\2\2X]\7\27\2\2Y]\7\30\2\2Z]\7\31\2\2[]\7\32\2\2\\"+
		"W\3\2\2\2\\X\3\2\2\2\\Y\3\2\2\2\\Z\3\2\2\2\\[\3\2\2\2]\13\3\2\2\2^m\5"+
		"\b\5\2_`\5\b\5\2`a\7\7\2\2ag\5$\23\2bc\7\b\2\2cd\7\7\2\2df\5$\23\2eb\3"+
		"\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7\b\2\2km\3"+
		"\2\2\2l^\3\2\2\2l_\3\2\2\2m\r\3\2\2\2np\5\20\t\2on\3\2\2\2pq\3\2\2\2q"+
		"o\3\2\2\2qr\3\2\2\2r\17\3\2\2\2s}\5\26\f\2t}\5\30\r\2u}\5\36\20\2v}\5"+
		"\34\17\2w}\5 \21\2x}\5\"\22\2y}\5\32\16\2z}\5\22\n\2{}\5\24\13\2|s\3\2"+
		"\2\2|t\3\2\2\2|u\3\2\2\2|v\3\2\2\2|w\3\2\2\2|x\3\2\2\2|y\3\2\2\2|z\3\2"+
		"\2\2|{\3\2\2\2}\21\3\2\2\2~\177\7\35\2\2\177\23\3\2\2\2\u0080\u0081\7"+
		"\36\2\2\u0081\25\3\2\2\2\u0082\u0083\7\t\2\2\u0083\u0084\7\n\2\2\u0084"+
		"\u0085\5$\23\2\u0085\u0086\7\13\2\2\u0086\u0089\5\20\t\2\u0087\u0088\7"+
		"\f\2\2\u0088\u008a\5\20\t\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\27\3\2\2\2\u008b\u008c\7\r\2\2\u008c\u008d\7\n\2\2\u008d\u008e\5$\23"+
		"\2\u008e\u008f\7\13\2\2\u008f\u0090\5\20\t\2\u0090\31\3\2\2\2\u0091\u0092"+
		"\7\16\2\2\u0092\u0093\7\n\2\2\u0093\u0094\5$\23\2\u0094\u0095\7\6\2\2"+
		"\u0095\u0096\5$\23\2\u0096\u0097\7\6\2\2\u0097\u0098\5$\23\2\u0098\u0099"+
		"\7\13\2\2\u0099\u009a\5\20\t\2\u009a\33\3\2\2\2\u009b\u009c\7\17\2\2\u009c"+
		"\u009d\5$\23\2\u009d\u009e\7\6\2\2\u009e\35\3\2\2\2\u009f\u00a0\7\20\2"+
		"\2\u00a0\u00a1\5\f\7\2\u00a1\u00a2\7\6\2\2\u00a2\37\3\2\2\2\u00a3\u00a4"+
		"\7\4\2\2\u00a4\u00a5\5\16\b\2\u00a5\u00a6\7\5\2\2\u00a6!\3\2\2\2\u00a7"+
		"\u00a9\5$\23\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00ab\7\6\2\2\u00ab#\3\2\2\2\u00ac\u00ad\5\f\7\2\u00ad\u00ae"+
		"\7\21\2\2\u00ae\u00af\5$\23\2\u00af\u00b6\3\2\2\2\u00b0\u00b1\7\22\2\2"+
		"\u00b1\u00b6\5\f\7\2\u00b2\u00b3\7\23\2\2\u00b3\u00b6\5\f\7\2\u00b4\u00b6"+
		"\5&\24\2\u00b5\u00ac\3\2\2\2\u00b5\u00b0\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b5"+
		"\u00b4\3\2\2\2\u00b6%\3\2\2\2\u00b7\u00b8\b\24\1\2\u00b8\u00b9\5(\25\2"+
		"\u00b9\u00bf\3\2\2\2\u00ba\u00bb\f\4\2\2\u00bb\u00bc\7 \2\2\u00bc\u00be"+
		"\5(\25\2\u00bd\u00ba\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\'\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c4\b\25\1"+
		"\2\u00c3\u00c5\7!\2\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6"+
		"\3\2\2\2\u00c6\u00c7\5*\26\2\u00c7\u00cd\3\2\2\2\u00c8\u00c9\f\4\2\2\u00c9"+
		"\u00ca\7\37\2\2\u00ca\u00cc\5*\26\2\u00cb\u00c8\3\2\2\2\u00cc\u00cf\3"+
		"\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce)\3\2\2\2\u00cf\u00cd"+
		"\3\2\2\2\u00d0\u00d1\5,\27\2\u00d1\u00d2\t\2\2\2\u00d2\u00d3\5,\27\2\u00d3"+
		"\u00d6\3\2\2\2\u00d4\u00d6\5,\27\2\u00d5\u00d0\3\2\2\2\u00d5\u00d4\3\2"+
		"\2\2\u00d6+\3\2\2\2\u00d7\u00d9\b\27\1\2\u00d8\u00da\t\3\2\2\u00d9\u00d8"+
		"\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\5.\30\2\u00dc"+
		"\u00e2\3\2\2\2\u00dd\u00de\f\4\2\2\u00de\u00df\t\3\2\2\u00df\u00e1\5."+
		"\30\2\u00e0\u00dd\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3-\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\b\30\1\2"+
		"\u00e6\u00e7\5\60\31\2\u00e7\u00ed\3\2\2\2\u00e8\u00e9\f\4\2\2\u00e9\u00ea"+
		"\t\4\2\2\u00ea\u00ec\5\60\31\2\u00eb\u00e8\3\2\2\2\u00ec\u00ef\3\2\2\2"+
		"\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee/\3\2\2\2\u00ef\u00ed\3"+
		"\2\2\2\u00f0\u00f1\7\n\2\2\u00f1\u00f2\5$\23\2\u00f2\u00f3\7\13\2\2\u00f3"+
		"\u00f7\3\2\2\2\u00f4\u00f7\5\f\7\2\u00f5\u00f7\5\62\32\2\u00f6\u00f0\3"+
		"\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\61\3\2\2\2\u00f8"+
		"\u00fa\t\3\2\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fb\u0103\7#\2\2\u00fc\u0103\7/\2\2\u00fd\u0103\t\5\2\2\u00fe\u0100"+
		"\t\3\2\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0103\7\24\2\2\u0102\u00f9\3\2\2\2\u0102\u00fc\3\2\2\2\u0102\u00fd\3"+
		"\2\2\2\u0102\u00ff\3\2\2\2\u0103\63\3\2\2\2\30=MS\\glq|\u0089\u00a8\u00b5"+
		"\u00bf\u00c4\u00cd\u00d5\u00d9\u00e2\u00ed\u00f6\u00f9\u00ff\u0102";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}