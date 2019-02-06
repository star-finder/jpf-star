package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_repOK1 extends TestJPF {

	@Test
	public void test_repOK1() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_24 = null;
		int elem_23 = 14;
		root.elem = elem_23;
		root.next = next_24;
		obj.repOK(root);
	}

	@Test
	public void test_repOK2() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_24 = new Node();
		Node next_26 = root;
		int elem_25 = 19;
		int elem_23 = 27;
		root.elem = elem_23;
		root.next = next_24;
		next_24.elem = elem_25;
		next_24.next = next_26;
		obj.repOK(root);
	}

	@Test
	public void test_repOK3() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_24 = new Node();
		Node next_26 = new Node();
		Node next_28 = null;
		int elem_25 = 11;
		int elem_23 = -3;
		int elem_27 = -22;
		root.elem = elem_23;
		root.next = next_24;
		next_24.elem = elem_25;
		next_24.next = next_26;
		next_26.elem = elem_27;
		next_26.next = next_28;
		obj.repOK(root);
	}

	@Test
	public void test_repOK4() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_24 = new Node();
		Node next_26 = new Node();
		Node next_28 = root;
		int elem_25 = 2;
		int elem_23 = 31;
		int elem_27 = -19;
		root.elem = elem_23;
		root.next = next_24;
		next_24.elem = elem_25;
		next_24.next = next_26;
		next_26.elem = elem_27;
		next_26.next = next_28;
		obj.repOK(root);
	}

	@Test
	public void test_repOK5() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_24 = new Node();
		Node next_26 = null;
		int elem_25 = 26;
		int elem_23 = 6;
		root.elem = elem_23;
		root.next = next_24;
		next_24.elem = elem_25;
		next_24.next = next_26;
		obj.repOK(root);
	}

	@Test
	public void test_repOK6() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_24 = new Node();
		Node next_26 = new Node();
		Node next_28 = next_24;
		int elem_25 = -3;
		int elem_23 = -25;
		int elem_27 = -32;
		root.elem = elem_23;
		root.next = next_24;
		next_24.elem = elem_25;
		next_24.next = next_26;
		next_26.elem = elem_27;
		next_26.next = next_28;
		obj.repOK(root);
	}

	@Test
	public void test_repOK7() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_24 = new Node();
		Node next_26 = next_24;
		int elem_25 = -17;
		int elem_23 = 3;
		root.elem = elem_23;
		root.next = next_24;
		next_24.elem = elem_25;
		next_24.next = next_26;
		obj.repOK(root);
	}

	@Test
	public void test_repOK8() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.repOK(root);
	}

	@Test
	public void test_repOK9() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_24 = root;
		int elem_23 = 13;
		root.elem = elem_23;
		root.next = next_24;
		obj.repOK(root);
	}

	@Test
	public void test_repOK10() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_24 = new Node();
		Node next_26 = new Node();
		Node next_28 = next_26;
		int elem_25 = -5;
		int elem_23 = -8;
		int elem_27 = 5;
		root.elem = elem_23;
		root.next = next_24;
		next_24.elem = elem_25;
		next_24.next = next_26;
		next_26.elem = elem_27;
		next_26.next = next_28;
		obj.repOK(root);
	}

}

