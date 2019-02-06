package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withNegateExact1 extends TestJPF {

	@Test
	public void test_withNegateExact1() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_86 = null;
		int elem_85 = 7;
		root.elem = elem_85;
		root.next = next_86;
		obj.withNegateExact(root);
	}

	@Test
	public void test_withNegateExact2() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withNegateExact(root);
	}

}

