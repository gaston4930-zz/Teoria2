package lang.tests;

import java.util.*;

import junit.framework.TestCase;
import lang.parser.Parser;

public class BasicTests extends TestCase {

	public void test1() throws Exception {
		ArrayList<String> array = new ArrayList<>();
		array.add("a = true");
		assertEquals(Parser.parseString("a = T;"),array);
		array.clear();
		array.add("be = true");
		array.add("cd = false");
		array.add("g = true");
		assertEquals(Parser.parseString("be=T;cd=F;g=be\\/cd;"), array);
		array.clear();
		array.add("a = false");
		assertEquals(Parser.parseString("a=                        T->F<->T/\\T;"),array);
	}
}
