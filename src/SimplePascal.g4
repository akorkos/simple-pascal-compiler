grammar SimplePascal;

/* Parser Rules */

program : header declarations subprograms comp_statement DOT;

header : PROGRAM ID SEMI;

declarations : constdefs typedefs vardefs;

constdefs   : CONST constant_defs SEMI
            | ;

constant_defs   : constant_defs SEMI ID EQU expression
                | ID EQU expression;

expression  : expression RELOP expression
            | expression EQU expression
            | expression INOP expression
            | expression OROP expression
            | expression ADDOP expression
            | expression MULDIVANDOP expression
            | ADDOP expression
            | NOTOP expression
            | variable
            | ID LPAREN expressions RPAREN
            | constant
            | LPAREN expression RPAREN
            | setexpression;

variable  : ID
          | variable DOT ID
          | variable LBRACK expressions RBRACK;

expressions : expressions COMMA expression
            | expression;

constant    : ICONST
            | RCONST
            | BCONST
            | CCONST;

setexpression   : LBRACK elexpressions RBRACK
                | LBRACK RBRACK;

elexpressions   : elexpressions COMMA elexpression
                | elexpression;


elexpression    : expression DOTDOT expression
                | expression;

typedefs    : TYPE type_defs SEMI
            | ;

type_defs    : type_defs SEMI ID EQU type_def
             | ID EQU type_def;

type_def    : ARRAY LBRACK dims RBRACK OF typename
            | SET OF typename
            | RECORD fields END
            | LPAREN identifiers RPAREN
            | limit DOTDOT limit;

dims    : dims COMMA limits
        | limits;

limits  : limit DOTDOT limit
        | ID;
limit   : ADDOP ICONST
        | ADDOP ID
        | ICONST
        | CCONST
        | BCONST
        | ID;

typename    : standard_type
            | ID;

standard_type : INTEGER | REAL | BOOLEAN | CHAR;

fields : fields SEMI field | field;

field : identifiers COLON typename;

identifiers : identifiers COMMA ID
            | ID;

vardefs : VAR variable_defs SEMI
        | ;

variable_defs   : variable_defs SEMI identifiers COLON typename
                | identifiers COLON typename;

subprograms : subprograms subprogram SEMI
            | ;

subprogram  : sub_header SEMI FORWARD
            | sub_header SEMI declarations subprograms comp_statement;

sub_header  : FUNCTION ID formal_parameters COLON standard_type
            | PROCEDURE ID formal_parameters
            | FUNCTION ID;

formal_parameters   : LPAREN parameter_list RPAREN
                    | ;

parameter_list  : parameter_list SEMI pass identifiers COLON typename
                | pass identifiers COLON typename;
pass    : VAR
        | ;

comp_statement : BEGIN statements END;

statements  : statements SEMI statement
            | statement;

statement   : assignment
            | if_statement
            | while_statement
            | for_statement
            | with_statement
            | subprogram_call
            | io_statement
            | comp_statement
            | ;

assignment  : variable ASSIGN expression
            | variable ASSIGN STRING;

if_statement : IF expression THEN statement if_tail;

if_tail : ELSE statement
        | ;

while_statement : WHILE expression DO statement;

for_statement : FOR ID ASSIGN iter_space DO statement;

iter_space   : expression TO expression
            | expression DOWNTO expression;

with_statement : WITH variable DO statement;

subprogram_call : ID
                | ID LPAREN expressions RPAREN;

io_statement    : READ LPAREN read_list RPAREN
                | WRITE LPAREN write_list RPAREN;

read_list   : read_list COMMA read_item
            | read_item;

read_item : variable;

write_list  : write_list COMMA write_item
            | write_item;

write_item  : expression
            | STRING;

/* Lexer Rules */

