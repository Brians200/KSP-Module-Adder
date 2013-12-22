grammar ConfigGrammar;

options {output=AST;}

tokens
{
	CONFIG;
	BLOCK;
	EMPTYBLOCK;
	COMMENT;
	ASSIGNMENT;
	MMREMOVERULE;
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
	:	comment					-> comment
	|	block					-> block
	;

block	:	b1=STRING '{' blockField* '}'		-> ^(BLOCK $b1 blockField* )
	;
	
emptyBlock
	:	'{' blockField* '}' 			-> ^(EMPTYBLOCK blockField*)
	;
	
blockField
	:	mmRemoveRule
	|	('{') => emptyBlock
	|	block
	|	comment						
	|	assignment				-> ^(ASSIGNMENT assignment)
	;
	
mmRemoveRule
	:	MMREMOVE				-> ^(MMREMOVERULE MMREMOVE)
	;
	
assignment
	:	(a1=STRING '=' a2=STRING  -> $a1 $a2 )
	;
	
comment	:	COMMENTT					-> ^(COMMENT COMMENTT)
	;
MMREMOVE
	:	'!' ~('\n'|'\r'|'{' | '!')* '\r'? '\n'
	;

STRING	:	~('\n' | '\r' | '\t' | '//' | '=' | '{' | '}')+	
	;	

COMMENTT
    :   (' ' | '\t')* '//' ~('\n'|'\r')* '\r'? '\n' /*{$channel=HIDDEN;}*/
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        )+ {$channel=HIDDEN;}
    ;

