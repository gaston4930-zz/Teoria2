package ast;

import java.util.ArrayList;

public class Union extends Expresion{

	Nodo n;
	
	public Union(Expresion e1, Expresion e2){
		n = new Nodo("$");
		eval(e1.getNodo(),e2.getNodo());
	}
	
	public void eval(Nodo left, Nodo right){
						
		/*for(Objeto o1 : l1){
			resultado.add(o1);
		}
		
		for(Objeto o2 : l2){
			resultado.add(o2);
		}*/
		n.addList(left);
		n.addList(right);
		ArrayList<Object> resultado = n.getElements();
		
		for(int i =0;i<resultado.size();i++){
			if(resultado.subList(i+1, resultado.size()-1).contains(resultado.get(i))){
				resultado.remove(i);
			}
		}
		
		//Falta sacar los duplicados del HashMap

	}	

}
