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

(true|false|\u22A4|\u22A5) { return new Symbol(bool, yytext() == "true"); }
([A-Za-z][a-zA-Z0-9]*|\"[A-Za-z][a-zA-Z0-9.]*\") { return new Symbol(fil, yytext()); }
[A-Za-z][a-zA-Z0-9.]* { return new Symbol(id, yytext()); }
\"([^\"\n\\]|\\[^\n])*\" { return new Symbol(str, yytext()); }
[-+]?[0-9]+(\.[0-9]+)? { return new Symbol(num, Float.parseFloat(yytext())); }
\( { return new Symbol(P1); }
\) { return new Symbol(P2); }
: { return new Symbol(COLON); }
, { return new Symbol(COMMA); }
\n { return new Symbol(EOL); }
-?\u221e { return new Symbol(INF); }

(&|\u2229) { return new Symbol(INTERSECCION); }
(\||\u222A) { return new Symbol(UNION);}
\+ { return new Symbol(CONCATENACION); }
\- { return new Symbol(DIFERENCIA); }
\~.+ { return new Symbol(FILTRO); }
\. { return new Symbol(ATTRIBUTES); }
\/ { return new Symbol(ELEMENTS); }


\/\/.* {}
[ \r\t]+ {}

.	{ /* Fallback */
		return new Symbol(error, "Unexpected input <"+ yytext() +">!"); 
	}