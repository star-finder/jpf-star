package gov.nasa.jpf.star.examples.bst;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class BinarySearchTree_findMin1 extends TestJPF {

	@Test
	public void test1() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = null;
		obj.min = 0;
		obj.max = 0;
		obj.findMin();
	}

	@Test
	public void test2() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = null;
		BinaryNode right_3 = null;
		int element_1 = 0;
		obj.min = -1;
		obj.max = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.findMin();
	}

	@Test
	public void test3() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_5 = null;
		BinaryNode right_3 = null;
		BinaryNode right_6 = null;
		obj.min = -2;
		obj.max = 1;
		int element_1 = 0;
		int element_4 = -1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_4;
		left_2.left = left_5;
		left_2.right = right_6;
		obj.findMin();
	}

}

