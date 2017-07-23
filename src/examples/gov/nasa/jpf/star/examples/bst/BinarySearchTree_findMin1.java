package gov.nasa.jpf.star.examples.bst;

import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class BinarySearchTree_findMin1 extends TestJPF {

	@Test
	public void test_findMin1() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = null;
		System.out.println(Utilities.repOK(obj));
		obj.findMin();
	}

	@Test
	public void test_findMin2() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = null;
		BinaryNode right_3 = null;
		int element_1 = 1;
		int element_76 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		System.out.println(Utilities.repOK(obj));
		obj.findMin();
	}

	@Test
	public void test_findMin3() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_7 = null;
		BinaryNode right_3 = null;
		BinaryNode right_8 = null;
		int element_77 = 0;
		int element_1 = 1;
		int element_76 = 1;
		int element_78 = 1;
		int element_6 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		System.out.println(Utilities.repOK(obj));
		obj.findMin();
	}

}

