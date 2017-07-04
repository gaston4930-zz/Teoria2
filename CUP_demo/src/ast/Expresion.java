package ast;

import java.util.ArrayList;

public class Expresion {

	ArrayList<Object> expression;
	
	public Expresion(){
		
	}
	
	public Expresion(ArrayList<Object> expression){
		this.expression = expression;
	}
	
	public ArrayList<Object> getExpresion(){
		return expression;
	}
	
}
