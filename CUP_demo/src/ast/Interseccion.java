package ast;

import java.util.ArrayList;

public class Interseccion {
ArrayList<Objeto> l1,l2;
	
	
	public Interseccion(ArrayList<Objeto> l1, ArrayList<Objeto> l2){
		this.l1 = l1;
		this.l2 = l2;
	}
	
	public ArrayList<Object> getList(){
		ArrayList<Object> resultado = new ArrayList();
		
		for(Objeto o : l1){
			if(l2.contains(o)){
				resultado.add(o);
			}
		}
		
		return resultado;
	}
	
}
