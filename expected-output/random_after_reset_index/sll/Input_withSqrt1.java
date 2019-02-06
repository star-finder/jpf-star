package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withSqrt1 extends TestJPF {

	@Test
	public void test_withSqrt1() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_48 = null;
		int elem_47 = -17;
		root.elem = elem_47;
		root.next = next_48;
		obj.withSqrt(root);
	}

	@Test
	public void test_withSqrt2() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withSqrt(root);
	}

}

