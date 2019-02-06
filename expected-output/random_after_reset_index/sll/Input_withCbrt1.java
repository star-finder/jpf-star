package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withCbrt1 extends TestJPF {

	@Test
	public void test_withCbrt1() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_90 = null;
		int elem_89 = 26;
		root.elem = elem_89;
		root.next = next_90;
		obj.withCbrt(root);
	}

	@Test
	public void test_withCbrt2() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withCbrt(root);
	}

}

