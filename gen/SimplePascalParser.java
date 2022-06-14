// Generated from D:/Desktop/SimplePascal/src\SimplePascal.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimplePascalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, CONST=2, TYPE=3, ARRAY=4, SET=5, OF=6, RECORD=7, VAR=8, FORWARD=9, 
		FUNCTION=10, PROCEDURE=11, INTEGER=12, REAL=13, BOOLEAN=14, CHAR=15, BEGIN=16, 
		END=17, IF=18, THEN=19, ELSE=20, WHILE=21, DO=22, FOR=23, DOWNTO=24, TO=25, 
		WITH=26, READ=27, WRITE=28, RCONST=29, ICONST=30, TRUE=31, FALSE=32, BCONST=33, 
		CCONST=34, NEQ=35, LTEQ=36, GTEQ=37, LT=38, GT=39, ADDOP=40, SUBOP=41, 
		OROP=42, MULOP=43, DIVOP=44, DIV=45, MOD=46, ANDOP=47, NOTOP=48, INOP=49, 
		STRING=50, LPAREN=51, RPAREN=52, SEMI=53, COMMA=54, EQU=55, COLON=56, 
		LBRACK=57, RBRACK=58, ASSIGN=59, DOT=60, DOTDOT=61, ID=62, COMMENT=63, 
		WHITESPACE=64, END_EOF=65;
	public static final int
		RULE_program = 0, RULE_header = 1, RULE_declarations = 2, RULE_constdefs = 3, 
		RULE_constant_defs = 4, RULE_expression = 5, RULE_variable = 6, RULE_expressions = 7, 
		RULE_constant = 8, RULE_setexpression = 9, RULE_elexpressions = 10, RULE_elexpression = 11, 
		RULE_typedefs = 12, RULE_type_defs = 13, RULE_type_def = 14, RULE_dims = 15, 
		RULE_limits = 16, RULE_limit = 17, RULE_typename = 18, RULE_standard_type = 19, 
		RULE_fields = 20, RULE_field = 21, RULE_identifiers = 22, RULE_vardefs = 23, 
		RULE_variable_defs = 24, RULE_subprograms = 25, RULE_subprogram = 26, 
		RULE_sub_header = 27, RULE_formal_parameters = 28, RULE_parameter_list = 29, 
		RULE_pass = 30, RULE_comp_statement = 31, RULE_statements = 32, RULE_statement = 33, 
		RULE_assignment = 34, RULE_if_statement = 35, RULE_if_tail = 36, RULE_while_statement = 37, 
		RULE_for_statement = 38, RULE_iter_space = 39, RULE_with_statement = 40, 
		RULE_subprogram_call = 41, RULE_io_statement = 42, RULE_read_list = 43, 
		RULE_read_item = 44, RULE_write_list = 45, RULE_write_item = 46;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "header", "declarations", "constdefs", "constant_defs", "expression", 
			"variable", "expressions", "constant", "setexpression", "elexpressions", 
			"elexpression", "typedefs", "type_defs", "type_def", "dims", "limits", 
			"limit", "typename", "standard_type", "fields", "field", "identifiers", 
			"vardefs", "variable_defs", "subprograms", "subprogram", "sub_header", 
			"formal_parameters", "parameter_list", "pass", "comp_statement", "statements", 
			"statement", "assignment", "if_statement", "if_tail", "while_statement", 
			"for_statement", "iter_space", "with_statement", "subprogram_call", "io_statement", 
			"read_list", "read_item", "write_list", "write_item"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "'<>'", 
			"'<='", "'>='", "'<'", "'>'", "'+'", "'-'", null, "'*'", null, "'/'", 
			null, null, null, null, null, "'('", "')'", "';'", "','", "'='", "':'", 
			"'['", "']'", "':='", "'.'", "'..'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "CONST", "TYPE", "ARRAY", "SET", "OF", "RECORD", "VAR", 
			"FORWARD", "FUNCTION", "PROCEDURE", "INTEGER", "REAL", "BOOLEAN", "CHAR", 
			"BEGIN", "END", "IF", "THEN", "ELSE", "WHILE", "DO", "FOR", "DOWNTO", 
			"TO", "WITH", "READ", "WRITE", "RCONST", "ICONST", "TRUE", "FALSE", "BCONST", 
			"CCONST", "NEQ", "LTEQ", "GTEQ", "LT", "GT", "ADDOP", "SUBOP", "OROP", 
			"MULOP", "DIVOP", "DIV", "MOD", "ANDOP", "NOTOP", "INOP", "STRING", "LPAREN", 
			"RPAREN", "SEMI", "COMMA", "EQU", "COLON", "LBRACK", "RBRACK", "ASSIGN", 
			"DOT", "DOTDOT", "ID", "COMMENT", "WHITESPACE", "END_EOF"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "SimplePascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimplePascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public SubprogramsContext subprograms() {
			return getRuleContext(SubprogramsContext.class,0);
		}
		public Comp_statementContext comp_statement() {
			return getRuleContext(Comp_statementContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SimplePascalParser.DOT, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			header();
			setState(95);
			declarations();
			setState(96);
			subprograms(0);
			setState(97);
			comp_statement();
			setState(98);
			match(DOT);
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

	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(SimplePascalParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(SimplePascalParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(SimplePascalParser.SEMI, 0); }
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(PROGRAM);
			setState(101);
			match(ID);
			setState(102);
			match(SEMI);
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

	public static class DeclarationsContext extends ParserRuleContext {
		public ConstdefsContext constdefs() {
			return getRuleContext(ConstdefsContext.class,0);
		}
		public TypedefsContext typedefs() {
			return getRuleContext(TypedefsContext.class,0);
		}
		public VardefsContext vardefs() {
			return getRuleContext(VardefsContext.class,0);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			constdefs();
			setState(105);
			typedefs();
			setState(106);
			vardefs();
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

	public static class ConstdefsContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(SimplePascalParser.CONST, 0); }
		public Constant_defsContext constant_defs() {
			return getRuleContext(Constant_defsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SimplePascalParser.SEMI, 0); }
		public ConstdefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constdefs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterConstdefs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitConstdefs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitConstdefs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstdefsContext constdefs() throws RecognitionException {
		ConstdefsContext _localctx = new ConstdefsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_constdefs);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(CONST);
				setState(109);
				constant_defs(0);
				setState(110);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Constant_defsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimplePascalParser.ID, 0); }
		public TerminalNode EQU() { return getToken(SimplePascalParser.EQU, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Constant_defsContext constant_defs() {
			return getRuleContext(Constant_defsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SimplePascalParser.SEMI, 0); }
		public Constant_defsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_defs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterConstant_defs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitConstant_defs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitConstant_defs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_defsContext constant_defs() throws RecognitionException {
		return constant_defs(0);
	}

	private Constant_defsContext constant_defs(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Constant_defsContext _localctx = new Constant_defsContext(_ctx, _parentState);
		Constant_defsContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_constant_defs, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(116);
			match(ID);
			setState(117);
			match(EQU);
			setState(118);
			expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Constant_defsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_constant_defs);
					setState(120);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(121);
					match(SEMI);
					setState(122);
					match(ID);
					setState(123);
					match(EQU);
					setState(124);
					expression(0);
					}
					} 
				}
				setState(129);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
	public static class OrExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OROP() { return getToken(SimplePascalParser.OROP, 0); }
		public OrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotationExpressionContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ADDOP() { return getToken(SimplePascalParser.ADDOP, 0); }
		public TerminalNode SUBOP() { return getToken(SimplePascalParser.SUBOP, 0); }
		public NotationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterNotationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitNotationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitNotationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TExpressionContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(SimplePascalParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(SimplePascalParser.LPAREN, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimplePascalParser.RPAREN, 0); }
		public TExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterTExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitTExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitTExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MuldivExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULOP() { return getToken(SimplePascalParser.MULOP, 0); }
		public TerminalNode DIVOP() { return getToken(SimplePascalParser.DIVOP, 0); }
		public TerminalNode DIV() { return getToken(SimplePascalParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SimplePascalParser.MOD, 0); }
		public TerminalNode ANDOP() { return getToken(SimplePascalParser.ANDOP, 0); }
		public MuldivExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterMuldivExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitMuldivExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitMuldivExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InRElEquExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode INOP() { return getToken(SimplePascalParser.INOP, 0); }
		public TerminalNode LTEQ() { return getToken(SimplePascalParser.LTEQ, 0); }
		public TerminalNode GTEQ() { return getToken(SimplePascalParser.GTEQ, 0); }
		public TerminalNode LT() { return getToken(SimplePascalParser.LT, 0); }
		public TerminalNode GT() { return getToken(SimplePascalParser.GT, 0); }
		public TerminalNode EQU() { return getToken(SimplePascalParser.EQU, 0); }
		public InRElEquExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterInRElEquExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitInRElEquExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitInRElEquExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADDOP() { return getToken(SimplePascalParser.ADDOP, 0); }
		public TerminalNode SUBOP() { return getToken(SimplePascalParser.SUBOP, 0); }
		public AddSubExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterAddSubExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitAddSubExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitAddSubExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarExpressionContext extends ExpressionContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VarExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterVarExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitVarExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitVarExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstExpressionContext extends ExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterConstExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitConstExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitConstExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpressionContext extends ExpressionContext {
		public TerminalNode NOTOP() { return getToken(SimplePascalParser.NOTOP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SeterExpressionContext extends ExpressionContext {
		public SetexpressionContext setexpression() {
			return getRuleContext(SetexpressionContext.class,0);
		}
		public SeterExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterSeterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitSeterExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitSeterExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(SimplePascalParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimplePascalParser.RPAREN, 0); }
		public ParExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(131);
				match(NOTOP);
				setState(132);
				expression(7);
				}
				break;
			case 2:
				{
				_localctx = new NotationExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				((NotationExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADDOP || _la==SUBOP) ) {
					((NotationExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(134);
				expression(6);
				}
				break;
			case 3:
				{
				_localctx = new VarExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				variable(0);
				}
				break;
			case 4:
				{
				_localctx = new TExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				match(ID);
				setState(137);
				match(LPAREN);
				setState(138);
				expressions(0);
				setState(139);
				match(RPAREN);
				}
				break;
			case 5:
				{
				_localctx = new ConstExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141);
				constant();
				}
				break;
			case 6:
				{
				_localctx = new ParExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				match(LPAREN);
				setState(143);
				expression(0);
				setState(144);
				match(RPAREN);
				}
				break;
			case 7:
				{
				_localctx = new SeterExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				setexpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(161);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new OrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(149);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(150);
						match(OROP);
						setState(151);
						expression(12);
						}
						break;
					case 2:
						{
						_localctx = new MuldivExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(152);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(153);
						((MuldivExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULOP) | (1L << DIVOP) | (1L << DIV) | (1L << MOD) | (1L << ANDOP))) != 0)) ) {
							((MuldivExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(154);
						expression(11);
						}
						break;
					case 3:
						{
						_localctx = new AddSubExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(155);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(156);
						((AddSubExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADDOP || _la==SUBOP) ) {
							((AddSubExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(157);
						expression(10);
						}
						break;
					case 4:
						{
						_localctx = new InRElEquExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(158);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(159);
						((InRElEquExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LTEQ) | (1L << GTEQ) | (1L << LT) | (1L << GT) | (1L << INOP) | (1L << EQU))) != 0)) ) {
							((InRElEquExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(160);
						expression(9);
						}
						break;
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimplePascalParser.ID, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SimplePascalParser.DOT, 0); }
		public TerminalNode LBRACK() { return getToken(SimplePascalParser.LBRACK, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(SimplePascalParser.RBRACK, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		return variable(0);
	}

	private VariableContext variable(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VariableContext _localctx = new VariableContext(_ctx, _parentState);
		VariableContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_variable, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(167);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(177);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new VariableContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_variable);
						setState(169);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(170);
						match(DOT);
						setState(171);
						match(ID);
						}
						break;
					case 2:
						{
						_localctx = new VariableContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_variable);
						setState(172);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(173);
						match(LBRACK);
						setState(174);
						expressions(0);
						setState(175);
						match(RBRACK);
						}
						break;
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class ExpressionsContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SimplePascalParser.COMMA, 0); }
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		return expressions(0);
	}

	private ExpressionsContext expressions(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, _parentState);
		ExpressionsContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expressions, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(183);
			expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressions);
					setState(185);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(186);
					match(COMMA);
					setState(187);
					expression(0);
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BooleanConstContext extends ConstantContext {
		public TerminalNode BCONST() { return getToken(SimplePascalParser.BCONST, 0); }
		public BooleanConstContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterBooleanConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitBooleanConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitBooleanConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerConstContext extends ConstantContext {
		public TerminalNode ICONST() { return getToken(SimplePascalParser.ICONST, 0); }
		public IntegerConstContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterIntegerConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitIntegerConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitIntegerConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharConstContext extends ConstantContext {
		public TerminalNode CCONST() { return getToken(SimplePascalParser.CCONST, 0); }
		public CharConstContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterCharConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitCharConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitCharConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealConstContext extends ConstantContext {
		public TerminalNode RCONST() { return getToken(SimplePascalParser.RCONST, 0); }
		public RealConstContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterRealConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitRealConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitRealConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constant);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ICONST:
				_localctx = new IntegerConstContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(ICONST);
				}
				break;
			case RCONST:
				_localctx = new RealConstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(RCONST);
				}
				break;
			case BCONST:
				_localctx = new BooleanConstContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				match(BCONST);
				}
				break;
			case CCONST:
				_localctx = new CharConstContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
				match(CCONST);
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

	public static class SetexpressionContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(SimplePascalParser.LBRACK, 0); }
		public ElexpressionsContext elexpressions() {
			return getRuleContext(ElexpressionsContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(SimplePascalParser.RBRACK, 0); }
		public SetexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterSetexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitSetexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitSetexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetexpressionContext setexpression() throws RecognitionException {
		SetexpressionContext _localctx = new SetexpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_setexpression);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(LBRACK);
				setState(200);
				elexpressions(0);
				setState(201);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(LBRACK);
				setState(204);
				match(RBRACK);
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

	public static class ElexpressionsContext extends ParserRuleContext {
		public ElexpressionContext elexpression() {
			return getRuleContext(ElexpressionContext.class,0);
		}
		public ElexpressionsContext elexpressions() {
			return getRuleContext(ElexpressionsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SimplePascalParser.COMMA, 0); }
		public ElexpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elexpressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterElexpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitElexpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitElexpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElexpressionsContext elexpressions() throws RecognitionException {
		return elexpressions(0);
	}

	private ElexpressionsContext elexpressions(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ElexpressionsContext _localctx = new ElexpressionsContext(_ctx, _parentState);
		ElexpressionsContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_elexpressions, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(208);
			elexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ElexpressionsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_elexpressions);
					setState(210);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(211);
					match(COMMA);
					setState(212);
					elexpression();
					}
					} 
				}
				setState(217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class ElexpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOTDOT() { return getToken(SimplePascalParser.DOTDOT, 0); }
		public ElexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterElexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitElexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitElexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElexpressionContext elexpression() throws RecognitionException {
		ElexpressionContext _localctx = new ElexpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elexpression);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				expression(0);
				setState(219);
				match(DOTDOT);
				setState(220);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				expression(0);
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

	public static class TypedefsContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(SimplePascalParser.TYPE, 0); }
		public Type_defsContext type_defs() {
			return getRuleContext(Type_defsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SimplePascalParser.SEMI, 0); }
		public TypedefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterTypedefs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitTypedefs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitTypedefs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedefsContext typedefs() throws RecognitionException {
		TypedefsContext _localctx = new TypedefsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typedefs);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(TYPE);
				setState(226);
				type_defs(0);
				setState(227);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Type_defsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimplePascalParser.ID, 0); }
		public TerminalNode EQU() { return getToken(SimplePascalParser.EQU, 0); }
		public Type_defContext type_def() {
			return getRuleContext(Type_defContext.class,0);
		}
		public Type_defsContext type_defs() {
			return getRuleContext(Type_defsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SimplePascalParser.SEMI, 0); }
		public Type_defsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_defs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterType_defs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitType_defs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitType_defs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_defsContext type_defs() throws RecognitionException {
		return type_defs(0);
	}

	private Type_defsContext type_defs(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Type_defsContext _localctx = new Type_defsContext(_ctx, _parentState);
		Type_defsContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_type_defs, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(233);
			match(ID);
			setState(234);
			match(EQU);
			setState(235);
			type_def();
			}
			_ctx.stop = _input.LT(-1);
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Type_defsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type_defs);
					setState(237);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(238);
					match(SEMI);
					setState(239);
					match(ID);
					setState(240);
					match(EQU);
					setState(241);
					type_def();
					}
					} 
				}
				setState(246);
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

	public static class Type_defContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(SimplePascalParser.ARRAY, 0); }
		public TerminalNode LBRACK() { return getToken(SimplePascalParser.LBRACK, 0); }
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(SimplePascalParser.RBRACK, 0); }
		public TerminalNode OF() { return getToken(SimplePascalParser.OF, 0); }
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public TerminalNode SET() { return getToken(SimplePascalParser.SET, 0); }
		public TerminalNode RECORD() { return getToken(SimplePascalParser.RECORD, 0); }
		public FieldsContext fields() {
			return getRuleContext(FieldsContext.class,0);
		}
		public TerminalNode END() { return getToken(SimplePascalParser.END, 0); }
		public TerminalNode LPAREN() { return getToken(SimplePascalParser.LPAREN, 0); }
		public IdentifiersContext identifiers() {
			return getRuleContext(IdentifiersContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimplePascalParser.RPAREN, 0); }
		public List<LimitContext> limit() {
			return getRuleContexts(LimitContext.class);
		}
		public LimitContext limit(int i) {
			return getRuleContext(LimitContext.class,i);
		}
		public TerminalNode DOTDOT() { return getToken(SimplePascalParser.DOTDOT, 0); }
		public Type_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterType_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitType_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitType_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_defContext type_def() throws RecognitionException {
		Type_defContext _localctx = new Type_defContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type_def);
		try {
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(ARRAY);
				setState(248);
				match(LBRACK);
				setState(249);
				dims(0);
				setState(250);
				match(RBRACK);
				setState(251);
				match(OF);
				setState(252);
				typename();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				match(SET);
				setState(255);
				match(OF);
				setState(256);
				typename();
				}
				break;
			case RECORD:
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				match(RECORD);
				setState(258);
				fields(0);
				setState(259);
				match(END);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(261);
				match(LPAREN);
				setState(262);
				identifiers(0);
				setState(263);
				match(RPAREN);
				}
				break;
			case ICONST:
			case BCONST:
			case CCONST:
			case ADDOP:
			case SUBOP:
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(265);
				limit();
				setState(266);
				match(DOTDOT);
				setState(267);
				limit();
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

	public static class DimsContext extends ParserRuleContext {
		public LimitsContext limits() {
			return getRuleContext(LimitsContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SimplePascalParser.COMMA, 0); }
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterDims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitDims(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitDims(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		return dims(0);
	}

	private DimsContext dims(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DimsContext _localctx = new DimsContext(_ctx, _parentState);
		DimsContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_dims, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(272);
			limits();
			}
			_ctx.stop = _input.LT(-1);
			setState(279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DimsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_dims);
					setState(274);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(275);
					match(COMMA);
					setState(276);
					limits();
					}
					} 
				}
				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class LimitsContext extends ParserRuleContext {
		public List<LimitContext> limit() {
			return getRuleContexts(LimitContext.class);
		}
		public LimitContext limit(int i) {
			return getRuleContext(LimitContext.class,i);
		}
		public TerminalNode DOTDOT() { return getToken(SimplePascalParser.DOTDOT, 0); }
		public TerminalNode ID() { return getToken(SimplePascalParser.ID, 0); }
		public LimitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterLimits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitLimits(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitLimits(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitsContext limits() throws RecognitionException {
		LimitsContext _localctx = new LimitsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_limits);
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				limit();
				setState(283);
				match(DOTDOT);
				setState(284);
				limit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				match(ID);
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

	public static class LimitContext extends ParserRuleContext {
		public Token op;
		public TerminalNode ICONST() { return getToken(SimplePascalParser.ICONST, 0); }
		public TerminalNode ADDOP() { return getToken(SimplePascalParser.ADDOP, 0); }
		public TerminalNode SUBOP() { return getToken(SimplePascalParser.SUBOP, 0); }
		public TerminalNode ID() { return getToken(SimplePascalParser.ID, 0); }
		public TerminalNode CCONST() { return getToken(SimplePascalParser.CCONST, 0); }
		public TerminalNode BCONST() { return getToken(SimplePascalParser.BCONST, 0); }
		public LimitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterLimit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitLimit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitLimit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitContext limit() throws RecognitionException {
		LimitContext _localctx = new LimitContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_limit);
		int _la;
		try {
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				((LimitContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADDOP || _la==SUBOP) ) {
					((LimitContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(290);
				match(ICONST);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(ICONST);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				((LimitContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADDOP || _la==SUBOP) ) {
					((LimitContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(293);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(294);
				match(CCONST);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(295);
				match(BCONST);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(296);
				match(ID);
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

	public static class TypenameContext extends ParserRuleContext {
		public Standard_typeContext standard_type() {
			return getRuleContext(Standard_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SimplePascalParser.ID, 0); }
		public TypenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterTypename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitTypename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitTypename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypenameContext typename() throws RecognitionException {
		TypenameContext _localctx = new TypenameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typename);
		try {
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case REAL:
			case BOOLEAN:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				standard_type();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				match(ID);
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

	public static class Standard_typeContext extends ParserRuleContext {
		public Standard_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standard_type; }
	 
		public Standard_typeContext() { }
		public void copyFrom(Standard_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SRealContext extends Standard_typeContext {
		public TerminalNode REAL() { return getToken(SimplePascalParser.REAL, 0); }
		public SRealContext(Standard_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterSReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitSReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitSReal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SCharContext extends Standard_typeContext {
		public TerminalNode CHAR() { return getToken(SimplePascalParser.CHAR, 0); }
		public SCharContext(Standard_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterSChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitSChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitSChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SIntegerContext extends Standard_typeContext {
		public TerminalNode INTEGER() { return getToken(SimplePascalParser.INTEGER, 0); }
		public SIntegerContext(Standard_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterSInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitSInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitSInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SBooleanContext extends Standard_typeContext {
		public TerminalNode BOOLEAN() { return getToken(SimplePascalParser.BOOLEAN, 0); }
		public SBooleanContext(Standard_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterSBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitSBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitSBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Standard_typeContext standard_type() throws RecognitionException {
		Standard_typeContext _localctx = new Standard_typeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_standard_type);
		try {
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				_localctx = new SIntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				match(INTEGER);
				}
				break;
			case REAL:
				_localctx = new SRealContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				match(REAL);
				}
				break;
			case BOOLEAN:
				_localctx = new SBooleanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				match(BOOLEAN);
				}
				break;
			case CHAR:
				_localctx = new SCharContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(306);
				match(CHAR);
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

	public static class FieldsContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public FieldsContext fields() {
			return getRuleContext(FieldsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SimplePascalParser.SEMI, 0); }
		public FieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldsContext fields() throws RecognitionException {
		return fields(0);
	}

	private FieldsContext fields(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FieldsContext _localctx = new FieldsContext(_ctx, _parentState);
		FieldsContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_fields, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(310);
			field();
			}
			_ctx.stop = _input.LT(-1);
			setState(317);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FieldsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_fields);
					setState(312);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(313);
					match(SEMI);
					setState(314);
					field();
					}
					} 
				}
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class FieldContext extends ParserRuleContext {
		public IdentifiersContext identifiers() {
			return getRuleContext(IdentifiersContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SimplePascalParser.COLON, 0); }
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			identifiers(0);
			setState(321);
			match(COLON);
			setState(322);
			typename();
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

	public static class IdentifiersContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimplePascalParser.ID, 0); }
		public IdentifiersContext identifiers() {
			return getRuleContext(IdentifiersContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SimplePascalParser.COMMA, 0); }
		public IdentifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterIdentifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitIdentifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitIdentifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifiersContext identifiers() throws RecognitionException {
		return identifiers(0);
	}

	private IdentifiersContext identifiers(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IdentifiersContext _localctx = new IdentifiersContext(_ctx, _parentState);
		IdentifiersContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_identifiers, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(325);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(332);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IdentifiersContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_identifiers);
					setState(327);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(328);
					match(COMMA);
					setState(329);
					match(ID);
					}
					} 
				}
				setState(334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class VardefsContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(SimplePascalParser.VAR, 0); }
		public Variable_defsContext variable_defs() {
			return getRuleContext(Variable_defsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SimplePascalParser.SEMI, 0); }
		public VardefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardefs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterVardefs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitVardefs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitVardefs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardefsContext vardefs() throws RecognitionException {
		VardefsContext _localctx = new VardefsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_vardefs);
		try {
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				match(VAR);
				setState(336);
				variable_defs(0);
				setState(337);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Variable_defsContext extends ParserRuleContext {
		public IdentifiersContext identifiers() {
			return getRuleContext(IdentifiersContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SimplePascalParser.COLON, 0); }
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public Variable_defsContext variable_defs() {
			return getRuleContext(Variable_defsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SimplePascalParser.SEMI, 0); }
		public Variable_defsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_defs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterVariable_defs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitVariable_defs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitVariable_defs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_defsContext variable_defs() throws RecognitionException {
		return variable_defs(0);
	}

	private Variable_defsContext variable_defs(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Variable_defsContext _localctx = new Variable_defsContext(_ctx, _parentState);
		Variable_defsContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_variable_defs, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(343);
			identifiers(0);
			setState(344);
			match(COLON);
			setState(345);
			typename();
			}
			_ctx.stop = _input.LT(-1);
			setState(355);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Variable_defsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_variable_defs);
					setState(347);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(348);
					match(SEMI);
					setState(349);
					identifiers(0);
					setState(350);
					match(COLON);
					setState(351);
					typename();
					}
					} 
				}
				setState(357);
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

	public static class SubprogramsContext extends ParserRuleContext {
		public SubprogramsContext subprograms() {
			return getRuleContext(SubprogramsContext.class,0);
		}
		public SubprogramContext subprogram() {
			return getRuleContext(SubprogramContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SimplePascalParser.SEMI, 0); }
		public SubprogramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprograms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterSubprograms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitSubprograms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitSubprograms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubprogramsContext subprograms() throws RecognitionException {
		return subprograms(0);
	}

	private SubprogramsContext subprograms(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SubprogramsContext _localctx = new SubprogramsContext(_ctx, _parentState);
		SubprogramsContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_subprograms, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(365);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new SubprogramsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_subprograms);
					setState(359);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(360);
					subprogram();
					setState(361);
					match(SEMI);
					}
					} 
				}
				setState(367);
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

	public static class SubprogramContext extends ParserRuleContext {
		public Sub_headerContext sub_header() {
			return getRuleContext(Sub_headerContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SimplePascalParser.SEMI, 0); }
		public TerminalNode FORWARD() { return getToken(SimplePascalParser.FORWARD, 0); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public SubprogramsContext subprograms() {
			return getRuleContext(SubprogramsContext.class,0);
		}
		public Comp_statementContext comp_statement() {
			return getRuleContext(Comp_statementContext.class,0);
		}
		public SubprogramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterSubprogram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitSubprogram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitSubprogram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubprogramContext subprogram() throws RecognitionException {
		SubprogramContext _localctx = new SubprogramContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_subprogram);
		try {
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				sub_header();
				setState(369);
				match(SEMI);
				setState(370);
				match(FORWARD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				sub_header();
				setState(373);
				match(SEMI);
				setState(374);
				declarations();
				setState(375);
				subprograms(0);
				setState(376);
				comp_statement();
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

	public static class Sub_headerContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(SimplePascalParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(SimplePascalParser.ID, 0); }
		public Formal_parametersContext formal_parameters() {
			return getRuleContext(Formal_parametersContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SimplePascalParser.COLON, 0); }
		public Standard_typeContext standard_type() {
			return getRuleContext(Standard_typeContext.class,0);
		}
		public TerminalNode PROCEDURE() { return getToken(SimplePascalParser.PROCEDURE, 0); }
		public Sub_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterSub_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitSub_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitSub_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sub_headerContext sub_header() throws RecognitionException {
		Sub_headerContext _localctx = new Sub_headerContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_sub_header);
		try {
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				match(FUNCTION);
				setState(381);
				match(ID);
				setState(382);
				formal_parameters();
				setState(383);
				match(COLON);
				setState(384);
				standard_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				match(PROCEDURE);
				setState(387);
				match(ID);
				setState(388);
				formal_parameters();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(389);
				match(FUNCTION);
				setState(390);
				match(ID);
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

	public static class Formal_parametersContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SimplePascalParser.LPAREN, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimplePascalParser.RPAREN, 0); }
		public Formal_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterFormal_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitFormal_parameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitFormal_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formal_parametersContext formal_parameters() throws RecognitionException {
		Formal_parametersContext _localctx = new Formal_parametersContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_formal_parameters);
		try {
			setState(398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				match(LPAREN);
				setState(394);
				parameter_list(0);
				setState(395);
				match(RPAREN);
				}
				break;
			case SEMI:
			case COLON:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Parameter_listContext extends ParserRuleContext {
		public PassContext pass() {
			return getRuleContext(PassContext.class,0);
		}
		public IdentifiersContext identifiers() {
			return getRuleContext(IdentifiersContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SimplePascalParser.COLON, 0); }
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SimplePascalParser.SEMI, 0); }
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitParameter_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitParameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		return parameter_list(0);
	}

	private Parameter_listContext parameter_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, _parentState);
		Parameter_listContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_parameter_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(401);
			pass();
			setState(402);
			identifiers(0);
			setState(403);
			match(COLON);
			setState(404);
			typename();
			}
			_ctx.stop = _input.LT(-1);
			setState(415);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Parameter_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameter_list);
					setState(406);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(407);
					match(SEMI);
					setState(408);
					pass();
					setState(409);
					identifiers(0);
					setState(410);
					match(COLON);
					setState(411);
					typename();
					}
					} 
				}
				setState(417);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class PassContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(SimplePascalParser.VAR, 0); }
		public PassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterPass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitPass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitPass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PassContext pass() throws RecognitionException {
		PassContext _localctx = new PassContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_pass);
		try {
			setState(420);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				match(VAR);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Comp_statementContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(SimplePascalParser.BEGIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(SimplePascalParser.END, 0); }
		public Comp_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterComp_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitComp_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitComp_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_statementContext comp_statement() throws RecognitionException {
		Comp_statementContext _localctx = new Comp_statementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_comp_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(BEGIN);
			setState(423);
			statements(0);
			setState(424);
			match(END);
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

	public static class StatementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SimplePascalParser.SEMI, 0); }
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		return statements(0);
	}

	private StatementsContext statements(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementsContext _localctx = new StatementsContext(_ctx, _parentState);
		StatementsContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_statements, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(427);
			statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(434);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statements);
					setState(429);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(430);
					match(SEMI);
					setState(431);
					statement();
					}
					} 
				}
				setState(436);
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

	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public With_statementContext with_statement() {
			return getRuleContext(With_statementContext.class,0);
		}
		public Subprogram_callContext subprogram_call() {
			return getRuleContext(Subprogram_callContext.class,0);
		}
		public Io_statementContext io_statement() {
			return getRuleContext(Io_statementContext.class,0);
		}
		public Comp_statementContext comp_statement() {
			return getRuleContext(Comp_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_statement);
		try {
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				if_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(439);
				while_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(440);
				for_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(441);
				with_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(442);
				subprogram_call();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(443);
				io_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(444);
				comp_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
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

	public static class AssignmentContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SimplePascalParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SimplePascalParser.STRING, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_assignment);
		try {
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				variable(0);
				setState(449);
				match(ASSIGN);
				setState(450);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				variable(0);
				setState(453);
				match(ASSIGN);
				setState(454);
				match(STRING);
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SimplePascalParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(SimplePascalParser.THEN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public If_tailContext if_tail() {
			return getRuleContext(If_tailContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(IF);
			setState(459);
			expression(0);
			setState(460);
			match(THEN);
			setState(461);
			statement();
			setState(462);
			if_tail();
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

	public static class If_tailContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(SimplePascalParser.ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public If_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterIf_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitIf_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitIf_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_tailContext if_tail() throws RecognitionException {
		If_tailContext _localctx = new If_tailContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_if_tail);
		try {
			setState(467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				match(ELSE);
				setState(465);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class While_statementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(SimplePascalParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(SimplePascalParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(WHILE);
			setState(470);
			expression(0);
			setState(471);
			match(DO);
			setState(472);
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

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(SimplePascalParser.FOR, 0); }
		public TerminalNode ID() { return getToken(SimplePascalParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(SimplePascalParser.ASSIGN, 0); }
		public Iter_spaceContext iter_space() {
			return getRuleContext(Iter_spaceContext.class,0);
		}
		public TerminalNode DO() { return getToken(SimplePascalParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_for_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(FOR);
			setState(475);
			match(ID);
			setState(476);
			match(ASSIGN);
			setState(477);
			iter_space();
			setState(478);
			match(DO);
			setState(479);
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

	public static class Iter_spaceContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TO() { return getToken(SimplePascalParser.TO, 0); }
		public TerminalNode DOWNTO() { return getToken(SimplePascalParser.DOWNTO, 0); }
		public Iter_spaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iter_space; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterIter_space(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitIter_space(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitIter_space(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Iter_spaceContext iter_space() throws RecognitionException {
		Iter_spaceContext _localctx = new Iter_spaceContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_iter_space);
		try {
			setState(489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				expression(0);
				setState(482);
				match(TO);
				setState(483);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				expression(0);
				setState(486);
				match(DOWNTO);
				setState(487);
				expression(0);
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

	public static class With_statementContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SimplePascalParser.WITH, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode DO() { return getToken(SimplePascalParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public With_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterWith_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitWith_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitWith_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_statementContext with_statement() throws RecognitionException {
		With_statementContext _localctx = new With_statementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_with_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(WITH);
			setState(492);
			variable(0);
			setState(493);
			match(DO);
			setState(494);
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

	public static class Subprogram_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SimplePascalParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(SimplePascalParser.LPAREN, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimplePascalParser.RPAREN, 0); }
		public Subprogram_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterSubprogram_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitSubprogram_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitSubprogram_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subprogram_callContext subprogram_call() throws RecognitionException {
		Subprogram_callContext _localctx = new Subprogram_callContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_subprogram_call);
		try {
			setState(502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				match(ID);
				setState(498);
				match(LPAREN);
				setState(499);
				expressions(0);
				setState(500);
				match(RPAREN);
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

	public static class Io_statementContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(SimplePascalParser.READ, 0); }
		public TerminalNode LPAREN() { return getToken(SimplePascalParser.LPAREN, 0); }
		public Read_listContext read_list() {
			return getRuleContext(Read_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SimplePascalParser.RPAREN, 0); }
		public TerminalNode WRITE() { return getToken(SimplePascalParser.WRITE, 0); }
		public Write_listContext write_list() {
			return getRuleContext(Write_listContext.class,0);
		}
		public Io_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_io_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterIo_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitIo_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitIo_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Io_statementContext io_statement() throws RecognitionException {
		Io_statementContext _localctx = new Io_statementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_io_statement);
		try {
			setState(514);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				match(READ);
				setState(505);
				match(LPAREN);
				setState(506);
				read_list(0);
				setState(507);
				match(RPAREN);
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
				match(WRITE);
				setState(510);
				match(LPAREN);
				setState(511);
				write_list(0);
				setState(512);
				match(RPAREN);
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

	public static class Read_listContext extends ParserRuleContext {
		public Read_itemContext read_item() {
			return getRuleContext(Read_itemContext.class,0);
		}
		public Read_listContext read_list() {
			return getRuleContext(Read_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SimplePascalParser.COMMA, 0); }
		public Read_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterRead_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitRead_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitRead_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_listContext read_list() throws RecognitionException {
		return read_list(0);
	}

	private Read_listContext read_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Read_listContext _localctx = new Read_listContext(_ctx, _parentState);
		Read_listContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_read_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(517);
			read_item();
			}
			_ctx.stop = _input.LT(-1);
			setState(524);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Read_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_read_list);
					setState(519);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(520);
					match(COMMA);
					setState(521);
					read_item();
					}
					} 
				}
				setState(526);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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

	public static class Read_itemContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Read_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterRead_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitRead_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitRead_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_itemContext read_item() throws RecognitionException {
		Read_itemContext _localctx = new Read_itemContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_read_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			variable(0);
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

	public static class Write_listContext extends ParserRuleContext {
		public Write_itemContext write_item() {
			return getRuleContext(Write_itemContext.class,0);
		}
		public Write_listContext write_list() {
			return getRuleContext(Write_listContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SimplePascalParser.COMMA, 0); }
		public Write_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterWrite_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitWrite_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitWrite_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Write_listContext write_list() throws RecognitionException {
		return write_list(0);
	}

	private Write_listContext write_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Write_listContext _localctx = new Write_listContext(_ctx, _parentState);
		Write_listContext _prevctx = _localctx;
		int _startState = 90;
		enterRecursionRule(_localctx, 90, RULE_write_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(530);
			write_item();
			}
			_ctx.stop = _input.LT(-1);
			setState(537);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Write_listContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_write_list);
					setState(532);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(533);
					match(COMMA);
					setState(534);
					write_item();
					}
					} 
				}
				setState(539);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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

	public static class Write_itemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SimplePascalParser.STRING, 0); }
		public Write_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).enterWrite_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimplePascalListener ) ((SimplePascalListener)listener).exitWrite_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimplePascalVisitor ) return ((SimplePascalVisitor<? extends T>)visitor).visitWrite_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Write_itemContext write_item() throws RecognitionException {
		Write_itemContext _localctx = new Write_itemContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_write_item);
		try {
			setState(542);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RCONST:
			case ICONST:
			case BCONST:
			case CCONST:
			case ADDOP:
			case SUBOP:
			case NOTOP:
			case LPAREN:
			case LBRACK:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				expression(0);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
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
		case 4:
			return constant_defs_sempred((Constant_defsContext)_localctx, predIndex);
		case 5:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 6:
			return variable_sempred((VariableContext)_localctx, predIndex);
		case 7:
			return expressions_sempred((ExpressionsContext)_localctx, predIndex);
		case 10:
			return elexpressions_sempred((ElexpressionsContext)_localctx, predIndex);
		case 13:
			return type_defs_sempred((Type_defsContext)_localctx, predIndex);
		case 15:
			return dims_sempred((DimsContext)_localctx, predIndex);
		case 20:
			return fields_sempred((FieldsContext)_localctx, predIndex);
		case 22:
			return identifiers_sempred((IdentifiersContext)_localctx, predIndex);
		case 24:
			return variable_defs_sempred((Variable_defsContext)_localctx, predIndex);
		case 25:
			return subprograms_sempred((SubprogramsContext)_localctx, predIndex);
		case 29:
			return parameter_list_sempred((Parameter_listContext)_localctx, predIndex);
		case 32:
			return statements_sempred((StatementsContext)_localctx, predIndex);
		case 43:
			return read_list_sempred((Read_listContext)_localctx, predIndex);
		case 45:
			return write_list_sempred((Write_listContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean constant_defs_sempred(Constant_defsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean variable_sempred(VariableContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expressions_sempred(ExpressionsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean elexpressions_sempred(ElexpressionsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean type_defs_sempred(Type_defsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean dims_sempred(DimsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean fields_sempred(FieldsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean identifiers_sempred(IdentifiersContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean variable_defs_sempred(Variable_defsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean subprograms_sempred(SubprogramsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean parameter_list_sempred(Parameter_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean statements_sempred(StatementsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean read_list_sempred(Read_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean write_list_sempred(Write_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001A\u0221\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003r\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004~\b\u0004\n\u0004\f\u0004"+
		"\u0081\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u0094\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005\u00a2\b\u0005\n\u0005\f\u0005\u00a5"+
		"\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u00b2\b\u0006\n\u0006\f\u0006\u00b5\t\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00bd\b\u0007"+
		"\n\u0007\f\u0007\u00c0\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b"+
		"\u00c6\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00ce"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00d6\b\n"+
		"\n\n\f\n\u00d9\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00e0\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u00e7\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0005\r\u00f3\b\r\n\r\f\r\u00f6\t\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u010e\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u0116\b\u000f\n\u000f\f\u000f\u0119\t\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0120\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u012a\b\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u012e"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0134"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0005\u0014\u013c\b\u0014\n\u0014\f\u0014\u013f\t\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u014b\b\u0016\n\u0016"+
		"\f\u0016\u014e\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u0155\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0005\u0018\u0162\b\u0018\n\u0018\f\u0018\u0165"+
		"\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005"+
		"\u0019\u016c\b\u0019\n\u0019\f\u0019\u016f\t\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u017b\b\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0188\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u018f\b\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0005\u001d\u019e\b\u001d\n\u001d\f\u001d\u01a1\t\u001d\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u01a5\b\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u01b1"+
		"\b \n \f \u01b4\t \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0003!\u01bf\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0003\"\u01c9\b\"\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001$\u0001$\u0001$\u0003$\u01d4\b$\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u01ea\b\'\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0003)\u01f7\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0003*\u0203\b*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0005+\u020b\b+\n+\f+\u020e\t+\u0001,\u0001,\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0005-\u0218\b-\n-\f-\u021b\t-\u0001.\u0001.\u0003.\u021f"+
		"\b.\u0001.\u0000\u000f\b\n\f\u000e\u0014\u001a\u001e(,02:@VZ/\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\\u0000\u0003\u0001\u0000()\u0001\u0000"+
		"+/\u0003\u0000$\'1177\u0233\u0000^\u0001\u0000\u0000\u0000\u0002d\u0001"+
		"\u0000\u0000\u0000\u0004h\u0001\u0000\u0000\u0000\u0006q\u0001\u0000\u0000"+
		"\u0000\bs\u0001\u0000\u0000\u0000\n\u0093\u0001\u0000\u0000\u0000\f\u00a6"+
		"\u0001\u0000\u0000\u0000\u000e\u00b6\u0001\u0000\u0000\u0000\u0010\u00c5"+
		"\u0001\u0000\u0000\u0000\u0012\u00cd\u0001\u0000\u0000\u0000\u0014\u00cf"+
		"\u0001\u0000\u0000\u0000\u0016\u00df\u0001\u0000\u0000\u0000\u0018\u00e6"+
		"\u0001\u0000\u0000\u0000\u001a\u00e8\u0001\u0000\u0000\u0000\u001c\u010d"+
		"\u0001\u0000\u0000\u0000\u001e\u010f\u0001\u0000\u0000\u0000 \u011f\u0001"+
		"\u0000\u0000\u0000\"\u0129\u0001\u0000\u0000\u0000$\u012d\u0001\u0000"+
		"\u0000\u0000&\u0133\u0001\u0000\u0000\u0000(\u0135\u0001\u0000\u0000\u0000"+
		"*\u0140\u0001\u0000\u0000\u0000,\u0144\u0001\u0000\u0000\u0000.\u0154"+
		"\u0001\u0000\u0000\u00000\u0156\u0001\u0000\u0000\u00002\u0166\u0001\u0000"+
		"\u0000\u00004\u017a\u0001\u0000\u0000\u00006\u0187\u0001\u0000\u0000\u0000"+
		"8\u018e\u0001\u0000\u0000\u0000:\u0190\u0001\u0000\u0000\u0000<\u01a4"+
		"\u0001\u0000\u0000\u0000>\u01a6\u0001\u0000\u0000\u0000@\u01aa\u0001\u0000"+
		"\u0000\u0000B\u01be\u0001\u0000\u0000\u0000D\u01c8\u0001\u0000\u0000\u0000"+
		"F\u01ca\u0001\u0000\u0000\u0000H\u01d3\u0001\u0000\u0000\u0000J\u01d5"+
		"\u0001\u0000\u0000\u0000L\u01da\u0001\u0000\u0000\u0000N\u01e9\u0001\u0000"+
		"\u0000\u0000P\u01eb\u0001\u0000\u0000\u0000R\u01f6\u0001\u0000\u0000\u0000"+
		"T\u0202\u0001\u0000\u0000\u0000V\u0204\u0001\u0000\u0000\u0000X\u020f"+
		"\u0001\u0000\u0000\u0000Z\u0211\u0001\u0000\u0000\u0000\\\u021e\u0001"+
		"\u0000\u0000\u0000^_\u0003\u0002\u0001\u0000_`\u0003\u0004\u0002\u0000"+
		"`a\u00032\u0019\u0000ab\u0003>\u001f\u0000bc\u0005<\u0000\u0000c\u0001"+
		"\u0001\u0000\u0000\u0000de\u0005\u0001\u0000\u0000ef\u0005>\u0000\u0000"+
		"fg\u00055\u0000\u0000g\u0003\u0001\u0000\u0000\u0000hi\u0003\u0006\u0003"+
		"\u0000ij\u0003\u0018\f\u0000jk\u0003.\u0017\u0000k\u0005\u0001\u0000\u0000"+
		"\u0000lm\u0005\u0002\u0000\u0000mn\u0003\b\u0004\u0000no\u00055\u0000"+
		"\u0000or\u0001\u0000\u0000\u0000pr\u0001\u0000\u0000\u0000ql\u0001\u0000"+
		"\u0000\u0000qp\u0001\u0000\u0000\u0000r\u0007\u0001\u0000\u0000\u0000"+
		"st\u0006\u0004\uffff\uffff\u0000tu\u0005>\u0000\u0000uv\u00057\u0000\u0000"+
		"vw\u0003\n\u0005\u0000w\u007f\u0001\u0000\u0000\u0000xy\n\u0002\u0000"+
		"\u0000yz\u00055\u0000\u0000z{\u0005>\u0000\u0000{|\u00057\u0000\u0000"+
		"|~\u0003\n\u0005\u0000}x\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000"+
		"\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000"+
		"\u0080\t\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0006\u0005\uffff\uffff\u0000\u0083\u0084\u00050\u0000\u0000\u0084"+
		"\u0094\u0003\n\u0005\u0007\u0085\u0086\u0007\u0000\u0000\u0000\u0086\u0094"+
		"\u0003\n\u0005\u0006\u0087\u0094\u0003\f\u0006\u0000\u0088\u0089\u0005"+
		">\u0000\u0000\u0089\u008a\u00053\u0000\u0000\u008a\u008b\u0003\u000e\u0007"+
		"\u0000\u008b\u008c\u00054\u0000\u0000\u008c\u0094\u0001\u0000\u0000\u0000"+
		"\u008d\u0094\u0003\u0010\b\u0000\u008e\u008f\u00053\u0000\u0000\u008f"+
		"\u0090\u0003\n\u0005\u0000\u0090\u0091\u00054\u0000\u0000\u0091\u0094"+
		"\u0001\u0000\u0000\u0000\u0092\u0094\u0003\u0012\t\u0000\u0093\u0082\u0001"+
		"\u0000\u0000\u0000\u0093\u0085\u0001\u0000\u0000\u0000\u0093\u0087\u0001"+
		"\u0000\u0000\u0000\u0093\u0088\u0001\u0000\u0000\u0000\u0093\u008d\u0001"+
		"\u0000\u0000\u0000\u0093\u008e\u0001\u0000\u0000\u0000\u0093\u0092\u0001"+
		"\u0000\u0000\u0000\u0094\u00a3\u0001\u0000\u0000\u0000\u0095\u0096\n\u000b"+
		"\u0000\u0000\u0096\u0097\u0005*\u0000\u0000\u0097\u00a2\u0003\n\u0005"+
		"\f\u0098\u0099\n\n\u0000\u0000\u0099\u009a\u0007\u0001\u0000\u0000\u009a"+
		"\u00a2\u0003\n\u0005\u000b\u009b\u009c\n\t\u0000\u0000\u009c\u009d\u0007"+
		"\u0000\u0000\u0000\u009d\u00a2\u0003\n\u0005\n\u009e\u009f\n\b\u0000\u0000"+
		"\u009f\u00a0\u0007\u0002\u0000\u0000\u00a0\u00a2\u0003\n\u0005\t\u00a1"+
		"\u0095\u0001\u0000\u0000\u0000\u00a1\u0098\u0001\u0000\u0000\u0000\u00a1"+
		"\u009b\u0001\u0000\u0000\u0000\u00a1\u009e\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a4\u000b\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a7\u0006\u0006\uffff\uffff\u0000"+
		"\u00a7\u00a8\u0005>\u0000\u0000\u00a8\u00b3\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\n\u0002\u0000\u0000\u00aa\u00ab\u0005<\u0000\u0000\u00ab\u00b2"+
		"\u0005>\u0000\u0000\u00ac\u00ad\n\u0001\u0000\u0000\u00ad\u00ae\u0005"+
		"9\u0000\u0000\u00ae\u00af\u0003\u000e\u0007\u0000\u00af\u00b0\u0005:\u0000"+
		"\u0000\u00b0\u00b2\u0001\u0000\u0000\u0000\u00b1\u00a9\u0001\u0000\u0000"+
		"\u0000\u00b1\u00ac\u0001\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b4\r\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b7\u0006\u0007\uffff\uffff\u0000\u00b7\u00b8\u0003\n\u0005\u0000"+
		"\u00b8\u00be\u0001\u0000\u0000\u0000\u00b9\u00ba\n\u0002\u0000\u0000\u00ba"+
		"\u00bb\u00056\u0000\u0000\u00bb\u00bd\u0003\n\u0005\u0000\u00bc\u00b9"+
		"\u0001\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc"+
		"\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u000f"+
		"\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1\u00c6"+
		"\u0005\u001e\u0000\u0000\u00c2\u00c6\u0005\u001d\u0000\u0000\u00c3\u00c6"+
		"\u0005!\u0000\u0000\u00c4\u00c6\u0005\"\u0000\u0000\u00c5\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c6\u0011\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u00059\u0000\u0000\u00c8\u00c9\u0003\u0014"+
		"\n\u0000\u00c9\u00ca\u0005:\u0000\u0000\u00ca\u00ce\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cc\u00059\u0000\u0000\u00cc\u00ce\u0005:\u0000\u0000\u00cd"+
		"\u00c7\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce"+
		"\u0013\u0001\u0000\u0000\u0000\u00cf\u00d0\u0006\n\uffff\uffff\u0000\u00d0"+
		"\u00d1\u0003\u0016\u000b\u0000\u00d1\u00d7\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d3\n\u0002\u0000\u0000\u00d3\u00d4\u00056\u0000\u0000\u00d4\u00d6"+
		"\u0003\u0016\u000b\u0000\u00d5\u00d2\u0001\u0000\u0000\u0000\u00d6\u00d9"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8"+
		"\u0001\u0000\u0000\u0000\u00d8\u0015\u0001\u0000\u0000\u0000\u00d9\u00d7"+
		"\u0001\u0000\u0000\u0000\u00da\u00db\u0003\n\u0005\u0000\u00db\u00dc\u0005"+
		"=\u0000\u0000\u00dc\u00dd\u0003\n\u0005\u0000\u00dd\u00e0\u0001\u0000"+
		"\u0000\u0000\u00de\u00e0\u0003\n\u0005\u0000\u00df\u00da\u0001\u0000\u0000"+
		"\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00e0\u0017\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e2\u0005\u0003\u0000\u0000\u00e2\u00e3\u0003\u001a\r\u0000"+
		"\u00e3\u00e4\u00055\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e6\u00e1\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e7\u0019\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e9\u0006\r\uffff\uffff\u0000\u00e9\u00ea\u0005>\u0000\u0000\u00ea"+
		"\u00eb\u00057\u0000\u0000\u00eb\u00ec\u0003\u001c\u000e\u0000\u00ec\u00f4"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ee\n\u0002\u0000\u0000\u00ee\u00ef\u0005"+
		"5\u0000\u0000\u00ef\u00f0\u0005>\u0000\u0000\u00f0\u00f1\u00057\u0000"+
		"\u0000\u00f1\u00f3\u0003\u001c\u000e\u0000\u00f2\u00ed\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f6\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u001b\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005\u0004\u0000"+
		"\u0000\u00f8\u00f9\u00059\u0000\u0000\u00f9\u00fa\u0003\u001e\u000f\u0000"+
		"\u00fa\u00fb\u0005:\u0000\u0000\u00fb\u00fc\u0005\u0006\u0000\u0000\u00fc"+
		"\u00fd\u0003$\u0012\u0000\u00fd\u010e\u0001\u0000\u0000\u0000\u00fe\u00ff"+
		"\u0005\u0005\u0000\u0000\u00ff\u0100\u0005\u0006\u0000\u0000\u0100\u010e"+
		"\u0003$\u0012\u0000\u0101\u0102\u0005\u0007\u0000\u0000\u0102\u0103\u0003"+
		"(\u0014\u0000\u0103\u0104\u0005\u0011\u0000\u0000\u0104\u010e\u0001\u0000"+
		"\u0000\u0000\u0105\u0106\u00053\u0000\u0000\u0106\u0107\u0003,\u0016\u0000"+
		"\u0107\u0108\u00054\u0000\u0000\u0108\u010e\u0001\u0000\u0000\u0000\u0109"+
		"\u010a\u0003\"\u0011\u0000\u010a\u010b\u0005=\u0000\u0000\u010b\u010c"+
		"\u0003\"\u0011\u0000\u010c\u010e\u0001\u0000\u0000\u0000\u010d\u00f7\u0001"+
		"\u0000\u0000\u0000\u010d\u00fe\u0001\u0000\u0000\u0000\u010d\u0101\u0001"+
		"\u0000\u0000\u0000\u010d\u0105\u0001\u0000\u0000\u0000\u010d\u0109\u0001"+
		"\u0000\u0000\u0000\u010e\u001d\u0001\u0000\u0000\u0000\u010f\u0110\u0006"+
		"\u000f\uffff\uffff\u0000\u0110\u0111\u0003 \u0010\u0000\u0111\u0117\u0001"+
		"\u0000\u0000\u0000\u0112\u0113\n\u0002\u0000\u0000\u0113\u0114\u00056"+
		"\u0000\u0000\u0114\u0116\u0003 \u0010\u0000\u0115\u0112\u0001\u0000\u0000"+
		"\u0000\u0116\u0119\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000"+
		"\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u001f\u0001\u0000\u0000"+
		"\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u011a\u011b\u0003\"\u0011\u0000"+
		"\u011b\u011c\u0005=\u0000\u0000\u011c\u011d\u0003\"\u0011\u0000\u011d"+
		"\u0120\u0001\u0000\u0000\u0000\u011e\u0120\u0005>\u0000\u0000\u011f\u011a"+
		"\u0001\u0000\u0000\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u0120!\u0001"+
		"\u0000\u0000\u0000\u0121\u0122\u0007\u0000\u0000\u0000\u0122\u012a\u0005"+
		"\u001e\u0000\u0000\u0123\u012a\u0005\u001e\u0000\u0000\u0124\u0125\u0007"+
		"\u0000\u0000\u0000\u0125\u012a\u0005>\u0000\u0000\u0126\u012a\u0005\""+
		"\u0000\u0000\u0127\u012a\u0005!\u0000\u0000\u0128\u012a\u0005>\u0000\u0000"+
		"\u0129\u0121\u0001\u0000\u0000\u0000\u0129\u0123\u0001\u0000\u0000\u0000"+
		"\u0129\u0124\u0001\u0000\u0000\u0000\u0129\u0126\u0001\u0000\u0000\u0000"+
		"\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u0128\u0001\u0000\u0000\u0000"+
		"\u012a#\u0001\u0000\u0000\u0000\u012b\u012e\u0003&\u0013\u0000\u012c\u012e"+
		"\u0005>\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012c\u0001"+
		"\u0000\u0000\u0000\u012e%\u0001\u0000\u0000\u0000\u012f\u0134\u0005\f"+
		"\u0000\u0000\u0130\u0134\u0005\r\u0000\u0000\u0131\u0134\u0005\u000e\u0000"+
		"\u0000\u0132\u0134\u0005\u000f\u0000\u0000\u0133\u012f\u0001\u0000\u0000"+
		"\u0000\u0133\u0130\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000"+
		"\u0000\u0133\u0132\u0001\u0000\u0000\u0000\u0134\'\u0001\u0000\u0000\u0000"+
		"\u0135\u0136\u0006\u0014\uffff\uffff\u0000\u0136\u0137\u0003*\u0015\u0000"+
		"\u0137\u013d\u0001\u0000\u0000\u0000\u0138\u0139\n\u0002\u0000\u0000\u0139"+
		"\u013a\u00055\u0000\u0000\u013a\u013c\u0003*\u0015\u0000\u013b\u0138\u0001"+
		"\u0000\u0000\u0000\u013c\u013f\u0001\u0000\u0000\u0000\u013d\u013b\u0001"+
		"\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e)\u0001\u0000"+
		"\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u0140\u0141\u0003,\u0016"+
		"\u0000\u0141\u0142\u00058\u0000\u0000\u0142\u0143\u0003$\u0012\u0000\u0143"+
		"+\u0001\u0000\u0000\u0000\u0144\u0145\u0006\u0016\uffff\uffff\u0000\u0145"+
		"\u0146\u0005>\u0000\u0000\u0146\u014c\u0001\u0000\u0000\u0000\u0147\u0148"+
		"\n\u0002\u0000\u0000\u0148\u0149\u00056\u0000\u0000\u0149\u014b\u0005"+
		">\u0000\u0000\u014a\u0147\u0001\u0000\u0000\u0000\u014b\u014e\u0001\u0000"+
		"\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000"+
		"\u0000\u0000\u014d-\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000"+
		"\u0000\u014f\u0150\u0005\b\u0000\u0000\u0150\u0151\u00030\u0018\u0000"+
		"\u0151\u0152\u00055\u0000\u0000\u0152\u0155\u0001\u0000\u0000\u0000\u0153"+
		"\u0155\u0001\u0000\u0000\u0000\u0154\u014f\u0001\u0000\u0000\u0000\u0154"+
		"\u0153\u0001\u0000\u0000\u0000\u0155/\u0001\u0000\u0000\u0000\u0156\u0157"+
		"\u0006\u0018\uffff\uffff\u0000\u0157\u0158\u0003,\u0016\u0000\u0158\u0159"+
		"\u00058\u0000\u0000\u0159\u015a\u0003$\u0012\u0000\u015a\u0163\u0001\u0000"+
		"\u0000\u0000\u015b\u015c\n\u0002\u0000\u0000\u015c\u015d\u00055\u0000"+
		"\u0000\u015d\u015e\u0003,\u0016\u0000\u015e\u015f\u00058\u0000\u0000\u015f"+
		"\u0160\u0003$\u0012\u0000\u0160\u0162\u0001\u0000\u0000\u0000\u0161\u015b"+
		"\u0001\u0000\u0000\u0000\u0162\u0165\u0001\u0000\u0000\u0000\u0163\u0161"+
		"\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u01641\u0001"+
		"\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0166\u016d\u0006"+
		"\u0019\uffff\uffff\u0000\u0167\u0168\n\u0002\u0000\u0000\u0168\u0169\u0003"+
		"4\u001a\u0000\u0169\u016a\u00055\u0000\u0000\u016a\u016c\u0001\u0000\u0000"+
		"\u0000\u016b\u0167\u0001\u0000\u0000\u0000\u016c\u016f\u0001\u0000\u0000"+
		"\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000"+
		"\u0000\u016e3\u0001\u0000\u0000\u0000\u016f\u016d\u0001\u0000\u0000\u0000"+
		"\u0170\u0171\u00036\u001b\u0000\u0171\u0172\u00055\u0000\u0000\u0172\u0173"+
		"\u0005\t\u0000\u0000\u0173\u017b\u0001\u0000\u0000\u0000\u0174\u0175\u0003"+
		"6\u001b\u0000\u0175\u0176\u00055\u0000\u0000\u0176\u0177\u0003\u0004\u0002"+
		"\u0000\u0177\u0178\u00032\u0019\u0000\u0178\u0179\u0003>\u001f\u0000\u0179"+
		"\u017b\u0001\u0000\u0000\u0000\u017a\u0170\u0001\u0000\u0000\u0000\u017a"+
		"\u0174\u0001\u0000\u0000\u0000\u017b5\u0001\u0000\u0000\u0000\u017c\u017d"+
		"\u0005\n\u0000\u0000\u017d\u017e\u0005>\u0000\u0000\u017e\u017f\u0003"+
		"8\u001c\u0000\u017f\u0180\u00058\u0000\u0000\u0180\u0181\u0003&\u0013"+
		"\u0000\u0181\u0188\u0001\u0000\u0000\u0000\u0182\u0183\u0005\u000b\u0000"+
		"\u0000\u0183\u0184\u0005>\u0000\u0000\u0184\u0188\u00038\u001c\u0000\u0185"+
		"\u0186\u0005\n\u0000\u0000\u0186\u0188\u0005>\u0000\u0000\u0187\u017c"+
		"\u0001\u0000\u0000\u0000\u0187\u0182\u0001\u0000\u0000\u0000\u0187\u0185"+
		"\u0001\u0000\u0000\u0000\u01887\u0001\u0000\u0000\u0000\u0189\u018a\u0005"+
		"3\u0000\u0000\u018a\u018b\u0003:\u001d\u0000\u018b\u018c\u00054\u0000"+
		"\u0000\u018c\u018f\u0001\u0000\u0000\u0000\u018d\u018f\u0001\u0000\u0000"+
		"\u0000\u018e\u0189\u0001\u0000\u0000\u0000\u018e\u018d\u0001\u0000\u0000"+
		"\u0000\u018f9\u0001\u0000\u0000\u0000\u0190\u0191\u0006\u001d\uffff\uffff"+
		"\u0000\u0191\u0192\u0003<\u001e\u0000\u0192\u0193\u0003,\u0016\u0000\u0193"+
		"\u0194\u00058\u0000\u0000\u0194\u0195\u0003$\u0012\u0000\u0195\u019f\u0001"+
		"\u0000\u0000\u0000\u0196\u0197\n\u0002\u0000\u0000\u0197\u0198\u00055"+
		"\u0000\u0000\u0198\u0199\u0003<\u001e\u0000\u0199\u019a\u0003,\u0016\u0000"+
		"\u019a\u019b\u00058\u0000\u0000\u019b\u019c\u0003$\u0012\u0000\u019c\u019e"+
		"\u0001\u0000\u0000\u0000\u019d\u0196\u0001\u0000\u0000\u0000\u019e\u01a1"+
		"\u0001\u0000\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u019f\u01a0"+
		"\u0001\u0000\u0000\u0000\u01a0;\u0001\u0000\u0000\u0000\u01a1\u019f\u0001"+
		"\u0000\u0000\u0000\u01a2\u01a5\u0005\b\u0000\u0000\u01a3\u01a5\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a3\u0001\u0000"+
		"\u0000\u0000\u01a5=\u0001\u0000\u0000\u0000\u01a6\u01a7\u0005\u0010\u0000"+
		"\u0000\u01a7\u01a8\u0003@ \u0000\u01a8\u01a9\u0005\u0011\u0000\u0000\u01a9"+
		"?\u0001\u0000\u0000\u0000\u01aa\u01ab\u0006 \uffff\uffff\u0000\u01ab\u01ac"+
		"\u0003B!\u0000\u01ac\u01b2\u0001\u0000\u0000\u0000\u01ad\u01ae\n\u0002"+
		"\u0000\u0000\u01ae\u01af\u00055\u0000\u0000\u01af\u01b1\u0003B!\u0000"+
		"\u01b0\u01ad\u0001\u0000\u0000\u0000\u01b1\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000"+
		"\u01b3A\u0001\u0000\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b5"+
		"\u01bf\u0003D\"\u0000\u01b6\u01bf\u0003F#\u0000\u01b7\u01bf\u0003J%\u0000"+
		"\u01b8\u01bf\u0003L&\u0000\u01b9\u01bf\u0003P(\u0000\u01ba\u01bf\u0003"+
		"R)\u0000\u01bb\u01bf\u0003T*\u0000\u01bc\u01bf\u0003>\u001f\u0000\u01bd"+
		"\u01bf\u0001\u0000\u0000\u0000\u01be\u01b5\u0001\u0000\u0000\u0000\u01be"+
		"\u01b6\u0001\u0000\u0000\u0000\u01be\u01b7\u0001\u0000\u0000\u0000\u01be"+
		"\u01b8\u0001\u0000\u0000\u0000\u01be\u01b9\u0001\u0000\u0000\u0000\u01be"+
		"\u01ba\u0001\u0000\u0000\u0000\u01be\u01bb\u0001\u0000\u0000\u0000\u01be"+
		"\u01bc\u0001\u0000\u0000\u0000\u01be\u01bd\u0001\u0000\u0000\u0000\u01bf"+
		"C\u0001\u0000\u0000\u0000\u01c0\u01c1\u0003\f\u0006\u0000\u01c1\u01c2"+
		"\u0005;\u0000\u0000\u01c2\u01c3\u0003\n\u0005\u0000\u01c3\u01c9\u0001"+
		"\u0000\u0000\u0000\u01c4\u01c5\u0003\f\u0006\u0000\u01c5\u01c6\u0005;"+
		"\u0000\u0000\u01c6\u01c7\u00052\u0000\u0000\u01c7\u01c9\u0001\u0000\u0000"+
		"\u0000\u01c8\u01c0\u0001\u0000\u0000\u0000\u01c8\u01c4\u0001\u0000\u0000"+
		"\u0000\u01c9E\u0001\u0000\u0000\u0000\u01ca\u01cb\u0005\u0012\u0000\u0000"+
		"\u01cb\u01cc\u0003\n\u0005\u0000\u01cc\u01cd\u0005\u0013\u0000\u0000\u01cd"+
		"\u01ce\u0003B!\u0000\u01ce\u01cf\u0003H$\u0000\u01cfG\u0001\u0000\u0000"+
		"\u0000\u01d0\u01d1\u0005\u0014\u0000\u0000\u01d1\u01d4\u0003B!\u0000\u01d2"+
		"\u01d4\u0001\u0000\u0000\u0000\u01d3\u01d0\u0001\u0000\u0000\u0000\u01d3"+
		"\u01d2\u0001\u0000\u0000\u0000\u01d4I\u0001\u0000\u0000\u0000\u01d5\u01d6"+
		"\u0005\u0015\u0000\u0000\u01d6\u01d7\u0003\n\u0005\u0000\u01d7\u01d8\u0005"+
		"\u0016\u0000\u0000\u01d8\u01d9\u0003B!\u0000\u01d9K\u0001\u0000\u0000"+
		"\u0000\u01da\u01db\u0005\u0017\u0000\u0000\u01db\u01dc\u0005>\u0000\u0000"+
		"\u01dc\u01dd\u0005;\u0000\u0000\u01dd\u01de\u0003N\'\u0000\u01de\u01df"+
		"\u0005\u0016\u0000\u0000\u01df\u01e0\u0003B!\u0000\u01e0M\u0001\u0000"+
		"\u0000\u0000\u01e1\u01e2\u0003\n\u0005\u0000\u01e2\u01e3\u0005\u0019\u0000"+
		"\u0000\u01e3\u01e4\u0003\n\u0005\u0000\u01e4\u01ea\u0001\u0000\u0000\u0000"+
		"\u01e5\u01e6\u0003\n\u0005\u0000\u01e6\u01e7\u0005\u0018\u0000\u0000\u01e7"+
		"\u01e8\u0003\n\u0005\u0000\u01e8\u01ea\u0001\u0000\u0000\u0000\u01e9\u01e1"+
		"\u0001\u0000\u0000\u0000\u01e9\u01e5\u0001\u0000\u0000\u0000\u01eaO\u0001"+
		"\u0000\u0000\u0000\u01eb\u01ec\u0005\u001a\u0000\u0000\u01ec\u01ed\u0003"+
		"\f\u0006\u0000\u01ed\u01ee\u0005\u0016\u0000\u0000\u01ee\u01ef\u0003B"+
		"!\u0000\u01efQ\u0001\u0000\u0000\u0000\u01f0\u01f7\u0005>\u0000\u0000"+
		"\u01f1\u01f2\u0005>\u0000\u0000\u01f2\u01f3\u00053\u0000\u0000\u01f3\u01f4"+
		"\u0003\u000e\u0007\u0000\u01f4\u01f5\u00054\u0000\u0000\u01f5\u01f7\u0001"+
		"\u0000\u0000\u0000\u01f6\u01f0\u0001\u0000\u0000\u0000\u01f6\u01f1\u0001"+
		"\u0000\u0000\u0000\u01f7S\u0001\u0000\u0000\u0000\u01f8\u01f9\u0005\u001b"+
		"\u0000\u0000\u01f9\u01fa\u00053\u0000\u0000\u01fa\u01fb\u0003V+\u0000"+
		"\u01fb\u01fc\u00054\u0000\u0000\u01fc\u0203\u0001\u0000\u0000\u0000\u01fd"+
		"\u01fe\u0005\u001c\u0000\u0000\u01fe\u01ff\u00053\u0000\u0000\u01ff\u0200"+
		"\u0003Z-\u0000\u0200\u0201\u00054\u0000\u0000\u0201\u0203\u0001\u0000"+
		"\u0000\u0000\u0202\u01f8\u0001\u0000\u0000\u0000\u0202\u01fd\u0001\u0000"+
		"\u0000\u0000\u0203U\u0001\u0000\u0000\u0000\u0204\u0205\u0006+\uffff\uffff"+
		"\u0000\u0205\u0206\u0003X,\u0000\u0206\u020c\u0001\u0000\u0000\u0000\u0207"+
		"\u0208\n\u0002\u0000\u0000\u0208\u0209\u00056\u0000\u0000\u0209\u020b"+
		"\u0003X,\u0000\u020a\u0207\u0001\u0000\u0000\u0000\u020b\u020e\u0001\u0000"+
		"\u0000\u0000\u020c\u020a\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000"+
		"\u0000\u0000\u020dW\u0001\u0000\u0000\u0000\u020e\u020c\u0001\u0000\u0000"+
		"\u0000\u020f\u0210\u0003\f\u0006\u0000\u0210Y\u0001\u0000\u0000\u0000"+
		"\u0211\u0212\u0006-\uffff\uffff\u0000\u0212\u0213\u0003\\.\u0000\u0213"+
		"\u0219\u0001\u0000\u0000\u0000\u0214\u0215\n\u0002\u0000\u0000\u0215\u0216"+
		"\u00056\u0000\u0000\u0216\u0218\u0003\\.\u0000\u0217\u0214\u0001\u0000"+
		"\u0000\u0000\u0218\u021b\u0001\u0000\u0000\u0000\u0219\u0217\u0001\u0000"+
		"\u0000\u0000\u0219\u021a\u0001\u0000\u0000\u0000\u021a[\u0001\u0000\u0000"+
		"\u0000\u021b\u0219\u0001\u0000\u0000\u0000\u021c\u021f\u0003\n\u0005\u0000"+
		"\u021d\u021f\u00052\u0000\u0000\u021e\u021c\u0001\u0000\u0000\u0000\u021e"+
		"\u021d\u0001\u0000\u0000\u0000\u021f]\u0001\u0000\u0000\u0000(q\u007f"+
		"\u0093\u00a1\u00a3\u00b1\u00b3\u00be\u00c5\u00cd\u00d7\u00df\u00e6\u00f4"+
		"\u010d\u0117\u011f\u0129\u012d\u0133\u013d\u014c\u0154\u0163\u016d\u017a"+
		"\u0187\u018e\u019f\u01a4\u01b2\u01be\u01c8\u01d3\u01e9\u01f6\u0202\u020c"+
		"\u0219\u021e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}