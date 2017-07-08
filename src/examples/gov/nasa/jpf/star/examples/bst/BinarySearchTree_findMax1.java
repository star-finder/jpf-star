package gov.nasa.jpf.star.examples.bst;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class BinarySearchTree_findMax1 extends TestJPF {

	@Test
	public void test1() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = null;
		obj.min = 0;
		obj.max = 0;
		obj.findMax();
	}

	@Test
	public void test2() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = null;
		BinaryNode left_2 = null;
		int element_1 = 0;
		obj.min = -1;
		obj.max = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.findMax();
	}

	@Test
	public void test3() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = null;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		obj.min = -1;
		obj.max = 2;
		int element_1 = 0;
		int element_4 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		obj.findMax();
	}

}

