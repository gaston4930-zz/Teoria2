package ast;

import java.util.ArrayList;

public class Concatenacion {

	ArrayList<Objeto> l1,l2;
		
	public Concatenacion(ArrayList<Objeto> l1, ArrayList<Objeto> l2){
		this.l1 = l1;
		this.l2 = l2;
	}
	
	public ArrayList<Object> getList(){
		ArrayList<Object> resultado = new ArrayList();
						
		/*for(Objeto o1 : l1){
			resultado.add(o1);
		}
		
		for(Objeto o2 : l2){
			resultado.add(o2);
		}*/
		
		resultado.addAll(l1);
		resultado.addAll(l2);
		
		return resultado;
	}
	
}
