package random.sll;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Input_withFloor1 extends TestJPF {

	@Test
	public void test_withFloor47() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_58 = null;
		int elem_57 = 1;
		root.elem = elem_57;
		root.next = next_58;
		obj.withFloor(root);
	}

	@Test
	public void test_withFloor48() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_58 = new Node();
		Node next_60 = null;
		int elem_57 = -1;
		int elem_59 = 0;
		root.elem = elem_57;
		root.next = next_58;
		next_58.elem = elem_59;
		next_58.next = next_60;
		obj.withFloor(root);
	}

	@Test
	public void test_withFloor49() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_58 = null;
		int elem_57 = 0;
		root.elem = elem_57;
		root.next = next_58;
		obj.withFloor(root);
	}

	@Test
	public void test_withFloor50() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_58 = new Node();
		Node next_66 = null;
		int elem_65 = 0;
		int elem_57 = 1;
		root.elem = elem_57;
		root.next = next_58;
		next_58.elem = elem_65;
		next_58.next = next_66;
		obj.withFloor(root);
	}

	@Test
	public void test_withFloor51() throws Exception {
		Input obj = new Input();
		Node root = new Node();
		Node next_58 = null;
		int elem_57 = -1;
		root.elem = elem_57;
		root.next = next_58;
		obj.withFloor(root);
	}

	@Test
	public void test_withFloor52() throws Exception {
		Input obj = new Input();
		random.sll.Node root = null;
		obj.withFloor(root);
	}

}

