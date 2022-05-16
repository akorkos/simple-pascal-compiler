grammar SimplePascal;

/* Parser */

program                 : header declarations subprograms comp_statement DOT;

header                  : PROGRAM ID SEMI;

declarations            : constdefs typedefs vardefs;

constdefs               : CONST constant_defs SEMI
                        |
                        ;

constant_defs           : constant_defs SEMI ID EQU expression
                        | ID EQU expression;

expression              : expression OROP expression
                        | expression MULDIVANDOP expression
                        | expression ADDOP expression
                        | expression (INOP | RELOP | EQU) expression
                        | NOTOP expression
                        | ADDOP expression
                        | variable
                        | ID LPAREN expressions RPAREN
                        | constant
                        | LPAREN expression RPAREN
                        | setexpression;

variable                : ID
                        | variable DOT ID
                        | variable LBRACK expressions RBRACK;

expressions             : expressions COMMA expression
                        | expression;

constant                : ICONST
                        | RCONST
                        | BCONST
                        | CCONST;

setexpression           : LBRACK elexpressions RBRACK
                        | LBRACK RBRACK;

elexpressions           : elexpressions COMMA elexpression
                        | elexpression;

elexpression            : expression DOTDOT expression
                        | expression;

typedefs                : TYPE type_defs SEMI
                        |
                        ;

type_defs               : type_defs SEMI ID EQU type_def
                        | ID EQU type_def;

type_def                : ARRAY LBRACK dims RBRACK OF typename
                        | SET OF typename
                        | RECORD fields END
                        | LPAREN identifiers RPAREN
                        | limit DOTDOT limit;

dims                    : dims COMMA limits
                        | limits;

limits                  : limit DOTDOT limit
                        | ID;

limit                   : ADDOP ICONST
                        | ICONST
                        | ADDOP ID
                        | CCONST
                        | BCONST
                        | ID;

typename                : standard_type
                        | ID;

standard_type           : INTEGER
                        | REAL
                        | BOOLEAN
                        | CHAR;

fields                  : fields SEMI field
                        | field;

field                   : identifiers COLON typename;

identifiers             : identifiers COMMA ID
                        | ID;

vardefs                 : VAR variable_defs SEMI
                        |
                        ;

variable_defs           : variable_defs SEMI identifiers COLON typename
                        | identifiers COLON typename;

subprograms             : subprograms subprogram SEMI
                        |
                        ;

subprogram              : sub_header SEMI FORWARD
                        | sub_header SEMI declarations subprograms comp_statement;

sub_header              : FUNCTION ID formal_parameters COLON standard_type
                        | PROCEDURE ID formal_parameters
                        | FUNCTION ID;

formal_parameters       : LPAREN parameter_list RPAREN
                        |
                        ;

parameter_list          : parameter_list SEMI pass identifiers COLON typename
                        | pass identifiers COLON typename;

pass                    : VAR
                        |
                        ;

comp_statement          : BEGIN statements END;

statements              : statements SEMI statement
                        | statement;

statement               : assignment
                        | if_statement
                        | while_statement
                        | for_statement
                        | with_statement
                        | subprogram_call
                        | io_statement
                        | comp_statement
                        |
                        ;

assignment              : variable ASSIGN expression
                        | variable ASSIGN STRING;

if_statement            : IF expression THEN statement if_tail;

if_tail                 : ELSE statement
                        |
                        ;

while_statement         : WHILE expression DO statement;

for_statement           : FOR ID ASSIGN iter_space DO statement;

iter_space              : expression TO expression
                        | expression DOWNTO expression;

with_statement          : WITH variable DO statement;

subprogram_call         : ID
                        | ID LPAREN expressions RPAREN;

io_statement            : READ LPAREN read_list RPAREN
                        | WRITE LPAREN write_list RPAREN;

read_list               : read_list COMMA read_item
                        | read_item;

read_item               : variable;

write_list              : write_list COMMA write_item
                        | write_item;

write_item              : expression
                        | STRING;

/* Lexer */

