package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withCeil1 extends TestJPF {

	@Test
	public void test_withCeil71() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_90 = null;
		int elem_89 = 0;
		root.elem = elem_89;
		root.next = next_90;
		obj.withCeil(root);
	}

	@Test
	public void test_withCeil72() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_90 = null;
		int elem_89 = 1;
		root.elem = elem_89;
		root.next = next_90;
		obj.withCeil(root);
	}

	@Test
	public void test_withCeil73() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_90 = new Node();
		Node next_98 = null;
		int elem_89 = 1;
		int elem_97 = 0;
		root.elem = elem_89;
		root.next = next_90;
		next_90.elem = elem_97;
		next_90.next = next_98;
		obj.withCeil(root);
	}

	@Test
	public void test_withCeil74() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_90 = null;
		int elem_89 = -1;
		root.elem = elem_89;
		root.next = next_90;
		obj.withCeil(root);
	}

	@Test
	public void test_withCeil75() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_90 = new Node();
		Node next_92 = null;
		int elem_89 = -1;
		int elem_91 = 0;
		root.elem = elem_89;
		root.next = next_90;
		next_90.elem = elem_91;
		next_90.next = next_92;
		obj.withCeil(root);
	}

	@Test
	public void test_withCeil76() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withCeil(root);
	}

}

