package ast;

import java.beans.Expression;
import java.util.ArrayList;

public class Concatenacion extends Expresion{

	Expresion e1,e2;
	ArrayList<Object> resultado;	
	
	public Concatenacion(Expresion e1, Expresion e2){
		this.e1 = e1;
		this.e2 = e2;
		resultado = new ArrayList();
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
	}
	
}
