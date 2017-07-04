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

(true|false) { return new Symbol(bool, yytext() == "true"); }
[A-Za-z][a-zA-Z0-9.]* { return new Symbol(id, yytext()); }
\"([^"\n\\]|\\[^\n])*\" { return new Symbol(str, yytext()); }
[-+]?[0-9]+(\.[0-9]+)? { return new Symbol(num, Float.parseFloat(yytext())); }
\( { return new Symbol(P1); }
\) { return new Symbol(P2); }
: { return new Symbol(COLON); }
, { return new Symbol(COMMA); }

& { return new Symbol(INTERSECTION); }
\| { return new Symbol(UNION);}
\+ { return new Symbol(CONCATENATION); }
\- { return new Symbol(DIFFERENCE); }
\~.+ { return new Symbol(FILTER); }
\. { return new Symbol(ATTRIBUTES); }
\/ { return new Symbol(ELEMENTS); }

\/\/.* {}
[ \r\n\t]+ {}

.	{ /* Fallback */
		return new Symbol(error, "Unexpected input <"+ yytext() +">!"); 
	}