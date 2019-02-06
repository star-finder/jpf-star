package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withTan1 extends TestJPF {

	@Test
	public void test_withTan1() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_34 = null;
		int elem_33 = 12;
		root.elem = elem_33;
		root.next = next_34;
		obj.withTan(root);
	}

	@Test
	public void test_withTan2() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withTan(root);
	}

}

