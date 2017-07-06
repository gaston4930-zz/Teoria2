package ast;

public class Elements extends Expresion{
	
	public Elements(Expresion e){
		super();
		eval(e.getNodo());
	}
	
	public void eval(Nodo nodo){
		n.elements.addAll(nodo.getElements());
	}
}
