package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withSqrt1 extends TestJPF {

	@Test
	public void test_withSqrt29() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_38 = null;
		int elem_37 = -7;
		root.elem = elem_37;
		root.next = next_38;
		obj.withSqrt(root);
	}

	@Test
	public void test_withSqrt30() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withSqrt(root);
	}

}

