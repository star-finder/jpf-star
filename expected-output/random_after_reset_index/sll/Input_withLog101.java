package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withLog101 extends TestJPF {

	@Test
	public void test_withLog101() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_42 = null;
		int elem_41 = -7;
		root.elem = elem_41;
		root.next = next_42;
		obj.withLog10(root);
	}

	@Test
	public void test_withLog102() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withLog10(root);
	}

}

