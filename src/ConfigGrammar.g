grammar ConfigGrammar;

options {output=AST;}

tokens
{
	CONFIG;
	BLOCK;
	EMPTYBLOCK;
	COMMENT;
	ASSIGNMENT;
}

config	:	(configField*				-> ^(CONFIG configField*))
	;
	
configField
	:	block					-> block
	|	comment					-> comment
	;
	
block	:	b1=STRING '{' blockField* '}'		-> ^(BLOCK $b1 blockField* )
	;
	
emptyBlock
	:	'{' blockField* '}' 			-> ^(EMPTYBLOCK blockField*)
	;
	
blockField
	:	('{') => emptyBlock
	|	block
	|	comment						
	|	assignment				-> ^(ASSIGNMENT assignment)
	;
	
assignment
	:	(a1=STRING '=' a2=STRING  -> $a1 $a2 ) ('/' a3=STRING -> $assignment '/' $a3)*		
	;
	
comment	:	('//' commentContent?					-> ^(COMMENT commentContent?))	 			
	;

commentContent
	:	'{'								->  '{' 
	|	'}'								->  '}' 
	|	(c1=STRING -> $c1)  (('/' -> $commentContent '/' | '=' -> $commentContent '=') c2=STRING 	-> $commentContent $c2)*
	|	('/' c1=STRING -> '/' $c1 )  (('/' -> $commentContent '/' | '=' -> $commentContent '=') c2=STRING	-> $commentContent $c2)*
	;
	
STRING	:	(LETTER | NUMBER | SYMBOL | ' ')*	
	;

fragment LETTER
	:	('A'..'Z' | 'a'..'z')	
	;	

fragment NUMBER
	:	'0'..'9'	
	;
	
fragment SYMBOL
	:	'://' | '.' | '!' | '?' | '-' | '_' | ',' | '\'' | '"' | '%' | ':' | '(' | ')' | '|' | '&'
	;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        )* {$channel=HIDDEN;}
    ;
