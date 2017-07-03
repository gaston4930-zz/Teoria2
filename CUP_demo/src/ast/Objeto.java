package ast;

import java.util.ArrayList;
import java.util.Map;

public class Objeto {
	String id;
	Map<String,String> attributes;
	ArrayList<String> elements;
	public Objeto(String id, Map<String,String> att,
			ArrayList<String> elem) {
		this.id = id;
		attributes = att;
		elements = elem;
	}
}
