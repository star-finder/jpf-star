package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withSignum1 extends TestJPF {

	@Test
	public void test_withSignum25() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_34 = null;
		int elem_33 = -27;
		root.elem = elem_33;
		root.next = next_34;
		obj.withSignum(root);
	}

	@Test
	public void test_withSignum26() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withSignum(root);
	}

}

