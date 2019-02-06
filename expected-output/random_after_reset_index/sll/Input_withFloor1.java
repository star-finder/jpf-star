package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withFloor1 extends TestJPF {

	@Test
	public void test_withFloor1() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_68 = null;
		int elem_67 = -1;
		root.elem = elem_67;
		root.next = next_68;
		obj.withFloor(root);
	}

	@Test
	public void test_withFloor2() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_68 = null;
		int elem_67 = 0;
		root.elem = elem_67;
		root.next = next_68;
		obj.withFloor(root);
	}

	@Test
	public void test_withFloor3() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_68 = null;
		int elem_67 = 1;
		root.elem = elem_67;
		root.next = next_68;
		obj.withFloor(root);
	}

	@Test
	public void test_withFloor4() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_68 = new Node();
		Node next_76 = null;
		int elem_67 = 1;
		int elem_75 = 0;
		root.elem = elem_67;
		root.next = next_68;
		next_68.elem = elem_75;
		next_68.next = next_76;
		obj.withFloor(root);
	}

	@Test
	public void test_withFloor5() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_68 = new Node();
		Node next_70 = null;
		int elem_69 = 0;
		int elem_67 = -1;
		root.elem = elem_67;
		root.next = next_68;
		next_68.elem = elem_69;
		next_68.next = next_70;
		obj.withFloor(root);
	}

	@Test
	public void test_withFloor6() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withFloor(root);
	}

}

