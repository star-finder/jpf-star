package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withLog101 extends TestJPF {

	@Test
	public void test_withLog1023() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_32 = null;
		int elem_31 = -11;
		root.elem = elem_31;
		root.next = next_32;
		obj.withLog10(root);
	}

	@Test
	public void test_withLog1024() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withLog10(root);
	}

}

