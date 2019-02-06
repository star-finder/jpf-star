package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withToRadians1 extends TestJPF {

	@Test
	public void test_withToRadians1() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withToRadians(root);
	}

	@Test
	public void test_withToRadians2() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_114 = null;
		int elem_113 = 20;
		root.elem = elem_113;
		root.next = next_114;
		obj.withToRadians(root);
	}

}

