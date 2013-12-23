grammar RobotOS;

@parser::header {
package com.nevermindsoft.antlr;
}

fragment 
DIGIT    : [0-9] ;
fragment
ESCAPE   : '\\' [\\"n] ;

COMMENT  : '#' ( '\r' | '\n' )* ~( '\r' | '\n' )* -> skip;

MULTIPLY : '*'   ;
DIVIDE   : '/'   ;
PLUS     : '+'   ;
MINUS    : '-'   ;
ASSIGN   : '='   ;
EXPONENT : '^'   ;
INCREASE : '++'  ;
DECREASE : '--'  ;
INT      : DIGIT+ ;
DOUBLE   : DIGIT+ ('.' DIGIT+)? ;
STRING   : '"' ( ESCAPE | . )*? '"' ;
LPAR     : '(' ;
RPAR     : ')' ;
PRINT    : 'print' ;
TRUE     : 'true' ;
FALSE    : 'false' ;
ID       : [a-z][a-z0-1_]+ ;

NEW_LINE : ('\n' | '\r')+  ;
WS       : (' ' | '\t' | '\r' | '\n')+ ->skip ;


atomic
    : INT
    | DOUBLE
    | ID
    | STRING
    | TRUE
    | FALSE
    ;

unary_operation
    : ( INCREASE | DECREASE ) atomic
    | ( PLUS | MINUS ) atomic
    ;

power_operation
    : ( atomic | unary_operation ) EXPONENT ( atomic | unary_operation | binary_operation )
    ;

multiplication_division_operation
    : ( atomic | unary_operation ) ( MULTIPLY | DIVIDE ) ( atomic | unary_operation | binary_operation )
    ;

addition_subtraction_operation
    : ( atomic | unary_operation ) ( PLUS | MINUS ) ( atomic | unary_operation | binary_operation )
    ;

binary_operation
    : power_operation
    | multiplication_division_operation
    | addition_subtraction_operation
    ;

assignment
    : ID ASSIGN ( unary_operation | binary_operation | atomic )
    ;

expr
    : atomic
    | unary_operation
    | binary_operation
    | assignment
    ;

print
    : 'print' expr
    ;

line
    : ( print | expr ) NEW_LINE
    ;

program
    : line* EOF
    ;