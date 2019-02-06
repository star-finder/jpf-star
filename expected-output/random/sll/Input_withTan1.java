package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withTan1 extends TestJPF {

	@Test
	public void test_withTan15() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_24 = null;
		int elem_23 = -21;
		root.elem = elem_23;
		root.next = next_24;
		obj.withTan(root);
	}

	@Test
	public void test_withTan16() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withTan(root);
	}

}

