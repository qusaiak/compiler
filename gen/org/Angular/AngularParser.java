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
		MINUSMINUS=26, SQ=27, DQ=28, HTMLSTRING=29, DOT=30, AT=31, SLASHGREATERTHAN=32, 
		DOUBLELEFTCURLY=33, DOUBLERIGHTCURLY=34, COMPONENT=35, CLASS=36, INPUT=37, 
		OUTPUT=38, PROPERTY=39, IMPORT=40, EXPORT=41, DEFAULT=42, FROM=43, CONSTRUCTOR=44, 
		EXTENDS=45, IMPLEMENTS=46, FUNCTION=47, CONSOLE=48, LOG=49, VAR=50, LET=51, 
		CONST=52, IF=53, ELSE=54, FOR=55, WHILE=56, RETURN=57, NULL=58, ANY=59, 
		SWITCH=60, CASE=61, DO=62, BREAK=63, CONTINUE=64, TRY=65, CATCH=66, FINALLY=67, 
		THROWS=68, ASYNC=69, AWAIT=70, TYPE=71, ENUM=72, INTERFACE=73, PUBLIC=74, 
		PRIVATE=75, PROTECTED=76, AS=77, THIS=78, VOID=79, NUMBER=80, ONINIT=81, 
		ONCHANGES=82, ONDESTROY=83, NGIF=84, NGSWITCH=85, NGFOR=86, NGSTYLE=87, 
		NGCLASS=88, ID=89, INT=90, DOUBLE=91, BOOLEAN=92, STRING=93, WS=94, COMMENT=95, 
		BLOCK_COMMENT=96;
	public static final int
		RULE_program = 0, RULE_importStatement = 1, RULE_exportStatement = 2, 
		RULE_variableDeclaration = 3, RULE_classDeclaration = 4, RULE_functionDeclaration = 5, 
		RULE_componentDeclaration = 6, RULE_value = 7, RULE_array = 8, RULE_object = 9, 
		RULE_classBody = 10, RULE_assignment = 11, RULE_decorator = 12, RULE_decoratorArguments = 13, 
		RULE_argumentContent = 14, RULE_constructorDeclaration = 15, RULE_parameters = 16, 
		RULE_functionBody = 17, RULE_returnStatement = 18, RULE_operation = 19, 
		RULE_statement = 20, RULE_componentBody = 21, RULE_ifStatement = 22, RULE_condition = 23, 
		RULE_forStatement = 24, RULE_whileStatement = 25, RULE_callFunction = 26, 
		RULE_jsxElement = 27, RULE_openingTag = 28, RULE_closingTag = 29, RULE_selfClosingTag = 30, 
		RULE_jsxContent = 31, RULE_interpolation = 32, RULE_jsxAttributes = 33, 
		RULE_angularDirective = 34, RULE_directive = 35, RULE_jsxAttribute = 36, 
		RULE_jsxEvent = 37, RULE_jsxBinding = 38, RULE_jsxClass = 39, RULE_expression = 40, 
		RULE_type = 41, RULE_printStatement = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "importStatement", "exportStatement", "variableDeclaration", 
			"classDeclaration", "functionDeclaration", "componentDeclaration", "value", 
			"array", "object", "classBody", "assignment", "decorator", "decoratorArguments", 
			"argumentContent", "constructorDeclaration", "parameters", "functionBody", 
			"returnStatement", "operation", "statement", "componentBody", "ifStatement", 
			"condition", "forStatement", "whileStatement", "callFunction", "jsxElement", 
			"openingTag", "closingTag", "selfClosingTag", "jsxContent", "interpolation", 
			"jsxAttributes", "angularDirective", "directive", "jsxAttribute", "jsxEvent", 
			"jsxBinding", "jsxClass", "expression", "type", "printStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'+'", "'-'", "'*'", "'/'", "'%'", "','", "';'", "':'", 
			"'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", "'>'", "'<='", "'>='", 
			"'=>'", "'=='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'''", "'\"'", 
			"'`'", "'.'", "'@'", "'/>'", "'{{'", "'}}'", "'component'", "'class'", 
			"'input'", "'output'", "'property'", "'import'", "'export'", "'default'", 
			"'from'", "'constructor'", "'extends'", "'implements'", "'function'", 
			"'console'", "'log'", "'var'", "'let'", "'const'", "'if'", "'else'", 
			"'for'", "'while'", "'return'", "'null'", "'any'", "'switch'", "'case'", 
			"'do'", "'break'", "'continue'", "'try'", "'catch'", "'finally'", "'throws'", 
			"'async'", "'await'", "'type'", "'enum'", "'interface'", "'public'", 
			"'private'", "'protected'", "'as'", "'this'", "'void'", "'number'", "'ngOnInit'", 
			"'ngOnChanges'", "'ngOnDestroy'", "'ngIf'", "'ngSwitch'", "'ngFor'", 
			"'ngStyle'", "'ngClass'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EQUAL", "PLUS", "MINUS", "STAR", "DIVISION", "PERCENT", "COMMA", 
			"SEMI", "COLON", "LEFTPAREN", "RIGHTPAREN", "LEFTBRACKET", "RIGHTBRACKET", 
			"LEFTCURLY", "RIGHTCURLY", "LESSTHAN", "GREATERTHAN", "LESSEQUAL", "GREATEREQUAL", 
			"ARROW", "EQ", "NEQ", "AND", "OR", "PLUSPLUS", "MINUSMINUS", "SQ", "DQ", 
			"HTMLSTRING", "DOT", "AT", "SLASHGREATERTHAN", "DOUBLELEFTCURLY", "DOUBLERIGHTCURLY", 
			"COMPONENT", "CLASS", "INPUT", "OUTPUT", "PROPERTY", "IMPORT", "EXPORT", 
			"DEFAULT", "FROM", "CONSTRUCTOR", "EXTENDS", "IMPLEMENTS", "FUNCTION", 
			"CONSOLE", "LOG", "VAR", "LET", "CONST", "IF", "ELSE", "FOR", "WHILE", 
			"RETURN", "NULL", "ANY", "SWITCH", "CASE", "DO", "BREAK", "CONTINUE", 
			"TRY", "CATCH", "FINALLY", "THROWS", "ASYNC", "AWAIT", "TYPE", "ENUM", 
			"INTERFACE", "PUBLIC", "PRIVATE", "PROTECTED", "AS", "THIS", "VOID", 
			"NUMBER", "ONINIT", "ONCHANGES", "ONDESTROY", "NGIF", "NGSWITCH", "NGFOR", 
			"NGSTYLE", "NGCLASS", "ID", "INT", "DOUBLE", "BOOLEAN", "STRING", "WS", 
			"COMMENT", "BLOCK_COMMENT"
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
		public TerminalNode EOF() { return getToken(AngularParser.EOF, 0); }
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
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(86);
				importStatement();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8022107703230464L) != 0) || _la==ID) {
				{
				setState(96);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(92);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(93);
					classDeclaration();
					}
					break;
				case 3:
					{
					setState(94);
					functionDeclaration();
					}
					break;
				case 4:
					{
					setState(95);
					componentDeclaration();
					}
					break;
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(101);
				exportStatement();
				}
			}

			setState(104);
			match(EOF);
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
			setState(106);
			match(IMPORT);
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(107);
				match(ID);
				}
				break;
			case LEFTCURLY:
				{
				setState(108);
				match(LEFTCURLY);
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(109);
					match(ID);
					setState(114);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(110);
						match(COMMA);
						setState(111);
						match(ID);
						}
						}
						setState(116);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(119);
				match(RIGHTCURLY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(122);
			match(FROM);
			setState(123);
			match(STRING);
			setState(124);
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
		public TerminalNode LEFTCURLY() { return getToken(AngularParser.LEFTCURLY, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(AngularParser.RIGHTCURLY, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ComponentDeclarationContext componentDeclaration() {
			return getRuleContext(ComponentDeclarationContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(AngularParser.DEFAULT, 0); }
		public List<TerminalNode> ID() { return getTokens(AngularParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngularParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
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
			setState(126);
			match(EXPORT);
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(127);
					match(DEFAULT);
					}
				}

				setState(135);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(130);
					classDeclaration();
					}
					break;
				case 2:
					{
					setState(131);
					variableDeclaration();
					}
					break;
				case 3:
					{
					setState(132);
					functionDeclaration();
					}
					break;
				case 4:
					{
					setState(133);
					componentDeclaration();
					}
					break;
				case 5:
					{
					setState(134);
					object();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(137);
				match(LEFTCURLY);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(138);
					match(ID);
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(139);
						match(COMMA);
						setState(140);
						match(ID);
						}
						}
						setState(145);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(148);
				match(RIGHTCURLY);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public TerminalNode COMMA() { return getToken(AngularParser.COMMA, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
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
		public TerminalNode VAR() { return getToken(AngularParser.VAR, 0); }
		public TerminalNode LET() { return getToken(AngularParser.LET, 0); }
		public TerminalNode CONST() { return getToken(AngularParser.CONST, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7881299347898368L) != 0)) {
					{
					setState(151);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7881299347898368L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(154);
				match(ID);
				setState(155);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(160);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(156);
					value();
					}
					break;
				case 2:
					{
					setState(157);
					array();
					}
					break;
				case 3:
					{
					setState(158);
					object();
					}
					break;
				case 4:
					{
					setState(159);
					functionDeclaration();
					}
					break;
				}
				setState(162);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==SEMI) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7881299347898368L) != 0)) {
					{
					setState(164);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7881299347898368L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(167);
				match(ID);
				setState(168);
				match(COLON);
				setState(169);
				type();
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 864691137045155856L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 1015907L) != 0)) {
					{
					setState(170);
					value();
					}
				}

				setState(173);
				match(EQUAL);
				setState(178);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(174);
					value();
					}
					break;
				case 2:
					{
					setState(175);
					array();
					}
					break;
				case 3:
					{
					setState(176);
					object();
					}
					break;
				case 4:
					{
					setState(177);
					functionDeclaration();
					}
					break;
				}
				setState(180);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==SEMI) ) {
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
			setState(184);
			match(CLASS);
			setState(185);
			match(ID);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(186);
				match(EXTENDS);
				setState(187);
				match(ID);
				}
			}

			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(190);
				match(IMPLEMENTS);
				setState(191);
				match(ID);
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(192);
					match(COMMA);
					setState(193);
					match(ID);
					}
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(201);
			match(LEFTCURLY);
			setState(202);
			classBody();
			setState(203);
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
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode LEFTPAREN() { return getToken(AngularParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(AngularParser.RIGHTPAREN, 0); }
		public TerminalNode LEFTCURLY() { return getToken(AngularParser.LEFTCURLY, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public TerminalNode RIGHTCURLY() { return getToken(AngularParser.RIGHTCURLY, 0); }
		public TerminalNode FUNCTION() { return getToken(AngularParser.FUNCTION, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION) {
				{
				setState(205);
				match(FUNCTION);
				}
			}

			setState(208);
			match(ID);
			setState(209);
			match(LEFTPAREN);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTCURLY || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 32771L) != 0)) {
				{
				setState(210);
				parameters();
				}
			}

			setState(213);
			match(RIGHTPAREN);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(214);
				match(COLON);
				setState(215);
				type();
				}
			}

			setState(218);
			match(LEFTCURLY);
			setState(219);
			functionBody();
			setState(220);
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
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				decorator();
				}
				break;
			case LEFTCURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(LEFTCURLY);
				setState(224);
				componentBody();
				setState(225);
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
	public static class ValueContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public JsxElementContext jsxElement() {
			return getRuleContext(JsxElementContext.class,0);
		}
		public AngularDirectiveContext angularDirective() {
			return getRuleContext(AngularDirectiveContext.class,0);
		}
		public InterpolationContext interpolation() {
			return getRuleContext(InterpolationContext.class,0);
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
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
			case ANY:
			case PUBLIC:
			case PRIVATE:
			case VOID:
			case NUMBER:
			case ID:
			case INT:
			case DOUBLE:
			case BOOLEAN:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				type();
				}
				break;
			case LEFTBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				array();
				}
				break;
			case LEFTCURLY:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				object();
				}
				break;
			case LESSTHAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(232);
				jsxElement();
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(233);
				angularDirective();
				}
				break;
			case DOUBLELEFTCURLY:
				enterOuterAlt(_localctx, 6);
				{
				setState(234);
				interpolation();
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
			setState(237);
			match(LEFTBRACKET);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 864691137045155856L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 1015907L) != 0)) {
				{
				setState(238);
				value();
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(239);
					match(COMMA);
					setState(240);
					value();
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(248);
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
			setState(250);
			match(LEFTCURLY);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(251);
				match(ID);
				setState(252);
				match(COLON);
				setState(253);
				value();
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(254);
					match(COMMA);
					setState(255);
					match(ID);
					setState(256);
					match(COLON);
					setState(257);
					value();
					}
					}
					setState(262);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(265);
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
		public List<DecoratorContext> decorator() {
			return getRuleContexts(DecoratorContext.class);
		}
		public DecoratorContext decorator(int i) {
			return getRuleContext(DecoratorContext.class,i);
		}
		public List<ConstructorDeclarationContext> constructorDeclaration() {
			return getRuleContexts(ConstructorDeclarationContext.class);
		}
		public ConstructorDeclarationContext constructorDeclaration(int i) {
			return getRuleContext(ConstructorDeclarationContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & 288230376155455489L) != 0)) {
				{
				setState(271);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(267);
					decorator();
					}
					break;
				case 2:
					{
					setState(268);
					constructorDeclaration();
					}
					break;
				case 3:
					{
					setState(269);
					variableDeclaration();
					}
					break;
				case 4:
					{
					setState(270);
					functionDeclaration();
					}
					break;
				}
				}
				setState(275);
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
	public static class AssignmentContext extends ParserRuleContext {
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
		public List<TerminalNode> SEMI() { return getTokens(AngularParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(AngularParser.SEMI, i);
		}
		public List<TerminalNode> THIS() { return getTokens(AngularParser.THIS); }
		public TerminalNode THIS(int i) {
			return getToken(AngularParser.THIS, i);
		}
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment);
		int _la;
		try {
			int _alt;
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(281); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(276);
						match(ID);
						setState(277);
						match(COLON);
						setState(278);
						type();
						setState(279);
						match(SEMI);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(283); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				match(THIS);
				setState(286);
				match(DOT);
				setState(287);
				match(ID);
				setState(288);
				match(EQUAL);
				setState(297);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(289);
					value();
					}
					break;
				case 2:
					{
					setState(290);
					match(THIS);
					setState(291);
					match(DOT);
					setState(292);
					match(ID);
					setState(295);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DOT) {
						{
						setState(293);
						match(DOT);
						setState(294);
						callFunction();
						}
					}

					}
					break;
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(299);
					match(SEMI);
					}
				}

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
	public static class DecoratorContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(AngularParser.AT, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode LEFTPAREN() { return getToken(AngularParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(AngularParser.RIGHTPAREN, 0); }
		public List<DecoratorArgumentsContext> decoratorArguments() {
			return getRuleContexts(DecoratorArgumentsContext.class);
		}
		public DecoratorArgumentsContext decoratorArguments(int i) {
			return getRuleContext(DecoratorArgumentsContext.class,i);
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
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				match(AT);
				setState(305);
				match(ID);
				setState(306);
				match(LEFTPAREN);
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LEFTCURLY) {
					{
					{
					setState(307);
					decoratorArguments();
					}
					}
					setState(312);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(313);
				match(RIGHTPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(AT);
				setState(315);
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
		public TerminalNode LEFTCURLY() { return getToken(AngularParser.LEFTCURLY, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(AngularParser.RIGHTCURLY, 0); }
		public List<ArgumentContentContext> argumentContent() {
			return getRuleContexts(ArgumentContentContext.class);
		}
		public ArgumentContentContext argumentContent(int i) {
			return getRuleContext(ArgumentContentContext.class,i);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(LEFTCURLY);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8024304579002368L) != 0) || _la==ID) {
				{
				{
				setState(319);
				argumentContent();
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(325);
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
	public static class ArgumentContentContext extends ParserRuleContext {
		public ExportStatementContext exportStatement() {
			return getRuleContext(ExportStatementContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TerminalNode LEFTCURLY() { return getToken(AngularParser.LEFTCURLY, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(AngularParser.RIGHTCURLY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode COMMA() { return getToken(AngularParser.COMMA, 0); }
		public List<TerminalNode> HTMLSTRING() { return getTokens(AngularParser.HTMLSTRING); }
		public TerminalNode HTMLSTRING(int i) {
			return getToken(AngularParser.HTMLSTRING, i);
		}
		public JsxElementContext jsxElement() {
			return getRuleContext(JsxElementContext.class,0);
		}
		public ArgumentContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArgumentContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArgumentContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArgumentContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContentContext argumentContent() throws RecognitionException {
		ArgumentContentContext _localctx = new ArgumentContentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_argumentContent);
		int _la;
		try {
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				exportStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				variableDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(330);
				classDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(331);
				match(LEFTCURLY);
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 269371552712163344L) != 0) || _la==THIS || _la==ID) {
					{
					{
					setState(332);
					statement();
					}
					}
					setState(337);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(338);
				match(RIGHTCURLY);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(339);
				match(ID);
				setState(340);
				match(COLON);
				setState(341);
				match(STRING);
				setState(342);
				match(COMMA);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(343);
				match(ID);
				setState(344);
				match(COLON);
				setState(345);
				match(HTMLSTRING);
				setState(346);
				jsxElement();
				setState(347);
				match(HTMLSTRING);
				setState(348);
				match(COMMA);
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
	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(AngularParser.CONSTRUCTOR, 0); }
		public TerminalNode LEFTPAREN() { return getToken(AngularParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(AngularParser.RIGHTPAREN, 0); }
		public TerminalNode LEFTCURLY() { return getToken(AngularParser.LEFTCURLY, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(AngularParser.RIGHTCURLY, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
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
		enterRule(_localctx, 30, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(CONSTRUCTOR);
			setState(353);
			match(LEFTPAREN);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTCURLY || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 32771L) != 0)) {
				{
				setState(354);
				parameters();
				}
			}

			setState(357);
			match(RIGHTPAREN);
			setState(358);
			match(LEFTCURLY);
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(359);
				functionBody();
				}
				break;
			case 2:
				{
				setState(360);
				assignment();
				}
				break;
			}
			setState(363);
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
		public List<TerminalNode> PUBLIC() { return getTokens(AngularParser.PUBLIC); }
		public TerminalNode PUBLIC(int i) {
			return getToken(AngularParser.PUBLIC, i);
		}
		public List<TerminalNode> PRIVATE() { return getTokens(AngularParser.PRIVATE); }
		public TerminalNode PRIVATE(int i) {
			return getToken(AngularParser.PRIVATE, i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(AngularParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(AngularParser.EQUAL, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
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
		enterRule(_localctx, 32, RULE_parameters);
		int _la;
		try {
			setState(405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
			case PRIVATE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUBLIC || _la==PRIVATE) {
					{
					setState(365);
					_la = _input.LA(1);
					if ( !(_la==PUBLIC || _la==PRIVATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(368);
				match(ID);
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(369);
					match(COLON);
					setState(370);
					type();
					setState(373);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==EQUAL) {
						{
						setState(371);
						match(EQUAL);
						setState(372);
						value();
						}
					}

					}
				}

				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(377);
					match(COMMA);
					setState(379);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PUBLIC || _la==PRIVATE) {
						{
						setState(378);
						_la = _input.LA(1);
						if ( !(_la==PUBLIC || _la==PRIVATE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(381);
					match(ID);
					setState(388);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COLON) {
						{
						setState(382);
						match(COLON);
						setState(383);
						type();
						setState(386);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==EQUAL) {
							{
							setState(384);
							match(EQUAL);
							setState(385);
							value();
							}
						}

						}
					}

					}
					}
					setState(394);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case LEFTCURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				match(LEFTCURLY);
				setState(396);
				match(ID);
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(397);
					match(COMMA);
					setState(398);
					match(ID);
					}
					}
					setState(403);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(404);
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
		enterRule(_localctx, 34, RULE_functionBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(407);
					statement();
					}
					} 
				}
				setState(412);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(413);
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
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public JsxElementContext jsxElement() {
			return getRuleContext(JsxElementContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
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
		enterRule(_localctx, 36, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(RETURN);
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(417);
				value();
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7274556L) != 0)) {
					{
					setState(418);
					operation();
					setState(419);
					value();
					}
				}

				}
				break;
			case 2:
				{
				setState(423);
				jsxElement();
				}
				break;
			}
			setState(426);
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
	public static class OperationContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(AngularParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(AngularParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(AngularParser.STAR, 0); }
		public TerminalNode DIVISION() { return getToken(AngularParser.DIVISION, 0); }
		public TerminalNode EQ() { return getToken(AngularParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(AngularParser.NEQ, 0); }
		public TerminalNode GREATERTHAN() { return getToken(AngularParser.GREATERTHAN, 0); }
		public TerminalNode GREATEREQUAL() { return getToken(AngularParser.GREATEREQUAL, 0); }
		public TerminalNode LESSTHAN() { return getToken(AngularParser.LESSTHAN, 0); }
		public TerminalNode LESSEQUAL() { return getToken(AngularParser.LESSEQUAL, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7274556L) != 0)) ) {
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
		public AngularDirectiveContext angularDirective() {
			return getRuleContext(AngularDirectiveContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
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
		enterRule(_localctx, 40, RULE_statement);
		try {
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(432);
				forStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(433);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(434);
				callFunction();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(435);
				printStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(436);
				jsxElement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(437);
				angularDirective();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(438);
				returnStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(439);
				assignment();
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
		enterRule(_localctx, 42, RULE_componentBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(442);
					variableDeclaration();
					}
					} 
				}
				setState(447);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION || _la==ID) {
				{
				{
				setState(448);
				functionDeclaration();
				}
				}
				setState(453);
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
		enterRule(_localctx, 44, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(IF);
			setState(455);
			match(LEFTPAREN);
			setState(456);
			condition();
			setState(457);
			match(RIGHTPAREN);
			setState(458);
			match(LEFTCURLY);
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 269371552712163344L) != 0) || _la==THIS || _la==ID) {
				{
				{
				setState(459);
				statement();
				}
				}
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(465);
			match(RIGHTCURLY);
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(466);
				match(ELSE);
				setState(467);
				match(LEFTCURLY);
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 269371552712163344L) != 0) || _la==THIS || _la==ID) {
					{
					{
					setState(468);
					statement();
					}
					}
					setState(473);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(474);
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
		enterRule(_localctx, 46, RULE_condition);
		int _la;
		try {
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				expression(0);
				setState(478);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(479);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
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
		enterRule(_localctx, 48, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(FOR);
			setState(485);
			match(LEFTPAREN);
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(486);
				variableDeclaration();
				}
				break;
			}
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(489);
				condition();
				}
				break;
			}
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(492);
				match(SEMI);
				}
			}

			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 269371552712163344L) != 0) || _la==THIS || _la==ID) {
				{
				setState(495);
				statement();
				}
			}

			setState(498);
			match(RIGHTPAREN);
			setState(499);
			match(LEFTCURLY);
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 269371552712163344L) != 0) || _la==THIS || _la==ID) {
				{
				{
				setState(500);
				statement();
				}
				}
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(506);
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
		enterRule(_localctx, 50, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(WHILE);
			setState(509);
			match(LEFTPAREN);
			setState(510);
			condition();
			setState(511);
			match(RIGHTPAREN);
			setState(512);
			match(LEFTCURLY);
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 269371552712163344L) != 0) || _la==THIS || _la==ID) {
				{
				{
				setState(513);
				statement();
				}
				}
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(519);
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
		enterRule(_localctx, 52, RULE_callFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(ID);
			setState(522);
			match(LEFTPAREN);
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 864691137045155856L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 1015907L) != 0)) {
				{
				setState(523);
				expression(0);
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(524);
					match(COMMA);
					setState(525);
					expression(0);
					}
					}
					setState(530);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(533);
			match(RIGHTPAREN);
			setState(534);
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
		public OpeningTagContext openingTag() {
			return getRuleContext(OpeningTagContext.class,0);
		}
		public ClosingTagContext closingTag() {
			return getRuleContext(ClosingTagContext.class,0);
		}
		public List<JsxContentContext> jsxContent() {
			return getRuleContexts(JsxContentContext.class);
		}
		public JsxContentContext jsxContent(int i) {
			return getRuleContext(JsxContentContext.class,i);
		}
		public SelfClosingTagContext selfClosingTag() {
			return getRuleContext(SelfClosingTagContext.class,0);
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
		enterRule(_localctx, 54, RULE_jsxElement);
		try {
			int _alt;
			setState(546);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(536);
				openingTag();
				setState(540);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(537);
						jsxContent();
						}
						} 
					}
					setState(542);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				}
				setState(543);
				closingTag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(545);
				selfClosingTag();
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
	public static class OpeningTagContext extends ParserRuleContext {
		public TerminalNode LESSTHAN() { return getToken(AngularParser.LESSTHAN, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode GREATERTHAN() { return getToken(AngularParser.GREATERTHAN, 0); }
		public JsxAttributesContext jsxAttributes() {
			return getRuleContext(JsxAttributesContext.class,0);
		}
		public OpeningTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openingTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOpeningTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOpeningTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOpeningTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpeningTagContext openingTag() throws RecognitionException {
		OpeningTagContext _localctx = new OpeningTagContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_openingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(LESSTHAN);
			setState(549);
			match(ID);
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68719481872L) != 0) || _la==ID) {
				{
				setState(550);
				jsxAttributes();
				}
			}

			setState(553);
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
	public static class ClosingTagContext extends ParserRuleContext {
		public TerminalNode LESSTHAN() { return getToken(AngularParser.LESSTHAN, 0); }
		public TerminalNode DIVISION() { return getToken(AngularParser.DIVISION, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode GREATERTHAN() { return getToken(AngularParser.GREATERTHAN, 0); }
		public ClosingTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closingTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClosingTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClosingTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClosingTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosingTagContext closingTag() throws RecognitionException {
		ClosingTagContext _localctx = new ClosingTagContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_closingTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(LESSTHAN);
			setState(556);
			match(DIVISION);
			setState(557);
			match(ID);
			setState(558);
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
	public static class SelfClosingTagContext extends ParserRuleContext {
		public TerminalNode LESSTHAN() { return getToken(AngularParser.LESSTHAN, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode SLASHGREATERTHAN() { return getToken(AngularParser.SLASHGREATERTHAN, 0); }
		public JsxAttributesContext jsxAttributes() {
			return getRuleContext(JsxAttributesContext.class,0);
		}
		public SelfClosingTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfClosingTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelfClosingTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelfClosingTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelfClosingTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfClosingTagContext selfClosingTag() throws RecognitionException {
		SelfClosingTagContext _localctx = new SelfClosingTagContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_selfClosingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			match(LESSTHAN);
			setState(561);
			match(ID);
			setState(563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68719481872L) != 0) || _la==ID) {
				{
				setState(562);
				jsxAttributes();
				}
			}

			setState(565);
			match(SLASHGREATERTHAN);
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
	public static class JsxContentContext extends ParserRuleContext {
		public JsxElementContext jsxElement() {
			return getRuleContext(JsxElementContext.class,0);
		}
		public InterpolationContext interpolation() {
			return getRuleContext(InterpolationContext.class,0);
		}
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public JsxContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterJsxContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitJsxContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitJsxContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxContentContext jsxContent() throws RecognitionException {
		JsxContentContext _localctx = new JsxContentContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_jsxContent);
		try {
			setState(570);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LESSTHAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(567);
				jsxElement();
				}
				break;
			case DOUBLELEFTCURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(568);
				interpolation();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(569);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterpolationContext extends ParserRuleContext {
		public TerminalNode DOUBLELEFTCURLY() { return getToken(AngularParser.DOUBLELEFTCURLY, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOUBLERIGHTCURLY() { return getToken(AngularParser.DOUBLERIGHTCURLY, 0); }
		public InterpolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterpolation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterpolation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterpolation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolationContext interpolation() throws RecognitionException {
		InterpolationContext _localctx = new InterpolationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_interpolation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(DOUBLELEFTCURLY);
			setState(573);
			expression(0);
			setState(574);
			match(DOUBLERIGHTCURLY);
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
	public static class JsxAttributesContext extends ParserRuleContext {
		public List<AngularDirectiveContext> angularDirective() {
			return getRuleContexts(AngularDirectiveContext.class);
		}
		public AngularDirectiveContext angularDirective(int i) {
			return getRuleContext(AngularDirectiveContext.class,i);
		}
		public List<JsxAttributeContext> jsxAttribute() {
			return getRuleContexts(JsxAttributeContext.class);
		}
		public JsxAttributeContext jsxAttribute(int i) {
			return getRuleContext(JsxAttributeContext.class,i);
		}
		public List<JsxEventContext> jsxEvent() {
			return getRuleContexts(JsxEventContext.class);
		}
		public JsxEventContext jsxEvent(int i) {
			return getRuleContext(JsxEventContext.class,i);
		}
		public List<JsxBindingContext> jsxBinding() {
			return getRuleContexts(JsxBindingContext.class);
		}
		public JsxBindingContext jsxBinding(int i) {
			return getRuleContext(JsxBindingContext.class,i);
		}
		public List<JsxClassContext> jsxClass() {
			return getRuleContexts(JsxClassContext.class);
		}
		public JsxClassContext jsxClass(int i) {
			return getRuleContext(JsxClassContext.class,i);
		}
		public JsxAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterJsxAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitJsxAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitJsxAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxAttributesContext jsxAttributes() throws RecognitionException {
		JsxAttributesContext _localctx = new JsxAttributesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_jsxAttributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(581);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(576);
					angularDirective();
					}
					break;
				case ID:
					{
					setState(577);
					jsxAttribute();
					}
					break;
				case LEFTPAREN:
					{
					setState(578);
					jsxEvent();
					}
					break;
				case LEFTBRACKET:
					{
					setState(579);
					jsxBinding();
					}
					break;
				case CLASS:
					{
					setState(580);
					jsxClass();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(583); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 68719481872L) != 0) || _la==ID );
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
	public static class AngularDirectiveContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(AngularParser.STAR, 0); }
		public DirectiveContext directive() {
			return getRuleContext(DirectiveContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public AngularDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angularDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAngularDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAngularDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAngularDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AngularDirectiveContext angularDirective() throws RecognitionException {
		AngularDirectiveContext _localctx = new AngularDirectiveContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_angularDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			match(STAR);
			setState(586);
			directive();
			setState(587);
			match(EQUAL);
			setState(588);
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
	public static class DirectiveContext extends ParserRuleContext {
		public TerminalNode NGIF() { return getToken(AngularParser.NGIF, 0); }
		public TerminalNode NGSWITCH() { return getToken(AngularParser.NGSWITCH, 0); }
		public TerminalNode NGFOR() { return getToken(AngularParser.NGFOR, 0); }
		public TerminalNode NGSTYLE() { return getToken(AngularParser.NGSTYLE, 0); }
		public TerminalNode NGCLASS() { return getToken(AngularParser.NGCLASS, 0); }
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_directive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			_la = _input.LA(1);
			if ( !(((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & 31L) != 0)) ) {
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
	public static class JsxAttributeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
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
		enterRule(_localctx, 72, RULE_jsxAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			match(ID);
			setState(593);
			match(EQUAL);
			setState(594);
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
	public static class JsxEventContext extends ParserRuleContext {
		public TerminalNode LEFTPAREN() { return getToken(AngularParser.LEFTPAREN, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(AngularParser.RIGHTPAREN, 0); }
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public JsxEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxEvent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterJsxEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitJsxEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitJsxEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxEventContext jsxEvent() throws RecognitionException {
		JsxEventContext _localctx = new JsxEventContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_jsxEvent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(LEFTPAREN);
			setState(597);
			match(ID);
			setState(598);
			match(RIGHTPAREN);
			setState(599);
			match(EQUAL);
			setState(600);
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
	public static class JsxBindingContext extends ParserRuleContext {
		public TerminalNode LEFTBRACKET() { return getToken(AngularParser.LEFTBRACKET, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode RIGHTBRACKET() { return getToken(AngularParser.RIGHTBRACKET, 0); }
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public InterpolationContext interpolation() {
			return getRuleContext(InterpolationContext.class,0);
		}
		public JsxBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterJsxBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitJsxBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitJsxBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxBindingContext jsxBinding() throws RecognitionException {
		JsxBindingContext _localctx = new JsxBindingContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_jsxBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(LEFTBRACKET);
			setState(603);
			match(ID);
			setState(604);
			match(RIGHTBRACKET);
			setState(605);
			match(EQUAL);
			setState(608);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(606);
				match(STRING);
				}
				break;
			case DOUBLELEFTCURLY:
				{
				setState(607);
				interpolation();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 78, RULE_jsxClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			match(CLASS);
			setState(611);
			match(EQUAL);
			setState(612);
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
	public static class ExpressionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AngularParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngularParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode INT() { return getToken(AngularParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(AngularParser.DOUBLE, 0); }
		public TerminalNode BOOLEAN() { return getToken(AngularParser.BOOLEAN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
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
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(615);
				match(ID);
				}
				break;
			case 2:
				{
				setState(616);
				match(ID);
				setState(617);
				match(DOT);
				setState(618);
				match(ID);
				}
				break;
			case 3:
				{
				setState(619);
				match(STRING);
				}
				break;
			case 4:
				{
				setState(620);
				match(INT);
				}
				break;
			case 5:
				{
				setState(621);
				match(DOUBLE);
				}
				break;
			case 6:
				{
				setState(622);
				match(BOOLEAN);
				}
				break;
			case 7:
				{
				setState(623);
				value();
				}
				break;
			case 8:
				{
				setState(624);
				callFunction();
				}
				break;
			case 9:
				{
				setState(625);
				array();
				}
				break;
			case 10:
				{
				setState(626);
				object();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(635);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(629);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(630);
					operation();
					setState(631);
					expression(2);
					}
					} 
				}
				setState(637);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode INT() { return getToken(AngularParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(AngularParser.DOUBLE, 0); }
		public TerminalNode BOOLEAN() { return getToken(AngularParser.BOOLEAN, 0); }
		public TerminalNode ANY() { return getToken(AngularParser.ANY, 0); }
		public TerminalNode PUBLIC() { return getToken(AngularParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(AngularParser.PRIVATE, 0); }
		public TerminalNode VOID() { return getToken(AngularParser.VOID, 0); }
		public TerminalNode NUMBER() { return getToken(AngularParser.NUMBER, 0); }
		public TerminalNode NULL() { return getToken(AngularParser.NULL, 0); }
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
		enterRule(_localctx, 82, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			_la = _input.LA(1);
			if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & 66578481155L) != 0)) ) {
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
		enterRule(_localctx, 84, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			match(CONSOLE);
			setState(641);
			match(DOT);
			setState(642);
			match(LOG);
			setState(643);
			match(LEFTPAREN);
			setState(644);
			expression(0);
			setState(645);
			match(RIGHTPAREN);
			setState(646);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 40:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001`\u0289\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0001\u0000\u0005\u0000X\b\u0000"+
		"\n\u0000\f\u0000[\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000a\b\u0000\n\u0000\f\u0000d\t\u0000\u0001\u0000\u0003\u0000"+
		"g\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001q\b\u0001\n\u0001\f\u0001"+
		"t\t\u0001\u0003\u0001v\b\u0001\u0001\u0001\u0003\u0001y\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u0081\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002\u0088\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002\u008e\b\u0002\n\u0002\f\u0002\u0091\t\u0002\u0003\u0002"+
		"\u0093\b\u0002\u0001\u0002\u0003\u0002\u0096\b\u0002\u0001\u0003\u0003"+
		"\u0003\u0099\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u00a1\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u00a6\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u00ac\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u00b3\b\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u00b7\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u00bd\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004\u00c3\b\u0004\n\u0004\f\u0004\u00c6\t\u0004\u0003\u0004\u00c8\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0003"+
		"\u0005\u00cf\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00d4"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00d9\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00e4\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u00ec\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00f2\b\b\n\b\f"+
		"\b\u00f5\t\b\u0003\b\u00f7\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0103\b\t\n\t\f\t\u0106"+
		"\t\t\u0003\t\u0108\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0005\n\u0110\b\n\n\n\f\n\u0113\t\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0004\u000b\u011a\b\u000b\u000b\u000b\f\u000b"+
		"\u011b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0128"+
		"\b\u000b\u0003\u000b\u012a\b\u000b\u0001\u000b\u0003\u000b\u012d\b\u000b"+
		"\u0003\u000b\u012f\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0135"+
		"\b\f\n\f\f\f\u0138\t\f\u0001\f\u0001\f\u0001\f\u0003\f\u013d\b\f\u0001"+
		"\r\u0001\r\u0005\r\u0141\b\r\n\r\f\r\u0144\t\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u014e\b\u000e\n\u000e\f\u000e\u0151\t\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u015f\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0164\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u016a\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0003\u0010\u016f\b\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0176\b\u0010\u0003\u0010\u0178"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u017c\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0183\b\u0010"+
		"\u0003\u0010\u0185\b\u0010\u0005\u0010\u0187\b\u0010\n\u0010\f\u0010\u018a"+
		"\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0190"+
		"\b\u0010\n\u0010\f\u0010\u0193\t\u0010\u0001\u0010\u0003\u0010\u0196\b"+
		"\u0010\u0001\u0011\u0005\u0011\u0199\b\u0011\n\u0011\f\u0011\u019c\t\u0011"+
		"\u0001\u0011\u0003\u0011\u019f\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u01a6\b\u0012\u0001\u0012\u0003\u0012"+
		"\u01a9\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01b9\b\u0014\u0001\u0015"+
		"\u0005\u0015\u01bc\b\u0015\n\u0015\f\u0015\u01bf\t\u0015\u0001\u0015\u0005"+
		"\u0015\u01c2\b\u0015\n\u0015\f\u0015\u01c5\t\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u01cd\b\u0016"+
		"\n\u0016\f\u0016\u01d0\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0005\u0016\u01d6\b\u0016\n\u0016\f\u0016\u01d9\t\u0016\u0001\u0016"+
		"\u0003\u0016\u01dc\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u01e3\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u01e8\b\u0018\u0001\u0018\u0003\u0018\u01eb\b\u0018\u0001"+
		"\u0018\u0003\u0018\u01ee\b\u0018\u0001\u0018\u0003\u0018\u01f1\b\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u01f6\b\u0018\n\u0018"+
		"\f\u0018\u01f9\t\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0203\b\u0019"+
		"\n\u0019\f\u0019\u0206\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u020f\b\u001a\n"+
		"\u001a\f\u001a\u0212\t\u001a\u0003\u001a\u0214\b\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0005\u001b\u021b\b\u001b\n"+
		"\u001b\f\u001b\u021e\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u0223\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0228"+
		"\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0234"+
		"\b\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0003"+
		"\u001f\u023b\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!"+
		"\u0001!\u0001!\u0004!\u0246\b!\u000b!\f!\u0247\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0003&\u0261\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0003(\u0274\b(\u0001(\u0001(\u0001(\u0001(\u0005(\u027a\b(\n(\f(\u027d"+
		"\t(\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0000\u0001P+\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRT\u0000"+
		"\b\u0001\u000024\u0002\u0000\u0001\u0001\t\t\u0001\u0000\u0007\b\u0001"+
		"\u0000JK\u0003\u0000\u0002\u0005\u0010\u0013\u0015\u0016\u0001\u0000\u0017"+
		"\u0018\u0001\u0000TX\u0004\u0000:;JKOPY]\u02d9\u0000Y\u0001\u0000\u0000"+
		"\u0000\u0002j\u0001\u0000\u0000\u0000\u0004~\u0001\u0000\u0000\u0000\u0006"+
		"\u00b6\u0001\u0000\u0000\u0000\b\u00b8\u0001\u0000\u0000\u0000\n\u00ce"+
		"\u0001\u0000\u0000\u0000\f\u00e3\u0001\u0000\u0000\u0000\u000e\u00eb\u0001"+
		"\u0000\u0000\u0000\u0010\u00ed\u0001\u0000\u0000\u0000\u0012\u00fa\u0001"+
		"\u0000\u0000\u0000\u0014\u0111\u0001\u0000\u0000\u0000\u0016\u012e\u0001"+
		"\u0000\u0000\u0000\u0018\u013c\u0001\u0000\u0000\u0000\u001a\u013e\u0001"+
		"\u0000\u0000\u0000\u001c\u015e\u0001\u0000\u0000\u0000\u001e\u0160\u0001"+
		"\u0000\u0000\u0000 \u0195\u0001\u0000\u0000\u0000\"\u019a\u0001\u0000"+
		"\u0000\u0000$\u01a0\u0001\u0000\u0000\u0000&\u01ac\u0001\u0000\u0000\u0000"+
		"(\u01b8\u0001\u0000\u0000\u0000*\u01bd\u0001\u0000\u0000\u0000,\u01c6"+
		"\u0001\u0000\u0000\u0000.\u01e2\u0001\u0000\u0000\u00000\u01e4\u0001\u0000"+
		"\u0000\u00002\u01fc\u0001\u0000\u0000\u00004\u0209\u0001\u0000\u0000\u0000"+
		"6\u0222\u0001\u0000\u0000\u00008\u0224\u0001\u0000\u0000\u0000:\u022b"+
		"\u0001\u0000\u0000\u0000<\u0230\u0001\u0000\u0000\u0000>\u023a\u0001\u0000"+
		"\u0000\u0000@\u023c\u0001\u0000\u0000\u0000B\u0245\u0001\u0000\u0000\u0000"+
		"D\u0249\u0001\u0000\u0000\u0000F\u024e\u0001\u0000\u0000\u0000H\u0250"+
		"\u0001\u0000\u0000\u0000J\u0254\u0001\u0000\u0000\u0000L\u025a\u0001\u0000"+
		"\u0000\u0000N\u0262\u0001\u0000\u0000\u0000P\u0273\u0001\u0000\u0000\u0000"+
		"R\u027e\u0001\u0000\u0000\u0000T\u0280\u0001\u0000\u0000\u0000VX\u0003"+
		"\u0002\u0001\u0000WV\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000"+
		"YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Zb\u0001\u0000\u0000"+
		"\u0000[Y\u0001\u0000\u0000\u0000\\a\u0003\u0006\u0003\u0000]a\u0003\b"+
		"\u0004\u0000^a\u0003\n\u0005\u0000_a\u0003\f\u0006\u0000`\\\u0001\u0000"+
		"\u0000\u0000`]\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`_\u0001"+
		"\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000"+
		"bc\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000"+
		"\u0000eg\u0003\u0004\u0002\u0000fe\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0005\u0000\u0000\u0001i\u0001"+
		"\u0001\u0000\u0000\u0000jx\u0005(\u0000\u0000ky\u0005Y\u0000\u0000lu\u0005"+
		"\u000e\u0000\u0000mr\u0005Y\u0000\u0000no\u0005\u0007\u0000\u0000oq\u0005"+
		"Y\u0000\u0000pn\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000"+
		"tr\u0001\u0000\u0000\u0000um\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000"+
		"\u0000vw\u0001\u0000\u0000\u0000wy\u0005\u000f\u0000\u0000xk\u0001\u0000"+
		"\u0000\u0000xl\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0005"+
		"+\u0000\u0000{|\u0005]\u0000\u0000|}\u0005\b\u0000\u0000}\u0003\u0001"+
		"\u0000\u0000\u0000~\u0095\u0005)\u0000\u0000\u007f\u0081\u0005*\u0000"+
		"\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000"+
		"\u0000\u0081\u0087\u0001\u0000\u0000\u0000\u0082\u0088\u0003\b\u0004\u0000"+
		"\u0083\u0088\u0003\u0006\u0003\u0000\u0084\u0088\u0003\n\u0005\u0000\u0085"+
		"\u0088\u0003\f\u0006\u0000\u0086\u0088\u0003\u0012\t\u0000\u0087\u0082"+
		"\u0001\u0000\u0000\u0000\u0087\u0083\u0001\u0000\u0000\u0000\u0087\u0084"+
		"\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0086"+
		"\u0001\u0000\u0000\u0000\u0088\u0096\u0001\u0000\u0000\u0000\u0089\u0092"+
		"\u0005\u000e\u0000\u0000\u008a\u008f\u0005Y\u0000\u0000\u008b\u008c\u0005"+
		"\u0007\u0000\u0000\u008c\u008e\u0005Y\u0000\u0000\u008d\u008b\u0001\u0000"+
		"\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000"+
		"\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u008a\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000"+
		"\u0000\u0000\u0094\u0096\u0005\u000f\u0000\u0000\u0095\u0080\u0001\u0000"+
		"\u0000\u0000\u0095\u0089\u0001\u0000\u0000\u0000\u0096\u0005\u0001\u0000"+
		"\u0000\u0000\u0097\u0099\u0007\u0000\u0000\u0000\u0098\u0097\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0005Y\u0000\u0000\u009b\u00a0\u0007\u0001\u0000"+
		"\u0000\u009c\u00a1\u0003\u000e\u0007\u0000\u009d\u00a1\u0003\u0010\b\u0000"+
		"\u009e\u00a1\u0003\u0012\t\u0000\u009f\u00a1\u0003\n\u0005\u0000\u00a0"+
		"\u009c\u0001\u0000\u0000\u0000\u00a0\u009d\u0001\u0000\u0000\u0000\u00a0"+
		"\u009e\u0001\u0000\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0007\u0002\u0000\u0000\u00a3"+
		"\u00b7\u0001\u0000\u0000\u0000\u00a4\u00a6\u0007\u0000\u0000\u0000\u00a5"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005Y\u0000\u0000\u00a8\u00a9"+
		"\u0005\t\u0000\u0000\u00a9\u00ab\u0003R)\u0000\u00aa\u00ac\u0003\u000e"+
		"\u0007\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00b2\u0005\u0001"+
		"\u0000\u0000\u00ae\u00b3\u0003\u000e\u0007\u0000\u00af\u00b3\u0003\u0010"+
		"\b\u0000\u00b0\u00b3\u0003\u0012\t\u0000\u00b1\u00b3\u0003\n\u0005\u0000"+
		"\u00b2\u00ae\u0001\u0000\u0000\u0000\u00b2\u00af\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5\u0007\u0002\u0000\u0000"+
		"\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6\u0098\u0001\u0000\u0000\u0000"+
		"\u00b6\u00a5\u0001\u0000\u0000\u0000\u00b7\u0007\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b9\u0005$\u0000\u0000\u00b9\u00bc\u0005Y\u0000\u0000\u00ba\u00bb"+
		"\u0005-\u0000\u0000\u00bb\u00bd\u0005Y\u0000\u0000\u00bc\u00ba\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00c7\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0005.\u0000\u0000\u00bf\u00c4\u0005Y\u0000\u0000"+
		"\u00c0\u00c1\u0005\u0007\u0000\u0000\u00c1\u00c3\u0005Y\u0000\u0000\u00c2"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7"+
		"\u00be\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\u000e\u0000\u0000\u00ca"+
		"\u00cb\u0003\u0014\n\u0000\u00cb\u00cc\u0005\u000f\u0000\u0000\u00cc\t"+
		"\u0001\u0000\u0000\u0000\u00cd\u00cf\u0005/\u0000\u0000\u00ce\u00cd\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d1\u0005Y\u0000\u0000\u00d1\u00d3\u0005\n"+
		"\u0000\u0000\u00d2\u00d4\u0003 \u0010\u0000\u00d3\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d8\u0005\u000b\u0000\u0000\u00d6\u00d7\u0005\t\u0000\u0000"+
		"\u00d7\u00d9\u0003R)\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00db"+
		"\u0005\u000e\u0000\u0000\u00db\u00dc\u0003\"\u0011\u0000\u00dc\u00dd\u0005"+
		"\u000f\u0000\u0000\u00dd\u000b\u0001\u0000\u0000\u0000\u00de\u00e4\u0003"+
		"\u0018\f\u0000\u00df\u00e0\u0005\u000e\u0000\u0000\u00e0\u00e1\u0003*"+
		"\u0015\u0000\u00e1\u00e2\u0005\u000f\u0000\u0000\u00e2\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e3\u00de\u0001\u0000\u0000\u0000\u00e3\u00df\u0001\u0000"+
		"\u0000\u0000\u00e4\r\u0001\u0000\u0000\u0000\u00e5\u00ec\u0003R)\u0000"+
		"\u00e6\u00ec\u0003\u0010\b\u0000\u00e7\u00ec\u0003\u0012\t\u0000\u00e8"+
		"\u00ec\u00036\u001b\u0000\u00e9\u00ec\u0003D\"\u0000\u00ea\u00ec\u0003"+
		"@ \u0000\u00eb\u00e5\u0001\u0000\u0000\u0000\u00eb\u00e6\u0001\u0000\u0000"+
		"\u0000\u00eb\u00e7\u0001\u0000\u0000\u0000\u00eb\u00e8\u0001\u0000\u0000"+
		"\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ec\u000f\u0001\u0000\u0000\u0000\u00ed\u00f6\u0005\f\u0000\u0000"+
		"\u00ee\u00f3\u0003\u000e\u0007\u0000\u00ef\u00f0\u0005\u0007\u0000\u0000"+
		"\u00f0\u00f2\u0003\u000e\u0007\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f5\u0001\u0000\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f9\u0005\r\u0000\u0000\u00f9\u0011\u0001\u0000\u0000\u0000\u00fa"+
		"\u0107\u0005\u000e\u0000\u0000\u00fb\u00fc\u0005Y\u0000\u0000\u00fc\u00fd"+
		"\u0005\t\u0000\u0000\u00fd\u0104\u0003\u000e\u0007\u0000\u00fe\u00ff\u0005"+
		"\u0007\u0000\u0000\u00ff\u0100\u0005Y\u0000\u0000\u0100\u0101\u0005\t"+
		"\u0000\u0000\u0101\u0103\u0003\u000e\u0007\u0000\u0102\u00fe\u0001\u0000"+
		"\u0000\u0000\u0103\u0106\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000"+
		"\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0108\u0001\u0000"+
		"\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0107\u00fb\u0001\u0000"+
		"\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000"+
		"\u0000\u0000\u0109\u010a\u0005\u000f\u0000\u0000\u010a\u0013\u0001\u0000"+
		"\u0000\u0000\u010b\u0110\u0003\u0018\f\u0000\u010c\u0110\u0003\u001e\u000f"+
		"\u0000\u010d\u0110\u0003\u0006\u0003\u0000\u010e\u0110\u0003\n\u0005\u0000"+
		"\u010f\u010b\u0001\u0000\u0000\u0000\u010f\u010c\u0001\u0000\u0000\u0000"+
		"\u010f\u010d\u0001\u0000\u0000\u0000\u010f\u010e\u0001\u0000\u0000\u0000"+
		"\u0110\u0113\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000"+
		"\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0015\u0001\u0000\u0000\u0000"+
		"\u0113\u0111\u0001\u0000\u0000\u0000\u0114\u0115\u0005Y\u0000\u0000\u0115"+
		"\u0116\u0005\t\u0000\u0000\u0116\u0117\u0003R)\u0000\u0117\u0118\u0005"+
		"\b\u0000\u0000\u0118\u011a\u0001\u0000\u0000\u0000\u0119\u0114\u0001\u0000"+
		"\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000"+
		"\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u012f\u0001\u0000"+
		"\u0000\u0000\u011d\u011e\u0005N\u0000\u0000\u011e\u011f\u0005\u001e\u0000"+
		"\u0000\u011f\u0120\u0005Y\u0000\u0000\u0120\u0129\u0005\u0001\u0000\u0000"+
		"\u0121\u012a\u0003\u000e\u0007\u0000\u0122\u0123\u0005N\u0000\u0000\u0123"+
		"\u0124\u0005\u001e\u0000\u0000\u0124\u0127\u0005Y\u0000\u0000\u0125\u0126"+
		"\u0005\u001e\u0000\u0000\u0126\u0128\u00034\u001a\u0000\u0127\u0125\u0001"+
		"\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u012a\u0001"+
		"\u0000\u0000\u0000\u0129\u0121\u0001\u0000\u0000\u0000\u0129\u0122\u0001"+
		"\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012c\u0001"+
		"\u0000\u0000\u0000\u012b\u012d\u0005\b\u0000\u0000\u012c\u012b\u0001\u0000"+
		"\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012f\u0001\u0000"+
		"\u0000\u0000\u012e\u0119\u0001\u0000\u0000\u0000\u012e\u011d\u0001\u0000"+
		"\u0000\u0000\u012f\u0017\u0001\u0000\u0000\u0000\u0130\u0131\u0005\u001f"+
		"\u0000\u0000\u0131\u0132\u0005Y\u0000\u0000\u0132\u0136\u0005\n\u0000"+
		"\u0000\u0133\u0135\u0003\u001a\r\u0000\u0134\u0133\u0001\u0000\u0000\u0000"+
		"\u0135\u0138\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000"+
		"\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0139\u0001\u0000\u0000\u0000"+
		"\u0138\u0136\u0001\u0000\u0000\u0000\u0139\u013d\u0005\u000b\u0000\u0000"+
		"\u013a\u013b\u0005\u001f\u0000\u0000\u013b\u013d\u0005Y\u0000\u0000\u013c"+
		"\u0130\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013d"+
		"\u0019\u0001\u0000\u0000\u0000\u013e\u0142\u0005\u000e\u0000\u0000\u013f"+
		"\u0141\u0003\u001c\u000e\u0000\u0140\u013f\u0001\u0000\u0000\u0000\u0141"+
		"\u0144\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0142"+
		"\u0143\u0001\u0000\u0000\u0000\u0143\u0145\u0001\u0000\u0000\u0000\u0144"+
		"\u0142\u0001\u0000\u0000\u0000\u0145\u0146\u0005\u000f\u0000\u0000\u0146"+
		"\u001b\u0001\u0000\u0000\u0000\u0147\u015f\u0003\u0004\u0002\u0000\u0148"+
		"\u015f\u0003\n\u0005\u0000\u0149\u015f\u0003\u0006\u0003\u0000\u014a\u015f"+
		"\u0003\b\u0004\u0000\u014b\u014f\u0005\u000e\u0000\u0000\u014c\u014e\u0003"+
		"(\u0014\u0000\u014d\u014c\u0001\u0000\u0000\u0000\u014e\u0151\u0001\u0000"+
		"\u0000\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000"+
		"\u0000\u0000\u0150\u0152\u0001\u0000\u0000\u0000\u0151\u014f\u0001\u0000"+
		"\u0000\u0000\u0152\u015f\u0005\u000f\u0000\u0000\u0153\u0154\u0005Y\u0000"+
		"\u0000\u0154\u0155\u0005\t\u0000\u0000\u0155\u0156\u0005]\u0000\u0000"+
		"\u0156\u015f\u0005\u0007\u0000\u0000\u0157\u0158\u0005Y\u0000\u0000\u0158"+
		"\u0159\u0005\t\u0000\u0000\u0159\u015a\u0005\u001d\u0000\u0000\u015a\u015b"+
		"\u00036\u001b\u0000\u015b\u015c\u0005\u001d\u0000\u0000\u015c\u015d\u0005"+
		"\u0007\u0000\u0000\u015d\u015f\u0001\u0000\u0000\u0000\u015e\u0147\u0001"+
		"\u0000\u0000\u0000\u015e\u0148\u0001\u0000\u0000\u0000\u015e\u0149\u0001"+
		"\u0000\u0000\u0000\u015e\u014a\u0001\u0000\u0000\u0000\u015e\u014b\u0001"+
		"\u0000\u0000\u0000\u015e\u0153\u0001\u0000\u0000\u0000\u015e\u0157\u0001"+
		"\u0000\u0000\u0000\u015f\u001d\u0001\u0000\u0000\u0000\u0160\u0161\u0005"+
		",\u0000\u0000\u0161\u0163\u0005\n\u0000\u0000\u0162\u0164\u0003 \u0010"+
		"\u0000\u0163\u0162\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000"+
		"\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0166\u0005\u000b\u0000"+
		"\u0000\u0166\u0169\u0005\u000e\u0000\u0000\u0167\u016a\u0003\"\u0011\u0000"+
		"\u0168\u016a\u0003\u0016\u000b\u0000\u0169\u0167\u0001\u0000\u0000\u0000"+
		"\u0169\u0168\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000"+
		"\u016b\u016c\u0005\u000f\u0000\u0000\u016c\u001f\u0001\u0000\u0000\u0000"+
		"\u016d\u016f\u0007\u0003\u0000\u0000\u016e\u016d\u0001\u0000\u0000\u0000"+
		"\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000"+
		"\u0170\u0177\u0005Y\u0000\u0000\u0171\u0172\u0005\t\u0000\u0000\u0172"+
		"\u0175\u0003R)\u0000\u0173\u0174\u0005\u0001\u0000\u0000\u0174\u0176\u0003"+
		"\u000e\u0007\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0175\u0176\u0001"+
		"\u0000\u0000\u0000\u0176\u0178\u0001\u0000\u0000\u0000\u0177\u0171\u0001"+
		"\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000\u0178\u0188\u0001"+
		"\u0000\u0000\u0000\u0179\u017b\u0005\u0007\u0000\u0000\u017a\u017c\u0007"+
		"\u0003\u0000\u0000\u017b\u017a\u0001\u0000\u0000\u0000\u017b\u017c\u0001"+
		"\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u0184\u0005"+
		"Y\u0000\u0000\u017e\u017f\u0005\t\u0000\u0000\u017f\u0182\u0003R)\u0000"+
		"\u0180\u0181\u0005\u0001\u0000\u0000\u0181\u0183\u0003\u000e\u0007\u0000"+
		"\u0182\u0180\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000\u0000\u0000"+
		"\u0183\u0185\u0001\u0000\u0000\u0000\u0184\u017e\u0001\u0000\u0000\u0000"+
		"\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0187\u0001\u0000\u0000\u0000"+
		"\u0186\u0179\u0001\u0000\u0000\u0000\u0187\u018a\u0001\u0000\u0000\u0000"+
		"\u0188\u0186\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000"+
		"\u0189\u0196\u0001\u0000\u0000\u0000\u018a\u0188\u0001\u0000\u0000\u0000"+
		"\u018b\u018c\u0005\u000e\u0000\u0000\u018c\u0191\u0005Y\u0000\u0000\u018d"+
		"\u018e\u0005\u0007\u0000\u0000\u018e\u0190\u0005Y\u0000\u0000\u018f\u018d"+
		"\u0001\u0000\u0000\u0000\u0190\u0193\u0001\u0000\u0000\u0000\u0191\u018f"+
		"\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u0194"+
		"\u0001\u0000\u0000\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0194\u0196"+
		"\u0005\u000f\u0000\u0000\u0195\u016e\u0001\u0000\u0000\u0000\u0195\u018b"+
		"\u0001\u0000\u0000\u0000\u0196!\u0001\u0000\u0000\u0000\u0197\u0199\u0003"+
		"(\u0014\u0000\u0198\u0197\u0001\u0000\u0000\u0000\u0199\u019c\u0001\u0000"+
		"\u0000\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000"+
		"\u0000\u0000\u019b\u019e\u0001\u0000\u0000\u0000\u019c\u019a\u0001\u0000"+
		"\u0000\u0000\u019d\u019f\u0003$\u0012\u0000\u019e\u019d\u0001\u0000\u0000"+
		"\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f#\u0001\u0000\u0000\u0000"+
		"\u01a0\u01a8\u00059\u0000\u0000\u01a1\u01a5\u0003\u000e\u0007\u0000\u01a2"+
		"\u01a3\u0003&\u0013\u0000\u01a3\u01a4\u0003\u000e\u0007\u0000\u01a4\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a5\u01a2\u0001\u0000\u0000\u0000\u01a5\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a6\u01a9\u0001\u0000\u0000\u0000\u01a7\u01a9"+
		"\u00036\u001b\u0000\u01a8\u01a1\u0001\u0000\u0000\u0000\u01a8\u01a7\u0001"+
		"\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001"+
		"\u0000\u0000\u0000\u01aa\u01ab\u0005\b\u0000\u0000\u01ab%\u0001\u0000"+
		"\u0000\u0000\u01ac\u01ad\u0007\u0004\u0000\u0000\u01ad\'\u0001\u0000\u0000"+
		"\u0000\u01ae\u01b9\u0003\u0006\u0003\u0000\u01af\u01b9\u0003,\u0016\u0000"+
		"\u01b0\u01b9\u00030\u0018\u0000\u01b1\u01b9\u00032\u0019\u0000\u01b2\u01b9"+
		"\u00034\u001a\u0000\u01b3\u01b9\u0003T*\u0000\u01b4\u01b9\u00036\u001b"+
		"\u0000\u01b5\u01b9\u0003D\"\u0000\u01b6\u01b9\u0003$\u0012\u0000\u01b7"+
		"\u01b9\u0003\u0016\u000b\u0000\u01b8\u01ae\u0001\u0000\u0000\u0000\u01b8"+
		"\u01af\u0001\u0000\u0000\u0000\u01b8\u01b0\u0001\u0000\u0000\u0000\u01b8"+
		"\u01b1\u0001\u0000\u0000\u0000\u01b8\u01b2\u0001\u0000\u0000\u0000\u01b8"+
		"\u01b3\u0001\u0000\u0000\u0000\u01b8\u01b4\u0001\u0000\u0000\u0000\u01b8"+
		"\u01b5\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000\u01b8"+
		"\u01b7\u0001\u0000\u0000\u0000\u01b9)\u0001\u0000\u0000\u0000\u01ba\u01bc"+
		"\u0003\u0006\u0003\u0000\u01bb\u01ba\u0001\u0000\u0000\u0000\u01bc\u01bf"+
		"\u0001\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01bd\u01be"+
		"\u0001\u0000\u0000\u0000\u01be\u01c3\u0001\u0000\u0000\u0000\u01bf\u01bd"+
		"\u0001\u0000\u0000\u0000\u01c0\u01c2\u0003\n\u0005\u0000\u01c1\u01c0\u0001"+
		"\u0000\u0000\u0000\u01c2\u01c5\u0001\u0000\u0000\u0000\u01c3\u01c1\u0001"+
		"\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4+\u0001\u0000"+
		"\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c6\u01c7\u00055\u0000"+
		"\u0000\u01c7\u01c8\u0005\n\u0000\u0000\u01c8\u01c9\u0003.\u0017\u0000"+
		"\u01c9\u01ca\u0005\u000b\u0000\u0000\u01ca\u01ce\u0005\u000e\u0000\u0000"+
		"\u01cb\u01cd\u0003(\u0014\u0000\u01cc\u01cb\u0001\u0000\u0000\u0000\u01cd"+
		"\u01d0\u0001\u0000\u0000\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000\u01ce"+
		"\u01cf\u0001\u0000\u0000\u0000\u01cf\u01d1\u0001\u0000\u0000\u0000\u01d0"+
		"\u01ce\u0001\u0000\u0000\u0000\u01d1\u01db\u0005\u000f\u0000\u0000\u01d2"+
		"\u01d3\u00056\u0000\u0000\u01d3\u01d7\u0005\u000e\u0000\u0000\u01d4\u01d6"+
		"\u0003(\u0014\u0000\u01d5\u01d4\u0001\u0000\u0000\u0000\u01d6\u01d9\u0001"+
		"\u0000\u0000\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001"+
		"\u0000\u0000\u0000\u01d8\u01da\u0001\u0000\u0000\u0000\u01d9\u01d7\u0001"+
		"\u0000\u0000\u0000\u01da\u01dc\u0005\u000f\u0000\u0000\u01db\u01d2\u0001"+
		"\u0000\u0000\u0000\u01db\u01dc\u0001\u0000\u0000\u0000\u01dc-\u0001\u0000"+
		"\u0000\u0000\u01dd\u01de\u0003P(\u0000\u01de\u01df\u0007\u0005\u0000\u0000"+
		"\u01df\u01e0\u0003P(\u0000\u01e0\u01e3\u0001\u0000\u0000\u0000\u01e1\u01e3"+
		"\u0003P(\u0000\u01e2\u01dd\u0001\u0000\u0000\u0000\u01e2\u01e1\u0001\u0000"+
		"\u0000\u0000\u01e3/\u0001\u0000\u0000\u0000\u01e4\u01e5\u00057\u0000\u0000"+
		"\u01e5\u01e7\u0005\n\u0000\u0000\u01e6\u01e8\u0003\u0006\u0003\u0000\u01e7"+
		"\u01e6\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8"+
		"\u01ea\u0001\u0000\u0000\u0000\u01e9\u01eb\u0003.\u0017\u0000\u01ea\u01e9"+
		"\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb\u01ed"+
		"\u0001\u0000\u0000\u0000\u01ec\u01ee\u0005\b\u0000\u0000\u01ed\u01ec\u0001"+
		"\u0000\u0000\u0000\u01ed\u01ee\u0001\u0000\u0000\u0000\u01ee\u01f0\u0001"+
		"\u0000\u0000\u0000\u01ef\u01f1\u0003(\u0014\u0000\u01f0\u01ef\u0001\u0000"+
		"\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000"+
		"\u0000\u0000\u01f2\u01f3\u0005\u000b\u0000\u0000\u01f3\u01f7\u0005\u000e"+
		"\u0000\u0000\u01f4\u01f6\u0003(\u0014\u0000\u01f5\u01f4\u0001\u0000\u0000"+
		"\u0000\u01f6\u01f9\u0001\u0000\u0000\u0000\u01f7\u01f5\u0001\u0000\u0000"+
		"\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8\u01fa\u0001\u0000\u0000"+
		"\u0000\u01f9\u01f7\u0001\u0000\u0000\u0000\u01fa\u01fb\u0005\u000f\u0000"+
		"\u0000\u01fb1\u0001\u0000\u0000\u0000\u01fc\u01fd\u00058\u0000\u0000\u01fd"+
		"\u01fe\u0005\n\u0000\u0000\u01fe\u01ff\u0003.\u0017\u0000\u01ff\u0200"+
		"\u0005\u000b\u0000\u0000\u0200\u0204\u0005\u000e\u0000\u0000\u0201\u0203"+
		"\u0003(\u0014\u0000\u0202\u0201\u0001\u0000\u0000\u0000\u0203\u0206\u0001"+
		"\u0000\u0000\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0204\u0205\u0001"+
		"\u0000\u0000\u0000\u0205\u0207\u0001\u0000\u0000\u0000\u0206\u0204\u0001"+
		"\u0000\u0000\u0000\u0207\u0208\u0005\u000f\u0000\u0000\u02083\u0001\u0000"+
		"\u0000\u0000\u0209\u020a\u0005Y\u0000\u0000\u020a\u0213\u0005\n\u0000"+
		"\u0000\u020b\u0210\u0003P(\u0000\u020c\u020d\u0005\u0007\u0000\u0000\u020d"+
		"\u020f\u0003P(\u0000\u020e\u020c\u0001\u0000\u0000\u0000\u020f\u0212\u0001"+
		"\u0000\u0000\u0000\u0210\u020e\u0001\u0000\u0000\u0000\u0210\u0211\u0001"+
		"\u0000\u0000\u0000\u0211\u0214\u0001\u0000\u0000\u0000\u0212\u0210\u0001"+
		"\u0000\u0000\u0000\u0213\u020b\u0001\u0000\u0000\u0000\u0213\u0214\u0001"+
		"\u0000\u0000\u0000\u0214\u0215\u0001\u0000\u0000\u0000\u0215\u0216\u0005"+
		"\u000b\u0000\u0000\u0216\u0217\u0005\b\u0000\u0000\u02175\u0001\u0000"+
		"\u0000\u0000\u0218\u021c\u00038\u001c\u0000\u0219\u021b\u0003>\u001f\u0000"+
		"\u021a\u0219\u0001\u0000\u0000\u0000\u021b\u021e\u0001\u0000\u0000\u0000"+
		"\u021c\u021a\u0001\u0000\u0000\u0000\u021c\u021d\u0001\u0000\u0000\u0000"+
		"\u021d\u021f\u0001\u0000\u0000\u0000\u021e\u021c\u0001\u0000\u0000\u0000"+
		"\u021f\u0220\u0003:\u001d\u0000\u0220\u0223\u0001\u0000\u0000\u0000\u0221"+
		"\u0223\u0003<\u001e\u0000\u0222\u0218\u0001\u0000\u0000\u0000\u0222\u0221"+
		"\u0001\u0000\u0000\u0000\u02237\u0001\u0000\u0000\u0000\u0224\u0225\u0005"+
		"\u0010\u0000\u0000\u0225\u0227\u0005Y\u0000\u0000\u0226\u0228\u0003B!"+
		"\u0000\u0227\u0226\u0001\u0000\u0000\u0000\u0227\u0228\u0001\u0000\u0000"+
		"\u0000\u0228\u0229\u0001\u0000\u0000\u0000\u0229\u022a\u0005\u0011\u0000"+
		"\u0000\u022a9\u0001\u0000\u0000\u0000\u022b\u022c\u0005\u0010\u0000\u0000"+
		"\u022c\u022d\u0005\u0005\u0000\u0000\u022d\u022e\u0005Y\u0000\u0000\u022e"+
		"\u022f\u0005\u0011\u0000\u0000\u022f;\u0001\u0000\u0000\u0000\u0230\u0231"+
		"\u0005\u0010\u0000\u0000\u0231\u0233\u0005Y\u0000\u0000\u0232\u0234\u0003"+
		"B!\u0000\u0233\u0232\u0001\u0000\u0000\u0000\u0233\u0234\u0001\u0000\u0000"+
		"\u0000\u0234\u0235\u0001\u0000\u0000\u0000\u0235\u0236\u0005 \u0000\u0000"+
		"\u0236=\u0001\u0000\u0000\u0000\u0237\u023b\u00036\u001b\u0000\u0238\u023b"+
		"\u0003@ \u0000\u0239\u023b\u0005Y\u0000\u0000\u023a\u0237\u0001\u0000"+
		"\u0000\u0000\u023a\u0238\u0001\u0000\u0000\u0000\u023a\u0239\u0001\u0000"+
		"\u0000\u0000\u023b?\u0001\u0000\u0000\u0000\u023c\u023d\u0005!\u0000\u0000"+
		"\u023d\u023e\u0003P(\u0000\u023e\u023f\u0005\"\u0000\u0000\u023fA\u0001"+
		"\u0000\u0000\u0000\u0240\u0246\u0003D\"\u0000\u0241\u0246\u0003H$\u0000"+
		"\u0242\u0246\u0003J%\u0000\u0243\u0246\u0003L&\u0000\u0244\u0246\u0003"+
		"N\'\u0000\u0245\u0240\u0001\u0000\u0000\u0000\u0245\u0241\u0001\u0000"+
		"\u0000\u0000\u0245\u0242\u0001\u0000\u0000\u0000\u0245\u0243\u0001\u0000"+
		"\u0000\u0000\u0245\u0244\u0001\u0000\u0000\u0000\u0246\u0247\u0001\u0000"+
		"\u0000\u0000\u0247\u0245\u0001\u0000\u0000\u0000\u0247\u0248\u0001\u0000"+
		"\u0000\u0000\u0248C\u0001\u0000\u0000\u0000\u0249\u024a\u0005\u0004\u0000"+
		"\u0000\u024a\u024b\u0003F#\u0000\u024b\u024c\u0005\u0001\u0000\u0000\u024c"+
		"\u024d\u0005]\u0000\u0000\u024dE\u0001\u0000\u0000\u0000\u024e\u024f\u0007"+
		"\u0006\u0000\u0000\u024fG\u0001\u0000\u0000\u0000\u0250\u0251\u0005Y\u0000"+
		"\u0000\u0251\u0252\u0005\u0001\u0000\u0000\u0252\u0253\u0005]\u0000\u0000"+
		"\u0253I\u0001\u0000\u0000\u0000\u0254\u0255\u0005\n\u0000\u0000\u0255"+
		"\u0256\u0005Y\u0000\u0000\u0256\u0257\u0005\u000b\u0000\u0000\u0257\u0258"+
		"\u0005\u0001\u0000\u0000\u0258\u0259\u0005]\u0000\u0000\u0259K\u0001\u0000"+
		"\u0000\u0000\u025a\u025b\u0005\f\u0000\u0000\u025b\u025c\u0005Y\u0000"+
		"\u0000\u025c\u025d\u0005\r\u0000\u0000\u025d\u0260\u0005\u0001\u0000\u0000"+
		"\u025e\u0261\u0005]\u0000\u0000\u025f\u0261\u0003@ \u0000\u0260\u025e"+
		"\u0001\u0000\u0000\u0000\u0260\u025f\u0001\u0000\u0000\u0000\u0261M\u0001"+
		"\u0000\u0000\u0000\u0262\u0263\u0005$\u0000\u0000\u0263\u0264\u0005\u0001"+
		"\u0000\u0000\u0264\u0265\u0005]\u0000\u0000\u0265O\u0001\u0000\u0000\u0000"+
		"\u0266\u0267\u0006(\uffff\uffff\u0000\u0267\u0274\u0005Y\u0000\u0000\u0268"+
		"\u0269\u0005Y\u0000\u0000\u0269\u026a\u0005\u001e\u0000\u0000\u026a\u0274"+
		"\u0005Y\u0000\u0000\u026b\u0274\u0005]\u0000\u0000\u026c\u0274\u0005Z"+
		"\u0000\u0000\u026d\u0274\u0005[\u0000\u0000\u026e\u0274\u0005\\\u0000"+
		"\u0000\u026f\u0274\u0003\u000e\u0007\u0000\u0270\u0274\u00034\u001a\u0000"+
		"\u0271\u0274\u0003\u0010\b\u0000\u0272\u0274\u0003\u0012\t\u0000\u0273"+
		"\u0266\u0001\u0000\u0000\u0000\u0273\u0268\u0001\u0000\u0000\u0000\u0273"+
		"\u026b\u0001\u0000\u0000\u0000\u0273\u026c\u0001\u0000\u0000\u0000\u0273"+
		"\u026d\u0001\u0000\u0000\u0000\u0273\u026e\u0001\u0000\u0000\u0000\u0273"+
		"\u026f\u0001\u0000\u0000\u0000\u0273\u0270\u0001\u0000\u0000\u0000\u0273"+
		"\u0271\u0001\u0000\u0000\u0000\u0273\u0272\u0001\u0000\u0000\u0000\u0274"+
		"\u027b\u0001\u0000\u0000\u0000\u0275\u0276\n\u0001\u0000\u0000\u0276\u0277"+
		"\u0003&\u0013\u0000\u0277\u0278\u0003P(\u0002\u0278\u027a\u0001\u0000"+
		"\u0000\u0000\u0279\u0275\u0001\u0000\u0000\u0000\u027a\u027d\u0001\u0000"+
		"\u0000\u0000\u027b\u0279\u0001\u0000\u0000\u0000\u027b\u027c\u0001\u0000"+
		"\u0000\u0000\u027cQ\u0001\u0000\u0000\u0000\u027d\u027b\u0001\u0000\u0000"+
		"\u0000\u027e\u027f\u0007\u0007\u0000\u0000\u027fS\u0001\u0000\u0000\u0000"+
		"\u0280\u0281\u00050\u0000\u0000\u0281\u0282\u0005\u001e\u0000\u0000\u0282"+
		"\u0283\u00051\u0000\u0000\u0283\u0284\u0005\n\u0000\u0000\u0284\u0285"+
		"\u0003P(\u0000\u0285\u0286\u0005\u000b\u0000\u0000\u0286\u0287\u0005\b"+
		"\u0000\u0000\u0287U\u0001\u0000\u0000\u0000RY`bfrux\u0080\u0087\u008f"+
		"\u0092\u0095\u0098\u00a0\u00a5\u00ab\u00b2\u00b6\u00bc\u00c4\u00c7\u00ce"+
		"\u00d3\u00d8\u00e3\u00eb\u00f3\u00f6\u0104\u0107\u010f\u0111\u011b\u0127"+
		"\u0129\u012c\u012e\u0136\u013c\u0142\u014f\u015e\u0163\u0169\u016e\u0175"+
		"\u0177\u017b\u0182\u0184\u0188\u0191\u0195\u019a\u019e\u01a5\u01a8\u01b8"+
		"\u01bd\u01c3\u01ce\u01d7\u01db\u01e2\u01e7\u01ea\u01ed\u01f0\u01f7\u0204"+
		"\u0210\u0213\u021c\u0222\u0227\u0233\u023a\u0245\u0247\u0260\u0273\u027b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}