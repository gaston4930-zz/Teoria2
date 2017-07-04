package ast;

import java.util.ArrayList;
import java.util.HashMap;

public class Filtro extends Expression{

	ArrayList<Object> expression;
	boolean regex = true;
	String filtro;
	
	public Filtro(ArrayList<Object> expression,String filtro){
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
	
	public ArrayList<Object> getList(){
		ArrayList<Object> resultado = new ArrayList();
		if(!regex){
			for(Object o : expression){
				if(o instanceof HashMap){
					HashMap oH = (HashMap)o;
					if(oH.containsKey(filtro)){
						resultado.add(o);
					}
				}else{
					if( o instanceof Objeto){
						
					}
				}
			}
		}
		
		return resultado;
	}

}
