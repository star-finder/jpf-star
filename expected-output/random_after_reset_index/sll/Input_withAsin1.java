package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withAsin1 extends TestJPF {

	@Test
	public void test_withAsin1() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_60 = null;
		int elem_59 = 9;
		root.elem = elem_59;
		root.next = next_60;
		obj.withAsin(root);
	}

	@Test
	public void test_withAsin2() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withAsin(root);
	}

}

