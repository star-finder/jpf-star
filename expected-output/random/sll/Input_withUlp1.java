package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withUlp1 extends TestJPF {

	@Test
	public void test_withUlp41() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_52 = null;
		int elem_51 = -13;
		root.elem = elem_51;
		root.next = next_52;
		obj.withUlp(root);
	}

	@Test
	public void test_withUlp42() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withUlp(root);
	}

}

