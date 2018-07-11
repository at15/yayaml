grammar YAML;

// TODO: not working, just copied from RCL, not handling any indent

// FIXME: change to virual token ?...
//tokens { INDENT, DEDENT }

// start of parser
pair
    : k=ID ':' value
    | k=STRING ':' value
    ;

value
    : BOOL    #ValBool
    | INT     #ValInt // TODO: negative number
    | DOUBLE  #ValDouble
    | STRING  #ValString
    | obj     #ValObj
    ;

obj
    : NEWLINE INDENT pair DEDENT
    ;

// start of lexer
BOOL
    : 'true'
    | 'false'
    ;

INT
    : '0'
    | [1-9] DIGIT*
    ;

DOUBLE
    : DIGIT+ '.' DIGIT+
    ;

STRING
    : '"' (ESC | ~["\\])* '"'
    ;

ID
    : [a-z] ID_LETTER*
    ;

// FIXME: change to virual token ?... also white space is not handled
INDENT: '{';
DEDENT: '}';

fragment DIGIT
    : [0-9]
    ;

fragment ESC
    : '\\' ["\\/bfnrt]
    ;

fragment ID_LETTER
    : [a-z]
    | [A-Z]
    | '_'
    ;

NEWLINE
    : '\r'? '\n'
    ;
