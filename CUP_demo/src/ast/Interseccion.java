package ast;

import java.util.ArrayList;

public class Interseccion extends Expresion{
	Expresion e1,e2;
	ArrayList<Object> resultado;	
	
	public Interseccion(Expresion e1, Expresion e2){
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
		
		for(Object o : e1.getExpresion()){
			if(e2.getExpresion().contains(o)){
				resultado.add(o);
			}
		}
	}

	
}
