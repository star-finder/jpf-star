package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withCeil1 extends TestJPF {

	@Test
	public void test_withCeil1() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_100 = null;
		int elem_99 = -1;
		root.elem = elem_99;
		root.next = next_100;
		obj.withCeil(root);
	}

	@Test
	public void test_withCeil2() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_100 = new Node();
		Node next_102 = null;
		int elem_99 = -1;
		int elem_101 = 0;
		root.elem = elem_99;
		root.next = next_100;
		next_100.elem = elem_101;
		next_100.next = next_102;
		obj.withCeil(root);
	}

	@Test
	public void test_withCeil3() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_100 = null;
		int elem_99 = 0;
		root.elem = elem_99;
		root.next = next_100;
		obj.withCeil(root);
	}

	@Test
	public void test_withCeil4() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_100 = null;
		int elem_99 = 1;
		root.elem = elem_99;
		root.next = next_100;
		obj.withCeil(root);
	}

	@Test
	public void test_withCeil5() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withCeil(root);
	}

	@Test
	public void test_withCeil6() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_100 = new Node();
		Node next_108 = null;
		int elem_99 = 1;
		int elem_107 = 0;
		root.elem = elem_99;
		root.next = next_100;
		next_100.elem = elem_107;
		next_100.next = next_108;
		obj.withCeil(root);
	}

}

