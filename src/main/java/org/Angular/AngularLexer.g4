lexer grammar AngularLexer;

// Tokens

// Symbols
EQUAL             : '=';
PLUS              : '+';
MINUS             : '-';
STAR              : '*';
DIVISION          : '/';
PERCENT           : '%';
COMMA             : ',';
SEMI              : ';';
COLON             : ':';
LEFTPAREN         : '(';
RIGHTPAREN        : ')';
LEFTBRACKET       : '[';
RIGHTBRACKET      : ']';
LEFTCURLY         : '{';
RIGHTCURLY        : '}';
LESSTHAN          : '<';
GREATERTHAN       : '>';
LESSEQUAL         : '<=';
GREATEREQUAL      : '>=';
ARROW             : '=>';
EQ                : '==';
NEQ               : '!=';
AND               : '&&';
OR                : '||';
PLUSPLUS          : '++';
MINUSMINUS        : '--';
SQ                : '\'';
DQ                : '"';
DOT               : '.';
AT                : '@';

// Keywords
COMPONENT         : 'component';
TEMPLATE          : 'template';
CLASS             : 'class';
INPUT             : 'input';
OUTPUT            : 'output';
PROPERTY          : 'property';
IMPORT            : 'import';
EXPORT            : 'export';
DEFAULT           : 'default';
FROM              : 'from';
CONSTRUCTOR       : 'constructor';
EXTENDS           : 'extends';
IMPLEMENTS        : 'implements';
FUNCTION          : 'function';
CONSOLE           : 'console';
LOG               : 'log';
VAR               : 'var';
LET               : 'let';
CONST             : 'const';
IF                : 'if';
ELSE              : 'else';
FOR               : 'for';
WHILE             : 'while';
RETURN            : 'return';
NULL              : 'null';
ANY               : 'any';
SWITCH            : 'switch';
CASE              : 'case';
DO                : 'do';
BREAK             : 'break';
CONTINUE          : 'continue';
TRY               : 'try';
CATCH             : 'catch';
FINALLY           : 'finally';
THROW             : 'throw';
ASYNC             : 'async';
AWAIT             : 'await';
TYPE              : 'type';
ENUM              : 'enum';
INTERFACE         : 'interface';
PUBLIC            : 'public';
PRIVATE           : 'private';
PROTECTED         : 'protected';
TEMPLATE_LITERAL  : '`' .*? '`';

// Values
ID                : [a-zA-Z_][a-zA-Z0-9_]*;
INT               : [0-9]+ ;
DOUBLE            : [0-9]+ ('.' [0-9]*)? | '.' [0-9]+ ;
BOOLEAN           : 'true' | 'false';
STRING            : '"' ( ESCAPE | ~["\\] )* '"' | '\'' ( ESCAPE | ~['\\] )* '\'';
fragment ESCAPE   : '\\' [\\"'];

// Directives
NGIF                : 'ngIf';
NGSWITCH            : 'ngSwitch';
NGFOR               : 'ngFor';
NGSTYLE             : 'ngStyle';
NGCLASS             : 'ngClass';

// Whitespace and Comments
WS                : [ \t\r\n]+ -> skip;
COMMENT           : '//' ~[\r\n]* -> skip;
BLOCK_COMMENT     : '/*' .*? '*/' -> skip;
