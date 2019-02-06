package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withUlp1 extends TestJPF {

	@Test
	public void test_withUlp1() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_62 = null;
		int elem_61 = -12;
		root.elem = elem_61;
		root.next = next_62;
		obj.withUlp(root);
	}

	@Test
	public void test_withUlp2() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withUlp(root);
	}

}

