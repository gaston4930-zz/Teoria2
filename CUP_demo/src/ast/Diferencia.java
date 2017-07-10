package ast;

import java.util.ArrayList;

public class Diferencia extends Expresion{

	public Diferencia(Expresion left, Expresion right){
		super();
		eval(left.getNodo(),right.getNodo());
	}
	
	public void eval(Nodo left, Nodo right){
		n.elements.addAll(left.elements);
		
		for(int i=0;i<n.elements.size();i++){
			if(n.elements.subList(i+1, n.elements.size()).contains(n.elements.get(i))){
				n.elements.remove(i);
			}
			if(right.elements.contains(n.elements.get(i))){
				n.elements.remove(n.elements.get(i));
				i -=1;
			}
		}
		
		n.attributes.addAll(left.attributes);
		
		for(int i=0;i<n.attributes.size();i++){
			if(n.attributes.subList(i+1, n.attributes.size()).contains(n.attributes.get(i))){
				n.attributes.remove(i);
			}
			if(right.attributes.contains(n.attributes.get(i))){
				n.attributes.remove(n.attributes.get(i));
				i -=1;
			}
		}
	}
}
