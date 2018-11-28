grammar X0;

program
    : 'main' '{' declarationList statementList '}'
    ;

declarationList
    : declarationStat*
    ;

declarationStat
    : type ident ';'                                # declElementary
    | type ident '[' NUM (']' '[' NUM)* ']' ';'     # declArray
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
    ;

continueStat: CONTINUE;
breakStat: BREAK;

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
    | '++' var                  # exprSelfIncrease
    | '--' var                  # exprSelfDecrease
    | simpleExpr                # exprSimpleWrapper
    ;

simpleExpr
    : simpleExpr OR conditionTerm                 # conditionExprRecursive
    | conditionTerm                               # conditionExprSimple
    ;

conditionTerm
    : conditionTerm AND conditionFactor           # conditionTermRecursive
    | NOT? conditionFactor                        # conditionTermNot
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
    : term op = (MUL | DIV | MOD) factor         # termRecursive
    | factor                                     # termDefault
    ;

factor
    : '(' expression ')'        # factorRecursive
    | var                       # factorVariable
    | literal                   # factorLiteral
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
INT: 'int';
CHAR: 'char';
STR: 'str';
FLOAT: 'float';
BOOL: 'bool';
TRUE: 'true';
FALSE: 'false';
CONTINUE: 'continue';
BREAK: 'break';
AND: 'and';
OR: 'or';
NOT: 'not';
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
