package ast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Nodo {
	String id;
	Map<String,Object> attributes;
	ArrayList<Object> elements;

	public Nodo(){
		elements = new ArrayList<Object>();
		attributes = new HashMap<String,Object>();
	}
	
	public Nodo(String str){
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
	
	public void addList(Nodo n){
		// Agrega todos los elementos y atributos
		this.elements.addAll(n.getElements());
		this.attributes.putAll(n.getAttributes());
	}
	
	public void setTag(String str){
		id = str;
	}
	
	public String getString(Object o){
		if(o instanceof Nodo) return ((Nodo) o).id;
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
	
	public Map<String,Object> getAttributes(){
		return attributes;
	}
	
	public String getId() { return id; }
}
