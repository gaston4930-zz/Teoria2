package ast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Objeto {
	String id;
	Map<String,Object> attributes;
	ArrayList<Object> elements;

	public Objeto(){
		elements = new ArrayList<Object>();
		attributes = new HashMap<String,Object>();
	}
	
	public void addAttr(String id, Object val){
		attributes.put(id, val);
	}
	
	public void addElem(Object elem){
		elements.add(elem);
	}
	
	public void setTag(String str){
		id = str;
	}
}
