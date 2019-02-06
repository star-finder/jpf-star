package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withAcos1 extends TestJPF {

	@Test
	public void test_withAcos59() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_78 = null;
		int elem_77 = 27;
		root.elem = elem_77;
		root.next = next_78;
		obj.withAcos(root);
	}

	@Test
	public void test_withAcos60() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withAcos(root);
	}

}

