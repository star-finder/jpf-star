package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withTanh1 extends TestJPF {

	@Test
	public void test_withTanh65() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_84 = null;
		int elem_83 = 12;
		root.elem = elem_83;
		root.next = next_84;
		obj.withTanh(root);
	}

	@Test
	public void test_withTanh66() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withTanh(root);
	}

}

