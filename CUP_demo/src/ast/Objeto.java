package ast;

import java.util.ArrayList;
import java.util.Map;

public class Objeto {
	private String id;
	private Map<String,Valor> attributes;
	private ArrayList<Valor> elements;

	public Objeto(){
		elements = new ArrayList<Valor>();
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public void addAtt(String id, Valor val){
		attributes.put(id, val);
	}
	
	public void addElem(Valor elem){
		elements.add(elem);
	}
}
