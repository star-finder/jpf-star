package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withLog1 extends TestJPF {

	@Test
	public void test_withLog1() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_22 = null;
		int elem_21 = -7;
		root.elem = elem_21;
		root.next = next_22;
		obj.withLog(root);
	}

	@Test
	public void test_withLog2() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withLog(root);
	}

}

