package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withDecrementExact1 extends TestJPF {

	@Test
	public void test_withDecrementExact1() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_56 = null;
		int elem_55 = -4;
		root.elem = elem_55;
		root.next = next_56;
		obj.withDecrementExact(root);
	}

	@Test
	public void test_withDecrementExact2() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withDecrementExact(root);
	}

}

