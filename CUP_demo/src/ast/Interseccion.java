package ast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Interseccion extends Expresion{

	public Interseccion(Expresion left, Expresion right){
		super();
		eval(left.getNodo(), right.getNodo());
	}
	
	public void eval(Nodo left, Nodo right){
		for(Object o: left.getElements()){
			if(right.getElements().contains(o)){
				n.addElem(o);
			}
		}
		for(String s: left.getAttributes().keySet()){
			if(right.getAttributes().containsKey(s)){
				n.addAttr(s, left.getAttributes().get(s));
			}
		}
	}

	
}
