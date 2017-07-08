package gov.nasa.jpf.star.examples.bst;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class BinarySearchTree_find1 extends TestJPF {

	@Test
	public void test1() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = null;
		int x = 0;
		obj.min = 0;
		obj.max = 0;
		obj.find(x);
	}

	@Test
	public void test2() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = null;
		BinaryNode right_3 = null;
		int element_1 = 1;
		obj.min = 0;
		int x = 0;
		obj.max = 2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.find(x);
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
		int x = -2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_4;
		left_2.left = left_5;
		left_2.right = right_6;
		obj.find(x);
	}

	@Test
	public void test4() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_8 = null;
		BinaryNode right_3 = null;
		BinaryNode right_6 = null;
		BinaryNode right_9 = null;
		int element_1 = 0;
		int element_7 = -2;
		obj.min = -3;
		obj.max = 1;
		int element_4 = -1;
		int x = -3;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_4;
		left_2.left = left_5;
		left_2.right = right_6;
		left_5.element = element_7;
		left_5.left = left_8;
		left_5.right = right_9;
		obj.find(x);
	}

	@Test
	public void test5() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode right_9 = null;
		BinaryNode right_3 = null;
		BinaryNode right_6 = null;
		BinaryNode left_8 = null;
		int element_1 = 0;
		int element_7 = -3;
		obj.min = -4;
		obj.max = 1;
		int element_4 = -1;
		int x = -2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_4;
		left_2.left = left_5;
		left_2.right = right_6;
		left_5.element = element_7;
		left_5.left = left_8;
		left_5.right = right_9;
		obj.find(x);
	}

	@Test
	public void test6() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode right_3 = null;
		BinaryNode right_6 = null;
		BinaryNode left_8 = null;
		BinaryNode right_9 = null;
		int element_1 = 0;
		int element_7 = -2;
		obj.min = -3;
		obj.max = 1;
		int element_4 = -1;
		int x = -2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_4;
		left_2.left = left_5;
		left_2.right = right_6;
		left_5.element = element_7;
		left_5.left = left_8;
		left_5.right = right_9;
		obj.find(x);
	}

	@Test
	public void test7() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_6 = null;
		BinaryNode right_3 = null;
		BinaryNode left_5 = null;
		obj.min = -3;
		obj.max = 1;
		int element_1 = 0;
		int element_4 = -2;
		int x = -1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_4;
		left_2.left = left_5;
		left_2.right = right_6;
		obj.find(x);
	}

	@Test
	public void test8() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		BinaryNode left_17 = null;
		BinaryNode right_3 = null;
		BinaryNode left_5 = null;
		BinaryNode right_18 = null;
		int element_1 = 0;
		obj.min = -4;
		int element_16 = -1;
		obj.max = 1;
		int element_4 = -3;
		int x = -2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_4;
		left_2.left = left_5;
		left_2.right = right_6;
		right_6.element = element_16;
		right_6.left = left_17;
		right_6.right = right_18;
		obj.find(x);
	}

	@Test
	public void test9() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		BinaryNode right_18 = null;
		BinaryNode right_3 = null;
		BinaryNode left_5 = null;
		BinaryNode left_17 = null;
		int element_1 = 0;
		obj.min = -4;
		int element_16 = -2;
		obj.max = 1;
		int element_4 = -3;
		int x = -1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_4;
		left_2.left = left_5;
		left_2.right = right_6;
		right_6.element = element_16;
		right_6.left = left_17;
		right_6.right = right_18;
		obj.find(x);
	}

	@Test
	public void test10() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		BinaryNode right_3 = null;
		BinaryNode left_5 = null;
		BinaryNode left_17 = null;
		BinaryNode right_18 = null;
		int element_1 = 0;
		obj.min = -3;
		int element_16 = -1;
		obj.max = 1;
		int element_4 = -2;
		int x = -1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_4;
		left_2.left = left_5;
		left_2.right = right_6;
		right_6.element = element_16;
		right_6.left = left_17;
		right_6.right = right_18;
		obj.find(x);
	}

	@Test
	public void test11() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = null;
		BinaryNode left_5 = null;
		BinaryNode right_6 = null;
		obj.min = -2;
		obj.max = 1;
		int element_1 = 0;
		int element_4 = -1;
		int x = -1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_4;
		left_2.left = left_5;
		left_2.right = right_6;
		obj.find(x);
	}

	@Test
	public void test12() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = null;
		BinaryNode left_2 = null;
		int element_1 = -1;
		obj.min = -2;
		int x = 0;
		obj.max = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.find(x);
	}

	@Test
	public void test13() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_26 = null;
		BinaryNode left_2 = null;
		BinaryNode right_27 = null;
		obj.min = -1;
		obj.max = 3;
		int element_1 = 0;
		int element_25 = 2;
		int x = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_25;
		right_3.left = left_26;
		right_3.right = right_27;
		obj.find(x);
	}

	@Test
	public void test14() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_26 = new BinaryNode();
		BinaryNode left_29 = null;
		BinaryNode left_2 = null;
		BinaryNode right_27 = null;
		BinaryNode right_30 = null;
		int element_1 = 0;
		int element_28 = 2;
		obj.min = -1;
		obj.max = 4;
		int element_25 = 3;
		int x = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_25;
		right_3.left = left_26;
		right_3.right = right_27;
		left_26.element = element_28;
		left_26.left = left_29;
		left_26.right = right_30;
		obj.find(x);
	}

	@Test
	public void test15() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_26 = new BinaryNode();
		BinaryNode right_30 = null;
		BinaryNode left_2 = null;
		BinaryNode right_27 = null;
		BinaryNode left_29 = null;
		int element_1 = 0;
		int element_28 = 1;
		obj.min = -1;
		obj.max = 4;
		int element_25 = 3;
		int x = 2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_25;
		right_3.left = left_26;
		right_3.right = right_27;
		left_26.element = element_28;
		left_26.left = left_29;
		left_26.right = right_30;
		obj.find(x);
	}

	@Test
	public void test16() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_26 = new BinaryNode();
		BinaryNode left_2 = null;
		BinaryNode right_27 = null;
		BinaryNode left_29 = null;
		BinaryNode right_30 = null;
		int element_1 = 0;
		int element_28 = 1;
		obj.min = -1;
		obj.max = 3;
		int element_25 = 2;
		int x = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_25;
		right_3.left = left_26;
		right_3.right = right_27;
		left_26.element = element_28;
		left_26.left = left_29;
		left_26.right = right_30;
		obj.find(x);
	}

	@Test
	public void test17() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_27 = null;
		BinaryNode left_2 = null;
		BinaryNode left_26 = null;
		obj.min = -1;
		obj.max = 2;
		int element_1 = 0;
		int element_25 = 1;
		int x = 2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_25;
		right_3.left = left_26;
		right_3.right = right_27;
		obj.find(x);
	}

	@Test
	public void test18() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_27 = new BinaryNode();
		BinaryNode left_38 = null;
		BinaryNode left_2 = null;
		BinaryNode left_26 = null;
		BinaryNode right_39 = null;
		int element_1 = 0;
		obj.min = -1;
		obj.max = 4;
		int element_37 = 3;
		int element_25 = 1;
		int x = 2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_25;
		right_3.left = left_26;
		right_3.right = right_27;
		right_27.element = element_37;
		right_27.left = left_38;
		right_27.right = right_39;
		obj.find(x);
	}

	@Test
	public void test19() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_2 = null;
		BinaryNode left_26 = null;
		BinaryNode right_27 = null;
		obj.min = -1;
		obj.max = 2;
		int element_1 = 0;
		int element_25 = 1;
		int x = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_25;
		right_3.left = left_26;
		right_3.right = right_27;
		obj.find(x);
	}

	@Test
	public void test20() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = null;
		BinaryNode right_3 = null;
		obj.min = -1;
		obj.max = 1;
		int element_1 = 0;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.find(x);
	}

}

