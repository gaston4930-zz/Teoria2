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
	
	public Float inf(String text){
		if(text.substring(0,1).equals("-")){
			return Float.NEGATIVE_INFINITY;
		} else return Float.POSITIVE_INFINITY;
	}
%}

%% 
// Tokens.

\$ { return new Symbol(PESOS); }
(true|false|\u22A4|\u22A5) { return new Symbol(bool, yytext().matches("\u22A4|true")); }
\"([^\"\n\\]|\\[^\n])*\" { return new Symbol(str, yytext()); }
([A-Za-z][a-zA-Z0-9]*|\'[A-Za-z][a-zA-Z0-9.]*\') { return new Symbol(id, yytext()); }
[-+]?[0-9]+(\.[0-9]+)? { return new Symbol(num, Float.parseFloat(yytext())); }
\( { return new Symbol(P1); }
\) { return new Symbol(P2); }
: { return new Symbol(COLON); }
, { return new Symbol(COMMA); }
\n { return new Symbol(EOL); }
-?\u221e { return new Symbol(num, inf(yytext())); }

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