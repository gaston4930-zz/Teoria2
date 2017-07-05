package ast;

import java.util.ArrayList;

public class Expresion {

	private ArrayList<Object> expression;
	
	public Expresion(){
		
	}
	
	public Expresion(Object o){
		expression = new ArrayList<>();
		expression.add(o);
		System.out.println("New expresion: "+expression.size());
	}
	
	public ArrayList<Object> getExpresion(){
		return expression;
	}
	
}
