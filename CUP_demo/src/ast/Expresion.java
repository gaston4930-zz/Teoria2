package ast;

import java.util.ArrayList;

public class Expresion {

	Nodo n;
	public Expresion(){
		n = new Nodo("$");
	}
	
	public Expresion(Object v){
		if(v instanceof Nodo){
			n = (Nodo) v;
		}else{
			n = new Nodo("$");
			n.addElem(v);
			}
	}

	public Nodo getNodo() { return n; }
}
