
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Mon Jul 10 19:15:57 UYT 2017
//----------------------------------------------------

package lang.parser;

import java.io.*;
import java.util.*;
import java_cup.runtime.Symbol;
import ast.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Mon Jul 10 19:15:57 UYT 2017
  */
public class Parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\030\000\002\005\004\000\002\002\004\000\002\005" +
    "\005\000\002\002\006\000\002\002\005\000\002\003\005" +
    "\000\002\003\003\000\002\003\007\000\002\003\005\000" +
    "\002\004\003\000\002\004\003\000\002\004\003\000\002" +
    "\004\003\000\002\004\003\000\002\006\003\000\002\006" +
    "\005\000\002\006\005\000\002\006\005\000\002\006\005" +
    "\000\002\006\005\000\002\006\004\000\002\006\005\000" +
    "\002\006\004\000\002\006\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\053\000\016\004\004\020\015\021\011\022\005\023" +
    "\013\024\006\001\002\000\016\004\004\020\015\021\011" +
    "\022\005\023\013\024\006\001\002\000\004\004\037\001" +
    "\002\000\030\005\ufff8\007\ufff8\010\ufff8\011\ufff8\012\ufff8" +
    "\013\ufff8\014\ufff8\015\ufff8\016\ufff8\017\ufff8\022\ufff8\001" +
    "\002\000\026\005\ufff3\010\ufff3\011\ufff3\012\ufff3\013\ufff3" +
    "\014\ufff3\015\ufff3\016\ufff3\017\ufff3\022\ufff3\001\002\000" +
    "\030\005\ufff5\007\ufff5\010\ufff5\011\ufff5\012\ufff5\013\ufff5" +
    "\014\ufff5\015\ufff5\016\ufff5\017\ufff5\022\ufff5\001\002\000" +
    "\030\005\ufff7\007\ufff7\010\ufff7\011\ufff7\012\ufff7\013\ufff7" +
    "\014\ufff7\015\ufff7\016\ufff7\017\ufff7\022\ufff7\001\002\000" +
    "\024\010\036\011\027\012\022\013\030\014\024\015\023" +
    "\016\026\017\025\022\020\001\002\000\030\005\ufff6\007" +
    "\ufff6\010\ufff6\011\ufff6\012\ufff6\013\ufff6\014\ufff6\015\ufff6" +
    "\016\ufff6\017\ufff6\022\ufff6\001\002\000\020\002\016\004" +
    "\004\020\015\021\011\022\005\023\013\024\006\001\002" +
    "\000\030\005\ufff4\007\ufff4\010\ufff4\011\ufff4\012\ufff4\013" +
    "\ufff4\014\ufff4\015\ufff4\016\ufff4\017\ufff4\022\ufff4\001\002" +
    "\000\004\002\000\001\002\000\024\010\021\011\027\012" +
    "\022\013\030\014\024\015\023\016\026\017\025\022\020" +
    "\001\002\000\026\005\uffed\010\uffed\011\uffed\012\uffed\013" +
    "\uffed\014\uffed\015\uffed\016\uffed\017\uffed\022\uffed\001\002" +
    "\000\020\002\uffff\004\uffff\020\uffff\021\uffff\022\uffff\023" +
    "\uffff\024\uffff\001\002\000\016\004\004\020\015\021\011" +
    "\022\005\023\013\024\006\001\002\000\004\022\034\001" +
    "\002\000\016\004\004\020\015\021\011\022\005\023\013" +
    "\024\006\001\002\000\026\005\uffea\010\uffea\011\uffea\012" +
    "\uffea\013\uffea\014\uffea\015\uffea\016\uffea\017\uffea\022\uffea" +
    "\001\002\000\026\005\uffeb\010\uffeb\011\uffeb\012\uffeb\013" +
    "\uffeb\014\uffeb\015\uffeb\016\uffeb\017\uffeb\022\uffeb\001\002" +
    "\000\016\004\004\020\015\021\011\022\005\023\013\024" +
    "\006\001\002\000\016\004\004\020\015\021\011\022\005" +
    "\023\013\024\006\001\002\000\026\005\uffef\010\uffef\011" +
    "\uffef\012\uffef\013\uffef\014\uffef\015\uffef\016\uffef\017\uffef" +
    "\022\uffef\001\002\000\026\005\ufff1\010\ufff1\011\ufff1\012" +
    "\ufff1\013\ufff1\014\ufff1\015\ufff1\016\ufff1\017\ufff1\022\ufff1" +
    "\001\002\000\026\005\uffee\010\uffee\011\uffee\012\uffee\013" +
    "\uffee\014\uffee\015\uffee\016\uffee\017\uffee\022\uffee\001\002" +
    "\000\026\005\uffec\010\uffec\011\uffec\012\uffec\013\uffec\014" +
    "\uffec\015\uffec\016\uffec\017\uffec\022\uffec\001\002\000\026" +
    "\005\ufff0\010\ufff0\011\ufff0\012\ufff0\013\ufff0\014\ufff0\015" +
    "\ufff0\016\ufff0\017\ufff0\022\ufff0\001\002\000\020\002\001" +
    "\004\001\020\001\021\001\022\001\023\001\024\001\001" +
    "\002\000\016\005\043\020\015\021\011\022\040\023\013" +
    "\024\006\001\002\000\006\004\037\006\052\001\002\000" +
    "\006\005\ufffb\007\ufffb\001\002\000\006\005\045\007\044" +
    "\001\002\000\030\005\ufffd\007\ufffd\010\ufffd\011\ufffd\012" +
    "\ufffd\013\ufffd\014\ufffd\015\ufffd\016\ufffd\017\ufffd\022\ufffd" +
    "\001\002\000\014\020\015\021\011\022\047\023\013\024" +
    "\006\001\002\000\030\005\ufffe\007\ufffe\010\ufffe\011\ufffe" +
    "\012\ufffe\013\ufffe\014\ufffe\015\ufffe\016\ufffe\017\ufffe\022" +
    "\ufffe\001\002\000\006\005\ufff9\007\ufff9\001\002\000\006" +
    "\004\037\006\050\001\002\000\014\020\015\021\011\022" +
    "\005\023\013\024\006\001\002\000\006\005\ufffa\007\ufffa" +
    "\001\002\000\014\020\015\021\011\022\005\023\013\024" +
    "\006\001\002\000\006\005\ufffc\007\ufffc\001\002\000\024" +
    "\005\055\011\027\012\022\013\030\014\024\015\023\016" +
    "\026\017\025\022\020\001\002\000\026\005\ufff2\010\ufff2" +
    "\011\ufff2\012\ufff2\013\ufff2\014\ufff2\015\ufff2\016\ufff2\017" +
    "\ufff2\022\ufff2\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\053\000\012\002\007\004\006\005\013\006\011\001" +
    "\001\000\010\002\007\004\006\006\053\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\010\002\007\004\006\006\016\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\010\002\007\004\006\006\034\001" +
    "\001\000\002\001\001\000\010\002\007\004\006\006\032" +
    "\001\001\000\002\001\001\000\002\001\001\000\010\002" +
    "\007\004\006\006\031\001\001\000\010\002\007\004\006" +
    "\006\030\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\010\002\007\003\041\004\040\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\002\007\004\045\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\002\007" +
    "\004\050\001\001\000\002\001\001\000\006\002\007\004" +
    "\052\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




	Expresion exp;
	
	public void setExpresion(Expresion exp){ this.exp = exp; }
	public Expresion getExpresion(){
		if(exp == null) return new Expresion();
		else return exp; 
	}
		
	public static Lexer makeLexer(String input) throws Exception {
		return new Lexer(new StringReader(input));
	}
	
	public static Parser makeParser(String input) throws Exception {
		return new Parser(makeLexer(input));
	}
	
	public static Object parseString(String input) throws Exception {
		Parser parser = Parser.makeParser(input);
		Symbol result = parser.parse();
		return result.value;
	}
	

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // expresion ::= expresion ELEMENTS 
            {
              Expresion RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Expresion e = (Expresion)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = new Elements(e); parser.setExpresion(RESULT); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // expresion ::= expresion ATTRIBUTES 
            {
              Expresion RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Expresion e = (Expresion)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = new Attributes(e); parser.setExpresion(RESULT); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // expresion ::= expresion FILTRO id 
            {
              Expresion RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Expresion e = (Expresion)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Regex(e,i); parser.setExpresion(RESULT); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // expresion ::= expresion id 
            {
              Expresion RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Expresion e = (Expresion)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Filtro(e,i); parser.setExpresion(RESULT); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expresion ::= expresion DIFERENCIA expresion 
            {
              Expresion RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Expresion e1 = (Expresion)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Expresion e2 = (Expresion)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Diferencia(e1,e2); parser.setExpresion(RESULT); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expresion ::= expresion CONCATENACION expresion 
            {
              Expresion RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Expresion e1 = (Expresion)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Expresion e2 = (Expresion)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Concatenacion(e1,e2); parser.setExpresion(RESULT); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expresion ::= expresion UNION expresion 
            {
              Expresion RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Expresion e1 = (Expresion)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Expresion e2 = (Expresion)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Union(e1,e2); parser.setExpresion(RESULT); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expresion ::= expresion INTERSECCION expresion 
            {
              Expresion RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Expresion e1 = (Expresion)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Expresion e2 = (Expresion)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Interseccion(e1,e2); parser.setExpresion(RESULT); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expresion ::= P1 expresion P2 
            {
              Expresion RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Expresion e1 = (Expresion)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = e1; parser.setExpresion(RESULT); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expresion ::= valor 
            {
              Expresion RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object v = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Expresion(v); parser.setExpresion(RESULT); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // valor ::= PESOS 
            {
              Object RESULT =null;
		 RESULT = parser.getExpresion().getNodo(); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("valor",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // valor ::= obj 
            {
              Object RESULT =null;
		int oleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int oright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Nodo o = (Nodo)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = o; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("valor",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // valor ::= str 
            {
              Object RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = s; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("valor",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // valor ::= num 
            {
              Object RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Float n = (Float)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = n; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("valor",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // valor ::= bool 
            {
              Object RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Boolean b = (Boolean)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = b; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("valor",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // lista ::= lista COMMA valor 
            {
              Nodo RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Nodo l = (Nodo)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int vleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object v = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = l; RESULT.addElem(v); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("lista",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // lista ::= lista COMMA id COLON valor 
            {
              Nodo RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		Nodo l = (Nodo)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int vleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object v = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = l; RESULT.addAttr(i,v); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("lista",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // lista ::= valor 
            {
              Nodo RESULT =null;
		int vleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object v = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Nodo(); RESULT.addElem(v); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("lista",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // lista ::= id COLON valor 
            {
              Nodo RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int vleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int vright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object v = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = new Nodo(); RESULT.addAttr(i,v); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("lista",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // obj ::= id P1 P2 
            {
              Nodo RESULT =null;
		int tagleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int tagright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String tag = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		 RESULT = new Nodo(); RESULT.setTag(tag); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("obj",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // obj ::= id P1 lista P2 
            {
              Nodo RESULT =null;
		int tagleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int tagright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		String tag = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int lleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Nodo l = (Nodo)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = l; RESULT.setTag(tag); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("obj",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // root ::= root expresion EOL 
            {
              Expresion RESULT =null;
		int rleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Expresion r = (Expresion)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Expresion e = (Expresion)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = e; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("root",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= root EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Expresion start_val = (Expresion)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // root ::= expresion EOL 
            {
              Expresion RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Expresion e = (Expresion)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 RESULT = e; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("root",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

