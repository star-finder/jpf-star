package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withAbs1 extends TestJPF {

	@Test
	public void test_withAbs5() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_6 = null;
		int elem_5 = 0;
		root.elem = elem_5;
		root.next = next_6;
		obj.withAbs(root);
	}

	@Test
	public void test_withAbs6() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_6 = null;
		int elem_5 = 1;
		root.elem = elem_5;
		root.next = next_6;
		obj.withAbs(root);
	}

	@Test
	public void test_withAbs7() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_6 = null;
		int elem_5 = -1;
		root.elem = elem_5;
		root.next = next_6;
		obj.withAbs(root);
	}

	@Test
	public void test_withAbs8() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_6 = new Node();
		Node next_14 = null;
		int elem_13 = 0;
		int elem_5 = 1;
		root.elem = elem_5;
		root.next = next_6;
		next_6.elem = elem_13;
		next_6.next = next_14;
		obj.withAbs(root);
	}

	@Test
	public void test_withAbs9() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_6 = new Node();
		Node next_8 = null;
		int elem_7 = 0;
		int elem_5 = -1;
		root.elem = elem_5;
		root.next = next_6;
		next_6.elem = elem_7;
		next_6.next = next_8;
		obj.withAbs(root);
	}

	@Test
	public void test_withAbs10() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withAbs(root);
	}

}

