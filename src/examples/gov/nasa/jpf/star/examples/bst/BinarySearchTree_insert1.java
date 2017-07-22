package gov.nasa.jpf.star.examples.bst;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class BinarySearchTree_insert1 extends TestJPF {

	@Test
	public void test1() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = null;
		int x = 0;
		System.out.println("1 " + obj.repOK(obj.root));
		obj.insert(x);
	}

	@Test
	public void test2() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = null;
		BinaryNode right_3 = null;
		int element_1 = 1;
		int element_76 = 1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		System.out.println("2 " + obj.repOK(obj.root));
		obj.insert(x);
	}

	@Test
	public void test3() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_7 = null;
		BinaryNode right_3 = null;
		BinaryNode right_8 = null;
		int element_77 = 1;
		int element_1 = 2;
		int element_76 = 2;
		int element_78 = 2;
		int x = 0;
		int element_6 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		System.out.println("3 " + obj.repOK(obj.root));
		obj.insert(x);
	}

	@Test
	public void test4() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_7 = new BinaryNode();
		BinaryNode right_3 = null;
		BinaryNode right_8 = null;
		BinaryNode left_10 = null;
		BinaryNode right_11 = null;
		int element_79 = -1;
		int element_1 = 1;
		int element_76 = 1;
		int element_78 = 1;
		int element_81 = 0;
		int element_6 = 0;
		int element_77 = 0;
		int element_80 = -1;
		int x = -1;
		int element_9 = -1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		left_7.element = element_9;
		left_7.left = left_10;
		left_7.right = right_11;
		System.out.println("4 " + obj.repOK(obj.root));
		obj.insert(x);
	}

	@Test
	public void test5() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_8 = null;
		BinaryNode right_3 = null;
		BinaryNode left_7 = null;
		int element_77 = -1;
		int element_1 = 1;
		int element_76 = 1;
		int x = 0;
		int element_6 = -1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		System.out.println("5 " + obj.repOK(obj.root));
		obj.insert(x);
	}

	@Test
	public void test6() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_8 = new BinaryNode();
		BinaryNode right_3 = null;
		BinaryNode left_7 = null;
		BinaryNode left_19 = null;
		BinaryNode right_20 = null;
		int element_18 = 0;
		int element_79 = 0;
		int element_1 = 1;
		int element_76 = 1;
		int element_78 = -1;
		int element_81 = 1;
		int element_6 = -1;
		int element_77 = -1;
		int element_80 = 0;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		right_8.element = element_18;
		right_8.left = left_19;
		right_8.right = right_20;
		System.out.println("6 " + obj.repOK(obj.root));
		obj.insert(x);
	}

	@Test
	public void test7() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = null;
		BinaryNode left_7 = null;
		BinaryNode right_8 = null;
		int element_77 = 0;
		int element_79 = 1;
		int element_1 = 1;
		int element_76 = 1;
		int element_78 = 0;
		int x = 0;
		int element_6 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		System.out.println("7 " + obj.repOK(obj.root));
		obj.insert(x);
	}

	@Test
	public void test8() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = null;
		BinaryNode left_2 = null;
		int element_1 = -1;
		int element_76 = -1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		System.out.println("8 " + obj.repOK(obj.root));
		obj.insert(x);
	}

	@Test
	public void test9() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_28 = null;
		BinaryNode left_2 = null;
		BinaryNode right_29 = null;
		int element_77 = 1;
		int element_27 = 1;
		int element_1 = -1;
		int element_76 = -1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_27;
		right_3.left = left_28;
		right_3.right = right_29;
		System.out.println("9 " + obj.repOK(obj.root));
		obj.insert(x);
	}

	@Test
	public void test10() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_28 = new BinaryNode();
		BinaryNode left_2 = null;
		BinaryNode right_29 = null;
		BinaryNode left_31 = null;
		BinaryNode right_32 = null;
		int element_79 = 0;
		int element_27 = 1;
		int element_1 = -1;
		int element_76 = -1;
		int element_78 = -1;
		int element_30 = 0;
		int element_81 = 1;
		int element_77 = 1;
		int element_80 = 0;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_27;
		right_3.left = left_28;
		right_3.right = right_29;
		left_28.element = element_30;
		left_28.left = left_31;
		left_28.right = right_32;
		System.out.println("10 " + obj.repOK(obj.root));
		obj.insert(x);
	}

	@Test
	public void test11() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_29 = null;
		BinaryNode left_2 = null;
		BinaryNode left_28 = null;
		int element_77 = -2;
		int element_27 = -1;
		int element_1 = -2;
		int element_76 = -2;
		int element_78 = -1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_27;
		right_3.left = left_28;
		right_3.right = right_29;
		System.out.println("11 " + obj.repOK(obj.root));
		obj.insert(x);
	}

	@Test
	public void test12() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_29 = new BinaryNode();
		BinaryNode left_2 = null;
		BinaryNode left_28 = null;
		BinaryNode left_40 = null;
		BinaryNode right_41 = null;
		int element_79 = 0;
		int element_27 = 0;
		int element_1 = -1;
		int element_39 = 1;
		int element_76 = -1;
		int element_78 = 0;
		int element_81 = 1;
		int element_77 = -1;
		int element_80 = 1;
		int x = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_27;
		right_3.left = left_28;
		right_3.right = right_29;
		right_29.element = element_39;
		right_29.left = left_40;
		right_29.right = right_41;
		System.out.println("12 " + obj.repOK(obj.root));
		obj.insert(x);
	}

	@Test
	public void test13() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_2 = null;
		BinaryNode left_28 = null;
		BinaryNode right_29 = null;
		int element_77 = -1;
		int element_79 = 0;
		int element_27 = 0;
		int element_1 = -1;
		int element_76 = -1;
		int element_78 = 0;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_27;
		right_3.left = left_28;
		right_3.right = right_29;
		System.out.println("13 " + obj.repOK(obj.root));
		obj.insert(x);
	}

	@Test
	public void test14() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = null;
		BinaryNode right_3 = null;
		int element_1 = 0;
		int element_76 = 0;
		int element_77 = 0;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		System.out.println("14 " + obj.repOK(obj.root));
		obj.insert(x);
	}

}

