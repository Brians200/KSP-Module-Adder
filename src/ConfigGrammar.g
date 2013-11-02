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
	|	assignment
	;
	
assignment
	:	a1=STRING '=' a2=STRING ('/' STRING)*			-> ^(ASSIGNMENT $a1 $a2)
	;
	
comment	:	('//' commentContent?					-> ^(COMMENT commentContent?))	 			
	;

commentContent
	:	'{'							-> ^( '{' )
	|	'}'							-> ^( '}' )
	|	c1=STRING c2=(('/' | '=') STRING)*			-> ^($c1 $c2*)
	|	c1=('/') c2=STRING c3=(('/' | '=') STRING)*		-> ^($c2 $c2*)
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
