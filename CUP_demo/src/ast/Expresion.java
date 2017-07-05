package ast;

import java.util.ArrayList;

public class Expresion {

	ArrayList<Object> expression;
	
	public Expresion(){
		
	}
	
	public Expresion(Object o){
		expression = new ArrayList<>();
		expression.add(o);
	}
	
	public Expresion(ArrayList<Object> expression){
		this.expression = expression;
	}
	
	public ArrayList<Object> getExpresion(){
		return expression;
	}
	
}
