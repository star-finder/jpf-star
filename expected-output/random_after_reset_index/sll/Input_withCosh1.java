package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withCosh1 extends TestJPF {

	@Test
	public void test_withCosh1() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_64 = null;
		int elem_63 = 15;
		root.elem = elem_63;
		root.next = next_64;
		obj.withCosh(root);
	}

	@Test
	public void test_withCosh2() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withCosh(root);
	}

}

