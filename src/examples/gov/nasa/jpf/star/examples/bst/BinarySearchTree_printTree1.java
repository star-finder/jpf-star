package gov.nasa.jpf.star.examples.bst;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class BinarySearchTree_printTree1 extends TestJPF {

	@Test
	public void test1() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = null;
		obj.min = 0;
		obj.max = 0;
		obj.printTree();
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
		obj.printTree();
	}

	@Test
	public void test3() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_2 = null;
		BinaryNode left_8 = null;
		BinaryNode right_9 = null;
		int element_1 = 0;
		int element_7 = 1;
		obj.min = -1;
		obj.max = 2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_7;
		right_3.left = left_8;
		right_3.right = right_9;
		obj.printTree();
	}

	@Test
	public void test4() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_9 = new BinaryNode();
		BinaryNode left_2 = null;
		BinaryNode left_8 = null;
		BinaryNode left_14 = null;
		BinaryNode right_15 = null;
		obj.min = -4;
		obj.max = 0;
		int element_1 = -3;
		int element_7 = -2;
		int element_13 = -1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_7;
		right_3.left = left_8;
		right_3.right = right_9;
		right_9.element = element_13;
		right_9.left = left_14;
		right_9.right = right_15;
		obj.printTree();
	}

	@Test
	public void test5() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_9 = new BinaryNode();
		BinaryNode right_15 = new BinaryNode();
		BinaryNode left_2 = null;
		BinaryNode left_8 = null;
		BinaryNode left_14 = null;
		BinaryNode left_20 = null;
		BinaryNode right_21 = null;
		obj.min = -5;
		obj.max = 0;
		int element_19 = -1;
		int element_1 = -4;
		int element_7 = -3;
		int element_13 = -2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_7;
		right_3.left = left_8;
		right_3.right = right_9;
		right_9.element = element_13;
		right_9.left = left_14;
		right_9.right = right_15;
		right_15.element = element_19;
		right_15.left = left_20;
		right_15.right = right_21;
		obj.printTree();
	}

	@Test
	public void test6() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_9 = new BinaryNode();
		BinaryNode left_14 = new BinaryNode();
		BinaryNode left_2 = null;
		BinaryNode left_8 = null;
		BinaryNode left_17 = null;
		BinaryNode right_18 = null;
		BinaryNode right_15 = null;
		obj.min = -2;
		obj.max = 3;
		int element_16 = 1;
		int element_1 = -1;
		int element_7 = 0;
		int element_13 = 2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_7;
		right_3.left = left_8;
		right_3.right = right_9;
		right_9.element = element_13;
		right_9.left = left_14;
		right_9.right = right_15;
		left_14.element = element_16;
		left_14.left = left_17;
		left_14.right = right_18;
		obj.printTree();
	}

	@Test
	public void test7() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_8 = new BinaryNode();
		BinaryNode left_2 = null;
		BinaryNode left_11 = null;
		BinaryNode right_12 = null;
		BinaryNode right_9 = null;
		int element_10 = 1;
		obj.min = -1;
		obj.max = 3;
		int element_1 = 0;
		int element_7 = 2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_7;
		right_3.left = left_8;
		right_3.right = right_9;
		left_8.element = element_10;
		left_8.left = left_11;
		left_8.right = right_12;
		obj.printTree();
	}

	@Test
	public void test8() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_8 = new BinaryNode();
		BinaryNode right_9 = new BinaryNode();
		BinaryNode left_2 = null;
		BinaryNode left_11 = null;
		BinaryNode right_12 = null;
		BinaryNode left_14 = null;
		BinaryNode right_15 = null;
		int element_10 = 1;
		obj.min = -1;
		obj.max = 4;
		int element_1 = 0;
		int element_7 = 2;
		int element_13 = 3;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_7;
		right_3.left = left_8;
		right_3.right = right_9;
		left_8.element = element_10;
		left_8.left = left_11;
		left_8.right = right_12;
		right_9.element = element_13;
		right_9.left = left_14;
		right_9.right = right_15;
		obj.printTree();
	}

	@Test
	public void test9() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_8 = new BinaryNode();
		BinaryNode right_12 = new BinaryNode();
		BinaryNode left_2 = null;
		BinaryNode left_11 = null;
		BinaryNode left_38 = null;
		BinaryNode right_39 = null;
		BinaryNode right_9 = null;
		int element_10 = -2;
		obj.min = -4;
		obj.max = 1;
		int element_1 = -3;
		int element_7 = 0;
		int element_37 = -1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_7;
		right_3.left = left_8;
		right_3.right = right_9;
		left_8.element = element_10;
		left_8.left = left_11;
		left_8.right = right_12;
		right_12.element = element_37;
		right_12.left = left_38;
		right_12.right = right_39;
		obj.printTree();
	}

	@Test
	public void test10() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_8 = new BinaryNode();
		BinaryNode left_11 = new BinaryNode();
		BinaryNode left_2 = null;
		BinaryNode left_35 = null;
		BinaryNode right_36 = null;
		BinaryNode right_12 = null;
		BinaryNode right_9 = null;
		int element_10 = 2;
		obj.min = -1;
		obj.max = 4;
		int element_1 = 0;
		int element_7 = 3;
		int element_34 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_7;
		right_3.left = left_8;
		right_3.right = right_9;
		left_8.element = element_10;
		left_8.left = left_11;
		left_8.right = right_12;
		left_11.element = element_34;
		left_11.left = left_35;
		left_11.right = right_36;
		obj.printTree();
	}

	@Test
	public void test11() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_5 = null;
		BinaryNode right_6 = null;
		BinaryNode right_3 = null;
		int element_1 = 0;
		obj.min = -2;
		obj.max = 1;
		int element_4 = -1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_4;
		left_2.left = left_5;
		left_2.right = right_6;
		obj.printTree();
	}

	@Test
	public void test12() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = null;
		BinaryNode right_6 = null;
		BinaryNode left_8 = null;
		BinaryNode right_9 = null;
		obj.min = -2;
		obj.max = 2;
		int element_4 = -1;
		int element_1 = 0;
		int element_7 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_4;
		left_2.left = left_5;
		left_2.right = right_6;
		right_3.element = element_7;
		right_3.left = left_8;
		right_3.right = right_9;
		obj.printTree();
	}

	@Test
	public void test13() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_9 = new BinaryNode();
		BinaryNode left_5 = null;
		BinaryNode right_6 = null;
		BinaryNode left_8 = null;
		BinaryNode left_14 = null;
		BinaryNode right_15 = null;
		int element_13 = 2;
		obj.min = -2;
		obj.max = 3;
		int element_4 = -1;
		int element_1 = 0;
		int element_7 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_4;
		left_2.left = left_5;
		left_2.right = right_6;
		right_3.element = element_7;
		right_3.left = left_8;
		right_3.right = right_9;
		right_9.element = element_13;
		right_9.left = left_14;
		right_9.right = right_15;
		obj.printTree();
	}

	@Test
	public void test14() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_8 = new BinaryNode();
		BinaryNode left_5 = null;
		BinaryNode right_6 = null;
		BinaryNode left_11 = null;
		BinaryNode right_12 = null;
		BinaryNode right_9 = null;
		int element_10 = 1;
		obj.min = -2;
		obj.max = 3;
		int element_4 = -1;
		int element_1 = 0;
		int element_7 = 2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_4;
		left_2.left = left_5;
		left_2.right = right_6;
		right_3.element = element_7;
		right_3.left = left_8;
		right_3.right = right_9;
		left_8.element = element_10;
		left_8.left = left_11;
		left_8.right = right_12;
		obj.printTree();
	}

	@Test
	public void test15() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		BinaryNode left_5 = null;
		BinaryNode left_56 = null;
		BinaryNode right_57 = null;
		BinaryNode right_3 = null;
		int element_55 = -1;
		obj.min = -3;
		obj.max = 1;
		int element_4 = -2;
		int element_1 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_4;
		left_2.left = left_5;
		left_2.right = right_6;
		right_6.element = element_55;
		right_6.left = left_56;
		right_6.right = right_57;
		obj.printTree();
	}

	@Test
	public void test16() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = null;
		BinaryNode left_56 = null;
		BinaryNode right_57 = null;
		BinaryNode left_8 = null;
		BinaryNode right_9 = null;
		int element_55 = -1;
		obj.min = -3;
		obj.max = 2;
		int element_4 = -2;
		int element_1 = 0;
		int element_7 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_4;
		left_2.left = left_5;
		left_2.right = right_6;
		right_6.element = element_55;
		right_6.left = left_56;
		right_6.right = right_57;
		right_3.element = element_7;
		right_3.left = left_8;
		right_3.right = right_9;
		obj.printTree();
	}

}

