package ast;

import java.util.ArrayList;

public class Union extends Expresion{
	Expresion e1,e2;
	ArrayList<Object> resultado;	
	
	public Union(Expresion e1, Expresion e2){
		this.e1 = e1;
		this.e2 = e2;
		resultado = new ArrayList<Object>();
	}
	
	public void eval(){
						
		/*for(Objeto o1 : l1){
			resultado.add(o1);
		}
		
		for(Objeto o2 : l2){
			resultado.add(o2);
		}*/
		
		resultado.addAll(e1.getExpresion());
		resultado.addAll(e2.getExpresion());
		
		for(int i =0;i<resultado.size();i++){
			if(resultado.subList(i+1, resultado.size()-1).contains(resultado.get(i))){
				resultado.remove(i);
			}
		}
	}	

}
