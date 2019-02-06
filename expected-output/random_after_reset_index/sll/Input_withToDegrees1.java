package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withToDegrees1 extends TestJPF {

	@Test
	public void test_withToDegrees1() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_40 = null;
		int elem_39 = -4;
		root.elem = elem_39;
		root.next = next_40;
		obj.withToDegrees(root);
	}

	@Test
	public void test_withToDegrees2() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withToDegrees(root);
	}

}

