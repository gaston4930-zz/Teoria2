package ast;


public class NodoKV {

	String key;
	Object value;
	
	public NodoKV(){
		key = "";
		value = null;
	}
	
	public NodoKV(String key, Object value){
		this.key = key;
		this.value = value;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NodoKV other = (NodoKV) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

}