fragment A      : ('A' | 'a');
fragment B      : ('B' | 'b');
fragment C      : ('C' | 'c');
fragment D      : ('D' | 'd');
fragment E      : ('E' | 'e');
fragment F      : ('F' | 'f');
fragment G      : ('G' | 'g');
fragment H      : ('H' | 'h');
fragment I      : ('I' | 'i');
fragment J      : ('J' | 'j');
fragment K      : ('K' | 'k');
fragment L      : ('L' | 'l');
fragment M      : ('M' | 'm');
fragment N      : ('N' | 'n');
fragment O      : ('O' | 'o');
fragment P      : ('P' | 'p');
fragment Q      : ('Q' | 'q');
fragment R      : ('R' | 'r');
fragment S      : ('S' | 's');
fragment T      : ('T' | 't');
fragment U      : ('U' | 'u');
fragment V      : ('V' | 'v');
fragment W      : ('W' | 'w');
fragment X      : ('X' | 'x');
fragment Y      : ('Y' | 'y');
fragment Z      : ('Z' | 'z');
fragment UNDERSCORE : '_';
fragment LETTER : [A-Za-z];
fragment DIGIT : [0-9];
fragment ZEROLESS_DIGIT : [1-9];
fragment ZERO : '0';
fragment HEX_PREFIX : '0H';
fragment BIN_PREFIX : '0B';
//fragment DOT : '.';
fragment SIGN : [-+];
fragment EARS : '\'';
fragment DEARS : '"';
fragment ASCII_CHAR : [\u0020-\u007E];
fragment EOL : '\\' ('\r'? '\n' | '\r')+;
fragment STRING_TEXT : (~[\n"\\] | ESC_SEQ)+;
fragment ESC_SEQ: '\\'[nftrbv"\\];

//-----------------------------------------------------

PROGRAM : P R O G R A M;
CONST : C O N S T;
TYPE : T Y P E;
ARRAY : A R R A Y;
SET : S E T;
OF : O F;
RECORD : R E C O R D;
VAR : V A R;
FORWARD : F O R W A R D;
FUNCTION : F U N C T I O N;
PROCEDURE : P R O C E D U R E;
INTEGER : I N T E G E R;
REAL : R E A L;
BOOLEAN : B O O L E A N;
CHAR : C H A R;
BEGIN : B E G I N;
END : E N D;
IF : I F;
THEN : T H E N;
ELSE : E L S E;
WHILE : W H I L E;
DO : D O;
FOR : F O R;
DOWNTO : D O W N T O;
TO : T O;
WITH : W I T H;
READ : R E A D;
WRITE : W R I T E;

//----------------------------------------------------------------

ID : (UNDERSCORE)* (LETTER)+ ((LETTER | DIGIT)* | ((UNDERSCORE)*(LETTER | DIGIT)+)*);

//---------------------------------------------------------------

DEC_NUM : ZERO | (ZEROLESS_DIGIT+ DIGIT*);
HEX_NUM : (ZEROLESS_DIGIT | [A-Fa-f]) (DIGIT | [A-Fa-f])*;
BIN_NUM : ('1'[01]*);

ICONST : (HEX_PREFIX HEX_NUM) | (BIN_PREFIX BIN_NUM) | DEC_NUM;

//----------------------------------------------------------------

TRUE : T R U E;
FALSE : F A L S E;

BCONST : TRUE | FALSE;

//----------------------------------------------------------------

CCONST : EARS (ASCII_CHAR | ESC_SEQ) EARS;

//----------------------------------------------------------------

RELOP : '>' | '>=' | '<' | '<=' | '<>';
ADDOP : '+' | '-';
OROP  : O R;
MULDIVANDOP : '*' | '/' | D I V | M O D | A N D;
NOTOP : N O T;
INOP : I N;

//----------------------------------------------------------------

STRING : DEARS  (STRING_TEXT | EOL)*  DEARS;

//----------------------------------------------------------------

LPAREN : '(';
RPAREN : ')';
SEMI : ';';
COMMA : ',';
EQU : '=';
COLON : ':';
LBRACK : '[';
RBRACK : ']';
ASSIGN : ':=';
DOT : '.';
DOTDOT : '..';
//EOF : '<EOF>';

//----------------------------------------------------------------

COMMENT : '{' .* '}';

//----------------------------------------------------------------

WHITESPACE              : [ \t\n\r] -> skip;