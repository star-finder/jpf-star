package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withCosh1 extends TestJPF {

	@Test
	public void test_withCosh43() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_54 = null;
		int elem_53 = 30;
		root.elem = elem_53;
		root.next = next_54;
		obj.withCosh(root);
	}

	@Test
	public void test_withCosh44() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withCosh(root);
	}

}

