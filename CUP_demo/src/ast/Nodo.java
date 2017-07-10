package ast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Nodo {
	String id;
	ArrayList<NodoKV> attributes;
	ArrayList<Object> elements;

	public Nodo(){
		elements = new ArrayList<Object>();
		attributes = new ArrayList<NodoKV>();
	}
	
	public Nodo(String str){
		id = str;
		elements = new ArrayList<Object>();
		attributes = new ArrayList<NodoKV>();
	}
	public void addAttr(String id, Object val){
		attributes.add(new NodoKV(id,val));
	}
	
	public void addElem(Object elem){
		elements.add(elem);
	}
	
	public void addList(Nodo nodo){
		// Agrega todos los elementos y atributos
		this.elements.addAll(nodo.getElements());
		this.attributes.addAll(nodo.getattributes());
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
		if(!attributes.isEmpty()){
			String res = "{";
			for(NodoKV s : attributes){
				res += s.key + ":" + s.value + " ";
			}
			res = res.substring(0, res.length()-1) + "} ";
			return res;
		} else return "";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nodo other = (Nodo) obj;
		if (attributes == null) {
			if (other.attributes != null)
				return false;
		} else if (!attributes.equals(other.attributes))
			return false;
		if (elements == null) {
			if (other.elements != null)
				return false;
		} else if (!elements.equals(other.elements))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString(){
		String res = this.id + " " + this.at();
		if(!elements.isEmpty()){
			res += " (";
			for(Object o: elements){
				res += getString(o) + " ";
			}
			res = res.substring(0, res.length()-1) + ")";
		}
		return res;
	}
	
	public ArrayList<String> getAttributeKeys(){
		ArrayList<String> res = new ArrayList<String>();
		for(NodoKV n: attributes){
			res.add(n.key);
		}
		return res;
	}
	
	public ArrayList<String> getElementKeys(){
		ArrayList<String> res = new ArrayList<String>();
		for(Object o: elements){
			res.add(((Nodo)o).getId());
		}
		return res;
	}
	
	public ArrayList<Object> getElements(){
		return elements;
	}
	
	public ArrayList<NodoKV> getattributes(){
		return attributes;
	}
	
	public String getId() { return id; }
}
