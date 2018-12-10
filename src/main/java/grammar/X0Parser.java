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
		T__17=18, T__18=19, T__19=20, T__20=21, DecimalFloatingPointLiteral=22, 
		COMMENT=23, CHR=24, CONST=25, RETURN=26, INT=27, CHAR=28, STR=29, FLOAT=30, 
		BOOL=31, TRUE=32, FALSE=33, CONTINUE=34, BREAK=35, EXIT=36, AND=37, OR=38, 
		NOT=39, ODD=40, FUNCTION=41, XOR=42, REF=43, ID_STRING=44, NUM=45, PLUS=46, 
		MINUS=47, MUL=48, DIV=49, MOD=50, GT=51, GEQ=52, LT=53, LEQ=54, EQ=55, 
		NEQ=56, STRING=57, WS=58;
	public static final int
		RULE_program = 0, RULE_procedureList = 1, RULE_procedure = 2, RULE_procedureArgument = 3, 
		RULE_declarationList = 4, RULE_declarationStat = 5, RULE_constDecl = 6, 
		RULE_identDecl = 7, RULE_ident = 8, RULE_type = 9, RULE_var = 10, RULE_statementList = 11, 
		RULE_statement = 12, RULE_continueStat = 13, RULE_breakStat = 14, RULE_returnStat = 15, 
		RULE_exitStat = 16, RULE_ifStat = 17, RULE_whileStat = 18, RULE_forStat = 19, 
		RULE_doWhileStat = 20, RULE_repeatUntilStat = 21, RULE_writeStat = 22, 
		RULE_readStat = 23, RULE_compoundStat = 24, RULE_expressionStat = 25, 
		RULE_expression = 26, RULE_callExpr = 27, RULE_callArgument = 28, RULE_simpleExpr = 29, 
		RULE_conditionTerm = 30, RULE_conditionTermNot = 31, RULE_conditionFactor = 32, 
		RULE_additiveExpr = 33, RULE_term = 34, RULE_factor = 35, RULE_literal = 36;
	public static final String[] ruleNames = {
		"program", "procedureList", "procedure", "procedureArgument", "declarationList", 
		"declarationStat", "constDecl", "identDecl", "ident", "type", "var", "statementList", 
		"statement", "continueStat", "breakStat", "returnStat", "exitStat", "ifStat", 
		"whileStat", "forStat", "doWhileStat", "repeatUntilStat", "writeStat", 
		"readStat", "compoundStat", "expressionStat", "expression", "callExpr", 
		"callArgument", "simpleExpr", "conditionTerm", "conditionTermNot", "conditionFactor", 
		"additiveExpr", "term", "factor", "literal"
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
		public List<DeclarationListContext> declarationList() {
			return getRuleContexts(DeclarationListContext.class);
		}
		public DeclarationListContext declarationList(int i) {
			return getRuleContext(DeclarationListContext.class,i);
		}
		public ProcedureListContext procedureList() {
			return getRuleContext(ProcedureListContext.class,0);
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
			setState(74);
			declarationList();
			setState(75);
			procedureList();
			setState(76);
			match(T__0);
			setState(77);
			match(T__1);
			setState(78);
			declarationList();
			setState(79);
			statementList();
			setState(80);
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

	public static class ProcedureListContext extends ParserRuleContext {
		public List<ProcedureContext> procedure() {
			return getRuleContexts(ProcedureContext.class);
		}
		public ProcedureContext procedure(int i) {
			return getRuleContext(ProcedureContext.class,i);
		}
		public ProcedureListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitProcedureList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureListContext procedureList() throws RecognitionException {
		ProcedureListContext _localctx = new ProcedureListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_procedureList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(82);
				procedure();
				}
				}
				setState(87);
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

	public static class ProcedureContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(X0Parser.FUNCTION, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public List<ProcedureArgumentContext> procedureArgument() {
			return getRuleContexts(ProcedureArgumentContext.class);
		}
		public ProcedureArgumentContext procedureArgument(int i) {
			return getRuleContext(ProcedureArgumentContext.class,i);
		}
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitProcedure(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_procedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(FUNCTION);
			setState(89);
			ident();
			setState(90);
			match(T__3);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID_STRING) {
				{
				setState(91);
				procedureArgument();
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(92);
					match(T__4);
					setState(93);
					procedureArgument();
					}
					}
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(101);
			match(T__5);
			setState(102);
			match(T__1);
			setState(103);
			declarationList();
			setState(104);
			statementList();
			setState(105);
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

	public static class ProcedureArgumentContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode REF() { return getToken(X0Parser.REF, 0); }
		public ProcedureArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureArgument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitProcedureArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureArgumentContext procedureArgument() throws RecognitionException {
		ProcedureArgumentContext _localctx = new ProcedureArgumentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_procedureArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			ident();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REF) {
				{
				setState(108);
				match(REF);
				}
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
		enterRule(_localctx, 8, RULE_declarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << INT) | (1L << CHAR) | (1L << STR) | (1L << FLOAT) | (1L << BOOL))) != 0)) {
				{
				{
				setState(111);
				declarationStat();
				}
				}
				setState(116);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<IdentDeclContext> identDecl() {
			return getRuleContexts(IdentDeclContext.class);
		}
		public IdentDeclContext identDecl(int i) {
			return getRuleContext(IdentDeclContext.class,i);
		}
		public TerminalNode CONST() { return getToken(X0Parser.CONST, 0); }
		public List<ConstDeclContext> constDecl() {
			return getRuleContexts(ConstDeclContext.class);
		}
		public ConstDeclContext constDecl(int i) {
			return getRuleContext(ConstDeclContext.class,i);
		}
		public DeclarationStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitDeclarationStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationStatContext declarationStat() throws RecognitionException {
		DeclarationStatContext _localctx = new DeclarationStatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declarationStat);
		int _la;
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case CHAR:
			case STR:
			case FLOAT:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				type();
				setState(118);
				identDecl();
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(119);
					match(T__4);
					setState(120);
					identDecl();
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(126);
				match(T__6);
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(CONST);
				setState(129);
				constDecl();
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(130);
					match(T__4);
					setState(131);
					constDecl();
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(137);
				match(T__6);
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

	public static class ConstDeclContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitConstDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			ident();
			setState(142);
			match(T__7);
			setState(143);
			expression();
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

	public static class IdentDeclContext extends ParserRuleContext {
		public IdentDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identDecl; }
	 
		public IdentDeclContext() { }
		public void copyFrom(IdentDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentDeclArrayContext extends IdentDeclContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IdentDeclArrayContext(IdentDeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitIdentDeclArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentDeclElementaryContext extends IdentDeclContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public IdentDeclElementaryContext(IdentDeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitIdentDeclElementary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentDeclContext identDecl() throws RecognitionException {
		IdentDeclContext _localctx = new IdentDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_identDecl);
		try {
			int _alt;
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new IdentDeclElementaryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				ident();
				}
				break;
			case 2:
				_localctx = new IdentDeclArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				ident();
				setState(147);
				match(T__8);
				setState(148);
				expression();
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(149);
						match(T__9);
						setState(150);
						match(T__8);
						setState(151);
						expression();
						}
						} 
					}
					setState(156);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(157);
				match(T__9);
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
		enterRule(_localctx, 16, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
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
		enterRule(_localctx, 18, RULE_type);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new TypeIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(INT);
				}
				break;
			case CHAR:
				_localctx = new TypeCharContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(CHAR);
				}
				break;
			case STR:
				_localctx = new TypeStrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				match(STR);
				}
				break;
			case FLOAT:
				_localctx = new TypeFloatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				match(FLOAT);
				}
				break;
			case BOOL:
				_localctx = new TypeBoolContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(167);
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
		enterRule(_localctx, 20, RULE_var);
		try {
			int _alt;
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new VarElementaryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				ident();
				}
				break;
			case 2:
				_localctx = new VarArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				ident();
				setState(172);
				match(T__8);
				setState(173);
				expression();
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(174);
						match(T__9);
						setState(175);
						match(T__8);
						setState(176);
						expression();
						}
						} 
					}
					setState(181);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(182);
				match(T__9);
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
		enterRule(_localctx, 22, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(186);
				statement();
				}
				}
				setState(189); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << DecimalFloatingPointLiteral) | (1L << RETURN) | (1L << TRUE) | (1L << FALSE) | (1L << CONTINUE) | (1L << BREAK) | (1L << EXIT) | (1L << NOT) | (1L << ODD) | (1L << ID_STRING) | (1L << NUM) | (1L << PLUS) | (1L << MINUS) | (1L << STRING))) != 0) );
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
		public ExitStatContext exitStat() {
			return getRuleContext(ExitStatContext.class,0);
		}
		public ReturnStatContext returnStat() {
			return getRuleContext(ReturnStatContext.class,0);
		}
		public DoWhileStatContext doWhileStat() {
			return getRuleContext(DoWhileStatContext.class,0);
		}
		public RepeatUntilStatContext repeatUntilStat() {
			return getRuleContext(RepeatUntilStatContext.class,0);
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
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				ifStat();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				whileStat();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				readStat();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
				writeStat();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 5);
				{
				setState(195);
				compoundStat();
				}
				break;
			case T__3:
			case T__6:
			case T__19:
			case T__20:
			case DecimalFloatingPointLiteral:
			case TRUE:
			case FALSE:
			case NOT:
			case ODD:
			case ID_STRING:
			case NUM:
			case PLUS:
			case MINUS:
			case STRING:
				enterOuterAlt(_localctx, 6);
				{
				setState(196);
				expressionStat();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 7);
				{
				setState(197);
				forStat();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(198);
				continueStat();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 9);
				{
				setState(199);
				breakStat();
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 10);
				{
				setState(200);
				exitStat();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 11);
				{
				setState(201);
				returnStat();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 12);
				{
				setState(202);
				doWhileStat();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 13);
				{
				setState(203);
				repeatUntilStat();
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
		enterRule(_localctx, 26, RULE_continueStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(CONTINUE);
			setState(207);
			match(T__6);
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
		enterRule(_localctx, 28, RULE_breakStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(BREAK);
			setState(210);
			match(T__6);
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

	public static class ReturnStatContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(X0Parser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitReturnStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatContext returnStat() throws RecognitionException {
		ReturnStatContext _localctx = new ReturnStatContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_returnStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(RETURN);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__19) | (1L << T__20) | (1L << DecimalFloatingPointLiteral) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ODD) | (1L << ID_STRING) | (1L << NUM) | (1L << PLUS) | (1L << MINUS) | (1L << STRING))) != 0)) {
				{
				setState(213);
				expression();
				}
			}

			setState(216);
			match(T__6);
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

	public static class ExitStatContext extends ParserRuleContext {
		public TerminalNode EXIT() { return getToken(X0Parser.EXIT, 0); }
		public ExitStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exitStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitExitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExitStatContext exitStat() throws RecognitionException {
		ExitStatContext _localctx = new ExitStatContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exitStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(EXIT);
			setState(219);
			match(T__6);
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
		enterRule(_localctx, 34, RULE_ifStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(T__10);
			setState(222);
			match(T__3);
			setState(223);
			expression();
			setState(224);
			match(T__5);
			setState(225);
			statement();
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(226);
				match(T__11);
				setState(227);
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
		enterRule(_localctx, 36, RULE_whileStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(T__12);
			setState(231);
			match(T__3);
			setState(232);
			expression();
			setState(233);
			match(T__5);
			setState(234);
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
		enterRule(_localctx, 38, RULE_forStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(T__13);
			setState(237);
			match(T__3);
			setState(238);
			expression();
			setState(239);
			match(T__6);
			setState(240);
			expression();
			setState(241);
			match(T__6);
			setState(242);
			expression();
			setState(243);
			match(T__5);
			setState(244);
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

	public static class DoWhileStatContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoWhileStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitDoWhileStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatContext doWhileStat() throws RecognitionException {
		DoWhileStatContext _localctx = new DoWhileStatContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_doWhileStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(T__14);
			setState(247);
			statement();
			setState(248);
			match(T__12);
			setState(249);
			match(T__3);
			setState(250);
			expression();
			setState(251);
			match(T__5);
			setState(252);
			match(T__6);
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

	public static class RepeatUntilStatContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RepeatUntilStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatUntilStat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitRepeatUntilStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatUntilStatContext repeatUntilStat() throws RecognitionException {
		RepeatUntilStatContext _localctx = new RepeatUntilStatContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_repeatUntilStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(T__15);
			setState(255);
			statement();
			setState(256);
			match(T__16);
			setState(257);
			match(T__3);
			setState(258);
			expression();
			setState(259);
			match(T__5);
			setState(260);
			match(T__6);
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
		public TerminalNode CHR() { return getToken(X0Parser.CHR, 0); }
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
		enterRule(_localctx, 44, RULE_writeStat);
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(T__17);
				setState(263);
				expression();
				setState(264);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				match(T__17);
				setState(267);
				match(CHR);
				setState(268);
				expression();
				setState(269);
				match(T__6);
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
		enterRule(_localctx, 46, RULE_readStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(T__18);
			setState(274);
			var();
			setState(275);
			match(T__6);
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
		enterRule(_localctx, 48, RULE_compoundStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(T__1);
			setState(278);
			statementList();
			setState(279);
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
		enterRule(_localctx, 50, RULE_expressionStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__19) | (1L << T__20) | (1L << DecimalFloatingPointLiteral) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ODD) | (1L << ID_STRING) | (1L << NUM) | (1L << PLUS) | (1L << MINUS) | (1L << STRING))) != 0)) {
				{
				setState(281);
				expression();
				}
			}

			setState(284);
			match(T__6);
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
		enterRule(_localctx, 52, RULE_expression);
		try {
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new ExprAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				var();
				setState(287);
				match(T__7);
				setState(288);
				expression();
				}
				break;
			case 2:
				_localctx = new ExprSelfIncreaseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				match(T__19);
				setState(291);
				var();
				}
				break;
			case 3:
				_localctx = new ExprSelfDecreaseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				match(T__20);
				setState(293);
				var();
				}
				break;
			case 4:
				_localctx = new ExprSimpleWrapperContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(294);
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

	public static class CallExprContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public List<CallArgumentContext> callArgument() {
			return getRuleContexts(CallArgumentContext.class);
		}
		public CallArgumentContext callArgument(int i) {
			return getRuleContext(CallArgumentContext.class,i);
		}
		public CallExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallExprContext callExpr() throws RecognitionException {
		CallExprContext _localctx = new CallExprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_callExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			ident();
			setState(298);
			match(T__3);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__19) | (1L << T__20) | (1L << DecimalFloatingPointLiteral) | (1L << TRUE) | (1L << FALSE) | (1L << NOT) | (1L << ODD) | (1L << ID_STRING) | (1L << NUM) | (1L << PLUS) | (1L << MINUS) | (1L << STRING))) != 0)) {
				{
				setState(299);
				callArgument();
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(300);
					match(T__4);
					setState(301);
					callArgument();
					}
					}
					setState(306);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(309);
			match(T__5);
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

	public static class CallArgumentContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CallArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArgument; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitCallArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallArgumentContext callArgument() throws RecognitionException {
		CallArgumentContext _localctx = new CallArgumentContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_callArgument);
		try {
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				expression();
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
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_simpleExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ConditionExprSimpleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(316);
			conditionTerm(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(323);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionExprRecursiveContext(new SimpleExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
					setState(318);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(319);
					match(OR);
					setState(320);
					conditionTerm(0);
					}
					} 
				}
				setState(325);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
	public static class ConditionTermWrapperContext extends ConditionTermContext {
		public ConditionTermNotContext conditionTermNot() {
			return getRuleContext(ConditionTermNotContext.class,0);
		}
		public ConditionTermWrapperContext(ConditionTermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitConditionTermWrapper(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionTermRecursiveContext extends ConditionTermContext {
		public ConditionTermContext conditionTerm() {
			return getRuleContext(ConditionTermContext.class,0);
		}
		public TerminalNode AND() { return getToken(X0Parser.AND, 0); }
		public ConditionTermNotContext conditionTermNot() {
			return getRuleContext(ConditionTermNotContext.class,0);
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_conditionTerm, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ConditionTermWrapperContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(327);
			conditionTermNot();
			}
			_ctx.stop = _input.LT(-1);
			setState(334);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionTermRecursiveContext(new ConditionTermContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_conditionTerm);
					setState(329);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(330);
					match(AND);
					setState(331);
					conditionTermNot();
					}
					} 
				}
				setState(336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class ConditionTermNotContext extends ParserRuleContext {
		public ConditionFactorContext conditionFactor() {
			return getRuleContext(ConditionFactorContext.class,0);
		}
		public TerminalNode NOT() { return getToken(X0Parser.NOT, 0); }
		public TerminalNode ODD() { return getToken(X0Parser.ODD, 0); }
		public ConditionTermNotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionTermNot; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitConditionTermNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionTermNotContext conditionTermNot() throws RecognitionException {
		ConditionTermNotContext _localctx = new ConditionTermNotContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_conditionTermNot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(337);
				match(NOT);
				}
			}

			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ODD) {
				{
				setState(340);
				match(ODD);
				}
			}

			setState(343);
			conditionFactor();
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
		enterRule(_localctx, 64, RULE_conditionFactor);
		int _la;
		try {
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				additiveExpr(0);
				setState(346);
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
				setState(347);
				additiveExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
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
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_additiveExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AdditiveExprDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(353);
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
			setState(356);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(363);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AdditiveExprRecursiveContext(new AdditiveExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_additiveExpr);
					setState(358);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(359);
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
					setState(360);
					term(0);
					}
					} 
				}
				setState(365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		public TerminalNode XOR() { return getToken(X0Parser.XOR, 0); }
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
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(367);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(374);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermRecursiveContext(new TermContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(369);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(370);
					((TermRecursiveContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << XOR) | (1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						((TermRecursiveContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(371);
					factor();
					}
					} 
				}
				setState(376);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
	public static class FactorCallContext extends FactorContext {
		public CallExprContext callExpr() {
			return getRuleContext(CallExprContext.class,0);
		}
		public FactorCallContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof X0Visitor ) return ((X0Visitor<? extends T>)visitor).visitFactorCall(this);
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
		enterRule(_localctx, 70, RULE_factor);
		try {
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				_localctx = new FactorRecursiveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				match(T__3);
				setState(378);
				expression();
				setState(379);
				match(T__5);
				}
				break;
			case 2:
				_localctx = new FactorVariableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
				var();
				}
				break;
			case 3:
				_localctx = new FactorLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(382);
				literal();
				}
				break;
			case 4:
				_localctx = new FactorCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(383);
				callExpr();
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
		enterRule(_localctx, 72, RULE_literal);
		int _la;
		try {
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new LiteralIntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(386);
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

				setState(389);
				match(NUM);
				}
				break;
			case 2:
				_localctx = new LiteralStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				match(STRING);
				}
				break;
			case 3:
				_localctx = new LiteralBoolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(391);
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
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(392);
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

				setState(395);
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
		case 29:
			return simpleExpr_sempred((SimpleExprContext)_localctx, predIndex);
		case 30:
			return conditionTerm_sempred((ConditionTermContext)_localctx, predIndex);
		case 33:
			return additiveExpr_sempred((AdditiveExprContext)_localctx, predIndex);
		case 34:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u0191\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\7\3V\n\3\f\3\16\3Y\13\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4a\n\4\f\4\16\4d"+
		"\13\4\5\4f\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\5\5p\n\5\3\6\7\6s\n\6\f"+
		"\6\16\6v\13\6\3\7\3\7\3\7\3\7\7\7|\n\7\f\7\16\7\177\13\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\7\7\u0087\n\7\f\7\16\7\u008a\13\7\3\7\3\7\5\7\u008e\n\7\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u009b\n\t\f\t\16\t\u009e"+
		"\13\t\3\t\3\t\5\t\u00a2\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13\u00ab"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00b4\n\f\f\f\16\f\u00b7\13\f\3"+
		"\f\3\f\5\f\u00bb\n\f\3\r\6\r\u00be\n\r\r\r\16\r\u00bf\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00cf\n\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\5\21\u00d9\n\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00e7\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0112\n\30\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\5\33\u011d\n\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u012a\n\34\3\35\3\35\3\35"+
		"\3\35\3\35\7\35\u0131\n\35\f\35\16\35\u0134\13\35\5\35\u0136\n\35\3\35"+
		"\3\35\3\36\3\36\5\36\u013c\n\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0144"+
		"\n\37\f\37\16\37\u0147\13\37\3 \3 \3 \3 \3 \3 \7 \u014f\n \f \16 \u0152"+
		"\13 \3!\5!\u0155\n!\3!\5!\u0158\n!\3!\3!\3\"\3\"\3\"\3\"\3\"\5\"\u0161"+
		"\n\"\3#\3#\5#\u0165\n#\3#\3#\3#\3#\3#\7#\u016c\n#\f#\16#\u016f\13#\3$"+
		"\3$\3$\3$\3$\3$\7$\u0177\n$\f$\16$\u017a\13$\3%\3%\3%\3%\3%\3%\3%\5%\u0183"+
		"\n%\3&\5&\u0186\n&\3&\3&\3&\3&\5&\u018c\n&\3&\5&\u018f\n&\3&\2\6<>DF\'"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH"+
		"J\2\6\3\2\65:\3\2\60\61\4\2,,\62\64\3\2\"#\2\u01a2\2L\3\2\2\2\4W\3\2\2"+
		"\2\6Z\3\2\2\2\bm\3\2\2\2\nt\3\2\2\2\f\u008d\3\2\2\2\16\u008f\3\2\2\2\20"+
		"\u00a1\3\2\2\2\22\u00a3\3\2\2\2\24\u00aa\3\2\2\2\26\u00ba\3\2\2\2\30\u00bd"+
		"\3\2\2\2\32\u00ce\3\2\2\2\34\u00d0\3\2\2\2\36\u00d3\3\2\2\2 \u00d6\3\2"+
		"\2\2\"\u00dc\3\2\2\2$\u00df\3\2\2\2&\u00e8\3\2\2\2(\u00ee\3\2\2\2*\u00f8"+
		"\3\2\2\2,\u0100\3\2\2\2.\u0111\3\2\2\2\60\u0113\3\2\2\2\62\u0117\3\2\2"+
		"\2\64\u011c\3\2\2\2\66\u0129\3\2\2\28\u012b\3\2\2\2:\u013b\3\2\2\2<\u013d"+
		"\3\2\2\2>\u0148\3\2\2\2@\u0154\3\2\2\2B\u0160\3\2\2\2D\u0162\3\2\2\2F"+
		"\u0170\3\2\2\2H\u0182\3\2\2\2J\u018e\3\2\2\2LM\5\n\6\2MN\5\4\3\2NO\7\3"+
		"\2\2OP\7\4\2\2PQ\5\n\6\2QR\5\30\r\2RS\7\5\2\2S\3\3\2\2\2TV\5\6\4\2UT\3"+
		"\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\5\3\2\2\2YW\3\2\2\2Z[\7+\2\2[\\"+
		"\5\22\n\2\\e\7\6\2\2]b\5\b\5\2^_\7\7\2\2_a\5\b\5\2`^\3\2\2\2ad\3\2\2\2"+
		"b`\3\2\2\2bc\3\2\2\2cf\3\2\2\2db\3\2\2\2e]\3\2\2\2ef\3\2\2\2fg\3\2\2\2"+
		"gh\7\b\2\2hi\7\4\2\2ij\5\n\6\2jk\5\30\r\2kl\7\5\2\2l\7\3\2\2\2mo\5\22"+
		"\n\2np\7-\2\2on\3\2\2\2op\3\2\2\2p\t\3\2\2\2qs\5\f\7\2rq\3\2\2\2sv\3\2"+
		"\2\2tr\3\2\2\2tu\3\2\2\2u\13\3\2\2\2vt\3\2\2\2wx\5\24\13\2x}\5\20\t\2"+
		"yz\7\7\2\2z|\5\20\t\2{y\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080"+
		"\3\2\2\2\177}\3\2\2\2\u0080\u0081\7\t\2\2\u0081\u008e\3\2\2\2\u0082\u0083"+
		"\7\33\2\2\u0083\u0088\5\16\b\2\u0084\u0085\7\7\2\2\u0085\u0087\5\16\b"+
		"\2\u0086\u0084\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7\t\2\2\u008c"+
		"\u008e\3\2\2\2\u008dw\3\2\2\2\u008d\u0082\3\2\2\2\u008e\r\3\2\2\2\u008f"+
		"\u0090\5\22\n\2\u0090\u0091\7\n\2\2\u0091\u0092\5\66\34\2\u0092\17\3\2"+
		"\2\2\u0093\u00a2\5\22\n\2\u0094\u0095\5\22\n\2\u0095\u0096\7\13\2\2\u0096"+
		"\u009c\5\66\34\2\u0097\u0098\7\f\2\2\u0098\u0099\7\13\2\2\u0099\u009b"+
		"\5\66\34\2\u009a\u0097\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2"+
		"\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0"+
		"\7\f\2\2\u00a0\u00a2\3\2\2\2\u00a1\u0093\3\2\2\2\u00a1\u0094\3\2\2\2\u00a2"+
		"\21\3\2\2\2\u00a3\u00a4\7.\2\2\u00a4\23\3\2\2\2\u00a5\u00ab\7\35\2\2\u00a6"+
		"\u00ab\7\36\2\2\u00a7\u00ab\7\37\2\2\u00a8\u00ab\7 \2\2\u00a9\u00ab\7"+
		"!\2\2\u00aa\u00a5\3\2\2\2\u00aa\u00a6\3\2\2\2\u00aa\u00a7\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\25\3\2\2\2\u00ac\u00bb\5\22\n"+
		"\2\u00ad\u00ae\5\22\n\2\u00ae\u00af\7\13\2\2\u00af\u00b5\5\66\34\2\u00b0"+
		"\u00b1\7\f\2\2\u00b1\u00b2\7\13\2\2\u00b2\u00b4\5\66\34\2\u00b3\u00b0"+
		"\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7\f\2\2\u00b9\u00bb\3\2"+
		"\2\2\u00ba\u00ac\3\2\2\2\u00ba\u00ad\3\2\2\2\u00bb\27\3\2\2\2\u00bc\u00be"+
		"\5\32\16\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2"+
		"\u00bf\u00c0\3\2\2\2\u00c0\31\3\2\2\2\u00c1\u00cf\5$\23\2\u00c2\u00cf"+
		"\5&\24\2\u00c3\u00cf\5\60\31\2\u00c4\u00cf\5.\30\2\u00c5\u00cf\5\62\32"+
		"\2\u00c6\u00cf\5\64\33\2\u00c7\u00cf\5(\25\2\u00c8\u00cf\5\34\17\2\u00c9"+
		"\u00cf\5\36\20\2\u00ca\u00cf\5\"\22\2\u00cb\u00cf\5 \21\2\u00cc\u00cf"+
		"\5*\26\2\u00cd\u00cf\5,\27\2\u00ce\u00c1\3\2\2\2\u00ce\u00c2\3\2\2\2\u00ce"+
		"\u00c3\3\2\2\2\u00ce\u00c4\3\2\2\2\u00ce\u00c5\3\2\2\2\u00ce\u00c6\3\2"+
		"\2\2\u00ce\u00c7\3\2\2\2\u00ce\u00c8\3\2\2\2\u00ce\u00c9\3\2\2\2\u00ce"+
		"\u00ca\3\2\2\2\u00ce\u00cb\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2"+
		"\2\2\u00cf\33\3\2\2\2\u00d0\u00d1\7$\2\2\u00d1\u00d2\7\t\2\2\u00d2\35"+
		"\3\2\2\2\u00d3\u00d4\7%\2\2\u00d4\u00d5\7\t\2\2\u00d5\37\3\2\2\2\u00d6"+
		"\u00d8\7\34\2\2\u00d7\u00d9\5\66\34\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9"+
		"\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\7\t\2\2\u00db!\3\2\2\2\u00dc"+
		"\u00dd\7&\2\2\u00dd\u00de\7\t\2\2\u00de#\3\2\2\2\u00df\u00e0\7\r\2\2\u00e0"+
		"\u00e1\7\6\2\2\u00e1\u00e2\5\66\34\2\u00e2\u00e3\7\b\2\2\u00e3\u00e6\5"+
		"\32\16\2\u00e4\u00e5\7\16\2\2\u00e5\u00e7\5\32\16\2\u00e6\u00e4\3\2\2"+
		"\2\u00e6\u00e7\3\2\2\2\u00e7%\3\2\2\2\u00e8\u00e9\7\17\2\2\u00e9\u00ea"+
		"\7\6\2\2\u00ea\u00eb\5\66\34\2\u00eb\u00ec\7\b\2\2\u00ec\u00ed\5\32\16"+
		"\2\u00ed\'\3\2\2\2\u00ee\u00ef\7\20\2\2\u00ef\u00f0\7\6\2\2\u00f0\u00f1"+
		"\5\66\34\2\u00f1\u00f2\7\t\2\2\u00f2\u00f3\5\66\34\2\u00f3\u00f4\7\t\2"+
		"\2\u00f4\u00f5\5\66\34\2\u00f5\u00f6\7\b\2\2\u00f6\u00f7\5\32\16\2\u00f7"+
		")\3\2\2\2\u00f8\u00f9\7\21\2\2\u00f9\u00fa\5\32\16\2\u00fa\u00fb\7\17"+
		"\2\2\u00fb\u00fc\7\6\2\2\u00fc\u00fd\5\66\34\2\u00fd\u00fe\7\b\2\2\u00fe"+
		"\u00ff\7\t\2\2\u00ff+\3\2\2\2\u0100\u0101\7\22\2\2\u0101\u0102\5\32\16"+
		"\2\u0102\u0103\7\23\2\2\u0103\u0104\7\6\2\2\u0104\u0105\5\66\34\2\u0105"+
		"\u0106\7\b\2\2\u0106\u0107\7\t\2\2\u0107-\3\2\2\2\u0108\u0109\7\24\2\2"+
		"\u0109\u010a\5\66\34\2\u010a\u010b\7\t\2\2\u010b\u0112\3\2\2\2\u010c\u010d"+
		"\7\24\2\2\u010d\u010e\7\32\2\2\u010e\u010f\5\66\34\2\u010f\u0110\7\t\2"+
		"\2\u0110\u0112\3\2\2\2\u0111\u0108\3\2\2\2\u0111\u010c\3\2\2\2\u0112/"+
		"\3\2\2\2\u0113\u0114\7\25\2\2\u0114\u0115\5\26\f\2\u0115\u0116\7\t\2\2"+
		"\u0116\61\3\2\2\2\u0117\u0118\7\4\2\2\u0118\u0119\5\30\r\2\u0119\u011a"+
		"\7\5\2\2\u011a\63\3\2\2\2\u011b\u011d\5\66\34\2\u011c\u011b\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\7\t\2\2\u011f\65\3\2\2"+
		"\2\u0120\u0121\5\26\f\2\u0121\u0122\7\n\2\2\u0122\u0123\5\66\34\2\u0123"+
		"\u012a\3\2\2\2\u0124\u0125\7\26\2\2\u0125\u012a\5\26\f\2\u0126\u0127\7"+
		"\27\2\2\u0127\u012a\5\26\f\2\u0128\u012a\5<\37\2\u0129\u0120\3\2\2\2\u0129"+
		"\u0124\3\2\2\2\u0129\u0126\3\2\2\2\u0129\u0128\3\2\2\2\u012a\67\3\2\2"+
		"\2\u012b\u012c\5\22\n\2\u012c\u0135\7\6\2\2\u012d\u0132\5:\36\2\u012e"+
		"\u012f\7\7\2\2\u012f\u0131\5:\36\2\u0130\u012e\3\2\2\2\u0131\u0134\3\2"+
		"\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0136\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0135\u012d\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2"+
		"\2\2\u0137\u0138\7\b\2\2\u01389\3\2\2\2\u0139\u013c\5\26\f\2\u013a\u013c"+
		"\5\66\34\2\u013b\u0139\3\2\2\2\u013b\u013a\3\2\2\2\u013c;\3\2\2\2\u013d"+
		"\u013e\b\37\1\2\u013e\u013f\5> \2\u013f\u0145\3\2\2\2\u0140\u0141\f\4"+
		"\2\2\u0141\u0142\7(\2\2\u0142\u0144\5> \2\u0143\u0140\3\2\2\2\u0144\u0147"+
		"\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146=\3\2\2\2\u0147"+
		"\u0145\3\2\2\2\u0148\u0149\b \1\2\u0149\u014a\5@!\2\u014a\u0150\3\2\2"+
		"\2\u014b\u014c\f\4\2\2\u014c\u014d\7\'\2\2\u014d\u014f\5@!\2\u014e\u014b"+
		"\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151"+
		"?\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0155\7)\2\2\u0154\u0153\3\2\2\2\u0154"+
		"\u0155\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u0158\7*\2\2\u0157\u0156\3\2"+
		"\2\2\u0157\u0158\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\5B\"\2\u015a"+
		"A\3\2\2\2\u015b\u015c\5D#\2\u015c\u015d\t\2\2\2\u015d\u015e\5D#\2\u015e"+
		"\u0161\3\2\2\2\u015f\u0161\5D#\2\u0160\u015b\3\2\2\2\u0160\u015f\3\2\2"+
		"\2\u0161C\3\2\2\2\u0162\u0164\b#\1\2\u0163\u0165\t\3\2\2\u0164\u0163\3"+
		"\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\5F$\2\u0167"+
		"\u016d\3\2\2\2\u0168\u0169\f\4\2\2\u0169\u016a\t\3\2\2\u016a\u016c\5F"+
		"$\2\u016b\u0168\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016eE\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\b$\1\2\u0171"+
		"\u0172\5H%\2\u0172\u0178\3\2\2\2\u0173\u0174\f\4\2\2\u0174\u0175\t\4\2"+
		"\2\u0175\u0177\5H%\2\u0176\u0173\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176"+
		"\3\2\2\2\u0178\u0179\3\2\2\2\u0179G\3\2\2\2\u017a\u0178\3\2\2\2\u017b"+
		"\u017c\7\6\2\2\u017c\u017d\5\66\34\2\u017d\u017e\7\b\2\2\u017e\u0183\3"+
		"\2\2\2\u017f\u0183\5\26\f\2\u0180\u0183\5J&\2\u0181\u0183\58\35\2\u0182"+
		"\u017b\3\2\2\2\u0182\u017f\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0181\3\2"+
		"\2\2\u0183I\3\2\2\2\u0184\u0186\t\3\2\2\u0185\u0184\3\2\2\2\u0185\u0186"+
		"\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u018f\7/\2\2\u0188\u018f\7;\2\2\u0189"+
		"\u018f\t\5\2\2\u018a\u018c\t\3\2\2\u018b\u018a\3\2\2\2\u018b\u018c\3\2"+
		"\2\2\u018c\u018d\3\2\2\2\u018d\u018f\7\30\2\2\u018e\u0185\3\2\2\2\u018e"+
		"\u0188\3\2\2\2\u018e\u0189\3\2\2\2\u018e\u018b\3\2\2\2\u018fK\3\2\2\2"+
		"%Wbeot}\u0088\u008d\u009c\u00a1\u00aa\u00b5\u00ba\u00bf\u00ce\u00d8\u00e6"+
		"\u0111\u011c\u0129\u0132\u0135\u013b\u0145\u0150\u0154\u0157\u0160\u0164"+
		"\u016d\u0178\u0182\u0185\u018b\u018e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}