package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withNextDown1 extends TestJPF {

	@Test
	public void test_withNextDown45() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_56 = null;
		int elem_55 = -17;
		root.elem = elem_55;
		root.next = next_56;
		obj.withNextDown(root);
	}

	@Test
	public void test_withNextDown46() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withNextDown(root);
	}

}

