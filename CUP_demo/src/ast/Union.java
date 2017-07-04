package ast;

import java.util.ArrayList;

public class Union extends Expression{
ArrayList<Objeto> l1,l2;
	
	
	public Union(ArrayList<Objeto> l1, ArrayList<Objeto> l2){
		this.l1 = l1;
		this.l2 = l2;
	}
	
	public ArrayList<Object> getList(){
		ArrayList<Object> resultado = new ArrayList();
		
		resultado.addAll(l1);
		resultado.addAll(l2);
		
		for(int i =0;i<resultado.size();i++){
			if(resultado.subList(i+1, resultado.size()-1).contains(resultado.get(i))){
				resultado.remove(i);
			}
		}
		
		return resultado;
	}
	
}
