// Generated from C:/Users/DELL/IdeaProjects/Angular/src/main/java/org/Angular/AngularParser.g4 by ANTLR 4.13.2
package org.Angular;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AngularParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQUAL=1, PLUS=2, MINUS=3, STAR=4, DIVISION=5, PERCENT=6, COMMA=7, SEMI=8, 
		COLON=9, LEFTPAREN=10, RIGHTPAREN=11, LEFTBRACKET=12, RIGHTBRACKET=13, 
		LEFTCURLY=14, RIGHTCURLY=15, LESSTHAN=16, GREATERTHAN=17, LESSEQUAL=18, 
		GREATEREQUAL=19, ARROW=20, EQ=21, NEQ=22, AND=23, OR=24, PLUSPLUS=25, 
		MINUSMINUS=26, SQ=27, DQ=28, DOT=29, AT=30, COMPONENT=31, TEMPLATE=32, 
		CLASS=33, INPUT=34, OUTPUT=35, PROPERTY=36, IMPORT=37, EXPORT=38, DEFAULT=39, 
		FROM=40, CONSTRUCTOR=41, EXTENDS=42, IMPLEMENTS=43, FUNCTION=44, CONSOLE=45, 
		LOG=46, VAR=47, LET=48, CONST=49, IF=50, ELSE=51, FOR=52, WHILE=53, RETURN=54, 
		NULL=55, ANY=56, SWITCH=57, CASE=58, DO=59, BREAK=60, CONTINUE=61, TRY=62, 
		CATCH=63, FINALLY=64, THROW=65, ASYNC=66, AWAIT=67, TYPE=68, ENUM=69, 
		INTERFACE=70, PUBLIC=71, PRIVATE=72, PROTECTED=73, TEMPLATE_LITERAL=74, 
		ID=75, INT=76, DOUBLE=77, BOOLEAN=78, STRING=79, WS=80, COMMENT=81, BLOCK_COMMENT=82;
	public static final int
		RULE_program = 0, RULE_importStatement = 1, RULE_exportStatement = 2, 
		RULE_variableDeclaration = 3, RULE_classDeclaration = 4, RULE_functionDeclaration = 5, 
		RULE_componentDeclaration = 6, RULE_value = 7, RULE_array = 8, RULE_object = 9, 
		RULE_classBody = 10, RULE_constructorDeclaration = 11, RULE_decorator = 12, 
		RULE_decoratorArguments = 13, RULE_parameters = 14, RULE_functionBody = 15, 
		RULE_returnStatement = 16, RULE_statement = 17, RULE_componentBody = 18, 
		RULE_ifStatement = 19, RULE_condition = 20, RULE_forStatement = 21, RULE_whileStatement = 22, 
		RULE_expression = 23, RULE_callFunction = 24, RULE_jsxElement = 25, RULE_jsxAttribute = 26, 
		RULE_jsxClass = 27, RULE_content = 28, RULE_shortIf = 29, RULE_type = 30, 
		RULE_printStatement = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "importStatement", "exportStatement", "variableDeclaration", 
			"classDeclaration", "functionDeclaration", "componentDeclaration", "value", 
			"array", "object", "classBody", "constructorDeclaration", "decorator", 
			"decoratorArguments", "parameters", "functionBody", "returnStatement", 
			"statement", "componentBody", "ifStatement", "condition", "forStatement", 
			"whileStatement", "expression", "callFunction", "jsxElement", "jsxAttribute", 
			"jsxClass", "content", "shortIf", "type", "printStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'+'", "'-'", "'*'", "'/'", "'%'", "','", "';'", "':'", 
			"'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", "'>'", "'<='", "'>='", 
			"'=>'", "'=='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'''", "'\"'", 
			"'.'", "'@'", "'component'", "'template'", "'class'", "'input'", "'output'", 
			"'property'", "'import'", "'export'", "'default'", "'from'", "'constructor'", 
			"'extends'", "'implements'", "'function'", "'console'", "'log'", "'var'", 
			"'let'", "'const'", "'if'", "'else'", "'for'", "'while'", "'return'", 
			"'null'", "'any'", "'switch'", "'case'", "'do'", "'break'", "'continue'", 
			"'try'", "'catch'", "'finally'", "'throw'", "'async'", "'await'", "'type'", 
			"'enum'", "'interface'", "'public'", "'private'", "'protected'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EQUAL", "PLUS", "MINUS", "STAR", "DIVISION", "PERCENT", "COMMA", 
			"SEMI", "COLON", "LEFTPAREN", "RIGHTPAREN", "LEFTBRACKET", "RIGHTBRACKET", 
			"LEFTCURLY", "RIGHTCURLY", "LESSTHAN", "GREATERTHAN", "LESSEQUAL", "GREATEREQUAL", 
			"ARROW", "EQ", "NEQ", "AND", "OR", "PLUSPLUS", "MINUSMINUS", "SQ", "DQ", 
			"DOT", "AT", "COMPONENT", "TEMPLATE", "CLASS", "INPUT", "OUTPUT", "PROPERTY", 
			"IMPORT", "EXPORT", "DEFAULT", "FROM", "CONSTRUCTOR", "EXTENDS", "IMPLEMENTS", 
			"FUNCTION", "CONSOLE", "LOG", "VAR", "LET", "CONST", "IF", "ELSE", "FOR", 
			"WHILE", "RETURN", "NULL", "ANY", "SWITCH", "CASE", "DO", "BREAK", "CONTINUE", 
			"TRY", "CATCH", "FINALLY", "THROW", "ASYNC", "AWAIT", "TYPE", "ENUM", 
			"INTERFACE", "PUBLIC", "PRIVATE", "PROTECTED", "TEMPLATE_LITERAL", "ID", 
			"INT", "DOUBLE", "BOOLEAN", "STRING", "WS", "COMMENT", "BLOCK_COMMENT"
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
	public String getGrammarFileName() { return "AngularParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngularParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public List<ComponentDeclarationContext> componentDeclaration() {
			return getRuleContexts(ComponentDeclarationContext.class);
		}
		public ComponentDeclarationContext componentDeclaration(int i) {
			return getRuleContext(ComponentDeclarationContext.class,i);
		}
		public ExportStatementContext exportStatement() {
			return getRuleContext(ExportStatementContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(64);
				importStatement();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1002764268208128L) != 0)) {
				{
				setState(74);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR:
				case LET:
				case CONST:
					{
					setState(70);
					variableDeclaration();
					}
					break;
				case CLASS:
					{
					setState(71);
					classDeclaration();
					}
					break;
				case FUNCTION:
					{
					setState(72);
					functionDeclaration();
					}
					break;
				case AT:
					{
					setState(73);
					componentDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(79);
				exportStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(AngularParser.IMPORT, 0); }
		public TerminalNode FROM() { return getToken(AngularParser.FROM, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public List<TerminalNode> ID() { return getTokens(AngularParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngularParser.ID, i);
		}
		public TerminalNode LEFTCURLY() { return getToken(AngularParser.LEFTCURLY, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(AngularParser.RIGHTCURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(IMPORT);
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(83);
				match(ID);
				}
				break;
			case LEFTCURLY:
				{
				setState(84);
				match(LEFTCURLY);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(85);
					match(ID);
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(86);
						match(COMMA);
						setState(87);
						match(ID);
						}
						}
						setState(92);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(95);
				match(RIGHTCURLY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(98);
			match(FROM);
			setState(99);
			match(STRING);
			setState(100);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExportStatementContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public TerminalNode CLASS() { return getToken(AngularParser.CLASS, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode LEFTCURLY() { return getToken(AngularParser.LEFTCURLY, 0); }
		public TerminalNode DEFAULT() { return getToken(AngularParser.DEFAULT, 0); }
		public ExportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportStatementContext exportStatement() throws RecognitionException {
		ExportStatementContext _localctx = new ExportStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exportStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(EXPORT);
			{
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(103);
				match(DEFAULT);
				}
			}

			{
			setState(106);
			match(CLASS);
			setState(107);
			match(ID);
			setState(108);
			match(LEFTCURLY);
			}
			}
			setState(110);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public TerminalNode VAR() { return getToken(AngularParser.VAR, 0); }
		public TerminalNode LET() { return getToken(AngularParser.LET, 0); }
		public TerminalNode CONST() { return getToken(AngularParser.CONST, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 985162418487296L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(113);
			match(ID);
			setState(114);
			match(EQUAL);
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(115);
				value();
				}
				break;
			case 2:
				{
				setState(116);
				array();
				}
				break;
			case 3:
				{
				setState(117);
				object();
				}
				break;
			case 4:
				{
				setState(118);
				functionDeclaration();
				}
				break;
			}
			setState(121);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(AngularParser.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(AngularParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngularParser.ID, i);
		}
		public TerminalNode LEFTCURLY() { return getToken(AngularParser.LEFTCURLY, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode RIGHTCURLY() { return getToken(AngularParser.RIGHTCURLY, 0); }
		public TerminalNode EXTENDS() { return getToken(AngularParser.EXTENDS, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(AngularParser.IMPLEMENTS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(CLASS);
			setState(124);
			match(ID);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(125);
				match(EXTENDS);
				setState(126);
				match(ID);
				}
			}

			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(129);
				match(IMPLEMENTS);
				setState(130);
				match(ID);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(131);
					match(COMMA);
					setState(132);
					match(ID);
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(140);
			match(LEFTCURLY);
			setState(141);
			classBody();
			setState(142);
			match(RIGHTCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(AngularParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode LEFTPAREN() { return getToken(AngularParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(AngularParser.RIGHTPAREN, 0); }
		public TerminalNode LEFTCURLY() { return getToken(AngularParser.LEFTCURLY, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode RIGHTCURLY() { return getToken(AngularParser.RIGHTCURLY, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(FUNCTION);
			setState(145);
			match(ID);
			setState(146);
			match(LEFTPAREN);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTCURLY || _la==ID) {
				{
				setState(147);
				parameters();
				}
			}

			setState(150);
			match(RIGHTPAREN);
			setState(151);
			match(LEFTCURLY);
			setState(152);
			functionBody();
			setState(153);
			match(RIGHTCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDeclarationContext extends ParserRuleContext {
		public DecoratorContext decorator() {
			return getRuleContext(DecoratorContext.class,0);
		}
		public TerminalNode LEFTCURLY() { return getToken(AngularParser.LEFTCURLY, 0); }
		public ComponentBodyContext componentBody() {
			return getRuleContext(ComponentBodyContext.class,0);
		}
		public TerminalNode RIGHTCURLY() { return getToken(AngularParser.RIGHTCURLY, 0); }
		public ComponentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDeclarationContext componentDeclaration() throws RecognitionException {
		ComponentDeclarationContext _localctx = new ComponentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_componentDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			decorator();
			setState(156);
			match(LEFTCURLY);
			setState(157);
			componentBody();
			setState(158);
			match(RIGHTCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode INT() { return getToken(AngularParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(AngularParser.DOUBLE, 0); }
		public TerminalNode BOOLEAN() { return getToken(AngularParser.BOOLEAN, 0); }
		public TerminalNode NULL() { return getToken(AngularParser.NULL, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public JsxElementContext jsxElement() {
			return getRuleContext(JsxElementContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(STRING);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(INT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(DOUBLE);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				match(BOOLEAN);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(164);
				match(NULL);
				}
				break;
			case LEFTBRACKET:
				enterOuterAlt(_localctx, 6);
				{
				setState(165);
				array();
				}
				break;
			case LEFTCURLY:
				enterOuterAlt(_localctx, 7);
				{
				setState(166);
				object();
				}
				break;
			case LESSTHAN:
				enterOuterAlt(_localctx, 8);
				{
				setState(167);
				jsxElement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode LEFTBRACKET() { return getToken(AngularParser.LEFTBRACKET, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(AngularParser.RIGHTBRACKET, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(LEFTBRACKET);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36028797019049984L) != 0) || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 15L) != 0)) {
				{
				setState(171);
				value();
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(172);
					match(COMMA);
					setState(173);
					value();
					}
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(181);
			match(RIGHTBRACKET);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode LEFTCURLY() { return getToken(AngularParser.LEFTCURLY, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(AngularParser.RIGHTCURLY, 0); }
		public List<TerminalNode> ID() { return getTokens(AngularParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngularParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(AngularParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(AngularParser.COLON, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(LEFTCURLY);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(184);
				match(ID);
				setState(185);
				match(COLON);
				setState(186);
				value();
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(187);
					match(COMMA);
					setState(188);
					match(ID);
					setState(189);
					match(COLON);
					setState(190);
					value();
					}
					}
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(198);
			match(RIGHTCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public DecoratorContext decorator() {
			return getRuleContext(DecoratorContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classBody);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				decorator();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				functionDeclaration();
				}
				break;
			case VAR:
			case LET:
			case CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				variableDeclaration();
				}
				break;
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				constructorDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(AngularParser.CONSTRUCTOR, 0); }
		public TerminalNode LEFTPAREN() { return getToken(AngularParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(AngularParser.RIGHTPAREN, 0); }
		public TerminalNode LEFTCURLY() { return getToken(AngularParser.LEFTCURLY, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode RIGHTCURLY() { return getToken(AngularParser.RIGHTCURLY, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(CONSTRUCTOR);
			setState(207);
			match(LEFTPAREN);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTCURLY || _la==ID) {
				{
				setState(208);
				parameters();
				}
			}

			setState(211);
			match(RIGHTPAREN);
			setState(212);
			match(LEFTCURLY);
			setState(213);
			functionBody();
			setState(214);
			match(RIGHTCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(AngularParser.AT, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode LEFTPAREN() { return getToken(AngularParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(AngularParser.RIGHTPAREN, 0); }
		public DecoratorArgumentsContext decoratorArguments() {
			return getRuleContext(DecoratorArgumentsContext.class,0);
		}
		public DecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorContext decorator() throws RecognitionException {
		DecoratorContext _localctx = new DecoratorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_decorator);
		int _la;
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(AT);
				setState(217);
				match(ID);
				setState(218);
				match(LEFTPAREN);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFTCURLY || _la==ID) {
					{
					setState(219);
					decoratorArguments();
					}
				}

				setState(222);
				match(RIGHTPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(AT);
				setState(224);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorArgumentsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AngularParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngularParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(AngularParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(AngularParser.COLON, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> LEFTCURLY() { return getTokens(AngularParser.LEFTCURLY); }
		public TerminalNode LEFTCURLY(int i) {
			return getToken(AngularParser.LEFTCURLY, i);
		}
		public List<TerminalNode> RIGHTCURLY() { return getTokens(AngularParser.RIGHTCURLY); }
		public TerminalNode RIGHTCURLY(int i) {
			return getToken(AngularParser.RIGHTCURLY, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public DecoratorArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decoratorArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDecoratorArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDecoratorArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDecoratorArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorArgumentsContext decoratorArguments() throws RecognitionException {
		DecoratorArgumentsContext _localctx = new DecoratorArgumentsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_decoratorArguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(227);
				match(ID);
				setState(228);
				match(COLON);
				setState(229);
				value();
				}
				break;
			case LEFTCURLY:
				{
				setState(230);
				match(LEFTCURLY);
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(231);
						matchWildcard();
						}
						} 
					}
					setState(236);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				setState(237);
				match(RIGHTCURLY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(240);
				match(COMMA);
				setState(252);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(241);
					match(ID);
					setState(242);
					match(COLON);
					setState(243);
					value();
					}
					break;
				case LEFTCURLY:
					{
					setState(244);
					match(LEFTCURLY);
					setState(248);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(245);
							matchWildcard();
							}
							} 
						}
						setState(250);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
					}
					setState(251);
					match(RIGHTCURLY);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(258);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AngularParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngularParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(AngularParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(AngularParser.COLON, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public TerminalNode LEFTCURLY() { return getToken(AngularParser.LEFTCURLY, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(AngularParser.RIGHTCURLY, 0); }
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parameters);
		int _la;
		try {
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(ID);
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(260);
					match(COLON);
					setState(261);
					type();
					}
				}

				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(264);
					match(COMMA);
					setState(265);
					match(ID);
					setState(268);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COLON) {
						{
						setState(266);
						match(COLON);
						setState(267);
						type();
						}
					}

					}
					}
					setState(274);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case LEFTCURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				match(LEFTCURLY);
				setState(276);
				match(ID);
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(277);
					match(COMMA);
					setState(278);
					match(ID);
					}
					}
					setState(283);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(284);
				match(RIGHTCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionBodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 576460991210979329L) != 0)) {
				{
				{
				setState(287);
				statement();
				}
				}
				setState(292);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(293);
				returnStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(AngularParser.RETURN, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public JsxElementContext jsxElement() {
			return getRuleContext(JsxElementContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(RETURN);
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(297);
				value();
				}
				break;
			case 2:
				{
				setState(298);
				jsxElement();
				}
				break;
			}
			setState(301);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public JsxElementContext jsxElement() {
			return getRuleContext(JsxElementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statement);
		try {
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case LET:
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				variableDeclaration();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				ifStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				forStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(306);
				whileStatement();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(307);
				callFunction();
				}
				break;
			case CONSOLE:
				enterOuterAlt(_localctx, 6);
				{
				setState(308);
				printStatement();
				}
				break;
			case LESSTHAN:
				enterOuterAlt(_localctx, 7);
				{
				setState(309);
				jsxElement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentBodyContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public ComponentBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentBodyContext componentBody() throws RecognitionException {
		ComponentBodyContext _localctx = new ComponentBodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_componentBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 985162418487296L) != 0)) {
				{
				{
				setState(312);
				variableDeclaration();
				}
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(318);
				functionDeclaration();
				}
				}
				setState(323);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(AngularParser.IF, 0); }
		public TerminalNode LEFTPAREN() { return getToken(AngularParser.LEFTPAREN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(AngularParser.RIGHTPAREN, 0); }
		public List<TerminalNode> LEFTCURLY() { return getTokens(AngularParser.LEFTCURLY); }
		public TerminalNode LEFTCURLY(int i) {
			return getToken(AngularParser.LEFTCURLY, i);
		}
		public List<TerminalNode> RIGHTCURLY() { return getTokens(AngularParser.RIGHTCURLY); }
		public TerminalNode RIGHTCURLY(int i) {
			return getToken(AngularParser.RIGHTCURLY, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(AngularParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(IF);
			setState(325);
			match(LEFTPAREN);
			setState(326);
			condition();
			setState(327);
			match(RIGHTPAREN);
			setState(328);
			match(LEFTCURLY);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 576460991210979329L) != 0)) {
				{
				{
				setState(329);
				statement();
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(335);
			match(RIGHTCURLY);
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(336);
				match(ELSE);
				setState(337);
				match(LEFTCURLY);
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 576460991210979329L) != 0)) {
					{
					{
					setState(338);
					statement();
					}
					}
					setState(343);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(344);
				match(RIGHTCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(AngularParser.AND, 0); }
		public TerminalNode OR() { return getToken(AngularParser.OR, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_condition);
		int _la;
		try {
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				expression();
				setState(348);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(349);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(AngularParser.FOR, 0); }
		public TerminalNode LEFTPAREN() { return getToken(AngularParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(AngularParser.RIGHTPAREN, 0); }
		public TerminalNode LEFTCURLY() { return getToken(AngularParser.LEFTCURLY, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(AngularParser.RIGHTCURLY, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(FOR);
			setState(355);
			match(LEFTPAREN);
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(356);
				variableDeclaration();
				}
				break;
			}
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(359);
				condition();
				}
				break;
			}
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(362);
				match(SEMI);
				}
			}

			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 576460991210979329L) != 0)) {
				{
				setState(365);
				statement();
				}
			}

			setState(368);
			match(RIGHTPAREN);
			setState(369);
			match(LEFTCURLY);
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 576460991210979329L) != 0)) {
				{
				{
				setState(370);
				statement();
				}
				}
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(376);
			match(RIGHTCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(AngularParser.WHILE, 0); }
		public TerminalNode LEFTPAREN() { return getToken(AngularParser.LEFTPAREN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(AngularParser.RIGHTPAREN, 0); }
		public TerminalNode LEFTCURLY() { return getToken(AngularParser.LEFTCURLY, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(AngularParser.RIGHTCURLY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(WHILE);
			setState(379);
			match(LEFTPAREN);
			setState(380);
			condition();
			setState(381);
			match(RIGHTPAREN);
			setState(382);
			match(LEFTCURLY);
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 576460991210979329L) != 0)) {
				{
				{
				setState(383);
				statement();
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(389);
			match(RIGHTCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(AngularParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngularParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expression);
		try {
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(393);
				match(ID);
				setState(394);
				match(DOT);
				setState(395);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(396);
				callFunction();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CallFunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode LEFTPAREN() { return getToken(AngularParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(AngularParser.RIGHTPAREN, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public CallFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCallFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCallFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCallFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallFunctionContext callFunction() throws RecognitionException {
		CallFunctionContext _localctx = new CallFunctionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_callFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(ID);
			setState(400);
			match(LEFTPAREN);
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36028797019049984L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 31L) != 0)) {
				{
				setState(401);
				expression();
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(402);
					match(COMMA);
					setState(403);
					expression();
					}
					}
					setState(408);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(411);
			match(RIGHTPAREN);
			setState(412);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsxElementContext extends ParserRuleContext {
		public List<TerminalNode> LESSTHAN() { return getTokens(AngularParser.LESSTHAN); }
		public TerminalNode LESSTHAN(int i) {
			return getToken(AngularParser.LESSTHAN, i);
		}
		public List<TerminalNode> ID() { return getTokens(AngularParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngularParser.ID, i);
		}
		public List<TerminalNode> GREATERTHAN() { return getTokens(AngularParser.GREATERTHAN); }
		public TerminalNode GREATERTHAN(int i) {
			return getToken(AngularParser.GREATERTHAN, i);
		}
		public TerminalNode DIVISION() { return getToken(AngularParser.DIVISION, 0); }
		public List<JsxAttributeContext> jsxAttribute() {
			return getRuleContexts(JsxAttributeContext.class);
		}
		public JsxAttributeContext jsxAttribute(int i) {
			return getRuleContext(JsxAttributeContext.class,i);
		}
		public List<JsxClassContext> jsxClass() {
			return getRuleContexts(JsxClassContext.class);
		}
		public JsxClassContext jsxClass(int i) {
			return getRuleContext(JsxClassContext.class,i);
		}
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public JsxElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterJsxElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitJsxElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitJsxElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxElementContext jsxElement() throws RecognitionException {
		JsxElementContext _localctx = new JsxElementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_jsxElement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(LESSTHAN);
			setState(415);
			match(ID);
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS || _la==ID) {
				{
				setState(418);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(416);
					jsxAttribute();
					}
					break;
				case CLASS:
					{
					setState(417);
					jsxClass();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(423);
			match(GREATERTHAN);
			setState(427);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(424);
					content();
					}
					} 
				}
				setState(429);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(430);
			match(LESSTHAN);
			setState(431);
			match(DIVISION);
			setState(432);
			match(ID);
			setState(433);
			match(GREATERTHAN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsxAttributeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JsxAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterJsxAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitJsxAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitJsxAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxAttributeContext jsxAttribute() throws RecognitionException {
		JsxAttributeContext _localctx = new JsxAttributeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_jsxAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(ID);
			setState(436);
			match(EQUAL);
			setState(437);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsxClassContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(AngularParser.CLASS, 0); }
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public JsxClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterJsxClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitJsxClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitJsxClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxClassContext jsxClass() throws RecognitionException {
		JsxClassContext _localctx = new JsxClassContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_jsxClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(CLASS);
			setState(440);
			match(EQUAL);
			setState(441);
			match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ContentContext extends ParserRuleContext {
		public JsxElementContext jsxElement() {
			return getRuleContext(JsxElementContext.class,0);
		}
		public ShortIfContext shortIf() {
			return getRuleContext(ShortIfContext.class,0);
		}
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_content);
		try {
			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				jsxElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				shortIf();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(445);
				callFunction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(446);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShortIfContext extends ParserRuleContext {
		public TerminalNode LEFTCURLY() { return getToken(AngularParser.LEFTCURLY, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode AND() { return getToken(AngularParser.AND, 0); }
		public JsxElementContext jsxElement() {
			return getRuleContext(JsxElementContext.class,0);
		}
		public TerminalNode RIGHTCURLY() { return getToken(AngularParser.RIGHTCURLY, 0); }
		public ShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitShortIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitShortIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortIfContext shortIf() throws RecognitionException {
		ShortIfContext _localctx = new ShortIfContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_shortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(LEFTCURLY);
			setState(450);
			condition();
			setState(451);
			match(AND);
			setState(452);
			jsxElement();
			setState(453);
			match(RIGHTCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode INT() { return getToken(AngularParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(AngularParser.DOUBLE, 0); }
		public TerminalNode BOOLEAN() { return getToken(AngularParser.BOOLEAN, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			_la = _input.LA(1);
			if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 31L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode CONSOLE() { return getToken(AngularParser.CONSOLE, 0); }
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public TerminalNode LOG() { return getToken(AngularParser.LOG, 0); }
		public TerminalNode LEFTPAREN() { return getToken(AngularParser.LEFTPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(AngularParser.RIGHTPAREN, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(CONSOLE);
			setState(458);
			match(DOT);
			setState(459);
			match(LOG);
			setState(460);
			match(LEFTPAREN);
			setState(461);
			expression();
			setState(462);
			match(RIGHTPAREN);
			setState(463);
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

	public static final String _serializedATN =
		"\u0004\u0001R\u01d2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0001\u0000\u0005\u0000B\b\u0000\n\u0000\f\u0000"+
		"E\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"K\b\u0000\n\u0000\f\u0000N\t\u0000\u0001\u0000\u0003\u0000Q\b\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001Y\b\u0001\n\u0001\f\u0001\\\t\u0001\u0003\u0001^\b\u0001\u0001\u0001"+
		"\u0003\u0001a\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0003\u0002i\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"x\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u0080\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004\u0086\b\u0004\n\u0004\f\u0004\u0089\t\u0004\u0003"+
		"\u0004\u008b\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0095\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00a9\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00af\b\b"+
		"\n\b\f\b\u00b2\t\b\u0003\b\u00b4\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00c0\b\t\n\t\f\t\u00c3"+
		"\t\t\u0003\t\u00c5\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0003\n\u00cd\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00d2"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u00dd\b\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00e2\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00e9\b\r"+
		"\n\r\f\r\u00ec\t\r\u0001\r\u0003\r\u00ef\b\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0005\r\u00f7\b\r\n\r\f\r\u00fa\t\r\u0001\r\u0003\r"+
		"\u00fd\b\r\u0005\r\u00ff\b\r\n\r\f\r\u0102\t\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u0107\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u010d\b\u000e\u0005\u000e\u010f\b\u000e\n\u000e"+
		"\f\u000e\u0112\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u0118\b\u000e\n\u000e\f\u000e\u011b\t\u000e\u0001\u000e\u0003"+
		"\u000e\u011e\b\u000e\u0001\u000f\u0005\u000f\u0121\b\u000f\n\u000f\f\u000f"+
		"\u0124\t\u000f\u0001\u000f\u0003\u000f\u0127\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u012c\b\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u0137\b\u0011\u0001\u0012\u0005\u0012\u013a\b\u0012"+
		"\n\u0012\f\u0012\u013d\t\u0012\u0001\u0012\u0005\u0012\u0140\b\u0012\n"+
		"\u0012\f\u0012\u0143\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u014b\b\u0013\n\u0013\f\u0013"+
		"\u014e\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u0154\b\u0013\n\u0013\f\u0013\u0157\t\u0013\u0001\u0013\u0003\u0013\u015a"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u0161\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0166"+
		"\b\u0015\u0001\u0015\u0003\u0015\u0169\b\u0015\u0001\u0015\u0003\u0015"+
		"\u016c\b\u0015\u0001\u0015\u0003\u0015\u016f\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u0174\b\u0015\n\u0015\f\u0015\u0177\t\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0005\u0016\u0181\b\u0016\n\u0016\f\u0016\u0184"+
		"\t\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u018e\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0195\b\u0018\n"+
		"\u0018\f\u0018\u0198\t\u0018\u0003\u0018\u019a\b\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005"+
		"\u0019\u01a3\b\u0019\n\u0019\f\u0019\u01a6\t\u0019\u0001\u0019\u0001\u0019"+
		"\u0005\u0019\u01aa\b\u0019\n\u0019\f\u0019\u01ad\t\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01c0\b\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0002\u00ea\u00f8"+
		"\u0000 \u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>\u0000\u0003\u0001\u0000/1\u0001\u0000"+
		"\u0017\u0018\u0001\u0000KO\u01fe\u0000C\u0001\u0000\u0000\u0000\u0002"+
		"R\u0001\u0000\u0000\u0000\u0004f\u0001\u0000\u0000\u0000\u0006p\u0001"+
		"\u0000\u0000\u0000\b{\u0001\u0000\u0000\u0000\n\u0090\u0001\u0000\u0000"+
		"\u0000\f\u009b\u0001\u0000\u0000\u0000\u000e\u00a8\u0001\u0000\u0000\u0000"+
		"\u0010\u00aa\u0001\u0000\u0000\u0000\u0012\u00b7\u0001\u0000\u0000\u0000"+
		"\u0014\u00cc\u0001\u0000\u0000\u0000\u0016\u00ce\u0001\u0000\u0000\u0000"+
		"\u0018\u00e1\u0001\u0000\u0000\u0000\u001a\u00ee\u0001\u0000\u0000\u0000"+
		"\u001c\u011d\u0001\u0000\u0000\u0000\u001e\u0122\u0001\u0000\u0000\u0000"+
		" \u0128\u0001\u0000\u0000\u0000\"\u0136\u0001\u0000\u0000\u0000$\u013b"+
		"\u0001\u0000\u0000\u0000&\u0144\u0001\u0000\u0000\u0000(\u0160\u0001\u0000"+
		"\u0000\u0000*\u0162\u0001\u0000\u0000\u0000,\u017a\u0001\u0000\u0000\u0000"+
		".\u018d\u0001\u0000\u0000\u00000\u018f\u0001\u0000\u0000\u00002\u019e"+
		"\u0001\u0000\u0000\u00004\u01b3\u0001\u0000\u0000\u00006\u01b7\u0001\u0000"+
		"\u0000\u00008\u01bf\u0001\u0000\u0000\u0000:\u01c1\u0001\u0000\u0000\u0000"+
		"<\u01c7\u0001\u0000\u0000\u0000>\u01c9\u0001\u0000\u0000\u0000@B\u0003"+
		"\u0002\u0001\u0000A@\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000"+
		"CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DL\u0001\u0000\u0000"+
		"\u0000EC\u0001\u0000\u0000\u0000FK\u0003\u0006\u0003\u0000GK\u0003\b\u0004"+
		"\u0000HK\u0003\n\u0005\u0000IK\u0003\f\u0006\u0000JF\u0001\u0000\u0000"+
		"\u0000JG\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JI\u0001\u0000"+
		"\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001"+
		"\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000"+
		"OQ\u0003\u0004\u0002\u0000PO\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000"+
		"\u0000Q\u0001\u0001\u0000\u0000\u0000R`\u0005%\u0000\u0000Sa\u0005K\u0000"+
		"\u0000T]\u0005\u000e\u0000\u0000UZ\u0005K\u0000\u0000VW\u0005\u0007\u0000"+
		"\u0000WY\u0005K\u0000\u0000XV\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000"+
		"\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[^\u0001\u0000"+
		"\u0000\u0000\\Z\u0001\u0000\u0000\u0000]U\u0001\u0000\u0000\u0000]^\u0001"+
		"\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_a\u0005\u000f\u0000\u0000"+
		"`S\u0001\u0000\u0000\u0000`T\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"+
		"\u0000bc\u0005(\u0000\u0000cd\u0005O\u0000\u0000de\u0005\b\u0000\u0000"+
		"e\u0003\u0001\u0000\u0000\u0000fh\u0005&\u0000\u0000gi\u0005\'\u0000\u0000"+
		"hg\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000"+
		"\u0000jk\u0005!\u0000\u0000kl\u0005K\u0000\u0000lm\u0005\u000e\u0000\u0000"+
		"mn\u0001\u0000\u0000\u0000no\u0005\b\u0000\u0000o\u0005\u0001\u0000\u0000"+
		"\u0000pq\u0007\u0000\u0000\u0000qr\u0005K\u0000\u0000rw\u0005\u0001\u0000"+
		"\u0000sx\u0003\u000e\u0007\u0000tx\u0003\u0010\b\u0000ux\u0003\u0012\t"+
		"\u0000vx\u0003\n\u0005\u0000ws\u0001\u0000\u0000\u0000wt\u0001\u0000\u0000"+
		"\u0000wu\u0001\u0000\u0000\u0000wv\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000yz\u0005\b\u0000\u0000z\u0007\u0001\u0000\u0000\u0000{|\u0005"+
		"!\u0000\u0000|\u007f\u0005K\u0000\u0000}~\u0005*\u0000\u0000~\u0080\u0005"+
		"K\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000"+
		"\u0000\u0080\u008a\u0001\u0000\u0000\u0000\u0081\u0082\u0005+\u0000\u0000"+
		"\u0082\u0087\u0005K\u0000\u0000\u0083\u0084\u0005\u0007\u0000\u0000\u0084"+
		"\u0086\u0005K\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u0089"+
		"\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087"+
		"\u0001\u0000\u0000\u0000\u008a\u0081\u0001\u0000\u0000\u0000\u008a\u008b"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0005\u000e\u0000\u0000\u008d\u008e\u0003\u0014\n\u0000\u008e\u008f\u0005"+
		"\u000f\u0000\u0000\u008f\t\u0001\u0000\u0000\u0000\u0090\u0091\u0005,"+
		"\u0000\u0000\u0091\u0092\u0005K\u0000\u0000\u0092\u0094\u0005\n\u0000"+
		"\u0000\u0093\u0095\u0003\u001c\u000e\u0000\u0094\u0093\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0005\u000b\u0000\u0000\u0097\u0098\u0005\u000e\u0000"+
		"\u0000\u0098\u0099\u0003\u001e\u000f\u0000\u0099\u009a\u0005\u000f\u0000"+
		"\u0000\u009a\u000b\u0001\u0000\u0000\u0000\u009b\u009c\u0003\u0018\f\u0000"+
		"\u009c\u009d\u0005\u000e\u0000\u0000\u009d\u009e\u0003$\u0012\u0000\u009e"+
		"\u009f\u0005\u000f\u0000\u0000\u009f\r\u0001\u0000\u0000\u0000\u00a0\u00a9"+
		"\u0005O\u0000\u0000\u00a1\u00a9\u0005L\u0000\u0000\u00a2\u00a9\u0005M"+
		"\u0000\u0000\u00a3\u00a9\u0005N\u0000\u0000\u00a4\u00a9\u00057\u0000\u0000"+
		"\u00a5\u00a9\u0003\u0010\b\u0000\u00a6\u00a9\u0003\u0012\t\u0000\u00a7"+
		"\u00a9\u00032\u0019\u0000\u00a8\u00a0\u0001\u0000\u0000\u0000\u00a8\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a2\u0001\u0000\u0000\u0000\u00a8\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a4\u0001\u0000\u0000\u0000\u00a8\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a7"+
		"\u0001\u0000\u0000\u0000\u00a9\u000f\u0001\u0000\u0000\u0000\u00aa\u00b3"+
		"\u0005\f\u0000\u0000\u00ab\u00b0\u0003\u000e\u0007\u0000\u00ac\u00ad\u0005"+
		"\u0007\u0000\u0000\u00ad\u00af\u0003\u000e\u0007\u0000\u00ae\u00ac\u0001"+
		"\u0000\u0000\u0000\u00af\u00b2\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b3\u00ab\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0005\r\u0000\u0000\u00b6\u0011\u0001\u0000"+
		"\u0000\u0000\u00b7\u00c4\u0005\u000e\u0000\u0000\u00b8\u00b9\u0005K\u0000"+
		"\u0000\u00b9\u00ba\u0005\t\u0000\u0000\u00ba\u00c1\u0003\u000e\u0007\u0000"+
		"\u00bb\u00bc\u0005\u0007\u0000\u0000\u00bc\u00bd\u0005K\u0000\u0000\u00bd"+
		"\u00be\u0005\t\u0000\u0000\u00be\u00c0\u0003\u000e\u0007\u0000\u00bf\u00bb"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00b8"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005\u000f\u0000\u0000\u00c7\u0013"+
		"\u0001\u0000\u0000\u0000\u00c8\u00cd\u0003\u0018\f\u0000\u00c9\u00cd\u0003"+
		"\n\u0005\u0000\u00ca\u00cd\u0003\u0006\u0003\u0000\u00cb\u00cd\u0003\u0016"+
		"\u000b\u0000\u00cc\u00c8\u0001\u0000\u0000\u0000\u00cc\u00c9\u0001\u0000"+
		"\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cd\u0015\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005)\u0000"+
		"\u0000\u00cf\u00d1\u0005\n\u0000\u0000\u00d0\u00d2\u0003\u001c\u000e\u0000"+
		"\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\u000b\u0000\u0000"+
		"\u00d4\u00d5\u0005\u000e\u0000\u0000\u00d5\u00d6\u0003\u001e\u000f\u0000"+
		"\u00d6\u00d7\u0005\u000f\u0000\u0000\u00d7\u0017\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d9\u0005\u001e\u0000\u0000\u00d9\u00da\u0005K\u0000\u0000\u00da"+
		"\u00dc\u0005\n\u0000\u0000\u00db\u00dd\u0003\u001a\r\u0000\u00dc\u00db"+
		"\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u0001\u0000\u0000\u0000\u00de\u00e2\u0005\u000b\u0000\u0000\u00df\u00e0"+
		"\u0005\u001e\u0000\u0000\u00e0\u00e2\u0005K\u0000\u0000\u00e1\u00d8\u0001"+
		"\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e2\u0019\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e4\u0005K\u0000\u0000\u00e4\u00e5\u0005\t"+
		"\u0000\u0000\u00e5\u00ef\u0003\u000e\u0007\u0000\u00e6\u00ea\u0005\u000e"+
		"\u0000\u0000\u00e7\u00e9\t\u0000\u0000\u0000\u00e8\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ec\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000"+
		"\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00eb\u00ed\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed\u00ef\u0005\u000f\u0000"+
		"\u0000\u00ee\u00e3\u0001\u0000\u0000\u0000\u00ee\u00e6\u0001\u0000\u0000"+
		"\u0000\u00ef\u0100\u0001\u0000\u0000\u0000\u00f0\u00fc\u0005\u0007\u0000"+
		"\u0000\u00f1\u00f2\u0005K\u0000\u0000\u00f2\u00f3\u0005\t\u0000\u0000"+
		"\u00f3\u00fd\u0003\u000e\u0007\u0000\u00f4\u00f8\u0005\u000e\u0000\u0000"+
		"\u00f5\u00f7\t\u0000\u0000\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f7"+
		"\u00fa\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f9\u00fb\u0001\u0000\u0000\u0000\u00fa"+
		"\u00f8\u0001\u0000\u0000\u0000\u00fb\u00fd\u0005\u000f\u0000\u0000\u00fc"+
		"\u00f1\u0001\u0000\u0000\u0000\u00fc\u00f4\u0001\u0000\u0000\u0000\u00fd"+
		"\u00ff\u0001\u0000\u0000\u0000\u00fe\u00f0\u0001\u0000\u0000\u0000\u00ff"+
		"\u0102\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0100"+
		"\u0101\u0001\u0000\u0000\u0000\u0101\u001b\u0001\u0000\u0000\u0000\u0102"+
		"\u0100\u0001\u0000\u0000\u0000\u0103\u0106\u0005K\u0000\u0000\u0104\u0105"+
		"\u0005\t\u0000\u0000\u0105\u0107\u0003<\u001e\u0000\u0106\u0104\u0001"+
		"\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0110\u0001"+
		"\u0000\u0000\u0000\u0108\u0109\u0005\u0007\u0000\u0000\u0109\u010c\u0005"+
		"K\u0000\u0000\u010a\u010b\u0005\t\u0000\u0000\u010b\u010d\u0003<\u001e"+
		"\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000"+
		"\u0000\u010d\u010f\u0001\u0000\u0000\u0000\u010e\u0108\u0001\u0000\u0000"+
		"\u0000\u010f\u0112\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000"+
		"\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u011e\u0001\u0000\u0000"+
		"\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0113\u0114\u0005\u000e\u0000"+
		"\u0000\u0114\u0119\u0005K\u0000\u0000\u0115\u0116\u0005\u0007\u0000\u0000"+
		"\u0116\u0118\u0005K\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0118"+
		"\u011b\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119"+
		"\u011a\u0001\u0000\u0000\u0000\u011a\u011c\u0001\u0000\u0000\u0000\u011b"+
		"\u0119\u0001\u0000\u0000\u0000\u011c\u011e\u0005\u000f\u0000\u0000\u011d"+
		"\u0103\u0001\u0000\u0000\u0000\u011d\u0113\u0001\u0000\u0000\u0000\u011e"+
		"\u001d\u0001\u0000\u0000\u0000\u011f\u0121\u0003\"\u0011\u0000\u0120\u011f"+
		"\u0001\u0000\u0000\u0000\u0121\u0124\u0001\u0000\u0000\u0000\u0122\u0120"+
		"\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0126"+
		"\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0125\u0127"+
		"\u0003 \u0010\u0000\u0126\u0125\u0001\u0000\u0000\u0000\u0126\u0127\u0001"+
		"\u0000\u0000\u0000\u0127\u001f\u0001\u0000\u0000\u0000\u0128\u012b\u0005"+
		"6\u0000\u0000\u0129\u012c\u0003\u000e\u0007\u0000\u012a\u012c\u00032\u0019"+
		"\u0000\u012b\u0129\u0001\u0000\u0000\u0000\u012b\u012a\u0001\u0000\u0000"+
		"\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000"+
		"\u0000\u012d\u012e\u0005\b\u0000\u0000\u012e!\u0001\u0000\u0000\u0000"+
		"\u012f\u0137\u0003\u0006\u0003\u0000\u0130\u0137\u0003&\u0013\u0000\u0131"+
		"\u0137\u0003*\u0015\u0000\u0132\u0137\u0003,\u0016\u0000\u0133\u0137\u0003"+
		"0\u0018\u0000\u0134\u0137\u0003>\u001f\u0000\u0135\u0137\u00032\u0019"+
		"\u0000\u0136\u012f\u0001\u0000\u0000\u0000\u0136\u0130\u0001\u0000\u0000"+
		"\u0000\u0136\u0131\u0001\u0000\u0000\u0000\u0136\u0132\u0001\u0000\u0000"+
		"\u0000\u0136\u0133\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000"+
		"\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0137#\u0001\u0000\u0000\u0000"+
		"\u0138\u013a\u0003\u0006\u0003\u0000\u0139\u0138\u0001\u0000\u0000\u0000"+
		"\u013a\u013d\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000"+
		"\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u0141\u0001\u0000\u0000\u0000"+
		"\u013d\u013b\u0001\u0000\u0000\u0000\u013e\u0140\u0003\n\u0005\u0000\u013f"+
		"\u013e\u0001\u0000\u0000\u0000\u0140\u0143\u0001\u0000\u0000\u0000\u0141"+
		"\u013f\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142"+
		"%\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0144\u0145"+
		"\u00052\u0000\u0000\u0145\u0146\u0005\n\u0000\u0000\u0146\u0147\u0003"+
		"(\u0014\u0000\u0147\u0148\u0005\u000b\u0000\u0000\u0148\u014c\u0005\u000e"+
		"\u0000\u0000\u0149\u014b\u0003\"\u0011\u0000\u014a\u0149\u0001\u0000\u0000"+
		"\u0000\u014b\u014e\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000"+
		"\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014f\u0001\u0000\u0000"+
		"\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014f\u0159\u0005\u000f\u0000"+
		"\u0000\u0150\u0151\u00053\u0000\u0000\u0151\u0155\u0005\u000e\u0000\u0000"+
		"\u0152\u0154\u0003\"\u0011\u0000\u0153\u0152\u0001\u0000\u0000\u0000\u0154"+
		"\u0157\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0155"+
		"\u0156\u0001\u0000\u0000\u0000\u0156\u0158\u0001\u0000\u0000\u0000\u0157"+
		"\u0155\u0001\u0000\u0000\u0000\u0158\u015a\u0005\u000f\u0000\u0000\u0159"+
		"\u0150\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a"+
		"\'\u0001\u0000\u0000\u0000\u015b\u015c\u0003.\u0017\u0000\u015c\u015d"+
		"\u0007\u0001\u0000\u0000\u015d\u015e\u0003.\u0017\u0000\u015e\u0161\u0001"+
		"\u0000\u0000\u0000\u015f\u0161\u0003.\u0017\u0000\u0160\u015b\u0001\u0000"+
		"\u0000\u0000\u0160\u015f\u0001\u0000\u0000\u0000\u0161)\u0001\u0000\u0000"+
		"\u0000\u0162\u0163\u00054\u0000\u0000\u0163\u0165\u0005\n\u0000\u0000"+
		"\u0164\u0166\u0003\u0006\u0003\u0000\u0165\u0164\u0001\u0000\u0000\u0000"+
		"\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0168\u0001\u0000\u0000\u0000"+
		"\u0167\u0169\u0003(\u0014\u0000\u0168\u0167\u0001\u0000\u0000\u0000\u0168"+
		"\u0169\u0001\u0000\u0000\u0000\u0169\u016b\u0001\u0000\u0000\u0000\u016a"+
		"\u016c\u0005\b\u0000\u0000\u016b\u016a\u0001\u0000\u0000\u0000\u016b\u016c"+
		"\u0001\u0000\u0000\u0000\u016c\u016e\u0001\u0000\u0000\u0000\u016d\u016f"+
		"\u0003\"\u0011\u0000\u016e\u016d\u0001\u0000\u0000\u0000\u016e\u016f\u0001"+
		"\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170\u0171\u0005"+
		"\u000b\u0000\u0000\u0171\u0175\u0005\u000e\u0000\u0000\u0172\u0174\u0003"+
		"\"\u0011\u0000\u0173\u0172\u0001\u0000\u0000\u0000\u0174\u0177\u0001\u0000"+
		"\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000"+
		"\u0000\u0000\u0176\u0178\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000"+
		"\u0000\u0000\u0178\u0179\u0005\u000f\u0000\u0000\u0179+\u0001\u0000\u0000"+
		"\u0000\u017a\u017b\u00055\u0000\u0000\u017b\u017c\u0005\n\u0000\u0000"+
		"\u017c\u017d\u0003(\u0014\u0000\u017d\u017e\u0005\u000b\u0000\u0000\u017e"+
		"\u0182\u0005\u000e\u0000\u0000\u017f\u0181\u0003\"\u0011\u0000\u0180\u017f"+
		"\u0001\u0000\u0000\u0000\u0181\u0184\u0001\u0000\u0000\u0000\u0182\u0180"+
		"\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u0183\u0185"+
		"\u0001\u0000\u0000\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0185\u0186"+
		"\u0005\u000f\u0000\u0000\u0186-\u0001\u0000\u0000\u0000\u0187\u018e\u0003"+
		"\u000e\u0007\u0000\u0188\u018e\u0005K\u0000\u0000\u0189\u018a\u0005K\u0000"+
		"\u0000\u018a\u018b\u0005\u001d\u0000\u0000\u018b\u018e\u0005K\u0000\u0000"+
		"\u018c\u018e\u00030\u0018\u0000\u018d\u0187\u0001\u0000\u0000\u0000\u018d"+
		"\u0188\u0001\u0000\u0000\u0000\u018d\u0189\u0001\u0000\u0000\u0000\u018d"+
		"\u018c\u0001\u0000\u0000\u0000\u018e/\u0001\u0000\u0000\u0000\u018f\u0190"+
		"\u0005K\u0000\u0000\u0190\u0199\u0005\n\u0000\u0000\u0191\u0196\u0003"+
		".\u0017\u0000\u0192\u0193\u0005\u0007\u0000\u0000\u0193\u0195\u0003.\u0017"+
		"\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0195\u0198\u0001\u0000\u0000"+
		"\u0000\u0196\u0194\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000"+
		"\u0000\u0197\u019a\u0001\u0000\u0000\u0000\u0198\u0196\u0001\u0000\u0000"+
		"\u0000\u0199\u0191\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000"+
		"\u0000\u019a\u019b\u0001\u0000\u0000\u0000\u019b\u019c\u0005\u000b\u0000"+
		"\u0000\u019c\u019d\u0005\b\u0000\u0000\u019d1\u0001\u0000\u0000\u0000"+
		"\u019e\u019f\u0005\u0010\u0000\u0000\u019f\u01a4\u0005K\u0000\u0000\u01a0"+
		"\u01a3\u00034\u001a\u0000\u01a1\u01a3\u00036\u001b\u0000\u01a2\u01a0\u0001"+
		"\u0000\u0000\u0000\u01a2\u01a1\u0001\u0000\u0000\u0000\u01a3\u01a6\u0001"+
		"\u0000\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001"+
		"\u0000\u0000\u0000\u01a5\u01a7\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001"+
		"\u0000\u0000\u0000\u01a7\u01ab\u0005\u0011\u0000\u0000\u01a8\u01aa\u0003"+
		"8\u001c\u0000\u01a9\u01a8\u0001\u0000\u0000\u0000\u01aa\u01ad\u0001\u0000"+
		"\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000"+
		"\u0000\u0000\u01ac\u01ae\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000"+
		"\u0000\u0000\u01ae\u01af\u0005\u0010\u0000\u0000\u01af\u01b0\u0005\u0005"+
		"\u0000\u0000\u01b0\u01b1\u0005K\u0000\u0000\u01b1\u01b2\u0005\u0011\u0000"+
		"\u0000\u01b23\u0001\u0000\u0000\u0000\u01b3\u01b4\u0005K\u0000\u0000\u01b4"+
		"\u01b5\u0005\u0001\u0000\u0000\u01b5\u01b6\u0003.\u0017\u0000\u01b65\u0001"+
		"\u0000\u0000\u0000\u01b7\u01b8\u0005!\u0000\u0000\u01b8\u01b9\u0005\u0001"+
		"\u0000\u0000\u01b9\u01ba\u0005O\u0000\u0000\u01ba7\u0001\u0000\u0000\u0000"+
		"\u01bb\u01c0\u00032\u0019\u0000\u01bc\u01c0\u0003:\u001d\u0000\u01bd\u01c0"+
		"\u00030\u0018\u0000\u01be\u01c0\u0005K\u0000\u0000\u01bf\u01bb\u0001\u0000"+
		"\u0000\u0000\u01bf\u01bc\u0001\u0000\u0000\u0000\u01bf\u01bd\u0001\u0000"+
		"\u0000\u0000\u01bf\u01be\u0001\u0000\u0000\u0000\u01c09\u0001\u0000\u0000"+
		"\u0000\u01c1\u01c2\u0005\u000e\u0000\u0000\u01c2\u01c3\u0003(\u0014\u0000"+
		"\u01c3\u01c4\u0005\u0017\u0000\u0000\u01c4\u01c5\u00032\u0019\u0000\u01c5"+
		"\u01c6\u0005\u000f\u0000\u0000\u01c6;\u0001\u0000\u0000\u0000\u01c7\u01c8"+
		"\u0007\u0002\u0000\u0000\u01c8=\u0001\u0000\u0000\u0000\u01c9\u01ca\u0005"+
		"-\u0000\u0000\u01ca\u01cb\u0005\u001d\u0000\u0000\u01cb\u01cc\u0005.\u0000"+
		"\u0000\u01cc\u01cd\u0005\n\u0000\u0000\u01cd\u01ce\u0003.\u0017\u0000"+
		"\u01ce\u01cf\u0005\u000b\u0000\u0000\u01cf\u01d0\u0005\b\u0000\u0000\u01d0"+
		"?\u0001\u0000\u0000\u00007CJLPZ]`hw\u007f\u0087\u008a\u0094\u00a8\u00b0"+
		"\u00b3\u00c1\u00c4\u00cc\u00d1\u00dc\u00e1\u00ea\u00ee\u00f8\u00fc\u0100"+
		"\u0106\u010c\u0110\u0119\u011d\u0122\u0126\u012b\u0136\u013b\u0141\u014c"+
		"\u0155\u0159\u0160\u0165\u0168\u016b\u016e\u0175\u0182\u018d\u0196\u0199"+
		"\u01a2\u01a4\u01ab\u01bf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}