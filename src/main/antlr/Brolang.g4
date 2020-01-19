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

assignStmt: typeSpecifier ID IS expr;
ifcondition: IF expr EQUALS expr BLOCK_OPEN;
elsecondition: ELSE;
elseifcondition: ELSE IF;
printstmt: SAY expr NEXT_STATEMENT;
expr: (ID | INT | STRING | FLOAT);
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
EQUALS: '==';
AS: 'bras';
IS: 'bris';
ELSE: 'brelse';
ID: [a-zA-Z_]+[a-zA-Z0-9_]*;
NEXT_STATEMENT: '\n';
WS: (' '|'\r'|'\t') -> channel(HIDDEN);
