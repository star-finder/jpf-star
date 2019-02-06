package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withAcos1 extends TestJPF {

	@Test
	public void test_withAcos1() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_88 = null;
		int elem_87 = 29;
		root.elem = elem_87;
		root.next = next_88;
		obj.withAcos(root);
	}

	@Test
	public void test_withAcos2() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withAcos(root);
	}

}

