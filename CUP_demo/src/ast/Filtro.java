package ast;

import java.util.ArrayList;

public class Filtro extends Expresion{

	public Filtro(Expresion e,String filtro){
		n = new Nodo("$");
		if(filtro.substring(0,1).equals("\'")){
			filtro = filtro.substring(1,filtro.length()); 
		}
		eval(e.getNodo(), filtro);
	}

	public void eval(Nodo n, String filtro){
		//Solo se buscan Objetos, el resto no tiene tags
		for(Object o: n.getElements()){
			if(o instanceof Nodo){
				if(((Nodo) o).getId().equals(filtro)){
					this.n.addElem(o);
				}
			}
		}
	}
}
