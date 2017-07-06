package ast;

import java.util.ArrayList;

public class Diferencia extends Expresion{

	Nodo n;
	
	public Diferencia(Expresion left, Expresion right){
		n = new Nodo("$");
		eval(left.getNodo(),right.getNodo());
	}
	
	public void eval(Nodo left, Nodo right){
		n.elements.addAll(left.elements);
		n.elements.removeAll(right.elements);
		
		for(int i =0;i<n.elements.size();i++){
			if(n.elements.subList(i+1, n.elements.size()-1).contains(n.elements.get(i))){
				n.elements.remove(i);
			}
		}
		
		n.attributes.putAll(left.attributes);
		n.attributes.keySet().removeAll(right.attributes.keySet());
	}
		
	
	
}
