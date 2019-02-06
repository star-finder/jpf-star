package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withToDegrees1 extends TestJPF {

	@Test
	public void test_withToDegrees21() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_30 = null;
		int elem_29 = 3;
		root.elem = elem_29;
		root.next = next_30;
		obj.withToDegrees(root);
	}

	@Test
	public void test_withToDegrees22() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withToDegrees(root);
	}

}

