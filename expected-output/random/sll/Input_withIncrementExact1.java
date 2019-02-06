package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withIncrementExact1 extends TestJPF {

	@Test
	public void test_withIncrementExact53() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_72 = null;
		int elem_71 = 24;
		root.elem = elem_71;
		root.next = next_72;
		obj.withIncrementExact(root);
	}

	@Test
	public void test_withIncrementExact54() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withIncrementExact(root);
	}

}

