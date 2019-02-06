package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_repOK9 extends TestJPF {

	@Test
	public void test_repOK1() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_2 = new Node();
		Node next_4 = root;
		int elem_3 = -12;
		int elem_1 = 31;
		root.elem = elem_1;
		root.next = next_2;
		next_2.elem = elem_3;
		next_2.next = next_4;
		obj.repOK(root);
	}

	@Test
	public void test_repOK2() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_2 = new Node();
		Node next_4 = new Node();
		Node next_6 = next_4;
		int elem_3 = 7;
		int elem_1 = -19;
		int elem_5 = 18;
		root.elem = elem_1;
		root.next = next_2;
		next_2.elem = elem_3;
		next_2.next = next_4;
		next_4.elem = elem_5;
		next_4.next = next_6;
		obj.repOK(root);
	}

	@Test
	public void test_repOK3() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_2 = new Node();
		Node next_4 = null;
		int elem_3 = -22;
		int elem_1 = -13;
		root.elem = elem_1;
		root.next = next_2;
		next_2.elem = elem_3;
		next_2.next = next_4;
		obj.repOK(root);
	}

	@Test
	public void test_repOK4() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_2 = new Node();
		Node next_4 = new Node();
		Node next_6 = null;
		int elem_3 = 16;
		int elem_1 = 24;
		int elem_5 = 26;
		root.elem = elem_1;
		root.next = next_2;
		next_2.elem = elem_3;
		next_2.next = next_4;
		next_4.elem = elem_5;
		next_4.next = next_6;
		obj.repOK(root);
	}

	@Test
	public void test_repOK5() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_2 = root;
		int elem_1 = 8;
		root.elem = elem_1;
		root.next = next_2;
		obj.repOK(root);
	}

	@Test
	public void test_repOK6() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_2 = new Node();
		Node next_4 = next_2;
		int elem_3 = -23;
		int elem_1 = 24;
		root.elem = elem_1;
		root.next = next_2;
		next_2.elem = elem_3;
		next_2.next = next_4;
		obj.repOK(root);
	}

	@Test
	public void test_repOK7() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_2 = new Node();
		Node next_4 = new Node();
		Node next_6 = root;
		int elem_3 = 1;
		int elem_1 = 16;
		int elem_5 = 30;
		root.elem = elem_1;
		root.next = next_2;
		next_2.elem = elem_3;
		next_2.next = next_4;
		next_4.elem = elem_5;
		next_4.next = next_6;
		obj.repOK(root);
	}

	@Test
	public void test_repOK8() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_2 = new Node();
		Node next_4 = new Node();
		Node next_6 = next_2;
		int elem_3 = 29;
		int elem_1 = -22;
		int elem_5 = -11;
		root.elem = elem_1;
		root.next = next_2;
		next_2.elem = elem_3;
		next_2.next = next_4;
		next_4.elem = elem_5;
		next_4.next = next_6;
		obj.repOK(root);
	}

	@Test
	public void test_repOK9() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.repOK(root);
	}

	@Test
	public void test_repOK10() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_2 = null;
		int elem_1 = -28;
		root.elem = elem_1;
		root.next = next_2;
		obj.repOK(root);
	}

}

