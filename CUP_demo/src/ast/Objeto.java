package ast;

import java.util.ArrayList;
import java.util.Map;

public class Objeto {
	String id;
	Map<String,Object> attributes;
	ArrayList<Valor> elements;

	public Objeto(){
		elements = new ArrayList<Valor>();
	}
	
	public void addAtt(String id, Valor val){
		attributes.put(id, val);
	}
	
	public void addElem(Valor elem){
		elements.add(elem);
	}
	
	public void setTag(String str){
		id = str;
	}
}
