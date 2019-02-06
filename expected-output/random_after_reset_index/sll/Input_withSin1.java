package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withSin1 extends TestJPF {

	@Test
	public void test_withSin1() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_92 = null;
		int elem_91 = -28;
		root.elem = elem_91;
		root.next = next_92;
		obj.withSin(root);
	}

	@Test
	public void test_withSin2() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withSin(root);
	}

}

