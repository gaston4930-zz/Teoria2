package ast;

public class Attributes extends Expresion{
	
	public Attributes(Expresion e){
		super();
		eval(e.getNodo());
	}
	
	public void eval(Nodo nodo){
		System.out.println(nodo);
		n.attributes.addAll(nodo.attributes);
	}
}
