package ast;

import java.util.ArrayList;

public class Filtro extends Expresion{

	Expresion expression;
	boolean regex = true;
	String filtro;

	public Filtro(Expresion expression,String filtro){
		this.expression = expression;
		this.regex = filtro.substring(0,1).equals("~");
		if(regex){
			filtro = filtro.substring(1);
		}

		if(filtro.substring(0,1).equals("\"")){
			filtro = filtro.substring(1,filtro.length()); 
		}
		this.filtro = filtro;
	}

	public ArrayList<Object> eval(){
		ArrayList<Object> resultado = new ArrayList<Object>();
			for(Object o : expression.getExpresion()){
				if( o instanceof Objeto){
					if(regex){
						if(((Objeto) o).getId().matches(filtro)){
							resultado.add(o);
						}
					}else{
						if(((Objeto) o).getId().equals(filtro)){
							resultado.add(o);
						}
					}
				}
			}
		return resultado;
	}

}
