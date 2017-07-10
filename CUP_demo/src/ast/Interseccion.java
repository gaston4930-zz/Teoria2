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
		
		for(int i=0;i<n.elements.size();i++){
			if(n.elements.subList(i+1, n.elements.size()).contains(n.elements.get(i))){
				n.elements.remove(i);
				i--;
			}
		}
		
		for(NodoKV s: left.getattributes()){
			if(right.getAttributeKeys().contains(s.key)){
				n.addAttr(s.key, s.value);
			}
		}
		
		/*for(int i=0;i<n.attributes.size();i++){
			if(n.attributes.subList(i+1, n.attributes.size()).contains(n.attributes.get(i))){
				n.attributes.remove(i);
				i--;
			}
		}*/
	}

	
}
