package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withLog1p1 extends TestJPF {

	@Test
	public void test_withLog1p1() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_84 = null;
		int elem_83 = 4;
		root.elem = elem_83;
		root.next = next_84;
		obj.withLog1p(root);
	}

	@Test
	public void test_withLog1p2() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withLog1p(root);
	}

}

