package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withToRadians1 extends TestJPF {

	@Test
	public void test_withToRadians77() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withToRadians(root);
	}

	@Test
	public void test_withToRadians78() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_104 = null;
		int elem_103 = -7;
		root.elem = elem_103;
		root.next = next_104;
		obj.withToRadians(root);
	}

}

