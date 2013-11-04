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

@lexer::header {
    package config.io;
}

@parser::header {
    package config.io;
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
	:	(a1=STRING '=' a2=STRING  -> $a1 $a2 ) 
	;
	
comment	:	COMMENTT					-> ^(COMMENT COMMENTT)
	;

STRING	:	~('\n' | '\r' | '\t' | '\\\\' | '=' | '{' | '}')+	
	;	

/*STRING	:	(LETTER | NUMBER | SYMBOL | ' ')*	
	;
	
fragment LETTER
	:	('A'..'Z' | 'a'..'z')	
	;	

fragment NUMBER
	:	'0'..'9'	
	;
	
fragment SYMBOL
	:	'://' | '.' | '!' | '?' | '-' | '_' | ',' | '\'' | '"' | '%' | ':' | '(' | ')' | '|' | '&' | '*' | ';' 
	;*/

COMMENTT
    :   ('\t' | ' ')* '//' ~('\n'|'\r')* '\r'? '\n' /*{$channel=HIDDEN;}*/
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        )+ {$channel=HIDDEN;}
    ;

