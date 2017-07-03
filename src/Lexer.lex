package lang.parser;

import java_cup.runtime.Symbol;

%%

%class Lexer
%cupsym Tokens
%cup
%implements Tokens
%public

%{
	/* Embedded lexer class code */
%}

%% 
// Tokens.

-?[0-9]*(\.[0-9]+)? {return new Symbol(num,Float.parseFloat(yytext()));}
[a-z][a-zA-Z0-9]* {return new Symbol(id, yytext());}
(T|F) { return new Symbol(valor, yytext().equals("T")); }
\~ { return new Symbol(NOT); }
\/\\ { return new Symbol(AND); }
\\\/ { return new Symbol(OR); }
\-> { return new Symbol(COND); }
\<-> { return new Symbol(BICOND); }
\( { return new Symbol(P1); }
\) { return new Symbol(P2); }
[ \r\n\t]+ { }
; { return new Symbol(EOL); }
= { return new Symbol(EQ); }
, { return new Symbol(COMMA); }

.	{ /* Fallback */
		return new Symbol(error, "Unexpected input <"+ yytext() +">!"); 
	}