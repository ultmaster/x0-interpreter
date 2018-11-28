grammar X0;

program
    : 'main' '{' declarationList statementList '}'
    ;

declarationList
    : declarationStat*
    ;

declarationStat
    : type ident ';'               # declElementary
    | type ident '[' NUM ']' ';'   # declArray
    ;

ident
    : ID_STRING
    ;

type
    : INT                       # typeInt
    | CHAR                      # typeChar
    | STR                       # typeStr
    ;

var
    : ident                        # varElementary
    | ident '[' expression ']'     # varArray
    ;

statementList
    : statement+
    ;

statement
    : ifStat
    | whileStat
    | readStat
    | writeStat
    | compoundStat
    | expressionStat
    | forStat
    ;

ifStat
    : 'if' '(' expression ')' statement ('else' statement)?
    ;

whileStat
    : 'while' '(' expression ')' statement
    ;

forStat
    : 'for' '(' expression ';' expression ';' expression ')' statement
    ;

writeStat
    : 'write' expression ';'
    ;

readStat
    : 'read' var ';'
    ;

compoundStat
    : '{' statementList '}'
    ;

expressionStat
    : expression? ';'
    ;

expression
    : var '=' expression        # exprAssign
    | simpleExpr                # exprSimpleWrapper
    ;

simpleExpr
    : additiveExpr
    | relationExpr
    ;

relationExpr
    : additiveExpr op = (GT | GEQ | LT | LEQ | EQ | NEQ) additiveExpr
    ;

additiveExpr
    : additiveExpr op = (PLUS | MINUS) term      # additiveExprRecursive
    | (PLUS | MINUS)? term                       # additiveExprDefault
    ;

term
    : term op = (MUL | DIV | MOD) factor               # termRecursive
    | factor                                     # termDefault
    ;

factor
    : '(' expression ')'        # factorRecursive
    | var                       # factorVariable
    | literal                   # factorLiteral
    ;

literal
    : NUM                          # literalInteger
    | STRING                       # literalString
    ;


COMMENT: '/*' .*? '*/' -> skip;
INT: 'int';
CHAR: 'char';
STR: 'str';
ID_STRING: [a-zA-Z][a-zA-Z0-9]* ;
NUM: [0-9]+;
PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
MOD: '%';
GT: '>';
GEQ: '>=';
LT: '<';
LEQ: '<=';
EQ: '==';
NEQ: '!=';
STRING: '"' ~["\\\r\n]*? '"';
WS: [ \t\r\n] -> skip;


