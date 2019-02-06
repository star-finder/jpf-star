package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withExp1 extends TestJPF {

	@Test
	public void test_withExp1() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_98 = null;
		int elem_97 = 1;
		root.elem = elem_97;
		root.next = next_98;
		obj.withExp(root);
	}

	@Test
	public void test_withExp2() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withExp(root);
	}

}

