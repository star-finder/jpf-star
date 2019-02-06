package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withCbrt1 extends TestJPF {

	@Test
	public void test_withCbrt61() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_80 = null;
		int elem_79 = -12;
		root.elem = elem_79;
		root.next = next_80;
		obj.withCbrt(root);
	}

	@Test
	public void test_withCbrt62() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withCbrt(root);
	}

}

