package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withNextDown1 extends TestJPF {

	@Test
	public void test_withNextDown1() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_66 = null;
		int elem_65 = -22;
		root.elem = elem_65;
		root.next = next_66;
		obj.withNextDown(root);
	}

	@Test
	public void test_withNextDown2() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withNextDown(root);
	}

}

