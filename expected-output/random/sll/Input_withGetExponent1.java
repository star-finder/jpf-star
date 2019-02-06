package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withGetExponent1 extends TestJPF {

	@Test
	public void test_withGetExponent19() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_28 = null;
		int elem_27 = -13;
		root.elem = elem_27;
		root.next = next_28;
		obj.withGetExponent(root);
	}

	@Test
	public void test_withGetExponent20() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withGetExponent(root);
	}

}

