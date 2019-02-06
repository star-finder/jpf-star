package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withSignum1 extends TestJPF {

	@Test
	public void test_withSignum1() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_44 = null;
		int elem_43 = -4;
		root.elem = elem_43;
		root.next = next_44;
		obj.withSignum(root);
	}

	@Test
	public void test_withSignum2() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withSignum(root);
	}

}

