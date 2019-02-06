package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withExpm11 extends TestJPF {

	@Test
	public void test_withExpm137() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_48 = null;
		int elem_47 = 5;
		root.elem = elem_47;
		root.next = next_48;
		obj.withExpm1(root);
	}

	@Test
	public void test_withExpm138() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withExpm1(root);
	}

}

