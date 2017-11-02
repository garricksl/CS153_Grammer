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

INT : {INT} ('0'|'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9') {INT};

