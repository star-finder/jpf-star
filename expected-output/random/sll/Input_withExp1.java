package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withExp1 extends TestJPF {

	@Test
	public void test_withExp69() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_88 = null;
		int elem_87 = -17;
		root.elem = elem_87;
		root.next = next_88;
		obj.withExp(root);
	}

	@Test
	public void test_withExp70() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withExp(root);
	}

}

