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
	
	public Objeto(String str){
		id = str;
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
	
	public String getString(Object o){
		if(o instanceof Objeto) return ((Objeto) o).id;
		else if(o instanceof String) return ((String) o);
		else if(o instanceof Float) return String.valueOf((Float) o);
		else if(o instanceof Boolean) return String.valueOf((Boolean) o);
		else return null;
	}
	
	public String at(){
		String res = "";
		for(String s : attributes.keySet()){
			res += s + ":" + getString(attributes.get(s)) + "\n";
		}
		return res;
	}
	
	@Override
	public String toString(){
		String res = this.at();
		for(Object o: elements){
			res += getString(o) + "\n";
		}
		return res;
	}
	
	public ArrayList<Object> getElements(){
		return elements;
	}
	
	public String getId() { return id; }
}
