package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withLog1p1 extends TestJPF {

	@Test
	public void test_withLog1p55() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_74 = null;
		int elem_73 = 26;
		root.elem = elem_73;
		root.next = next_74;
		obj.withLog1p(root);
	}

	@Test
	public void test_withLog1p56() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withLog1p(root);
	}

}

