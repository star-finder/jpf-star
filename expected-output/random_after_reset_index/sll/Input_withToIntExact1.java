package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withToIntExact1 extends TestJPF {

	@Test
	public void test_withToIntExact1() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_50 = null;
		int elem_49 = 0;
		root.elem = elem_49;
		root.next = next_50;
		obj.withToIntExact(root);
	}

	@Test
	public void test_withToIntExact2() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_50 = null;
		int elem_49 = 1;
		root.elem = elem_49;
		root.next = next_50;
		obj.withToIntExact(root);
	}

	@Test
	public void test_withToIntExact3() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_50 = new Node();
		Node next_52 = null;
		int elem_49 = 1;
		int elem_51 = 0;
		root.elem = elem_49;
		root.next = next_50;
		next_50.elem = elem_51;
		next_50.next = next_52;
		obj.withToIntExact(root);
	}

	@Test
	public void test_withToIntExact4() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withToIntExact(root);
	}

}

