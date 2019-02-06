package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withIncrementExact1 extends TestJPF {

	@Test
	public void test_withIncrementExact1() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_82 = null;
		int elem_81 = -17;
		root.elem = elem_81;
		root.next = next_82;
		obj.withIncrementExact(root);
	}

	@Test
	public void test_withIncrementExact2() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withIncrementExact(root);
	}

}

