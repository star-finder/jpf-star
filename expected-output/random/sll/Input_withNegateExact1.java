package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withNegateExact1 extends TestJPF {

	@Test
	public void test_withNegateExact57() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_76 = null;
		int elem_75 = 24;
		root.elem = elem_75;
		root.next = next_76;
		obj.withNegateExact(root);
	}

	@Test
	public void test_withNegateExact58() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withNegateExact(root);
	}

}

