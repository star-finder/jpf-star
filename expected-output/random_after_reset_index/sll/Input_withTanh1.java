package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withTanh1 extends TestJPF {

	@Test
	public void test_withTanh1() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_94 = null;
		int elem_93 = -7;
		root.elem = elem_93;
		root.next = next_94;
		obj.withTanh(root);
	}

	@Test
	public void test_withTanh2() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withTanh(root);
	}

}

