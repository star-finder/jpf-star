package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withRint1 extends TestJPF {

	@Test
	public void test_withRint27() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_36 = null;
		int elem_35 = 9;
		root.elem = elem_35;
		root.next = next_36;
		obj.withRint(root);
	}

	@Test
	public void test_withRint28() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withRint(root);
	}

}

