grammar X0;

program
    : declarationList procedureList 'main' '{' declarationList statementList '}'
    ;

procedureList
    : procedure*
    ;

procedure
    : FUNCTION ident '(' (procedureArgument (',' procedureArgument)*)? ')' '{' declarationList statementList '}'
    ;

procedureArgument
    : ident REF?
    ;

declarationList
    : declarationStat*
    ;

declarationStat
    : type identDecl (',' identDecl)* ';'
    | CONST constDecl (',' constDecl)* ';'
    ;

constDecl
    : ident '=' expression
    ;

identDecl
    : ident                                                 # identDeclElementary
    | ident '[' expression (']' '[' expression)* ']'        # identDeclArray
    ;

ident
    : ID_STRING
    ;

type
    : INT                       # typeInt
    | CHAR                      # typeChar
    | STR                       # typeStr
    | FLOAT                     # typeFloat
    | BOOL                      # typeBool
    ;

var
    : ident                                                 # varElementary
    | ident '[' expression (']' '[' expression )* ']'       # varArray
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
    | continueStat
    | breakStat
    | exitStat
    | returnStat
    | doWhileStat
    | repeatUntilStat
    ;

continueStat: CONTINUE ';';
breakStat: BREAK ';';
returnStat: RETURN expression? ';';
exitStat: EXIT ';';

ifStat
    : 'if' '(' expression ')' statement ('else' statement)?
    ;

whileStat
    : 'while' '(' expression ')' statement
    ;

forStat
    : 'for' '(' expression ';' expression ';' expression ')' statement
    ;

doWhileStat
    : 'do' statement 'while' '(' expression ')' ';'
    ;

repeatUntilStat
    : 'repeat' statement 'until' '(' expression ')' ';'
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
    | '++' var                  # exprSelfIncrease
    | '--' var                  # exprSelfDecrease
    | simpleExpr                # exprSimpleWrapper
    ;

callExpr
    : ident '(' (callArgument (',' callArgument)* )? ')'
    ;

callArgument
    : var
    | expression
    ;

simpleExpr
    : simpleExpr OR conditionTerm                 # conditionExprRecursive
    | conditionTerm                               # conditionExprSimple
    ;

conditionTerm
    : conditionTerm AND conditionTermNot          # conditionTermRecursive
    | conditionTermNot                            # conditionTermWrapper
    ;

conditionTermNot
    : NOT? ODD? conditionFactor
    ;

conditionFactor
    : additiveExpr op = (GT | GEQ | LT | LEQ | EQ | NEQ) additiveExpr
    | additiveExpr
    ;

additiveExpr
    : additiveExpr op = (PLUS | MINUS) term      # additiveExprRecursive
    | (PLUS | MINUS)? term                       # additiveExprDefault
    ;

term
    : term op = (MUL | DIV | MOD | XOR) factor         # termRecursive
    | factor                                           # termDefault
    ;

factor
    : '(' expression ')'        # factorRecursive
    | var                       # factorVariable
    | literal                   # factorLiteral
    | callExpr                  # factorCall
    ;

literal
    : (PLUS | MINUS)? NUM                           # literalInteger
    | STRING                                        # literalString
    | (TRUE | FALSE)                                # literalBool
    | (PLUS | MINUS)? DecimalFloatingPointLiteral   # literalFloat
    ;

DecimalFloatingPointLiteral
    : NUM '.' NUM? ExponentPart?
    | '.' NUM ExponentPart?
    | NUM ExponentPart
    ;

fragment ExponentPart: [eE] (PLUS | MINUS)? NUM;

COMMENT: '/*' .*? '*/' -> skip;
CONST: 'const';
RETURN: 'return';
INT: 'int';
CHAR: 'char';
STR: 'str';
FLOAT: 'float';
BOOL: 'bool';
TRUE: 'true';
FALSE: 'false';
CONTINUE: 'continue';
BREAK: 'break';
EXIT: 'exit';
AND: 'and';
OR: 'or';
NOT: 'not';
ODD: 'odd';
FUNCTION: 'function';
XOR: 'xor';
REF: 'ref';
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
