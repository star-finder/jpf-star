package gov.nasa.jpf.star.examples.bst;

import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class BinarySearchTree_isEmpty1 extends TestJPF {

	@Test
	public void test_isEmpty1() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = null;
		System.out.println(Utilities.repOK(obj));
		obj.isEmpty();
	}

	@Test
	public void test_isEmpty2() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = null;
		BinaryNode right_3 = null;
		int element_1 = 1;
		int element_76 = 1;
		int element_77 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		System.out.println(Utilities.repOK(obj));
		obj.isEmpty();
	}

}

