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
		MINUSMINUS=26, SQ=27, DQ=28, DOT=29, AT=30, SLASHGREATERTHAN=31, DOUBLELEFTCURLY=32, 
		DOUBLERIGHTCURLY=33, COMPONENT=34, TEMPLATEURL=35, SELECTOR=36, CLASS=37, 
		INPUT=38, OUTPUT=39, PROPERTY=40, IMPORT=41, EXPORT=42, DEFAULT=43, FROM=44, 
		CONSTRUCTOR=45, EXTENDS=46, IMPLEMENTS=47, FUNCTION=48, CONSOLE=49, LOG=50, 
		VAR=51, LET=52, CONST=53, IF=54, ELSE=55, FOR=56, WHILE=57, RETURN=58, 
		NULL=59, ANY=60, SWITCH=61, CASE=62, DO=63, BREAK=64, CONTINUE=65, TRY=66, 
		CATCH=67, FINALLY=68, THROWS=69, ASYNC=70, AWAIT=71, TYPE=72, ENUM=73, 
		INTERFACE=74, PUBLIC=75, PRIVATE=76, PROTECTED=77, ONINIT=78, ONCHANGES=79, 
		ONDESTROY=80, AS=81, TEMPLATE_LITERAL=82, ID=83, INT=84, DOUBLE=85, BOOLEAN=86, 
		STRING=87, NGIF=88, NGSWITCH=89, NGFOR=90, NGSTYLE=91, NGCLASS=92, WS=93, 
		COMMENT=94, BLOCK_COMMENT=95;
	public static final int
		RULE_program = 0, RULE_importStatement = 1, RULE_exportStatement = 2, 
		RULE_variableDeclaration = 3, RULE_classDeclaration = 4, RULE_functionDeclaration = 5, 
		RULE_componentDeclaration = 6, RULE_value = 7, RULE_array = 8, RULE_object = 9, 
		RULE_classBody = 10, RULE_constructorDeclaration = 11, RULE_decorator = 12, 
		RULE_decoratorArguments = 13, RULE_decoratorArgument = 14, RULE_argumentContent = 15, 
		RULE_parameters = 16, RULE_functionBody = 17, RULE_returnStatement = 18, 
		RULE_statement = 19, RULE_componentBody = 20, RULE_ifStatement = 21, RULE_condition = 22, 
		RULE_forStatement = 23, RULE_whileStatement = 24, RULE_callFunction = 25, 
		RULE_jsxElement = 26, RULE_openingTag = 27, RULE_closingTag = 28, RULE_selfClosingTag = 29, 
		RULE_jsxContent = 30, RULE_interpolation = 31, RULE_jsxAttributes = 32, 
		RULE_angularDirective = 33, RULE_jsxAttribute = 34, RULE_jsxEvent = 35, 
		RULE_jsxBinding = 36, RULE_jsxClass = 37, RULE_expression = 38, RULE_shortIf = 39, 
		RULE_type = 40, RULE_printStatement = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "importStatement", "exportStatement", "variableDeclaration", 
			"classDeclaration", "functionDeclaration", "componentDeclaration", "value", 
			"array", "object", "classBody", "constructorDeclaration", "decorator", 
			"decoratorArguments", "decoratorArgument", "argumentContent", "parameters", 
			"functionBody", "returnStatement", "statement", "componentBody", "ifStatement", 
			"condition", "forStatement", "whileStatement", "callFunction", "jsxElement", 
			"openingTag", "closingTag", "selfClosingTag", "jsxContent", "interpolation", 
			"jsxAttributes", "angularDirective", "jsxAttribute", "jsxEvent", "jsxBinding", 
			"jsxClass", "expression", "shortIf", "type", "printStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'+'", "'-'", "'*'", "'/'", "'%'", "','", "';'", "':'", 
			"'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", "'>'", "'<='", "'>='", 
			"'=>'", "'=='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'''", "'\"'", 
			"'.'", "'@'", "'/>'", "'{{'", "'}}'", "'component'", "'templateUrl'", 
			"'selector'", "'class'", "'input'", "'output'", "'property'", "'import'", 
			"'export'", "'default'", "'from'", "'constructor'", "'extends'", "'implements'", 
			"'function'", "'console'", "'log'", "'var'", "'let'", "'const'", "'if'", 
			"'else'", "'for'", "'while'", "'return'", "'null'", "'any'", "'switch'", 
			"'case'", "'do'", "'break'", "'continue'", "'try'", "'catch'", "'finally'", 
			"'throws'", "'async'", "'await'", "'type'", "'enum'", "'interface'", 
			"'public'", "'private'", "'protected'", "'ngOnInit'", "'ngOnChanges'", 
			"'ngOnDestroy'", "'as'", null, null, null, null, null, null, "'ngIf'", 
			"'ngSwitch'", "'ngFor'", "'ngStyle'", "'ngClass'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EQUAL", "PLUS", "MINUS", "STAR", "DIVISION", "PERCENT", "COMMA", 
			"SEMI", "COLON", "LEFTPAREN", "RIGHTPAREN", "LEFTBRACKET", "RIGHTBRACKET", 
			"LEFTCURLY", "RIGHTCURLY", "LESSTHAN", "GREATERTHAN", "LESSEQUAL", "GREATEREQUAL", 
			"ARROW", "EQ", "NEQ", "AND", "OR", "PLUSPLUS", "MINUSMINUS", "SQ", "DQ", 
			"DOT", "AT", "SLASHGREATERTHAN", "DOUBLELEFTCURLY", "DOUBLERIGHTCURLY", 
			"COMPONENT", "TEMPLATEURL", "SELECTOR", "CLASS", "INPUT", "OUTPUT", "PROPERTY", 
			"IMPORT", "EXPORT", "DEFAULT", "FROM", "CONSTRUCTOR", "EXTENDS", "IMPLEMENTS", 
			"FUNCTION", "CONSOLE", "LOG", "VAR", "LET", "CONST", "IF", "ELSE", "FOR", 
			"WHILE", "RETURN", "NULL", "ANY", "SWITCH", "CASE", "DO", "BREAK", "CONTINUE", 
			"TRY", "CATCH", "FINALLY", "THROWS", "ASYNC", "AWAIT", "TYPE", "ENUM", 
			"INTERFACE", "PUBLIC", "PRIVATE", "PROTECTED", "ONINIT", "ONCHANGES", 
			"ONDESTROY", "AS", "TEMPLATE_LITERAL", "ID", "INT", "DOUBLE", "BOOLEAN", 
			"STRING", "NGIF", "NGSWITCH", "NGFOR", "NGSTYLE", "NGCLASS", "WS", "COMMENT", 
			"BLOCK_COMMENT"
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
		public TerminalNode EOF() { return getToken(AngularParser.EOF, 0); }
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
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IMPORT) {
					{
					{
					setState(84);
					importStatement();
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16044212185219072L) != 0)) {
					{
					setState(94);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case VAR:
					case LET:
					case CONST:
						{
						setState(90);
						variableDeclaration();
						}
						break;
					case CLASS:
						{
						setState(91);
						classDeclaration();
						}
						break;
					case FUNCTION:
						{
						setState(92);
						functionDeclaration();
						}
						break;
					case LEFTCURLY:
					case AT:
						{
						setState(93);
						componentDeclaration();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXPORT) {
					{
					setState(99);
					exportStatement();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(EOF);
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
			setState(105);
			match(IMPORT);
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(106);
				match(ID);
				}
				break;
			case LEFTCURLY:
				{
				setState(107);
				match(LEFTCURLY);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(108);
					match(ID);
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(109);
						match(COMMA);
						setState(110);
						match(ID);
						}
						}
						setState(115);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(118);
				match(RIGHTCURLY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(121);
			match(FROM);
			setState(122);
			match(STRING);
			setState(123);
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
			setState(125);
			match(EXPORT);
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DEFAULT) {
					{
					setState(126);
					match(DEFAULT);
					}
				}

				setState(134);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(129);
					classDeclaration();
					}
					break;
				case 2:
					{
					setState(130);
					variableDeclaration();
					}
					break;
				case 3:
					{
					setState(131);
					functionDeclaration();
					}
					break;
				case 4:
					{
					setState(132);
					componentDeclaration();
					}
					break;
				case 5:
					{
					setState(133);
					object();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(136);
				match(LEFTCURLY);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(137);
					match(ID);
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(138);
						match(COMMA);
						setState(139);
						match(ID);
						}
						}
						setState(144);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(147);
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
			setState(150);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15762598695796736L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(151);
			match(ID);
			setState(152);
			match(EQUAL);
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(153);
				value();
				}
				break;
			case 2:
				{
				setState(154);
				array();
				}
				break;
			case 3:
				{
				setState(155);
				object();
				}
				break;
			case 4:
				{
				setState(156);
				functionDeclaration();
				}
				break;
			}
			setState(159);
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
			setState(161);
			match(CLASS);
			setState(162);
			match(ID);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(163);
				match(EXTENDS);
				setState(164);
				match(ID);
				}
			}

			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(167);
				match(IMPLEMENTS);
				setState(168);
				match(ID);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(169);
					match(COMMA);
					setState(170);
					match(ID);
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(178);
			match(LEFTCURLY);
			setState(179);
			classBody();
			setState(180);
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
			setState(182);
			match(FUNCTION);
			setState(183);
			match(ID);
			setState(184);
			match(LEFTPAREN);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTCURLY || _la==ID) {
				{
				setState(185);
				parameters();
				}
			}

			setState(188);
			match(RIGHTPAREN);
			setState(189);
			match(LEFTCURLY);
			setState(190);
			functionBody();
			setState(191);
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
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				decorator();
				}
				break;
			case LEFTCURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(LEFTCURLY);
				setState(195);
				componentBody();
				setState(196);
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
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(STRING);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(INT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				match(DOUBLE);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				match(BOOLEAN);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(204);
				match(NULL);
				}
				break;
			case LEFTBRACKET:
				enterOuterAlt(_localctx, 6);
				{
				setState(205);
				array();
				}
				break;
			case LEFTCURLY:
				enterOuterAlt(_localctx, 7);
				{
				setState(206);
				object();
				}
				break;
			case LESSTHAN:
				enterOuterAlt(_localctx, 8);
				{
				setState(207);
				jsxElement();
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 9);
				{
				setState(208);
				angularDirective();
				}
				break;
			case DOUBLELEFTCURLY:
				enterOuterAlt(_localctx, 10);
				{
				setState(209);
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
			setState(212);
			match(LEFTBRACKET);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576460756598476816L) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & 15L) != 0)) {
				{
				setState(213);
				value();
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(214);
					match(COMMA);
					setState(215);
					value();
					}
					}
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(223);
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
			setState(225);
			match(LEFTCURLY);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(226);
				match(ID);
				setState(227);
				match(COLON);
				setState(228);
				value();
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(229);
					match(COMMA);
					setState(230);
					match(ID);
					setState(231);
					match(COLON);
					setState(232);
					value();
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(240);
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
		public List<TerminalNode> ID() { return getTokens(AngularParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AngularParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(AngularParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(AngularParser.COLON, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(AngularParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(AngularParser.SEMI, i);
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
			setState(255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				decorator();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				functionDeclaration();
				}
				break;
			case VAR:
			case LET:
			case CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				variableDeclaration();
				}
				break;
			case CONSTRUCTOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				constructorDeclaration();
				}
				break;
			case RIGHTCURLY:
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(246);
					match(ID);
					setState(247);
					match(COLON);
					setState(248);
					match(ID);
					setState(249);
					match(SEMI);
					}
					}
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
			setState(257);
			match(CONSTRUCTOR);
			setState(258);
			match(LEFTPAREN);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTCURLY || _la==ID) {
				{
				setState(259);
				parameters();
				}
			}

			setState(262);
			match(RIGHTPAREN);
			setState(263);
			match(LEFTCURLY);
			setState(264);
			functionBody();
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
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(AT);
				setState(268);
				match(ID);
				setState(269);
				match(LEFTPAREN);
				setState(271);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(270);
					decoratorArguments();
					}
					break;
				}
				setState(273);
				match(RIGHTPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(AT);
				setState(275);
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
		public List<DecoratorArgumentContext> decoratorArgument() {
			return getRuleContexts(DecoratorArgumentContext.class);
		}
		public DecoratorArgumentContext decoratorArgument(int i) {
			return getRuleContext(DecoratorArgumentContext.class,i);
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
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEFTCURLY) {
				{
				{
				setState(278);
				decoratorArgument();
				}
				}
				setState(283);
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
	public static class DecoratorArgumentContext extends ParserRuleContext {
		public TerminalNode LEFTCURLY() { return getToken(AngularParser.LEFTCURLY, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(AngularParser.RIGHTCURLY, 0); }
		public List<ArgumentContentContext> argumentContent() {
			return getRuleContexts(ArgumentContentContext.class);
		}
		public ArgumentContentContext argumentContent(int i) {
			return getRuleContext(ArgumentContentContext.class,i);
		}
		public DecoratorArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decoratorArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDecoratorArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDecoratorArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDecoratorArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorArgumentContext decoratorArgument() throws RecognitionException {
		DecoratorArgumentContext _localctx = new DecoratorArgumentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_decoratorArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(LEFTCURLY);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16048712237203456L) != 0)) {
				{
				{
				setState(285);
				argumentContent();
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(291);
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
		public TerminalNode SELECTOR() { return getToken(AngularParser.SELECTOR, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode COMMA() { return getToken(AngularParser.COMMA, 0); }
		public TerminalNode TEMPLATEURL() { return getToken(AngularParser.TEMPLATEURL, 0); }
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
		enterRule(_localctx, 30, RULE_argumentContent);
		int _la;
		try {
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				exportStatement();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				functionDeclaration();
				}
				break;
			case VAR:
			case LET:
			case CONST:
				enterOuterAlt(_localctx, 3);
				{
				setState(295);
				variableDeclaration();
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 4);
				{
				setState(296);
				classDeclaration();
				}
				break;
			case LEFTCURLY:
				enterOuterAlt(_localctx, 5);
				{
				setState(297);
				match(LEFTCURLY);
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 250512729272549392L) != 0) || _la==ID) {
					{
					{
					setState(298);
					statement();
					}
					}
					setState(303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(304);
				match(RIGHTCURLY);
				}
				break;
			case SELECTOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(305);
				match(SELECTOR);
				setState(306);
				match(COLON);
				setState(307);
				match(STRING);
				setState(308);
				match(COMMA);
				}
				break;
			case TEMPLATEURL:
				enterOuterAlt(_localctx, 7);
				{
				setState(309);
				match(TEMPLATEURL);
				setState(310);
				match(COLON);
				setState(311);
				match(STRING);
				setState(312);
				match(COMMA);
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
		enterRule(_localctx, 32, RULE_parameters);
		int _la;
		try {
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				match(ID);
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(316);
					match(COLON);
					setState(317);
					type();
					}
				}

				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(320);
					match(COMMA);
					setState(321);
					match(ID);
					setState(324);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COLON) {
						{
						setState(322);
						match(COLON);
						setState(323);
						type();
						}
					}

					}
					}
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case LEFTCURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				match(LEFTCURLY);
				setState(332);
				match(ID);
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(333);
					match(COMMA);
					setState(334);
					match(ID);
					}
					}
					setState(339);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(340);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 250512729272549392L) != 0) || _la==ID) {
				{
				{
				setState(343);
				statement();
				}
				}
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(349);
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
		enterRule(_localctx, 36, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(RETURN);
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(353);
				value();
				}
				break;
			case 2:
				{
				setState(354);
				jsxElement();
				}
				break;
			}
			setState(357);
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
		public AngularDirectiveContext angularDirective() {
			return getRuleContext(AngularDirectiveContext.class,0);
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
		enterRule(_localctx, 38, RULE_statement);
		try {
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case LET:
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				variableDeclaration();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				ifStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(361);
				forStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(362);
				whileStatement();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(363);
				callFunction();
				}
				break;
			case CONSOLE:
				enterOuterAlt(_localctx, 6);
				{
				setState(364);
				printStatement();
				}
				break;
			case LESSTHAN:
				enterOuterAlt(_localctx, 7);
				{
				setState(365);
				jsxElement();
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 8);
				{
				setState(366);
				angularDirective();
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
		enterRule(_localctx, 40, RULE_componentBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15762598695796736L) != 0)) {
				{
				{
				setState(369);
				variableDeclaration();
				}
				}
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(375);
				functionDeclaration();
				}
				}
				setState(380);
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
		enterRule(_localctx, 42, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(IF);
			setState(382);
			match(LEFTPAREN);
			setState(383);
			condition();
			setState(384);
			match(RIGHTPAREN);
			setState(385);
			match(LEFTCURLY);
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 250512729272549392L) != 0) || _la==ID) {
				{
				{
				setState(386);
				statement();
				}
				}
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(392);
			match(RIGHTCURLY);
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(393);
				match(ELSE);
				setState(394);
				match(LEFTCURLY);
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 250512729272549392L) != 0) || _la==ID) {
					{
					{
					setState(395);
					statement();
					}
					}
					setState(400);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(401);
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
		enterRule(_localctx, 44, RULE_condition);
		int _la;
		try {
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				expression();
				setState(405);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(406);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
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
		enterRule(_localctx, 46, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(FOR);
			setState(412);
			match(LEFTPAREN);
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(413);
				variableDeclaration();
				}
				break;
			}
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(416);
				condition();
				}
				break;
			}
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(419);
				match(SEMI);
				}
			}

			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 250512729272549392L) != 0) || _la==ID) {
				{
				setState(422);
				statement();
				}
			}

			setState(425);
			match(RIGHTPAREN);
			setState(426);
			match(LEFTCURLY);
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 250512729272549392L) != 0) || _la==ID) {
				{
				{
				setState(427);
				statement();
				}
				}
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(433);
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
		enterRule(_localctx, 48, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(WHILE);
			setState(436);
			match(LEFTPAREN);
			setState(437);
			condition();
			setState(438);
			match(RIGHTPAREN);
			setState(439);
			match(LEFTCURLY);
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 250512729272549392L) != 0) || _la==ID) {
				{
				{
				setState(440);
				statement();
				}
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(446);
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
		enterRule(_localctx, 50, RULE_callFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(ID);
			setState(449);
			match(LEFTPAREN);
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576460756598476816L) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 31L) != 0)) {
				{
				setState(450);
				expression();
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(451);
					match(COMMA);
					setState(452);
					expression();
					}
					}
					setState(457);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(460);
			match(RIGHTPAREN);
			setState(461);
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
		enterRule(_localctx, 52, RULE_jsxElement);
		try {
			int _alt;
			setState(473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				openingTag();
				setState(467);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(464);
						jsxContent();
						}
						} 
					}
					setState(469);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				setState(470);
				closingTag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
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
		public JsxAttributesContext jsxAttributes() {
			return getRuleContext(JsxAttributesContext.class,0);
		}
		public TerminalNode GREATERTHAN() { return getToken(AngularParser.GREATERTHAN, 0); }
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
		enterRule(_localctx, 54, RULE_openingTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(LESSTHAN);
			setState(476);
			match(ID);
			setState(477);
			jsxAttributes();
			setState(478);
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
		enterRule(_localctx, 56, RULE_closingTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(LESSTHAN);
			setState(481);
			match(DIVISION);
			setState(482);
			match(ID);
			setState(483);
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
		public JsxAttributesContext jsxAttributes() {
			return getRuleContext(JsxAttributesContext.class,0);
		}
		public TerminalNode SLASHGREATERTHAN() { return getToken(AngularParser.SLASHGREATERTHAN, 0); }
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
		enterRule(_localctx, 58, RULE_selfClosingTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(LESSTHAN);
			setState(486);
			match(ID);
			setState(487);
			jsxAttributes();
			setState(488);
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
		enterRule(_localctx, 60, RULE_jsxContent);
		try {
			setState(493);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LESSTHAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				jsxElement();
				}
				break;
			case DOUBLELEFTCURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				interpolation();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(492);
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
		enterRule(_localctx, 62, RULE_interpolation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(DOUBLELEFTCURLY);
			setState(496);
			expression();
			setState(497);
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
		enterRule(_localctx, 64, RULE_jsxAttributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137438958608L) != 0) || _la==ID) {
				{
				setState(504);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(499);
					angularDirective();
					}
					break;
				case ID:
					{
					setState(500);
					jsxAttribute();
					}
					break;
				case LEFTPAREN:
					{
					setState(501);
					jsxEvent();
					}
					break;
				case LEFTBRACKET:
					{
					setState(502);
					jsxBinding();
					}
					break;
				case CLASS:
					{
					setState(503);
					jsxClass();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(508);
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
	public static class AngularDirectiveContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(AngularParser.STAR, 0); }
		public TerminalNode ID() { return getToken(AngularParser.ID, 0); }
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
		enterRule(_localctx, 66, RULE_angularDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(STAR);
			setState(510);
			match(ID);
			setState(511);
			match(EQUAL);
			setState(512);
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
		enterRule(_localctx, 68, RULE_jsxAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(ID);
			setState(515);
			match(EQUAL);
			setState(516);
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
		enterRule(_localctx, 70, RULE_jsxEvent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(LEFTPAREN);
			setState(519);
			match(ID);
			setState(520);
			match(RIGHTPAREN);
			setState(521);
			match(EQUAL);
			setState(522);
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
		enterRule(_localctx, 72, RULE_jsxBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			match(LEFTBRACKET);
			setState(525);
			match(ID);
			setState(526);
			match(RIGHTBRACKET);
			setState(527);
			match(EQUAL);
			setState(530);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(528);
				match(STRING);
				}
				break;
			case DOUBLELEFTCURLY:
				{
				setState(529);
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
		enterRule(_localctx, 74, RULE_jsxClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(CLASS);
			setState(533);
			match(EQUAL);
			setState(534);
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
		enterRule(_localctx, 76, RULE_expression);
		try {
			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(536);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(537);
				match(ID);
				setState(538);
				match(DOT);
				setState(539);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(540);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(541);
				match(INT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(542);
				match(DOUBLE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(543);
				match(BOOLEAN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(544);
				value();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(545);
				callFunction();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(546);
				array();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(547);
				object();
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
		enterRule(_localctx, 78, RULE_shortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(LEFTCURLY);
			setState(551);
			condition();
			setState(552);
			match(AND);
			setState(553);
			jsxElement();
			setState(554);
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
		enterRule(_localctx, 80, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			_la = _input.LA(1);
			if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 31L) != 0)) ) {
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
		enterRule(_localctx, 82, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(CONSOLE);
			setState(559);
			match(DOT);
			setState(560);
			match(LOG);
			setState(561);
			match(LEFTPAREN);
			setState(562);
			expression();
			setState(563);
			match(RIGHTPAREN);
			setState(564);
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
		"\u0004\u0001_\u0237\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0002)\u0007)\u0001\u0000\u0005\u0000V\b\u0000\n\u0000\f\u0000"+
		"Y\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"_\b\u0000\n\u0000\f\u0000b\t\u0000\u0001\u0000\u0003\u0000e\b\u0000\u0001"+
		"\u0000\u0003\u0000h\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001p\b\u0001\n\u0001\f\u0001s\t"+
		"\u0001\u0003\u0001u\b\u0001\u0001\u0001\u0003\u0001x\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u0080\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002\u0087\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002\u008d\b\u0002\n\u0002\f\u0002\u0090\t\u0002\u0003\u0002\u0092"+
		"\b\u0002\u0001\u0002\u0003\u0002\u0095\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u009e\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u00a6\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004\u00ac\b\u0004\n\u0004\f\u0004\u00af\t\u0004\u0003"+
		"\u0004\u00b1\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00bb\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00c7\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00d3\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0005\b\u00d9\b\b\n\b\f\b\u00dc\t\b\u0003\b"+
		"\u00de\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\t\u00ea\b\t\n\t\f\t\u00ed\t\t\u0003\t\u00ef\b"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u00fb\b\n\n\n\f\n\u00fe\t\n\u0003\n\u0100\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0105\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u0110\b\f\u0001\f\u0001\f\u0001\f\u0003\f\u0115\b\f\u0001\r"+
		"\u0005\r\u0118\b\r\n\r\f\r\u011b\t\r\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u011f\b\u000e\n\u000e\f\u000e\u0122\t\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u012c\b\u000f\n\u000f\f\u000f\u012f\t\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u013a\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u013f\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u0145\b\u0010\u0005\u0010\u0147\b\u0010\n\u0010\f\u0010\u014a"+
		"\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0150"+
		"\b\u0010\n\u0010\f\u0010\u0153\t\u0010\u0001\u0010\u0003\u0010\u0156\b"+
		"\u0010\u0001\u0011\u0005\u0011\u0159\b\u0011\n\u0011\f\u0011\u015c\t\u0011"+
		"\u0001\u0011\u0003\u0011\u015f\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u0164\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u0170\b\u0013\u0001\u0014\u0005\u0014\u0173\b\u0014\n\u0014"+
		"\f\u0014\u0176\t\u0014\u0001\u0014\u0005\u0014\u0179\b\u0014\n\u0014\f"+
		"\u0014\u017c\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u0184\b\u0015\n\u0015\f\u0015\u0187\t\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u018d\b\u0015"+
		"\n\u0015\f\u0015\u0190\t\u0015\u0001\u0015\u0003\u0015\u0193\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u019a"+
		"\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u019f\b\u0017"+
		"\u0001\u0017\u0003\u0017\u01a2\b\u0017\u0001\u0017\u0003\u0017\u01a5\b"+
		"\u0017\u0001\u0017\u0003\u0017\u01a8\b\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u01ad\b\u0017\n\u0017\f\u0017\u01b0\t\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0005\u0018\u01ba\b\u0018\n\u0018\f\u0018\u01bd\t\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u01c6\b\u0019\n\u0019\f\u0019\u01c9\t\u0019\u0003\u0019"+
		"\u01cb\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0005\u001a\u01d2\b\u001a\n\u001a\f\u001a\u01d5\t\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u01da\b\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01ee\b\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0005 \u01f9\b \n \f \u01fc\t \u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u0213\b$\u0001%\u0001"+
		"%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0003&\u0225\b&\u0001\'\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0000\u0000*\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246"+
		"8:<>@BDFHJLNPR\u0000\u0003\u0001\u000035\u0001\u0000\u0017\u0018\u0001"+
		"\u0000SW\u0275\u0000g\u0001\u0000\u0000\u0000\u0002i\u0001\u0000\u0000"+
		"\u0000\u0004}\u0001\u0000\u0000\u0000\u0006\u0096\u0001\u0000\u0000\u0000"+
		"\b\u00a1\u0001\u0000\u0000\u0000\n\u00b6\u0001\u0000\u0000\u0000\f\u00c6"+
		"\u0001\u0000\u0000\u0000\u000e\u00d2\u0001\u0000\u0000\u0000\u0010\u00d4"+
		"\u0001\u0000\u0000\u0000\u0012\u00e1\u0001\u0000\u0000\u0000\u0014\u00ff"+
		"\u0001\u0000\u0000\u0000\u0016\u0101\u0001\u0000\u0000\u0000\u0018\u0114"+
		"\u0001\u0000\u0000\u0000\u001a\u0119\u0001\u0000\u0000\u0000\u001c\u011c"+
		"\u0001\u0000\u0000\u0000\u001e\u0139\u0001\u0000\u0000\u0000 \u0155\u0001"+
		"\u0000\u0000\u0000\"\u015a\u0001\u0000\u0000\u0000$\u0160\u0001\u0000"+
		"\u0000\u0000&\u016f\u0001\u0000\u0000\u0000(\u0174\u0001\u0000\u0000\u0000"+
		"*\u017d\u0001\u0000\u0000\u0000,\u0199\u0001\u0000\u0000\u0000.\u019b"+
		"\u0001\u0000\u0000\u00000\u01b3\u0001\u0000\u0000\u00002\u01c0\u0001\u0000"+
		"\u0000\u00004\u01d9\u0001\u0000\u0000\u00006\u01db\u0001\u0000\u0000\u0000"+
		"8\u01e0\u0001\u0000\u0000\u0000:\u01e5\u0001\u0000\u0000\u0000<\u01ed"+
		"\u0001\u0000\u0000\u0000>\u01ef\u0001\u0000\u0000\u0000@\u01fa\u0001\u0000"+
		"\u0000\u0000B\u01fd\u0001\u0000\u0000\u0000D\u0202\u0001\u0000\u0000\u0000"+
		"F\u0206\u0001\u0000\u0000\u0000H\u020c\u0001\u0000\u0000\u0000J\u0214"+
		"\u0001\u0000\u0000\u0000L\u0224\u0001\u0000\u0000\u0000N\u0226\u0001\u0000"+
		"\u0000\u0000P\u022c\u0001\u0000\u0000\u0000R\u022e\u0001\u0000\u0000\u0000"+
		"TV\u0003\u0002\u0001\u0000UT\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000"+
		"\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000X`\u0001\u0000"+
		"\u0000\u0000YW\u0001\u0000\u0000\u0000Z_\u0003\u0006\u0003\u0000[_\u0003"+
		"\b\u0004\u0000\\_\u0003\n\u0005\u0000]_\u0003\f\u0006\u0000^Z\u0001\u0000"+
		"\u0000\u0000^[\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^]\u0001"+
		"\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000"+
		"`a\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000"+
		"\u0000ce\u0003\u0004\u0002\u0000dc\u0001\u0000\u0000\u0000de\u0001\u0000"+
		"\u0000\u0000eh\u0001\u0000\u0000\u0000fh\u0005\u0000\u0000\u0001gW\u0001"+
		"\u0000\u0000\u0000gf\u0001\u0000\u0000\u0000h\u0001\u0001\u0000\u0000"+
		"\u0000iw\u0005)\u0000\u0000jx\u0005S\u0000\u0000kt\u0005\u000e\u0000\u0000"+
		"lq\u0005S\u0000\u0000mn\u0005\u0007\u0000\u0000np\u0005S\u0000\u0000o"+
		"m\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000"+
		"\u0000qr\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000"+
		"\u0000\u0000tl\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0001"+
		"\u0000\u0000\u0000vx\u0005\u000f\u0000\u0000wj\u0001\u0000\u0000\u0000"+
		"wk\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0005,\u0000\u0000"+
		"z{\u0005W\u0000\u0000{|\u0005\b\u0000\u0000|\u0003\u0001\u0000\u0000\u0000"+
		"}\u0094\u0005*\u0000\u0000~\u0080\u0005+\u0000\u0000\u007f~\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0086\u0001\u0000"+
		"\u0000\u0000\u0081\u0087\u0003\b\u0004\u0000\u0082\u0087\u0003\u0006\u0003"+
		"\u0000\u0083\u0087\u0003\n\u0005\u0000\u0084\u0087\u0003\f\u0006\u0000"+
		"\u0085\u0087\u0003\u0012\t\u0000\u0086\u0081\u0001\u0000\u0000\u0000\u0086"+
		"\u0082\u0001\u0000\u0000\u0000\u0086\u0083\u0001\u0000\u0000\u0000\u0086"+
		"\u0084\u0001\u0000\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087"+
		"\u0095\u0001\u0000\u0000\u0000\u0088\u0091\u0005\u000e\u0000\u0000\u0089"+
		"\u008e\u0005S\u0000\u0000\u008a\u008b\u0005\u0007\u0000\u0000\u008b\u008d"+
		"\u0005S\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u0090\u0001"+
		"\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001"+
		"\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001"+
		"\u0000\u0000\u0000\u0091\u0089\u0001\u0000\u0000\u0000\u0091\u0092\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0095\u0005"+
		"\u000f\u0000\u0000\u0094\u007f\u0001\u0000\u0000\u0000\u0094\u0088\u0001"+
		"\u0000\u0000\u0000\u0095\u0005\u0001\u0000\u0000\u0000\u0096\u0097\u0007"+
		"\u0000\u0000\u0000\u0097\u0098\u0005S\u0000\u0000\u0098\u009d\u0005\u0001"+
		"\u0000\u0000\u0099\u009e\u0003\u000e\u0007\u0000\u009a\u009e\u0003\u0010"+
		"\b\u0000\u009b\u009e\u0003\u0012\t\u0000\u009c\u009e\u0003\n\u0005\u0000"+
		"\u009d\u0099\u0001\u0000\u0000\u0000\u009d\u009a\u0001\u0000\u0000\u0000"+
		"\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009c\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\b\u0000\u0000\u00a0"+
		"\u0007\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005%\u0000\u0000\u00a2\u00a5"+
		"\u0005S\u0000\u0000\u00a3\u00a4\u0005.\u0000\u0000\u00a4\u00a6\u0005S"+
		"\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a6\u00b0\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005/\u0000"+
		"\u0000\u00a8\u00ad\u0005S\u0000\u0000\u00a9\u00aa\u0005\u0007\u0000\u0000"+
		"\u00aa\u00ac\u0005S\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac"+
		"\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af"+
		"\u00ad\u0001\u0000\u0000\u0000\u00b0\u00a7\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u0005\u000e\u0000\u0000\u00b3\u00b4\u0003\u0014\n\u0000\u00b4\u00b5"+
		"\u0005\u000f\u0000\u0000\u00b5\t\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005"+
		"0\u0000\u0000\u00b7\u00b8\u0005S\u0000\u0000\u00b8\u00ba\u0005\n\u0000"+
		"\u0000\u00b9\u00bb\u0003 \u0010\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000"+
		"\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000"+
		"\u00bc\u00bd\u0005\u000b\u0000\u0000\u00bd\u00be\u0005\u000e\u0000\u0000"+
		"\u00be\u00bf\u0003\"\u0011\u0000\u00bf\u00c0\u0005\u000f\u0000\u0000\u00c0"+
		"\u000b\u0001\u0000\u0000\u0000\u00c1\u00c7\u0003\u0018\f\u0000\u00c2\u00c3"+
		"\u0005\u000e\u0000\u0000\u00c3\u00c4\u0003(\u0014\u0000\u00c4\u00c5\u0005"+
		"\u000f\u0000\u0000\u00c5\u00c7\u0001\u0000\u0000\u0000\u00c6\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c2\u0001\u0000\u0000\u0000\u00c7\r\u0001\u0000"+
		"\u0000\u0000\u00c8\u00d3\u0005W\u0000\u0000\u00c9\u00d3\u0005T\u0000\u0000"+
		"\u00ca\u00d3\u0005U\u0000\u0000\u00cb\u00d3\u0005V\u0000\u0000\u00cc\u00d3"+
		"\u0005;\u0000\u0000\u00cd\u00d3\u0003\u0010\b\u0000\u00ce\u00d3\u0003"+
		"\u0012\t\u0000\u00cf\u00d3\u00034\u001a\u0000\u00d0\u00d3\u0003B!\u0000"+
		"\u00d1\u00d3\u0003>\u001f\u0000\u00d2\u00c8\u0001\u0000\u0000\u0000\u00d2"+
		"\u00c9\u0001\u0000\u0000\u0000\u00d2\u00ca\u0001\u0000\u0000\u0000\u00d2"+
		"\u00cb\u0001\u0000\u0000\u0000\u00d2\u00cc\u0001\u0000\u0000\u0000\u00d2"+
		"\u00cd\u0001\u0000\u0000\u0000\u00d2\u00ce\u0001\u0000\u0000\u0000\u00d2"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d3\u000f\u0001\u0000\u0000\u0000\u00d4"+
		"\u00dd\u0005\f\u0000\u0000\u00d5\u00da\u0003\u000e\u0007\u0000\u00d6\u00d7"+
		"\u0005\u0007\u0000\u0000\u00d7\u00d9\u0003\u000e\u0007\u0000\u00d8\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8"+
		"\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00de"+
		"\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u00d5"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00df"+
		"\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\r\u0000\u0000\u00e0\u0011\u0001"+
		"\u0000\u0000\u0000\u00e1\u00ee\u0005\u000e\u0000\u0000\u00e2\u00e3\u0005"+
		"S\u0000\u0000\u00e3\u00e4\u0005\t\u0000\u0000\u00e4\u00eb\u0003\u000e"+
		"\u0007\u0000\u00e5\u00e6\u0005\u0007\u0000\u0000\u00e6\u00e7\u0005S\u0000"+
		"\u0000\u00e7\u00e8\u0005\t\u0000\u0000\u00e8\u00ea\u0003\u000e\u0007\u0000"+
		"\u00e9\u00e5\u0001\u0000\u0000\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000"+
		"\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000"+
		"\u00ee\u00e2\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005\u000f\u0000\u0000"+
		"\u00f1\u0013\u0001\u0000\u0000\u0000\u00f2\u0100\u0003\u0018\f\u0000\u00f3"+
		"\u0100\u0003\n\u0005\u0000\u00f4\u0100\u0003\u0006\u0003\u0000\u00f5\u0100"+
		"\u0003\u0016\u000b\u0000\u00f6\u00f7\u0005S\u0000\u0000\u00f7\u00f8\u0005"+
		"\t\u0000\u0000\u00f8\u00f9\u0005S\u0000\u0000\u00f9\u00fb\u0005\b\u0000"+
		"\u0000\u00fa\u00f6\u0001\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000"+
		"\u0000\u00fd\u0100\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000"+
		"\u0000\u00ff\u00f2\u0001\u0000\u0000\u0000\u00ff\u00f3\u0001\u0000\u0000"+
		"\u0000\u00ff\u00f4\u0001\u0000\u0000\u0000\u00ff\u00f5\u0001\u0000\u0000"+
		"\u0000\u00ff\u00fc\u0001\u0000\u0000\u0000\u0100\u0015\u0001\u0000\u0000"+
		"\u0000\u0101\u0102\u0005-\u0000\u0000\u0102\u0104\u0005\n\u0000\u0000"+
		"\u0103\u0105\u0003 \u0010\u0000\u0104\u0103\u0001\u0000\u0000\u0000\u0104"+
		"\u0105\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106"+
		"\u0107\u0005\u000b\u0000\u0000\u0107\u0108\u0005\u000e\u0000\u0000\u0108"+
		"\u0109\u0003\"\u0011\u0000\u0109\u010a\u0005\u000f\u0000\u0000\u010a\u0017"+
		"\u0001\u0000\u0000\u0000\u010b\u010c\u0005\u001e\u0000\u0000\u010c\u010d"+
		"\u0005S\u0000\u0000\u010d\u010f\u0005\n\u0000\u0000\u010e\u0110\u0003"+
		"\u001a\r\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000"+
		"\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0115\u0005\u000b"+
		"\u0000\u0000\u0112\u0113\u0005\u001e\u0000\u0000\u0113\u0115\u0005S\u0000"+
		"\u0000\u0114\u010b\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000"+
		"\u0000\u0115\u0019\u0001\u0000\u0000\u0000\u0116\u0118\u0003\u001c\u000e"+
		"\u0000\u0117\u0116\u0001\u0000\u0000\u0000\u0118\u011b\u0001\u0000\u0000"+
		"\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000"+
		"\u0000\u011a\u001b\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000"+
		"\u0000\u011c\u0120\u0005\u000e\u0000\u0000\u011d\u011f\u0003\u001e\u000f"+
		"\u0000\u011e\u011d\u0001\u0000\u0000\u0000\u011f\u0122\u0001\u0000\u0000"+
		"\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000"+
		"\u0000\u0121\u0123\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000"+
		"\u0000\u0123\u0124\u0005\u000f\u0000\u0000\u0124\u001d\u0001\u0000\u0000"+
		"\u0000\u0125\u013a\u0003\u0004\u0002\u0000\u0126\u013a\u0003\n\u0005\u0000"+
		"\u0127\u013a\u0003\u0006\u0003\u0000\u0128\u013a\u0003\b\u0004\u0000\u0129"+
		"\u012d\u0005\u000e\u0000\u0000\u012a\u012c\u0003&\u0013\u0000\u012b\u012a"+
		"\u0001\u0000\u0000\u0000\u012c\u012f\u0001\u0000\u0000\u0000\u012d\u012b"+
		"\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u0130"+
		"\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u0130\u013a"+
		"\u0005\u000f\u0000\u0000\u0131\u0132\u0005$\u0000\u0000\u0132\u0133\u0005"+
		"\t\u0000\u0000\u0133\u0134\u0005W\u0000\u0000\u0134\u013a\u0005\u0007"+
		"\u0000\u0000\u0135\u0136\u0005#\u0000\u0000\u0136\u0137\u0005\t\u0000"+
		"\u0000\u0137\u0138\u0005W\u0000\u0000\u0138\u013a\u0005\u0007\u0000\u0000"+
		"\u0139\u0125\u0001\u0000\u0000\u0000\u0139\u0126\u0001\u0000\u0000\u0000"+
		"\u0139\u0127\u0001\u0000\u0000\u0000\u0139\u0128\u0001\u0000\u0000\u0000"+
		"\u0139\u0129\u0001\u0000\u0000\u0000\u0139\u0131\u0001\u0000\u0000\u0000"+
		"\u0139\u0135\u0001\u0000\u0000\u0000\u013a\u001f\u0001\u0000\u0000\u0000"+
		"\u013b\u013e\u0005S\u0000\u0000\u013c\u013d\u0005\t\u0000\u0000\u013d"+
		"\u013f\u0003P(\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013e\u013f\u0001"+
		"\u0000\u0000\u0000\u013f\u0148\u0001\u0000\u0000\u0000\u0140\u0141\u0005"+
		"\u0007\u0000\u0000\u0141\u0144\u0005S\u0000\u0000\u0142\u0143\u0005\t"+
		"\u0000\u0000\u0143\u0145\u0003P(\u0000\u0144\u0142\u0001\u0000\u0000\u0000"+
		"\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0147\u0001\u0000\u0000\u0000"+
		"\u0146\u0140\u0001\u0000\u0000\u0000\u0147\u014a\u0001\u0000\u0000\u0000"+
		"\u0148\u0146\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000"+
		"\u0149\u0156\u0001\u0000\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000"+
		"\u014b\u014c\u0005\u000e\u0000\u0000\u014c\u0151\u0005S\u0000\u0000\u014d"+
		"\u014e\u0005\u0007\u0000\u0000\u014e\u0150\u0005S\u0000\u0000\u014f\u014d"+
		"\u0001\u0000\u0000\u0000\u0150\u0153\u0001\u0000\u0000\u0000\u0151\u014f"+
		"\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0154"+
		"\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0154\u0156"+
		"\u0005\u000f\u0000\u0000\u0155\u013b\u0001\u0000\u0000\u0000\u0155\u014b"+
		"\u0001\u0000\u0000\u0000\u0156!\u0001\u0000\u0000\u0000\u0157\u0159\u0003"+
		"&\u0013\u0000\u0158\u0157\u0001\u0000\u0000\u0000\u0159\u015c\u0001\u0000"+
		"\u0000\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000"+
		"\u0000\u0000\u015b\u015e\u0001\u0000\u0000\u0000\u015c\u015a\u0001\u0000"+
		"\u0000\u0000\u015d\u015f\u0003$\u0012\u0000\u015e\u015d\u0001\u0000\u0000"+
		"\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f#\u0001\u0000\u0000\u0000"+
		"\u0160\u0163\u0005:\u0000\u0000\u0161\u0164\u0003\u000e\u0007\u0000\u0162"+
		"\u0164\u00034\u001a\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0163\u0162"+
		"\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0165"+
		"\u0001\u0000\u0000\u0000\u0165\u0166\u0005\b\u0000\u0000\u0166%\u0001"+
		"\u0000\u0000\u0000\u0167\u0170\u0003\u0006\u0003\u0000\u0168\u0170\u0003"+
		"*\u0015\u0000\u0169\u0170\u0003.\u0017\u0000\u016a\u0170\u00030\u0018"+
		"\u0000\u016b\u0170\u00032\u0019\u0000\u016c\u0170\u0003R)\u0000\u016d"+
		"\u0170\u00034\u001a\u0000\u016e\u0170\u0003B!\u0000\u016f\u0167\u0001"+
		"\u0000\u0000\u0000\u016f\u0168\u0001\u0000\u0000\u0000\u016f\u0169\u0001"+
		"\u0000\u0000\u0000\u016f\u016a\u0001\u0000\u0000\u0000\u016f\u016b\u0001"+
		"\u0000\u0000\u0000\u016f\u016c\u0001\u0000\u0000\u0000\u016f\u016d\u0001"+
		"\u0000\u0000\u0000\u016f\u016e\u0001\u0000\u0000\u0000\u0170\'\u0001\u0000"+
		"\u0000\u0000\u0171\u0173\u0003\u0006\u0003\u0000\u0172\u0171\u0001\u0000"+
		"\u0000\u0000\u0173\u0176\u0001\u0000\u0000\u0000\u0174\u0172\u0001\u0000"+
		"\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u017a\u0001\u0000"+
		"\u0000\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0177\u0179\u0003\n\u0005"+
		"\u0000\u0178\u0177\u0001\u0000\u0000\u0000\u0179\u017c\u0001\u0000\u0000"+
		"\u0000\u017a\u0178\u0001\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000"+
		"\u0000\u017b)\u0001\u0000\u0000\u0000\u017c\u017a\u0001\u0000\u0000\u0000"+
		"\u017d\u017e\u00056\u0000\u0000\u017e\u017f\u0005\n\u0000\u0000\u017f"+
		"\u0180\u0003,\u0016\u0000\u0180\u0181\u0005\u000b\u0000\u0000\u0181\u0185"+
		"\u0005\u000e\u0000\u0000\u0182\u0184\u0003&\u0013\u0000\u0183\u0182\u0001"+
		"\u0000\u0000\u0000\u0184\u0187\u0001\u0000\u0000\u0000\u0185\u0183\u0001"+
		"\u0000\u0000\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0188\u0001"+
		"\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0188\u0192\u0005"+
		"\u000f\u0000\u0000\u0189\u018a\u00057\u0000\u0000\u018a\u018e\u0005\u000e"+
		"\u0000\u0000\u018b\u018d\u0003&\u0013\u0000\u018c\u018b\u0001\u0000\u0000"+
		"\u0000\u018d\u0190\u0001\u0000\u0000\u0000\u018e\u018c\u0001\u0000\u0000"+
		"\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u0191\u0001\u0000\u0000"+
		"\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0191\u0193\u0005\u000f\u0000"+
		"\u0000\u0192\u0189\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000"+
		"\u0000\u0193+\u0001\u0000\u0000\u0000\u0194\u0195\u0003L&\u0000\u0195"+
		"\u0196\u0007\u0001\u0000\u0000\u0196\u0197\u0003L&\u0000\u0197\u019a\u0001"+
		"\u0000\u0000\u0000\u0198\u019a\u0003L&\u0000\u0199\u0194\u0001\u0000\u0000"+
		"\u0000\u0199\u0198\u0001\u0000\u0000\u0000\u019a-\u0001\u0000\u0000\u0000"+
		"\u019b\u019c\u00058\u0000\u0000\u019c\u019e\u0005\n\u0000\u0000\u019d"+
		"\u019f\u0003\u0006\u0003\u0000\u019e\u019d\u0001\u0000\u0000\u0000\u019e"+
		"\u019f\u0001\u0000\u0000\u0000\u019f\u01a1\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a2\u0003,\u0016\u0000\u01a1\u01a0\u0001\u0000\u0000\u0000\u01a1\u01a2"+
		"\u0001\u0000\u0000\u0000\u01a2\u01a4\u0001\u0000\u0000\u0000\u01a3\u01a5"+
		"\u0005\b\u0000\u0000\u01a4\u01a3\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001"+
		"\u0000\u0000\u0000\u01a5\u01a7\u0001\u0000\u0000\u0000\u01a6\u01a8\u0003"+
		"&\u0013\u0000\u01a7\u01a6\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000"+
		"\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01aa\u0005\u000b"+
		"\u0000\u0000\u01aa\u01ae\u0005\u000e\u0000\u0000\u01ab\u01ad\u0003&\u0013"+
		"\u0000\u01ac\u01ab\u0001\u0000\u0000\u0000\u01ad\u01b0\u0001\u0000\u0000"+
		"\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000\u0000"+
		"\u0000\u01af\u01b1\u0001\u0000\u0000\u0000\u01b0\u01ae\u0001\u0000\u0000"+
		"\u0000\u01b1\u01b2\u0005\u000f\u0000\u0000\u01b2/\u0001\u0000\u0000\u0000"+
		"\u01b3\u01b4\u00059\u0000\u0000\u01b4\u01b5\u0005\n\u0000\u0000\u01b5"+
		"\u01b6\u0003,\u0016\u0000\u01b6\u01b7\u0005\u000b\u0000\u0000\u01b7\u01bb"+
		"\u0005\u000e\u0000\u0000\u01b8\u01ba\u0003&\u0013\u0000\u01b9\u01b8\u0001"+
		"\u0000\u0000\u0000\u01ba\u01bd\u0001\u0000\u0000\u0000\u01bb\u01b9\u0001"+
		"\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc\u01be\u0001"+
		"\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01be\u01bf\u0005"+
		"\u000f\u0000\u0000\u01bf1\u0001\u0000\u0000\u0000\u01c0\u01c1\u0005S\u0000"+
		"\u0000\u01c1\u01ca\u0005\n\u0000\u0000\u01c2\u01c7\u0003L&\u0000\u01c3"+
		"\u01c4\u0005\u0007\u0000\u0000\u01c4\u01c6\u0003L&\u0000\u01c5\u01c3\u0001"+
		"\u0000\u0000\u0000\u01c6\u01c9\u0001\u0000\u0000\u0000\u01c7\u01c5\u0001"+
		"\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8\u01cb\u0001"+
		"\u0000\u0000\u0000\u01c9\u01c7\u0001\u0000\u0000\u0000\u01ca\u01c2\u0001"+
		"\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001"+
		"\u0000\u0000\u0000\u01cc\u01cd\u0005\u000b\u0000\u0000\u01cd\u01ce\u0005"+
		"\b\u0000\u0000\u01ce3\u0001\u0000\u0000\u0000\u01cf\u01d3\u00036\u001b"+
		"\u0000\u01d0\u01d2\u0003<\u001e\u0000\u01d1\u01d0\u0001\u0000\u0000\u0000"+
		"\u01d2\u01d5\u0001\u0000\u0000\u0000\u01d3\u01d1\u0001\u0000\u0000\u0000"+
		"\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4\u01d6\u0001\u0000\u0000\u0000"+
		"\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d6\u01d7\u00038\u001c\u0000\u01d7"+
		"\u01da\u0001\u0000\u0000\u0000\u01d8\u01da\u0003:\u001d\u0000\u01d9\u01cf"+
		"\u0001\u0000\u0000\u0000\u01d9\u01d8\u0001\u0000\u0000\u0000\u01da5\u0001"+
		"\u0000\u0000\u0000\u01db\u01dc\u0005\u0010\u0000\u0000\u01dc\u01dd\u0005"+
		"S\u0000\u0000\u01dd\u01de\u0003@ \u0000\u01de\u01df\u0005\u0011\u0000"+
		"\u0000\u01df7\u0001\u0000\u0000\u0000\u01e0\u01e1\u0005\u0010\u0000\u0000"+
		"\u01e1\u01e2\u0005\u0005\u0000\u0000\u01e2\u01e3\u0005S\u0000\u0000\u01e3"+
		"\u01e4\u0005\u0011\u0000\u0000\u01e49\u0001\u0000\u0000\u0000\u01e5\u01e6"+
		"\u0005\u0010\u0000\u0000\u01e6\u01e7\u0005S\u0000\u0000\u01e7\u01e8\u0003"+
		"@ \u0000\u01e8\u01e9\u0005\u001f\u0000\u0000\u01e9;\u0001\u0000\u0000"+
		"\u0000\u01ea\u01ee\u00034\u001a\u0000\u01eb\u01ee\u0003>\u001f\u0000\u01ec"+
		"\u01ee\u0005S\u0000\u0000\u01ed\u01ea\u0001\u0000\u0000\u0000\u01ed\u01eb"+
		"\u0001\u0000\u0000\u0000\u01ed\u01ec\u0001\u0000\u0000\u0000\u01ee=\u0001"+
		"\u0000\u0000\u0000\u01ef\u01f0\u0005 \u0000\u0000\u01f0\u01f1\u0003L&"+
		"\u0000\u01f1\u01f2\u0005!\u0000\u0000\u01f2?\u0001\u0000\u0000\u0000\u01f3"+
		"\u01f9\u0003B!\u0000\u01f4\u01f9\u0003D\"\u0000\u01f5\u01f9\u0003F#\u0000"+
		"\u01f6\u01f9\u0003H$\u0000\u01f7\u01f9\u0003J%\u0000\u01f8\u01f3\u0001"+
		"\u0000\u0000\u0000\u01f8\u01f4\u0001\u0000\u0000\u0000\u01f8\u01f5\u0001"+
		"\u0000\u0000\u0000\u01f8\u01f6\u0001\u0000\u0000\u0000\u01f8\u01f7\u0001"+
		"\u0000\u0000\u0000\u01f9\u01fc\u0001\u0000\u0000\u0000\u01fa\u01f8\u0001"+
		"\u0000\u0000\u0000\u01fa\u01fb\u0001\u0000\u0000\u0000\u01fbA\u0001\u0000"+
		"\u0000\u0000\u01fc\u01fa\u0001\u0000\u0000\u0000\u01fd\u01fe\u0005\u0004"+
		"\u0000\u0000\u01fe\u01ff\u0005S\u0000\u0000\u01ff\u0200\u0005\u0001\u0000"+
		"\u0000\u0200\u0201\u0005W\u0000\u0000\u0201C\u0001\u0000\u0000\u0000\u0202"+
		"\u0203\u0005S\u0000\u0000\u0203\u0204\u0005\u0001\u0000\u0000\u0204\u0205"+
		"\u0005W\u0000\u0000\u0205E\u0001\u0000\u0000\u0000\u0206\u0207\u0005\n"+
		"\u0000\u0000\u0207\u0208\u0005S\u0000\u0000\u0208\u0209\u0005\u000b\u0000"+
		"\u0000\u0209\u020a\u0005\u0001\u0000\u0000\u020a\u020b\u0005W\u0000\u0000"+
		"\u020bG\u0001\u0000\u0000\u0000\u020c\u020d\u0005\f\u0000\u0000\u020d"+
		"\u020e\u0005S\u0000\u0000\u020e\u020f\u0005\r\u0000\u0000\u020f\u0212"+
		"\u0005\u0001\u0000\u0000\u0210\u0213\u0005W\u0000\u0000\u0211\u0213\u0003"+
		">\u001f\u0000\u0212\u0210\u0001\u0000\u0000\u0000\u0212\u0211\u0001\u0000"+
		"\u0000\u0000\u0213I\u0001\u0000\u0000\u0000\u0214\u0215\u0005%\u0000\u0000"+
		"\u0215\u0216\u0005\u0001\u0000\u0000\u0216\u0217\u0005W\u0000\u0000\u0217"+
		"K\u0001\u0000\u0000\u0000\u0218\u0225\u0005S\u0000\u0000\u0219\u021a\u0005"+
		"S\u0000\u0000\u021a\u021b\u0005\u001d\u0000\u0000\u021b\u0225\u0005S\u0000"+
		"\u0000\u021c\u0225\u0005W\u0000\u0000\u021d\u0225\u0005T\u0000\u0000\u021e"+
		"\u0225\u0005U\u0000\u0000\u021f\u0225\u0005V\u0000\u0000\u0220\u0225\u0003"+
		"\u000e\u0007\u0000\u0221\u0225\u00032\u0019\u0000\u0222\u0225\u0003\u0010"+
		"\b\u0000\u0223\u0225\u0003\u0012\t\u0000\u0224\u0218\u0001\u0000\u0000"+
		"\u0000\u0224\u0219\u0001\u0000\u0000\u0000\u0224\u021c\u0001\u0000\u0000"+
		"\u0000\u0224\u021d\u0001\u0000\u0000\u0000\u0224\u021e\u0001\u0000\u0000"+
		"\u0000\u0224\u021f\u0001\u0000\u0000\u0000\u0224\u0220\u0001\u0000\u0000"+
		"\u0000\u0224\u0221\u0001\u0000\u0000\u0000\u0224\u0222\u0001\u0000\u0000"+
		"\u0000\u0224\u0223\u0001\u0000\u0000\u0000\u0225M\u0001\u0000\u0000\u0000"+
		"\u0226\u0227\u0005\u000e\u0000\u0000\u0227\u0228\u0003,\u0016\u0000\u0228"+
		"\u0229\u0005\u0017\u0000\u0000\u0229\u022a\u00034\u001a\u0000\u022a\u022b"+
		"\u0005\u000f\u0000\u0000\u022bO\u0001\u0000\u0000\u0000\u022c\u022d\u0007"+
		"\u0002\u0000\u0000\u022dQ\u0001\u0000\u0000\u0000\u022e\u022f\u00051\u0000"+
		"\u0000\u022f\u0230\u0005\u001d\u0000\u0000\u0230\u0231\u00052\u0000\u0000"+
		"\u0231\u0232\u0005\n\u0000\u0000\u0232\u0233\u0003L&\u0000\u0233\u0234"+
		"\u0005\u000b\u0000\u0000\u0234\u0235\u0005\b\u0000\u0000\u0235S\u0001"+
		"\u0000\u0000\u0000?W^`dgqtw\u007f\u0086\u008e\u0091\u0094\u009d\u00a5"+
		"\u00ad\u00b0\u00ba\u00c6\u00d2\u00da\u00dd\u00eb\u00ee\u00fc\u00ff\u0104"+
		"\u010f\u0114\u0119\u0120\u012d\u0139\u013e\u0144\u0148\u0151\u0155\u015a"+
		"\u015e\u0163\u016f\u0174\u017a\u0185\u018e\u0192\u0199\u019e\u01a1\u01a4"+
		"\u01a7\u01ae\u01bb\u01c7\u01ca\u01d3\u01d9\u01ed\u01f8\u01fa\u0212\u0224";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}