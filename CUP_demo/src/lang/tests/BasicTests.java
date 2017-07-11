package lang.tests;

import ast.Concatenacion;
import ast.Diferencia;
import ast.Nodo;
import ast.Union;
import junit.framework.TestCase;
import lang.parser.Parser;

public class BasicTests extends TestCase {
		
	public void tests() throws Exception {
		diferencia();		
		union();
		concatenacion();
	}
	
	public void diferencia() throws Exception{
		//Diferencia Elementos - INICIO
				Nodo n = new Nodo();
				n.setTag("$");
				Diferencia d = (Diferencia)Parser.parseString("Object(1)-Object(1)\n");
				assertEquals(d.getNodo(),n);
				
				n= new Nodo();
				n.setTag("$");
				d = (Diferencia)Parser.parseString("Object(\"1\")-Object(\"1\")\n");
				assertEquals(d.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addElem((float)1.0);
				d = (Diferencia)Parser.parseString("Object(1)-Object(2)\n");
				assertEquals(d.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addElem((float)2.0);
				n.addElem((float)3.0);
				n.addElem((float)4.0);
				d = (Diferencia)Parser.parseString("Object(1,2,3,4)-Object(1)\n");
				assertEquals(d.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addElem((float)3.0);
				n.addElem((float)4.0);
				d = (Diferencia)Parser.parseString("Object(1,2,3,4)-Object(1,2)\n");
				assertEquals(d.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addElem((float)4.0);
				d = (Diferencia)Parser.parseString("Object(1,2,3,4)-Object(1,2,3)\n");
				assertEquals(d.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addElem((float)1.0);
				d = (Diferencia)Parser.parseString("Object(1,2,3,4)-Object(2,3,4)\n");
				assertEquals(d.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				d = (Diferencia)Parser.parseString("Object(1,2,3,4)-Object(2,1,3,4)\n");
				assertEquals(d.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				d = (Diferencia)Parser.parseString("Object(1,2,3,4)-Object(4,3,2,1)\n");
				assertEquals(d.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addElem((float)5.0);
				d = (Diferencia)Parser.parseString("Object(1,2,3,4,5)-Object(4,3,2,1)\n");
				assertEquals(d.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addElem((float)5.0);
				n.addElem(true);
				d = (Diferencia)Parser.parseString("Object(1,2,3,4,5,true)-Object(4,3,2,1)\n");
				assertEquals(d.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addElem((float)1.0);
				n.addElem(true);
				n.addElem("algo");
				d = (Diferencia)Parser.parseString("Object(1,true,false,\"algo\")-Object(false)\n");
				//assertEquals(d.getNodo(),n);	//TODO Corregir "
				
				n = new Nodo();
				n.setTag("$");
				n.addElem((float)1.0);
				n.addElem(true);
				n.addElem(false);
				d = (Diferencia)Parser.parseString("Object(1,true,false,\"algo\")-Object(\"algo\")\n");
				assertEquals(d.getNodo(),n);

				//List(id:l1,SubList(1,2,3,4,5))-List(id:l2,SubList(1,3,5))
				n = new Nodo();
				n.setTag("$");
				d = (Diferencia)Parser.parseString("List(SubList(1,2,3,4,5))-List(SubList(1,2,3,4,5))\n");
				assertEquals(d.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				Nodo n1 = new Nodo("SubList");
				n1.addElem((float)1);
				n1.addElem((float)2);
				n1.addElem((float)3);
				n1.addElem((float)4);
				n1.addElem((float)5);
				n.addElem(n1);
				d = (Diferencia)Parser.parseString("List(SubList(1,2,3,4,5))-List(SubList(1,2,3,4))\n");
				assertEquals(d.getNodo(),n);
				

				//Diferencia Elementos - FIN
				
				//Diferencia Atributos - INICIO
				n = new Nodo();
				n.setTag("$");
				d = (Diferencia)Parser.parseString("Object(id:1)-Object(id:1)\n");
				assertEquals(d.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addAttr("id", (float)1.0);
				d = (Diferencia)Parser.parseString("Object(id:1)-Object(id:2)\n");
				assertEquals(d.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addAttr("id", "\"algo\"");
				d = (Diferencia)Parser.parseString("Object(id:\"algo\")-Object(id:2)\n");
				assertEquals(d.getNodo(),n);	//TODO Arreglar "
				
				n = new Nodo();
				n.setTag("$");
				n.addAttr("id", (float)1.0);
				n.addAttr("label","\"algo\"");
				d = (Diferencia)Parser.parseString("Object(id:1, label:\"algo\")-Object(id:2)\n");
				assertEquals(d.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addAttr("label1","\"algo1\"");
				n.addAttr("label2",false);
				d = (Diferencia)Parser.parseString("Object(id:1, label1:\"algo1\",label2:false)-Object(id:1,label:\"algo\")\n");
				assertEquals(d.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addAttr("id",(float)1.0);
				n.addAttr("label1","\"algo1\"");
				d = (Diferencia)Parser.parseString("Object(id:1, label1:\"algo1\",label2:false)-Object(id:\"1\", label1:1,label2:false)\n");
				assertEquals(d.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addAttr("id","\"zero\"");
				d = (Diferencia)Parser.parseString("Object(id:\"zero\", label1:\"algo1\",label2:false,label3:3)-Object(label1:\"algo1\",label2:false,label3:3)\n");
				assertEquals(d.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				d = (Diferencia)Parser.parseString("Object(l1:true,l2:\"dos\",l3:3)-Object(l3:3,l2:\"dos\",l1:true)\n");
				assertEquals(d.getNodo(),n);
				
				//Diferencia Atributos - FIN
				
				//Diferencia A+E - INICIO
				n = new Nodo();
				n.setTag("$");
				n.addAttr("id","\"l1\"");
				n.addElem(n1);
				d = (Diferencia)Parser.parseString("List(id:\"l1\",SubList(1,2,3,4,5))-List(id:\"l2\",SubList(1,3,5))\n");
				assertEquals(d.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				d = (Diferencia)Parser.parseString("List(id:\"l1\",SubList(1,2,3,4,5))-List(id:\"l1\",SubList(1,2,3,4,5))\n");
				assertEquals(d.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addAttr("id","\"l1\"");
				d = (Diferencia)Parser.parseString("List(id:\"l1\",true,true,false)-List(id:\"l2\",false,false,true)\n");
				assertEquals(d.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addAttr("id","\"l1\"");
				d = (Diferencia)Parser.parseString("List(id:\"l1\",true,true)-List2(id:\"l2\",true)\n");
				assertEquals(d.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addElem(true);
				n.addElem(false);
				d = (Diferencia)Parser.parseString("List(id:\"l1\",true,false)-List2(id:\"l1\",\"true\",\"false\")\n");
				assertEquals(d.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addAttr("id2",(float) 2);
				n.addElem(false);
				d = (Diferencia)Parser.parseString("List(id:\"l1\",id2:2,true,false)-List2(id:\"l1\",\"true\",\"false\",true)\n");
				assertEquals(d.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");

				d = (Diferencia)Parser.parseString("List(id:\"l1\",id2:2,true,false)-List(id2:2,id:\"l1\",false,true)\n");
				assertEquals(d.getNodo(),n);
				//Diferencia A+E - FIN

	}
	
	public void union() throws Exception{
		Nodo n;
		//Union Elementos - INICIO
				n = new Nodo();
				n.setTag("$");
				n.addElem((float)1);
				Union u =  (Union)Parser.parseString("Object(1)|Object(1)\n");
				assertEquals(u.getNodo(),n);
				
				n= new Nodo();
				n.setTag("$");
				n.addElem("\"1\"");
				u =  (Union)Parser.parseString("Object(\"1\")|Object(\"1\")\n");
				assertEquals(u.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addElem((float)1.0);
				n.addElem((float)2.0);
				u =  (Union)Parser.parseString("Object(1)|Object(2)\n");
				assertEquals(u.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addElem((float)1.0);
				n.addElem((float)2.0);
				n.addElem((float)3.0);
				u =  (Union)Parser.parseString("Object(1,2,3)|Object()\n");
				assertEquals(u.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addElem((float)2.0);
				n.addElem((float)3.0);
				n.addElem((float)4.0);
				n.addElem((float)1.0);
				u =  (Union)Parser.parseString("Object(1,2,3,4)|Object(1)\n");
				assertEquals(u.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addElem((float)3.0);
				n.addElem((float)4.0);
				n.addElem((float)1.0);
				n.addElem((float)2.0);
				u =  (Union)Parser.parseString("Object(1,2,3,4)|Object(1,2)\n");
				assertEquals(u.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addElem((float)4.0);
				n.addElem((float)1.0);
				n.addElem((float)2.0);
				n.addElem((float)3.0);
				u =  (Union)Parser.parseString("Object(1,2,3,4)|Object(1,2,3)\n");
				assertEquals(u.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addElem((float)1.0);
				n.addElem((float)2.0);
				n.addElem((float)3.0);
				n.addElem((float)4.0);
				n.addElem((float)5.0);
				n.addElem((float)6.0);
				n.addElem((float)7.0);
				u =  (Union)Parser.parseString("Object(1,2,3,4)|Object(5,6,7)\n");
				assertEquals(u.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addElem((float)1.0);
				n.addElem((float)2.0);
				n.addElem((float)3.0);
				n.addElem((float)4.0);
				n.addElem(true);
				u =  (Union)Parser.parseString("Object(1,2,3,4)|Object(true,true,true)\n");
				assertEquals(u.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addElem(false);
				n.addElem(true);
				u =  (Union)Parser.parseString("Object(true)|Object(false,true)\n");
				assertEquals(u.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addElem("\"1\"");
				n.addElem((float)2);
				n.addElem(true);
				n.addElem("\"2\"");
				n.addElem(false);
				n.addElem((float)1);
				u =  (Union)Parser.parseString("Object(\"1\",2,true)|Object(\"2\",false,1)\n");
				assertEquals(u.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addElem((float)1);
				n.addElem((float)2);
				n.addElem(false);
				u =  (Union)Parser.parseString("Object()|Object(1,2,false)\n");
				assertEquals(u.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addElem((float)1.0);
				n.addElem(true);
				n.addElem("algo");
				u =  (Union)Parser.parseString("Object(1,true,false,\"algo\")|Object(false)\n");
				//assertEquals(u.getNodo(),n);	//TODO Corregir "
				
				n = new Nodo();
				n.setTag("$");
				u =  (Union)Parser.parseString("Object()|Object()\n");
				assertEquals(u.getNodo(),n);

				n = new Nodo();
				n.setTag("$");
				Nodo n1 = new Nodo("SubList");
				n1.addElem((float)1);
				n1.addElem((float)2);
				n1.addElem((float)3);
				n1.addElem((float)4);
				n1.addElem((float)5);
				n.addElem(n1);
				u =  (Union)Parser.parseString("List(SubList(1,2,3,4,5))|List(SubList())\n");
				//assertEquals(u.getNodo(),n);	//TODO REVISAR
				
				//Union Elementos | FIN
				
				//Union Atributos | INICIO
				n = new Nodo();
				n.setTag("$");
				n.addAttr("id", (float)1);
				u =  (Union)Parser.parseString("Object(id:1)|Object(id:1)\n");
				assertEquals(u.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addAttr("id", (float)1);
				n.addAttr("id", (float)2);
				u =  (Union)Parser.parseString("Object(id:1)|Object(id:2)\n");
				assertEquals(u.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addAttr("id", "\"algo\"");
				n.addAttr("id", (float)2);
				u =  (Union)Parser.parseString("Object(id:\"algo\")|Object(id:2)\n");
				assertEquals(u.getNodo(),n);	//TODO Arreglar "
				
				n = new Nodo();
				n.setTag("$");
				n.addAttr("id", (float)1);
				n.addAttr("label","\"algo\"");
				n.addAttr("id", (float)2);
				u =  (Union)Parser.parseString("Object(id:1, label:\"algo\")|Object(id:2)\n");
				assertEquals(u.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addAttr("label1","\"algo1\"");
				n.addAttr("label2",false);
				n.addAttr("id", (float)1);
				n.addAttr("label","\"algo\"");
				u =  (Union)Parser.parseString("Object(id:1, label1:\"algo1\",label2:false)|Object(id:1,label:\"algo\")\n");
				assertEquals(u.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addAttr("id",(float)1.0);
				n.addAttr("label1","\"algo1\"");
				n.addAttr("id","\"1\"");
				n.addAttr("label1",(float)1.0);
				n.addAttr("label2",false);
				u =  (Union)Parser.parseString("Object(id:1, label1:\"algo1\",label2:false)|Object(id:\"1\", label1:1,label2:false)\n");
				assertEquals(u.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addAttr("id","\"zero\"");
				n.addAttr("label1","\"algo1\"");
				n.addAttr("label2",false);
				n.addAttr("label3",(float)3);
				u =  (Union)Parser.parseString("Object(id:\"zero\", label1:\"algo1\",label2:false,label3:3)|Object(label1:\"algo1\",label2:false,label3:3)\n");
				assertEquals(u.getNodo(),n);	
				
				n = new Nodo();
				n.setTag("$");
				n.addAttr("l3",(float)3);
				n.addAttr("l2","\"dos\"");
				n.addAttr("l1",true);
				u =  (Union)Parser.parseString("Object(l1:true,l2:\"dos\",l3:3)|Object(l3:3,l2:\"dos\",l1:true)\n");
				assertEquals(u.getNodo(),n);
				
				//Union Atributos | FIN
				
				//Union A+E | INICIO
				n = new Nodo();
				n.setTag("$");
				n.addAttr("id","\"l1\"");
				n.addAttr("id", "\"l2\"");
				n.addElem(n1);
				Nodo n2 = new Nodo("SubList");
				n2.addElem((float)1);
				n2.addElem((float)3);
				n2.addElem((float)5);
				n.addElem(n2);
				u =  (Union)Parser.parseString("List(id:\"l1\",SubList(1,2,3,4,5))|List(id:\"l2\",SubList(1,3,5))\n");
				assertEquals(u.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addAttr("id","\"l1\"");
				n.addElem(n1);
				u =  (Union)Parser.parseString("List(id:\"l1\",SubList(1,2,3,4,5))|List(id:\"l1\",SubList(1,2,3,4,5))\n");
				assertEquals(u.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addAttr("id","\"l1\"");
				n.addAttr("id","\"l2\"");
				n.addElem(false);
				n.addElem(true);
				u =  (Union)Parser.parseString("List(id:\"l1\",true,true,false)|List(id:\"l2\",false,false,true)\n");
				assertEquals(u.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addAttr("id","\"l1\"");
				n.addAttr("id","\"l2\"");
				n.addElem(true);
				u =  (Union)Parser.parseString("List(id:\"l1\",true,true)|List2(id:\"l2\",true)\n");
				assertEquals(u.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addAttr("id", "\"l1\"");
				n.addElem(true);
				n.addElem(false);
				n.addElem("\"true\"");
				n.addElem("\"false\"");
				u =  (Union)Parser.parseString("List(id:\"l1\",true,false)|List2(id:\"l1\",\"true\",\"false\")\n");
				assertEquals(u.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addAttr("id2",(float) 2);
				n.addAttr("id","\"l1\"");
				n.addElem(false);
				n.addElem("\"true\"");
				n.addElem("\"false\"");
				n.addElem(true);
				u =  (Union)Parser.parseString("List(id:\"l1\",id2:2,true,false)|List2(id:\"l1\",\"true\",\"false\",true)\n");
				assertEquals(u.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addAttr("id2", (float)2);
				n.addAttr("id", "\"l1\"");
				n.addElem(false);
				n.addElem(true);
				u =  (Union)Parser.parseString("List(id:\"l1\",id2:2,true,false)|List(id2:2,id:\"l1\",false,true)\n");
				assertEquals(u.getNodo(),n);
				//Union A+E | FIN
				
	}

	public void concatenacion() throws Exception{
		Nodo n;
		//Concatenacion Elementos - INICIO
				n = new Nodo();
				n.setTag("$");
				n.addElem((float)1);
				n.addElem((float)1);
				Concatenacion c =  (Concatenacion)Parser.parseString("Object(1)+Object(1)\n");
				assertEquals(c.getNodo(),n);
				
				n= new Nodo();
				n.setTag("$");
				n.addElem("\"1\"");
				n.addElem("\"1\"");
				c =  (Concatenacion)Parser.parseString("Object(\"1\")+Object(\"1\")\n");
				assertEquals(c.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addElem((float)1.0);
				n.addElem((float)2.0);
				c =  (Concatenacion)Parser.parseString("Object(1)+Object(2)\n");
				assertEquals(c.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addElem((float)1.0);
				n.addElem((float)2.0);
				n.addElem((float)3.0);
				c =  (Concatenacion)Parser.parseString("Object(1,2,3)+Object()\n");
				assertEquals(c.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addElem((float)1.0);
				n.addElem((float)2.0);
				n.addElem((float)3.0);
				n.addElem((float)4.0);
				n.addElem((float)1.0);
				c =  (Concatenacion)Parser.parseString("Object(1,2,3,4)+Object(1)\n");
				assertEquals(c.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addElem((float)1.0);
				n.addElem((float)2.0);
				n.addElem((float)3.0);
				n.addElem((float)4.0);
				n.addElem((float)1.0);
				n.addElem((float)2.0);
				c =  (Concatenacion)Parser.parseString("Object(1,2,3,4)+Object(1,2)\n");
				assertEquals(c.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addElem((float)1.0);
				n.addElem((float)2.0);
				n.addElem((float)3.0);
				n.addElem((float)4.0);
				n.addElem((float)1.0);
				n.addElem((float)2.0);
				n.addElem((float)3.0);
				c =  (Concatenacion)Parser.parseString("Object(1,2,3,4)+Object(1,2,3)\n");
				assertEquals(c.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addElem((float)1.0);
				n.addElem((float)2.0);
				n.addElem((float)3.0);
				n.addElem((float)4.0);
				n.addElem((float)5.0);
				n.addElem((float)6.0);
				n.addElem((float)7.0);
				c =  (Concatenacion)Parser.parseString("Object(1,2,3,4)+Object(5,6,7)\n");
				assertEquals(c.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addElem((float)1.0);
				n.addElem((float)2.0);
				n.addElem((float)3.0);
				n.addElem((float)4.0);
				n.addElem(true);
				n.addElem(true);
				n.addElem(true);
				c =  (Concatenacion)Parser.parseString("Object(1,2,3,4)+Object(true,true,true)\n");
				assertEquals(c.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addElem(true);
				n.addElem(false);
				n.addElem(true);
				c =  (Concatenacion)Parser.parseString("Object(true)+Object(false,true)\n");
				assertEquals(c.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addElem("\"1\"");
				n.addElem((float)2);
				n.addElem(true);
				n.addElem("\"2\"");
				n.addElem(false);
				n.addElem((float)1);
				c =  (Concatenacion)Parser.parseString("Object(\"1\",2,true)+Object(\"2\",false,1)\n");
				assertEquals(c.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addElem((float)1);
				n.addElem((float)2);
				n.addElem(false);
				c =  (Concatenacion)Parser.parseString("Object()+Object(1,2,false)\n");
				assertEquals(c.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addElem((float)1.0);
				n.addElem(true);
				n.addElem("algo");
				c =  (Concatenacion)Parser.parseString("Object(1,true,false,\"algo\")+Object(false)\n");
				//assertEquals(u.getNodo(),n);	//TODO Corregir "
				
				n = new Nodo();
				n.setTag("$");
				c =  (Concatenacion)Parser.parseString("Object()+Object()\n");
				assertEquals(c.getNodo(),n);

				n = new Nodo();
				n.setTag("$");
				Nodo n1 = new Nodo("SubList");
				n1.addElem((float)1);
				n1.addElem((float)2);
				n1.addElem((float)3);
				n1.addElem((float)4);
				n1.addElem((float)5);
				n.addElem(n1);
				c =  (Concatenacion)Parser.parseString("List(SubList(1,2,3,4,5))+List(SubList())\n");
				//assertEquals(u.getNodo(),n);	//TODO REVISAR
				
				//Concatenacion Elementos + FIN
				
				//Concatenacion Atributos + INICIO
				n = new Nodo();
				n.setTag("$");
				n.addAttr("id", (float)1);
				n.addAttr("id", (float)1);
				c =  (Concatenacion)Parser.parseString("Object(id:1)+Object(id:1)\n");
				assertEquals(c.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addAttr("id", (float)1);
				n.addAttr("id", (float)2);
				c =  (Concatenacion)Parser.parseString("Object(id:1)+Object(id:2)\n");
				assertEquals(c.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addAttr("id", "\"algo\"");
				n.addAttr("id", (float)2);
				c =  (Concatenacion)Parser.parseString("Object(id:\"algo\")+Object(id:2)\n");
				assertEquals(c.getNodo(),n);	//TODO Arreglar "
				
				n = new Nodo();
				n.setTag("$");
				n.addAttr("id", (float)1);
				n.addAttr("label","\"algo\"");
				n.addAttr("id", (float)2);
				c =  (Concatenacion)Parser.parseString("Object(id:1, label:\"algo\")+Object(id:2)\n");
				assertEquals(c.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addAttr("id", (float)1);
				n.addAttr("label1","\"algo1\"");
				n.addAttr("label2",false);
				n.addAttr("id", (float)1);
				n.addAttr("label","\"algo\"");
				c =  (Concatenacion)Parser.parseString("Object(id:1, label1:\"algo1\",label2:false)+Object(id:1,label:\"algo\")\n");
				assertEquals(c.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addAttr("id",(float)1);
				n.addAttr("label1","\"algo1\"");
				n.addAttr("label2",false);
				n.addAttr("id","\"1\"");
				n.addAttr("label1", (float)1);
				n.addAttr("label2",false);
				c =  (Concatenacion)Parser.parseString("Object(id:1, label1:\"algo1\",label2:false)+Object(id:\"1\", label1:1,label2:false)\n");
				assertEquals(c.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addAttr("id","\"zero\"");
				n.addAttr("label1","\"algo1\"");
				n.addAttr("label2",false);
				n.addAttr("label3",(float)3);
				n.addAttr("label1","\"algo1\"");
				n.addAttr("label2",false);
				n.addAttr("label3",(float)3);
				c =  (Concatenacion)Parser.parseString("Object(id:\"zero\", label1:\"algo1\",label2:false,label3:3)+Object(label1:\"algo1\",label2:false,label3:3)\n");
				assertEquals(c.getNodo(),n);	
				
				n = new Nodo();
				n.setTag("$");
				n.addAttr("l1",true);
				n.addAttr("l2","\"dos\"");
				n.addAttr("l3",(float)3);
				n.addAttr("l3",(float)3);
				n.addAttr("l2","\"dos\"");
				n.addAttr("l1",true);
				c =  (Concatenacion)Parser.parseString("Object(l1:true,l2:\"dos\",l3:3)+Object(l3:3,l2:\"dos\",l1:true)\n");
				assertEquals(c.getNodo(),n);
				
				//Concatenacion Atributos + FIN
				
				//Concatenacion A+E + INICIO
				n = new Nodo();
				n.setTag("$");
				n.addAttr("id","\"l1\"");
				n.addAttr("id", "\"l2\"");
				n.addElem(n1);
				Nodo n2 = new Nodo("SubList");
				n2.addElem((float)1);
				n2.addElem((float)3);
				n2.addElem((float)5);
				n.addElem(n2);
				c =  (Concatenacion)Parser.parseString("List(id:\"l1\",SubList(1,2,3,4,5))+List(id:\"l2\",SubList(1,3,5))\n");
				assertEquals(c.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addAttr("id","\"l1\"");
				n.addAttr("id","\"l1\"");
				n.addElem(n1);
				n.addElem(n1);
				c =  (Concatenacion)Parser.parseString("List(id:\"l1\",SubList(1,2,3,4,5))+List(id:\"l1\",SubList(1,2,3,4,5))\n");
				assertEquals(c.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addAttr("id","\"l1\"");
				n.addAttr("id","\"l2\"");
				n.addElem(true);
				n.addElem(true);
				n.addElem(false);
				n.addElem(false);
				n.addElem(false);
				n.addElem(true);
				c =  (Concatenacion)Parser.parseString("List(id:\"l1\",true,true,false)+List(id:\"l2\",false,false,true)\n");
				assertEquals(c.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addAttr("id","\"l1\"");
				n.addAttr("id","\"l2\"");
				n.addElem(true);
				n.addElem(true);
				n.addElem(true);
				c =  (Concatenacion)Parser.parseString("List(id:\"l1\",true,true)+List2(id:\"l2\",true)\n");
				assertEquals(c.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addAttr("id", "\"l1\"");
				n.addAttr("id", "\"l1\"");
				n.addElem(true);
				n.addElem(false);
				n.addElem("\"true\"");
				n.addElem("\"false\"");
				c =  (Concatenacion)Parser.parseString("List(id:\"l1\",true,false)+List2(id:\"l1\",\"true\",\"false\")\n");
				assertEquals(c.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addAttr("id","\"l1\"");
				n.addAttr("id2",(float) 2);
				n.addAttr("id","\"l1\"");
				n.addElem(true);
				n.addElem(false);
				n.addElem("\"true\"");
				n.addElem("\"false\"");
				n.addElem(true);
				c =  (Concatenacion)Parser.parseString("List(id:\"l1\",id2:2,true,false)+List2(id:\"l1\",\"true\",\"false\",true)\n");
				assertEquals(c.getNodo(),n);
				
				n = new Nodo();
				n.setTag("$");
				n.addAttr("id", "\"l1\"");
				n.addAttr("id2", (float)2);
				n.addAttr("id2", (float)2);
				n.addAttr("id", "\"l1\"");
				n.addElem(true);
				n.addElem(false);
				n.addElem(false);
				n.addElem(true);
				c =  (Concatenacion)Parser.parseString("List(id:\"l1\",id2:2,true,false)+List(id2:2,id:\"l1\",false,true)\n");
				assertEquals(c.getNodo(),n);
				//Concatenacion A+E + FIN
				
	}
}
