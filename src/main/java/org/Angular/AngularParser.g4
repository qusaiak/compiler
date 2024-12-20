parser grammar AngularParser ;

options {tokenVocab=AngularLexer;}

// Program
program : (importStatement)* (variableDeclaration | classDeclaration | functionDeclaration | componentDeclaration)* exportStatement?;

// Main Parts
importStatement
    : IMPORT (ID | LEFTCURLY (ID (COMMA ID)*)? RIGHTCURLY) FROM STRING SEMI;
exportStatement
     : EXPORT (DEFAULT? (CLASS ID LEFTCURLY) ) SEMI;
variableDeclaration
    : (VAR | LET | CONST) ID EQUAL (value | array | object | functionDeclaration) SEMI;
classDeclaration
    : CLASS ID (EXTENDS ID)? (IMPLEMENTS ID (COMMA ID)*)? LEFTCURLY classBody RIGHTCURLY;
functionDeclaration
    : FUNCTION ID LEFTPAREN parameters? RIGHTPAREN LEFTCURLY functionBody RIGHTCURLY;
componentDeclaration
    : decorator LEFTCURLY componentBody RIGHTCURLY;

// Values
value
    : STRING
    | INT
    | DOUBLE
    | BOOLEAN
    | NULL
    | array
    | object
    | jsxElement
    | directive;

array
    : LEFTBRACKET (value (COMMA value)*)? RIGHTBRACKET;

object
    : LEFTCURLY (ID COLON value (COMMA ID COLON value)*)? RIGHTCURLY;

// Classes
classBody
   :   decorator | functionDeclaration | variableDeclaration| constructorDeclaration;

constructorDeclaration
    : CONSTRUCTOR LEFTPAREN parameters? RIGHTPAREN LEFTCURLY functionBody RIGHTCURLY;

// Decorators
decorator
    : AT ID LEFTPAREN decoratorArguments? RIGHTPAREN
    | AT ID
    ;

decoratorArguments
    : (ID COLON value | LEFTCURLY .*? RIGHTCURLY) (COMMA (ID COLON value | LEFTCURLY .*? RIGHTCURLY))*;

// Functions
parameters
    : ID (COLON type)? (COMMA ID (COLON type)?)*
    | LEFTCURLY ID (COMMA ID)* RIGHTCURLY;

functionBody
    : statement* returnStatement?;

returnStatement
    : RETURN (value | jsxElement)? SEMI;

statement
    : variableDeclaration
    | ifStatement
    | forStatement
    | whileStatement
    | callFunction
    | printStatement
    | jsxElement
    | directive;

// Component
componentBody
    : variableDeclaration* functionDeclaration*;

// Conditionals And Loops
ifStatement
    : IF LEFTPAREN condition RIGHTPAREN LEFTCURLY statement* RIGHTCURLY (ELSE LEFTCURLY statement* RIGHTCURLY)?;

condition
    : expression (AND | OR) expression | expression;

forStatement
    : FOR LEFTPAREN variableDeclaration? condition? SEMI? statement? RIGHTPAREN LEFTCURLY statement* RIGHTCURLY;

whileStatement
    : WHILE LEFTPAREN condition RIGHTPAREN LEFTCURLY statement* RIGHTCURLY;

// Expressions
expression
    : value
    | ID
    | ID DOT ID
    | callFunction
    | directive;

// Directives
directive
    : NGIF LEFTPAREN condition RIGHTPAREN
    | NGSWITCH LEFTPAREN expression RIGHTPAREN
    | NGFOR LEFTPAREN expression RIGHTPAREN
    | NGSTYLE LEFTPAREN expression RIGHTPAREN
    | NGCLASS LEFTPAREN expression RIGHTPAREN;

// Function Calls
callFunction
    : ID LEFTPAREN (expression (COMMA expression)*)? RIGHTPAREN SEMI;

// JSX For HTML
jsxElement
    : LESSTHAN ID (jsxAttribute | jsxClass | directive)* GREATERTHAN content* LESSTHAN DIVISION ID GREATERTHAN;

jsxAttribute
    : ID EQUAL expression;

jsxClass
    : CLASS EQUAL STRING;

content
    : jsxElement
    | shortIf
    | callFunction
    | ID;

// Short if
shortIf
    : LEFTCURLY condition AND jsxElement RIGHTCURLY;

// Types
type
    : ID
    | STRING
    | INT
    | DOUBLE
    | BOOLEAN;

// Print
printStatement
    : CONSOLE DOT LOG LEFTPAREN expression RIGHTPAREN SEMI;