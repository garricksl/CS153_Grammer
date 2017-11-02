/**
 * Define a grammar called Hello
 */
grammar SwiftLight;
stat: expr NEWLINE
	| ID '=' expr NEWLINE
	| NEWLINE
	;


expr : expr op=('+'|'*') expr
	| expr op=('-'|'/') expr
	| INT | ID 
	| '(' expr ')';
	       // match keyword hello followed by an identifier

ID: MUL | DIV | ADD | SUB;

	MUL : '*';
	DIV :'/';
	ADD : '+';
	SUB : '-';

NEWLINE: '\n';

INT :  ('0'|'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9') ;

CHAR:  ('a'|'b'|'c'|'d'|'e'|'f'|'g'|'h'|'i'|'j'|'k'|'l'|'m'|'n'|'o'|'p'|'r'|'s'|'t'|'u'|'v'|'w'|'x'|'y'|'z'|' ') ;

STRING : (INT | CHAR ) INT (INT | CHAR)  | (INT | CHAR ) CHAR (INT | CHAR) ;

SIGN : '-';

DOUBLE : (SIGN) INT DEC INT;

DEC : '.';

