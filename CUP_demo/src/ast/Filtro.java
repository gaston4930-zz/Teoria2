package ast;

import java.util.ArrayList;

public class Filtro extends Expresion{

	Nodo n;

	public Filtro(Nodo n,String filtro){
		n = new Nodo("$");
		boolean regex = filtro.substring(0,1).equals("~");
		if(regex){
			filtro = filtro.substring(1);
		}

		if(filtro.substring(0,1).equals("\"")){
			filtro = filtro.substring(1,filtro.length()); 
		}
		eval(n, filtro, regex);
	}

	public void eval(Nodo n, String filtro, boolean regex){
		//Solo se buscan Objetos, el resto no tiene tags
		for(Object o: n.getElements()){
			if(o instanceof Nodo){
				if(regex){
					if(((Nodo) o).getId().matches(filtro)){
						this.n.addElem(o);
					}
				} else{
					if(((Nodo) o).getId().equals(filtro)){
						this.n.addElem(o);
					}
				}
			}
		}
	}

}
