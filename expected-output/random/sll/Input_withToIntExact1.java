package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withToIntExact1 extends TestJPF {

	@Test
	public void test_withToIntExact31() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_40 = new Node();
		Node next_42 = null;
		int elem_41 = 0;
		int elem_39 = 1;
		root.elem = elem_39;
		root.next = next_40;
		next_40.elem = elem_41;
		next_40.next = next_42;
		obj.withToIntExact(root);
	}

	@Test
	public void test_withToIntExact32() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_40 = null;
		int elem_39 = 1;
		root.elem = elem_39;
		root.next = next_40;
		obj.withToIntExact(root);
	}

	@Test
	public void test_withToIntExact33() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withToIntExact(root);
	}

	@Test
	public void test_withToIntExact34() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_40 = null;
		int elem_39 = 0;
		root.elem = elem_39;
		root.next = next_40;
		obj.withToIntExact(root);
	}

}

