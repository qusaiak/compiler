parser grammar AngularParser ;

options {tokenVocab=AngularLexer;}

// Program
program : (importStatement)* (classDeclaration | variableDeclaration | functionDeclaration)* exportStatement?;

// Main Parts
importStatement
    : IMPORT (ID | LEFTCURLY (ID (COMMA ID)*)? RIGHTCURLY) FROM STRING SEMI;
exportStatement
    : EXPORT (DEFAULT? ID | DEFAULT CLASS ID) SEMI;
variableDeclaration
    : (VAR | LET | CONST) ID EQUAL (value | array | object | functionDeclaration) SEMI;
classDeclaration
    : CLASS ID (EXTENDS ID)? (IMPLEMENTS ID (COMMA ID)*)? LEFTCURLY classBody RIGHTCURLY;
functionDeclaration
    : FUNCTION ID LEFTPAREN parameters? RIGHTPAREN LEFTCURLY functionBody RIGHTCURLY;

// Values
value
    : STRING
    | INT
    | DOUBLE
    | BOOLEAN
    | NULL
    | array
    | object;

array
    : LEFTBRACKET (value (COMMA value)*)? RIGHTBRACKET;

object
    : LEFTCURLY (ID COLON value (COMMA ID COLON value)*)? RIGHTCURLY;

// Classes
classBody
    : (decorator? classMember)*;

classMember
    : (variableDeclaration | functionDeclaration | constructorDeclaration);

constructorDeclaration
    : CONSTRUCTOR LEFTPAREN parameters? RIGHTPAREN LEFTCURLY functionBody RIGHTCURLY;

// Decorators
decorator
    : AT ID LEFTPAREN decoratorArguments? RIGHTPAREN;

decoratorArguments
    : (ID COLON value (COMMA ID COLON value)*);

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
    | jsxElement;

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
    | callFunction;

// Function Calls
callFunction
    : ID LEFTPAREN (expression (COMMA expression)*)? RIGHTPAREN SEMI;

// JSX For HTML
jsxElement
    : LESSTHAN ID (jsxAttribute | jsxClass)* GREATERTHAN content* LESSTHAN DIVISION ID GREATERTHAN;

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