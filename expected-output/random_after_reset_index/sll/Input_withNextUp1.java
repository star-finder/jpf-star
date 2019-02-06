package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withNextUp1 extends TestJPF {

	@Test
	public void test_withNextUp1() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withNextUp(root);
	}

	@Test
	public void test_withNextUp2() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_2 = null;
		int elem_1 = 2;
		root.elem = elem_1;
		root.next = next_2;
		obj.withNextUp(root);
	}

}

