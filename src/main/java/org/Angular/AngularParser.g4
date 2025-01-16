parser grammar AngularParser ;

options {tokenVocab=AngularLexer;}

// Program
program : (importStatement)* (variableDeclaration | classDeclaration | functionDeclaration | componentDeclaration)* exportStatement? | EOF;

// Main Parts
importStatement
    : IMPORT (ID | LEFTCURLY (ID (COMMA ID)*)? RIGHTCURLY) FROM STRING SEMI;
exportStatement
    : EXPORT (DEFAULT? (classDeclaration | variableDeclaration | functionDeclaration | componentDeclaration | object) | LEFTCURLY (ID (COMMA ID)*)? RIGHTCURLY) ;

variableDeclaration
    : (VAR | LET | CONST) ID EQUAL (value | array | object | functionDeclaration) SEMI;
classDeclaration
    : CLASS ID (EXTENDS ID)? (IMPLEMENTS ID (COMMA ID)*)? LEFTCURLY classBody RIGHTCURLY;
functionDeclaration
    : FUNCTION ID LEFTPAREN parameters? RIGHTPAREN LEFTCURLY functionBody RIGHTCURLY;
componentDeclaration
    : decorator | LEFTCURLY componentBody RIGHTCURLY;

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
    | angularDirective
    | interpolation
    | ANY
    ;

array
    : LEFTBRACKET (value (COMMA value)*)? RIGHTBRACKET;

object
    : LEFTCURLY (ID COLON value (COMMA ID COLON value)*)? RIGHTCURLY;

// Classes
classBody
   : decorator
   | functionDeclaration
   | variableDeclaration
   | constructorDeclaration
   | assignment
   ;

assignment
: (ID COLON (ID|ANY|NULL) SEMI)*;

constructorDeclaration
    : CONSTRUCTOR LEFTPAREN parameters? RIGHTPAREN LEFTCURLY functionBody RIGHTCURLY;

// Decorators
decorator
    : AT ID LEFTPAREN decoratorArguments? RIGHTPAREN
    | AT ID
    ;

decoratorArguments: decoratorArgument*;

decoratorArgument:
     LEFTCURLY argumentContent* RIGHTCURLY ;

argumentContent
        : exportStatement
        | functionDeclaration
        | variableDeclaration
        | classDeclaration
        | LEFTCURLY (statement)* RIGHTCURLY
        | SELECTOR COLON STRING COMMA
        | TEMPLATEURL COLON STRING COMMA
        ;

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
    | angularDirective;

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

// Function Calls
callFunction
    : ID LEFTPAREN (expression (COMMA expression)*)? RIGHTPAREN SEMI;

// Jsx Element
jsxElement
    : openingTag jsxContent* closingTag
    | selfClosingTag
    ;

// Opening Tag
openingTag
    : LESSTHAN ID jsxAttributes GREATERTHAN
    ;

// Closing Tag
closingTag
    : LESSTHAN DIVISION ID GREATERTHAN
    ;

// Self-Closing Tag
selfClosingTag
    : LESSTHAN ID jsxAttributes SLASHGREATERTHAN
    ;

// jsx Content
jsxContent
    : jsxElement
    | interpolation
    | ID
    ;

// Interpolation
interpolation
    : DOUBLELEFTCURLY expression DOUBLERIGHTCURLY
    ;

// jsx Attributes
jsxAttributes
    : (angularDirective | jsxAttribute | jsxEvent | jsxBinding | jsxClass)*
    ;

// Angular Directive
angularDirective
    : STAR ID EQUAL STRING
    ;

// jsx Attribute
jsxAttribute
    : ID EQUAL STRING
    ;

// jsx Event
jsxEvent
    : LEFTPAREN ID RIGHTPAREN EQUAL STRING
    ;

// jsx Binding
jsxBinding
    : LEFTBRACKET ID RIGHTBRACKET EQUAL (STRING | interpolation)
    ;

// jsx Class
jsxClass
    : CLASS EQUAL STRING
    ;

// Expression
expression
    : ID
    | ID DOT ID
    | STRING
    | INT
    | DOUBLE
    | BOOLEAN
    | value
    | callFunction
    | array
    | object
    ;

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