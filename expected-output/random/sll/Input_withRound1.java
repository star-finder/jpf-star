package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withRound1 extends TestJPF {

	@Test
	public void test_withRound17() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_26 = null;
		int elem_25 = 30;
		root.elem = elem_25;
		root.next = next_26;
		obj.withRound(root);
	}

	@Test
	public void test_withRound18() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withRound(root);
	}

}

