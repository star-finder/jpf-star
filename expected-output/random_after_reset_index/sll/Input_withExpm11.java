package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withExpm11 extends TestJPF {

	@Test
	public void test_withExpm11() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_58 = null;
		int elem_57 = 5;
		root.elem = elem_57;
		root.next = next_58;
		obj.withExpm1(root);
	}

	@Test
	public void test_withExpm12() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withExpm1(root);
	}

}

