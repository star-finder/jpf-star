package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withRint1 extends TestJPF {

	@Test
	public void test_withRint1() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_46 = null;
		int elem_45 = -3;
		root.elem = elem_45;
		root.next = next_46;
		obj.withRint(root);
	}

	@Test
	public void test_withRint2() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withRint(root);
	}

}

