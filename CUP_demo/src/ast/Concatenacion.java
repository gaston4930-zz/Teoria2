package ast;

import java.util.ArrayList;

public class Concatenacion extends Expresion{

	Nodo n;
	
	public Concatenacion(Expresion left, Expresion right){
		n = new Nodo("$");
		eval(left.getNodo(),right.getNodo());
	}
	
	public void eval(Nodo left, Nodo right){
		n.addList(left);
		n.addList(right);
//		resultado.addAll(left.getExpresion());
//		resultado.addAll(right.getExpresion());
	}
	
}
