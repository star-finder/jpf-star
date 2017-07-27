package gov.nasa.jpf.star.examples.bst;

import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class BinarySearchTree_repOK1 extends TestJPF {

	@Test
	public void test_repOK1() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = null;
		obj.root = t;
		System.out.println(1 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK2() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = t;
		int element_1 = 0;
		BinaryNode right_3 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		System.out.println(2 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK3() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode right_3 = t;
		int element_1 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		System.out.println(3 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK4() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode right_3 = left_2;
		int element_1 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		System.out.println(4 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK5() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode right_3 = null;
		int element_1 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		System.out.println(5 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK6() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = t;
		int element_1 = -1;
		int element_4 = 0;
		BinaryNode right_6 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		System.out.println(6 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK7() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		BinaryNode right_6 = t;
		int element_1 = 0;
		int element_4 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		System.out.println(7 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK8() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		BinaryNode right_6 = left_2;
		int element_1 = -1;
		int element_4 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		System.out.println(8 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK9() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		BinaryNode right_6 = right_3;
		int element_4 = 0;
		int element_1 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		System.out.println(9 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK10() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		BinaryNode right_6 = left_5;
		int element_1 = -1;
		int element_4 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		System.out.println(10 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK11() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		BinaryNode right_6 = null;
		int element_1 = -1;
		int element_4 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		System.out.println(11 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK12() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		BinaryNode left_8 = t;
		int element_4 = 0;
		int element_1 = -1;
		int element_7 = 1;
		BinaryNode right_9 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_7;
		right_6.left = left_8;
		right_6.right = right_9;
		System.out.println(12 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK13() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		BinaryNode left_8 = left_2;
		BinaryNode right_9 = t;
		int element_4 = 0;
		int element_1 = -1;
		int element_7 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_7;
		right_6.left = left_8;
		right_6.right = right_9;
		System.out.println(13 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK14() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		BinaryNode left_8 = left_2;
		BinaryNode right_9 = left_2;
		int element_4 = 0;
		int element_1 = -1;
		int element_7 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_7;
		right_6.left = left_8;
		right_6.right = right_9;
		System.out.println(14 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK15() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		BinaryNode left_8 = left_2;
		BinaryNode right_9 = right_3;
		int element_4 = 0;
		int element_1 = -1;
		int element_7 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_7;
		right_6.left = left_8;
		right_6.right = right_9;
		System.out.println(15 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK16() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		BinaryNode left_8 = left_2;
		BinaryNode right_9 = left_5;
		int element_4 = 0;
		int element_1 = -1;
		int element_7 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_7;
		right_6.left = left_8;
		right_6.right = right_9;
		System.out.println(16 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK17() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		BinaryNode left_8 = left_2;
		BinaryNode right_9 = right_6;
		int element_4 = 0;
		int element_1 = -1;
		int element_7 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_7;
		right_6.left = left_8;
		right_6.right = right_9;
		System.out.println(17 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK18() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		BinaryNode left_8 = left_2;
		BinaryNode right_9 = left_8;
		int element_4 = 0;
		int element_1 = -1;
		int element_7 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_7;
		right_6.left = left_8;
		right_6.right = right_9;
		System.out.println(18 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK19() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		BinaryNode left_8 = left_2;
		BinaryNode right_9 = null;
		int element_4 = 0;
		int element_1 = -1;
		int element_7 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_7;
		right_6.left = left_8;
		right_6.right = right_9;
		System.out.println(19 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK20() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		BinaryNode right_9 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		BinaryNode left_8 = left_2;
		int element_10 = 0;
		int element_4 = -1;
		int element_1 = -2;
		int element_7 = 0;
		BinaryNode left_11 = null;
		BinaryNode right_12 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_7;
		right_6.left = left_8;
		right_6.right = right_9;
		right_9.element = element_10;
		right_9.left = left_11;
		right_9.right = right_12;
		System.out.println(20 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK21() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		BinaryNode left_8 = right_3;
		int element_4 = 0;
		int element_1 = -1;
		int element_7 = 1;
		BinaryNode right_9 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_7;
		right_6.left = left_8;
		right_6.right = right_9;
		System.out.println(21 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK22() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		BinaryNode left_8 = left_5;
		BinaryNode right_9 = t;
		int element_4 = 0;
		int element_1 = -1;
		int element_7 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_7;
		right_6.left = left_8;
		right_6.right = right_9;
		System.out.println(22 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK23() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		BinaryNode left_8 = left_5;
		BinaryNode right_9 = left_2;
		int element_4 = 0;
		int element_1 = -1;
		int element_7 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_7;
		right_6.left = left_8;
		right_6.right = right_9;
		System.out.println(23 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK24() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		BinaryNode left_8 = left_5;
		BinaryNode right_9 = right_3;
		int element_4 = 0;
		int element_1 = -1;
		int element_7 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_7;
		right_6.left = left_8;
		right_6.right = right_9;
		System.out.println(24 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK25() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		BinaryNode left_8 = left_5;
		BinaryNode right_9 = left_5;
		int element_4 = 0;
		int element_1 = -1;
		int element_7 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_7;
		right_6.left = left_8;
		right_6.right = right_9;
		System.out.println(25 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK26() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		BinaryNode left_8 = left_5;
		BinaryNode right_9 = right_6;
		int element_4 = 0;
		int element_1 = -1;
		int element_7 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_7;
		right_6.left = left_8;
		right_6.right = right_9;
		System.out.println(26 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK27() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		BinaryNode left_8 = left_5;
		BinaryNode right_9 = left_8;
		int element_4 = 0;
		int element_1 = -1;
		int element_7 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_7;
		right_6.left = left_8;
		right_6.right = right_9;
		System.out.println(27 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK28() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		BinaryNode left_8 = left_5;
		BinaryNode right_9 = null;
		int element_4 = 0;
		int element_1 = -1;
		int element_7 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_7;
		right_6.left = left_8;
		right_6.right = right_9;
		System.out.println(28 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK29() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		BinaryNode right_9 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		BinaryNode left_8 = left_5;
		int element_4 = -1;
		int element_16 = 0;
		int element_1 = -2;
		int element_7 = 0;
		BinaryNode left_17 = null;
		BinaryNode right_18 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_7;
		right_6.left = left_8;
		right_6.right = right_9;
		right_9.element = element_16;
		right_9.left = left_17;
		right_9.right = right_18;
		System.out.println(29 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK30() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		BinaryNode left_8 = right_6;
		int element_4 = 0;
		int element_1 = -1;
		int element_7 = 1;
		BinaryNode right_9 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_7;
		right_6.left = left_8;
		right_6.right = right_9;
		System.out.println(30 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK31() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		BinaryNode left_8 = null;
		BinaryNode right_9 = t;
		int element_4 = 0;
		int element_1 = -1;
		int element_7 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_7;
		right_6.left = left_8;
		right_6.right = right_9;
		System.out.println(31 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK32() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		BinaryNode left_8 = null;
		BinaryNode right_9 = left_2;
		int element_4 = 0;
		int element_1 = -1;
		int element_7 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_7;
		right_6.left = left_8;
		right_6.right = right_9;
		System.out.println(32 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK33() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		BinaryNode left_8 = null;
		BinaryNode right_9 = right_3;
		int element_4 = 0;
		int element_1 = -1;
		int element_7 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_7;
		right_6.left = left_8;
		right_6.right = right_9;
		System.out.println(33 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK34() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		BinaryNode left_8 = null;
		BinaryNode right_9 = left_5;
		int element_4 = 0;
		int element_1 = -1;
		int element_7 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_7;
		right_6.left = left_8;
		right_6.right = right_9;
		System.out.println(34 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK35() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		BinaryNode left_8 = null;
		BinaryNode right_9 = right_6;
		int element_4 = 0;
		int element_1 = -1;
		int element_7 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_7;
		right_6.left = left_8;
		right_6.right = right_9;
		System.out.println(35 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK36() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		BinaryNode left_8 = null;
		BinaryNode right_9 = left_8;
		int element_4 = 0;
		int element_1 = -1;
		int element_7 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_7;
		right_6.left = left_8;
		right_6.right = right_9;
		System.out.println(36 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK37() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		BinaryNode left_8 = null;
		BinaryNode right_9 = null;
		int element_4 = 0;
		int element_1 = -1;
		int element_7 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_7;
		right_6.left = left_8;
		right_6.right = right_9;
		System.out.println(37 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK38() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		BinaryNode right_9 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		BinaryNode left_8 = null;
		int element_4 = -1;
		int element_1 = -2;
		int element_7 = 0;
		int element_22 = 0;
		BinaryNode left_23 = null;
		BinaryNode right_24 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_7;
		right_6.left = left_8;
		right_6.right = right_9;
		right_9.element = element_22;
		right_9.left = left_23;
		right_9.right = right_24;
		System.out.println(38 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK39() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		BinaryNode left_8 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		BinaryNode left_29 = t;
		int element_4 = 0;
		int element_1 = -1;
		int element_7 = 2;
		int element_28 = 1;
		BinaryNode right_9 = null;
		BinaryNode right_30 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_7;
		right_6.left = left_8;
		right_6.right = right_9;
		left_8.element = element_28;
		left_8.left = left_29;
		left_8.right = right_30;
		System.out.println(39 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK40() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		BinaryNode left_8 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		BinaryNode left_29 = right_3;
		int element_4 = 0;
		int element_1 = -1;
		int element_7 = 2;
		int element_28 = 1;
		BinaryNode right_9 = null;
		BinaryNode right_30 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_7;
		right_6.left = left_8;
		right_6.right = right_9;
		left_8.element = element_28;
		left_8.left = left_29;
		left_8.right = right_30;
		System.out.println(40 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK41() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		BinaryNode left_8 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		BinaryNode left_29 = right_6;
		int element_4 = 0;
		int element_1 = -1;
		int element_7 = 2;
		int element_28 = 1;
		BinaryNode right_9 = null;
		BinaryNode right_30 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_7;
		right_6.left = left_8;
		right_6.right = right_9;
		left_8.element = element_28;
		left_8.left = left_29;
		left_8.right = right_30;
		System.out.println(41 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK42() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		BinaryNode left_8 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		BinaryNode left_29 = left_8;
		int element_4 = 0;
		int element_1 = -1;
		int element_7 = 2;
		int element_28 = 1;
		BinaryNode right_9 = null;
		BinaryNode right_30 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_7;
		right_6.left = left_8;
		right_6.right = right_9;
		left_8.element = element_28;
		left_8.left = left_29;
		left_8.right = right_30;
		System.out.println(42 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK43() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		BinaryNode left_8 = new BinaryNode();
		BinaryNode left_29 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		int element_40 = 0;
		int element_4 = 0;
		int element_1 = -1;
		int element_7 = 2;
		int element_28 = 1;
		BinaryNode right_9 = null;
		BinaryNode right_30 = null;
		BinaryNode left_41 = null;
		BinaryNode right_42 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_7;
		right_6.left = left_8;
		right_6.right = right_9;
		left_8.element = element_28;
		left_8.left = left_29;
		left_8.right = right_30;
		left_29.element = element_40;
		left_29.left = left_41;
		left_29.right = right_42;
		System.out.println(43 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK44() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		BinaryNode left_8 = new BinaryNode();
		BinaryNode left_29 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		int element_40 = 0;
		int element_4 = -1;
		int element_1 = -2;
		int element_7 = 1;
		int element_28 = 0;
		BinaryNode right_9 = null;
		BinaryNode right_30 = null;
		BinaryNode left_41 = null;
		BinaryNode right_42 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_7;
		right_6.left = left_8;
		right_6.right = right_9;
		left_8.element = element_28;
		left_8.left = left_29;
		left_8.right = right_30;
		left_29.element = element_40;
		left_29.left = left_41;
		left_29.right = right_42;
		System.out.println(44 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK45() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		BinaryNode left_8 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		int element_4 = 0;
		int element_1 = -1;
		int element_7 = 1;
		int element_28 = 0;
		BinaryNode right_9 = null;
		BinaryNode left_29 = null;
		BinaryNode right_30 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_7;
		right_6.left = left_8;
		right_6.right = right_9;
		left_8.element = element_28;
		left_8.left = left_29;
		left_8.right = right_30;
		System.out.println(45 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK46() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		BinaryNode left_8 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		int element_4 = -1;
		int element_1 = -2;
		int element_7 = 0;
		int element_28 = 0;
		BinaryNode right_9 = null;
		BinaryNode left_29 = null;
		BinaryNode right_30 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_7;
		right_6.left = left_8;
		right_6.right = right_9;
		left_8.element = element_28;
		left_8.left = left_29;
		left_8.right = right_30;
		System.out.println(46 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK47() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = left_2;
		int element_1 = -1;
		int element_7 = 0;
		int element_4 = 0;
		BinaryNode left_8 = null;
		BinaryNode right_9 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_7;
		right_6.left = left_8;
		right_6.right = right_9;
		System.out.println(47 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK48() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = right_3;
		int element_1 = -1;
		int element_4 = 0;
		BinaryNode right_6 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		System.out.println(48 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK49() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode right_6 = t;
		int element_1 = -1;
		int element_4 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		System.out.println(49 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK50() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode right_6 = left_2;
		int element_1 = -1;
		int element_4 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		System.out.println(50 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK51() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode right_6 = right_3;
		int element_4 = 1;
		int element_1 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		System.out.println(51 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK52() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode right_6 = left_5;
		int element_1 = -1;
		int element_4 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		System.out.println(52 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK53() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode right_6 = null;
		int element_1 = -1;
		int element_4 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		System.out.println(53 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK54() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode left_47 = t;
		int element_4 = 0;
		int element_46 = 1;
		int element_1 = -1;
		BinaryNode right_48 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_46;
		right_6.left = left_47;
		right_6.right = right_48;
		System.out.println(54 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK55() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode left_47 = left_2;
		BinaryNode right_48 = t;
		int element_4 = 0;
		int element_46 = 1;
		int element_1 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_46;
		right_6.left = left_47;
		right_6.right = right_48;
		System.out.println(55 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK56() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode left_47 = left_2;
		BinaryNode right_48 = left_2;
		int element_4 = 0;
		int element_46 = 1;
		int element_1 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_46;
		right_6.left = left_47;
		right_6.right = right_48;
		System.out.println(56 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK57() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode left_47 = left_2;
		BinaryNode right_48 = right_3;
		int element_4 = 0;
		int element_46 = 1;
		int element_1 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_46;
		right_6.left = left_47;
		right_6.right = right_48;
		System.out.println(57 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK58() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode left_47 = left_2;
		BinaryNode right_48 = left_5;
		int element_4 = 0;
		int element_46 = 1;
		int element_1 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_46;
		right_6.left = left_47;
		right_6.right = right_48;
		System.out.println(58 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK59() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode left_47 = left_2;
		BinaryNode right_48 = right_6;
		int element_4 = 0;
		int element_46 = 1;
		int element_1 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_46;
		right_6.left = left_47;
		right_6.right = right_48;
		System.out.println(59 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK60() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode left_47 = left_2;
		BinaryNode right_48 = left_47;
		int element_4 = 0;
		int element_46 = 1;
		int element_1 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_46;
		right_6.left = left_47;
		right_6.right = right_48;
		System.out.println(60 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK61() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode left_47 = left_2;
		BinaryNode right_48 = null;
		int element_4 = 0;
		int element_46 = 1;
		int element_1 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_46;
		right_6.left = left_47;
		right_6.right = right_48;
		System.out.println(61 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK62() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		BinaryNode right_48 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode left_47 = left_2;
		int element_4 = -1;
		int element_46 = 0;
		int element_1 = -2;
		int element_49 = 0;
		BinaryNode left_50 = null;
		BinaryNode right_51 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_46;
		right_6.left = left_47;
		right_6.right = right_48;
		right_48.element = element_49;
		right_48.left = left_50;
		right_48.right = right_51;
		System.out.println(62 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK63() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode left_47 = right_3;
		int element_4 = 0;
		int element_46 = 1;
		int element_1 = -1;
		BinaryNode right_48 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_46;
		right_6.left = left_47;
		right_6.right = right_48;
		System.out.println(63 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK64() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode left_47 = left_5;
		BinaryNode right_48 = t;
		int element_4 = 0;
		int element_46 = 1;
		int element_1 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_46;
		right_6.left = left_47;
		right_6.right = right_48;
		System.out.println(64 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK65() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode left_47 = left_5;
		BinaryNode right_48 = left_2;
		int element_4 = 0;
		int element_46 = 1;
		int element_1 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_46;
		right_6.left = left_47;
		right_6.right = right_48;
		System.out.println(65 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK66() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode left_47 = left_5;
		BinaryNode right_48 = right_3;
		int element_4 = 0;
		int element_46 = 1;
		int element_1 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_46;
		right_6.left = left_47;
		right_6.right = right_48;
		System.out.println(66 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK67() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode left_47 = left_5;
		BinaryNode right_48 = left_5;
		int element_4 = 0;
		int element_46 = 1;
		int element_1 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_46;
		right_6.left = left_47;
		right_6.right = right_48;
		System.out.println(67 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK68() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode left_47 = left_5;
		BinaryNode right_48 = right_6;
		int element_4 = 0;
		int element_46 = 1;
		int element_1 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_46;
		right_6.left = left_47;
		right_6.right = right_48;
		System.out.println(68 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK69() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode left_47 = left_5;
		BinaryNode right_48 = left_47;
		int element_4 = 0;
		int element_46 = 1;
		int element_1 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_46;
		right_6.left = left_47;
		right_6.right = right_48;
		System.out.println(69 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK70() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode left_47 = left_5;
		BinaryNode right_48 = null;
		int element_4 = 0;
		int element_46 = 1;
		int element_1 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_46;
		right_6.left = left_47;
		right_6.right = right_48;
		System.out.println(70 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK71() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		BinaryNode right_48 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode left_47 = left_5;
		int element_55 = 0;
		int element_4 = -1;
		int element_46 = 0;
		int element_1 = -2;
		BinaryNode left_56 = null;
		BinaryNode right_57 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_46;
		right_6.left = left_47;
		right_6.right = right_48;
		right_48.element = element_55;
		right_48.left = left_56;
		right_48.right = right_57;
		System.out.println(71 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK72() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode left_47 = right_6;
		int element_4 = 0;
		int element_46 = 1;
		int element_1 = -1;
		BinaryNode right_48 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_46;
		right_6.left = left_47;
		right_6.right = right_48;
		System.out.println(72 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK73() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode left_47 = null;
		BinaryNode right_48 = t;
		int element_4 = 0;
		int element_46 = 1;
		int element_1 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_46;
		right_6.left = left_47;
		right_6.right = right_48;
		System.out.println(73 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK74() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode left_47 = null;
		BinaryNode right_48 = left_2;
		int element_4 = 0;
		int element_46 = 1;
		int element_1 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_46;
		right_6.left = left_47;
		right_6.right = right_48;
		System.out.println(74 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK75() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode left_47 = null;
		BinaryNode right_48 = right_3;
		int element_4 = 0;
		int element_46 = 1;
		int element_1 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_46;
		right_6.left = left_47;
		right_6.right = right_48;
		System.out.println(75 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK76() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode left_47 = null;
		BinaryNode right_48 = left_5;
		int element_4 = 0;
		int element_46 = 1;
		int element_1 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_46;
		right_6.left = left_47;
		right_6.right = right_48;
		System.out.println(76 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK77() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode left_47 = null;
		BinaryNode right_48 = right_6;
		int element_4 = 0;
		int element_46 = 1;
		int element_1 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_46;
		right_6.left = left_47;
		right_6.right = right_48;
		System.out.println(77 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK78() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode left_47 = null;
		BinaryNode right_48 = left_47;
		int element_4 = 0;
		int element_46 = 1;
		int element_1 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_46;
		right_6.left = left_47;
		right_6.right = right_48;
		System.out.println(78 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK79() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode left_47 = null;
		BinaryNode right_48 = null;
		int element_4 = 0;
		int element_46 = 1;
		int element_1 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_46;
		right_6.left = left_47;
		right_6.right = right_48;
		System.out.println(79 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK80() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		BinaryNode right_48 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode left_47 = null;
		int element_4 = -1;
		int element_46 = 0;
		int element_1 = -2;
		int element_61 = 0;
		BinaryNode left_62 = null;
		BinaryNode right_63 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_46;
		right_6.left = left_47;
		right_6.right = right_48;
		right_48.element = element_61;
		right_48.left = left_62;
		right_48.right = right_63;
		System.out.println(80 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK81() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		BinaryNode left_47 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode left_68 = t;
		int element_67 = 1;
		int element_4 = 0;
		int element_46 = 2;
		int element_1 = -1;
		BinaryNode right_48 = null;
		BinaryNode right_69 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_46;
		right_6.left = left_47;
		right_6.right = right_48;
		left_47.element = element_67;
		left_47.left = left_68;
		left_47.right = right_69;
		System.out.println(81 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK82() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		BinaryNode left_47 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode left_68 = right_3;
		int element_67 = 1;
		int element_4 = 0;
		int element_46 = 2;
		int element_1 = -1;
		BinaryNode right_48 = null;
		BinaryNode right_69 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_46;
		right_6.left = left_47;
		right_6.right = right_48;
		left_47.element = element_67;
		left_47.left = left_68;
		left_47.right = right_69;
		System.out.println(82 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK83() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		BinaryNode left_47 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode left_68 = right_6;
		int element_67 = 1;
		int element_4 = 0;
		int element_46 = 2;
		int element_1 = -1;
		BinaryNode right_48 = null;
		BinaryNode right_69 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_46;
		right_6.left = left_47;
		right_6.right = right_48;
		left_47.element = element_67;
		left_47.left = left_68;
		left_47.right = right_69;
		System.out.println(83 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK84() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		BinaryNode left_47 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode left_68 = left_47;
		int element_67 = 1;
		int element_4 = 0;
		int element_46 = 2;
		int element_1 = -1;
		BinaryNode right_48 = null;
		BinaryNode right_69 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_46;
		right_6.left = left_47;
		right_6.right = right_48;
		left_47.element = element_67;
		left_47.left = left_68;
		left_47.right = right_69;
		System.out.println(84 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK85() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		BinaryNode left_47 = new BinaryNode();
		BinaryNode left_68 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		int element_67 = 1;
		int element_79 = 0;
		int element_4 = 0;
		int element_46 = 2;
		int element_1 = -1;
		BinaryNode right_48 = null;
		BinaryNode right_69 = null;
		BinaryNode left_80 = null;
		BinaryNode right_81 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_46;
		right_6.left = left_47;
		right_6.right = right_48;
		left_47.element = element_67;
		left_47.left = left_68;
		left_47.right = right_69;
		left_68.element = element_79;
		left_68.left = left_80;
		left_68.right = right_81;
		System.out.println(85 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK86() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		BinaryNode left_47 = new BinaryNode();
		BinaryNode left_68 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		int element_67 = 0;
		int element_79 = 0;
		int element_4 = -1;
		int element_46 = 1;
		int element_1 = -2;
		BinaryNode right_48 = null;
		BinaryNode right_69 = null;
		BinaryNode left_80 = null;
		BinaryNode right_81 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_46;
		right_6.left = left_47;
		right_6.right = right_48;
		left_47.element = element_67;
		left_47.left = left_68;
		left_47.right = right_69;
		left_68.element = element_79;
		left_68.left = left_80;
		left_68.right = right_81;
		System.out.println(86 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK87() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		BinaryNode left_47 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		int element_67 = 0;
		int element_4 = 0;
		int element_46 = 1;
		int element_1 = -1;
		BinaryNode right_48 = null;
		BinaryNode left_68 = null;
		BinaryNode right_69 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_46;
		right_6.left = left_47;
		right_6.right = right_48;
		left_47.element = element_67;
		left_47.left = left_68;
		left_47.right = right_69;
		System.out.println(87 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK88() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		BinaryNode left_47 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		int element_67 = 0;
		int element_4 = -1;
		int element_46 = 0;
		int element_1 = -2;
		BinaryNode right_48 = null;
		BinaryNode left_68 = null;
		BinaryNode right_69 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_46;
		right_6.left = left_47;
		right_6.right = right_48;
		left_47.element = element_67;
		left_47.left = left_68;
		left_47.right = right_69;
		System.out.println(88 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK89() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		int element_1 = -1;
		int element_4 = 0;
		int element_46 = 0;
		BinaryNode left_47 = null;
		BinaryNode right_48 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		right_6.element = element_46;
		right_6.left = left_47;
		right_6.right = right_48;
		System.out.println(89 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK90() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = t;
		int element_1 = -2;
		int element_85 = -1;
		int element_4 = 0;
		BinaryNode right_6 = null;
		BinaryNode right_87 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(90 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK91() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = left_2;
		BinaryNode right_87 = t;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		BinaryNode right_6 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(91 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK92() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = left_2;
		BinaryNode right_87 = left_2;
		BinaryNode right_6 = t;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(92 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK93() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = left_2;
		BinaryNode right_87 = left_2;
		BinaryNode right_6 = left_2;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(93 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK94() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = left_2;
		BinaryNode right_87 = left_2;
		BinaryNode right_6 = right_3;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(94 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK95() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = left_2;
		BinaryNode right_87 = left_2;
		BinaryNode right_6 = left_5;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(95 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK96() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = left_2;
		BinaryNode right_87 = left_2;
		BinaryNode right_6 = left_86;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(96 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK97() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = left_2;
		BinaryNode right_87 = left_2;
		BinaryNode right_6 = right_87;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(97 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK98() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = left_2;
		BinaryNode right_87 = left_2;
		BinaryNode right_6 = null;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(98 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK99() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = left_2;
		BinaryNode right_87 = left_2;
		int element_4 = 0;
		int element_88 = 0;
		int element_1 = -2;
		int element_85 = -1;
		BinaryNode left_89 = null;
		BinaryNode right_90 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		right_6.element = element_88;
		right_6.left = left_89;
		right_6.right = right_90;
		System.out.println(99 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK100() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = left_2;
		BinaryNode right_87 = right_3;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		BinaryNode right_6 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(100 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK101() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = left_2;
		BinaryNode right_87 = left_5;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		BinaryNode right_6 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(101 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK102() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = left_2;
		BinaryNode right_87 = left_86;
		BinaryNode right_6 = t;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(102 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK103() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = left_2;
		BinaryNode right_87 = left_86;
		BinaryNode right_6 = left_2;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(103 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK104() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = left_2;
		BinaryNode right_87 = left_86;
		BinaryNode right_6 = right_3;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(104 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK105() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = left_2;
		BinaryNode right_87 = left_86;
		BinaryNode right_6 = left_5;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(105 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK106() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = left_2;
		BinaryNode right_87 = left_86;
		BinaryNode right_6 = left_86;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(106 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK107() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = left_2;
		BinaryNode right_87 = left_86;
		BinaryNode right_6 = right_87;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(107 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK108() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = left_2;
		BinaryNode right_87 = left_86;
		BinaryNode right_6 = null;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(108 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK109() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = left_2;
		BinaryNode right_87 = left_86;
		int element_94 = 0;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		BinaryNode left_95 = null;
		BinaryNode right_96 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		right_6.element = element_94;
		right_6.left = left_95;
		right_6.right = right_96;
		System.out.println(109 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK110() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = left_2;
		BinaryNode right_87 = null;
		BinaryNode right_6 = t;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(110 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK111() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = left_2;
		BinaryNode right_87 = null;
		BinaryNode right_6 = left_2;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(111 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK112() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = left_2;
		BinaryNode right_87 = null;
		BinaryNode right_6 = right_3;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(112 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK113() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = left_2;
		BinaryNode right_87 = null;
		BinaryNode right_6 = left_5;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(113 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK114() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = left_2;
		BinaryNode right_87 = null;
		BinaryNode right_6 = left_86;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(114 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK115() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = left_2;
		BinaryNode right_87 = null;
		BinaryNode right_6 = right_87;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(115 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK116() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = left_2;
		BinaryNode right_87 = null;
		BinaryNode right_6 = null;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(116 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK117() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = left_2;
		BinaryNode right_87 = null;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		int element_100 = 0;
		BinaryNode left_101 = null;
		BinaryNode right_102 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		right_6.element = element_100;
		right_6.left = left_101;
		right_6.right = right_102;
		System.out.println(117 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK118() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode right_87 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = left_2;
		BinaryNode left_107 = t;
		int element_106 = -1;
		int element_4 = 0;
		int element_1 = -3;
		int element_85 = -2;
		BinaryNode right_6 = null;
		BinaryNode right_108 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		right_87.element = element_106;
		right_87.left = left_107;
		right_87.right = right_108;
		System.out.println(118 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK119() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode right_87 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = left_2;
		BinaryNode left_107 = right_3;
		int element_106 = -1;
		int element_4 = 0;
		int element_1 = -3;
		int element_85 = -2;
		BinaryNode right_6 = null;
		BinaryNode right_108 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		right_87.element = element_106;
		right_87.left = left_107;
		right_87.right = right_108;
		System.out.println(119 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK120() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode right_87 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = left_2;
		BinaryNode left_107 = left_5;
		int element_106 = -1;
		int element_4 = 0;
		int element_1 = -3;
		int element_85 = -2;
		BinaryNode right_6 = null;
		BinaryNode right_108 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		right_87.element = element_106;
		right_87.left = left_107;
		right_87.right = right_108;
		System.out.println(120 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK121() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode right_87 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = left_2;
		BinaryNode left_107 = right_87;
		int element_106 = -1;
		int element_4 = 0;
		int element_1 = -3;
		int element_85 = -2;
		BinaryNode right_6 = null;
		BinaryNode right_108 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		right_87.element = element_106;
		right_87.left = left_107;
		right_87.right = right_108;
		System.out.println(121 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK122() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode right_87 = new BinaryNode();
		BinaryNode left_107 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = left_2;
		int element_106 = 1;
		int element_4 = 2;
		int element_1 = -1;
		int element_118 = 0;
		int element_85 = 0;
		BinaryNode right_6 = null;
		BinaryNode right_108 = null;
		BinaryNode left_119 = null;
		BinaryNode right_120 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		right_87.element = element_106;
		right_87.left = left_107;
		right_87.right = right_108;
		left_107.element = element_118;
		left_107.left = left_119;
		left_107.right = right_120;
		System.out.println(122 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK123() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode right_87 = new BinaryNode();
		BinaryNode left_107 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = left_2;
		int element_106 = 0;
		int element_4 = 1;
		int element_1 = -2;
		int element_118 = 0;
		int element_85 = -1;
		BinaryNode right_6 = null;
		BinaryNode right_108 = null;
		BinaryNode left_119 = null;
		BinaryNode right_120 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		right_87.element = element_106;
		right_87.left = left_107;
		right_87.right = right_108;
		left_107.element = element_118;
		left_107.left = left_119;
		left_107.right = right_120;
		System.out.println(123 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK124() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode right_87 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = left_2;
		int element_106 = -1;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		BinaryNode right_6 = null;
		BinaryNode left_107 = null;
		BinaryNode right_108 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		right_87.element = element_106;
		right_87.left = left_107;
		right_87.right = right_108;
		System.out.println(124 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK125() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode right_87 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = left_2;
		int element_106 = 0;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		BinaryNode right_6 = null;
		BinaryNode left_107 = null;
		BinaryNode right_108 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		right_87.element = element_106;
		right_87.left = left_107;
		right_87.right = right_108;
		System.out.println(125 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK126() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = right_3;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		BinaryNode right_6 = null;
		BinaryNode right_87 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(126 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK127() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = left_5;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		BinaryNode right_6 = null;
		BinaryNode right_87 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(127 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK128() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = null;
		BinaryNode right_87 = t;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		BinaryNode right_6 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(128 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK129() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = null;
		BinaryNode right_87 = left_2;
		BinaryNode right_6 = t;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(129 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK130() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = null;
		BinaryNode right_87 = left_2;
		BinaryNode right_6 = left_2;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(130 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK131() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = null;
		BinaryNode right_87 = left_2;
		BinaryNode right_6 = right_3;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(131 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK132() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = null;
		BinaryNode right_87 = left_2;
		BinaryNode right_6 = left_5;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(132 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK133() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = null;
		BinaryNode right_87 = left_2;
		BinaryNode right_6 = left_86;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(133 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK134() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = null;
		BinaryNode right_87 = left_2;
		BinaryNode right_6 = right_87;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(134 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK135() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = null;
		BinaryNode right_87 = left_2;
		BinaryNode right_6 = null;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(135 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK136() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = null;
		BinaryNode right_87 = left_2;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		int element_124 = 0;
		BinaryNode left_125 = null;
		BinaryNode right_126 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		right_6.element = element_124;
		right_6.left = left_125;
		right_6.right = right_126;
		System.out.println(136 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK137() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = null;
		BinaryNode right_87 = right_3;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		BinaryNode right_6 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(137 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK138() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = null;
		BinaryNode right_87 = left_5;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		BinaryNode right_6 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(138 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK139() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = null;
		BinaryNode right_87 = left_86;
		BinaryNode right_6 = t;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(139 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK140() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = null;
		BinaryNode right_87 = left_86;
		BinaryNode right_6 = left_2;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(140 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK141() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = null;
		BinaryNode right_87 = left_86;
		BinaryNode right_6 = right_3;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(141 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK142() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = null;
		BinaryNode right_87 = left_86;
		BinaryNode right_6 = left_5;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(142 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK143() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = null;
		BinaryNode right_87 = left_86;
		BinaryNode right_6 = left_86;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(143 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK144() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = null;
		BinaryNode right_87 = left_86;
		BinaryNode right_6 = right_87;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(144 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK145() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = null;
		BinaryNode right_87 = left_86;
		BinaryNode right_6 = null;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(145 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK146() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = null;
		BinaryNode right_87 = left_86;
		int element_4 = 0;
		int element_130 = 0;
		int element_1 = -2;
		int element_85 = -1;
		BinaryNode left_131 = null;
		BinaryNode right_132 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		right_6.element = element_130;
		right_6.left = left_131;
		right_6.right = right_132;
		System.out.println(146 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK147() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = null;
		BinaryNode right_87 = null;
		BinaryNode right_6 = t;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(147 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK148() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = null;
		BinaryNode right_87 = null;
		BinaryNode right_6 = left_2;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(148 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK149() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = null;
		BinaryNode right_87 = null;
		BinaryNode right_6 = right_3;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(149 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK150() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = null;
		BinaryNode right_87 = null;
		BinaryNode right_6 = left_5;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(150 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK151() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = null;
		BinaryNode right_87 = null;
		BinaryNode right_6 = left_86;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(151 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK152() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = null;
		BinaryNode right_87 = null;
		BinaryNode right_6 = right_87;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(152 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK153() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = null;
		BinaryNode right_87 = null;
		BinaryNode right_6 = null;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(153 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK154() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = null;
		BinaryNode right_87 = null;
		int element_4 = 0;
		int element_136 = 0;
		int element_1 = -2;
		int element_85 = -1;
		BinaryNode left_137 = null;
		BinaryNode right_138 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		right_6.element = element_136;
		right_6.left = left_137;
		right_6.right = right_138;
		System.out.println(154 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK155() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode right_87 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = null;
		BinaryNode left_143 = t;
		int element_142 = -1;
		int element_4 = 0;
		int element_1 = -3;
		int element_85 = -2;
		BinaryNode right_6 = null;
		BinaryNode right_144 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		right_87.element = element_142;
		right_87.left = left_143;
		right_87.right = right_144;
		System.out.println(155 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK156() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode right_87 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = null;
		BinaryNode left_143 = right_3;
		int element_142 = -1;
		int element_4 = 0;
		int element_1 = -3;
		int element_85 = -2;
		BinaryNode right_6 = null;
		BinaryNode right_144 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		right_87.element = element_142;
		right_87.left = left_143;
		right_87.right = right_144;
		System.out.println(156 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK157() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode right_87 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = null;
		BinaryNode left_143 = left_5;
		int element_142 = -1;
		int element_4 = 0;
		int element_1 = -3;
		int element_85 = -2;
		BinaryNode right_6 = null;
		BinaryNode right_144 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		right_87.element = element_142;
		right_87.left = left_143;
		right_87.right = right_144;
		System.out.println(157 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK158() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode right_87 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = null;
		BinaryNode left_143 = right_87;
		int element_142 = -1;
		int element_4 = 0;
		int element_1 = -3;
		int element_85 = -2;
		BinaryNode right_6 = null;
		BinaryNode right_144 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		right_87.element = element_142;
		right_87.left = left_143;
		right_87.right = right_144;
		System.out.println(158 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK159() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode right_87 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = null;
		int element_142 = 1;
		int element_4 = 2;
		int element_1 = -1;
		int element_154 = 0;
		int element_85 = 0;
		BinaryNode right_6 = null;
		BinaryNode right_144 = null;
		BinaryNode left_155 = null;
		BinaryNode right_156 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		right_87.element = element_142;
		right_87.left = left_143;
		right_87.right = right_144;
		left_143.element = element_154;
		left_143.left = left_155;
		left_143.right = right_156;
		System.out.println(159 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK160() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode right_87 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = null;
		int element_142 = 0;
		int element_4 = 1;
		int element_1 = -2;
		int element_154 = 0;
		int element_85 = -1;
		BinaryNode right_6 = null;
		BinaryNode right_144 = null;
		BinaryNode left_155 = null;
		BinaryNode right_156 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		right_87.element = element_142;
		right_87.left = left_143;
		right_87.right = right_144;
		left_143.element = element_154;
		left_143.left = left_155;
		left_143.right = right_156;
		System.out.println(160 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK161() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode right_87 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = null;
		int element_142 = -1;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		BinaryNode right_6 = null;
		BinaryNode left_143 = null;
		BinaryNode right_144 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		right_87.element = element_142;
		right_87.left = left_143;
		right_87.right = right_144;
		System.out.println(161 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK162() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode right_87 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_86 = null;
		int element_142 = 0;
		int element_4 = 0;
		int element_1 = -2;
		int element_85 = -1;
		BinaryNode right_6 = null;
		BinaryNode left_143 = null;
		BinaryNode right_144 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		right_87.element = element_142;
		right_87.left = left_143;
		right_87.right = right_144;
		System.out.println(162 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK163() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_86 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_161 = t;
		int element_160 = 1;
		int element_4 = 3;
		int element_1 = 0;
		int element_85 = 2;
		BinaryNode right_6 = null;
		BinaryNode right_87 = null;
		BinaryNode right_162 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		left_86.element = element_160;
		left_86.left = left_161;
		left_86.right = right_162;
		System.out.println(163 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK164() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_86 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_161 = left_2;
		BinaryNode right_162 = t;
		int element_160 = 1;
		int element_4 = 3;
		int element_1 = 0;
		int element_85 = 2;
		BinaryNode right_6 = null;
		BinaryNode right_87 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		left_86.element = element_160;
		left_86.left = left_161;
		left_86.right = right_162;
		System.out.println(164 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK165() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_86 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_161 = left_2;
		BinaryNode right_162 = right_3;
		int element_160 = 1;
		int element_4 = 3;
		int element_1 = 0;
		int element_85 = 2;
		BinaryNode right_6 = null;
		BinaryNode right_87 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		left_86.element = element_160;
		left_86.left = left_161;
		left_86.right = right_162;
		System.out.println(165 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK166() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_86 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_161 = left_2;
		BinaryNode right_162 = left_5;
		int element_160 = 1;
		int element_4 = 3;
		int element_1 = 0;
		int element_85 = 2;
		BinaryNode right_6 = null;
		BinaryNode right_87 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		left_86.element = element_160;
		left_86.left = left_161;
		left_86.right = right_162;
		System.out.println(166 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK167() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_86 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_161 = left_2;
		BinaryNode right_162 = left_86;
		int element_160 = 1;
		int element_4 = 3;
		int element_1 = 0;
		int element_85 = 2;
		BinaryNode right_6 = null;
		BinaryNode right_87 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		left_86.element = element_160;
		left_86.left = left_161;
		left_86.right = right_162;
		System.out.println(167 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK168() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_86 = new BinaryNode();
		BinaryNode right_162 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_161 = left_2;
		int element_172 = -1;
		int element_160 = -1;
		int element_4 = 1;
		int element_1 = -2;
		int element_85 = 0;
		BinaryNode right_6 = null;
		BinaryNode right_87 = null;
		BinaryNode left_173 = null;
		BinaryNode right_174 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		left_86.element = element_160;
		left_86.left = left_161;
		left_86.right = right_162;
		right_162.element = element_172;
		right_162.left = left_173;
		right_162.right = right_174;
		System.out.println(168 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK169() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_86 = new BinaryNode();
		BinaryNode right_162 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_161 = left_2;
		int element_172 = 0;
		int element_160 = -1;
		int element_4 = 1;
		int element_1 = -2;
		int element_85 = 0;
		BinaryNode right_6 = null;
		BinaryNode right_87 = null;
		BinaryNode left_173 = null;
		BinaryNode right_174 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		left_86.element = element_160;
		left_86.left = left_161;
		left_86.right = right_162;
		right_162.element = element_172;
		right_162.left = left_173;
		right_162.right = right_174;
		System.out.println(169 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK170() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_86 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_161 = right_3;
		int element_160 = -2;
		int element_4 = 0;
		int element_1 = -3;
		int element_85 = -1;
		BinaryNode right_6 = null;
		BinaryNode right_87 = null;
		BinaryNode right_162 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		left_86.element = element_160;
		left_86.left = left_161;
		left_86.right = right_162;
		System.out.println(170 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK171() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_86 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_161 = left_5;
		int element_160 = 1;
		int element_4 = 3;
		int element_1 = 0;
		int element_85 = 2;
		BinaryNode right_6 = null;
		BinaryNode right_87 = null;
		BinaryNode right_162 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		left_86.element = element_160;
		left_86.left = left_161;
		left_86.right = right_162;
		System.out.println(171 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK172() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_86 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_161 = left_86;
		int element_160 = 1;
		int element_4 = 3;
		int element_1 = 0;
		int element_85 = 2;
		BinaryNode right_6 = null;
		BinaryNode right_87 = null;
		BinaryNode right_162 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		left_86.element = element_160;
		left_86.left = left_161;
		left_86.right = right_162;
		System.out.println(172 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK173() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_86 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_161 = null;
		BinaryNode right_162 = t;
		int element_160 = 1;
		int element_4 = 3;
		int element_1 = 0;
		int element_85 = 2;
		BinaryNode right_6 = null;
		BinaryNode right_87 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		left_86.element = element_160;
		left_86.left = left_161;
		left_86.right = right_162;
		System.out.println(173 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK174() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_86 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_161 = null;
		BinaryNode right_162 = right_3;
		int element_160 = 1;
		int element_4 = 3;
		int element_1 = 0;
		int element_85 = 2;
		BinaryNode right_6 = null;
		BinaryNode right_87 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		left_86.element = element_160;
		left_86.left = left_161;
		left_86.right = right_162;
		System.out.println(174 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK175() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_86 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_161 = null;
		BinaryNode right_162 = left_5;
		int element_160 = 1;
		int element_4 = 3;
		int element_1 = 0;
		int element_85 = 2;
		BinaryNode right_6 = null;
		BinaryNode right_87 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		left_86.element = element_160;
		left_86.left = left_161;
		left_86.right = right_162;
		System.out.println(175 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK176() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_86 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_161 = null;
		BinaryNode right_162 = left_86;
		int element_160 = 1;
		int element_4 = 3;
		int element_1 = 0;
		int element_85 = 2;
		BinaryNode right_6 = null;
		BinaryNode right_87 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		left_86.element = element_160;
		left_86.left = left_161;
		left_86.right = right_162;
		System.out.println(176 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK177() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_86 = new BinaryNode();
		BinaryNode right_162 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_161 = null;
		int element_187 = -1;
		int element_160 = -1;
		int element_4 = 1;
		int element_1 = -2;
		int element_85 = 0;
		BinaryNode right_6 = null;
		BinaryNode right_87 = null;
		BinaryNode left_188 = null;
		BinaryNode right_189 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		left_86.element = element_160;
		left_86.left = left_161;
		left_86.right = right_162;
		right_162.element = element_187;
		right_162.left = left_188;
		right_162.right = right_189;
		System.out.println(177 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK178() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_86 = new BinaryNode();
		BinaryNode right_162 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_161 = null;
		int element_187 = 0;
		int element_160 = -1;
		int element_4 = 1;
		int element_1 = -2;
		int element_85 = 0;
		BinaryNode right_6 = null;
		BinaryNode right_87 = null;
		BinaryNode left_188 = null;
		BinaryNode right_189 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		left_86.element = element_160;
		left_86.left = left_161;
		left_86.right = right_162;
		right_162.element = element_187;
		right_162.left = left_188;
		right_162.right = right_189;
		System.out.println(178 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK179() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_86 = new BinaryNode();
		BinaryNode left_161 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_194 = t;
		int element_160 = 2;
		int element_193 = 1;
		int element_4 = 4;
		int element_1 = 0;
		int element_85 = 3;
		BinaryNode right_6 = null;
		BinaryNode right_87 = null;
		BinaryNode right_162 = null;
		BinaryNode right_195 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		left_86.element = element_160;
		left_86.left = left_161;
		left_86.right = right_162;
		left_161.element = element_193;
		left_161.left = left_194;
		left_161.right = right_195;
		System.out.println(179 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK180() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_86 = new BinaryNode();
		BinaryNode left_161 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_194 = right_3;
		int element_160 = 2;
		int element_193 = 1;
		int element_4 = 4;
		int element_1 = 0;
		int element_85 = 3;
		BinaryNode right_6 = null;
		BinaryNode right_87 = null;
		BinaryNode right_162 = null;
		BinaryNode right_195 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		left_86.element = element_160;
		left_86.left = left_161;
		left_86.right = right_162;
		left_161.element = element_193;
		left_161.left = left_194;
		left_161.right = right_195;
		System.out.println(180 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK181() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_86 = new BinaryNode();
		BinaryNode left_161 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_194 = left_5;
		int element_160 = 2;
		int element_193 = 1;
		int element_4 = 4;
		int element_1 = 0;
		int element_85 = 3;
		BinaryNode right_6 = null;
		BinaryNode right_87 = null;
		BinaryNode right_162 = null;
		BinaryNode right_195 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		left_86.element = element_160;
		left_86.left = left_161;
		left_86.right = right_162;
		left_161.element = element_193;
		left_161.left = left_194;
		left_161.right = right_195;
		System.out.println(181 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK182() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_86 = new BinaryNode();
		BinaryNode left_161 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_194 = left_86;
		int element_160 = 2;
		int element_193 = 1;
		int element_4 = 4;
		int element_1 = 0;
		int element_85 = 3;
		BinaryNode right_6 = null;
		BinaryNode right_87 = null;
		BinaryNode right_162 = null;
		BinaryNode right_195 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		left_86.element = element_160;
		left_86.left = left_161;
		left_86.right = right_162;
		left_161.element = element_193;
		left_161.left = left_194;
		left_161.right = right_195;
		System.out.println(182 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK183() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_86 = new BinaryNode();
		BinaryNode left_161 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_194 = left_161;
		int element_160 = 2;
		int element_193 = 1;
		int element_4 = 4;
		int element_1 = 0;
		int element_85 = 3;
		BinaryNode right_6 = null;
		BinaryNode right_87 = null;
		BinaryNode right_162 = null;
		BinaryNode right_195 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		left_86.element = element_160;
		left_86.left = left_161;
		left_86.right = right_162;
		left_161.element = element_193;
		left_161.left = left_194;
		left_161.right = right_195;
		System.out.println(183 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK184() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_86 = new BinaryNode();
		BinaryNode left_161 = new BinaryNode();
		BinaryNode left_194 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		int element_160 = 2;
		int element_193 = 1;
		int element_4 = 4;
		int element_1 = 0;
		int element_85 = 3;
		int element_202 = 0;
		BinaryNode right_6 = null;
		BinaryNode right_87 = null;
		BinaryNode right_162 = null;
		BinaryNode right_195 = null;
		BinaryNode left_203 = null;
		BinaryNode right_204 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		left_86.element = element_160;
		left_86.left = left_161;
		left_86.right = right_162;
		left_161.element = element_193;
		left_161.left = left_194;
		left_161.right = right_195;
		left_194.element = element_202;
		left_194.left = left_203;
		left_194.right = right_204;
		System.out.println(184 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK185() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_86 = new BinaryNode();
		BinaryNode left_161 = new BinaryNode();
		BinaryNode left_194 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		int element_160 = 1;
		int element_193 = 0;
		int element_4 = 3;
		int element_1 = -1;
		int element_85 = 2;
		int element_202 = 0;
		BinaryNode right_6 = null;
		BinaryNode right_87 = null;
		BinaryNode right_162 = null;
		BinaryNode right_195 = null;
		BinaryNode left_203 = null;
		BinaryNode right_204 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		left_86.element = element_160;
		left_86.left = left_161;
		left_86.right = right_162;
		left_161.element = element_193;
		left_161.left = left_194;
		left_161.right = right_195;
		left_194.element = element_202;
		left_194.left = left_203;
		left_194.right = right_204;
		System.out.println(185 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK186() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_86 = new BinaryNode();
		BinaryNode left_161 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		int element_160 = 1;
		int element_193 = 0;
		int element_4 = 3;
		int element_1 = 0;
		int element_85 = 2;
		BinaryNode right_6 = null;
		BinaryNode right_87 = null;
		BinaryNode right_162 = null;
		BinaryNode left_194 = null;
		BinaryNode right_195 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		left_86.element = element_160;
		left_86.left = left_161;
		left_86.right = right_162;
		left_161.element = element_193;
		left_161.left = left_194;
		left_161.right = right_195;
		System.out.println(186 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK187() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_86 = new BinaryNode();
		BinaryNode left_161 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		int element_160 = 0;
		int element_193 = 0;
		int element_4 = 2;
		int element_1 = -1;
		int element_85 = 1;
		BinaryNode right_6 = null;
		BinaryNode right_87 = null;
		BinaryNode right_162 = null;
		BinaryNode left_194 = null;
		BinaryNode right_195 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		left_86.element = element_160;
		left_86.left = left_161;
		left_86.right = right_162;
		left_161.element = element_193;
		left_161.left = left_194;
		left_161.right = right_195;
		System.out.println(187 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK188() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_86 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		int element_1 = 0;
		int element_85 = 1;
		int element_160 = 0;
		int element_4 = 2;
		BinaryNode right_6 = null;
		BinaryNode right_87 = null;
		BinaryNode left_161 = null;
		BinaryNode right_162 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		left_86.element = element_160;
		left_86.left = left_161;
		left_86.right = right_162;
		System.out.println(188 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK189() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_86 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		int element_1 = -1;
		int element_85 = 0;
		int element_160 = 0;
		int element_4 = 1;
		BinaryNode right_6 = null;
		BinaryNode right_87 = null;
		BinaryNode left_161 = null;
		BinaryNode right_162 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		left_86.element = element_160;
		left_86.left = left_161;
		left_86.right = right_162;
		System.out.println(189 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK190() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		int element_1 = 0;
		int element_85 = 0;
		int element_4 = 1;
		BinaryNode right_6 = null;
		BinaryNode left_86 = null;
		BinaryNode right_87 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(190 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK191() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		int element_1 = -1;
		int element_85 = 0;
		int element_4 = 0;
		BinaryNode right_6 = null;
		BinaryNode left_86 = null;
		BinaryNode right_87 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_85;
		left_5.left = left_86;
		left_5.right = right_87;
		System.out.println(191 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK192() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		int element_1 = 0;
		int element_4 = 0;
		BinaryNode left_5 = null;
		BinaryNode right_6 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		System.out.println(192 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK193() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = t;
		int element_1 = 1;
		int element_208 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		System.out.println(193 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK194() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = left_2;
		int element_1 = 1;
		int element_208 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		System.out.println(194 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK195() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = t;
		int element_1 = 1;
		int element_208 = 0;
		BinaryNode right_3 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		System.out.println(195 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK196() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_2;
		int element_1 = 1;
		int element_208 = 0;
		BinaryNode right_3 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		System.out.println(196 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK197() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		BinaryNode right_3 = t;
		int element_1 = 1;
		int element_208 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		System.out.println(197 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK198() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		BinaryNode right_3 = left_2;
		int element_208 = -1;
		int element_1 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		System.out.println(198 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK199() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		BinaryNode right_3 = left_209;
		int element_1 = 1;
		int element_208 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		System.out.println(199 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK200() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		BinaryNode right_3 = right_210;
		int element_1 = 1;
		int element_208 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		System.out.println(200 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK201() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		BinaryNode right_3 = null;
		int element_1 = 1;
		int element_208 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		System.out.println(201 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK202() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		BinaryNode left_212 = t;
		int element_208 = -1;
		int element_211 = 1;
		int element_1 = 0;
		BinaryNode right_213 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_211;
		right_3.left = left_212;
		right_3.right = right_213;
		System.out.println(202 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK203() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		BinaryNode left_212 = left_2;
		int element_208 = 0;
		int element_211 = 2;
		int element_1 = 1;
		BinaryNode right_213 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_211;
		right_3.left = left_212;
		right_3.right = right_213;
		System.out.println(203 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK204() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		BinaryNode left_212 = left_209;
		BinaryNode right_213 = t;
		int element_208 = -1;
		int element_211 = 1;
		int element_1 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_211;
		right_3.left = left_212;
		right_3.right = right_213;
		System.out.println(204 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK205() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		BinaryNode left_212 = left_209;
		BinaryNode right_213 = left_2;
		int element_208 = 0;
		int element_211 = 2;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_211;
		right_3.left = left_212;
		right_3.right = right_213;
		System.out.println(205 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK206() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		BinaryNode left_212 = left_209;
		BinaryNode right_213 = left_209;
		int element_208 = -1;
		int element_211 = 1;
		int element_1 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_211;
		right_3.left = left_212;
		right_3.right = right_213;
		System.out.println(206 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK207() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		BinaryNode left_212 = left_209;
		BinaryNode right_213 = right_210;
		int element_208 = -1;
		int element_211 = 1;
		int element_1 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_211;
		right_3.left = left_212;
		right_3.right = right_213;
		System.out.println(207 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK208() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		BinaryNode left_212 = left_209;
		BinaryNode right_213 = right_3;
		int element_208 = -1;
		int element_211 = 1;
		int element_1 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_211;
		right_3.left = left_212;
		right_3.right = right_213;
		System.out.println(208 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK209() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		BinaryNode left_212 = left_209;
		BinaryNode right_213 = left_212;
		int element_208 = -1;
		int element_211 = 1;
		int element_1 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_211;
		right_3.left = left_212;
		right_3.right = right_213;
		System.out.println(209 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK210() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		BinaryNode left_212 = left_209;
		BinaryNode right_213 = null;
		int element_208 = -1;
		int element_211 = 1;
		int element_1 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_211;
		right_3.left = left_212;
		right_3.right = right_213;
		System.out.println(210 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK211() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_213 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		BinaryNode left_212 = left_209;
		int element_208 = -2;
		int element_211 = 0;
		int element_1 = -1;
		int element_214 = 0;
		BinaryNode left_215 = null;
		BinaryNode right_216 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_211;
		right_3.left = left_212;
		right_3.right = right_213;
		right_213.element = element_214;
		right_213.left = left_215;
		right_213.right = right_216;
		System.out.println(211 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK212() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		BinaryNode left_212 = right_210;
		BinaryNode right_213 = t;
		int element_208 = -1;
		int element_211 = 1;
		int element_1 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_211;
		right_3.left = left_212;
		right_3.right = right_213;
		System.out.println(212 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK213() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		BinaryNode left_212 = right_210;
		BinaryNode right_213 = left_2;
		int element_208 = 0;
		int element_211 = 2;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_211;
		right_3.left = left_212;
		right_3.right = right_213;
		System.out.println(213 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK214() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		BinaryNode left_212 = right_210;
		BinaryNode right_213 = left_209;
		int element_208 = -1;
		int element_211 = 1;
		int element_1 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_211;
		right_3.left = left_212;
		right_3.right = right_213;
		System.out.println(214 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK215() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		BinaryNode left_212 = right_210;
		BinaryNode right_213 = right_210;
		int element_208 = -1;
		int element_211 = 1;
		int element_1 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_211;
		right_3.left = left_212;
		right_3.right = right_213;
		System.out.println(215 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK216() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		BinaryNode left_212 = right_210;
		BinaryNode right_213 = right_3;
		int element_208 = -1;
		int element_211 = 1;
		int element_1 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_211;
		right_3.left = left_212;
		right_3.right = right_213;
		System.out.println(216 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK217() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		BinaryNode left_212 = right_210;
		BinaryNode right_213 = left_212;
		int element_208 = -1;
		int element_211 = 1;
		int element_1 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_211;
		right_3.left = left_212;
		right_3.right = right_213;
		System.out.println(217 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK218() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		BinaryNode left_212 = right_210;
		BinaryNode right_213 = null;
		int element_208 = -1;
		int element_211 = 1;
		int element_1 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_211;
		right_3.left = left_212;
		right_3.right = right_213;
		System.out.println(218 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK219() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_213 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		BinaryNode left_212 = right_210;
		int element_208 = -2;
		int element_211 = 0;
		int element_1 = -1;
		int element_220 = 0;
		BinaryNode left_221 = null;
		BinaryNode right_222 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_211;
		right_3.left = left_212;
		right_3.right = right_213;
		right_213.element = element_220;
		right_213.left = left_221;
		right_213.right = right_222;
		System.out.println(219 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK220() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		BinaryNode left_212 = right_3;
		int element_208 = -1;
		int element_211 = 1;
		int element_1 = 0;
		BinaryNode right_213 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_211;
		right_3.left = left_212;
		right_3.right = right_213;
		System.out.println(220 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK221() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		BinaryNode left_212 = null;
		BinaryNode right_213 = t;
		int element_208 = -1;
		int element_211 = 1;
		int element_1 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_211;
		right_3.left = left_212;
		right_3.right = right_213;
		System.out.println(221 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK222() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		BinaryNode left_212 = null;
		BinaryNode right_213 = left_2;
		int element_208 = 0;
		int element_211 = 2;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_211;
		right_3.left = left_212;
		right_3.right = right_213;
		System.out.println(222 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK223() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		BinaryNode left_212 = null;
		BinaryNode right_213 = left_209;
		int element_208 = -1;
		int element_211 = 1;
		int element_1 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_211;
		right_3.left = left_212;
		right_3.right = right_213;
		System.out.println(223 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK224() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		BinaryNode left_212 = null;
		BinaryNode right_213 = right_210;
		int element_208 = -1;
		int element_211 = 1;
		int element_1 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_211;
		right_3.left = left_212;
		right_3.right = right_213;
		System.out.println(224 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK225() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		BinaryNode left_212 = null;
		BinaryNode right_213 = right_3;
		int element_208 = -1;
		int element_211 = 1;
		int element_1 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_211;
		right_3.left = left_212;
		right_3.right = right_213;
		System.out.println(225 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK226() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		BinaryNode left_212 = null;
		BinaryNode right_213 = left_212;
		int element_208 = -1;
		int element_211 = 1;
		int element_1 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_211;
		right_3.left = left_212;
		right_3.right = right_213;
		System.out.println(226 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK227() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		BinaryNode left_212 = null;
		BinaryNode right_213 = null;
		int element_208 = -1;
		int element_211 = 1;
		int element_1 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_211;
		right_3.left = left_212;
		right_3.right = right_213;
		System.out.println(227 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK228() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_213 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		BinaryNode left_212 = null;
		int element_208 = -2;
		int element_211 = 0;
		int element_1 = -1;
		int element_226 = 0;
		BinaryNode left_227 = null;
		BinaryNode right_228 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_211;
		right_3.left = left_212;
		right_3.right = right_213;
		right_213.element = element_226;
		right_213.left = left_227;
		right_213.right = right_228;
		System.out.println(228 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK229() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_212 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		BinaryNode left_233 = t;
		int element_208 = -1;
		int element_211 = 2;
		int element_232 = 1;
		int element_1 = 0;
		BinaryNode right_213 = null;
		BinaryNode right_234 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_211;
		right_3.left = left_212;
		right_3.right = right_213;
		left_212.element = element_232;
		left_212.left = left_233;
		left_212.right = right_234;
		System.out.println(229 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK230() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_212 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		BinaryNode left_233 = left_2;
		int element_208 = -1;
		int element_211 = 2;
		int element_232 = 1;
		int element_1 = 0;
		BinaryNode right_213 = null;
		BinaryNode right_234 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_211;
		right_3.left = left_212;
		right_3.right = right_213;
		left_212.element = element_232;
		left_212.left = left_233;
		left_212.right = right_234;
		System.out.println(230 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK231() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_212 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		BinaryNode left_233 = right_3;
		int element_208 = -1;
		int element_211 = 2;
		int element_232 = 1;
		int element_1 = 0;
		BinaryNode right_213 = null;
		BinaryNode right_234 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_211;
		right_3.left = left_212;
		right_3.right = right_213;
		left_212.element = element_232;
		left_212.left = left_233;
		left_212.right = right_234;
		System.out.println(231 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK232() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_212 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		BinaryNode left_233 = left_212;
		int element_208 = -1;
		int element_211 = 2;
		int element_232 = 1;
		int element_1 = 0;
		BinaryNode right_213 = null;
		BinaryNode right_234 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_211;
		right_3.left = left_212;
		right_3.right = right_213;
		left_212.element = element_232;
		left_212.left = left_233;
		left_212.right = right_234;
		System.out.println(232 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK233() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_212 = new BinaryNode();
		BinaryNode left_233 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		int element_208 = -1;
		int element_211 = 2;
		int element_232 = 1;
		int element_244 = 0;
		int element_1 = 0;
		BinaryNode right_213 = null;
		BinaryNode right_234 = null;
		BinaryNode left_245 = null;
		BinaryNode right_246 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_211;
		right_3.left = left_212;
		right_3.right = right_213;
		left_212.element = element_232;
		left_212.left = left_233;
		left_212.right = right_234;
		left_233.element = element_244;
		left_233.left = left_245;
		left_233.right = right_246;
		System.out.println(233 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK234() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_212 = new BinaryNode();
		BinaryNode left_233 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		int element_208 = -2;
		int element_211 = 1;
		int element_232 = 0;
		int element_244 = 0;
		int element_1 = -1;
		BinaryNode right_213 = null;
		BinaryNode right_234 = null;
		BinaryNode left_245 = null;
		BinaryNode right_246 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_211;
		right_3.left = left_212;
		right_3.right = right_213;
		left_212.element = element_232;
		left_212.left = left_233;
		left_212.right = right_234;
		left_233.element = element_244;
		left_233.left = left_245;
		left_233.right = right_246;
		System.out.println(234 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK235() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_212 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		int element_208 = -1;
		int element_211 = 1;
		int element_232 = 0;
		int element_1 = 0;
		BinaryNode right_213 = null;
		BinaryNode left_233 = null;
		BinaryNode right_234 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_211;
		right_3.left = left_212;
		right_3.right = right_213;
		left_212.element = element_232;
		left_212.left = left_233;
		left_212.right = right_234;
		System.out.println(235 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK236() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_212 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		int element_208 = -2;
		int element_211 = 0;
		int element_232 = 0;
		int element_1 = -1;
		BinaryNode right_213 = null;
		BinaryNode left_233 = null;
		BinaryNode right_234 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_211;
		right_3.left = left_212;
		right_3.right = right_213;
		left_212.element = element_232;
		left_212.left = left_233;
		left_212.right = right_234;
		System.out.println(236 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK237() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = left_209;
		int element_1 = 0;
		int element_208 = -1;
		int element_211 = 0;
		BinaryNode left_212 = null;
		BinaryNode right_213 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_211;
		right_3.left = left_212;
		right_3.right = right_213;
		System.out.println(237 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK238() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		BinaryNode right_3 = t;
		int element_1 = 0;
		int element_208 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		System.out.println(238 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK239() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		BinaryNode right_3 = left_2;
		int element_208 = -1;
		int element_1 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		System.out.println(239 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK240() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		BinaryNode right_3 = left_209;
		int element_1 = 1;
		int element_208 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		System.out.println(240 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK241() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		BinaryNode right_3 = right_210;
		int element_1 = 1;
		int element_208 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		System.out.println(241 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK242() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		BinaryNode right_3 = null;
		int element_1 = 1;
		int element_208 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		System.out.println(242 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK243() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		BinaryNode left_251 = t;
		int element_208 = -1;
		int element_1 = 0;
		int element_250 = 1;
		BinaryNode right_252 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_250;
		right_3.left = left_251;
		right_3.right = right_252;
		System.out.println(243 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK244() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		BinaryNode left_251 = left_2;
		int element_208 = 0;
		int element_1 = 1;
		int element_250 = 2;
		BinaryNode right_252 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_250;
		right_3.left = left_251;
		right_3.right = right_252;
		System.out.println(244 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK245() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		BinaryNode left_251 = left_209;
		BinaryNode right_252 = t;
		int element_208 = -1;
		int element_1 = 0;
		int element_250 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_250;
		right_3.left = left_251;
		right_3.right = right_252;
		System.out.println(245 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK246() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		BinaryNode left_251 = left_209;
		BinaryNode right_252 = left_2;
		int element_208 = 0;
		int element_1 = 1;
		int element_250 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_250;
		right_3.left = left_251;
		right_3.right = right_252;
		System.out.println(246 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK247() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		BinaryNode left_251 = left_209;
		BinaryNode right_252 = left_209;
		int element_208 = -1;
		int element_1 = 0;
		int element_250 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_250;
		right_3.left = left_251;
		right_3.right = right_252;
		System.out.println(247 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK248() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		BinaryNode left_251 = left_209;
		BinaryNode right_252 = right_210;
		int element_208 = -1;
		int element_1 = 0;
		int element_250 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_250;
		right_3.left = left_251;
		right_3.right = right_252;
		System.out.println(248 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK249() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		BinaryNode left_251 = left_209;
		BinaryNode right_252 = right_3;
		int element_208 = -1;
		int element_1 = 0;
		int element_250 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_250;
		right_3.left = left_251;
		right_3.right = right_252;
		System.out.println(249 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK250() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		BinaryNode left_251 = left_209;
		BinaryNode right_252 = left_251;
		int element_208 = -1;
		int element_1 = 0;
		int element_250 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_250;
		right_3.left = left_251;
		right_3.right = right_252;
		System.out.println(250 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK251() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		BinaryNode left_251 = left_209;
		BinaryNode right_252 = null;
		int element_208 = -1;
		int element_1 = 0;
		int element_250 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_250;
		right_3.left = left_251;
		right_3.right = right_252;
		System.out.println(251 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK252() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_252 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		BinaryNode left_251 = left_209;
		int element_208 = -2;
		int element_1 = -1;
		int element_253 = 0;
		int element_250 = 0;
		BinaryNode left_254 = null;
		BinaryNode right_255 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_250;
		right_3.left = left_251;
		right_3.right = right_252;
		right_252.element = element_253;
		right_252.left = left_254;
		right_252.right = right_255;
		System.out.println(252 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK253() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		BinaryNode left_251 = right_210;
		BinaryNode right_252 = t;
		int element_208 = -1;
		int element_1 = 0;
		int element_250 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_250;
		right_3.left = left_251;
		right_3.right = right_252;
		System.out.println(253 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK254() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		BinaryNode left_251 = right_210;
		BinaryNode right_252 = left_2;
		int element_208 = 0;
		int element_1 = 1;
		int element_250 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_250;
		right_3.left = left_251;
		right_3.right = right_252;
		System.out.println(254 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK255() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		BinaryNode left_251 = right_210;
		BinaryNode right_252 = left_209;
		int element_208 = -1;
		int element_1 = 0;
		int element_250 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_250;
		right_3.left = left_251;
		right_3.right = right_252;
		System.out.println(255 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK256() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		BinaryNode left_251 = right_210;
		BinaryNode right_252 = right_210;
		int element_208 = -1;
		int element_1 = 0;
		int element_250 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_250;
		right_3.left = left_251;
		right_3.right = right_252;
		System.out.println(256 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK257() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		BinaryNode left_251 = right_210;
		BinaryNode right_252 = right_3;
		int element_208 = -1;
		int element_1 = 0;
		int element_250 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_250;
		right_3.left = left_251;
		right_3.right = right_252;
		System.out.println(257 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK258() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		BinaryNode left_251 = right_210;
		BinaryNode right_252 = left_251;
		int element_208 = -1;
		int element_1 = 0;
		int element_250 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_250;
		right_3.left = left_251;
		right_3.right = right_252;
		System.out.println(258 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK259() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		BinaryNode left_251 = right_210;
		BinaryNode right_252 = null;
		int element_208 = -1;
		int element_1 = 0;
		int element_250 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_250;
		right_3.left = left_251;
		right_3.right = right_252;
		System.out.println(259 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK260() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_252 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		BinaryNode left_251 = right_210;
		int element_208 = -2;
		int element_259 = 0;
		int element_1 = -1;
		int element_250 = 0;
		BinaryNode left_260 = null;
		BinaryNode right_261 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_250;
		right_3.left = left_251;
		right_3.right = right_252;
		right_252.element = element_259;
		right_252.left = left_260;
		right_252.right = right_261;
		System.out.println(260 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK261() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		BinaryNode left_251 = right_3;
		int element_208 = -1;
		int element_1 = 0;
		int element_250 = 1;
		BinaryNode right_252 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_250;
		right_3.left = left_251;
		right_3.right = right_252;
		System.out.println(261 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK262() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		BinaryNode left_251 = null;
		BinaryNode right_252 = t;
		int element_208 = -1;
		int element_1 = 0;
		int element_250 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_250;
		right_3.left = left_251;
		right_3.right = right_252;
		System.out.println(262 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK263() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		BinaryNode left_251 = null;
		BinaryNode right_252 = left_2;
		int element_208 = 0;
		int element_1 = 1;
		int element_250 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_250;
		right_3.left = left_251;
		right_3.right = right_252;
		System.out.println(263 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK264() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		BinaryNode left_251 = null;
		BinaryNode right_252 = left_209;
		int element_208 = -1;
		int element_1 = 0;
		int element_250 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_250;
		right_3.left = left_251;
		right_3.right = right_252;
		System.out.println(264 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK265() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		BinaryNode left_251 = null;
		BinaryNode right_252 = right_210;
		int element_208 = -1;
		int element_1 = 0;
		int element_250 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_250;
		right_3.left = left_251;
		right_3.right = right_252;
		System.out.println(265 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK266() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		BinaryNode left_251 = null;
		BinaryNode right_252 = right_3;
		int element_208 = -1;
		int element_1 = 0;
		int element_250 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_250;
		right_3.left = left_251;
		right_3.right = right_252;
		System.out.println(266 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK267() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		BinaryNode left_251 = null;
		BinaryNode right_252 = left_251;
		int element_208 = -1;
		int element_1 = 0;
		int element_250 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_250;
		right_3.left = left_251;
		right_3.right = right_252;
		System.out.println(267 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK268() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		BinaryNode left_251 = null;
		BinaryNode right_252 = null;
		int element_208 = -1;
		int element_1 = 0;
		int element_250 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_250;
		right_3.left = left_251;
		right_3.right = right_252;
		System.out.println(268 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK269() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_252 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		BinaryNode left_251 = null;
		int element_208 = -2;
		int element_1 = -1;
		int element_265 = 0;
		int element_250 = 0;
		BinaryNode left_266 = null;
		BinaryNode right_267 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_250;
		right_3.left = left_251;
		right_3.right = right_252;
		right_252.element = element_265;
		right_252.left = left_266;
		right_252.right = right_267;
		System.out.println(269 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK270() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_251 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		BinaryNode left_272 = t;
		int element_208 = -1;
		int element_1 = 0;
		int element_271 = 1;
		int element_250 = 2;
		BinaryNode right_252 = null;
		BinaryNode right_273 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_250;
		right_3.left = left_251;
		right_3.right = right_252;
		left_251.element = element_271;
		left_251.left = left_272;
		left_251.right = right_273;
		System.out.println(270 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK271() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_251 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		BinaryNode left_272 = left_2;
		int element_208 = -1;
		int element_1 = 0;
		int element_271 = 1;
		int element_250 = 2;
		BinaryNode right_252 = null;
		BinaryNode right_273 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_250;
		right_3.left = left_251;
		right_3.right = right_252;
		left_251.element = element_271;
		left_251.left = left_272;
		left_251.right = right_273;
		System.out.println(271 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK272() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_251 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		BinaryNode left_272 = right_3;
		int element_208 = -1;
		int element_1 = 0;
		int element_271 = 1;
		int element_250 = 2;
		BinaryNode right_252 = null;
		BinaryNode right_273 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_250;
		right_3.left = left_251;
		right_3.right = right_252;
		left_251.element = element_271;
		left_251.left = left_272;
		left_251.right = right_273;
		System.out.println(272 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK273() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_251 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		BinaryNode left_272 = left_251;
		int element_208 = -1;
		int element_1 = 0;
		int element_271 = 1;
		int element_250 = 2;
		BinaryNode right_252 = null;
		BinaryNode right_273 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_250;
		right_3.left = left_251;
		right_3.right = right_252;
		left_251.element = element_271;
		left_251.left = left_272;
		left_251.right = right_273;
		System.out.println(273 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK274() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_251 = new BinaryNode();
		BinaryNode left_272 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		int element_208 = -1;
		int element_1 = 0;
		int element_271 = 1;
		int element_283 = 0;
		int element_250 = 2;
		BinaryNode right_252 = null;
		BinaryNode right_273 = null;
		BinaryNode left_284 = null;
		BinaryNode right_285 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_250;
		right_3.left = left_251;
		right_3.right = right_252;
		left_251.element = element_271;
		left_251.left = left_272;
		left_251.right = right_273;
		left_272.element = element_283;
		left_272.left = left_284;
		left_272.right = right_285;
		System.out.println(274 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK275() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_251 = new BinaryNode();
		BinaryNode left_272 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		int element_208 = -2;
		int element_1 = -1;
		int element_271 = 0;
		int element_283 = 0;
		int element_250 = 1;
		BinaryNode right_252 = null;
		BinaryNode right_273 = null;
		BinaryNode left_284 = null;
		BinaryNode right_285 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_250;
		right_3.left = left_251;
		right_3.right = right_252;
		left_251.element = element_271;
		left_251.left = left_272;
		left_251.right = right_273;
		left_272.element = element_283;
		left_272.left = left_284;
		left_272.right = right_285;
		System.out.println(275 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK276() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_251 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		int element_208 = -1;
		int element_1 = 0;
		int element_271 = 0;
		int element_250 = 1;
		BinaryNode right_252 = null;
		BinaryNode left_272 = null;
		BinaryNode right_273 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_250;
		right_3.left = left_251;
		right_3.right = right_252;
		left_251.element = element_271;
		left_251.left = left_272;
		left_251.right = right_273;
		System.out.println(276 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK277() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_251 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		int element_208 = -2;
		int element_1 = -1;
		int element_271 = 0;
		int element_250 = 0;
		BinaryNode right_252 = null;
		BinaryNode left_272 = null;
		BinaryNode right_273 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_250;
		right_3.left = left_251;
		right_3.right = right_252;
		left_251.element = element_271;
		left_251.left = left_272;
		left_251.right = right_273;
		System.out.println(277 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK278() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		int element_1 = 0;
		int element_208 = -1;
		int element_250 = 0;
		BinaryNode left_251 = null;
		BinaryNode right_252 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_3.element = element_250;
		right_3.left = left_251;
		right_3.right = right_252;
		System.out.println(278 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK279() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = t;
		int element_1 = 2;
		int element_208 = 0;
		int element_289 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_291 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(279 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK280() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = left_2;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_291 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(280 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK281() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = left_209;
		BinaryNode right_291 = t;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		BinaryNode right_3 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(281 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK282() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = left_209;
		BinaryNode right_291 = left_2;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		BinaryNode right_3 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(282 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK283() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = left_209;
		BinaryNode right_291 = left_209;
		BinaryNode right_3 = t;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(283 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK284() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = left_209;
		BinaryNode right_291 = left_209;
		BinaryNode right_3 = left_2;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(284 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK285() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = left_209;
		BinaryNode right_291 = left_209;
		BinaryNode right_3 = left_209;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(285 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK286() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = left_209;
		BinaryNode right_291 = left_209;
		BinaryNode right_3 = right_210;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(286 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK287() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = left_209;
		BinaryNode right_291 = left_209;
		BinaryNode right_3 = left_290;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(287 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK288() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = left_209;
		BinaryNode right_291 = left_209;
		BinaryNode right_3 = right_291;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(288 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK289() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = left_209;
		BinaryNode right_291 = left_209;
		BinaryNode right_3 = null;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(289 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK290() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = left_209;
		BinaryNode right_291 = left_209;
		int element_208 = -2;
		int element_289 = -1;
		int element_292 = 0;
		int element_1 = 0;
		BinaryNode left_293 = null;
		BinaryNode right_294 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		right_3.element = element_292;
		right_3.left = left_293;
		right_3.right = right_294;
		System.out.println(290 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK291() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = left_209;
		BinaryNode right_291 = right_210;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		BinaryNode right_3 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(291 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK292() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = left_209;
		BinaryNode right_291 = left_290;
		BinaryNode right_3 = t;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(292 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK293() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = left_209;
		BinaryNode right_291 = left_290;
		BinaryNode right_3 = left_2;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(293 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK294() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = left_209;
		BinaryNode right_291 = left_290;
		BinaryNode right_3 = left_209;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(294 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK295() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = left_209;
		BinaryNode right_291 = left_290;
		BinaryNode right_3 = right_210;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(295 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK296() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = left_209;
		BinaryNode right_291 = left_290;
		BinaryNode right_3 = left_290;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(296 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK297() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = left_209;
		BinaryNode right_291 = left_290;
		BinaryNode right_3 = right_291;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(297 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK298() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = left_209;
		BinaryNode right_291 = left_290;
		BinaryNode right_3 = null;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(298 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK299() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = left_209;
		BinaryNode right_291 = left_290;
		int element_208 = -2;
		int element_289 = -1;
		int element_298 = 0;
		int element_1 = 0;
		BinaryNode left_299 = null;
		BinaryNode right_300 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		right_3.element = element_298;
		right_3.left = left_299;
		right_3.right = right_300;
		System.out.println(299 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK300() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = left_209;
		BinaryNode right_291 = null;
		BinaryNode right_3 = t;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(300 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK301() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = left_209;
		BinaryNode right_291 = null;
		BinaryNode right_3 = left_2;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(301 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK302() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = left_209;
		BinaryNode right_291 = null;
		BinaryNode right_3 = left_209;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(302 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK303() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = left_209;
		BinaryNode right_291 = null;
		BinaryNode right_3 = right_210;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(303 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK304() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = left_209;
		BinaryNode right_291 = null;
		BinaryNode right_3 = left_290;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(304 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK305() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = left_209;
		BinaryNode right_291 = null;
		BinaryNode right_3 = right_291;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(305 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK306() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = left_209;
		BinaryNode right_291 = null;
		BinaryNode right_3 = null;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(306 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK307() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = left_209;
		BinaryNode right_291 = null;
		int element_208 = -2;
		int element_289 = -1;
		int element_1 = 0;
		int element_304 = 0;
		BinaryNode left_305 = null;
		BinaryNode right_306 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		right_3.element = element_304;
		right_3.left = left_305;
		right_3.right = right_306;
		System.out.println(307 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK308() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode right_291 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = left_209;
		BinaryNode left_311 = t;
		int element_208 = -3;
		int element_289 = -2;
		int element_310 = -1;
		int element_1 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_312 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		right_291.element = element_310;
		right_291.left = left_311;
		right_291.right = right_312;
		System.out.println(308 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK309() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode right_291 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = left_209;
		BinaryNode left_311 = left_2;
		int element_208 = 0;
		int element_289 = 1;
		int element_310 = 2;
		int element_1 = 3;
		BinaryNode right_3 = null;
		BinaryNode right_312 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		right_291.element = element_310;
		right_291.left = left_311;
		right_291.right = right_312;
		System.out.println(309 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK310() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode right_291 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = left_209;
		BinaryNode left_311 = right_210;
		int element_208 = -3;
		int element_289 = -2;
		int element_310 = -1;
		int element_1 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_312 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		right_291.element = element_310;
		right_291.left = left_311;
		right_291.right = right_312;
		System.out.println(310 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK311() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode right_291 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = left_209;
		BinaryNode left_311 = right_291;
		int element_208 = -3;
		int element_289 = -2;
		int element_310 = -1;
		int element_1 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_312 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		right_291.element = element_310;
		right_291.left = left_311;
		right_291.right = right_312;
		System.out.println(311 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK312() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode right_291 = new BinaryNode();
		BinaryNode left_311 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = left_209;
		int element_208 = -1;
		int element_289 = 0;
		int element_310 = 1;
		int element_1 = 2;
		int element_322 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_312 = null;
		BinaryNode left_323 = null;
		BinaryNode right_324 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		right_291.element = element_310;
		right_291.left = left_311;
		right_291.right = right_312;
		left_311.element = element_322;
		left_311.left = left_323;
		left_311.right = right_324;
		System.out.println(312 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK313() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode right_291 = new BinaryNode();
		BinaryNode left_311 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = left_209;
		int element_208 = -2;
		int element_289 = -1;
		int element_310 = 0;
		int element_1 = 1;
		int element_322 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_312 = null;
		BinaryNode left_323 = null;
		BinaryNode right_324 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		right_291.element = element_310;
		right_291.left = left_311;
		right_291.right = right_312;
		left_311.element = element_322;
		left_311.left = left_323;
		left_311.right = right_324;
		System.out.println(313 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK314() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode right_291 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = left_209;
		int element_208 = -2;
		int element_289 = -1;
		int element_310 = -1;
		int element_1 = 0;
		BinaryNode right_3 = null;
		BinaryNode left_311 = null;
		BinaryNode right_312 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		right_291.element = element_310;
		right_291.left = left_311;
		right_291.right = right_312;
		System.out.println(314 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK315() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode right_291 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = left_209;
		int element_208 = -2;
		int element_289 = -1;
		int element_310 = 0;
		int element_1 = 0;
		BinaryNode right_3 = null;
		BinaryNode left_311 = null;
		BinaryNode right_312 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		right_291.element = element_310;
		right_291.left = left_311;
		right_291.right = right_312;
		System.out.println(315 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK316() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = right_210;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_291 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(316 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK317() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = null;
		BinaryNode right_291 = t;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		BinaryNode right_3 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(317 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK318() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = null;
		BinaryNode right_291 = left_2;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		BinaryNode right_3 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(318 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK319() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = null;
		BinaryNode right_291 = left_209;
		BinaryNode right_3 = t;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(319 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK320() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = null;
		BinaryNode right_291 = left_209;
		BinaryNode right_3 = left_2;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(320 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK321() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = null;
		BinaryNode right_291 = left_209;
		BinaryNode right_3 = left_209;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(321 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK322() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = null;
		BinaryNode right_291 = left_209;
		BinaryNode right_3 = right_210;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(322 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK323() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = null;
		BinaryNode right_291 = left_209;
		BinaryNode right_3 = left_290;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(323 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK324() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = null;
		BinaryNode right_291 = left_209;
		BinaryNode right_3 = right_291;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(324 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK325() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = null;
		BinaryNode right_291 = left_209;
		BinaryNode right_3 = null;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(325 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK326() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = null;
		BinaryNode right_291 = left_209;
		int element_208 = -2;
		int element_289 = -1;
		int element_1 = 0;
		int element_328 = 0;
		BinaryNode left_329 = null;
		BinaryNode right_330 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		right_3.element = element_328;
		right_3.left = left_329;
		right_3.right = right_330;
		System.out.println(326 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK327() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = null;
		BinaryNode right_291 = right_210;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		BinaryNode right_3 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(327 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK328() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = null;
		BinaryNode right_291 = left_290;
		BinaryNode right_3 = t;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(328 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK329() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = null;
		BinaryNode right_291 = left_290;
		BinaryNode right_3 = left_2;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(329 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK330() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = null;
		BinaryNode right_291 = left_290;
		BinaryNode right_3 = left_209;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(330 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK331() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = null;
		BinaryNode right_291 = left_290;
		BinaryNode right_3 = right_210;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(331 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK332() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = null;
		BinaryNode right_291 = left_290;
		BinaryNode right_3 = left_290;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(332 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK333() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = null;
		BinaryNode right_291 = left_290;
		BinaryNode right_3 = right_291;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(333 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK334() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = null;
		BinaryNode right_291 = left_290;
		BinaryNode right_3 = null;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(334 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK335() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = null;
		BinaryNode right_291 = left_290;
		int element_208 = -2;
		int element_289 = -1;
		int element_334 = 0;
		int element_1 = 0;
		BinaryNode left_335 = null;
		BinaryNode right_336 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		right_3.element = element_334;
		right_3.left = left_335;
		right_3.right = right_336;
		System.out.println(335 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK336() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = null;
		BinaryNode right_291 = null;
		BinaryNode right_3 = t;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(336 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK337() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = null;
		BinaryNode right_291 = null;
		BinaryNode right_3 = left_2;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(337 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK338() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = null;
		BinaryNode right_291 = null;
		BinaryNode right_3 = left_209;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(338 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK339() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = null;
		BinaryNode right_291 = null;
		BinaryNode right_3 = right_210;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(339 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK340() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = null;
		BinaryNode right_291 = null;
		BinaryNode right_3 = left_290;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(340 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK341() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = null;
		BinaryNode right_291 = null;
		BinaryNode right_3 = right_291;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(341 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK342() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = null;
		BinaryNode right_291 = null;
		BinaryNode right_3 = null;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(342 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK343() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = null;
		BinaryNode right_291 = null;
		int element_208 = -2;
		int element_289 = -1;
		int element_1 = 0;
		int element_340 = 0;
		BinaryNode left_341 = null;
		BinaryNode right_342 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		right_3.element = element_340;
		right_3.left = left_341;
		right_3.right = right_342;
		System.out.println(343 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK344() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode right_291 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = null;
		BinaryNode left_347 = t;
		int element_208 = -3;
		int element_289 = -2;
		int element_1 = 0;
		int element_346 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_348 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		right_291.element = element_346;
		right_291.left = left_347;
		right_291.right = right_348;
		System.out.println(344 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK345() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode right_291 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = null;
		BinaryNode left_347 = left_2;
		int element_208 = 0;
		int element_289 = 1;
		int element_1 = 3;
		int element_346 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_348 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		right_291.element = element_346;
		right_291.left = left_347;
		right_291.right = right_348;
		System.out.println(345 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK346() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode right_291 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = null;
		BinaryNode left_347 = right_210;
		int element_208 = -3;
		int element_289 = -2;
		int element_1 = 0;
		int element_346 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_348 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		right_291.element = element_346;
		right_291.left = left_347;
		right_291.right = right_348;
		System.out.println(346 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK347() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode right_291 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = null;
		BinaryNode left_347 = right_291;
		int element_208 = -3;
		int element_289 = -2;
		int element_1 = 0;
		int element_346 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_348 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		right_291.element = element_346;
		right_291.left = left_347;
		right_291.right = right_348;
		System.out.println(347 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK348() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode right_291 = new BinaryNode();
		BinaryNode left_347 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = null;
		int element_208 = -1;
		int element_289 = 0;
		int element_1 = 2;
		int element_346 = 1;
		int element_358 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_348 = null;
		BinaryNode left_359 = null;
		BinaryNode right_360 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		right_291.element = element_346;
		right_291.left = left_347;
		right_291.right = right_348;
		left_347.element = element_358;
		left_347.left = left_359;
		left_347.right = right_360;
		System.out.println(348 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK349() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode right_291 = new BinaryNode();
		BinaryNode left_347 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = null;
		int element_208 = -2;
		int element_289 = -1;
		int element_1 = 1;
		int element_346 = 0;
		int element_358 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_348 = null;
		BinaryNode left_359 = null;
		BinaryNode right_360 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		right_291.element = element_346;
		right_291.left = left_347;
		right_291.right = right_348;
		left_347.element = element_358;
		left_347.left = left_359;
		left_347.right = right_360;
		System.out.println(349 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK350() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode right_291 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = null;
		int element_208 = -2;
		int element_289 = -1;
		int element_1 = 0;
		int element_346 = -1;
		BinaryNode right_3 = null;
		BinaryNode left_347 = null;
		BinaryNode right_348 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		right_291.element = element_346;
		right_291.left = left_347;
		right_291.right = right_348;
		System.out.println(350 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK351() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode right_291 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_290 = null;
		int element_208 = -2;
		int element_289 = -1;
		int element_1 = 0;
		int element_346 = 0;
		BinaryNode right_3 = null;
		BinaryNode left_347 = null;
		BinaryNode right_348 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		right_291.element = element_346;
		right_291.left = left_347;
		right_291.right = right_348;
		System.out.println(351 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK352() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode left_290 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_365 = t;
		int element_208 = 0;
		int element_289 = 2;
		int element_1 = 3;
		int element_364 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_291 = null;
		BinaryNode right_366 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		left_290.element = element_364;
		left_290.left = left_365;
		left_290.right = right_366;
		System.out.println(352 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK353() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode left_290 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_365 = left_2;
		int element_208 = 0;
		int element_289 = 2;
		int element_1 = 3;
		int element_364 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_291 = null;
		BinaryNode right_366 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		left_290.element = element_364;
		left_290.left = left_365;
		left_290.right = right_366;
		System.out.println(353 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK354() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode left_290 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_365 = left_209;
		BinaryNode right_366 = t;
		int element_208 = 0;
		int element_289 = 2;
		int element_1 = 3;
		int element_364 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_291 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		left_290.element = element_364;
		left_290.left = left_365;
		left_290.right = right_366;
		System.out.println(354 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK355() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode left_290 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_365 = left_209;
		BinaryNode right_366 = left_2;
		int element_208 = 0;
		int element_289 = 2;
		int element_1 = 3;
		int element_364 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_291 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		left_290.element = element_364;
		left_290.left = left_365;
		left_290.right = right_366;
		System.out.println(355 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK356() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode left_290 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_365 = left_209;
		BinaryNode right_366 = right_210;
		int element_208 = 0;
		int element_289 = 2;
		int element_1 = 3;
		int element_364 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_291 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		left_290.element = element_364;
		left_290.left = left_365;
		left_290.right = right_366;
		System.out.println(356 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK357() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode left_290 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_365 = left_209;
		BinaryNode right_366 = left_290;
		int element_208 = 0;
		int element_289 = 2;
		int element_1 = 3;
		int element_364 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_291 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		left_290.element = element_364;
		left_290.left = left_365;
		left_290.right = right_366;
		System.out.println(357 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK358() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode left_290 = new BinaryNode();
		BinaryNode right_366 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_365 = left_209;
		int element_376 = -1;
		int element_208 = -2;
		int element_289 = 0;
		int element_1 = 1;
		int element_364 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_291 = null;
		BinaryNode left_377 = null;
		BinaryNode right_378 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		left_290.element = element_364;
		left_290.left = left_365;
		left_290.right = right_366;
		right_366.element = element_376;
		right_366.left = left_377;
		right_366.right = right_378;
		System.out.println(358 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK359() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode left_290 = new BinaryNode();
		BinaryNode right_366 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_365 = left_209;
		int element_376 = 0;
		int element_208 = -2;
		int element_289 = 0;
		int element_1 = 1;
		int element_364 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_291 = null;
		BinaryNode left_377 = null;
		BinaryNode right_378 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		left_290.element = element_364;
		left_290.left = left_365;
		left_290.right = right_366;
		right_366.element = element_376;
		right_366.left = left_377;
		right_366.right = right_378;
		System.out.println(359 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK360() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode left_290 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_365 = right_210;
		int element_208 = 0;
		int element_289 = 2;
		int element_1 = 3;
		int element_364 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_291 = null;
		BinaryNode right_366 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		left_290.element = element_364;
		left_290.left = left_365;
		left_290.right = right_366;
		System.out.println(360 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK361() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode left_290 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_365 = left_290;
		int element_208 = 0;
		int element_289 = 2;
		int element_1 = 3;
		int element_364 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_291 = null;
		BinaryNode right_366 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		left_290.element = element_364;
		left_290.left = left_365;
		left_290.right = right_366;
		System.out.println(361 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK362() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode left_290 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_365 = null;
		BinaryNode right_366 = t;
		int element_208 = 0;
		int element_289 = 2;
		int element_1 = 3;
		int element_364 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_291 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		left_290.element = element_364;
		left_290.left = left_365;
		left_290.right = right_366;
		System.out.println(362 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK363() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode left_290 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_365 = null;
		BinaryNode right_366 = left_2;
		int element_208 = 0;
		int element_289 = 2;
		int element_1 = 3;
		int element_364 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_291 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		left_290.element = element_364;
		left_290.left = left_365;
		left_290.right = right_366;
		System.out.println(363 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK364() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode left_290 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_365 = null;
		BinaryNode right_366 = right_210;
		int element_208 = 0;
		int element_289 = 2;
		int element_1 = 3;
		int element_364 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_291 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		left_290.element = element_364;
		left_290.left = left_365;
		left_290.right = right_366;
		System.out.println(364 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK365() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode left_290 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_365 = null;
		BinaryNode right_366 = left_290;
		int element_208 = 0;
		int element_289 = 2;
		int element_1 = 3;
		int element_364 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_291 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		left_290.element = element_364;
		left_290.left = left_365;
		left_290.right = right_366;
		System.out.println(365 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK366() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode left_290 = new BinaryNode();
		BinaryNode right_366 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_365 = null;
		int element_208 = -2;
		int element_289 = 0;
		int element_391 = -1;
		int element_1 = 1;
		int element_364 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_291 = null;
		BinaryNode left_392 = null;
		BinaryNode right_393 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		left_290.element = element_364;
		left_290.left = left_365;
		left_290.right = right_366;
		right_366.element = element_391;
		right_366.left = left_392;
		right_366.right = right_393;
		System.out.println(366 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK367() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode left_290 = new BinaryNode();
		BinaryNode right_366 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_365 = null;
		int element_208 = -2;
		int element_289 = 0;
		int element_391 = 0;
		int element_1 = 1;
		int element_364 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_291 = null;
		BinaryNode left_392 = null;
		BinaryNode right_393 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		left_290.element = element_364;
		left_290.left = left_365;
		left_290.right = right_366;
		right_366.element = element_391;
		right_366.left = left_392;
		right_366.right = right_393;
		System.out.println(367 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK368() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode left_290 = new BinaryNode();
		BinaryNode left_365 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_398 = t;
		int element_208 = 0;
		int element_289 = 3;
		int element_1 = 4;
		int element_397 = 1;
		int element_364 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_291 = null;
		BinaryNode right_366 = null;
		BinaryNode right_399 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		left_290.element = element_364;
		left_290.left = left_365;
		left_290.right = right_366;
		left_365.element = element_397;
		left_365.left = left_398;
		left_365.right = right_399;
		System.out.println(368 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK369() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode left_290 = new BinaryNode();
		BinaryNode left_365 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_398 = left_2;
		int element_208 = 0;
		int element_289 = 3;
		int element_1 = 4;
		int element_397 = 1;
		int element_364 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_291 = null;
		BinaryNode right_366 = null;
		BinaryNode right_399 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		left_290.element = element_364;
		left_290.left = left_365;
		left_290.right = right_366;
		left_365.element = element_397;
		left_365.left = left_398;
		left_365.right = right_399;
		System.out.println(369 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK370() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode left_290 = new BinaryNode();
		BinaryNode left_365 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_398 = right_210;
		int element_208 = 0;
		int element_289 = 3;
		int element_1 = 4;
		int element_397 = 1;
		int element_364 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_291 = null;
		BinaryNode right_366 = null;
		BinaryNode right_399 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		left_290.element = element_364;
		left_290.left = left_365;
		left_290.right = right_366;
		left_365.element = element_397;
		left_365.left = left_398;
		left_365.right = right_399;
		System.out.println(370 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK371() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode left_290 = new BinaryNode();
		BinaryNode left_365 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_398 = left_290;
		int element_208 = 0;
		int element_289 = 3;
		int element_1 = 4;
		int element_397 = 1;
		int element_364 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_291 = null;
		BinaryNode right_366 = null;
		BinaryNode right_399 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		left_290.element = element_364;
		left_290.left = left_365;
		left_290.right = right_366;
		left_365.element = element_397;
		left_365.left = left_398;
		left_365.right = right_399;
		System.out.println(371 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK372() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode left_290 = new BinaryNode();
		BinaryNode left_365 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		BinaryNode left_398 = left_365;
		int element_208 = 0;
		int element_289 = 3;
		int element_1 = 4;
		int element_397 = 1;
		int element_364 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_291 = null;
		BinaryNode right_366 = null;
		BinaryNode right_399 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		left_290.element = element_364;
		left_290.left = left_365;
		left_290.right = right_366;
		left_365.element = element_397;
		left_365.left = left_398;
		left_365.right = right_399;
		System.out.println(372 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK373() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode left_290 = new BinaryNode();
		BinaryNode left_365 = new BinaryNode();
		BinaryNode left_398 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		int element_208 = 0;
		int element_289 = 3;
		int element_1 = 4;
		int element_397 = 1;
		int element_406 = 0;
		int element_364 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_291 = null;
		BinaryNode right_366 = null;
		BinaryNode right_399 = null;
		BinaryNode left_407 = null;
		BinaryNode right_408 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		left_290.element = element_364;
		left_290.left = left_365;
		left_290.right = right_366;
		left_365.element = element_397;
		left_365.left = left_398;
		left_365.right = right_399;
		left_398.element = element_406;
		left_398.left = left_407;
		left_398.right = right_408;
		System.out.println(373 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK374() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode left_290 = new BinaryNode();
		BinaryNode left_365 = new BinaryNode();
		BinaryNode left_398 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		int element_208 = -1;
		int element_289 = 2;
		int element_1 = 3;
		int element_397 = 0;
		int element_406 = 0;
		int element_364 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_291 = null;
		BinaryNode right_366 = null;
		BinaryNode right_399 = null;
		BinaryNode left_407 = null;
		BinaryNode right_408 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		left_290.element = element_364;
		left_290.left = left_365;
		left_290.right = right_366;
		left_365.element = element_397;
		left_365.left = left_398;
		left_365.right = right_399;
		left_398.element = element_406;
		left_398.left = left_407;
		left_398.right = right_408;
		System.out.println(374 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK375() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode left_290 = new BinaryNode();
		BinaryNode left_365 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		int element_208 = 0;
		int element_289 = 2;
		int element_1 = 3;
		int element_397 = 0;
		int element_364 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_291 = null;
		BinaryNode right_366 = null;
		BinaryNode left_398 = null;
		BinaryNode right_399 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		left_290.element = element_364;
		left_290.left = left_365;
		left_290.right = right_366;
		left_365.element = element_397;
		left_365.left = left_398;
		left_365.right = right_399;
		System.out.println(375 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK376() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode left_290 = new BinaryNode();
		BinaryNode left_365 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		int element_208 = -1;
		int element_289 = 1;
		int element_1 = 2;
		int element_397 = 0;
		int element_364 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_291 = null;
		BinaryNode right_366 = null;
		BinaryNode left_398 = null;
		BinaryNode right_399 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		left_290.element = element_364;
		left_290.left = left_365;
		left_290.right = right_366;
		left_365.element = element_397;
		left_365.left = left_398;
		left_365.right = right_399;
		System.out.println(376 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK377() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode left_290 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		int element_1 = 2;
		int element_208 = 0;
		int element_289 = 1;
		int element_364 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_291 = null;
		BinaryNode left_365 = null;
		BinaryNode right_366 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		left_290.element = element_364;
		left_290.left = left_365;
		left_290.right = right_366;
		System.out.println(377 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK378() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode left_290 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		int element_1 = 1;
		int element_208 = -1;
		int element_289 = 0;
		int element_364 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_291 = null;
		BinaryNode left_365 = null;
		BinaryNode right_366 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		left_290.element = element_364;
		left_290.left = left_365;
		left_290.right = right_366;
		System.out.println(378 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK379() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		int element_1 = 0;
		int element_208 = -1;
		int element_289 = -1;
		BinaryNode right_3 = null;
		BinaryNode left_290 = null;
		BinaryNode right_291 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(379 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK380() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_209 = null;
		int element_1 = 0;
		int element_208 = -1;
		int element_289 = 0;
		BinaryNode right_3 = null;
		BinaryNode left_290 = null;
		BinaryNode right_291 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		right_210.element = element_289;
		right_210.left = left_290;
		right_210.right = right_291;
		System.out.println(380 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK381() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = t;
		int element_1 = 0;
		int element_208 = -1;
		int element_412 = -2;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(381 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK382() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = left_2;
		int element_1 = 1;
		int element_208 = 0;
		int element_412 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(382 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK383() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = left_209;
		int element_1 = 1;
		int element_208 = 0;
		int element_412 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(383 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK384() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = t;
		int element_1 = 1;
		int element_208 = 0;
		int element_412 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(384 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK385() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = left_2;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(385 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK386() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = left_209;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(386 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK387() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = left_413;
		BinaryNode right_210 = t;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		BinaryNode right_3 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(387 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK388() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = left_413;
		BinaryNode right_210 = left_2;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		BinaryNode right_3 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(388 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK389() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = left_413;
		BinaryNode right_210 = left_209;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		BinaryNode right_3 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(389 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK390() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = left_413;
		BinaryNode right_210 = left_413;
		BinaryNode right_3 = t;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(390 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK391() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = left_413;
		BinaryNode right_210 = left_413;
		BinaryNode right_3 = left_2;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(391 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK392() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = left_413;
		BinaryNode right_210 = left_413;
		BinaryNode right_3 = left_209;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(392 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK393() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = left_413;
		BinaryNode right_210 = left_413;
		BinaryNode right_3 = left_413;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(393 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK394() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = left_413;
		BinaryNode right_210 = left_413;
		BinaryNode right_3 = right_414;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(394 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK395() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = left_413;
		BinaryNode right_210 = left_413;
		BinaryNode right_3 = right_210;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(395 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK396() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = left_413;
		BinaryNode right_210 = left_413;
		BinaryNode right_3 = null;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(396 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK397() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = left_413;
		BinaryNode right_210 = left_413;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		int element_415 = 0;
		BinaryNode left_416 = null;
		BinaryNode right_417 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_3.element = element_415;
		right_3.left = left_416;
		right_3.right = right_417;
		System.out.println(397 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK398() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = left_413;
		BinaryNode right_210 = right_414;
		BinaryNode right_3 = t;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(398 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK399() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = left_413;
		BinaryNode right_210 = right_414;
		BinaryNode right_3 = left_2;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(399 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK400() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = left_413;
		BinaryNode right_210 = right_414;
		BinaryNode right_3 = left_209;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(400 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK401() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = left_413;
		BinaryNode right_210 = right_414;
		BinaryNode right_3 = left_413;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(401 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK402() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = left_413;
		BinaryNode right_210 = right_414;
		BinaryNode right_3 = right_414;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(402 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK403() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = left_413;
		BinaryNode right_210 = right_414;
		BinaryNode right_3 = right_210;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(403 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK404() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = left_413;
		BinaryNode right_210 = right_414;
		BinaryNode right_3 = null;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(404 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK405() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = left_413;
		BinaryNode right_210 = right_414;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		int element_421 = 0;
		BinaryNode left_422 = null;
		BinaryNode right_423 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_3.element = element_421;
		right_3.left = left_422;
		right_3.right = right_423;
		System.out.println(405 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK406() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = left_413;
		BinaryNode right_210 = null;
		BinaryNode right_3 = t;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(406 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK407() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = left_413;
		BinaryNode right_210 = null;
		BinaryNode right_3 = left_2;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(407 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK408() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = left_413;
		BinaryNode right_210 = null;
		BinaryNode right_3 = left_209;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(408 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK409() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = left_413;
		BinaryNode right_210 = null;
		BinaryNode right_3 = left_413;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(409 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK410() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = left_413;
		BinaryNode right_210 = null;
		BinaryNode right_3 = right_414;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(410 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK411() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = left_413;
		BinaryNode right_210 = null;
		BinaryNode right_3 = right_210;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(411 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK412() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = left_413;
		BinaryNode right_210 = null;
		BinaryNode right_3 = null;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(412 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK413() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = left_413;
		BinaryNode right_210 = null;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		int element_427 = 0;
		BinaryNode left_428 = null;
		BinaryNode right_429 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_3.element = element_427;
		right_3.left = left_428;
		right_3.right = right_429;
		System.out.println(413 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK414() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = left_413;
		BinaryNode left_434 = t;
		int element_208 = 0;
		int element_412 = -1;
		int element_433 = 1;
		int element_1 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_435 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_210.element = element_433;
		right_210.left = left_434;
		right_210.right = right_435;
		System.out.println(414 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK415() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = left_413;
		BinaryNode left_434 = left_2;
		int element_208 = 0;
		int element_412 = -1;
		int element_433 = 1;
		int element_1 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_435 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_210.element = element_433;
		right_210.left = left_434;
		right_210.right = right_435;
		System.out.println(415 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK416() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = left_413;
		BinaryNode left_434 = left_209;
		int element_208 = 0;
		int element_412 = -1;
		int element_433 = 1;
		int element_1 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_435 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_210.element = element_433;
		right_210.left = left_434;
		right_210.right = right_435;
		System.out.println(416 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK417() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = left_413;
		BinaryNode left_434 = right_210;
		int element_208 = 0;
		int element_412 = -1;
		int element_433 = 1;
		int element_1 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_435 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_210.element = element_433;
		right_210.left = left_434;
		right_210.right = right_435;
		System.out.println(417 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK418() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode left_434 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = left_413;
		int element_445 = 0;
		int element_208 = 0;
		int element_412 = -1;
		int element_433 = 1;
		int element_1 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_435 = null;
		BinaryNode left_446 = null;
		BinaryNode right_447 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_210.element = element_433;
		right_210.left = left_434;
		right_210.right = right_435;
		left_434.element = element_445;
		left_434.left = left_446;
		left_434.right = right_447;
		System.out.println(418 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK419() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode left_434 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = left_413;
		int element_445 = 0;
		int element_208 = -1;
		int element_412 = -2;
		int element_433 = 0;
		int element_1 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_435 = null;
		BinaryNode left_446 = null;
		BinaryNode right_447 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_210.element = element_433;
		right_210.left = left_434;
		right_210.right = right_435;
		left_434.element = element_445;
		left_434.left = left_446;
		left_434.right = right_447;
		System.out.println(419 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK420() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = left_413;
		int element_208 = 0;
		int element_412 = -1;
		int element_433 = 0;
		int element_1 = 1;
		BinaryNode right_3 = null;
		BinaryNode left_434 = null;
		BinaryNode right_435 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_210.element = element_433;
		right_210.left = left_434;
		right_210.right = right_435;
		System.out.println(420 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK421() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = left_413;
		int element_208 = 0;
		int element_412 = -1;
		int element_433 = 1;
		int element_1 = 1;
		BinaryNode right_3 = null;
		BinaryNode left_434 = null;
		BinaryNode right_435 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_210.element = element_433;
		right_210.left = left_434;
		right_210.right = right_435;
		System.out.println(421 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK422() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = null;
		BinaryNode right_210 = t;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		BinaryNode right_3 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(422 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK423() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = null;
		BinaryNode right_210 = left_2;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		BinaryNode right_3 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(423 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK424() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = null;
		BinaryNode right_210 = left_209;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		BinaryNode right_3 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(424 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK425() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = null;
		BinaryNode right_210 = left_413;
		BinaryNode right_3 = t;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(425 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK426() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = null;
		BinaryNode right_210 = left_413;
		BinaryNode right_3 = left_2;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(426 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK427() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = null;
		BinaryNode right_210 = left_413;
		BinaryNode right_3 = left_209;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(427 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK428() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = null;
		BinaryNode right_210 = left_413;
		BinaryNode right_3 = left_413;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(428 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK429() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = null;
		BinaryNode right_210 = left_413;
		BinaryNode right_3 = right_414;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(429 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK430() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = null;
		BinaryNode right_210 = left_413;
		BinaryNode right_3 = right_210;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(430 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK431() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = null;
		BinaryNode right_210 = left_413;
		BinaryNode right_3 = null;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(431 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK432() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = null;
		BinaryNode right_210 = left_413;
		int element_208 = 0;
		int element_412 = -1;
		int element_451 = 0;
		int element_1 = 1;
		BinaryNode left_452 = null;
		BinaryNode right_453 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_3.element = element_451;
		right_3.left = left_452;
		right_3.right = right_453;
		System.out.println(432 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK433() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = null;
		BinaryNode right_210 = right_414;
		BinaryNode right_3 = t;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(433 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK434() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = null;
		BinaryNode right_210 = right_414;
		BinaryNode right_3 = left_2;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(434 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK435() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = null;
		BinaryNode right_210 = right_414;
		BinaryNode right_3 = left_209;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(435 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK436() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = null;
		BinaryNode right_210 = right_414;
		BinaryNode right_3 = left_413;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(436 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK437() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = null;
		BinaryNode right_210 = right_414;
		BinaryNode right_3 = right_414;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(437 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK438() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = null;
		BinaryNode right_210 = right_414;
		BinaryNode right_3 = right_210;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(438 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK439() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = null;
		BinaryNode right_210 = right_414;
		BinaryNode right_3 = null;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(439 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK440() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = null;
		BinaryNode right_210 = right_414;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		int element_457 = 0;
		BinaryNode left_458 = null;
		BinaryNode right_459 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_3.element = element_457;
		right_3.left = left_458;
		right_3.right = right_459;
		System.out.println(440 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK441() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = null;
		BinaryNode right_210 = null;
		BinaryNode right_3 = t;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(441 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK442() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = null;
		BinaryNode right_210 = null;
		BinaryNode right_3 = left_2;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(442 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK443() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = null;
		BinaryNode right_210 = null;
		BinaryNode right_3 = left_209;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(443 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK444() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = null;
		BinaryNode right_210 = null;
		BinaryNode right_3 = left_413;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(444 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK445() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = null;
		BinaryNode right_210 = null;
		BinaryNode right_3 = right_414;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(445 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK446() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = null;
		BinaryNode right_210 = null;
		BinaryNode right_3 = right_210;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(446 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK447() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = null;
		BinaryNode right_210 = null;
		BinaryNode right_3 = null;
		int element_208 = 0;
		int element_412 = -1;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(447 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK448() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = null;
		BinaryNode right_210 = null;
		int element_208 = 0;
		int element_412 = -1;
		int element_463 = 0;
		int element_1 = 1;
		BinaryNode left_464 = null;
		BinaryNode right_465 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_3.element = element_463;
		right_3.left = left_464;
		right_3.right = right_465;
		System.out.println(448 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK449() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = null;
		BinaryNode left_470 = t;
		int element_208 = 0;
		int element_412 = -1;
		int element_469 = 1;
		int element_1 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_471 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_210.element = element_469;
		right_210.left = left_470;
		right_210.right = right_471;
		System.out.println(449 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK450() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = null;
		BinaryNode left_470 = left_2;
		int element_208 = 0;
		int element_412 = -1;
		int element_469 = 1;
		int element_1 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_471 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_210.element = element_469;
		right_210.left = left_470;
		right_210.right = right_471;
		System.out.println(450 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK451() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = null;
		BinaryNode left_470 = left_209;
		int element_208 = 0;
		int element_412 = -1;
		int element_469 = 1;
		int element_1 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_471 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_210.element = element_469;
		right_210.left = left_470;
		right_210.right = right_471;
		System.out.println(451 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK452() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = null;
		BinaryNode left_470 = right_210;
		int element_208 = 0;
		int element_412 = -1;
		int element_469 = 1;
		int element_1 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_471 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_210.element = element_469;
		right_210.left = left_470;
		right_210.right = right_471;
		System.out.println(452 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK453() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode left_470 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = null;
		int element_208 = 0;
		int element_412 = -1;
		int element_469 = 1;
		int element_481 = 0;
		int element_1 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_471 = null;
		BinaryNode left_482 = null;
		BinaryNode right_483 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_210.element = element_469;
		right_210.left = left_470;
		right_210.right = right_471;
		left_470.element = element_481;
		left_470.left = left_482;
		left_470.right = right_483;
		System.out.println(453 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK454() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		BinaryNode left_470 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = null;
		int element_208 = -1;
		int element_412 = -2;
		int element_469 = 0;
		int element_481 = 0;
		int element_1 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_471 = null;
		BinaryNode left_482 = null;
		BinaryNode right_483 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_210.element = element_469;
		right_210.left = left_470;
		right_210.right = right_471;
		left_470.element = element_481;
		left_470.left = left_482;
		left_470.right = right_483;
		System.out.println(454 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK455() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = null;
		int element_208 = 0;
		int element_412 = -1;
		int element_469 = 0;
		int element_1 = 1;
		BinaryNode right_3 = null;
		BinaryNode left_470 = null;
		BinaryNode right_471 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_210.element = element_469;
		right_210.left = left_470;
		right_210.right = right_471;
		System.out.println(455 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK456() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_210 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode right_414 = null;
		int element_208 = 0;
		int element_412 = -1;
		int element_469 = 1;
		int element_1 = 1;
		BinaryNode right_3 = null;
		BinaryNode left_470 = null;
		BinaryNode right_471 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_210.element = element_469;
		right_210.left = left_470;
		right_210.right = right_471;
		System.out.println(456 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK457() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_414 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode left_488 = t;
		int element_208 = 0;
		int element_412 = -2;
		int element_1 = 1;
		int element_487 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_489 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_414.element = element_487;
		right_414.left = left_488;
		right_414.right = right_489;
		System.out.println(457 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK458() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_414 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode left_488 = left_2;
		int element_208 = 0;
		int element_412 = -2;
		int element_1 = 1;
		int element_487 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_489 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_414.element = element_487;
		right_414.left = left_488;
		right_414.right = right_489;
		System.out.println(458 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK459() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_414 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode left_488 = left_209;
		int element_208 = 0;
		int element_412 = -2;
		int element_1 = 1;
		int element_487 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_489 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_414.element = element_487;
		right_414.left = left_488;
		right_414.right = right_489;
		System.out.println(459 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK460() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_414 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode left_488 = left_413;
		BinaryNode right_489 = t;
		int element_208 = 0;
		int element_412 = -2;
		int element_1 = 1;
		int element_487 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_414.element = element_487;
		right_414.left = left_488;
		right_414.right = right_489;
		System.out.println(460 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK461() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_414 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode left_488 = left_413;
		BinaryNode right_489 = left_2;
		int element_208 = 0;
		int element_412 = -2;
		int element_1 = 1;
		int element_487 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_414.element = element_487;
		right_414.left = left_488;
		right_414.right = right_489;
		System.out.println(461 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK462() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_414 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode left_488 = left_413;
		BinaryNode right_489 = left_209;
		int element_208 = 0;
		int element_412 = -2;
		int element_1 = 1;
		int element_487 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_414.element = element_487;
		right_414.left = left_488;
		right_414.right = right_489;
		System.out.println(462 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK463() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_414 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode left_488 = left_413;
		BinaryNode right_489 = right_414;
		int element_208 = 0;
		int element_412 = -2;
		int element_1 = 1;
		int element_487 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_414.element = element_487;
		right_414.left = left_488;
		right_414.right = right_489;
		System.out.println(463 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK464() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_414 = new BinaryNode();
		BinaryNode right_489 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode left_488 = left_413;
		int element_208 = 0;
		int element_499 = -1;
		int element_412 = -2;
		int element_1 = 1;
		int element_487 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode left_500 = null;
		BinaryNode right_501 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_414.element = element_487;
		right_414.left = left_488;
		right_414.right = right_489;
		right_489.element = element_499;
		right_489.left = left_500;
		right_489.right = right_501;
		System.out.println(464 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK465() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_414 = new BinaryNode();
		BinaryNode right_489 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode left_488 = left_413;
		int element_208 = 0;
		int element_499 = 0;
		int element_412 = -2;
		int element_1 = 1;
		int element_487 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode left_500 = null;
		BinaryNode right_501 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_414.element = element_487;
		right_414.left = left_488;
		right_414.right = right_489;
		right_489.element = element_499;
		right_489.left = left_500;
		right_489.right = right_501;
		System.out.println(465 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK466() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_414 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode left_488 = right_414;
		int element_208 = 0;
		int element_412 = -2;
		int element_1 = 1;
		int element_487 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_489 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_414.element = element_487;
		right_414.left = left_488;
		right_414.right = right_489;
		System.out.println(466 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK467() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_414 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode left_488 = null;
		BinaryNode right_489 = t;
		int element_208 = 0;
		int element_412 = -2;
		int element_1 = 1;
		int element_487 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_414.element = element_487;
		right_414.left = left_488;
		right_414.right = right_489;
		System.out.println(467 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK468() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_414 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode left_488 = null;
		BinaryNode right_489 = left_2;
		int element_208 = 0;
		int element_412 = -2;
		int element_1 = 1;
		int element_487 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_414.element = element_487;
		right_414.left = left_488;
		right_414.right = right_489;
		System.out.println(468 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK469() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_414 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode left_488 = null;
		BinaryNode right_489 = left_209;
		int element_208 = 0;
		int element_412 = -2;
		int element_1 = 1;
		int element_487 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_414.element = element_487;
		right_414.left = left_488;
		right_414.right = right_489;
		System.out.println(469 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK470() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_414 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode left_488 = null;
		BinaryNode right_489 = right_414;
		int element_208 = 0;
		int element_412 = -2;
		int element_1 = 1;
		int element_487 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_414.element = element_487;
		right_414.left = left_488;
		right_414.right = right_489;
		System.out.println(470 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK471() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_414 = new BinaryNode();
		BinaryNode right_489 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode left_488 = null;
		int element_514 = -1;
		int element_208 = 0;
		int element_412 = -2;
		int element_1 = 1;
		int element_487 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode left_515 = null;
		BinaryNode right_516 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_414.element = element_487;
		right_414.left = left_488;
		right_414.right = right_489;
		right_489.element = element_514;
		right_489.left = left_515;
		right_489.right = right_516;
		System.out.println(471 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK472() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_414 = new BinaryNode();
		BinaryNode right_489 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode left_488 = null;
		int element_514 = 0;
		int element_208 = 0;
		int element_412 = -2;
		int element_1 = 1;
		int element_487 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode left_515 = null;
		BinaryNode right_516 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_414.element = element_487;
		right_414.left = left_488;
		right_414.right = right_489;
		right_489.element = element_514;
		right_489.left = left_515;
		right_489.right = right_516;
		System.out.println(472 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK473() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_414 = new BinaryNode();
		BinaryNode left_488 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode left_521 = t;
		int element_520 = -2;
		int element_208 = 0;
		int element_412 = -3;
		int element_1 = 1;
		int element_487 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_489 = null;
		BinaryNode right_522 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_414.element = element_487;
		right_414.left = left_488;
		right_414.right = right_489;
		left_488.element = element_520;
		left_488.left = left_521;
		left_488.right = right_522;
		System.out.println(473 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK474() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_414 = new BinaryNode();
		BinaryNode left_488 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode left_521 = left_2;
		int element_520 = -2;
		int element_208 = 0;
		int element_412 = -3;
		int element_1 = 1;
		int element_487 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_489 = null;
		BinaryNode right_522 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_414.element = element_487;
		right_414.left = left_488;
		right_414.right = right_489;
		left_488.element = element_520;
		left_488.left = left_521;
		left_488.right = right_522;
		System.out.println(474 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK475() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_414 = new BinaryNode();
		BinaryNode left_488 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode left_521 = left_209;
		int element_520 = 1;
		int element_208 = 3;
		int element_412 = 0;
		int element_1 = 4;
		int element_487 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_489 = null;
		BinaryNode right_522 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_414.element = element_487;
		right_414.left = left_488;
		right_414.right = right_489;
		left_488.element = element_520;
		left_488.left = left_521;
		left_488.right = right_522;
		System.out.println(475 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK476() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_414 = new BinaryNode();
		BinaryNode left_488 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode left_521 = right_414;
		int element_520 = 1;
		int element_208 = 3;
		int element_412 = 0;
		int element_1 = 4;
		int element_487 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_489 = null;
		BinaryNode right_522 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_414.element = element_487;
		right_414.left = left_488;
		right_414.right = right_489;
		left_488.element = element_520;
		left_488.left = left_521;
		left_488.right = right_522;
		System.out.println(476 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK477() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_414 = new BinaryNode();
		BinaryNode left_488 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		BinaryNode left_521 = left_488;
		int element_520 = 1;
		int element_208 = 3;
		int element_412 = 0;
		int element_1 = 4;
		int element_487 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_489 = null;
		BinaryNode right_522 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_414.element = element_487;
		right_414.left = left_488;
		right_414.right = right_489;
		left_488.element = element_520;
		left_488.left = left_521;
		left_488.right = right_522;
		System.out.println(477 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK478() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_414 = new BinaryNode();
		BinaryNode left_488 = new BinaryNode();
		BinaryNode left_521 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		int element_520 = 1;
		int element_208 = 3;
		int element_412 = 0;
		int element_529 = 0;
		int element_1 = 4;
		int element_487 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_489 = null;
		BinaryNode right_522 = null;
		BinaryNode left_530 = null;
		BinaryNode right_531 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_414.element = element_487;
		right_414.left = left_488;
		right_414.right = right_489;
		left_488.element = element_520;
		left_488.left = left_521;
		left_488.right = right_522;
		left_521.element = element_529;
		left_521.left = left_530;
		left_521.right = right_531;
		System.out.println(478 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK479() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_414 = new BinaryNode();
		BinaryNode left_488 = new BinaryNode();
		BinaryNode left_521 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		int element_520 = 0;
		int element_208 = 2;
		int element_412 = -1;
		int element_529 = 0;
		int element_1 = 3;
		int element_487 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_489 = null;
		BinaryNode right_522 = null;
		BinaryNode left_530 = null;
		BinaryNode right_531 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_414.element = element_487;
		right_414.left = left_488;
		right_414.right = right_489;
		left_488.element = element_520;
		left_488.left = left_521;
		left_488.right = right_522;
		left_521.element = element_529;
		left_521.left = left_530;
		left_521.right = right_531;
		System.out.println(479 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK480() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_414 = new BinaryNode();
		BinaryNode left_488 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		int element_520 = 0;
		int element_208 = 2;
		int element_412 = 0;
		int element_1 = 3;
		int element_487 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_489 = null;
		BinaryNode left_521 = null;
		BinaryNode right_522 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_414.element = element_487;
		right_414.left = left_488;
		right_414.right = right_489;
		left_488.element = element_520;
		left_488.left = left_521;
		left_488.right = right_522;
		System.out.println(480 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK481() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_414 = new BinaryNode();
		BinaryNode left_488 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		int element_520 = 0;
		int element_208 = 1;
		int element_412 = -1;
		int element_1 = 2;
		int element_487 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_489 = null;
		BinaryNode left_521 = null;
		BinaryNode right_522 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_414.element = element_487;
		right_414.left = left_488;
		right_414.right = right_489;
		left_488.element = element_520;
		left_488.left = left_521;
		left_488.right = right_522;
		System.out.println(481 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK482() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_414 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		int element_1 = 1;
		int element_208 = 0;
		int element_412 = -1;
		int element_487 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode left_488 = null;
		BinaryNode right_489 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_414.element = element_487;
		right_414.left = left_488;
		right_414.right = right_489;
		System.out.println(482 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK483() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode right_414 = new BinaryNode();
		obj.root = t;
		BinaryNode left_413 = null;
		int element_1 = 1;
		int element_208 = 0;
		int element_412 = -1;
		int element_487 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode left_488 = null;
		BinaryNode right_489 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		right_414.element = element_487;
		right_414.left = left_488;
		right_414.right = right_489;
		System.out.println(483 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK484() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		obj.root = t;
		BinaryNode left_536 = t;
		int element_1 = 1;
		int element_208 = 0;
		int element_535 = -2;
		int element_412 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		BinaryNode right_537 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		System.out.println(484 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK485() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		obj.root = t;
		BinaryNode left_536 = left_2;
		int element_208 = 0;
		int element_535 = -2;
		int element_412 = -1;
		int element_1 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		BinaryNode right_537 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		System.out.println(485 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK486() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		obj.root = t;
		BinaryNode left_536 = left_209;
		int element_208 = 1;
		int element_535 = -1;
		int element_412 = 0;
		int element_1 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		BinaryNode right_537 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		System.out.println(486 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK487() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		obj.root = t;
		BinaryNode left_536 = left_413;
		int element_208 = 1;
		int element_535 = -1;
		int element_412 = 0;
		int element_1 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		BinaryNode right_537 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		System.out.println(487 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK488() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		obj.root = t;
		BinaryNode left_536 = null;
		BinaryNode right_537 = t;
		int element_208 = 1;
		int element_535 = -1;
		int element_412 = 0;
		int element_1 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		System.out.println(488 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK489() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		obj.root = t;
		BinaryNode left_536 = null;
		BinaryNode right_537 = left_2;
		int element_208 = 1;
		int element_535 = -1;
		int element_412 = 0;
		int element_1 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		System.out.println(489 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK490() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		obj.root = t;
		BinaryNode left_536 = null;
		BinaryNode right_537 = left_209;
		int element_208 = 1;
		int element_535 = -1;
		int element_412 = 0;
		int element_1 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		System.out.println(490 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK491() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		obj.root = t;
		BinaryNode left_536 = null;
		BinaryNode right_537 = left_413;
		int element_208 = 1;
		int element_535 = -1;
		int element_412 = 0;
		int element_1 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		System.out.println(491 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK492() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		obj.root = t;
		BinaryNode left_536 = null;
		BinaryNode right_537 = left_536;
		BinaryNode right_414 = t;
		int element_208 = 1;
		int element_535 = -1;
		int element_412 = 0;
		int element_1 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		System.out.println(492 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK493() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		obj.root = t;
		BinaryNode left_536 = null;
		BinaryNode right_537 = left_536;
		BinaryNode right_414 = left_2;
		int element_208 = 1;
		int element_535 = -1;
		int element_412 = 0;
		int element_1 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		System.out.println(493 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK494() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		obj.root = t;
		BinaryNode left_536 = null;
		BinaryNode right_537 = left_536;
		BinaryNode right_414 = left_209;
		int element_208 = 1;
		int element_535 = -1;
		int element_412 = 0;
		int element_1 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		System.out.println(494 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK495() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		obj.root = t;
		BinaryNode left_536 = null;
		BinaryNode right_537 = left_536;
		BinaryNode right_414 = left_413;
		int element_208 = 0;
		int element_535 = -2;
		int element_412 = -1;
		int element_1 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		System.out.println(495 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK496() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		BinaryNode right_414 = new BinaryNode();
		obj.root = t;
		BinaryNode left_536 = null;
		BinaryNode right_537 = left_536;
		int element_208 = 1;
		int element_535 = -1;
		int element_547 = 0;
		int element_412 = 0;
		int element_1 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode left_548 = null;
		BinaryNode right_549 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		right_414.element = element_547;
		right_414.left = left_548;
		right_414.right = right_549;
		System.out.println(496 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK497() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		BinaryNode right_414 = new BinaryNode();
		obj.root = t;
		BinaryNode left_536 = null;
		BinaryNode right_537 = left_536;
		int element_208 = 0;
		int element_535 = -2;
		int element_547 = 0;
		int element_412 = -1;
		int element_1 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode left_548 = null;
		BinaryNode right_549 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		right_414.element = element_547;
		right_414.left = left_548;
		right_414.right = right_549;
		System.out.println(497 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK498() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		obj.root = t;
		BinaryNode left_536 = null;
		BinaryNode right_537 = null;
		BinaryNode right_414 = t;
		int element_208 = 1;
		int element_535 = -1;
		int element_412 = 0;
		int element_1 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		System.out.println(498 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK499() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		obj.root = t;
		BinaryNode left_536 = null;
		BinaryNode right_537 = null;
		BinaryNode right_414 = left_2;
		int element_208 = 1;
		int element_535 = -1;
		int element_412 = 0;
		int element_1 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		System.out.println(499 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK500() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		obj.root = t;
		BinaryNode left_536 = null;
		BinaryNode right_537 = null;
		BinaryNode right_414 = left_209;
		int element_208 = 1;
		int element_535 = -1;
		int element_412 = 0;
		int element_1 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		System.out.println(500 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK501() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		obj.root = t;
		BinaryNode left_536 = null;
		BinaryNode right_537 = null;
		BinaryNode right_414 = left_413;
		int element_208 = 0;
		int element_535 = -2;
		int element_412 = -1;
		int element_1 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		System.out.println(501 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK502() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		BinaryNode right_414 = new BinaryNode();
		obj.root = t;
		BinaryNode left_536 = null;
		BinaryNode right_537 = null;
		int element_208 = 1;
		int element_535 = -1;
		int element_412 = 0;
		int element_1 = 2;
		int element_562 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode left_563 = null;
		BinaryNode right_564 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		right_414.element = element_562;
		right_414.left = left_563;
		right_414.right = right_564;
		System.out.println(502 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK503() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		BinaryNode right_414 = new BinaryNode();
		obj.root = t;
		BinaryNode left_536 = null;
		BinaryNode right_537 = null;
		int element_208 = 0;
		int element_535 = -2;
		int element_412 = -1;
		int element_1 = 1;
		int element_562 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode left_563 = null;
		BinaryNode right_564 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		right_414.element = element_562;
		right_414.left = left_563;
		right_414.right = right_564;
		System.out.println(503 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK504() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		BinaryNode right_537 = new BinaryNode();
		obj.root = t;
		BinaryNode left_536 = null;
		BinaryNode left_569 = t;
		int element_208 = 1;
		int element_535 = -2;
		int element_412 = 0;
		int element_1 = 2;
		int element_568 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		BinaryNode right_570 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		right_537.element = element_568;
		right_537.left = left_569;
		right_537.right = right_570;
		System.out.println(504 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK505() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		BinaryNode right_537 = new BinaryNode();
		obj.root = t;
		BinaryNode left_536 = null;
		BinaryNode left_569 = left_2;
		int element_208 = 1;
		int element_535 = -2;
		int element_412 = 0;
		int element_1 = 2;
		int element_568 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		BinaryNode right_570 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		right_537.element = element_568;
		right_537.left = left_569;
		right_537.right = right_570;
		System.out.println(505 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK506() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		BinaryNode right_537 = new BinaryNode();
		obj.root = t;
		BinaryNode left_536 = null;
		BinaryNode left_569 = left_209;
		int element_208 = 1;
		int element_535 = -2;
		int element_412 = 0;
		int element_1 = 2;
		int element_568 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		BinaryNode right_570 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		right_537.element = element_568;
		right_537.left = left_569;
		right_537.right = right_570;
		System.out.println(506 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK507() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		BinaryNode right_537 = new BinaryNode();
		obj.root = t;
		BinaryNode left_536 = null;
		BinaryNode left_569 = left_413;
		int element_208 = 1;
		int element_535 = -2;
		int element_412 = 0;
		int element_1 = 2;
		int element_568 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		BinaryNode right_570 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		right_537.element = element_568;
		right_537.left = left_569;
		right_537.right = right_570;
		System.out.println(507 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK508() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		BinaryNode right_537 = new BinaryNode();
		obj.root = t;
		BinaryNode left_536 = null;
		BinaryNode left_569 = right_537;
		int element_208 = 1;
		int element_535 = -2;
		int element_412 = 0;
		int element_1 = 2;
		int element_568 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		BinaryNode right_570 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		right_537.element = element_568;
		right_537.left = left_569;
		right_537.right = right_570;
		System.out.println(508 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK509() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		BinaryNode right_537 = new BinaryNode();
		BinaryNode left_569 = new BinaryNode();
		obj.root = t;
		BinaryNode left_536 = null;
		int element_208 = 3;
		int element_535 = 0;
		int element_577 = 0;
		int element_412 = 2;
		int element_1 = 4;
		int element_568 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		BinaryNode right_570 = null;
		BinaryNode left_578 = null;
		BinaryNode right_579 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		right_537.element = element_568;
		right_537.left = left_569;
		right_537.right = right_570;
		left_569.element = element_577;
		left_569.left = left_578;
		left_569.right = right_579;
		System.out.println(509 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK510() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		BinaryNode right_537 = new BinaryNode();
		BinaryNode left_569 = new BinaryNode();
		obj.root = t;
		BinaryNode left_536 = null;
		int element_208 = 2;
		int element_535 = -1;
		int element_577 = 0;
		int element_412 = 1;
		int element_1 = 3;
		int element_568 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		BinaryNode right_570 = null;
		BinaryNode left_578 = null;
		BinaryNode right_579 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		right_537.element = element_568;
		right_537.left = left_569;
		right_537.right = right_570;
		left_569.element = element_577;
		left_569.left = left_578;
		left_569.right = right_579;
		System.out.println(510 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK511() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		BinaryNode right_537 = new BinaryNode();
		obj.root = t;
		BinaryNode left_536 = null;
		int element_208 = 1;
		int element_535 = -1;
		int element_412 = 0;
		int element_1 = 2;
		int element_568 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		BinaryNode left_569 = null;
		BinaryNode right_570 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		right_537.element = element_568;
		right_537.left = left_569;
		right_537.right = right_570;
		System.out.println(511 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK512() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		BinaryNode right_537 = new BinaryNode();
		obj.root = t;
		BinaryNode left_536 = null;
		int element_208 = 1;
		int element_535 = -1;
		int element_412 = 0;
		int element_1 = 2;
		int element_568 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		BinaryNode left_569 = null;
		BinaryNode right_570 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		right_537.element = element_568;
		right_537.left = left_569;
		right_537.right = right_570;
		System.out.println(512 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK513() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		BinaryNode left_536 = new BinaryNode();
		obj.root = t;
		BinaryNode left_584 = t;
		int element_208 = 0;
		int element_535 = -2;
		int element_412 = -1;
		int element_1 = 1;
		int element_583 = -3;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		BinaryNode right_537 = null;
		BinaryNode right_585 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		left_536.element = element_583;
		left_536.left = left_584;
		left_536.right = right_585;
		System.out.println(513 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK514() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		BinaryNode left_536 = new BinaryNode();
		obj.root = t;
		BinaryNode left_584 = left_2;
		int element_208 = 0;
		int element_535 = -2;
		int element_412 = -1;
		int element_1 = 1;
		int element_583 = -3;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		BinaryNode right_537 = null;
		BinaryNode right_585 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		left_536.element = element_583;
		left_536.left = left_584;
		left_536.right = right_585;
		System.out.println(514 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK515() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		BinaryNode left_536 = new BinaryNode();
		obj.root = t;
		BinaryNode left_584 = left_209;
		int element_208 = 1;
		int element_535 = -1;
		int element_412 = 0;
		int element_1 = 2;
		int element_583 = -2;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		BinaryNode right_537 = null;
		BinaryNode right_585 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		left_536.element = element_583;
		left_536.left = left_584;
		left_536.right = right_585;
		System.out.println(515 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK516() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		BinaryNode left_536 = new BinaryNode();
		obj.root = t;
		BinaryNode left_584 = left_413;
		int element_208 = 2;
		int element_535 = 0;
		int element_412 = 1;
		int element_1 = 3;
		int element_583 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		BinaryNode right_537 = null;
		BinaryNode right_585 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		left_536.element = element_583;
		left_536.left = left_584;
		left_536.right = right_585;
		System.out.println(516 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK517() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		BinaryNode left_536 = new BinaryNode();
		obj.root = t;
		BinaryNode left_584 = left_536;
		int element_208 = 2;
		int element_535 = 0;
		int element_412 = 1;
		int element_1 = 3;
		int element_583 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		BinaryNode right_537 = null;
		BinaryNode right_585 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		left_536.element = element_583;
		left_536.left = left_584;
		left_536.right = right_585;
		System.out.println(517 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK518() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		BinaryNode left_536 = new BinaryNode();
		obj.root = t;
		BinaryNode left_584 = null;
		BinaryNode right_585 = t;
		int element_208 = 2;
		int element_535 = 0;
		int element_412 = 1;
		int element_1 = 3;
		int element_583 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		BinaryNode right_537 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		left_536.element = element_583;
		left_536.left = left_584;
		left_536.right = right_585;
		System.out.println(518 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK519() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		BinaryNode left_536 = new BinaryNode();
		obj.root = t;
		BinaryNode left_584 = null;
		BinaryNode right_585 = left_2;
		int element_208 = 2;
		int element_535 = 0;
		int element_412 = 1;
		int element_1 = 3;
		int element_583 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		BinaryNode right_537 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		left_536.element = element_583;
		left_536.left = left_584;
		left_536.right = right_585;
		System.out.println(519 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK520() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		BinaryNode left_536 = new BinaryNode();
		obj.root = t;
		BinaryNode left_584 = null;
		BinaryNode right_585 = left_209;
		int element_208 = 2;
		int element_535 = 0;
		int element_412 = 1;
		int element_1 = 3;
		int element_583 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		BinaryNode right_537 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		left_536.element = element_583;
		left_536.left = left_584;
		left_536.right = right_585;
		System.out.println(520 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK521() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		BinaryNode left_536 = new BinaryNode();
		obj.root = t;
		BinaryNode left_584 = null;
		BinaryNode right_585 = left_413;
		int element_208 = 2;
		int element_535 = 0;
		int element_412 = 1;
		int element_1 = 3;
		int element_583 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		BinaryNode right_537 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		left_536.element = element_583;
		left_536.left = left_584;
		left_536.right = right_585;
		System.out.println(521 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK522() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		BinaryNode left_536 = new BinaryNode();
		obj.root = t;
		BinaryNode left_584 = null;
		BinaryNode right_585 = left_536;
		int element_208 = 2;
		int element_535 = 0;
		int element_412 = 1;
		int element_1 = 3;
		int element_583 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		BinaryNode right_537 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		left_536.element = element_583;
		left_536.left = left_584;
		left_536.right = right_585;
		System.out.println(522 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK523() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		BinaryNode left_536 = new BinaryNode();
		BinaryNode right_585 = new BinaryNode();
		obj.root = t;
		BinaryNode left_584 = null;
		int element_208 = 2;
		int element_535 = 0;
		int element_412 = 1;
		int element_1 = 3;
		int element_583 = -1;
		int element_592 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		BinaryNode right_537 = null;
		BinaryNode left_593 = null;
		BinaryNode right_594 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		left_536.element = element_583;
		left_536.left = left_584;
		left_536.right = right_585;
		right_585.element = element_592;
		right_585.left = left_593;
		right_585.right = right_594;
		System.out.println(523 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK524() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		BinaryNode left_536 = new BinaryNode();
		BinaryNode right_585 = new BinaryNode();
		obj.root = t;
		BinaryNode left_584 = null;
		int element_208 = 2;
		int element_535 = 0;
		int element_412 = 1;
		int element_1 = 3;
		int element_583 = -1;
		int element_592 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		BinaryNode right_537 = null;
		BinaryNode left_593 = null;
		BinaryNode right_594 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		left_536.element = element_583;
		left_536.left = left_584;
		left_536.right = right_585;
		right_585.element = element_592;
		right_585.left = left_593;
		right_585.right = right_594;
		System.out.println(524 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK525() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		BinaryNode left_536 = new BinaryNode();
		BinaryNode left_584 = new BinaryNode();
		obj.root = t;
		BinaryNode left_599 = t;
		int element_208 = 0;
		int element_535 = -2;
		int element_412 = -1;
		int element_598 = -4;
		int element_1 = 1;
		int element_583 = -3;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		BinaryNode right_537 = null;
		BinaryNode right_585 = null;
		BinaryNode right_600 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		left_536.element = element_583;
		left_536.left = left_584;
		left_536.right = right_585;
		left_584.element = element_598;
		left_584.left = left_599;
		left_584.right = right_600;
		System.out.println(525 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK526() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		BinaryNode left_536 = new BinaryNode();
		BinaryNode left_584 = new BinaryNode();
		obj.root = t;
		BinaryNode left_599 = left_2;
		int element_208 = 0;
		int element_535 = -2;
		int element_412 = -1;
		int element_598 = -4;
		int element_1 = 1;
		int element_583 = -3;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		BinaryNode right_537 = null;
		BinaryNode right_585 = null;
		BinaryNode right_600 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		left_536.element = element_583;
		left_536.left = left_584;
		left_536.right = right_585;
		left_584.element = element_598;
		left_584.left = left_599;
		left_584.right = right_600;
		System.out.println(526 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK527() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		BinaryNode left_536 = new BinaryNode();
		BinaryNode left_584 = new BinaryNode();
		obj.root = t;
		BinaryNode left_599 = left_209;
		int element_208 = 1;
		int element_535 = -1;
		int element_412 = 0;
		int element_598 = -3;
		int element_1 = 2;
		int element_583 = -2;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		BinaryNode right_537 = null;
		BinaryNode right_585 = null;
		BinaryNode right_600 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		left_536.element = element_583;
		left_536.left = left_584;
		left_536.right = right_585;
		left_584.element = element_598;
		left_584.left = left_599;
		left_584.right = right_600;
		System.out.println(527 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK528() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		BinaryNode left_536 = new BinaryNode();
		BinaryNode left_584 = new BinaryNode();
		obj.root = t;
		BinaryNode left_599 = left_413;
		int element_208 = 2;
		int element_535 = 0;
		int element_412 = 1;
		int element_598 = -2;
		int element_1 = 3;
		int element_583 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		BinaryNode right_537 = null;
		BinaryNode right_585 = null;
		BinaryNode right_600 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		left_536.element = element_583;
		left_536.left = left_584;
		left_536.right = right_585;
		left_584.element = element_598;
		left_584.left = left_599;
		left_584.right = right_600;
		System.out.println(528 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK529() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		BinaryNode left_536 = new BinaryNode();
		BinaryNode left_584 = new BinaryNode();
		obj.root = t;
		BinaryNode left_599 = left_536;
		int element_208 = 3;
		int element_535 = 1;
		int element_412 = 2;
		int element_598 = -1;
		int element_1 = 4;
		int element_583 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		BinaryNode right_537 = null;
		BinaryNode right_585 = null;
		BinaryNode right_600 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		left_536.element = element_583;
		left_536.left = left_584;
		left_536.right = right_585;
		left_584.element = element_598;
		left_584.left = left_599;
		left_584.right = right_600;
		System.out.println(529 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK530() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		BinaryNode left_536 = new BinaryNode();
		BinaryNode left_584 = new BinaryNode();
		obj.root = t;
		BinaryNode left_599 = left_584;
		int element_208 = 3;
		int element_535 = 1;
		int element_412 = 2;
		int element_598 = -1;
		int element_1 = 4;
		int element_583 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		BinaryNode right_537 = null;
		BinaryNode right_585 = null;
		BinaryNode right_600 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		left_536.element = element_583;
		left_536.left = left_584;
		left_536.right = right_585;
		left_584.element = element_598;
		left_584.left = left_599;
		left_584.right = right_600;
		System.out.println(530 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK531() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		BinaryNode left_536 = new BinaryNode();
		BinaryNode left_584 = new BinaryNode();
		BinaryNode left_599 = new BinaryNode();
		obj.root = t;
		int element_208 = 4;
		int element_535 = 2;
		int element_604 = 0;
		int element_412 = 3;
		int element_598 = 0;
		int element_1 = 5;
		int element_583 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		BinaryNode right_537 = null;
		BinaryNode right_585 = null;
		BinaryNode right_600 = null;
		BinaryNode left_605 = null;
		BinaryNode right_606 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		left_536.element = element_583;
		left_536.left = left_584;
		left_536.right = right_585;
		left_584.element = element_598;
		left_584.left = left_599;
		left_584.right = right_600;
		left_599.element = element_604;
		left_599.left = left_605;
		left_599.right = right_606;
		System.out.println(531 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK532() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		BinaryNode left_536 = new BinaryNode();
		BinaryNode left_584 = new BinaryNode();
		obj.root = t;
		int element_208 = 3;
		int element_535 = 1;
		int element_412 = 2;
		int element_598 = 0;
		int element_1 = 4;
		int element_583 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		BinaryNode right_537 = null;
		BinaryNode right_585 = null;
		BinaryNode left_599 = null;
		BinaryNode right_600 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		left_536.element = element_583;
		left_536.left = left_584;
		left_536.right = right_585;
		left_584.element = element_598;
		left_584.left = left_599;
		left_584.right = right_600;
		System.out.println(532 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK533() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		BinaryNode left_536 = new BinaryNode();
		obj.root = t;
		int element_1 = 3;
		int element_208 = 2;
		int element_535 = 0;
		int element_412 = 1;
		int element_583 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		BinaryNode right_537 = null;
		BinaryNode left_584 = null;
		BinaryNode right_585 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		left_536.element = element_583;
		left_536.left = left_584;
		left_536.right = right_585;
		System.out.println(533 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK534() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		BinaryNode left_413 = new BinaryNode();
		obj.root = t;
		int element_1 = 2;
		int element_208 = 1;
		int element_535 = 0;
		int element_412 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode right_414 = null;
		BinaryNode left_536 = null;
		BinaryNode right_537 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		left_413.element = element_535;
		left_413.left = left_536;
		left_413.right = right_537;
		System.out.println(534 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK535() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_209 = new BinaryNode();
		obj.root = t;
		int element_1 = 1;
		int element_208 = 0;
		int element_412 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_210 = null;
		BinaryNode left_413 = null;
		BinaryNode right_414 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		left_209.element = element_412;
		left_209.left = left_413;
		left_209.right = right_414;
		System.out.println(535 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK536() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		obj.root = t;
		int element_1 = 0;
		int element_208 = 0;
		BinaryNode right_3 = null;
		BinaryNode left_209 = null;
		BinaryNode right_210 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_208;
		left_2.left = left_209;
		left_2.right = right_210;
		System.out.println(536 + " " + Utilities.repOK(obj));
		obj.repOK(t);
	}

}

