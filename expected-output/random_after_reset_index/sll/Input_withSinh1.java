package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withSinh1 extends TestJPF {

	@Test
	public void test_withSinh1() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_4 = null;
		int elem_3 = 16;
		root.elem = elem_3;
		root.next = next_4;
		obj.withSinh(root);
	}

	@Test
	public void test_withSinh2() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withSinh(root);
	}

}

