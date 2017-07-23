package gov.nasa.jpf.star.examples.bst;

import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class BinarySearchTree_findMax1 extends TestJPF {

	@Test
	public void test_findMax1() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = null;
		System.out.println(Utilities.repOK(obj));
		obj.findMax();
	}

	@Test
	public void test_findMax2() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = null;
		BinaryNode left_2 = null;
		int element_76 = 1;
		int element_1 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		System.out.println(Utilities.repOK(obj));
		obj.findMax();
	}

	@Test
	public void test_findMax3() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_8 = null;
		BinaryNode left_2 = null;
		BinaryNode left_7 = null;
		int element_77 = -1;
		int element_1 = -1;
		int element_76 = -1;
		int element_78 = 0;
		int element_6 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_6;
		right_3.left = left_7;
		right_3.right = right_8;
		System.out.println(Utilities.repOK(obj));
		obj.findMax();
	}

}

