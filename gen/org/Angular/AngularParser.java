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
		ONDESTROY=80, AS=81, THIS=82, VOID=83, NUMBER=84, TEMPLATE_LITERAL=85, 
		ID=86, INT=87, DOUBLE=88, BOOLEAN=89, STRING=90, NGIF=91, NGSWITCH=92, 
		NGFOR=93, NGSTYLE=94, NGCLASS=95, WS=96, COMMENT=97, BLOCK_COMMENT=98;
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
		RULE_angularDirective = 34, RULE_jsxAttribute = 35, RULE_jsxEvent = 36, 
		RULE_jsxBinding = 37, RULE_jsxClass = 38, RULE_expression = 39, RULE_type = 40, 
		RULE_printStatement = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "importStatement", "exportStatement", "variableDeclaration", 
			"classDeclaration", "functionDeclaration", "componentDeclaration", "value", 
			"array", "object", "classBody", "assignment", "decorator", "decoratorArguments", 
			"argumentContent", "constructorDeclaration", "parameters", "functionBody", 
			"returnStatement", "operation", "statement", "componentBody", "ifStatement", 
			"condition", "forStatement", "whileStatement", "callFunction", "jsxElement", 
			"openingTag", "closingTag", "selfClosingTag", "jsxContent", "interpolation", 
			"jsxAttributes", "angularDirective", "jsxAttribute", "jsxEvent", "jsxBinding", 
			"jsxClass", "expression", "type", "printStatement"
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
			"'ngOnDestroy'", "'as'", "'this'", "'void'", "'number'", null, null, 
			null, null, null, null, "'ngIf'", "'ngSwitch'", "'ngFor'", "'ngStyle'", 
			"'ngClass'"
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
			"ONDESTROY", "AS", "THIS", "VOID", "NUMBER", "TEMPLATE_LITERAL", "ID", 
			"INT", "DOUBLE", "BOOLEAN", "STRING", "NGIF", "NGSWITCH", "NGFOR", "NGSTYLE", 
			"NGCLASS", "WS", "COMMENT", "BLOCK_COMMENT"
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
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16044212185219072L) != 0) || _la==ID) {
					{
					setState(94);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(90);
						variableDeclaration();
						}
						break;
					case 2:
						{
						setState(91);
						classDeclaration();
						}
						break;
					case 3:
						{
						setState(92);
						functionDeclaration();
						}
						break;
					case 4:
						{
						setState(93);
						componentDeclaration();
						}
						break;
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
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public TerminalNode EQUAL() { return getToken(AngularParser.EQUAL, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
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
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15762598695796736L) != 0)) {
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
					}
				}

				setState(153);
				match(ID);
				setState(154);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(159);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(155);
					value();
					}
					break;
				case 2:
					{
					setState(156);
					array();
					}
					break;
				case 3:
					{
					setState(157);
					object();
					}
					break;
				case 4:
					{
					setState(158);
					functionDeclaration();
					}
					break;
				}
				setState(161);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15762598695796736L) != 0)) {
					{
					setState(163);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15762598695796736L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(166);
				match(ID);
				setState(167);
				match(COLON);
				setState(168);
				type();
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1729382261205323792L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 64259L) != 0)) {
					{
					setState(169);
					value();
					}
				}

				setState(172);
				match(EQUAL);
				setState(177);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(173);
					value();
					}
					break;
				case 2:
					{
					setState(174);
					array();
					}
					break;
				case 3:
					{
					setState(175);
					object();
					}
					break;
				case 4:
					{
					setState(176);
					functionDeclaration();
					}
					break;
				}
				setState(179);
				match(SEMI);
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
			setState(183);
			match(CLASS);
			setState(184);
			match(ID);
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(185);
				match(EXTENDS);
				setState(186);
				match(ID);
				}
			}

			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(189);
				match(IMPLEMENTS);
				setState(190);
				match(ID);
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(191);
					match(COMMA);
					setState(192);
					match(ID);
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(200);
			match(LEFTCURLY);
			setState(201);
			classBody();
			setState(202);
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
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION) {
				{
				setState(204);
				match(FUNCTION);
				}
			}

			setState(207);
			match(ID);
			setState(208);
			match(LEFTPAREN);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTCURLY || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 2051L) != 0)) {
				{
				setState(209);
				parameters();
				}
			}

			setState(212);
			match(RIGHTPAREN);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(213);
				match(COLON);
				setState(214);
				type();
				}
			}

			setState(217);
			match(LEFTCURLY);
			setState(218);
			functionBody();
			setState(219);
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
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				decorator();
				}
				break;
			case LEFTCURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(LEFTCURLY);
				setState(223);
				componentBody();
				setState(224);
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
			setState(234);
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
				setState(228);
				type();
				}
				break;
			case LEFTBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				array();
				}
				break;
			case LEFTCURLY:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				object();
				}
				break;
			case LESSTHAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				jsxElement();
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(232);
				angularDirective();
				}
				break;
			case DOUBLELEFTCURLY:
				enterOuterAlt(_localctx, 6);
				{
				setState(233);
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
			setState(236);
			match(LEFTBRACKET);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1729382261205323792L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 64259L) != 0)) {
				{
				setState(237);
				value();
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(238);
					match(COMMA);
					setState(239);
					value();
					}
					}
					setState(244);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(247);
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
			setState(249);
			match(LEFTCURLY);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(250);
				match(ID);
				setState(251);
				match(COLON);
				setState(252);
				value();
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(253);
					match(COMMA);
					setState(254);
					match(ID);
					setState(255);
					match(COLON);
					setState(256);
					value();
					}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(264);
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
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & 72057594052902913L) != 0)) {
				{
				setState(270);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(266);
					decorator();
					}
					break;
				case 2:
					{
					setState(267);
					constructorDeclaration();
					}
					break;
				case 3:
					{
					setState(268);
					variableDeclaration();
					}
					break;
				case 4:
					{
					setState(269);
					functionDeclaration();
					}
					break;
				}
				}
				setState(274);
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
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(280); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(275);
						match(ID);
						setState(276);
						match(COLON);
						setState(277);
						type();
						setState(278);
						match(SEMI);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(282); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case THIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(THIS);
				setState(285);
				match(DOT);
				setState(286);
				match(ID);
				setState(287);
				match(EQUAL);
				setState(296);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(288);
					value();
					}
					break;
				case 2:
					{
					setState(289);
					match(THIS);
					setState(290);
					match(DOT);
					setState(291);
					match(ID);
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DOT) {
						{
						setState(292);
						match(DOT);
						setState(293);
						callFunction();
						}
					}

					}
					break;
				}
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(298);
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
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				match(AT);
				setState(304);
				match(ID);
				setState(305);
				match(LEFTPAREN);
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LEFTCURLY) {
					{
					{
					setState(306);
					decoratorArguments();
					}
					}
					setState(311);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(312);
				match(RIGHTPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				match(AT);
				setState(314);
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
			setState(317);
			match(LEFTCURLY);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16048712237203456L) != 0) || _la==ID) {
				{
				{
				setState(318);
				argumentContent();
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(324);
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
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				exportStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(328);
				variableDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(329);
				classDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(330);
				match(LEFTCURLY);
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 538743105424261136L) != 0) || _la==THIS || _la==ID) {
					{
					{
					setState(331);
					statement();
					}
					}
					setState(336);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(337);
				match(RIGHTCURLY);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(338);
				match(SELECTOR);
				setState(339);
				match(COLON);
				setState(340);
				match(STRING);
				setState(341);
				match(COMMA);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(342);
				match(TEMPLATEURL);
				setState(343);
				match(COLON);
				setState(346);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(344);
					match(STRING);
					}
					break;
				case LESSTHAN:
					{
					setState(345);
					jsxElement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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
			setState(351);
			match(CONSTRUCTOR);
			setState(352);
			match(LEFTPAREN);
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEFTCURLY || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 2051L) != 0)) {
				{
				setState(353);
				parameters();
				}
			}

			setState(356);
			match(RIGHTPAREN);
			setState(357);
			match(LEFTCURLY);
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(358);
				functionBody();
				}
				break;
			case 2:
				{
				setState(359);
				assignment();
				}
				break;
			}
			setState(362);
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
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
			case PRIVATE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PUBLIC || _la==PRIVATE) {
					{
					setState(364);
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

				setState(367);
				match(ID);
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(368);
					match(COLON);
					setState(369);
					type();
					setState(372);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==EQUAL) {
						{
						setState(370);
						match(EQUAL);
						setState(371);
						value();
						}
					}

					}
				}

				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(376);
					match(COMMA);
					setState(378);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==PUBLIC || _la==PRIVATE) {
						{
						setState(377);
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

					setState(380);
					match(ID);
					setState(387);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COLON) {
						{
						setState(381);
						match(COLON);
						setState(382);
						type();
						setState(385);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==EQUAL) {
							{
							setState(383);
							match(EQUAL);
							setState(384);
							value();
							}
						}

						}
					}

					}
					}
					setState(393);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case LEFTCURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				match(LEFTCURLY);
				setState(395);
				match(ID);
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(396);
					match(COMMA);
					setState(397);
					match(ID);
					}
					}
					setState(402);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(403);
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
			setState(409);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(406);
					statement();
					}
					} 
				}
				setState(411);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(412);
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
			setState(415);
			match(RETURN);
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(416);
				value();
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7274556L) != 0)) {
					{
					setState(417);
					operation();
					setState(418);
					value();
					}
				}

				}
				break;
			case 2:
				{
				setState(422);
				jsxElement();
				}
				break;
			}
			setState(425);
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
			setState(427);
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
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(431);
				forStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(432);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(433);
				callFunction();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(434);
				printStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(435);
				jsxElement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(436);
				angularDirective();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(437);
				returnStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(438);
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
			setState(444);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(441);
					variableDeclaration();
					}
					} 
				}
				setState(446);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION || _la==ID) {
				{
				{
				setState(447);
				functionDeclaration();
				}
				}
				setState(452);
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
			setState(453);
			match(IF);
			setState(454);
			match(LEFTPAREN);
			setState(455);
			condition();
			setState(456);
			match(RIGHTPAREN);
			setState(457);
			match(LEFTCURLY);
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 538743105424261136L) != 0) || _la==THIS || _la==ID) {
				{
				{
				setState(458);
				statement();
				}
				}
				setState(463);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(464);
			match(RIGHTCURLY);
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(465);
				match(ELSE);
				setState(466);
				match(LEFTCURLY);
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 538743105424261136L) != 0) || _la==THIS || _la==ID) {
					{
					{
					setState(467);
					statement();
					}
					}
					setState(472);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(473);
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
			setState(481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				expression(0);
				setState(477);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(478);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
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
			setState(483);
			match(FOR);
			setState(484);
			match(LEFTPAREN);
			setState(486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(485);
				variableDeclaration();
				}
				break;
			}
			setState(489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(488);
				condition();
				}
				break;
			}
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(491);
				match(SEMI);
				}
			}

			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 538743105424261136L) != 0) || _la==THIS || _la==ID) {
				{
				setState(494);
				statement();
				}
			}

			setState(497);
			match(RIGHTPAREN);
			setState(498);
			match(LEFTCURLY);
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 538743105424261136L) != 0) || _la==THIS || _la==ID) {
				{
				{
				setState(499);
				statement();
				}
				}
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(505);
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
			setState(507);
			match(WHILE);
			setState(508);
			match(LEFTPAREN);
			setState(509);
			condition();
			setState(510);
			match(RIGHTPAREN);
			setState(511);
			match(LEFTCURLY);
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 538743105424261136L) != 0) || _la==THIS || _la==ID) {
				{
				{
				setState(512);
				statement();
				}
				}
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(518);
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
			setState(520);
			match(ID);
			setState(521);
			match(LEFTPAREN);
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1729382261205323792L) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 64259L) != 0)) {
				{
				setState(522);
				expression(0);
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(523);
					match(COMMA);
					setState(524);
					expression(0);
					}
					}
					setState(529);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(532);
			match(RIGHTPAREN);
			setState(533);
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
			setState(545);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(535);
				openingTag();
				setState(539);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(536);
						jsxContent();
						}
						} 
					}
					setState(541);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				}
				setState(542);
				closingTag();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(544);
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
		enterRule(_localctx, 56, RULE_openingTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			match(LESSTHAN);
			setState(548);
			match(ID);
			setState(549);
			jsxAttributes();
			setState(550);
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
			setState(552);
			match(LESSTHAN);
			setState(553);
			match(DIVISION);
			setState(554);
			match(ID);
			setState(555);
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
		enterRule(_localctx, 60, RULE_selfClosingTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(LESSTHAN);
			setState(558);
			match(ID);
			setState(559);
			jsxAttributes();
			setState(560);
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
			setState(565);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LESSTHAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(562);
				jsxElement();
				}
				break;
			case DOUBLELEFTCURLY:
				enterOuterAlt(_localctx, 2);
				{
				setState(563);
				interpolation();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(564);
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
			setState(567);
			match(DOUBLELEFTCURLY);
			setState(568);
			expression(0);
			setState(569);
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
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137438958608L) != 0) || _la==ID) {
				{
				setState(576);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(571);
					angularDirective();
					}
					break;
				case ID:
					{
					setState(572);
					jsxAttribute();
					}
					break;
				case LEFTPAREN:
					{
					setState(573);
					jsxEvent();
					}
					break;
				case LEFTBRACKET:
					{
					setState(574);
					jsxBinding();
					}
					break;
				case CLASS:
					{
					setState(575);
					jsxClass();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(580);
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
		enterRule(_localctx, 68, RULE_angularDirective);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(STAR);
			setState(582);
			match(ID);
			setState(583);
			match(EQUAL);
			setState(584);
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
		enterRule(_localctx, 70, RULE_jsxAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			match(ID);
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
		enterRule(_localctx, 72, RULE_jsxEvent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(LEFTPAREN);
			setState(591);
			match(ID);
			setState(592);
			match(RIGHTPAREN);
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
		enterRule(_localctx, 74, RULE_jsxBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(LEFTBRACKET);
			setState(597);
			match(ID);
			setState(598);
			match(RIGHTBRACKET);
			setState(599);
			match(EQUAL);
			setState(602);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(600);
				match(STRING);
				}
				break;
			case DOUBLELEFTCURLY:
				{
				setState(601);
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
		enterRule(_localctx, 76, RULE_jsxClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(CLASS);
			setState(605);
			match(EQUAL);
			setState(606);
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
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(609);
				match(ID);
				}
				break;
			case 2:
				{
				setState(610);
				match(ID);
				setState(611);
				match(DOT);
				setState(612);
				match(ID);
				}
				break;
			case 3:
				{
				setState(613);
				match(STRING);
				}
				break;
			case 4:
				{
				setState(614);
				match(INT);
				}
				break;
			case 5:
				{
				setState(615);
				match(DOUBLE);
				}
				break;
			case 6:
				{
				setState(616);
				match(BOOLEAN);
				}
				break;
			case 7:
				{
				setState(617);
				value();
				}
				break;
			case 8:
				{
				setState(618);
				callFunction();
				}
				break;
			case 9:
				{
				setState(619);
				array();
				}
				break;
			case 10:
				{
				setState(620);
				object();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(629);
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
					setState(623);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(624);
					operation();
					setState(625);
					expression(2);
					}
					} 
				}
				setState(631);
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
		enterRule(_localctx, 80, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			_la = _input.LA(1);
			if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 4211277827L) != 0)) ) {
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
			setState(634);
			match(CONSOLE);
			setState(635);
			match(DOT);
			setState(636);
			match(LOG);
			setState(637);
			match(LEFTPAREN);
			setState(638);
			expression(0);
			setState(639);
			match(RIGHTPAREN);
			setState(640);
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
		case 39:
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
		"\u0004\u0001b\u0283\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\b\u0002\u0001\u0002\u0003\u0002\u0095\b\u0002\u0001\u0003\u0003\u0003"+
		"\u0098\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u00a0\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u00a5\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u00ab\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u00b2\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"\u00b6\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u00bc\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"\u00c2\b\u0004\n\u0004\f\u0004\u00c5\t\u0004\u0003\u0004\u00c7\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0003\u0005"+
		"\u00ce\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00d3\b"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00d8\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00e3\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00eb"+
		"\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00f1\b\b\n\b\f\b\u00f4"+
		"\t\b\u0003\b\u00f6\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0102\b\t\n\t\f\t\u0105\t\t\u0003"+
		"\t\u0107\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u010f"+
		"\b\n\n\n\f\n\u0112\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0004\u000b\u0119\b\u000b\u000b\u000b\f\u000b\u011a\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0127\b\u000b\u0003"+
		"\u000b\u0129\b\u000b\u0001\u000b\u0003\u000b\u012c\b\u000b\u0003\u000b"+
		"\u012e\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0134\b\f\n\f\f"+
		"\f\u0137\t\f\u0001\f\u0001\f\u0001\f\u0003\f\u013c\b\f\u0001\r\u0001\r"+
		"\u0005\r\u0140\b\r\n\r\f\r\u0143\t\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u014d"+
		"\b\u000e\n\u000e\f\u000e\u0150\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u015b\b\u000e\u0001\u000e\u0003\u000e\u015e\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0163\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0169\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0003\u0010\u016e\b\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0175\b\u0010\u0003\u0010\u0177"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u017b\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0182\b\u0010"+
		"\u0003\u0010\u0184\b\u0010\u0005\u0010\u0186\b\u0010\n\u0010\f\u0010\u0189"+
		"\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u018f"+
		"\b\u0010\n\u0010\f\u0010\u0192\t\u0010\u0001\u0010\u0003\u0010\u0195\b"+
		"\u0010\u0001\u0011\u0005\u0011\u0198\b\u0011\n\u0011\f\u0011\u019b\t\u0011"+
		"\u0001\u0011\u0003\u0011\u019e\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u01a5\b\u0012\u0001\u0012\u0003\u0012"+
		"\u01a8\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01b8\b\u0014\u0001\u0015"+
		"\u0005\u0015\u01bb\b\u0015\n\u0015\f\u0015\u01be\t\u0015\u0001\u0015\u0005"+
		"\u0015\u01c1\b\u0015\n\u0015\f\u0015\u01c4\t\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u01cc\b\u0016"+
		"\n\u0016\f\u0016\u01cf\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0005\u0016\u01d5\b\u0016\n\u0016\f\u0016\u01d8\t\u0016\u0001\u0016"+
		"\u0003\u0016\u01db\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u01e2\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0003\u0018\u01e7\b\u0018\u0001\u0018\u0003\u0018\u01ea\b\u0018\u0001"+
		"\u0018\u0003\u0018\u01ed\b\u0018\u0001\u0018\u0003\u0018\u01f0\b\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u01f5\b\u0018\n\u0018"+
		"\f\u0018\u01f8\t\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0202\b\u0019"+
		"\n\u0019\f\u0019\u0205\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u020e\b\u001a\n"+
		"\u001a\f\u001a\u0211\t\u001a\u0003\u001a\u0213\b\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0005\u001b\u021a\b\u001b\n"+
		"\u001b\f\u001b\u021d\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u0222\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u0236\b\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u0241\b!\n!\f!\u0244\t!\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001$"+
		"\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0003%\u025b\b%\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0003\'\u026e\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u0274"+
		"\b\'\n\'\f\'\u0277\t\'\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0000\u0001N*\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@BDFHJLNPR\u0000\u0006\u0001\u000035\u0002\u0000\u0001\u0001\t\t"+
		"\u0001\u0000KL\u0003\u0000\u0002\u0005\u0010\u0013\u0015\u0016\u0001\u0000"+
		"\u0017\u0018\u0004\u0000;<KLSTVZ\u02d4\u0000g\u0001\u0000\u0000\u0000"+
		"\u0002i\u0001\u0000\u0000\u0000\u0004}\u0001\u0000\u0000\u0000\u0006\u00b5"+
		"\u0001\u0000\u0000\u0000\b\u00b7\u0001\u0000\u0000\u0000\n\u00cd\u0001"+
		"\u0000\u0000\u0000\f\u00e2\u0001\u0000\u0000\u0000\u000e\u00ea\u0001\u0000"+
		"\u0000\u0000\u0010\u00ec\u0001\u0000\u0000\u0000\u0012\u00f9\u0001\u0000"+
		"\u0000\u0000\u0014\u0110\u0001\u0000\u0000\u0000\u0016\u012d\u0001\u0000"+
		"\u0000\u0000\u0018\u013b\u0001\u0000\u0000\u0000\u001a\u013d\u0001\u0000"+
		"\u0000\u0000\u001c\u015d\u0001\u0000\u0000\u0000\u001e\u015f\u0001\u0000"+
		"\u0000\u0000 \u0194\u0001\u0000\u0000\u0000\"\u0199\u0001\u0000\u0000"+
		"\u0000$\u019f\u0001\u0000\u0000\u0000&\u01ab\u0001\u0000\u0000\u0000("+
		"\u01b7\u0001\u0000\u0000\u0000*\u01bc\u0001\u0000\u0000\u0000,\u01c5\u0001"+
		"\u0000\u0000\u0000.\u01e1\u0001\u0000\u0000\u00000\u01e3\u0001\u0000\u0000"+
		"\u00002\u01fb\u0001\u0000\u0000\u00004\u0208\u0001\u0000\u0000\u00006"+
		"\u0221\u0001\u0000\u0000\u00008\u0223\u0001\u0000\u0000\u0000:\u0228\u0001"+
		"\u0000\u0000\u0000<\u022d\u0001\u0000\u0000\u0000>\u0235\u0001\u0000\u0000"+
		"\u0000@\u0237\u0001\u0000\u0000\u0000B\u0242\u0001\u0000\u0000\u0000D"+
		"\u0245\u0001\u0000\u0000\u0000F\u024a\u0001\u0000\u0000\u0000H\u024e\u0001"+
		"\u0000\u0000\u0000J\u0254\u0001\u0000\u0000\u0000L\u025c\u0001\u0000\u0000"+
		"\u0000N\u026d\u0001\u0000\u0000\u0000P\u0278\u0001\u0000\u0000\u0000R"+
		"\u027a\u0001\u0000\u0000\u0000TV\u0003\u0002\u0001\u0000UT\u0001\u0000"+
		"\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001"+
		"\u0000\u0000\u0000X`\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000"+
		"Z_\u0003\u0006\u0003\u0000[_\u0003\b\u0004\u0000\\_\u0003\n\u0005\u0000"+
		"]_\u0003\f\u0006\u0000^Z\u0001\u0000\u0000\u0000^[\u0001\u0000\u0000\u0000"+
		"^\\\u0001\u0000\u0000\u0000^]\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000"+
		"\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ad\u0001\u0000"+
		"\u0000\u0000b`\u0001\u0000\u0000\u0000ce\u0003\u0004\u0002\u0000dc\u0001"+
		"\u0000\u0000\u0000de\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000"+
		"fh\u0005\u0000\u0000\u0001gW\u0001\u0000\u0000\u0000gf\u0001\u0000\u0000"+
		"\u0000h\u0001\u0001\u0000\u0000\u0000iw\u0005)\u0000\u0000jx\u0005V\u0000"+
		"\u0000kt\u0005\u000e\u0000\u0000lq\u0005V\u0000\u0000mn\u0005\u0007\u0000"+
		"\u0000np\u0005V\u0000\u0000om\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000"+
		"\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000ru\u0001\u0000"+
		"\u0000\u0000sq\u0001\u0000\u0000\u0000tl\u0001\u0000\u0000\u0000tu\u0001"+
		"\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vx\u0005\u000f\u0000\u0000"+
		"wj\u0001\u0000\u0000\u0000wk\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000"+
		"\u0000yz\u0005,\u0000\u0000z{\u0005Z\u0000\u0000{|\u0005\b\u0000\u0000"+
		"|\u0003\u0001\u0000\u0000\u0000}\u0094\u0005*\u0000\u0000~\u0080\u0005"+
		"+\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000"+
		"\u0000\u0080\u0086\u0001\u0000\u0000\u0000\u0081\u0087\u0003\b\u0004\u0000"+
		"\u0082\u0087\u0003\u0006\u0003\u0000\u0083\u0087\u0003\n\u0005\u0000\u0084"+
		"\u0087\u0003\f\u0006\u0000\u0085\u0087\u0003\u0012\t\u0000\u0086\u0081"+
		"\u0001\u0000\u0000\u0000\u0086\u0082\u0001\u0000\u0000\u0000\u0086\u0083"+
		"\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0085"+
		"\u0001\u0000\u0000\u0000\u0087\u0095\u0001\u0000\u0000\u0000\u0088\u0091"+
		"\u0005\u000e\u0000\u0000\u0089\u008e\u0005V\u0000\u0000\u008a\u008b\u0005"+
		"\u0007\u0000\u0000\u008b\u008d\u0005V\u0000\u0000\u008c\u008a\u0001\u0000"+
		"\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000"+
		"\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u0089\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000"+
		"\u0000\u0000\u0093\u0095\u0005\u000f\u0000\u0000\u0094\u007f\u0001\u0000"+
		"\u0000\u0000\u0094\u0088\u0001\u0000\u0000\u0000\u0095\u0005\u0001\u0000"+
		"\u0000\u0000\u0096\u0098\u0007\u0000\u0000\u0000\u0097\u0096\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0005V\u0000\u0000\u009a\u009f\u0007\u0001\u0000"+
		"\u0000\u009b\u00a0\u0003\u000e\u0007\u0000\u009c\u00a0\u0003\u0010\b\u0000"+
		"\u009d\u00a0\u0003\u0012\t\u0000\u009e\u00a0\u0003\n\u0005\u0000\u009f"+
		"\u009b\u0001\u0000\u0000\u0000\u009f\u009c\u0001\u0000\u0000\u0000\u009f"+
		"\u009d\u0001\u0000\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\b\u0000\u0000\u00a2\u00b6"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a5\u0007\u0000\u0000\u0000\u00a4\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005V\u0000\u0000\u00a7\u00a8\u0005"+
		"\t\u0000\u0000\u00a8\u00aa\u0003P(\u0000\u00a9\u00ab\u0003\u000e\u0007"+
		"\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00b1\u0005\u0001\u0000"+
		"\u0000\u00ad\u00b2\u0003\u000e\u0007\u0000\u00ae\u00b2\u0003\u0010\b\u0000"+
		"\u00af\u00b2\u0003\u0012\t\u0000\u00b0\u00b2\u0003\n\u0005\u0000\u00b1"+
		"\u00ad\u0001\u0000\u0000\u0000\u00b1\u00ae\u0001\u0000\u0000\u0000\u00b1"+
		"\u00af\u0001\u0000\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\b\u0000\u0000\u00b4\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b5\u0097\u0001\u0000\u0000\u0000\u00b5\u00a4"+
		"\u0001\u0000\u0000\u0000\u00b6\u0007\u0001\u0000\u0000\u0000\u00b7\u00b8"+
		"\u0005%\u0000\u0000\u00b8\u00bb\u0005V\u0000\u0000\u00b9\u00ba\u0005."+
		"\u0000\u0000\u00ba\u00bc\u0005V\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00c6\u0001\u0000\u0000"+
		"\u0000\u00bd\u00be\u0005/\u0000\u0000\u00be\u00c3\u0005V\u0000\u0000\u00bf"+
		"\u00c0\u0005\u0007\u0000\u0000\u00c0\u00c2\u0005V\u0000\u0000\u00c1\u00bf"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c7"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6\u00bd"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\u000e\u0000\u0000\u00c9\u00ca"+
		"\u0003\u0014\n\u0000\u00ca\u00cb\u0005\u000f\u0000\u0000\u00cb\t\u0001"+
		"\u0000\u0000\u0000\u00cc\u00ce\u00050\u0000\u0000\u00cd\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d0\u0005V\u0000\u0000\u00d0\u00d2\u0005\n\u0000"+
		"\u0000\u00d1\u00d3\u0003 \u0010\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d7\u0005\u000b\u0000\u0000\u00d5\u00d6\u0005\t\u0000\u0000\u00d6"+
		"\u00d8\u0003P(\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00da\u0005"+
		"\u000e\u0000\u0000\u00da\u00db\u0003\"\u0011\u0000\u00db\u00dc\u0005\u000f"+
		"\u0000\u0000\u00dc\u000b\u0001\u0000\u0000\u0000\u00dd\u00e3\u0003\u0018"+
		"\f\u0000\u00de\u00df\u0005\u000e\u0000\u0000\u00df\u00e0\u0003*\u0015"+
		"\u0000\u00e0\u00e1\u0005\u000f\u0000\u0000\u00e1\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e2\u00dd\u0001\u0000\u0000\u0000\u00e2\u00de\u0001\u0000\u0000"+
		"\u0000\u00e3\r\u0001\u0000\u0000\u0000\u00e4\u00eb\u0003P(\u0000\u00e5"+
		"\u00eb\u0003\u0010\b\u0000\u00e6\u00eb\u0003\u0012\t\u0000\u00e7\u00eb"+
		"\u00036\u001b\u0000\u00e8\u00eb\u0003D\"\u0000\u00e9\u00eb\u0003@ \u0000"+
		"\u00ea\u00e4\u0001\u0000\u0000\u0000\u00ea\u00e5\u0001\u0000\u0000\u0000"+
		"\u00ea\u00e6\u0001\u0000\u0000\u0000\u00ea\u00e7\u0001\u0000\u0000\u0000"+
		"\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000"+
		"\u00eb\u000f\u0001\u0000\u0000\u0000\u00ec\u00f5\u0005\f\u0000\u0000\u00ed"+
		"\u00f2\u0003\u000e\u0007\u0000\u00ee\u00ef\u0005\u0007\u0000\u0000\u00ef"+
		"\u00f1\u0003\u000e\u0007\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f5\u00ed\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7"+
		"\u00f8\u0005\r\u0000\u0000\u00f8\u0011\u0001\u0000\u0000\u0000\u00f9\u0106"+
		"\u0005\u000e\u0000\u0000\u00fa\u00fb\u0005V\u0000\u0000\u00fb\u00fc\u0005"+
		"\t\u0000\u0000\u00fc\u0103\u0003\u000e\u0007\u0000\u00fd\u00fe\u0005\u0007"+
		"\u0000\u0000\u00fe\u00ff\u0005V\u0000\u0000\u00ff\u0100\u0005\t\u0000"+
		"\u0000\u0100\u0102\u0003\u000e\u0007\u0000\u0101\u00fd\u0001\u0000\u0000"+
		"\u0000\u0102\u0105\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000"+
		"\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000"+
		"\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0106\u00fa\u0001\u0000\u0000"+
		"\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000"+
		"\u0000\u0108\u0109\u0005\u000f\u0000\u0000\u0109\u0013\u0001\u0000\u0000"+
		"\u0000\u010a\u010f\u0003\u0018\f\u0000\u010b\u010f\u0003\u001e\u000f\u0000"+
		"\u010c\u010f\u0003\u0006\u0003\u0000\u010d\u010f\u0003\n\u0005\u0000\u010e"+
		"\u010a\u0001\u0000\u0000\u0000\u010e\u010b\u0001\u0000\u0000\u0000\u010e"+
		"\u010c\u0001\u0000\u0000\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010f"+
		"\u0112\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110"+
		"\u0111\u0001\u0000\u0000\u0000\u0111\u0015\u0001\u0000\u0000\u0000\u0112"+
		"\u0110\u0001\u0000\u0000\u0000\u0113\u0114\u0005V\u0000\u0000\u0114\u0115"+
		"\u0005\t\u0000\u0000\u0115\u0116\u0003P(\u0000\u0116\u0117\u0005\b\u0000"+
		"\u0000\u0117\u0119\u0001\u0000\u0000\u0000\u0118\u0113\u0001\u0000\u0000"+
		"\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000"+
		"\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u012e\u0001\u0000\u0000"+
		"\u0000\u011c\u011d\u0005R\u0000\u0000\u011d\u011e\u0005\u001d\u0000\u0000"+
		"\u011e\u011f\u0005V\u0000\u0000\u011f\u0128\u0005\u0001\u0000\u0000\u0120"+
		"\u0129\u0003\u000e\u0007\u0000\u0121\u0122\u0005R\u0000\u0000\u0122\u0123"+
		"\u0005\u001d\u0000\u0000\u0123\u0126\u0005V\u0000\u0000\u0124\u0125\u0005"+
		"\u001d\u0000\u0000\u0125\u0127\u00034\u001a\u0000\u0126\u0124\u0001\u0000"+
		"\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0129\u0001\u0000"+
		"\u0000\u0000\u0128\u0120\u0001\u0000\u0000\u0000\u0128\u0121\u0001\u0000"+
		"\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u012b\u0001\u0000"+
		"\u0000\u0000\u012a\u012c\u0005\b\u0000\u0000\u012b\u012a\u0001\u0000\u0000"+
		"\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012e\u0001\u0000\u0000"+
		"\u0000\u012d\u0118\u0001\u0000\u0000\u0000\u012d\u011c\u0001\u0000\u0000"+
		"\u0000\u012e\u0017\u0001\u0000\u0000\u0000\u012f\u0130\u0005\u001e\u0000"+
		"\u0000\u0130\u0131\u0005V\u0000\u0000\u0131\u0135\u0005\n\u0000\u0000"+
		"\u0132\u0134\u0003\u001a\r\u0000\u0133\u0132\u0001\u0000\u0000\u0000\u0134"+
		"\u0137\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0135"+
		"\u0136\u0001\u0000\u0000\u0000\u0136\u0138\u0001\u0000\u0000\u0000\u0137"+
		"\u0135\u0001\u0000\u0000\u0000\u0138\u013c\u0005\u000b\u0000\u0000\u0139"+
		"\u013a\u0005\u001e\u0000\u0000\u013a\u013c\u0005V\u0000\u0000\u013b\u012f"+
		"\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013c\u0019"+
		"\u0001\u0000\u0000\u0000\u013d\u0141\u0005\u000e\u0000\u0000\u013e\u0140"+
		"\u0003\u001c\u000e\u0000\u013f\u013e\u0001\u0000\u0000\u0000\u0140\u0143"+
		"\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0142"+
		"\u0001\u0000\u0000\u0000\u0142\u0144\u0001\u0000\u0000\u0000\u0143\u0141"+
		"\u0001\u0000\u0000\u0000\u0144\u0145\u0005\u000f\u0000\u0000\u0145\u001b"+
		"\u0001\u0000\u0000\u0000\u0146\u015e\u0003\u0004\u0002\u0000\u0147\u015e"+
		"\u0003\n\u0005\u0000\u0148\u015e\u0003\u0006\u0003\u0000\u0149\u015e\u0003"+
		"\b\u0004\u0000\u014a\u014e\u0005\u000e\u0000\u0000\u014b\u014d\u0003("+
		"\u0014\u0000\u014c\u014b\u0001\u0000\u0000\u0000\u014d\u0150\u0001\u0000"+
		"\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000"+
		"\u0000\u0000\u014f\u0151\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000"+
		"\u0000\u0000\u0151\u015e\u0005\u000f\u0000\u0000\u0152\u0153\u0005$\u0000"+
		"\u0000\u0153\u0154\u0005\t\u0000\u0000\u0154\u0155\u0005Z\u0000\u0000"+
		"\u0155\u015e\u0005\u0007\u0000\u0000\u0156\u0157\u0005#\u0000\u0000\u0157"+
		"\u015a\u0005\t\u0000\u0000\u0158\u015b\u0005Z\u0000\u0000\u0159\u015b"+
		"\u00036\u001b\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015a\u0159\u0001"+
		"\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u015e\u0005"+
		"\u0007\u0000\u0000\u015d\u0146\u0001\u0000\u0000\u0000\u015d\u0147\u0001"+
		"\u0000\u0000\u0000\u015d\u0148\u0001\u0000\u0000\u0000\u015d\u0149\u0001"+
		"\u0000\u0000\u0000\u015d\u014a\u0001\u0000\u0000\u0000\u015d\u0152\u0001"+
		"\u0000\u0000\u0000\u015d\u0156\u0001\u0000\u0000\u0000\u015e\u001d\u0001"+
		"\u0000\u0000\u0000\u015f\u0160\u0005-\u0000\u0000\u0160\u0162\u0005\n"+
		"\u0000\u0000\u0161\u0163\u0003 \u0010\u0000\u0162\u0161\u0001\u0000\u0000"+
		"\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000"+
		"\u0000\u0164\u0165\u0005\u000b\u0000\u0000\u0165\u0168\u0005\u000e\u0000"+
		"\u0000\u0166\u0169\u0003\"\u0011\u0000\u0167\u0169\u0003\u0016\u000b\u0000"+
		"\u0168\u0166\u0001\u0000\u0000\u0000\u0168\u0167\u0001\u0000\u0000\u0000"+
		"\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u016b\u0005\u000f\u0000\u0000"+
		"\u016b\u001f\u0001\u0000\u0000\u0000\u016c\u016e\u0007\u0002\u0000\u0000"+
		"\u016d\u016c\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000"+
		"\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0176\u0005V\u0000\u0000\u0170"+
		"\u0171\u0005\t\u0000\u0000\u0171\u0174\u0003P(\u0000\u0172\u0173\u0005"+
		"\u0001\u0000\u0000\u0173\u0175\u0003\u000e\u0007\u0000\u0174\u0172\u0001"+
		"\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u0177\u0001"+
		"\u0000\u0000\u0000\u0176\u0170\u0001\u0000\u0000\u0000\u0176\u0177\u0001"+
		"\u0000\u0000\u0000\u0177\u0187\u0001\u0000\u0000\u0000\u0178\u017a\u0005"+
		"\u0007\u0000\u0000\u0179\u017b\u0007\u0002\u0000\u0000\u017a\u0179\u0001"+
		"\u0000\u0000\u0000\u017a\u017b\u0001\u0000\u0000\u0000\u017b\u017c\u0001"+
		"\u0000\u0000\u0000\u017c\u0183\u0005V\u0000\u0000\u017d\u017e\u0005\t"+
		"\u0000\u0000\u017e\u0181\u0003P(\u0000\u017f\u0180\u0005\u0001\u0000\u0000"+
		"\u0180\u0182\u0003\u000e\u0007\u0000\u0181\u017f\u0001\u0000\u0000\u0000"+
		"\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0184\u0001\u0000\u0000\u0000"+
		"\u0183\u017d\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000"+
		"\u0184\u0186\u0001\u0000\u0000\u0000\u0185\u0178\u0001\u0000\u0000\u0000"+
		"\u0186\u0189\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000"+
		"\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u0195\u0001\u0000\u0000\u0000"+
		"\u0189\u0187\u0001\u0000\u0000\u0000\u018a\u018b\u0005\u000e\u0000\u0000"+
		"\u018b\u0190\u0005V\u0000\u0000\u018c\u018d\u0005\u0007\u0000\u0000\u018d"+
		"\u018f\u0005V\u0000\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018f\u0192"+
		"\u0001\u0000\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0190\u0191"+
		"\u0001\u0000\u0000\u0000\u0191\u0193\u0001\u0000\u0000\u0000\u0192\u0190"+
		"\u0001\u0000\u0000\u0000\u0193\u0195\u0005\u000f\u0000\u0000\u0194\u016d"+
		"\u0001\u0000\u0000\u0000\u0194\u018a\u0001\u0000\u0000\u0000\u0195!\u0001"+
		"\u0000\u0000\u0000\u0196\u0198\u0003(\u0014\u0000\u0197\u0196\u0001\u0000"+
		"\u0000\u0000\u0198\u019b\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000"+
		"\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019d\u0001\u0000"+
		"\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019c\u019e\u0003$\u0012"+
		"\u0000\u019d\u019c\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000"+
		"\u0000\u019e#\u0001\u0000\u0000\u0000\u019f\u01a7\u0005:\u0000\u0000\u01a0"+
		"\u01a4\u0003\u000e\u0007\u0000\u01a1\u01a2\u0003&\u0013\u0000\u01a2\u01a3"+
		"\u0003\u000e\u0007\u0000\u01a3\u01a5\u0001\u0000\u0000\u0000\u01a4\u01a1"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a8"+
		"\u0001\u0000\u0000\u0000\u01a6\u01a8\u00036\u001b\u0000\u01a7\u01a0\u0001"+
		"\u0000\u0000\u0000\u01a7\u01a6\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001"+
		"\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01aa\u0005"+
		"\b\u0000\u0000\u01aa%\u0001\u0000\u0000\u0000\u01ab\u01ac\u0007\u0003"+
		"\u0000\u0000\u01ac\'\u0001\u0000\u0000\u0000\u01ad\u01b8\u0003\u0006\u0003"+
		"\u0000\u01ae\u01b8\u0003,\u0016\u0000\u01af\u01b8\u00030\u0018\u0000\u01b0"+
		"\u01b8\u00032\u0019\u0000\u01b1\u01b8\u00034\u001a\u0000\u01b2\u01b8\u0003"+
		"R)\u0000\u01b3\u01b8\u00036\u001b\u0000\u01b4\u01b8\u0003D\"\u0000\u01b5"+
		"\u01b8\u0003$\u0012\u0000\u01b6\u01b8\u0003\u0016\u000b\u0000\u01b7\u01ad"+
		"\u0001\u0000\u0000\u0000\u01b7\u01ae\u0001\u0000\u0000\u0000\u01b7\u01af"+
		"\u0001\u0000\u0000\u0000\u01b7\u01b0\u0001\u0000\u0000\u0000\u01b7\u01b1"+
		"\u0001\u0000\u0000\u0000\u01b7\u01b2\u0001\u0000\u0000\u0000\u01b7\u01b3"+
		"\u0001\u0000\u0000\u0000\u01b7\u01b4\u0001\u0000\u0000\u0000\u01b7\u01b5"+
		"\u0001\u0000\u0000\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b8)\u0001"+
		"\u0000\u0000\u0000\u01b9\u01bb\u0003\u0006\u0003\u0000\u01ba\u01b9\u0001"+
		"\u0000\u0000\u0000\u01bb\u01be\u0001\u0000\u0000\u0000\u01bc\u01ba\u0001"+
		"\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd\u01c2\u0001"+
		"\u0000\u0000\u0000\u01be\u01bc\u0001\u0000\u0000\u0000\u01bf\u01c1\u0003"+
		"\n\u0005\u0000\u01c0\u01bf\u0001\u0000\u0000\u0000\u01c1\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c3+\u0001\u0000\u0000\u0000\u01c4\u01c2\u0001\u0000\u0000"+
		"\u0000\u01c5\u01c6\u00056\u0000\u0000\u01c6\u01c7\u0005\n\u0000\u0000"+
		"\u01c7\u01c8\u0003.\u0017\u0000\u01c8\u01c9\u0005\u000b\u0000\u0000\u01c9"+
		"\u01cd\u0005\u000e\u0000\u0000\u01ca\u01cc\u0003(\u0014\u0000\u01cb\u01ca"+
		"\u0001\u0000\u0000\u0000\u01cc\u01cf\u0001\u0000\u0000\u0000\u01cd\u01cb"+
		"\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce\u01d0"+
		"\u0001\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01d0\u01da"+
		"\u0005\u000f\u0000\u0000\u01d1\u01d2\u00057\u0000\u0000\u01d2\u01d6\u0005"+
		"\u000e\u0000\u0000\u01d3\u01d5\u0003(\u0014\u0000\u01d4\u01d3\u0001\u0000"+
		"\u0000\u0000\u01d5\u01d8\u0001\u0000\u0000\u0000\u01d6\u01d4\u0001\u0000"+
		"\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7\u01d9\u0001\u0000"+
		"\u0000\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d9\u01db\u0005\u000f"+
		"\u0000\u0000\u01da\u01d1\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000"+
		"\u0000\u0000\u01db-\u0001\u0000\u0000\u0000\u01dc\u01dd\u0003N\'\u0000"+
		"\u01dd\u01de\u0007\u0004\u0000\u0000\u01de\u01df\u0003N\'\u0000\u01df"+
		"\u01e2\u0001\u0000\u0000\u0000\u01e0\u01e2\u0003N\'\u0000\u01e1\u01dc"+
		"\u0001\u0000\u0000\u0000\u01e1\u01e0\u0001\u0000\u0000\u0000\u01e2/\u0001"+
		"\u0000\u0000\u0000\u01e3\u01e4\u00058\u0000\u0000\u01e4\u01e6\u0005\n"+
		"\u0000\u0000\u01e5\u01e7\u0003\u0006\u0003\u0000\u01e6\u01e5\u0001\u0000"+
		"\u0000\u0000\u01e6\u01e7\u0001\u0000\u0000\u0000\u01e7\u01e9\u0001\u0000"+
		"\u0000\u0000\u01e8\u01ea\u0003.\u0017\u0000\u01e9\u01e8\u0001\u0000\u0000"+
		"\u0000\u01e9\u01ea\u0001\u0000\u0000\u0000\u01ea\u01ec\u0001\u0000\u0000"+
		"\u0000\u01eb\u01ed\u0005\b\u0000\u0000\u01ec\u01eb\u0001\u0000\u0000\u0000"+
		"\u01ec\u01ed\u0001\u0000\u0000\u0000\u01ed\u01ef\u0001\u0000\u0000\u0000"+
		"\u01ee\u01f0\u0003(\u0014\u0000\u01ef\u01ee\u0001\u0000\u0000\u0000\u01ef"+
		"\u01f0\u0001\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1"+
		"\u01f2\u0005\u000b\u0000\u0000\u01f2\u01f6\u0005\u000e\u0000\u0000\u01f3"+
		"\u01f5\u0003(\u0014\u0000\u01f4\u01f3\u0001\u0000\u0000\u0000\u01f5\u01f8"+
		"\u0001\u0000\u0000\u0000\u01f6\u01f4\u0001\u0000\u0000\u0000\u01f6\u01f7"+
		"\u0001\u0000\u0000\u0000\u01f7\u01f9\u0001\u0000\u0000\u0000\u01f8\u01f6"+
		"\u0001\u0000\u0000\u0000\u01f9\u01fa\u0005\u000f\u0000\u0000\u01fa1\u0001"+
		"\u0000\u0000\u0000\u01fb\u01fc\u00059\u0000\u0000\u01fc\u01fd\u0005\n"+
		"\u0000\u0000\u01fd\u01fe\u0003.\u0017\u0000\u01fe\u01ff\u0005\u000b\u0000"+
		"\u0000\u01ff\u0203\u0005\u000e\u0000\u0000\u0200\u0202\u0003(\u0014\u0000"+
		"\u0201\u0200\u0001\u0000\u0000\u0000\u0202\u0205\u0001\u0000\u0000\u0000"+
		"\u0203\u0201\u0001\u0000\u0000\u0000\u0203\u0204\u0001\u0000\u0000\u0000"+
		"\u0204\u0206\u0001\u0000\u0000\u0000\u0205\u0203\u0001\u0000\u0000\u0000"+
		"\u0206\u0207\u0005\u000f\u0000\u0000\u02073\u0001\u0000\u0000\u0000\u0208"+
		"\u0209\u0005V\u0000\u0000\u0209\u0212\u0005\n\u0000\u0000\u020a\u020f"+
		"\u0003N\'\u0000\u020b\u020c\u0005\u0007\u0000\u0000\u020c\u020e\u0003"+
		"N\'\u0000\u020d\u020b\u0001\u0000\u0000\u0000\u020e\u0211\u0001\u0000"+
		"\u0000\u0000\u020f\u020d\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000"+
		"\u0000\u0000\u0210\u0213\u0001\u0000\u0000\u0000\u0211\u020f\u0001\u0000"+
		"\u0000\u0000\u0212\u020a\u0001\u0000\u0000\u0000\u0212\u0213\u0001\u0000"+
		"\u0000\u0000\u0213\u0214\u0001\u0000\u0000\u0000\u0214\u0215\u0005\u000b"+
		"\u0000\u0000\u0215\u0216\u0005\b\u0000\u0000\u02165\u0001\u0000\u0000"+
		"\u0000\u0217\u021b\u00038\u001c\u0000\u0218\u021a\u0003>\u001f\u0000\u0219"+
		"\u0218\u0001\u0000\u0000\u0000\u021a\u021d\u0001\u0000\u0000\u0000\u021b"+
		"\u0219\u0001\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000\u0000\u021c"+
		"\u021e\u0001\u0000\u0000\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021e"+
		"\u021f\u0003:\u001d\u0000\u021f\u0222\u0001\u0000\u0000\u0000\u0220\u0222"+
		"\u0003<\u001e\u0000\u0221\u0217\u0001\u0000\u0000\u0000\u0221\u0220\u0001"+
		"\u0000\u0000\u0000\u02227\u0001\u0000\u0000\u0000\u0223\u0224\u0005\u0010"+
		"\u0000\u0000\u0224\u0225\u0005V\u0000\u0000\u0225\u0226\u0003B!\u0000"+
		"\u0226\u0227\u0005\u0011\u0000\u0000\u02279\u0001\u0000\u0000\u0000\u0228"+
		"\u0229\u0005\u0010\u0000\u0000\u0229\u022a\u0005\u0005\u0000\u0000\u022a"+
		"\u022b\u0005V\u0000\u0000\u022b\u022c\u0005\u0011\u0000\u0000\u022c;\u0001"+
		"\u0000\u0000\u0000\u022d\u022e\u0005\u0010\u0000\u0000\u022e\u022f\u0005"+
		"V\u0000\u0000\u022f\u0230\u0003B!\u0000\u0230\u0231\u0005\u001f\u0000"+
		"\u0000\u0231=\u0001\u0000\u0000\u0000\u0232\u0236\u00036\u001b\u0000\u0233"+
		"\u0236\u0003@ \u0000\u0234\u0236\u0005V\u0000\u0000\u0235\u0232\u0001"+
		"\u0000\u0000\u0000\u0235\u0233\u0001\u0000\u0000\u0000\u0235\u0234\u0001"+
		"\u0000\u0000\u0000\u0236?\u0001\u0000\u0000\u0000\u0237\u0238\u0005 \u0000"+
		"\u0000\u0238\u0239\u0003N\'\u0000\u0239\u023a\u0005!\u0000\u0000\u023a"+
		"A\u0001\u0000\u0000\u0000\u023b\u0241\u0003D\"\u0000\u023c\u0241\u0003"+
		"F#\u0000\u023d\u0241\u0003H$\u0000\u023e\u0241\u0003J%\u0000\u023f\u0241"+
		"\u0003L&\u0000\u0240\u023b\u0001\u0000\u0000\u0000\u0240\u023c\u0001\u0000"+
		"\u0000\u0000\u0240\u023d\u0001\u0000\u0000\u0000\u0240\u023e\u0001\u0000"+
		"\u0000\u0000\u0240\u023f\u0001\u0000\u0000\u0000\u0241\u0244\u0001\u0000"+
		"\u0000\u0000\u0242\u0240\u0001\u0000\u0000\u0000\u0242\u0243\u0001\u0000"+
		"\u0000\u0000\u0243C\u0001\u0000\u0000\u0000\u0244\u0242\u0001\u0000\u0000"+
		"\u0000\u0245\u0246\u0005\u0004\u0000\u0000\u0246\u0247\u0005V\u0000\u0000"+
		"\u0247\u0248\u0005\u0001\u0000\u0000\u0248\u0249\u0005Z\u0000\u0000\u0249"+
		"E\u0001\u0000\u0000\u0000\u024a\u024b\u0005V\u0000\u0000\u024b\u024c\u0005"+
		"\u0001\u0000\u0000\u024c\u024d\u0005Z\u0000\u0000\u024dG\u0001\u0000\u0000"+
		"\u0000\u024e\u024f\u0005\n\u0000\u0000\u024f\u0250\u0005V\u0000\u0000"+
		"\u0250\u0251\u0005\u000b\u0000\u0000\u0251\u0252\u0005\u0001\u0000\u0000"+
		"\u0252\u0253\u0005Z\u0000\u0000\u0253I\u0001\u0000\u0000\u0000\u0254\u0255"+
		"\u0005\f\u0000\u0000\u0255\u0256\u0005V\u0000\u0000\u0256\u0257\u0005"+
		"\r\u0000\u0000\u0257\u025a\u0005\u0001\u0000\u0000\u0258\u025b\u0005Z"+
		"\u0000\u0000\u0259\u025b\u0003@ \u0000\u025a\u0258\u0001\u0000\u0000\u0000"+
		"\u025a\u0259\u0001\u0000\u0000\u0000\u025bK\u0001\u0000\u0000\u0000\u025c"+
		"\u025d\u0005%\u0000\u0000\u025d\u025e\u0005\u0001\u0000\u0000\u025e\u025f"+
		"\u0005Z\u0000\u0000\u025fM\u0001\u0000\u0000\u0000\u0260\u0261\u0006\'"+
		"\uffff\uffff\u0000\u0261\u026e\u0005V\u0000\u0000\u0262\u0263\u0005V\u0000"+
		"\u0000\u0263\u0264\u0005\u001d\u0000\u0000\u0264\u026e\u0005V\u0000\u0000"+
		"\u0265\u026e\u0005Z\u0000\u0000\u0266\u026e\u0005W\u0000\u0000\u0267\u026e"+
		"\u0005X\u0000\u0000\u0268\u026e\u0005Y\u0000\u0000\u0269\u026e\u0003\u000e"+
		"\u0007\u0000\u026a\u026e\u00034\u001a\u0000\u026b\u026e\u0003\u0010\b"+
		"\u0000\u026c\u026e\u0003\u0012\t\u0000\u026d\u0260\u0001\u0000\u0000\u0000"+
		"\u026d\u0262\u0001\u0000\u0000\u0000\u026d\u0265\u0001\u0000\u0000\u0000"+
		"\u026d\u0266\u0001\u0000\u0000\u0000\u026d\u0267\u0001\u0000\u0000\u0000"+
		"\u026d\u0268\u0001\u0000\u0000\u0000\u026d\u0269\u0001\u0000\u0000\u0000"+
		"\u026d\u026a\u0001\u0000\u0000\u0000\u026d\u026b\u0001\u0000\u0000\u0000"+
		"\u026d\u026c\u0001\u0000\u0000\u0000\u026e\u0275\u0001\u0000\u0000\u0000"+
		"\u026f\u0270\n\u0001\u0000\u0000\u0270\u0271\u0003&\u0013\u0000\u0271"+
		"\u0272\u0003N\'\u0002\u0272\u0274\u0001\u0000\u0000\u0000\u0273\u026f"+
		"\u0001\u0000\u0000\u0000\u0274\u0277\u0001\u0000\u0000\u0000\u0275\u0273"+
		"\u0001\u0000\u0000\u0000\u0275\u0276\u0001\u0000\u0000\u0000\u0276O\u0001"+
		"\u0000\u0000\u0000\u0277\u0275\u0001\u0000\u0000\u0000\u0278\u0279\u0007"+
		"\u0005\u0000\u0000\u0279Q\u0001\u0000\u0000\u0000\u027a\u027b\u00051\u0000"+
		"\u0000\u027b\u027c\u0005\u001d\u0000\u0000\u027c\u027d\u00052\u0000\u0000"+
		"\u027d\u027e\u0005\n\u0000\u0000\u027e\u027f\u0003N\'\u0000\u027f\u0280"+
		"\u0005\u000b\u0000\u0000\u0280\u0281\u0005\b\u0000\u0000\u0281S\u0001"+
		"\u0000\u0000\u0000RW^`dgqtw\u007f\u0086\u008e\u0091\u0094\u0097\u009f"+
		"\u00a4\u00aa\u00b1\u00b5\u00bb\u00c3\u00c6\u00cd\u00d2\u00d7\u00e2\u00ea"+
		"\u00f2\u00f5\u0103\u0106\u010e\u0110\u011a\u0126\u0128\u012b\u012d\u0135"+
		"\u013b\u0141\u014e\u015a\u015d\u0162\u0168\u016d\u0174\u0176\u017a\u0181"+
		"\u0183\u0187\u0190\u0194\u0199\u019d\u01a4\u01a7\u01b7\u01bc\u01c2\u01cd"+
		"\u01d6\u01da\u01e1\u01e6\u01e9\u01ec\u01ef\u01f6\u0203\u020f\u0212\u021b"+
		"\u0221\u0235\u0240\u0242\u025a\u026d\u0275";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}