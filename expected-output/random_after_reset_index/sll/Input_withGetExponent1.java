package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withGetExponent1 extends TestJPF {

	@Test
	public void test_withGetExponent1() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_38 = null;
		int elem_37 = 16;
		root.elem = elem_37;
		root.next = next_38;
		obj.withGetExponent(root);
	}

	@Test
	public void test_withGetExponent2() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withGetExponent(root);
	}

}

