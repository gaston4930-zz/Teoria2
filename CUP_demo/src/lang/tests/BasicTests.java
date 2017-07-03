package lang.tests;

import java.util.*;

import junit.framework.TestCase;
import lang.parser.Parser;

public class BasicTests extends TestCase {

	public ArrayList makeResult(Integer... values) {
		ArrayList list1 = new ArrayList<>();
		list1.add(new ArrayList<>(Arrays.asList(values)));
		return list1;
	}
	
	public void test1() throws Exception {
		assertEquals(Parser.parseString("1,2,3\n"), makeResult(1, 2, 3));
		assertEquals(Parser.parseString("4,56\n"), makeResult(4,56));
		assertEquals(Parser.parseString("789\n"), makeResult(789));
	}
	
}
