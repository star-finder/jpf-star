package gov.nasa.jpf.star.examples.bst;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class BinarySearchTree_remove1 extends TestJPF {

	@Test
	public void test1() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = null;
		int x = 0;
		obj.remove(x);
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
		obj.remove(x);
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
		obj.remove(x);
	}

	@Test
	public void test4() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_7 = new BinaryNode();
		BinaryNode left_10 = null;
		BinaryNode right_3 = null;
		BinaryNode right_8 = null;
		BinaryNode right_11 = null;
		int element_79 = -1;
		int element_1 = 1;
		int element_76 = 1;
		int element_78 = 1;
		int element_6 = 0;
		int element_77 = 0;
		int element_80 = 0;
		int x = -2;
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
		obj.remove(x);
	}

	@Test
	public void test5() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_7 = new BinaryNode();
		BinaryNode left_10 = new BinaryNode();
		BinaryNode left_13 = null;
		BinaryNode right_3 = null;
		BinaryNode right_8 = null;
		BinaryNode right_11 = null;
		BinaryNode right_14 = null;
		int element_79 = -1;
		int element_1 = 1;
		int element_76 = 1;
		int element_78 = 1;
		int element_82 = -1;
		int element_12 = -2;
		int element_81 = -2;
		int element_6 = 0;
		int element_77 = 0;
		int element_80 = 0;
		int x = -3;
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
		left_10.element = element_12;
		left_10.left = left_13;
		left_10.right = right_14;
		obj.remove(x);
	}

	@Test
	public void test6() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_7 = new BinaryNode();
		BinaryNode left_10 = new BinaryNode();
		BinaryNode left_13 = new BinaryNode();
		BinaryNode left_16 = null;
		BinaryNode right_3 = null;
		BinaryNode right_8 = null;
		BinaryNode right_11 = null;
		BinaryNode right_14 = null;
		BinaryNode right_17 = null;
		int element_79 = 3;
		int element_15 = 1;
		int element_1 = 5;
		int element_76 = 5;
		int element_78 = 5;
		int element_82 = 3;
		int element_83 = 1;
		int element_12 = 2;
		int element_81 = 2;
		int element_6 = 4;
		int element_84 = 2;
		int element_77 = 4;
		int element_80 = 4;
		int x = 0;
		int element_9 = 3;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		left_7.element = element_9;
		left_7.left = left_10;
		left_7.right = right_11;
		left_10.element = element_12;
		left_10.left = left_13;
		left_10.right = right_14;
		left_13.element = element_15;
		left_13.left = left_16;
		left_13.right = right_17;
		obj.remove(x);
	}

	@Test
	public void test7() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_7 = new BinaryNode();
		BinaryNode left_10 = new BinaryNode();
		BinaryNode left_13 = new BinaryNode();
		BinaryNode right_17 = null;
		BinaryNode right_3 = null;
		BinaryNode right_8 = null;
		BinaryNode right_11 = null;
		BinaryNode right_14 = null;
		BinaryNode left_16 = null;
		int element_79 = -1;
		int element_15 = -4;
		int element_1 = 1;
		int element_76 = 1;
		int element_78 = 1;
		int element_82 = -1;
		int element_83 = -4;
		int element_12 = -2;
		int element_81 = -2;
		int element_6 = 0;
		int element_77 = 0;
		int element_80 = 0;
		int x = -3;
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
		left_10.element = element_12;
		left_10.left = left_13;
		left_10.right = right_14;
		left_13.element = element_15;
		left_13.left = left_16;
		left_13.right = right_17;
		obj.remove(x);
	}

	@Test
	public void test8() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_7 = new BinaryNode();
		BinaryNode left_10 = new BinaryNode();
		BinaryNode right_14 = null;
		BinaryNode right_3 = null;
		BinaryNode right_8 = null;
		BinaryNode right_11 = null;
		BinaryNode left_13 = null;
		int element_79 = -1;
		int element_1 = 1;
		int element_76 = 1;
		int element_78 = 1;
		int element_12 = -3;
		int element_81 = -3;
		int element_6 = 0;
		int element_77 = 0;
		int element_80 = 0;
		int x = -2;
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
		left_10.element = element_12;
		left_10.left = left_13;
		left_10.right = right_14;
		obj.remove(x);
	}

	@Test
	public void test9() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_7 = new BinaryNode();
		BinaryNode left_10 = new BinaryNode();
		BinaryNode right_14 = new BinaryNode();
		BinaryNode left_37 = null;
		BinaryNode right_3 = null;
		BinaryNode right_8 = null;
		BinaryNode right_11 = null;
		BinaryNode left_13 = null;
		BinaryNode right_38 = null;
		int element_36 = 1;
		int element_79 = 2;
		int element_1 = 4;
		int element_76 = 4;
		int element_78 = 4;
		int element_82 = 1;
		int element_83 = 2;
		int element_12 = -1;
		int element_6 = 3;
		int element_81 = -1;
		int element_77 = 3;
		int element_80 = 3;
		int x = 0;
		int element_9 = 2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		left_7.element = element_9;
		left_7.left = left_10;
		left_7.right = right_11;
		left_10.element = element_12;
		left_10.left = left_13;
		left_10.right = right_14;
		right_14.element = element_36;
		right_14.left = left_37;
		right_14.right = right_38;
		obj.remove(x);
	}

	@Test
	public void test10() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_7 = new BinaryNode();
		BinaryNode left_10 = new BinaryNode();
		BinaryNode right_14 = new BinaryNode();
		BinaryNode right_38 = null;
		BinaryNode right_3 = null;
		BinaryNode right_8 = null;
		BinaryNode right_11 = null;
		BinaryNode left_13 = null;
		BinaryNode left_37 = null;
		int element_36 = -1;
		int element_79 = 1;
		int element_1 = 3;
		int element_76 = 3;
		int element_78 = 3;
		int element_82 = -2;
		int element_83 = -1;
		int element_12 = -2;
		int element_81 = -2;
		int element_6 = 2;
		int element_77 = 2;
		int element_80 = 2;
		int x = 0;
		int element_9 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		left_7.element = element_9;
		left_7.left = left_10;
		left_7.right = right_11;
		left_10.element = element_12;
		left_10.left = left_13;
		left_10.right = right_14;
		right_14.element = element_36;
		right_14.left = left_37;
		right_14.right = right_38;
		obj.remove(x);
	}

	@Test
	public void test11() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_7 = new BinaryNode();
		BinaryNode left_10 = new BinaryNode();
		BinaryNode left_13 = null;
		BinaryNode right_14 = null;
		BinaryNode right_3 = null;
		BinaryNode right_8 = null;
		BinaryNode right_11 = null;
		int element_79 = -1;
		int element_1 = 1;
		int element_76 = 1;
		int element_78 = 1;
		int element_12 = -2;
		int element_6 = 0;
		int element_77 = 0;
		int element_80 = 0;
		int x = -2;
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
		left_10.element = element_12;
		left_10.left = left_13;
		left_10.right = right_14;
		obj.remove(x);
	}

	@Test
	public void test12() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_7 = new BinaryNode();
		BinaryNode left_10 = new BinaryNode();
		BinaryNode right_14 = new BinaryNode();
		BinaryNode left_13 = null;
		BinaryNode right_3 = null;
		BinaryNode right_8 = null;
		BinaryNode right_11 = null;
		BinaryNode left_37 = null;
		BinaryNode right_38 = null;
		int element_36 = -2;
		int element_79 = -1;
		int element_1 = 1;
		int element_76 = 1;
		int element_78 = 1;
		int element_82 = -2;
		int element_83 = -2;
		int element_12 = -3;
		int element_81 = -3;
		int element_6 = 0;
		int element_84 = -1;
		int element_77 = 0;
		int element_80 = 0;
		int x = -3;
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
		left_10.element = element_12;
		left_10.left = left_13;
		left_10.right = right_14;
		right_14.element = element_36;
		right_14.left = left_37;
		right_14.right = right_38;
		obj.remove(x);
	}

	@Test
	public void test13() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_7 = new BinaryNode();
		BinaryNode left_10 = new BinaryNode();
		BinaryNode left_13 = new BinaryNode();
		BinaryNode right_14 = null;
		BinaryNode right_3 = null;
		BinaryNode right_8 = null;
		BinaryNode right_11 = null;
		BinaryNode left_16 = null;
		BinaryNode right_17 = null;
		int element_79 = -1;
		int element_15 = -3;
		int element_1 = 1;
		int element_76 = 1;
		int element_78 = 1;
		int element_82 = -3;
		int element_83 = -2;
		int element_12 = -2;
		int element_81 = -3;
		int element_6 = 0;
		int element_77 = 0;
		int element_80 = 0;
		int x = -2;
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
		left_10.element = element_12;
		left_10.left = left_13;
		left_10.right = right_14;
		left_13.element = element_15;
		left_13.left = left_16;
		left_13.right = right_17;
		obj.remove(x);
	}

	@Test
	public void test14() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_7 = new BinaryNode();
		BinaryNode right_11 = null;
		BinaryNode right_3 = null;
		BinaryNode right_8 = null;
		BinaryNode left_10 = null;
		int element_77 = 0;
		int element_79 = -2;
		int element_1 = 1;
		int element_76 = 1;
		int element_78 = 1;
		int x = -1;
		int element_9 = -2;
		int element_6 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		left_7.element = element_9;
		left_7.left = left_10;
		left_7.right = right_11;
		obj.remove(x);
	}

	@Test
	public void test15() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_7 = new BinaryNode();
		BinaryNode right_11 = new BinaryNode();
		BinaryNode left_46 = null;
		BinaryNode right_3 = null;
		BinaryNode right_8 = null;
		BinaryNode left_10 = null;
		BinaryNode right_47 = null;
		int element_79 = -3;
		int element_1 = 1;
		int element_76 = 1;
		int element_78 = 1;
		int element_81 = 0;
		int element_6 = 0;
		int element_77 = 0;
		int element_80 = -1;
		int element_45 = -1;
		int x = -2;
		int element_9 = -3;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		left_7.element = element_9;
		left_7.left = left_10;
		left_7.right = right_11;
		right_11.element = element_45;
		right_11.left = left_46;
		right_11.right = right_47;
		obj.remove(x);
	}

	@Test
	public void test16() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_7 = new BinaryNode();
		BinaryNode right_11 = new BinaryNode();
		BinaryNode left_46 = new BinaryNode();
		BinaryNode left_49 = null;
		BinaryNode right_3 = null;
		BinaryNode right_8 = null;
		BinaryNode left_10 = null;
		BinaryNode right_47 = null;
		BinaryNode right_50 = null;
		int element_79 = -1;
		int element_1 = 4;
		int element_76 = 4;
		int element_78 = 4;
		int element_82 = 1;
		int element_83 = 2;
		int element_81 = 3;
		int element_6 = 3;
		int element_77 = 3;
		int element_48 = 1;
		int element_80 = 2;
		int element_45 = 2;
		int x = 0;
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
		right_11.element = element_45;
		right_11.left = left_46;
		right_11.right = right_47;
		left_46.element = element_48;
		left_46.left = left_49;
		left_46.right = right_50;
		obj.remove(x);
	}

	@Test
	public void test17() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_7 = new BinaryNode();
		BinaryNode right_11 = new BinaryNode();
		BinaryNode left_46 = new BinaryNode();
		BinaryNode right_50 = null;
		BinaryNode right_3 = null;
		BinaryNode right_8 = null;
		BinaryNode left_10 = null;
		BinaryNode right_47 = null;
		BinaryNode left_49 = null;
		int element_79 = -2;
		int element_1 = 3;
		int element_76 = 3;
		int element_78 = 3;
		int element_82 = -2;
		int element_83 = -1;
		int element_81 = 2;
		int element_6 = 2;
		int element_77 = 2;
		int element_48 = -1;
		int element_80 = 1;
		int element_45 = 1;
		int x = 0;
		int element_9 = -2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		left_7.element = element_9;
		left_7.left = left_10;
		left_7.right = right_11;
		right_11.element = element_45;
		right_11.left = left_46;
		right_11.right = right_47;
		left_46.element = element_48;
		left_46.left = left_49;
		left_46.right = right_50;
		obj.remove(x);
	}

	@Test
	public void test18() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_7 = new BinaryNode();
		BinaryNode right_11 = new BinaryNode();
		BinaryNode right_47 = null;
		BinaryNode right_3 = null;
		BinaryNode right_8 = null;
		BinaryNode left_10 = null;
		BinaryNode left_46 = null;
		int element_79 = -3;
		int element_1 = 1;
		int element_76 = 1;
		int element_78 = 1;
		int element_81 = -2;
		int element_6 = 0;
		int element_77 = 0;
		int element_80 = -3;
		int element_45 = -2;
		int x = -1;
		int element_9 = -3;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		left_7.element = element_9;
		left_7.left = left_10;
		left_7.right = right_11;
		right_11.element = element_45;
		right_11.left = left_46;
		right_11.right = right_47;
		obj.remove(x);
	}

	@Test
	public void test19() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_7 = new BinaryNode();
		BinaryNode right_11 = new BinaryNode();
		BinaryNode right_47 = new BinaryNode();
		BinaryNode left_61 = null;
		BinaryNode right_3 = null;
		BinaryNode right_8 = null;
		BinaryNode left_10 = null;
		BinaryNode left_46 = null;
		BinaryNode right_62 = null;
		int element_79 = -4;
		int element_1 = 1;
		int element_76 = 1;
		int element_78 = 1;
		int element_82 = -1;
		int element_83 = 0;
		int element_81 = -3;
		int element_6 = 0;
		int element_77 = 0;
		int element_80 = -4;
		int element_45 = -3;
		int element_60 = -1;
		int x = -2;
		int element_9 = -4;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		left_7.element = element_9;
		left_7.left = left_10;
		left_7.right = right_11;
		right_11.element = element_45;
		right_11.left = left_46;
		right_11.right = right_47;
		right_47.element = element_60;
		right_47.left = left_61;
		right_47.right = right_62;
		obj.remove(x);
	}

	@Test
	public void test20() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_7 = new BinaryNode();
		BinaryNode right_11 = new BinaryNode();
		BinaryNode right_47 = new BinaryNode();
		BinaryNode right_62 = null;
		BinaryNode right_3 = null;
		BinaryNode right_8 = null;
		BinaryNode left_10 = null;
		BinaryNode left_46 = null;
		BinaryNode left_61 = null;
		int element_79 = -4;
		int element_1 = 1;
		int element_76 = 1;
		int element_78 = 1;
		int element_82 = -3;
		int element_83 = -2;
		int element_81 = -3;
		int element_6 = 0;
		int element_77 = 0;
		int element_80 = -4;
		int element_45 = -3;
		int element_60 = -2;
		int x = -1;
		int element_9 = -4;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		left_7.element = element_9;
		left_7.left = left_10;
		left_7.right = right_11;
		right_11.element = element_45;
		right_11.left = left_46;
		right_11.right = right_47;
		right_47.element = element_60;
		right_47.left = left_61;
		right_47.right = right_62;
		obj.remove(x);
	}

	@Test
	public void test21() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_7 = new BinaryNode();
		BinaryNode right_11 = new BinaryNode();
		BinaryNode left_46 = null;
		BinaryNode right_47 = null;
		BinaryNode right_3 = null;
		BinaryNode right_8 = null;
		BinaryNode left_10 = null;
		int element_79 = -2;
		int element_1 = 1;
		int element_76 = 1;
		int element_78 = 1;
		int element_6 = 0;
		int element_77 = 0;
		int element_45 = -1;
		int x = -1;
		int element_9 = -2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		left_7.element = element_9;
		left_7.left = left_10;
		left_7.right = right_11;
		right_11.element = element_45;
		right_11.left = left_46;
		right_11.right = right_47;
		obj.remove(x);
	}

	@Test
	public void test22() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_7 = new BinaryNode();
		BinaryNode right_11 = new BinaryNode();
		BinaryNode right_47 = new BinaryNode();
		BinaryNode left_46 = null;
		BinaryNode right_3 = null;
		BinaryNode right_8 = null;
		BinaryNode left_10 = null;
		BinaryNode left_61 = null;
		BinaryNode right_62 = null;
		int element_79 = -3;
		int element_1 = 1;
		int element_76 = 1;
		int element_78 = 1;
		int element_82 = -1;
		int element_83 = 0;
		int element_81 = -1;
		int element_6 = 0;
		int element_77 = 0;
		int element_80 = -2;
		int element_45 = -2;
		int element_60 = -1;
		int x = -2;
		int element_9 = -3;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		left_7.element = element_9;
		left_7.left = left_10;
		left_7.right = right_11;
		right_11.element = element_45;
		right_11.left = left_46;
		right_11.right = right_47;
		right_47.element = element_60;
		right_47.left = left_61;
		right_47.right = right_62;
		obj.remove(x);
	}

	@Test
	public void test23() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_7 = new BinaryNode();
		BinaryNode right_11 = new BinaryNode();
		BinaryNode left_46 = new BinaryNode();
		BinaryNode right_47 = null;
		BinaryNode right_3 = null;
		BinaryNode right_8 = null;
		BinaryNode left_10 = null;
		BinaryNode left_49 = null;
		BinaryNode right_50 = null;
		int element_79 = -3;
		int element_1 = 1;
		int element_76 = 1;
		int element_78 = 1;
		int element_82 = -2;
		int element_83 = -1;
		int element_81 = -2;
		int element_6 = 0;
		int element_77 = 0;
		int element_48 = -2;
		int element_80 = -3;
		int element_45 = -1;
		int x = -1;
		int element_9 = -3;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		left_7.element = element_9;
		left_7.left = left_10;
		left_7.right = right_11;
		right_11.element = element_45;
		right_11.left = left_46;
		right_11.right = right_47;
		left_46.element = element_48;
		left_46.left = left_49;
		left_46.right = right_50;
		obj.remove(x);
	}

	@Test
	public void test24() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_7 = new BinaryNode();
		BinaryNode left_10 = null;
		BinaryNode right_11 = null;
		BinaryNode right_3 = null;
		BinaryNode right_8 = null;
		int element_77 = 0;
		int element_1 = 1;
		int element_76 = 1;
		int element_78 = 1;
		int x = -1;
		int element_9 = -1;
		int element_6 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		left_7.element = element_9;
		left_7.left = left_10;
		left_7.right = right_11;
		obj.remove(x);
	}

	@Test
	public void test25() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_7 = new BinaryNode();
		BinaryNode right_11 = new BinaryNode();
		BinaryNode left_10 = null;
		BinaryNode right_3 = null;
		BinaryNode right_8 = null;
		BinaryNode left_46 = null;
		BinaryNode right_47 = null;
		int element_79 = -2;
		int element_1 = 1;
		int element_76 = 1;
		int element_78 = 1;
		int element_82 = 0;
		int element_81 = -1;
		int element_6 = 0;
		int element_77 = 0;
		int element_80 = -1;
		int element_45 = -1;
		int x = -2;
		int element_9 = -2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		left_7.element = element_9;
		left_7.left = left_10;
		left_7.right = right_11;
		right_11.element = element_45;
		right_11.left = left_46;
		right_11.right = right_47;
		obj.remove(x);
	}

	@Test
	public void test26() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_7 = new BinaryNode();
		BinaryNode left_10 = new BinaryNode();
		BinaryNode right_11 = null;
		BinaryNode right_3 = null;
		BinaryNode right_8 = null;
		BinaryNode left_13 = null;
		BinaryNode right_14 = null;
		int element_79 = -2;
		int element_1 = 1;
		int element_76 = 1;
		int element_78 = 1;
		int element_12 = -2;
		int element_81 = -1;
		int element_6 = 0;
		int element_77 = 0;
		int element_80 = -2;
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
		left_10.element = element_12;
		left_10.left = left_13;
		left_10.right = right_14;
		obj.remove(x);
	}

	@Test
	public void test27() throws Exception {
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
		obj.remove(x);
	}

	@Test
	public void test28() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_8 = new BinaryNode();
		BinaryNode left_70 = null;
		BinaryNode right_3 = null;
		BinaryNode left_7 = null;
		BinaryNode right_71 = null;
		int element_77 = -1;
		int element_79 = 2;
		int element_1 = 2;
		int element_69 = 1;
		int element_76 = 2;
		int element_78 = 1;
		int x = 0;
		int element_6 = -1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		right_8.element = element_69;
		right_8.left = left_70;
		right_8.right = right_71;
		obj.remove(x);
	}

	@Test
	public void test29() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_8 = new BinaryNode();
		BinaryNode left_70 = new BinaryNode();
		BinaryNode left_73 = null;
		BinaryNode right_3 = null;
		BinaryNode left_7 = null;
		BinaryNode right_71 = null;
		BinaryNode right_74 = null;
		int element_79 = 3;
		int element_1 = 3;
		int element_76 = 3;
		int element_78 = 2;
		int element_81 = 2;
		int element_6 = -1;
		int element_72 = 1;
		int element_77 = -1;
		int element_80 = 1;
		int element_69 = 2;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		right_8.element = element_69;
		right_8.left = left_70;
		right_8.right = right_71;
		left_70.element = element_72;
		left_70.left = left_73;
		left_70.right = right_74;
		obj.remove(x);
	}

	@Test
	public void test30() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_8 = new BinaryNode();
		BinaryNode left_70 = new BinaryNode();
		BinaryNode left_73 = new BinaryNode();
		BinaryNode left_76 = null;
		BinaryNode right_3 = null;
		BinaryNode left_7 = null;
		BinaryNode right_71 = null;
		BinaryNode right_74 = null;
		BinaryNode right_77 = null;
		int element_79 = 4;
		int element_1 = 4;
		int element_76 = 4;
		int element_78 = 3;
		int element_82 = 1;
		int element_83 = 2;
		int element_81 = 3;
		int element_6 = -1;
		int element_72 = 2;
		int element_77 = -1;
		int element_80 = 2;
		int element_69 = 3;
		int element_75 = 1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		right_8.element = element_69;
		right_8.left = left_70;
		right_8.right = right_71;
		left_70.element = element_72;
		left_70.left = left_73;
		left_70.right = right_74;
		left_73.element = element_75;
		left_73.left = left_76;
		left_73.right = right_77;
		obj.remove(x);
	}

	@Test
	public void test31() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_8 = new BinaryNode();
		BinaryNode left_70 = new BinaryNode();
		BinaryNode left_73 = new BinaryNode();
		BinaryNode right_77 = null;
		BinaryNode right_3 = null;
		BinaryNode left_7 = null;
		BinaryNode right_71 = null;
		BinaryNode right_74 = null;
		BinaryNode left_76 = null;
		int element_79 = 3;
		int element_1 = 3;
		int element_76 = 3;
		int element_78 = 2;
		int element_82 = -2;
		int element_83 = -1;
		int element_81 = 2;
		int element_6 = -2;
		int element_72 = 1;
		int element_77 = -2;
		int element_80 = 1;
		int element_69 = 2;
		int element_75 = -1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		right_8.element = element_69;
		right_8.left = left_70;
		right_8.right = right_71;
		left_70.element = element_72;
		left_70.left = left_73;
		left_70.right = right_74;
		left_73.element = element_75;
		left_73.left = left_76;
		left_73.right = right_77;
		obj.remove(x);
	}

	@Test
	public void test32() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_8 = new BinaryNode();
		BinaryNode left_70 = new BinaryNode();
		BinaryNode right_74 = null;
		BinaryNode right_3 = null;
		BinaryNode left_7 = null;
		BinaryNode right_71 = null;
		BinaryNode left_73 = null;
		int element_79 = 2;
		int element_1 = 2;
		int element_76 = 2;
		int element_78 = 1;
		int element_81 = -1;
		int element_6 = -2;
		int element_72 = -1;
		int element_77 = -2;
		int element_80 = -2;
		int element_69 = 1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		right_8.element = element_69;
		right_8.left = left_70;
		right_8.right = right_71;
		left_70.element = element_72;
		left_70.left = left_73;
		left_70.right = right_74;
		obj.remove(x);
	}

	@Test
	public void test33() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_8 = new BinaryNode();
		BinaryNode left_70 = new BinaryNode();
		BinaryNode right_74 = new BinaryNode();
		BinaryNode left_85 = null;
		BinaryNode right_3 = null;
		BinaryNode left_7 = null;
		BinaryNode right_71 = null;
		BinaryNode left_73 = null;
		BinaryNode right_86 = null;
		int element_79 = 3;
		int element_1 = 3;
		int element_76 = 3;
		int element_78 = 2;
		int element_82 = 1;
		int element_83 = 2;
		int element_81 = -1;
		int element_6 = -2;
		int element_72 = -1;
		int element_84 = 1;
		int element_77 = -2;
		int element_80 = -2;
		int element_69 = 2;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		right_8.element = element_69;
		right_8.left = left_70;
		right_8.right = right_71;
		left_70.element = element_72;
		left_70.left = left_73;
		left_70.right = right_74;
		right_74.element = element_84;
		right_74.left = left_85;
		right_74.right = right_86;
		obj.remove(x);
	}

	@Test
	public void test34() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_8 = new BinaryNode();
		BinaryNode left_70 = new BinaryNode();
		BinaryNode right_74 = new BinaryNode();
		BinaryNode right_86 = null;
		BinaryNode right_3 = null;
		BinaryNode left_7 = null;
		BinaryNode right_71 = null;
		BinaryNode left_73 = null;
		BinaryNode left_85 = null;
		int element_79 = 2;
		int element_1 = 2;
		int element_76 = 2;
		int element_78 = 1;
		int element_82 = -2;
		int element_83 = -1;
		int element_81 = -2;
		int element_6 = -3;
		int element_72 = -2;
		int element_84 = -1;
		int element_77 = -3;
		int element_80 = -3;
		int element_69 = 1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		right_8.element = element_69;
		right_8.left = left_70;
		right_8.right = right_71;
		left_70.element = element_72;
		left_70.left = left_73;
		left_70.right = right_74;
		right_74.element = element_84;
		right_74.left = left_85;
		right_74.right = right_86;
		obj.remove(x);
	}

	@Test
	public void test35() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_8 = new BinaryNode();
		BinaryNode left_70 = new BinaryNode();
		BinaryNode left_73 = null;
		BinaryNode right_74 = null;
		BinaryNode right_3 = null;
		BinaryNode left_7 = null;
		BinaryNode right_71 = null;
		int element_79 = 2;
		int element_1 = 2;
		int element_76 = 2;
		int element_78 = 1;
		int element_6 = -1;
		int element_72 = 0;
		int element_77 = -1;
		int element_69 = 1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		right_8.element = element_69;
		right_8.left = left_70;
		right_8.right = right_71;
		left_70.element = element_72;
		left_70.left = left_73;
		left_70.right = right_74;
		obj.remove(x);
	}

	@Test
	public void test36() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_8 = new BinaryNode();
		BinaryNode left_70 = new BinaryNode();
		BinaryNode right_74 = new BinaryNode();
		BinaryNode left_73 = null;
		BinaryNode right_3 = null;
		BinaryNode left_7 = null;
		BinaryNode right_71 = null;
		BinaryNode left_85 = null;
		BinaryNode right_86 = null;
		int element_79 = 3;
		int element_1 = 3;
		int element_76 = 3;
		int element_78 = 2;
		int element_82 = 1;
		int element_83 = 2;
		int element_81 = 1;
		int element_6 = -1;
		int element_72 = 0;
		int element_84 = 1;
		int element_77 = -1;
		int element_80 = 0;
		int element_69 = 2;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		right_8.element = element_69;
		right_8.left = left_70;
		right_8.right = right_71;
		left_70.element = element_72;
		left_70.left = left_73;
		left_70.right = right_74;
		right_74.element = element_84;
		right_74.left = left_85;
		right_74.right = right_86;
		obj.remove(x);
	}

	@Test
	public void test37() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_8 = new BinaryNode();
		BinaryNode left_70 = new BinaryNode();
		BinaryNode left_73 = new BinaryNode();
		BinaryNode right_74 = null;
		BinaryNode right_3 = null;
		BinaryNode left_7 = null;
		BinaryNode right_71 = null;
		BinaryNode left_76 = null;
		BinaryNode right_77 = null;
		int element_79 = 2;
		int element_1 = 2;
		int element_76 = 2;
		int element_78 = 1;
		int element_82 = -1;
		int element_83 = 0;
		int element_81 = -1;
		int element_6 = -2;
		int element_72 = 0;
		int element_77 = -2;
		int element_80 = -2;
		int element_69 = 1;
		int element_75 = -1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		right_8.element = element_69;
		right_8.left = left_70;
		right_8.right = right_71;
		left_70.element = element_72;
		left_70.left = left_73;
		left_70.right = right_74;
		left_73.element = element_75;
		left_73.left = left_76;
		left_73.right = right_77;
		obj.remove(x);
	}

	@Test
	public void test38() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_8 = new BinaryNode();
		BinaryNode right_71 = null;
		BinaryNode right_3 = null;
		BinaryNode left_7 = null;
		BinaryNode left_70 = null;
		int element_77 = -2;
		int element_79 = -1;
		int element_1 = 1;
		int element_69 = -1;
		int element_76 = 1;
		int element_78 = -2;
		int x = 0;
		int element_6 = -2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		right_8.element = element_69;
		right_8.left = left_70;
		right_8.right = right_71;
		obj.remove(x);
	}

	@Test
	public void test39() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_8 = new BinaryNode();
		BinaryNode right_71 = new BinaryNode();
		BinaryNode left_94 = null;
		BinaryNode right_3 = null;
		BinaryNode left_7 = null;
		BinaryNode left_70 = null;
		BinaryNode right_95 = null;
		int element_79 = -1;
		int element_1 = 2;
		int element_76 = 2;
		int element_78 = -2;
		int element_81 = 2;
		int element_6 = -2;
		int element_93 = 1;
		int element_77 = -2;
		int element_80 = 1;
		int element_69 = -1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		right_8.element = element_69;
		right_8.left = left_70;
		right_8.right = right_71;
		right_71.element = element_93;
		right_71.left = left_94;
		right_71.right = right_95;
		obj.remove(x);
	}

	@Test
	public void test40() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_8 = new BinaryNode();
		BinaryNode right_71 = new BinaryNode();
		BinaryNode left_94 = new BinaryNode();
		BinaryNode left_97 = null;
		BinaryNode right_3 = null;
		BinaryNode left_7 = null;
		BinaryNode left_70 = null;
		BinaryNode right_95 = null;
		BinaryNode right_98 = null;
		int element_79 = -1;
		int element_1 = 3;
		int element_76 = 3;
		int element_78 = -2;
		int element_82 = 1;
		int element_83 = 2;
		int element_81 = 3;
		int element_6 = -2;
		int element_93 = 2;
		int element_77 = -2;
		int element_80 = 2;
		int element_96 = 1;
		int element_69 = -1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		right_8.element = element_69;
		right_8.left = left_70;
		right_8.right = right_71;
		right_71.element = element_93;
		right_71.left = left_94;
		right_71.right = right_95;
		left_94.element = element_96;
		left_94.left = left_97;
		left_94.right = right_98;
		obj.remove(x);
	}

	@Test
	public void test41() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_8 = new BinaryNode();
		BinaryNode right_71 = new BinaryNode();
		BinaryNode left_94 = new BinaryNode();
		BinaryNode right_98 = null;
		BinaryNode right_3 = null;
		BinaryNode left_7 = null;
		BinaryNode left_70 = null;
		BinaryNode right_95 = null;
		BinaryNode left_97 = null;
		int element_79 = -2;
		int element_1 = 2;
		int element_76 = 2;
		int element_78 = -3;
		int element_82 = -2;
		int element_83 = -1;
		int element_81 = 2;
		int element_6 = -3;
		int element_93 = 1;
		int element_77 = -3;
		int element_80 = 1;
		int element_96 = -1;
		int element_69 = -2;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		right_8.element = element_69;
		right_8.left = left_70;
		right_8.right = right_71;
		right_71.element = element_93;
		right_71.left = left_94;
		right_71.right = right_95;
		left_94.element = element_96;
		left_94.left = left_97;
		left_94.right = right_98;
		obj.remove(x);
	}

	@Test
	public void test42() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_8 = new BinaryNode();
		BinaryNode right_71 = new BinaryNode();
		BinaryNode right_95 = null;
		BinaryNode right_3 = null;
		BinaryNode left_7 = null;
		BinaryNode left_70 = null;
		BinaryNode left_94 = null;
		int element_79 = -2;
		int element_1 = 1;
		int element_76 = 1;
		int element_78 = -3;
		int element_81 = -1;
		int element_6 = -3;
		int element_93 = -1;
		int element_77 = -3;
		int element_80 = -2;
		int element_69 = -2;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		right_8.element = element_69;
		right_8.left = left_70;
		right_8.right = right_71;
		right_71.element = element_93;
		right_71.left = left_94;
		right_71.right = right_95;
		obj.remove(x);
	}

	@Test
	public void test43() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_8 = new BinaryNode();
		BinaryNode right_71 = new BinaryNode();
		BinaryNode right_95 = new BinaryNode();
		BinaryNode left_106 = null;
		BinaryNode right_3 = null;
		BinaryNode left_7 = null;
		BinaryNode left_70 = null;
		BinaryNode left_94 = null;
		BinaryNode right_107 = null;
		int element_79 = -2;
		int element_1 = 2;
		int element_76 = 2;
		int element_78 = -3;
		int element_82 = 1;
		int element_83 = 2;
		int element_81 = -1;
		int element_6 = -3;
		int element_93 = -1;
		int element_77 = -3;
		int element_80 = -2;
		int element_69 = -2;
		int element_105 = 1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		right_8.element = element_69;
		right_8.left = left_70;
		right_8.right = right_71;
		right_71.element = element_93;
		right_71.left = left_94;
		right_71.right = right_95;
		right_95.element = element_105;
		right_95.left = left_106;
		right_95.right = right_107;
		obj.remove(x);
	}

	@Test
	public void test44() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_8 = new BinaryNode();
		BinaryNode right_71 = new BinaryNode();
		BinaryNode right_95 = new BinaryNode();
		BinaryNode right_107 = null;
		BinaryNode right_3 = null;
		BinaryNode left_7 = null;
		BinaryNode left_70 = null;
		BinaryNode left_94 = null;
		BinaryNode left_106 = null;
		int element_79 = -3;
		int element_1 = 1;
		int element_76 = 1;
		int element_78 = -4;
		int element_82 = -2;
		int element_83 = -1;
		int element_81 = -2;
		int element_6 = -4;
		int element_93 = -2;
		int element_77 = -4;
		int element_80 = -3;
		int element_69 = -3;
		int element_105 = -1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		right_8.element = element_69;
		right_8.left = left_70;
		right_8.right = right_71;
		right_71.element = element_93;
		right_71.left = left_94;
		right_71.right = right_95;
		right_95.element = element_105;
		right_95.left = left_106;
		right_95.right = right_107;
		obj.remove(x);
	}

	@Test
	public void test45() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_8 = new BinaryNode();
		BinaryNode right_71 = new BinaryNode();
		BinaryNode left_94 = null;
		BinaryNode right_95 = null;
		BinaryNode right_3 = null;
		BinaryNode left_7 = null;
		BinaryNode left_70 = null;
		int element_79 = -1;
		int element_1 = 1;
		int element_76 = 1;
		int element_78 = -2;
		int element_6 = -2;
		int element_93 = 0;
		int element_77 = -2;
		int element_69 = -1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		right_8.element = element_69;
		right_8.left = left_70;
		right_8.right = right_71;
		right_71.element = element_93;
		right_71.left = left_94;
		right_71.right = right_95;
		obj.remove(x);
	}

	@Test
	public void test46() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_8 = new BinaryNode();
		BinaryNode right_71 = new BinaryNode();
		BinaryNode right_95 = new BinaryNode();
		BinaryNode left_94 = null;
		BinaryNode right_3 = null;
		BinaryNode left_7 = null;
		BinaryNode left_70 = null;
		BinaryNode left_106 = null;
		BinaryNode right_107 = null;
		int element_79 = -3;
		int element_1 = 0;
		int element_76 = 0;
		int element_78 = -4;
		int element_82 = -1;
		int element_83 = 0;
		int element_81 = -1;
		int element_6 = -4;
		int element_93 = -2;
		int element_77 = -4;
		int element_80 = -2;
		int element_69 = -3;
		int element_105 = -1;
		int x = -2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		right_8.element = element_69;
		right_8.left = left_70;
		right_8.right = right_71;
		right_71.element = element_93;
		right_71.left = left_94;
		right_71.right = right_95;
		right_95.element = element_105;
		right_95.left = left_106;
		right_95.right = right_107;
		obj.remove(x);
	}

	@Test
	public void test47() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_8 = new BinaryNode();
		BinaryNode right_71 = new BinaryNode();
		BinaryNode left_94 = new BinaryNode();
		BinaryNode right_95 = null;
		BinaryNode right_3 = null;
		BinaryNode left_7 = null;
		BinaryNode left_70 = null;
		BinaryNode left_97 = null;
		BinaryNode right_98 = null;
		int element_79 = -2;
		int element_1 = 1;
		int element_76 = 1;
		int element_78 = -3;
		int element_82 = -1;
		int element_83 = 0;
		int element_81 = -1;
		int element_6 = -3;
		int element_93 = 0;
		int element_77 = -3;
		int element_80 = -2;
		int element_96 = -1;
		int element_69 = -2;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		right_8.element = element_69;
		right_8.left = left_70;
		right_8.right = right_71;
		right_71.element = element_93;
		right_71.left = left_94;
		right_71.right = right_95;
		left_94.element = element_96;
		left_94.left = left_97;
		left_94.right = right_98;
		obj.remove(x);
	}

	@Test
	public void test48() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_8 = new BinaryNode();
		BinaryNode left_70 = null;
		BinaryNode right_71 = null;
		BinaryNode right_3 = null;
		BinaryNode left_7 = null;
		int element_77 = -1;
		int element_1 = 1;
		int element_69 = 0;
		int element_76 = 1;
		int x = 0;
		int element_6 = -1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		right_8.element = element_69;
		right_8.left = left_70;
		right_8.right = right_71;
		obj.remove(x);
	}

	@Test
	public void test49() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_8 = new BinaryNode();
		BinaryNode right_71 = new BinaryNode();
		BinaryNode left_70 = null;
		BinaryNode right_3 = null;
		BinaryNode left_7 = null;
		BinaryNode left_94 = null;
		BinaryNode right_95 = null;
		int element_79 = -1;
		int element_1 = 0;
		int element_76 = 0;
		int element_78 = -2;
		int element_81 = 0;
		int element_6 = -3;
		int element_93 = -1;
		int element_77 = -3;
		int element_80 = -1;
		int element_69 = -2;
		int x = -2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		right_8.element = element_69;
		right_8.left = left_70;
		right_8.right = right_71;
		right_71.element = element_93;
		right_71.left = left_94;
		right_71.right = right_95;
		obj.remove(x);
	}

	@Test
	public void test50() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_8 = new BinaryNode();
		BinaryNode left_70 = new BinaryNode();
		BinaryNode right_71 = null;
		BinaryNode right_3 = null;
		BinaryNode left_7 = null;
		BinaryNode left_73 = null;
		BinaryNode right_74 = null;
		int element_79 = -1;
		int element_1 = 1;
		int element_76 = 1;
		int element_78 = -2;
		int element_81 = 0;
		int element_6 = -2;
		int element_72 = -1;
		int element_77 = -2;
		int element_80 = -1;
		int element_69 = 0;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		right_8.element = element_69;
		right_8.left = left_70;
		right_8.right = right_71;
		left_70.element = element_72;
		left_70.left = left_73;
		left_70.right = right_74;
		obj.remove(x);
	}

	@Test
	public void test51() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_7 = null;
		BinaryNode right_8 = null;
		BinaryNode right_3 = null;
		int element_1 = 1;
		int element_76 = 1;
		int x = 0;
		int element_6 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		obj.remove(x);
	}

	@Test
	public void test52() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_8 = new BinaryNode();
		BinaryNode left_7 = null;
		BinaryNode right_3 = null;
		BinaryNode left_70 = null;
		BinaryNode right_71 = null;
		int element_79 = -1;
		int element_1 = 0;
		int element_76 = 0;
		int element_78 = -1;
		int element_6 = -2;
		int element_77 = -2;
		int element_80 = 0;
		int element_69 = -1;
		int x = -2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		right_8.element = element_69;
		right_8.left = left_70;
		right_8.right = right_71;
		obj.remove(x);
	}

	@Test
	public void test53() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_7 = new BinaryNode();
		BinaryNode right_8 = null;
		BinaryNode right_3 = null;
		BinaryNode left_10 = null;
		BinaryNode right_11 = null;
		int element_77 = -1;
		int element_79 = 0;
		int element_1 = 1;
		int element_76 = 1;
		int element_78 = -1;
		int x = 0;
		int element_9 = -1;
		int element_6 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		left_7.element = element_9;
		left_7.left = left_10;
		left_7.right = right_11;
		obj.remove(x);
	}

	@Test
	public void test54() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_7 = new BinaryNode();
		BinaryNode right_8 = new BinaryNode();
		BinaryNode left_70 = null;
		BinaryNode right_71 = null;
		BinaryNode right_3 = null;
		BinaryNode left_10 = null;
		BinaryNode right_11 = null;
		int element_79 = 0;
		int element_1 = 2;
		int element_76 = 2;
		int element_78 = -1;
		int element_6 = 0;
		int element_77 = -1;
		int element_69 = 1;
		int x = 0;
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
		right_8.element = element_69;
		right_8.left = left_70;
		right_8.right = right_71;
		obj.remove(x);
	}

	@Test
	public void test55() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_7 = new BinaryNode();
		BinaryNode right_8 = new BinaryNode();
		BinaryNode right_71 = new BinaryNode();
		BinaryNode left_70 = null;
		BinaryNode right_3 = null;
		BinaryNode left_10 = null;
		BinaryNode right_11 = null;
		BinaryNode left_94 = null;
		BinaryNode right_95 = null;
		int element_79 = 0;
		int element_1 = 3;
		int element_76 = 3;
		int element_78 = -1;
		int element_82 = 2;
		int element_83 = 3;
		int element_81 = 2;
		int element_93 = 2;
		int element_6 = 0;
		int element_77 = -1;
		int element_80 = 1;
		int element_69 = 1;
		int x = 0;
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
		right_8.element = element_69;
		right_8.left = left_70;
		right_8.right = right_71;
		right_71.element = element_93;
		right_71.left = left_94;
		right_71.right = right_95;
		obj.remove(x);
	}

	@Test
	public void test56() throws Exception {
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
		obj.remove(x);
	}

	@Test
	public void test57() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_115 = null;
		BinaryNode left_2 = null;
		BinaryNode right_116 = null;
		int element_77 = 1;
		int element_1 = -1;
		int element_76 = -1;
		int element_114 = 1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		obj.remove(x);
	}

	@Test
	public void test58() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_115 = new BinaryNode();
		BinaryNode left_118 = null;
		BinaryNode left_2 = null;
		BinaryNode right_116 = null;
		BinaryNode right_119 = null;
		int element_117 = 1;
		int element_77 = 2;
		int element_79 = 2;
		int element_1 = -1;
		int element_76 = -1;
		int element_78 = 1;
		int element_114 = 2;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		left_115.element = element_117;
		left_115.left = left_118;
		left_115.right = right_119;
		obj.remove(x);
	}

	@Test
	public void test59() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_115 = new BinaryNode();
		BinaryNode left_118 = new BinaryNode();
		BinaryNode left_121 = null;
		BinaryNode left_2 = null;
		BinaryNode right_116 = null;
		BinaryNode right_119 = null;
		BinaryNode right_122 = null;
		int element_117 = 2;
		int element_79 = 3;
		int element_1 = -1;
		int element_76 = -1;
		int element_78 = 2;
		int element_114 = 3;
		int element_81 = 2;
		int element_120 = 1;
		int element_77 = 3;
		int element_80 = 1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		left_115.element = element_117;
		left_115.left = left_118;
		left_115.right = right_119;
		left_118.element = element_120;
		left_118.left = left_121;
		left_118.right = right_122;
		obj.remove(x);
	}

	@Test
	public void test60() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_115 = new BinaryNode();
		BinaryNode left_118 = new BinaryNode();
		BinaryNode left_121 = new BinaryNode();
		BinaryNode left_124 = null;
		BinaryNode left_2 = null;
		BinaryNode right_116 = null;
		BinaryNode right_119 = null;
		BinaryNode right_122 = null;
		BinaryNode right_125 = null;
		int element_117 = 3;
		int element_79 = 4;
		int element_123 = 1;
		int element_1 = -1;
		int element_76 = -1;
		int element_78 = 3;
		int element_114 = 4;
		int element_82 = 1;
		int element_83 = 2;
		int element_81 = 3;
		int element_120 = 2;
		int element_77 = 4;
		int element_80 = 2;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		left_115.element = element_117;
		left_115.left = left_118;
		left_115.right = right_119;
		left_118.element = element_120;
		left_118.left = left_121;
		left_118.right = right_122;
		left_121.element = element_123;
		left_121.left = left_124;
		left_121.right = right_125;
		obj.remove(x);
	}

	@Test
	public void test61() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_115 = new BinaryNode();
		BinaryNode left_118 = new BinaryNode();
		BinaryNode left_121 = new BinaryNode();
		BinaryNode right_125 = null;
		BinaryNode left_2 = null;
		BinaryNode right_116 = null;
		BinaryNode right_119 = null;
		BinaryNode right_122 = null;
		BinaryNode left_124 = null;
		int element_117 = 2;
		int element_79 = 3;
		int element_123 = -1;
		int element_1 = -2;
		int element_76 = -2;
		int element_78 = 2;
		int element_114 = 3;
		int element_82 = -2;
		int element_81 = 2;
		int element_83 = -1;
		int element_120 = 1;
		int element_77 = 3;
		int element_80 = 1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		left_115.element = element_117;
		left_115.left = left_118;
		left_115.right = right_119;
		left_118.element = element_120;
		left_118.left = left_121;
		left_118.right = right_122;
		left_121.element = element_123;
		left_121.left = left_124;
		left_121.right = right_125;
		obj.remove(x);
	}

	@Test
	public void test62() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_115 = new BinaryNode();
		BinaryNode left_118 = new BinaryNode();
		BinaryNode right_122 = null;
		BinaryNode left_2 = null;
		BinaryNode right_116 = null;
		BinaryNode right_119 = null;
		BinaryNode left_121 = null;
		int element_117 = 1;
		int element_79 = 2;
		int element_1 = -2;
		int element_76 = -2;
		int element_78 = 1;
		int element_114 = 2;
		int element_81 = -1;
		int element_120 = -1;
		int element_77 = 2;
		int element_80 = -2;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		left_115.element = element_117;
		left_115.left = left_118;
		left_115.right = right_119;
		left_118.element = element_120;
		left_118.left = left_121;
		left_118.right = right_122;
		obj.remove(x);
	}

	@Test
	public void test63() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_115 = new BinaryNode();
		BinaryNode left_118 = new BinaryNode();
		BinaryNode right_122 = new BinaryNode();
		BinaryNode left_136 = null;
		BinaryNode left_2 = null;
		BinaryNode right_116 = null;
		BinaryNode right_119 = null;
		BinaryNode left_121 = null;
		BinaryNode right_137 = null;
		int element_117 = 2;
		int element_79 = 3;
		int element_1 = -2;
		int element_76 = -2;
		int element_78 = 2;
		int element_114 = 3;
		int element_82 = 1;
		int element_83 = 2;
		int element_81 = -1;
		int element_135 = 1;
		int element_120 = -1;
		int element_77 = 3;
		int element_80 = -2;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		left_115.element = element_117;
		left_115.left = left_118;
		left_115.right = right_119;
		left_118.element = element_120;
		left_118.left = left_121;
		left_118.right = right_122;
		right_122.element = element_135;
		right_122.left = left_136;
		right_122.right = right_137;
		obj.remove(x);
	}

	@Test
	public void test64() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_115 = new BinaryNode();
		BinaryNode left_118 = new BinaryNode();
		BinaryNode right_122 = new BinaryNode();
		BinaryNode right_137 = null;
		BinaryNode left_2 = null;
		BinaryNode right_116 = null;
		BinaryNode right_119 = null;
		BinaryNode left_121 = null;
		BinaryNode left_136 = null;
		int element_117 = 1;
		int element_79 = 2;
		int element_1 = -3;
		int element_76 = -3;
		int element_78 = 1;
		int element_114 = 2;
		int element_82 = -2;
		int element_83 = -1;
		int element_81 = -2;
		int element_135 = -1;
		int element_120 = -2;
		int element_77 = 2;
		int element_80 = -3;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		left_115.element = element_117;
		left_115.left = left_118;
		left_115.right = right_119;
		left_118.element = element_120;
		left_118.left = left_121;
		left_118.right = right_122;
		right_122.element = element_135;
		right_122.left = left_136;
		right_122.right = right_137;
		obj.remove(x);
	}

	@Test
	public void test65() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_115 = new BinaryNode();
		BinaryNode left_118 = new BinaryNode();
		BinaryNode left_121 = null;
		BinaryNode right_122 = null;
		BinaryNode left_2 = null;
		BinaryNode right_116 = null;
		BinaryNode right_119 = null;
		int element_117 = 1;
		int element_79 = 2;
		int element_1 = -1;
		int element_76 = -1;
		int element_78 = 1;
		int element_114 = 2;
		int element_120 = 0;
		int element_77 = 2;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		left_115.element = element_117;
		left_115.left = left_118;
		left_115.right = right_119;
		left_118.element = element_120;
		left_118.left = left_121;
		left_118.right = right_122;
		obj.remove(x);
	}

	@Test
	public void test66() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_115 = new BinaryNode();
		BinaryNode left_118 = new BinaryNode();
		BinaryNode right_122 = new BinaryNode();
		BinaryNode left_121 = null;
		BinaryNode left_2 = null;
		BinaryNode right_116 = null;
		BinaryNode right_119 = null;
		BinaryNode left_136 = null;
		BinaryNode right_137 = null;
		int element_117 = 2;
		int element_79 = 3;
		int element_1 = -1;
		int element_76 = -1;
		int element_78 = 2;
		int element_114 = 3;
		int element_82 = 1;
		int element_83 = 2;
		int element_81 = 1;
		int element_135 = 1;
		int element_120 = 0;
		int element_77 = 3;
		int element_80 = 0;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		left_115.element = element_117;
		left_115.left = left_118;
		left_115.right = right_119;
		left_118.element = element_120;
		left_118.left = left_121;
		left_118.right = right_122;
		right_122.element = element_135;
		right_122.left = left_136;
		right_122.right = right_137;
		obj.remove(x);
	}

	@Test
	public void test67() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_115 = new BinaryNode();
		BinaryNode left_118 = new BinaryNode();
		BinaryNode left_121 = new BinaryNode();
		BinaryNode right_122 = null;
		BinaryNode left_2 = null;
		BinaryNode right_116 = null;
		BinaryNode right_119 = null;
		BinaryNode left_124 = null;
		BinaryNode right_125 = null;
		int element_117 = 3;
		int element_79 = 4;
		int element_123 = 1;
		int element_1 = 0;
		int element_76 = 0;
		int element_78 = 3;
		int element_114 = 4;
		int element_82 = 1;
		int element_83 = 2;
		int element_81 = 1;
		int element_120 = 2;
		int element_77 = 4;
		int element_80 = 0;
		int x = 2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		left_115.element = element_117;
		left_115.left = left_118;
		left_115.right = right_119;
		left_118.element = element_120;
		left_118.left = left_121;
		left_118.right = right_122;
		left_121.element = element_123;
		left_121.left = left_124;
		left_121.right = right_125;
		obj.remove(x);
	}

	@Test
	public void test68() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_115 = new BinaryNode();
		BinaryNode right_119 = null;
		BinaryNode left_2 = null;
		BinaryNode right_116 = null;
		BinaryNode left_118 = null;
		int element_117 = -1;
		int element_77 = 1;
		int element_79 = -1;
		int element_1 = -2;
		int element_76 = -2;
		int element_78 = -2;
		int element_114 = 1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		left_115.element = element_117;
		left_115.left = left_118;
		left_115.right = right_119;
		obj.remove(x);
	}

	@Test
	public void test69() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_115 = new BinaryNode();
		BinaryNode right_119 = new BinaryNode();
		BinaryNode left_145 = null;
		BinaryNode left_2 = null;
		BinaryNode right_116 = null;
		BinaryNode left_118 = null;
		BinaryNode right_146 = null;
		int element_117 = -1;
		int element_79 = -1;
		int element_1 = -2;
		int element_76 = -2;
		int element_78 = -2;
		int element_114 = 2;
		int element_81 = 2;
		int element_144 = 1;
		int element_77 = 2;
		int element_80 = 1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		left_115.element = element_117;
		left_115.left = left_118;
		left_115.right = right_119;
		right_119.element = element_144;
		right_119.left = left_145;
		right_119.right = right_146;
		obj.remove(x);
	}

	@Test
	public void test70() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_115 = new BinaryNode();
		BinaryNode right_119 = new BinaryNode();
		BinaryNode left_145 = new BinaryNode();
		BinaryNode left_148 = null;
		BinaryNode left_2 = null;
		BinaryNode right_116 = null;
		BinaryNode left_118 = null;
		BinaryNode right_146 = null;
		BinaryNode right_149 = null;
		int element_117 = -1;
		int element_79 = -1;
		int element_1 = -2;
		int element_76 = -2;
		int element_78 = -2;
		int element_114 = 3;
		int element_82 = 1;
		int element_83 = 2;
		int element_144 = 2;
		int element_81 = 3;
		int element_77 = 3;
		int element_80 = 2;
		int element_147 = 1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		left_115.element = element_117;
		left_115.left = left_118;
		left_115.right = right_119;
		right_119.element = element_144;
		right_119.left = left_145;
		right_119.right = right_146;
		left_145.element = element_147;
		left_145.left = left_148;
		left_145.right = right_149;
		obj.remove(x);
	}

	@Test
	public void test71() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_115 = new BinaryNode();
		BinaryNode right_119 = new BinaryNode();
		BinaryNode left_145 = new BinaryNode();
		BinaryNode right_149 = null;
		BinaryNode left_2 = null;
		BinaryNode right_116 = null;
		BinaryNode left_118 = null;
		BinaryNode right_146 = null;
		BinaryNode left_148 = null;
		int element_117 = -2;
		int element_79 = -2;
		int element_1 = -3;
		int element_76 = -3;
		int element_78 = -3;
		int element_114 = 2;
		int element_82 = -2;
		int element_83 = -1;
		int element_144 = 1;
		int element_81 = 2;
		int element_77 = 2;
		int element_80 = 1;
		int element_147 = -1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		left_115.element = element_117;
		left_115.left = left_118;
		left_115.right = right_119;
		right_119.element = element_144;
		right_119.left = left_145;
		right_119.right = right_146;
		left_145.element = element_147;
		left_145.left = left_148;
		left_145.right = right_149;
		obj.remove(x);
	}

	@Test
	public void test72() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_115 = new BinaryNode();
		BinaryNode right_119 = new BinaryNode();
		BinaryNode right_146 = null;
		BinaryNode left_2 = null;
		BinaryNode right_116 = null;
		BinaryNode left_118 = null;
		BinaryNode left_145 = null;
		int element_117 = -2;
		int element_79 = -2;
		int element_1 = -3;
		int element_76 = -3;
		int element_78 = -3;
		int element_114 = 1;
		int element_81 = -1;
		int element_144 = -1;
		int element_77 = 1;
		int element_80 = -2;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		left_115.element = element_117;
		left_115.left = left_118;
		left_115.right = right_119;
		right_119.element = element_144;
		right_119.left = left_145;
		right_119.right = right_146;
		obj.remove(x);
	}

	@Test
	public void test73() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_115 = new BinaryNode();
		BinaryNode right_119 = new BinaryNode();
		BinaryNode right_146 = new BinaryNode();
		BinaryNode left_157 = null;
		BinaryNode left_2 = null;
		BinaryNode right_116 = null;
		BinaryNode left_118 = null;
		BinaryNode left_145 = null;
		BinaryNode right_158 = null;
		int element_117 = -2;
		int element_79 = -2;
		int element_1 = -3;
		int element_76 = -3;
		int element_78 = -3;
		int element_114 = 2;
		int element_82 = 1;
		int element_83 = 2;
		int element_144 = -1;
		int element_81 = -1;
		int element_77 = 2;
		int element_80 = -2;
		int element_156 = 1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		left_115.element = element_117;
		left_115.left = left_118;
		left_115.right = right_119;
		right_119.element = element_144;
		right_119.left = left_145;
		right_119.right = right_146;
		right_146.element = element_156;
		right_146.left = left_157;
		right_146.right = right_158;
		obj.remove(x);
	}

	@Test
	public void test74() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_115 = new BinaryNode();
		BinaryNode right_119 = new BinaryNode();
		BinaryNode right_146 = new BinaryNode();
		BinaryNode right_158 = null;
		BinaryNode left_2 = null;
		BinaryNode right_116 = null;
		BinaryNode left_118 = null;
		BinaryNode left_145 = null;
		BinaryNode left_157 = null;
		int element_117 = -3;
		int element_79 = -3;
		int element_1 = -4;
		int element_76 = -4;
		int element_78 = -4;
		int element_114 = 1;
		int element_82 = -2;
		int element_144 = -2;
		int element_81 = -2;
		int element_83 = -1;
		int element_77 = 1;
		int element_80 = -3;
		int element_156 = -1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		left_115.element = element_117;
		left_115.left = left_118;
		left_115.right = right_119;
		right_119.element = element_144;
		right_119.left = left_145;
		right_119.right = right_146;
		right_146.element = element_156;
		right_146.left = left_157;
		right_146.right = right_158;
		obj.remove(x);
	}

	@Test
	public void test75() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_115 = new BinaryNode();
		BinaryNode right_119 = new BinaryNode();
		BinaryNode left_145 = null;
		BinaryNode right_146 = null;
		BinaryNode left_2 = null;
		BinaryNode right_116 = null;
		BinaryNode left_118 = null;
		int element_117 = -1;
		int element_79 = -1;
		int element_1 = -2;
		int element_76 = -2;
		int element_78 = -2;
		int element_114 = 1;
		int element_144 = 0;
		int element_77 = 1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		left_115.element = element_117;
		left_115.left = left_118;
		left_115.right = right_119;
		right_119.element = element_144;
		right_119.left = left_145;
		right_119.right = right_146;
		obj.remove(x);
	}

	@Test
	public void test76() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_115 = new BinaryNode();
		BinaryNode right_119 = new BinaryNode();
		BinaryNode right_146 = new BinaryNode();
		BinaryNode left_145 = null;
		BinaryNode left_2 = null;
		BinaryNode right_116 = null;
		BinaryNode left_118 = null;
		BinaryNode left_157 = null;
		BinaryNode right_158 = null;
		int element_117 = -1;
		int element_79 = -1;
		int element_1 = -2;
		int element_76 = -2;
		int element_78 = -2;
		int element_114 = 2;
		int element_82 = 1;
		int element_83 = 2;
		int element_144 = 0;
		int element_81 = 1;
		int element_77 = 2;
		int element_80 = 0;
		int element_156 = 1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		left_115.element = element_117;
		left_115.left = left_118;
		left_115.right = right_119;
		right_119.element = element_144;
		right_119.left = left_145;
		right_119.right = right_146;
		right_146.element = element_156;
		right_146.left = left_157;
		right_146.right = right_158;
		obj.remove(x);
	}

	@Test
	public void test77() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_115 = new BinaryNode();
		BinaryNode right_119 = new BinaryNode();
		BinaryNode left_145 = new BinaryNode();
		BinaryNode right_146 = null;
		BinaryNode left_2 = null;
		BinaryNode right_116 = null;
		BinaryNode left_118 = null;
		BinaryNode left_148 = null;
		BinaryNode right_149 = null;
		int element_117 = -2;
		int element_79 = -2;
		int element_1 = -3;
		int element_76 = -3;
		int element_78 = -3;
		int element_114 = 1;
		int element_82 = -1;
		int element_83 = 0;
		int element_144 = 0;
		int element_81 = -1;
		int element_77 = 1;
		int element_80 = -2;
		int element_147 = -1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		left_115.element = element_117;
		left_115.left = left_118;
		left_115.right = right_119;
		right_119.element = element_144;
		right_119.left = left_145;
		right_119.right = right_146;
		left_145.element = element_147;
		left_145.left = left_148;
		left_145.right = right_149;
		obj.remove(x);
	}

	@Test
	public void test78() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_115 = new BinaryNode();
		BinaryNode left_118 = null;
		BinaryNode right_119 = null;
		BinaryNode left_2 = null;
		BinaryNode right_116 = null;
		int element_117 = 0;
		int element_77 = 1;
		int element_1 = -1;
		int element_76 = -1;
		int element_114 = 1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		left_115.element = element_117;
		left_115.left = left_118;
		left_115.right = right_119;
		obj.remove(x);
	}

	@Test
	public void test79() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_115 = new BinaryNode();
		BinaryNode right_119 = new BinaryNode();
		BinaryNode left_118 = null;
		BinaryNode left_2 = null;
		BinaryNode right_116 = null;
		BinaryNode left_145 = null;
		BinaryNode right_146 = null;
		int element_117 = 0;
		int element_79 = 1;
		int element_1 = -1;
		int element_76 = -1;
		int element_78 = 0;
		int element_114 = 2;
		int element_81 = 2;
		int element_144 = 1;
		int element_77 = 2;
		int element_80 = 1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		left_115.element = element_117;
		left_115.left = left_118;
		left_115.right = right_119;
		right_119.element = element_144;
		right_119.left = left_145;
		right_119.right = right_146;
		obj.remove(x);
	}

	@Test
	public void test80() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_115 = new BinaryNode();
		BinaryNode left_118 = new BinaryNode();
		BinaryNode right_119 = null;
		BinaryNode left_2 = null;
		BinaryNode right_116 = null;
		BinaryNode left_121 = null;
		BinaryNode right_122 = null;
		int element_117 = 2;
		int element_79 = 1;
		int element_1 = 0;
		int element_76 = 0;
		int element_78 = 0;
		int element_114 = 3;
		int element_81 = 2;
		int element_120 = 1;
		int element_77 = 3;
		int element_80 = 1;
		int x = 2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		left_115.element = element_117;
		left_115.left = left_118;
		left_115.right = right_119;
		left_118.element = element_120;
		left_118.left = left_121;
		left_118.right = right_122;
		obj.remove(x);
	}

	@Test
	public void test81() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_116 = null;
		BinaryNode left_2 = null;
		BinaryNode left_115 = null;
		int element_77 = -2;
		int element_1 = -2;
		int element_76 = -2;
		int element_78 = -1;
		int element_114 = -1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		obj.remove(x);
	}

	@Test
	public void test82() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_116 = new BinaryNode();
		BinaryNode left_166 = null;
		BinaryNode left_2 = null;
		BinaryNode left_115 = null;
		BinaryNode right_167 = null;
		int element_77 = -1;
		int element_79 = 2;
		int element_1 = -1;
		int element_165 = 2;
		int element_76 = -1;
		int element_114 = 0;
		int element_78 = 0;
		int x = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		right_116.element = element_165;
		right_116.left = left_166;
		right_116.right = right_167;
		obj.remove(x);
	}

	@Test
	public void test83() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_116 = new BinaryNode();
		BinaryNode left_166 = new BinaryNode();
		BinaryNode left_169 = null;
		BinaryNode left_2 = null;
		BinaryNode left_115 = null;
		BinaryNode right_167 = null;
		BinaryNode right_170 = null;
		int element_79 = 3;
		int element_168 = 2;
		int element_1 = -1;
		int element_165 = 3;
		int element_76 = -1;
		int element_114 = 0;
		int element_78 = 0;
		int element_81 = 3;
		int element_77 = -1;
		int element_80 = 2;
		int x = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		right_116.element = element_165;
		right_116.left = left_166;
		right_116.right = right_167;
		left_166.element = element_168;
		left_166.left = left_169;
		left_166.right = right_170;
		obj.remove(x);
	}

	@Test
	public void test84() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_116 = new BinaryNode();
		BinaryNode left_166 = new BinaryNode();
		BinaryNode left_169 = new BinaryNode();
		BinaryNode left_172 = null;
		BinaryNode left_2 = null;
		BinaryNode left_115 = null;
		BinaryNode right_167 = null;
		BinaryNode right_170 = null;
		BinaryNode right_173 = null;
		int element_79 = 4;
		int element_168 = 3;
		int element_1 = -1;
		int element_165 = 4;
		int element_76 = -1;
		int element_114 = 0;
		int element_78 = 0;
		int element_82 = 2;
		int element_171 = 2;
		int element_81 = 4;
		int element_77 = -1;
		int element_80 = 3;
		int element_83 = 3;
		int x = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		right_116.element = element_165;
		right_116.left = left_166;
		right_116.right = right_167;
		left_166.element = element_168;
		left_166.left = left_169;
		left_166.right = right_170;
		left_169.element = element_171;
		left_169.left = left_172;
		left_169.right = right_173;
		obj.remove(x);
	}

	@Test
	public void test85() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_116 = new BinaryNode();
		BinaryNode left_166 = new BinaryNode();
		BinaryNode left_169 = new BinaryNode();
		BinaryNode right_173 = null;
		BinaryNode left_2 = null;
		BinaryNode left_115 = null;
		BinaryNode right_167 = null;
		BinaryNode right_170 = null;
		BinaryNode left_172 = null;
		int element_79 = 4;
		int element_168 = 3;
		int element_1 = -1;
		int element_165 = 4;
		int element_76 = -1;
		int element_114 = 0;
		int element_78 = 0;
		int element_82 = 0;
		int element_81 = 4;
		int element_171 = 1;
		int element_77 = -1;
		int element_80 = 3;
		int element_83 = 1;
		int x = 2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		right_116.element = element_165;
		right_116.left = left_166;
		right_116.right = right_167;
		left_166.element = element_168;
		left_166.left = left_169;
		left_166.right = right_170;
		left_169.element = element_171;
		left_169.left = left_172;
		left_169.right = right_173;
		obj.remove(x);
	}

	@Test
	public void test86() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_116 = new BinaryNode();
		BinaryNode left_166 = new BinaryNode();
		BinaryNode right_170 = null;
		BinaryNode left_2 = null;
		BinaryNode left_115 = null;
		BinaryNode right_167 = null;
		BinaryNode left_169 = null;
		int element_79 = 3;
		int element_168 = 1;
		int element_1 = -1;
		int element_165 = 3;
		int element_76 = -1;
		int element_114 = 0;
		int element_78 = 0;
		int element_81 = 1;
		int element_77 = -1;
		int element_80 = 0;
		int x = 2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		right_116.element = element_165;
		right_116.left = left_166;
		right_116.right = right_167;
		left_166.element = element_168;
		left_166.left = left_169;
		left_166.right = right_170;
		obj.remove(x);
	}

	@Test
	public void test87() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_116 = new BinaryNode();
		BinaryNode left_166 = new BinaryNode();
		BinaryNode right_170 = new BinaryNode();
		BinaryNode left_181 = null;
		BinaryNode left_2 = null;
		BinaryNode left_115 = null;
		BinaryNode right_167 = null;
		BinaryNode left_169 = null;
		BinaryNode right_182 = null;
		int element_79 = 2;
		int element_168 = -1;
		int element_1 = -3;
		int element_165 = 2;
		int element_78 = -2;
		int element_76 = -3;
		int element_114 = -2;
		int element_180 = 1;
		int element_81 = -1;
		int element_82 = 1;
		int element_77 = -3;
		int element_80 = -2;
		int element_83 = 2;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		right_116.element = element_165;
		right_116.left = left_166;
		right_116.right = right_167;
		left_166.element = element_168;
		left_166.left = left_169;
		left_166.right = right_170;
		right_170.element = element_180;
		right_170.left = left_181;
		right_170.right = right_182;
		obj.remove(x);
	}

	@Test
	public void test88() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_116 = new BinaryNode();
		BinaryNode left_166 = new BinaryNode();
		BinaryNode right_170 = new BinaryNode();
		BinaryNode right_182 = null;
		BinaryNode left_2 = null;
		BinaryNode left_115 = null;
		BinaryNode right_167 = null;
		BinaryNode left_169 = null;
		BinaryNode left_181 = null;
		int element_79 = 1;
		int element_168 = -2;
		int element_1 = -4;
		int element_165 = 1;
		int element_78 = -3;
		int element_114 = -3;
		int element_76 = -4;
		int element_82 = -2;
		int element_180 = -1;
		int element_81 = -2;
		int element_83 = -1;
		int element_77 = -4;
		int element_80 = -3;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		right_116.element = element_165;
		right_116.left = left_166;
		right_116.right = right_167;
		left_166.element = element_168;
		left_166.left = left_169;
		left_166.right = right_170;
		right_170.element = element_180;
		right_170.left = left_181;
		right_170.right = right_182;
		obj.remove(x);
	}

	@Test
	public void test89() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_116 = new BinaryNode();
		BinaryNode left_166 = new BinaryNode();
		BinaryNode left_169 = null;
		BinaryNode right_170 = null;
		BinaryNode left_2 = null;
		BinaryNode left_115 = null;
		BinaryNode right_167 = null;
		int element_79 = 2;
		int element_168 = 1;
		int element_1 = -1;
		int element_165 = 2;
		int element_76 = -1;
		int element_114 = 0;
		int element_78 = 0;
		int element_77 = -1;
		int x = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		right_116.element = element_165;
		right_116.left = left_166;
		right_116.right = right_167;
		left_166.element = element_168;
		left_166.left = left_169;
		left_166.right = right_170;
		obj.remove(x);
	}

	@Test
	public void test90() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_116 = new BinaryNode();
		BinaryNode left_166 = new BinaryNode();
		BinaryNode right_170 = new BinaryNode();
		BinaryNode left_169 = null;
		BinaryNode left_2 = null;
		BinaryNode left_115 = null;
		BinaryNode right_167 = null;
		BinaryNode left_181 = null;
		BinaryNode right_182 = null;
		int element_79 = 3;
		int element_168 = 1;
		int element_1 = -1;
		int element_165 = 3;
		int element_76 = -1;
		int element_114 = 0;
		int element_78 = 0;
		int element_82 = 2;
		int element_180 = 2;
		int element_81 = 2;
		int element_83 = 3;
		int element_77 = -1;
		int element_80 = 1;
		int x = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		right_116.element = element_165;
		right_116.left = left_166;
		right_116.right = right_167;
		left_166.element = element_168;
		left_166.left = left_169;
		left_166.right = right_170;
		right_170.element = element_180;
		right_170.left = left_181;
		right_170.right = right_182;
		obj.remove(x);
	}

	@Test
	public void test91() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_116 = new BinaryNode();
		BinaryNode left_166 = new BinaryNode();
		BinaryNode left_169 = new BinaryNode();
		BinaryNode right_170 = null;
		BinaryNode left_2 = null;
		BinaryNode left_115 = null;
		BinaryNode right_167 = null;
		BinaryNode left_172 = null;
		BinaryNode right_173 = null;
		int element_79 = 3;
		int element_168 = 2;
		int element_1 = -1;
		int element_165 = 3;
		int element_76 = -1;
		int element_114 = 0;
		int element_78 = 0;
		int element_82 = 1;
		int element_171 = 1;
		int element_81 = 1;
		int element_77 = -1;
		int element_80 = 0;
		int element_83 = 2;
		int x = 2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		right_116.element = element_165;
		right_116.left = left_166;
		right_116.right = right_167;
		left_166.element = element_168;
		left_166.left = left_169;
		left_166.right = right_170;
		left_169.element = element_171;
		left_169.left = left_172;
		left_169.right = right_173;
		obj.remove(x);
	}

	@Test
	public void test92() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_116 = new BinaryNode();
		BinaryNode right_167 = null;
		BinaryNode left_2 = null;
		BinaryNode left_115 = null;
		BinaryNode left_166 = null;
		int element_79 = 0;
		int element_1 = -1;
		int element_165 = 1;
		int element_76 = -1;
		int element_114 = 0;
		int element_78 = 0;
		int element_77 = -1;
		int element_80 = 1;
		int x = 2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		right_116.element = element_165;
		right_116.left = left_166;
		right_116.right = right_167;
		obj.remove(x);
	}

	@Test
	public void test93() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_116 = new BinaryNode();
		BinaryNode right_167 = new BinaryNode();
		BinaryNode left_190 = null;
		BinaryNode left_2 = null;
		BinaryNode left_115 = null;
		BinaryNode left_166 = null;
		BinaryNode right_191 = null;
		int element_79 = 0;
		int element_189 = 3;
		int element_1 = -1;
		int element_165 = 1;
		int element_76 = -1;
		int element_114 = 0;
		int element_78 = 0;
		int element_81 = 3;
		int element_77 = -1;
		int element_80 = 1;
		int x = 2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		right_116.element = element_165;
		right_116.left = left_166;
		right_116.right = right_167;
		right_167.element = element_189;
		right_167.left = left_190;
		right_167.right = right_191;
		obj.remove(x);
	}

	@Test
	public void test94() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_116 = new BinaryNode();
		BinaryNode right_167 = new BinaryNode();
		BinaryNode left_190 = new BinaryNode();
		BinaryNode left_193 = null;
		BinaryNode left_2 = null;
		BinaryNode left_115 = null;
		BinaryNode left_166 = null;
		BinaryNode right_191 = null;
		BinaryNode right_194 = null;
		int element_79 = -2;
		int element_189 = 2;
		int element_1 = -3;
		int element_165 = -1;
		int element_76 = -3;
		int element_114 = -2;
		int element_78 = -2;
		int element_81 = 2;
		int element_82 = 1;
		int element_192 = 1;
		int element_77 = -3;
		int element_80 = -1;
		int element_83 = 2;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		right_116.element = element_165;
		right_116.left = left_166;
		right_116.right = right_167;
		right_167.element = element_189;
		right_167.left = left_190;
		right_167.right = right_191;
		left_190.element = element_192;
		left_190.left = left_193;
		left_190.right = right_194;
		obj.remove(x);
	}

	@Test
	public void test95() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_116 = new BinaryNode();
		BinaryNode right_167 = new BinaryNode();
		BinaryNode left_190 = new BinaryNode();
		BinaryNode right_194 = null;
		BinaryNode left_2 = null;
		BinaryNode left_115 = null;
		BinaryNode left_166 = null;
		BinaryNode right_191 = null;
		BinaryNode left_193 = null;
		int element_79 = -3;
		int element_189 = 1;
		int element_1 = -4;
		int element_165 = -2;
		int element_76 = -4;
		int element_114 = -3;
		int element_78 = -3;
		int element_82 = -2;
		int element_81 = 1;
		int element_83 = -1;
		int element_192 = -1;
		int element_77 = -4;
		int element_80 = -2;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		right_116.element = element_165;
		right_116.left = left_166;
		right_116.right = right_167;
		right_167.element = element_189;
		right_167.left = left_190;
		right_167.right = right_191;
		left_190.element = element_192;
		left_190.left = left_193;
		left_190.right = right_194;
		obj.remove(x);
	}

	@Test
	public void test96() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_116 = new BinaryNode();
		BinaryNode right_167 = new BinaryNode();
		BinaryNode right_191 = null;
		BinaryNode left_2 = null;
		BinaryNode left_115 = null;
		BinaryNode left_166 = null;
		BinaryNode left_190 = null;
		int element_79 = 0;
		int element_189 = 2;
		int element_1 = -1;
		int element_165 = 1;
		int element_76 = -1;
		int element_114 = 0;
		int element_78 = 0;
		int element_82 = 2;
		int element_81 = 1;
		int element_77 = -1;
		int element_80 = 1;
		int x = 3;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		right_116.element = element_165;
		right_116.left = left_166;
		right_116.right = right_167;
		right_167.element = element_189;
		right_167.left = left_190;
		right_167.right = right_191;
		obj.remove(x);
	}

	@Test
	public void test97() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_116 = new BinaryNode();
		BinaryNode right_167 = new BinaryNode();
		BinaryNode right_191 = new BinaryNode();
		BinaryNode left_202 = null;
		BinaryNode left_2 = null;
		BinaryNode left_115 = null;
		BinaryNode left_166 = null;
		BinaryNode left_190 = null;
		BinaryNode right_203 = null;
		int element_79 = 0;
		int element_189 = 2;
		int element_1 = -1;
		int element_165 = 1;
		int element_78 = 0;
		int element_114 = 0;
		int element_201 = 4;
		int element_76 = -1;
		int element_81 = 1;
		int element_82 = 2;
		int element_77 = -1;
		int element_80 = 1;
		int element_83 = 4;
		int x = 3;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		right_116.element = element_165;
		right_116.left = left_166;
		right_116.right = right_167;
		right_167.element = element_189;
		right_167.left = left_190;
		right_167.right = right_191;
		right_191.element = element_201;
		right_191.left = left_202;
		right_191.right = right_203;
		obj.remove(x);
	}

	@Test
	public void test98() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_116 = new BinaryNode();
		BinaryNode right_167 = new BinaryNode();
		BinaryNode right_191 = new BinaryNode();
		BinaryNode right_203 = null;
		BinaryNode left_2 = null;
		BinaryNode left_115 = null;
		BinaryNode left_166 = null;
		BinaryNode left_190 = null;
		BinaryNode left_202 = null;
		int element_79 = 0;
		int element_189 = 2;
		int element_1 = -1;
		int element_165 = 1;
		int element_78 = 0;
		int element_114 = 0;
		int element_201 = 3;
		int element_76 = -1;
		int element_81 = 1;
		int element_82 = 2;
		int element_77 = -1;
		int element_80 = 1;
		int element_83 = 2;
		int element_84 = 3;
		int x = 4;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		right_116.element = element_165;
		right_116.left = left_166;
		right_116.right = right_167;
		right_167.element = element_189;
		right_167.left = left_190;
		right_167.right = right_191;
		right_191.element = element_201;
		right_191.left = left_202;
		right_191.right = right_203;
		obj.remove(x);
	}

	@Test
	public void test99() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_116 = new BinaryNode();
		BinaryNode right_167 = new BinaryNode();
		BinaryNode left_190 = null;
		BinaryNode right_191 = null;
		BinaryNode left_2 = null;
		BinaryNode left_115 = null;
		BinaryNode left_166 = null;
		int element_79 = 0;
		int element_189 = 2;
		int element_1 = -1;
		int element_165 = 1;
		int element_76 = -1;
		int element_114 = 0;
		int element_78 = 0;
		int element_77 = -1;
		int element_80 = 1;
		int x = 2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		right_116.element = element_165;
		right_116.left = left_166;
		right_116.right = right_167;
		right_167.element = element_189;
		right_167.left = left_190;
		right_167.right = right_191;
		obj.remove(x);
	}

	@Test
	public void test100() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_116 = new BinaryNode();
		BinaryNode right_167 = new BinaryNode();
		BinaryNode right_191 = new BinaryNode();
		BinaryNode left_190 = null;
		BinaryNode left_2 = null;
		BinaryNode left_115 = null;
		BinaryNode left_166 = null;
		BinaryNode left_202 = null;
		BinaryNode right_203 = null;
		int element_79 = 0;
		int element_189 = 2;
		int element_1 = -1;
		int element_165 = 1;
		int element_76 = -1;
		int element_114 = 0;
		int element_201 = 3;
		int element_78 = 0;
		int element_81 = 2;
		int element_82 = 3;
		int element_83 = 3;
		int element_77 = -1;
		int element_80 = 1;
		int x = 2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		right_116.element = element_165;
		right_116.left = left_166;
		right_116.right = right_167;
		right_167.element = element_189;
		right_167.left = left_190;
		right_167.right = right_191;
		right_191.element = element_201;
		right_191.left = left_202;
		right_191.right = right_203;
		obj.remove(x);
	}

	@Test
	public void test101() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_116 = new BinaryNode();
		BinaryNode right_167 = new BinaryNode();
		BinaryNode left_190 = new BinaryNode();
		BinaryNode right_191 = null;
		BinaryNode left_2 = null;
		BinaryNode left_115 = null;
		BinaryNode left_166 = null;
		BinaryNode left_193 = null;
		BinaryNode right_194 = null;
		int element_79 = 0;
		int element_189 = 3;
		int element_1 = -1;
		int element_165 = 1;
		int element_76 = -1;
		int element_114 = 0;
		int element_78 = 0;
		int element_82 = 2;
		int element_81 = 1;
		int element_83 = 2;
		int element_192 = 2;
		int element_77 = -1;
		int element_80 = 1;
		int element_84 = 3;
		int x = 3;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		right_116.element = element_165;
		right_116.left = left_166;
		right_116.right = right_167;
		right_167.element = element_189;
		right_167.left = left_190;
		right_167.right = right_191;
		left_190.element = element_192;
		left_190.left = left_193;
		left_190.right = right_194;
		obj.remove(x);
	}

	@Test
	public void test102() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_116 = new BinaryNode();
		BinaryNode left_166 = null;
		BinaryNode right_167 = null;
		BinaryNode left_2 = null;
		BinaryNode left_115 = null;
		int element_77 = -1;
		int element_1 = -1;
		int element_165 = 1;
		int element_76 = -1;
		int element_114 = 0;
		int element_78 = 0;
		int x = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		right_116.element = element_165;
		right_116.left = left_166;
		right_116.right = right_167;
		obj.remove(x);
	}

	@Test
	public void test103() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_116 = new BinaryNode();
		BinaryNode right_167 = new BinaryNode();
		BinaryNode left_166 = null;
		BinaryNode left_2 = null;
		BinaryNode left_115 = null;
		BinaryNode left_190 = null;
		BinaryNode right_191 = null;
		int element_79 = 1;
		int element_189 = 2;
		int element_1 = -1;
		int element_165 = 1;
		int element_76 = -1;
		int element_114 = 0;
		int element_78 = 0;
		int element_81 = 2;
		int element_77 = -1;
		int element_80 = 2;
		int x = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		right_116.element = element_165;
		right_116.left = left_166;
		right_116.right = right_167;
		right_167.element = element_189;
		right_167.left = left_190;
		right_167.right = right_191;
		obj.remove(x);
	}

	@Test
	public void test104() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_116 = new BinaryNode();
		BinaryNode left_166 = new BinaryNode();
		BinaryNode right_167 = null;
		BinaryNode left_2 = null;
		BinaryNode left_115 = null;
		BinaryNode left_169 = null;
		BinaryNode right_170 = null;
		int element_79 = 0;
		int element_168 = 1;
		int element_1 = -1;
		int element_165 = 2;
		int element_76 = -1;
		int element_114 = 0;
		int element_78 = 0;
		int element_82 = 2;
		int element_81 = 1;
		int element_77 = -1;
		int element_80 = 1;
		int x = 2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		right_116.element = element_165;
		right_116.left = left_166;
		right_116.right = right_167;
		left_166.element = element_168;
		left_166.left = left_169;
		left_166.right = right_170;
		obj.remove(x);
	}

	@Test
	public void test105() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_115 = null;
		BinaryNode right_116 = null;
		BinaryNode left_2 = null;
		int element_1 = -1;
		int element_76 = -1;
		int element_114 = 0;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		obj.remove(x);
	}

	@Test
	public void test106() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_116 = new BinaryNode();
		BinaryNode left_115 = null;
		BinaryNode left_2 = null;
		BinaryNode left_166 = null;
		BinaryNode right_167 = null;
		int element_77 = 0;
		int element_79 = 1;
		int element_1 = -1;
		int element_165 = 1;
		int element_114 = 0;
		int element_76 = -1;
		int x = 0;
		int element_78 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		right_116.element = element_165;
		right_116.left = left_166;
		right_116.right = right_167;
		obj.remove(x);
	}

	@Test
	public void test107() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_115 = new BinaryNode();
		BinaryNode right_116 = null;
		BinaryNode left_2 = null;
		BinaryNode left_118 = null;
		BinaryNode right_119 = null;
		int element_117 = 1;
		int element_79 = 1;
		int element_1 = 0;
		int element_76 = 0;
		int element_78 = 1;
		int element_114 = 2;
		int element_77 = 0;
		int element_80 = 2;
		int x = 2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		left_115.element = element_117;
		left_115.left = left_118;
		left_115.right = right_119;
		obj.remove(x);
	}

	@Test
	public void test108() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_115 = new BinaryNode();
		BinaryNode right_116 = new BinaryNode();
		BinaryNode left_166 = null;
		BinaryNode right_167 = null;
		BinaryNode left_2 = null;
		BinaryNode left_118 = null;
		BinaryNode right_119 = null;
		int element_117 = -1;
		int element_79 = -1;
		int element_1 = -2;
		int element_165 = 1;
		int element_76 = -2;
		int element_114 = 0;
		int element_78 = -1;
		int element_77 = -2;
		int element_80 = 0;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		left_115.element = element_117;
		left_115.left = left_118;
		left_115.right = right_119;
		right_116.element = element_165;
		right_116.left = left_166;
		right_116.right = right_167;
		obj.remove(x);
	}

	@Test
	public void test109() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_115 = new BinaryNode();
		BinaryNode right_116 = new BinaryNode();
		BinaryNode right_167 = new BinaryNode();
		BinaryNode left_166 = null;
		BinaryNode left_2 = null;
		BinaryNode left_118 = null;
		BinaryNode right_119 = null;
		BinaryNode left_190 = null;
		BinaryNode right_191 = null;
		int element_117 = -1;
		int element_79 = -1;
		int element_189 = 2;
		int element_1 = -2;
		int element_165 = 1;
		int element_76 = -2;
		int element_114 = 0;
		int element_78 = -1;
		int element_82 = 2;
		int element_81 = 1;
		int element_83 = 2;
		int element_77 = -2;
		int element_80 = 0;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		left_115.element = element_117;
		left_115.left = left_118;
		left_115.right = right_119;
		right_116.element = element_165;
		right_116.left = left_166;
		right_116.right = right_167;
		right_167.element = element_189;
		right_167.left = left_190;
		right_167.right = right_191;
		obj.remove(x);
	}

	@Test
	public void test110() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = null;
		BinaryNode right_3 = null;
		int element_1 = 0;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.remove(x);
	}

	@Test
	public void test111() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_2 = null;
		BinaryNode left_115 = null;
		BinaryNode right_116 = null;
		int element_77 = 0;
		int element_1 = -1;
		int element_76 = -1;
		int element_78 = 0;
		int element_114 = 0;
		int x = -1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		obj.remove(x);
	}

	@Test
	public void test112() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = null;
		BinaryNode left_7 = null;
		BinaryNode right_8 = null;
		int element_77 = -1;
		int element_1 = 0;
		int element_76 = -1;
		int element_78 = 0;
		int x = 0;
		int element_6 = -1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		obj.remove(x);
	}

	@Test
	public void test113() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_115 = null;
		BinaryNode right_116 = null;
		BinaryNode left_7 = null;
		BinaryNode right_8 = null;
		int element_77 = -1;
		int element_1 = 0;
		int element_76 = -1;
		int element_114 = 1;
		int element_78 = 0;
		int x = 0;
		int element_6 = -1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		obj.remove(x);
	}

	@Test
	public void test114() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_116 = new BinaryNode();
		BinaryNode left_115 = null;
		BinaryNode left_7 = null;
		BinaryNode right_8 = null;
		BinaryNode left_166 = null;
		BinaryNode right_167 = null;
		int element_79 = 0;
		int element_1 = -1;
		int element_78 = -1;
		int element_165 = 1;
		int element_114 = 0;
		int element_76 = -2;
		int element_6 = -2;
		int element_81 = 1;
		int element_77 = -2;
		int element_80 = 1;
		int x = -1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		right_116.element = element_165;
		right_116.left = left_166;
		right_116.right = right_167;
		obj.remove(x);
	}

	@Test
	public void test115() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_115 = new BinaryNode();
		BinaryNode left_118 = null;
		BinaryNode right_119 = null;
		BinaryNode left_7 = null;
		BinaryNode right_8 = null;
		BinaryNode right_116 = null;
		int element_117 = 1;
		int element_79 = 2;
		int element_1 = 0;
		int element_76 = -1;
		int element_78 = 0;
		int element_114 = 2;
		int element_6 = -1;
		int element_77 = -1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		left_115.element = element_117;
		left_115.left = left_118;
		left_115.right = right_119;
		obj.remove(x);
	}

	@Test
	public void test116() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_115 = new BinaryNode();
		BinaryNode right_119 = new BinaryNode();
		BinaryNode left_118 = null;
		BinaryNode left_7 = null;
		BinaryNode right_8 = null;
		BinaryNode right_116 = null;
		BinaryNode left_145 = null;
		BinaryNode right_146 = null;
		int element_117 = -2;
		int element_79 = 0;
		int element_1 = -3;
		int element_76 = -4;
		int element_78 = -3;
		int element_114 = 0;
		int element_82 = -1;
		int element_83 = 0;
		int element_144 = -1;
		int element_6 = -4;
		int element_81 = -1;
		int element_77 = -4;
		int element_80 = -2;
		int x = -3;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		right_3.element = element_114;
		right_3.left = left_115;
		right_3.right = right_116;
		left_115.element = element_117;
		left_115.left = left_118;
		left_115.right = right_119;
		right_119.element = element_144;
		right_119.left = left_145;
		right_119.right = right_146;
		obj.remove(x);
	}

}

