package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withAsin1 extends TestJPF {

	@Test
	public void test_withAsin39() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_50 = null;
		int elem_49 = -25;
		root.elem = elem_49;
		root.next = next_50;
		obj.withAsin(root);
	}

	@Test
	public void test_withAsin40() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withAsin(root);
	}

}

