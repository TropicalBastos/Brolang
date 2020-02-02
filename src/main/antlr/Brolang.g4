grammar Brolang;

/** PARSER */

compilationUnit: stmt*;
stmt:
    assignStmt
    | printstmt
    | ifcondition
    | elsecondition
    | elseifcondition
    | endscope
    | startscope
;

assignStmt: typeSpecifier ID IS variableexpr NEXT_STATEMENT;
elsecondition: ELSE;
elseifcondition: ELSE ifcondition;
ifcondition: IF (equalityexpr | notequalexpr | variableexpr | boolexpr) BLOCK_OPEN NEXT_STATEMENT?;
printstmt: PRINT variableexpr NEXT_STATEMENT;

boolexpr: (andexpr | orexpr)+;
andexpr: expr andterm expr;
orexpr: expr orterm expr;

equalityexpr: variableexpr equalsexpr variableexpr;
notequalexpr: variableexpr nequalexpr variableexpr;

andterm: AND;
orterm: OR;
equalsexpr: EQUALS;
nequalexpr: NOT_EQUALS;

startscope: BLOCK_OPEN;
endscope: BLOCK_CLOSE;

expr: 
    variableexpr |
    equalityexpr |
    notequalexpr;

variableexpr: (ID | INT | STRING | FLOAT);

typeSpecifier:
    'brinteger'
    |   'bring'
    |   'broat'
;

/** LEXER */

fragment LETTER: [a-zA-Z] ;
fragment DIGIT: [0-9] ;

BLOCK_OPEN: '{';
BLOCK_CLOSE: '}';
PRINT: 'brint';
INT: DIGIT+ ('.' DIGIT+)?;
STRING: '"' (~('\n' | '"'))* '"';
FLOAT: DIGIT+ ('.' DIGIT+);
IF: 'brif';
NOT_EQUALS: 'broesn\'t brequal';
EQUALS: 'brequals';
AS: 'bras';
IS: 'bris';
AND: 'brand';
OR: 'bror';
ELSE: 'brelse';
ID: [a-zA-Z_]+[a-zA-Z0-9_]*;
NEXT_STATEMENT: '\n';
WS: (' '|'\r'|'\t'|'\n') -> channel(HIDDEN);
