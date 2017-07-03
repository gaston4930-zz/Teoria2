package ast;

public class Expression {
	String code; 
	public String unparse()
	{
		return code;
	}
	public Expression(String code){
		this.code = code;
		
	}
}