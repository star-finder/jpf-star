package gov.nasa.jpf.star.examples.bst;

import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class BinarySearchTree_remove1 extends TestJPF {

	@Test
	public void test_remove1() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = null;
		int x = 0;
		System.out.println(Utilities.repOK(obj));
		obj.remove(x);
	}

	@Test
	public void test_remove2() throws Exception {
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
		System.out.println(Utilities.repOK(obj));
		obj.remove(x);
	}

	@Test
	public void test_remove3() throws Exception {
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
		System.out.println(Utilities.repOK(obj));
		obj.remove(x);
	}

	@Test
	public void test_remove4() throws Exception {
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
		System.out.println(Utilities.repOK(obj));
		obj.remove(x);
	}

	@Test
	public void test_remove5() throws Exception {
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
		System.out.println(Utilities.repOK(obj));
		obj.remove(x);
	}

	@Test
	public void test_remove6() throws Exception {
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
		System.out.println(Utilities.repOK(obj));
		obj.remove(x);
	}

	@Test
	public void test_remove7() throws Exception {
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
		System.out.println(Utilities.repOK(obj));
		obj.remove(x);
	}

	@Test
	public void test_remove8() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_7 = new BinaryNode();
		BinaryNode right_11 = new BinaryNode();
		BinaryNode left_34 = null;
		BinaryNode right_3 = null;
		BinaryNode right_8 = null;
		BinaryNode left_10 = null;
		BinaryNode right_35 = null;
		int element_33 = -1;
		int element_79 = -3;
		int element_1 = 1;
		int element_76 = 1;
		int element_78 = 1;
		int element_81 = 0;
		int element_6 = 0;
		int element_77 = 0;
		int element_80 = -1;
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
		right_11.element = element_33;
		right_11.left = left_34;
		right_11.right = right_35;
		System.out.println(Utilities.repOK(obj));
		obj.remove(x);
	}

	@Test
	public void test_remove9() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_7 = new BinaryNode();
		BinaryNode right_11 = new BinaryNode();
		BinaryNode right_35 = null;
		BinaryNode right_3 = null;
		BinaryNode right_8 = null;
		BinaryNode left_10 = null;
		BinaryNode left_34 = null;
		int element_33 = -2;
		int element_79 = -3;
		int element_1 = 1;
		int element_76 = 1;
		int element_78 = 1;
		int element_81 = -2;
		int element_6 = 0;
		int element_77 = 0;
		int element_80 = -3;
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
		right_11.element = element_33;
		right_11.left = left_34;
		right_11.right = right_35;
		System.out.println(Utilities.repOK(obj));
		obj.remove(x);
	}

	@Test
	public void test_remove10() throws Exception {
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
		System.out.println(Utilities.repOK(obj));
		obj.remove(x);
	}

	@Test
	public void test_remove11() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_7 = new BinaryNode();
		BinaryNode right_11 = new BinaryNode();
		BinaryNode left_10 = null;
		BinaryNode right_3 = null;
		BinaryNode right_8 = null;
		BinaryNode left_34 = null;
		BinaryNode right_35 = null;
		int element_33 = -1;
		int element_79 = -2;
		int element_1 = 1;
		int element_76 = 1;
		int element_78 = 1;
		int element_82 = 0;
		int element_81 = -1;
		int element_6 = 0;
		int element_77 = 0;
		int element_80 = -1;
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
		right_11.element = element_33;
		right_11.left = left_34;
		right_11.right = right_35;
		System.out.println(Utilities.repOK(obj));
		obj.remove(x);
	}

	@Test
	public void test_remove12() throws Exception {
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
		System.out.println(Utilities.repOK(obj));
		obj.remove(x);
	}

	@Test
	public void test_remove13() throws Exception {
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
		System.out.println(Utilities.repOK(obj));
		obj.remove(x);
	}

	@Test
	public void test_remove14() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_8 = new BinaryNode();
		BinaryNode left_55 = null;
		BinaryNode right_3 = null;
		BinaryNode left_7 = null;
		BinaryNode right_56 = null;
		int element_77 = -1;
		int element_79 = 2;
		int element_1 = 2;
		int element_76 = 2;
		int element_78 = 1;
		int x = 0;
		int element_54 = 1;
		int element_6 = -1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		right_8.element = element_54;
		right_8.left = left_55;
		right_8.right = right_56;
		System.out.println(Utilities.repOK(obj));
		obj.remove(x);
	}

	@Test
	public void test_remove15() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_8 = new BinaryNode();
		BinaryNode left_55 = new BinaryNode();
		BinaryNode left_58 = null;
		BinaryNode right_3 = null;
		BinaryNode left_7 = null;
		BinaryNode right_56 = null;
		BinaryNode right_59 = null;
		int element_79 = 3;
		int element_1 = 3;
		int element_76 = 3;
		int element_57 = 1;
		int element_78 = 2;
		int element_54 = 2;
		int element_81 = 2;
		int element_6 = -1;
		int element_77 = -1;
		int element_80 = 1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		right_8.element = element_54;
		right_8.left = left_55;
		right_8.right = right_56;
		left_55.element = element_57;
		left_55.left = left_58;
		left_55.right = right_59;
		System.out.println(Utilities.repOK(obj));
		obj.remove(x);
	}

	@Test
	public void test_remove16() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_8 = new BinaryNode();
		BinaryNode left_55 = new BinaryNode();
		BinaryNode right_59 = null;
		BinaryNode right_3 = null;
		BinaryNode left_7 = null;
		BinaryNode right_56 = null;
		BinaryNode left_58 = null;
		int element_79 = 2;
		int element_1 = 2;
		int element_76 = 2;
		int element_57 = -1;
		int element_78 = 1;
		int element_54 = 1;
		int element_81 = -1;
		int element_6 = -2;
		int element_77 = -2;
		int element_80 = -2;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		right_8.element = element_54;
		right_8.left = left_55;
		right_8.right = right_56;
		left_55.element = element_57;
		left_55.left = left_58;
		left_55.right = right_59;
		System.out.println(Utilities.repOK(obj));
		obj.remove(x);
	}

	@Test
	public void test_remove17() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_8 = new BinaryNode();
		BinaryNode right_56 = null;
		BinaryNode right_3 = null;
		BinaryNode left_7 = null;
		BinaryNode left_55 = null;
		int element_6 = -2;
		int element_77 = -2;
		int element_79 = -1;
		int element_1 = 1;
		int element_76 = 1;
		int element_78 = -2;
		int x = 0;
		int element_54 = -1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		right_8.element = element_54;
		right_8.left = left_55;
		right_8.right = right_56;
		System.out.println(Utilities.repOK(obj));
		obj.remove(x);
	}

	@Test
	public void test_remove18() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_8 = new BinaryNode();
		BinaryNode left_55 = null;
		BinaryNode right_56 = null;
		BinaryNode right_3 = null;
		BinaryNode left_7 = null;
		int element_6 = -1;
		int element_77 = -1;
		int element_1 = 1;
		int element_76 = 1;
		int x = 0;
		int element_54 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		right_8.element = element_54;
		right_8.left = left_55;
		right_8.right = right_56;
		System.out.println(Utilities.repOK(obj));
		obj.remove(x);
	}

	@Test
	public void test_remove19() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_8 = new BinaryNode();
		BinaryNode left_55 = new BinaryNode();
		BinaryNode right_56 = null;
		BinaryNode right_3 = null;
		BinaryNode left_7 = null;
		BinaryNode left_58 = null;
		BinaryNode right_59 = null;
		int element_79 = -1;
		int element_1 = 1;
		int element_76 = 1;
		int element_57 = -1;
		int element_78 = -2;
		int element_54 = 0;
		int element_81 = 0;
		int element_6 = -2;
		int element_77 = -2;
		int element_80 = -1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		right_8.element = element_54;
		right_8.left = left_55;
		right_8.right = right_56;
		left_55.element = element_57;
		left_55.left = left_58;
		left_55.right = right_59;
		System.out.println(Utilities.repOK(obj));
		obj.remove(x);
	}

	@Test
	public void test_remove20() throws Exception {
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
		System.out.println(Utilities.repOK(obj));
		obj.remove(x);
	}

	@Test
	public void test_remove21() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_8 = new BinaryNode();
		BinaryNode left_7 = null;
		BinaryNode right_3 = null;
		BinaryNode left_55 = null;
		BinaryNode right_56 = null;
		int element_79 = -1;
		int element_1 = 0;
		int element_76 = 0;
		int element_78 = -1;
		int element_54 = -1;
		int element_6 = -2;
		int element_77 = -2;
		int element_80 = 0;
		int x = -2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		right_8.element = element_54;
		right_8.left = left_55;
		right_8.right = right_56;
		System.out.println(Utilities.repOK(obj));
		obj.remove(x);
	}

	@Test
	public void test_remove22() throws Exception {
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
		System.out.println(Utilities.repOK(obj));
		obj.remove(x);
	}

	@Test
	public void test_remove23() throws Exception {
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
		System.out.println(Utilities.repOK(obj));
		obj.remove(x);
	}

	@Test
	public void test_remove24() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_82 = null;
		BinaryNode left_2 = null;
		BinaryNode right_83 = null;
		int element_77 = 1;
		int element_1 = -1;
		int element_76 = -1;
		int x = 0;
		int element_81 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_81;
		right_3.left = left_82;
		right_3.right = right_83;
		System.out.println(Utilities.repOK(obj));
		obj.remove(x);
	}

	@Test
	public void test_remove25() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_82 = new BinaryNode();
		BinaryNode left_85 = null;
		BinaryNode left_2 = null;
		BinaryNode right_83 = null;
		BinaryNode right_86 = null;
		int element_84 = 1;
		int element_77 = 2;
		int element_79 = 2;
		int element_1 = -1;
		int element_76 = -1;
		int element_78 = 1;
		int x = 0;
		int element_81 = 2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_81;
		right_3.left = left_82;
		right_3.right = right_83;
		left_82.element = element_84;
		left_82.left = left_85;
		left_82.right = right_86;
		System.out.println(Utilities.repOK(obj));
		obj.remove(x);
	}

	@Test
	public void test_remove26() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_82 = new BinaryNode();
		BinaryNode right_86 = null;
		BinaryNode left_2 = null;
		BinaryNode right_83 = null;
		BinaryNode left_85 = null;
		int element_84 = -1;
		int element_77 = 1;
		int element_79 = -1;
		int element_1 = -2;
		int element_76 = -2;
		int element_78 = -2;
		int x = 0;
		int element_81 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_81;
		right_3.left = left_82;
		right_3.right = right_83;
		left_82.element = element_84;
		left_82.left = left_85;
		left_82.right = right_86;
		System.out.println(Utilities.repOK(obj));
		obj.remove(x);
	}

	@Test
	public void test_remove27() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_82 = new BinaryNode();
		BinaryNode left_85 = null;
		BinaryNode right_86 = null;
		BinaryNode left_2 = null;
		BinaryNode right_83 = null;
		int element_84 = 0;
		int element_77 = 1;
		int element_1 = -1;
		int element_76 = -1;
		int x = 0;
		int element_81 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_81;
		right_3.left = left_82;
		right_3.right = right_83;
		left_82.element = element_84;
		left_82.left = left_85;
		left_82.right = right_86;
		System.out.println(Utilities.repOK(obj));
		obj.remove(x);
	}

	@Test
	public void test_remove28() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_82 = new BinaryNode();
		BinaryNode right_86 = new BinaryNode();
		BinaryNode left_85 = null;
		BinaryNode left_2 = null;
		BinaryNode right_83 = null;
		BinaryNode left_91 = null;
		BinaryNode right_92 = null;
		int element_79 = 1;
		int element_1 = -1;
		int element_76 = -1;
		int element_78 = 0;
		int element_90 = 1;
		int element_81 = 2;
		int element_84 = 0;
		int element_77 = 2;
		int element_80 = 1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_81;
		right_3.left = left_82;
		right_3.right = right_83;
		left_82.element = element_84;
		left_82.left = left_85;
		left_82.right = right_86;
		right_86.element = element_90;
		right_86.left = left_91;
		right_86.right = right_92;
		System.out.println(Utilities.repOK(obj));
		obj.remove(x);
	}

	@Test
	public void test_remove29() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_83 = null;
		BinaryNode left_2 = null;
		BinaryNode left_82 = null;
		int element_77 = -2;
		int element_1 = -2;
		int element_76 = -2;
		int element_78 = -1;
		int x = 0;
		int element_81 = -1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_81;
		right_3.left = left_82;
		right_3.right = right_83;
		System.out.println(Utilities.repOK(obj));
		obj.remove(x);
	}

	@Test
	public void test_remove30() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_82 = null;
		BinaryNode right_83 = null;
		BinaryNode left_2 = null;
		int element_1 = -1;
		int element_76 = -1;
		int x = 0;
		int element_81 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_81;
		right_3.left = left_82;
		right_3.right = right_83;
		System.out.println(Utilities.repOK(obj));
		obj.remove(x);
	}

	@Test
	public void test_remove31() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_83 = new BinaryNode();
		BinaryNode left_82 = null;
		BinaryNode left_2 = null;
		BinaryNode left_94 = null;
		BinaryNode right_95 = null;
		int element_77 = 0;
		int element_79 = 1;
		int element_1 = -1;
		int element_76 = -1;
		int element_78 = 1;
		int x = 0;
		int element_81 = 0;
		int element_93 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_81;
		right_3.left = left_82;
		right_3.right = right_83;
		right_83.element = element_93;
		right_83.left = left_94;
		right_83.right = right_95;
		System.out.println(Utilities.repOK(obj));
		obj.remove(x);
	}

	@Test
	public void test_remove32() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_82 = new BinaryNode();
		BinaryNode right_83 = null;
		BinaryNode left_2 = null;
		BinaryNode left_85 = null;
		BinaryNode right_86 = null;
		int element_79 = 1;
		int element_1 = 0;
		int element_76 = 0;
		int element_78 = 1;
		int element_81 = 2;
		int element_84 = 1;
		int element_77 = 0;
		int element_80 = 2;
		int x = 2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_81;
		right_3.left = left_82;
		right_3.right = right_83;
		left_82.element = element_84;
		left_82.left = left_85;
		left_82.right = right_86;
		System.out.println(Utilities.repOK(obj));
		obj.remove(x);
	}

	@Test
	public void test_remove33() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = null;
		BinaryNode right_3 = null;
		int element_1 = 0;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		System.out.println(Utilities.repOK(obj));
		obj.remove(x);
	}

	@Test
	public void test_remove34() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_2 = null;
		BinaryNode left_82 = null;
		BinaryNode right_83 = null;
		int element_77 = 0;
		int element_1 = -1;
		int element_76 = -1;
		int element_78 = 0;
		int x = -1;
		int element_81 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_81;
		right_3.left = left_82;
		right_3.right = right_83;
		System.out.println(Utilities.repOK(obj));
		obj.remove(x);
	}

	@Test
	public void test_remove35() throws Exception {
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
		System.out.println(Utilities.repOK(obj));
		obj.remove(x);
	}

	@Test
	public void test_remove36() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_82 = null;
		BinaryNode right_83 = null;
		BinaryNode left_7 = null;
		BinaryNode right_8 = null;
		int element_6 = -1;
		int element_77 = -1;
		int element_1 = 0;
		int element_76 = -1;
		int element_78 = 0;
		int x = 0;
		int element_81 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		right_3.element = element_81;
		right_3.left = left_82;
		right_3.right = right_83;
		System.out.println(Utilities.repOK(obj));
		obj.remove(x);
	}

}

