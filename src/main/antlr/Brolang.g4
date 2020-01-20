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
;

assignStmt: typeSpecifier ID IS variableexpr NEXT_STATEMENT;
elsecondition: ELSE;
elseifcondition: ELSE ifcondition;
ifcondition: IF variableexpr EQUALS variableexpr BLOCK_OPEN;
printstmt: SAY variableexpr NEXT_STATEMENT;
expr: variableexpr;

equalityexpr: 
    (variableexpr EQUALS variableexpr) | 
    (variableexpr NOT_EQUALS variableexpr);
    
variableexpr: (ID | INT | STRING | FLOAT);
endscope: BLOCK_CLOSE;

typeSpecifier:
    'brint'
    |   'bring'
    |   'broat'
;

/** LEXER */

fragment LETTER: [a-zA-Z] ;
fragment DIGIT: [0-9] ;

BLOCK_OPEN: '{';
BLOCK_CLOSE: '}';
SAY: 'bray';
SET: 'set';
TO: 'to';
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
WS: (' '|'\r'|'\t') -> channel(HIDDEN);
