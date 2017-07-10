package ast;

import java.util.ArrayList;
import java.util.List;

public class Union extends Expresion{

	public Union(Expresion e1, Expresion e2){
		super();
		eval(e1.getNodo(),e2.getNodo());
	}
	
	public void eval(Nodo left, Nodo right){
						
		n.addList(left);
		n.addList(right);
		
		/*ArrayList<Object> resultado = n.getElements();
		for(int i =0;i<resultado.size();i++){
			List<Object> sub = resultado.subList(i+1, resultado.size());
			if(sub.contains(resultado.get(i))){
				resultado.remove(i);
			}
		}*/
		
		for(int i=0;i<n.elements.size();i++){
			if(n.elements.subList(i+1, n.elements.size()).contains(n.elements.get(i))){
				n.elements.remove(i);
				i--;
			}
		}
		
		/*ArrayList<NodoKV> res = n.getattributes();
		for(int i=0;i<res.size();i++){
			List<NodoKV> sub = res.subList(i+1, res.size());
			if(sub.contains(res.get(i))){
				res.remove(i);
			}
		}*/
		
		for(int i=0;i<n.attributes.size();i++){
			if(n.attributes.subList(i+1, n.attributes.size()).contains(n.attributes.get(i))){
				n.attributes.remove(i);
				i--;
			}
		}
	}	

}
