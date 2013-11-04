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

COMMENTT
    :   ('\t' | ' ')* '//' ~('\n'|'\r')* '\r'? '\n' /*{$channel=HIDDEN;}*/
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        )+ {$channel=HIDDEN;}
    ;

