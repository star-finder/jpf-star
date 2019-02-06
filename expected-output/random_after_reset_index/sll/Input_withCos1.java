package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withCos1 extends TestJPF {

	@Test
	public void test_withCos1() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_96 = null;
		int elem_95 = 11;
		root.elem = elem_95;
		root.next = next_96;
		obj.withCos(root);
	}

	@Test
	public void test_withCos2() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withCos(root);
	}

}