fragment A              : ('A' | 'a');
fragment B              : ('B' | 'b');
fragment C              : ('C' | 'c');
fragment D              : ('D' | 'd');
fragment E              : ('E' | 'e');
fragment F              : ('F' | 'f');
fragment G              : ('G' | 'g');
fragment H              : ('H' | 'h');
fragment I              : ('I' | 'i');
fragment J              : ('J' | 'j');
fragment K              : ('K' | 'k');
fragment L              : ('L' | 'l');
fragment M              : ('M' | 'm');
fragment N              : ('N' | 'n');
fragment O              : ('O' | 'o');
fragment P              : ('P' | 'p');
fragment Q              : ('Q' | 'q');
fragment R              : ('R' | 'r');
fragment S              : ('S' | 's');
fragment T              : ('T' | 't');
fragment U              : ('U' | 'u');
fragment V              : ('V' | 'v');
fragment W              : ('W' | 'w');
fragment X              : ('X' | 'x');
fragment Y              : ('Y' | 'y');
fragment Z              : ('Z' | 'z');
fragment UNDERSCORE     : '_';
fragment DASH           : '-';
fragment ZERO           : '0';
fragment EARS           : '\'';
fragment DEARS          : '"';
fragment LETTER         : [\u0020-\u007E];
fragment ESC            : '\\' ('\r'? '\n' | '\r')+;
fragment TEXT           : (~[\n"\\] | NPC)+;
fragment LF             : '\\n';
fragment FF             : '\\f';
fragment HT             : '\\t';
fragment CR             : '\\r';
fragment BS             : '\\b';
fragment VT             : '\\v';
fragment NPC            : LF | FF | HT | CR | BS | VT;

//-----------------------------------------------------

PROGRAM                 : P R O G R A M;
CONST                   : C O N S T;
TYPE                    : T Y P E;
ARRAY                   : A R R A Y;
SET                     : S E T;
OF                      : O F;
RECORD                  : R E C O R D;
VAR                     : V A R;
FORWARD                 : F O R W A R D;
FUNCTION                : F U N C T I O N;
PROCEDURE               : P R O C E D U R E;
INTEGER                 : I N T E G E R;
REAL                    : R E A L;
BOOLEAN                 : B O O L E A N;
CHAR                    : C H A R;
BEGIN                   : B E G I N;
END                     : E N D;
IF                      : I F;
THEN                    : T H E N;
ELSE                    : E L S E;
WHILE                   : W H I L E;
DO                      : D O;
FOR                     : F O R;
DOWNTO                  : D O W N T O;
TO                      : T O;
WITH                    : W I T H;
READ                    : R E A D;
WRITE                   : W R I T E;

//---------------------------------------------------------------

RCONST                  : [0-9]*DOT[0-9]+(E DASH?[0-9])?
                        | ([1-9][0-9]*)E DASH?[0-9]
                        | (ZERO H)((ZERO | ([1-9][0-9] | [A-Fa-f])+)DOT(ZERO | ([1-9][0-9] | [A-Fa-f])+))
                        | (ZERO B)([0-1]*DOT[0-1]*[1][0-1]*);

//----------------------------------------------------------------

ICONST                  : ZERO
                        | [1-9]+[0-9]*
                        | (ZERO H)([1-9] | [a-fA-F])+([0-9] | [a-fA-F])*
                        | (ZERO B)[1]+[0-1]* ;

//---------------------------------------------------------------

TRUE                    : T R U E;
FALSE                   : F A L S E;

BCONST                  : TRUE
                        | FALSE;

//----------------------------------------------------------------

CCONST                  : EARS(LETTER | NPC)EARS;

//----------------------------------------------------------------

RELOP                   : '>'
                        | '>='
                        | '<'
                        | '<='
                        | '<>';

ADDOP                   : '+'
                        | '-';

OROP                    : O R;

MULDIVANDOP             : '*'
                        | '/'
                        | D I V
                        | M O D
                        | A N D;

NOTOP                   : N O T;

INOP                    : I N;

//----------------------------------------------------------------

STRING                  : DEARS(TEXT | ESC)*DEARS;

//----------------------------------------------------------------

LPAREN                  : '(';
RPAREN                  : ')';
SEMI                    : ';';
COMMA                   : ',';
EQU                     : '=';
COLON                   : ':';
LBRACK                  : '[';
RBRACK                  : ']';
ASSIGN                  : ':=';
DOT                     : '.';
DOTDOT                  : '..';

//----------------------------------------------------------------

ID                      : UNDERSCORE*([A-Za-z])+(([A-Za-z] | [0-9])*|(UNDERSCORE*([A-Za-z] | [0-9])+)*);

//----------------------------------------------------------------

COMMENT                 : '{'.*?'}' -> skip;

//----------------------------------------------------------------

WHITESPACE              : [ \t\n\r] -> skip;

END_EOF                 : EOF -> channel(1);