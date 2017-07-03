package lang.parser;

import java_cup.runtime.Symbol;

%%

%class Lexer
%cupsym Tokens
%cup
%implements Tokens

%{ 
	/* Embedded lexer class code */  
%}

%% 
// Tokens.

[0-9]+	{ return new Symbol(NUM, Integer.parseInt(yytext())); }
\r?\n	{ return new Symbol(EOL); }
,		{ return new Symbol(COMMA); }

.	{ /* Fallback */
		return new Symbol(error, "Unexpected input <"+ yytext() +">!"); 
	}