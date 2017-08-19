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
		System.out.println(Utilities.repOK(obj));
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
		System.out.println(Utilities.repOK(obj));
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
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK4() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode right_3 = null;
		int element_1 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK5() throws Exception {
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
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK6() throws Exception {
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
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK7() throws Exception {
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
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK8() throws Exception {
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
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK9() throws Exception {
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
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK10() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
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
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK11() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
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
		System.out.println(Utilities.repOK(obj));
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
		BinaryNode left_5 = null;
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
		System.out.println(Utilities.repOK(obj));
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
		BinaryNode left_5 = null;
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
		System.out.println(Utilities.repOK(obj));
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
		BinaryNode left_5 = null;
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
		System.out.println(Utilities.repOK(obj));
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
		BinaryNode left_5 = null;
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
		System.out.println(Utilities.repOK(obj));
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
		BinaryNode left_5 = null;
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
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK17() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		BinaryNode right_9 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode left_8 = null;
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
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK18() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		BinaryNode left_8 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode left_17 = t;
		int element_16 = 1;
		int element_4 = 0;
		int element_1 = -1;
		int element_7 = 2;
		BinaryNode right_9 = null;
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
		left_8.element = element_16;
		left_8.left = left_17;
		left_8.right = right_18;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK19() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		BinaryNode left_8 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode left_17 = right_3;
		int element_16 = 1;
		int element_4 = 0;
		int element_1 = -1;
		int element_7 = 2;
		BinaryNode right_9 = null;
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
		left_8.element = element_16;
		left_8.left = left_17;
		left_8.right = right_18;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK20() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		BinaryNode left_8 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode left_17 = right_6;
		int element_16 = 1;
		int element_4 = 0;
		int element_1 = -1;
		int element_7 = 2;
		BinaryNode right_9 = null;
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
		left_8.element = element_16;
		left_8.left = left_17;
		left_8.right = right_18;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK21() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		BinaryNode left_8 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		BinaryNode left_17 = left_8;
		int element_16 = 1;
		int element_4 = 0;
		int element_1 = -1;
		int element_7 = 2;
		BinaryNode right_9 = null;
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
		left_8.element = element_16;
		left_8.left = left_17;
		left_8.right = right_18;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK22() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		BinaryNode left_8 = new BinaryNode();
		BinaryNode left_17 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		int element_16 = 1;
		int element_4 = 0;
		int element_1 = -1;
		int element_7 = 2;
		int element_22 = 0;
		BinaryNode right_9 = null;
		BinaryNode right_18 = null;
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
		left_8.element = element_16;
		left_8.left = left_17;
		left_8.right = right_18;
		left_17.element = element_22;
		left_17.left = left_23;
		left_17.right = right_24;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK23() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		BinaryNode left_8 = new BinaryNode();
		BinaryNode left_17 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		int element_16 = 0;
		int element_4 = -1;
		int element_1 = -2;
		int element_7 = 1;
		int element_22 = 0;
		BinaryNode right_9 = null;
		BinaryNode right_18 = null;
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
		left_8.element = element_16;
		left_8.left = left_17;
		left_8.right = right_18;
		left_17.element = element_22;
		left_17.left = left_23;
		left_17.right = right_24;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK24() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		BinaryNode left_8 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		int element_16 = 0;
		int element_4 = 0;
		int element_1 = -1;
		int element_7 = 1;
		BinaryNode right_9 = null;
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
		left_8.element = element_16;
		left_8.left = left_17;
		left_8.right = right_18;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK25() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		BinaryNode left_8 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_5 = null;
		int element_16 = 0;
		int element_4 = -1;
		int element_1 = -2;
		int element_7 = 0;
		BinaryNode right_9 = null;
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
		left_8.element = element_16;
		left_8.left = left_17;
		left_8.right = right_18;
		System.out.println(Utilities.repOK(obj));
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
		BinaryNode left_5 = null;
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
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK27() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_29 = t;
		int element_1 = -2;
		int element_28 = -1;
		int element_4 = 0;
		BinaryNode right_6 = null;
		BinaryNode right_30 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK28() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_29 = right_3;
		int element_4 = 0;
		int element_1 = -2;
		int element_28 = -1;
		BinaryNode right_6 = null;
		BinaryNode right_30 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK29() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_29 = left_5;
		int element_4 = 0;
		int element_1 = -2;
		int element_28 = -1;
		BinaryNode right_6 = null;
		BinaryNode right_30 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK30() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_29 = null;
		BinaryNode right_30 = t;
		int element_4 = 0;
		int element_1 = -2;
		int element_28 = -1;
		BinaryNode right_6 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK31() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_29 = null;
		BinaryNode right_30 = right_3;
		int element_4 = 0;
		int element_1 = -2;
		int element_28 = -1;
		BinaryNode right_6 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK32() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_29 = null;
		BinaryNode right_30 = left_5;
		int element_4 = 0;
		int element_1 = -2;
		int element_28 = -1;
		BinaryNode right_6 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK33() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_29 = null;
		BinaryNode right_30 = null;
		BinaryNode right_6 = t;
		int element_4 = 0;
		int element_1 = -2;
		int element_28 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK34() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_29 = null;
		BinaryNode right_30 = null;
		BinaryNode right_6 = right_3;
		int element_4 = 0;
		int element_1 = -2;
		int element_28 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK35() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_29 = null;
		BinaryNode right_30 = null;
		BinaryNode right_6 = left_5;
		int element_4 = 0;
		int element_1 = -2;
		int element_28 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK36() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_29 = null;
		BinaryNode right_30 = null;
		BinaryNode right_6 = null;
		int element_4 = 0;
		int element_1 = -2;
		int element_28 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK37() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode right_6 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_29 = null;
		BinaryNode right_30 = null;
		int element_4 = 0;
		int element_1 = -2;
		int element_31 = 0;
		int element_28 = -1;
		BinaryNode left_32 = null;
		BinaryNode right_33 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		right_6.element = element_31;
		right_6.left = left_32;
		right_6.right = right_33;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK38() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode right_30 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_29 = null;
		BinaryNode left_38 = t;
		int element_4 = 0;
		int element_1 = -3;
		int element_37 = -1;
		int element_28 = -2;
		BinaryNode right_6 = null;
		BinaryNode right_39 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		right_30.element = element_37;
		right_30.left = left_38;
		right_30.right = right_39;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK39() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode right_30 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_29 = null;
		BinaryNode left_38 = right_3;
		int element_4 = 0;
		int element_1 = -3;
		int element_37 = -1;
		int element_28 = -2;
		BinaryNode right_6 = null;
		BinaryNode right_39 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		right_30.element = element_37;
		right_30.left = left_38;
		right_30.right = right_39;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK40() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode right_30 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_29 = null;
		BinaryNode left_38 = left_5;
		int element_4 = 0;
		int element_1 = -3;
		int element_37 = -1;
		int element_28 = -2;
		BinaryNode right_6 = null;
		BinaryNode right_39 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		right_30.element = element_37;
		right_30.left = left_38;
		right_30.right = right_39;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK41() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode right_30 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_29 = null;
		BinaryNode left_38 = right_30;
		int element_4 = 0;
		int element_1 = -3;
		int element_37 = -1;
		int element_28 = -2;
		BinaryNode right_6 = null;
		BinaryNode right_39 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		right_30.element = element_37;
		right_30.left = left_38;
		right_30.right = right_39;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK42() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode right_30 = new BinaryNode();
		BinaryNode left_38 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_29 = null;
		int element_43 = 0;
		int element_4 = 2;
		int element_1 = -1;
		int element_37 = 1;
		int element_28 = 0;
		BinaryNode right_6 = null;
		BinaryNode right_39 = null;
		BinaryNode left_44 = null;
		BinaryNode right_45 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		right_30.element = element_37;
		right_30.left = left_38;
		right_30.right = right_39;
		left_38.element = element_43;
		left_38.left = left_44;
		left_38.right = right_45;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK43() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode right_30 = new BinaryNode();
		BinaryNode left_38 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_29 = null;
		int element_43 = 0;
		int element_4 = 1;
		int element_1 = -2;
		int element_37 = 0;
		int element_28 = -1;
		BinaryNode right_6 = null;
		BinaryNode right_39 = null;
		BinaryNode left_44 = null;
		BinaryNode right_45 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		right_30.element = element_37;
		right_30.left = left_38;
		right_30.right = right_39;
		left_38.element = element_43;
		left_38.left = left_44;
		left_38.right = right_45;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK44() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode right_30 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_29 = null;
		int element_4 = 0;
		int element_1 = -2;
		int element_37 = -1;
		int element_28 = -1;
		BinaryNode right_6 = null;
		BinaryNode left_38 = null;
		BinaryNode right_39 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		right_30.element = element_37;
		right_30.left = left_38;
		right_30.right = right_39;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK45() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode right_30 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_29 = null;
		int element_4 = 0;
		int element_1 = -2;
		int element_37 = 0;
		int element_28 = -1;
		BinaryNode right_6 = null;
		BinaryNode left_38 = null;
		BinaryNode right_39 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		right_30.element = element_37;
		right_30.left = left_38;
		right_30.right = right_39;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK46() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_29 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_50 = t;
		int element_4 = 3;
		int element_1 = 0;
		int element_49 = 1;
		int element_28 = 2;
		BinaryNode right_6 = null;
		BinaryNode right_30 = null;
		BinaryNode right_51 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		left_29.element = element_49;
		left_29.left = left_50;
		left_29.right = right_51;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK47() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_29 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_50 = right_3;
		int element_4 = 0;
		int element_1 = -3;
		int element_49 = -2;
		int element_28 = -1;
		BinaryNode right_6 = null;
		BinaryNode right_30 = null;
		BinaryNode right_51 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		left_29.element = element_49;
		left_29.left = left_50;
		left_29.right = right_51;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK48() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_29 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_50 = left_5;
		int element_4 = 3;
		int element_1 = 0;
		int element_49 = 1;
		int element_28 = 2;
		BinaryNode right_6 = null;
		BinaryNode right_30 = null;
		BinaryNode right_51 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		left_29.element = element_49;
		left_29.left = left_50;
		left_29.right = right_51;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK49() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_29 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_50 = left_29;
		int element_4 = 3;
		int element_1 = 0;
		int element_49 = 1;
		int element_28 = 2;
		BinaryNode right_6 = null;
		BinaryNode right_30 = null;
		BinaryNode right_51 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		left_29.element = element_49;
		left_29.left = left_50;
		left_29.right = right_51;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK50() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_29 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_50 = null;
		BinaryNode right_51 = t;
		int element_4 = 3;
		int element_1 = 0;
		int element_49 = 1;
		int element_28 = 2;
		BinaryNode right_6 = null;
		BinaryNode right_30 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		left_29.element = element_49;
		left_29.left = left_50;
		left_29.right = right_51;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK51() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_29 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_50 = null;
		BinaryNode right_51 = right_3;
		int element_4 = 3;
		int element_1 = 0;
		int element_49 = 1;
		int element_28 = 2;
		BinaryNode right_6 = null;
		BinaryNode right_30 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		left_29.element = element_49;
		left_29.left = left_50;
		left_29.right = right_51;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK52() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_29 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_50 = null;
		BinaryNode right_51 = left_5;
		int element_4 = 3;
		int element_1 = 0;
		int element_49 = 1;
		int element_28 = 2;
		BinaryNode right_6 = null;
		BinaryNode right_30 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		left_29.element = element_49;
		left_29.left = left_50;
		left_29.right = right_51;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK53() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_29 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_50 = null;
		BinaryNode right_51 = left_29;
		int element_4 = 3;
		int element_1 = 0;
		int element_49 = 1;
		int element_28 = 2;
		BinaryNode right_6 = null;
		BinaryNode right_30 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		left_29.element = element_49;
		left_29.left = left_50;
		left_29.right = right_51;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK54() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_29 = new BinaryNode();
		BinaryNode right_51 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_50 = null;
		int element_55 = -1;
		int element_4 = 1;
		int element_1 = -2;
		int element_49 = -1;
		int element_28 = 0;
		BinaryNode right_6 = null;
		BinaryNode right_30 = null;
		BinaryNode left_56 = null;
		BinaryNode right_57 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		left_29.element = element_49;
		left_29.left = left_50;
		left_29.right = right_51;
		right_51.element = element_55;
		right_51.left = left_56;
		right_51.right = right_57;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK55() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_29 = new BinaryNode();
		BinaryNode right_51 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_50 = null;
		int element_55 = 0;
		int element_4 = 1;
		int element_1 = -2;
		int element_49 = -1;
		int element_28 = 0;
		BinaryNode right_6 = null;
		BinaryNode right_30 = null;
		BinaryNode left_56 = null;
		BinaryNode right_57 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		left_29.element = element_49;
		left_29.left = left_50;
		left_29.right = right_51;
		right_51.element = element_55;
		right_51.left = left_56;
		right_51.right = right_57;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK56() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_29 = new BinaryNode();
		BinaryNode left_50 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_62 = t;
		int element_4 = 4;
		int element_61 = 1;
		int element_1 = 0;
		int element_49 = 2;
		int element_28 = 3;
		BinaryNode right_6 = null;
		BinaryNode right_30 = null;
		BinaryNode right_51 = null;
		BinaryNode right_63 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		left_29.element = element_49;
		left_29.left = left_50;
		left_29.right = right_51;
		left_50.element = element_61;
		left_50.left = left_62;
		left_50.right = right_63;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK57() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_29 = new BinaryNode();
		BinaryNode left_50 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_62 = right_3;
		int element_4 = 4;
		int element_61 = 1;
		int element_1 = 0;
		int element_49 = 2;
		int element_28 = 3;
		BinaryNode right_6 = null;
		BinaryNode right_30 = null;
		BinaryNode right_51 = null;
		BinaryNode right_63 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		left_29.element = element_49;
		left_29.left = left_50;
		left_29.right = right_51;
		left_50.element = element_61;
		left_50.left = left_62;
		left_50.right = right_63;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK58() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_29 = new BinaryNode();
		BinaryNode left_50 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_62 = left_5;
		int element_4 = 4;
		int element_61 = 1;
		int element_1 = 0;
		int element_49 = 2;
		int element_28 = 3;
		BinaryNode right_6 = null;
		BinaryNode right_30 = null;
		BinaryNode right_51 = null;
		BinaryNode right_63 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		left_29.element = element_49;
		left_29.left = left_50;
		left_29.right = right_51;
		left_50.element = element_61;
		left_50.left = left_62;
		left_50.right = right_63;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK59() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_29 = new BinaryNode();
		BinaryNode left_50 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_62 = left_29;
		int element_4 = 4;
		int element_61 = 1;
		int element_1 = 0;
		int element_49 = 2;
		int element_28 = 3;
		BinaryNode right_6 = null;
		BinaryNode right_30 = null;
		BinaryNode right_51 = null;
		BinaryNode right_63 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		left_29.element = element_49;
		left_29.left = left_50;
		left_29.right = right_51;
		left_50.element = element_61;
		left_50.left = left_62;
		left_50.right = right_63;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK60() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_29 = new BinaryNode();
		BinaryNode left_50 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		BinaryNode left_62 = left_50;
		int element_4 = 4;
		int element_61 = 1;
		int element_1 = 0;
		int element_49 = 2;
		int element_28 = 3;
		BinaryNode right_6 = null;
		BinaryNode right_30 = null;
		BinaryNode right_51 = null;
		BinaryNode right_63 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		left_29.element = element_49;
		left_29.left = left_50;
		left_29.right = right_51;
		left_50.element = element_61;
		left_50.left = left_62;
		left_50.right = right_63;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK61() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_29 = new BinaryNode();
		BinaryNode left_50 = new BinaryNode();
		BinaryNode left_62 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		int element_67 = 0;
		int element_4 = 4;
		int element_61 = 1;
		int element_1 = 0;
		int element_49 = 2;
		int element_28 = 3;
		BinaryNode right_6 = null;
		BinaryNode right_30 = null;
		BinaryNode right_51 = null;
		BinaryNode right_63 = null;
		BinaryNode left_68 = null;
		BinaryNode right_69 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		left_29.element = element_49;
		left_29.left = left_50;
		left_29.right = right_51;
		left_50.element = element_61;
		left_50.left = left_62;
		left_50.right = right_63;
		left_62.element = element_67;
		left_62.left = left_68;
		left_62.right = right_69;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK62() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_29 = new BinaryNode();
		BinaryNode left_50 = new BinaryNode();
		BinaryNode left_62 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		int element_67 = 0;
		int element_4 = 3;
		int element_61 = 0;
		int element_1 = -1;
		int element_49 = 1;
		int element_28 = 2;
		BinaryNode right_6 = null;
		BinaryNode right_30 = null;
		BinaryNode right_51 = null;
		BinaryNode right_63 = null;
		BinaryNode left_68 = null;
		BinaryNode right_69 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		left_29.element = element_49;
		left_29.left = left_50;
		left_29.right = right_51;
		left_50.element = element_61;
		left_50.left = left_62;
		left_50.right = right_63;
		left_62.element = element_67;
		left_62.left = left_68;
		left_62.right = right_69;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK63() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_29 = new BinaryNode();
		BinaryNode left_50 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		int element_4 = 3;
		int element_61 = 0;
		int element_1 = 0;
		int element_49 = 1;
		int element_28 = 2;
		BinaryNode right_6 = null;
		BinaryNode right_30 = null;
		BinaryNode right_51 = null;
		BinaryNode left_62 = null;
		BinaryNode right_63 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		left_29.element = element_49;
		left_29.left = left_50;
		left_29.right = right_51;
		left_50.element = element_61;
		left_50.left = left_62;
		left_50.right = right_63;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK64() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_29 = new BinaryNode();
		BinaryNode left_50 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		int element_4 = 2;
		int element_61 = 0;
		int element_1 = -1;
		int element_49 = 0;
		int element_28 = 1;
		BinaryNode right_6 = null;
		BinaryNode right_30 = null;
		BinaryNode right_51 = null;
		BinaryNode left_62 = null;
		BinaryNode right_63 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		left_29.element = element_49;
		left_29.left = left_50;
		left_29.right = right_51;
		left_50.element = element_61;
		left_50.left = left_62;
		left_50.right = right_63;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK65() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_29 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		int element_1 = 0;
		int element_49 = 0;
		int element_28 = 1;
		int element_4 = 2;
		BinaryNode right_6 = null;
		BinaryNode right_30 = null;
		BinaryNode left_50 = null;
		BinaryNode right_51 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		left_29.element = element_49;
		left_29.left = left_50;
		left_29.right = right_51;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK66() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		BinaryNode left_29 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		int element_1 = -1;
		int element_49 = 0;
		int element_28 = 0;
		int element_4 = 1;
		BinaryNode right_6 = null;
		BinaryNode right_30 = null;
		BinaryNode left_50 = null;
		BinaryNode right_51 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		left_29.element = element_49;
		left_29.left = left_50;
		left_29.right = right_51;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK67() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		int element_1 = 0;
		int element_28 = 0;
		int element_4 = 1;
		BinaryNode right_6 = null;
		BinaryNode left_29 = null;
		BinaryNode right_30 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK68() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_5 = new BinaryNode();
		obj.root = t;
		BinaryNode left_2 = null;
		int element_1 = -1;
		int element_28 = 0;
		int element_4 = 0;
		BinaryNode right_6 = null;
		BinaryNode left_29 = null;
		BinaryNode right_30 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		right_3.element = element_4;
		right_3.left = left_5;
		right_3.right = right_6;
		left_5.element = element_28;
		left_5.left = left_29;
		left_5.right = right_30;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK69() throws Exception {
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
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK70() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = t;
		int element_1 = 1;
		int element_73 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK71() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = left_2;
		int element_1 = 1;
		int element_73 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK72() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode right_75 = t;
		int element_1 = 1;
		int element_73 = 0;
		BinaryNode right_3 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK73() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode right_75 = left_2;
		int element_1 = 1;
		int element_73 = 0;
		BinaryNode right_3 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK74() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode right_75 = null;
		BinaryNode right_3 = t;
		int element_1 = 0;
		int element_73 = -1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK75() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode right_75 = null;
		BinaryNode right_3 = left_2;
		int element_73 = -1;
		int element_1 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK76() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode right_75 = null;
		BinaryNode right_3 = null;
		int element_1 = 1;
		int element_73 = 0;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK77() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode right_75 = null;
		BinaryNode left_77 = t;
		int element_73 = -1;
		int element_1 = 0;
		int element_76 = 1;
		BinaryNode right_78 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_3.element = element_76;
		right_3.left = left_77;
		right_3.right = right_78;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK78() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode right_75 = null;
		BinaryNode left_77 = left_2;
		int element_73 = 0;
		int element_1 = 1;
		int element_76 = 2;
		BinaryNode right_78 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_3.element = element_76;
		right_3.left = left_77;
		right_3.right = right_78;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK79() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode right_75 = null;
		BinaryNode left_77 = right_3;
		int element_73 = -1;
		int element_1 = 0;
		int element_76 = 1;
		BinaryNode right_78 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_3.element = element_76;
		right_3.left = left_77;
		right_3.right = right_78;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK80() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode right_75 = null;
		BinaryNode left_77 = null;
		BinaryNode right_78 = t;
		int element_73 = -1;
		int element_1 = 0;
		int element_76 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_3.element = element_76;
		right_3.left = left_77;
		right_3.right = right_78;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK81() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode right_75 = null;
		BinaryNode left_77 = null;
		BinaryNode right_78 = left_2;
		int element_73 = 0;
		int element_1 = 1;
		int element_76 = 2;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_3.element = element_76;
		right_3.left = left_77;
		right_3.right = right_78;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK82() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode right_75 = null;
		BinaryNode left_77 = null;
		BinaryNode right_78 = right_3;
		int element_73 = -1;
		int element_1 = 0;
		int element_76 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_3.element = element_76;
		right_3.left = left_77;
		right_3.right = right_78;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK83() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode right_75 = null;
		BinaryNode left_77 = null;
		BinaryNode right_78 = null;
		int element_73 = -1;
		int element_1 = 0;
		int element_76 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_3.element = element_76;
		right_3.left = left_77;
		right_3.right = right_78;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK84() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode right_78 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode right_75 = null;
		BinaryNode left_77 = null;
		int element_79 = 0;
		int element_73 = -2;
		int element_1 = -1;
		int element_76 = 0;
		BinaryNode left_80 = null;
		BinaryNode right_81 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_3.element = element_76;
		right_3.left = left_77;
		right_3.right = right_78;
		right_78.element = element_79;
		right_78.left = left_80;
		right_78.right = right_81;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK85() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_77 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode right_75 = null;
		BinaryNode left_86 = t;
		int element_73 = -1;
		int element_1 = 0;
		int element_76 = 2;
		int element_85 = 1;
		BinaryNode right_78 = null;
		BinaryNode right_87 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_3.element = element_76;
		right_3.left = left_77;
		right_3.right = right_78;
		left_77.element = element_85;
		left_77.left = left_86;
		left_77.right = right_87;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK86() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_77 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode right_75 = null;
		BinaryNode left_86 = left_2;
		int element_73 = -1;
		int element_1 = 0;
		int element_76 = 2;
		int element_85 = 1;
		BinaryNode right_78 = null;
		BinaryNode right_87 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_3.element = element_76;
		right_3.left = left_77;
		right_3.right = right_78;
		left_77.element = element_85;
		left_77.left = left_86;
		left_77.right = right_87;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK87() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_77 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode right_75 = null;
		BinaryNode left_86 = right_3;
		int element_73 = -1;
		int element_1 = 0;
		int element_76 = 2;
		int element_85 = 1;
		BinaryNode right_78 = null;
		BinaryNode right_87 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_3.element = element_76;
		right_3.left = left_77;
		right_3.right = right_78;
		left_77.element = element_85;
		left_77.left = left_86;
		left_77.right = right_87;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK88() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_77 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode right_75 = null;
		BinaryNode left_86 = left_77;
		int element_73 = -1;
		int element_1 = 0;
		int element_76 = 2;
		int element_85 = 1;
		BinaryNode right_78 = null;
		BinaryNode right_87 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_3.element = element_76;
		right_3.left = left_77;
		right_3.right = right_78;
		left_77.element = element_85;
		left_77.left = left_86;
		left_77.right = right_87;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK89() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_77 = new BinaryNode();
		BinaryNode left_86 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode right_75 = null;
		int element_73 = -1;
		int element_91 = 0;
		int element_1 = 0;
		int element_76 = 2;
		int element_85 = 1;
		BinaryNode right_78 = null;
		BinaryNode right_87 = null;
		BinaryNode left_92 = null;
		BinaryNode right_93 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_3.element = element_76;
		right_3.left = left_77;
		right_3.right = right_78;
		left_77.element = element_85;
		left_77.left = left_86;
		left_77.right = right_87;
		left_86.element = element_91;
		left_86.left = left_92;
		left_86.right = right_93;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK90() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_77 = new BinaryNode();
		BinaryNode left_86 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode right_75 = null;
		int element_73 = -2;
		int element_91 = 0;
		int element_1 = -1;
		int element_76 = 1;
		int element_85 = 0;
		BinaryNode right_78 = null;
		BinaryNode right_87 = null;
		BinaryNode left_92 = null;
		BinaryNode right_93 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_3.element = element_76;
		right_3.left = left_77;
		right_3.right = right_78;
		left_77.element = element_85;
		left_77.left = left_86;
		left_77.right = right_87;
		left_86.element = element_91;
		left_86.left = left_92;
		left_86.right = right_93;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK91() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_77 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode right_75 = null;
		int element_73 = -1;
		int element_1 = 0;
		int element_76 = 1;
		int element_85 = 0;
		BinaryNode right_78 = null;
		BinaryNode left_86 = null;
		BinaryNode right_87 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_3.element = element_76;
		right_3.left = left_77;
		right_3.right = right_78;
		left_77.element = element_85;
		left_77.left = left_86;
		left_77.right = right_87;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK92() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_77 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode right_75 = null;
		int element_73 = -2;
		int element_1 = -1;
		int element_76 = 0;
		int element_85 = 0;
		BinaryNode right_78 = null;
		BinaryNode left_86 = null;
		BinaryNode right_87 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_3.element = element_76;
		right_3.left = left_77;
		right_3.right = right_78;
		left_77.element = element_85;
		left_77.left = left_86;
		left_77.right = right_87;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK93() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode right_75 = null;
		int element_1 = 0;
		int element_76 = 0;
		int element_73 = -1;
		BinaryNode left_77 = null;
		BinaryNode right_78 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_3.element = element_76;
		right_3.left = left_77;
		right_3.right = right_78;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK94() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode left_98 = t;
		int element_1 = 2;
		int element_73 = 0;
		int element_97 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_99 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK95() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode left_98 = left_2;
		int element_73 = 0;
		int element_1 = 2;
		int element_97 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_99 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK96() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode left_98 = right_75;
		int element_73 = 0;
		int element_1 = 2;
		int element_97 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_99 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK97() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode left_98 = null;
		BinaryNode right_99 = t;
		int element_73 = 0;
		int element_1 = 2;
		int element_97 = 1;
		BinaryNode right_3 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK98() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode left_98 = null;
		BinaryNode right_99 = left_2;
		int element_73 = 0;
		int element_1 = 2;
		int element_97 = 1;
		BinaryNode right_3 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK99() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode left_98 = null;
		BinaryNode right_99 = right_75;
		int element_73 = 0;
		int element_1 = 2;
		int element_97 = 1;
		BinaryNode right_3 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK100() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode left_98 = null;
		BinaryNode right_99 = null;
		BinaryNode right_3 = t;
		int element_73 = 0;
		int element_1 = 2;
		int element_97 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK101() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode left_98 = null;
		BinaryNode right_99 = null;
		BinaryNode right_3 = left_2;
		int element_73 = 0;
		int element_1 = 2;
		int element_97 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK102() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode left_98 = null;
		BinaryNode right_99 = null;
		BinaryNode right_3 = right_75;
		int element_73 = 0;
		int element_1 = 2;
		int element_97 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK103() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode left_98 = null;
		BinaryNode right_99 = null;
		BinaryNode right_3 = null;
		int element_73 = 0;
		int element_1 = 2;
		int element_97 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK104() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode left_98 = null;
		BinaryNode right_99 = null;
		int element_73 = -2;
		int element_1 = 0;
		int element_97 = -1;
		int element_100 = 0;
		BinaryNode left_101 = null;
		BinaryNode right_102 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		right_3.element = element_100;
		right_3.left = left_101;
		right_3.right = right_102;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK105() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		BinaryNode right_99 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode left_98 = null;
		BinaryNode left_107 = t;
		int element_73 = -3;
		int element_106 = -1;
		int element_1 = 0;
		int element_97 = -2;
		BinaryNode right_3 = null;
		BinaryNode right_108 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		right_99.element = element_106;
		right_99.left = left_107;
		right_99.right = right_108;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK106() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		BinaryNode right_99 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode left_98 = null;
		BinaryNode left_107 = left_2;
		int element_73 = 0;
		int element_106 = 2;
		int element_1 = 3;
		int element_97 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_108 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		right_99.element = element_106;
		right_99.left = left_107;
		right_99.right = right_108;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK107() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		BinaryNode right_99 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode left_98 = null;
		BinaryNode left_107 = right_75;
		int element_73 = -3;
		int element_106 = -1;
		int element_1 = 0;
		int element_97 = -2;
		BinaryNode right_3 = null;
		BinaryNode right_108 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		right_99.element = element_106;
		right_99.left = left_107;
		right_99.right = right_108;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK108() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		BinaryNode right_99 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode left_98 = null;
		BinaryNode left_107 = right_99;
		int element_73 = -3;
		int element_106 = -1;
		int element_1 = 0;
		int element_97 = -2;
		BinaryNode right_3 = null;
		BinaryNode right_108 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		right_99.element = element_106;
		right_99.left = left_107;
		right_99.right = right_108;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK109() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		BinaryNode right_99 = new BinaryNode();
		BinaryNode left_107 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode left_98 = null;
		int element_73 = -1;
		int element_106 = 1;
		int element_112 = 0;
		int element_1 = 2;
		int element_97 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_108 = null;
		BinaryNode left_113 = null;
		BinaryNode right_114 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		right_99.element = element_106;
		right_99.left = left_107;
		right_99.right = right_108;
		left_107.element = element_112;
		left_107.left = left_113;
		left_107.right = right_114;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK110() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		BinaryNode right_99 = new BinaryNode();
		BinaryNode left_107 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode left_98 = null;
		int element_73 = -2;
		int element_106 = 0;
		int element_112 = 0;
		int element_1 = 1;
		int element_97 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_108 = null;
		BinaryNode left_113 = null;
		BinaryNode right_114 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		right_99.element = element_106;
		right_99.left = left_107;
		right_99.right = right_108;
		left_107.element = element_112;
		left_107.left = left_113;
		left_107.right = right_114;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK111() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		BinaryNode right_99 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode left_98 = null;
		int element_73 = -2;
		int element_106 = -1;
		int element_1 = 0;
		int element_97 = -1;
		BinaryNode right_3 = null;
		BinaryNode left_107 = null;
		BinaryNode right_108 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		right_99.element = element_106;
		right_99.left = left_107;
		right_99.right = right_108;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK112() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		BinaryNode right_99 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode left_98 = null;
		int element_73 = -2;
		int element_106 = 0;
		int element_1 = 0;
		int element_97 = -1;
		BinaryNode right_3 = null;
		BinaryNode left_107 = null;
		BinaryNode right_108 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		right_99.element = element_106;
		right_99.left = left_107;
		right_99.right = right_108;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK113() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		BinaryNode left_98 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode left_119 = t;
		int element_73 = 0;
		int element_1 = 3;
		int element_118 = 1;
		int element_97 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_99 = null;
		BinaryNode right_120 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		left_98.element = element_118;
		left_98.left = left_119;
		left_98.right = right_120;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK114() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		BinaryNode left_98 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode left_119 = left_2;
		int element_73 = 0;
		int element_1 = 3;
		int element_118 = 1;
		int element_97 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_99 = null;
		BinaryNode right_120 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		left_98.element = element_118;
		left_98.left = left_119;
		left_98.right = right_120;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK115() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		BinaryNode left_98 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode left_119 = right_75;
		int element_73 = 0;
		int element_1 = 3;
		int element_118 = 1;
		int element_97 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_99 = null;
		BinaryNode right_120 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		left_98.element = element_118;
		left_98.left = left_119;
		left_98.right = right_120;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK116() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		BinaryNode left_98 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode left_119 = left_98;
		int element_73 = 0;
		int element_1 = 3;
		int element_118 = 1;
		int element_97 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_99 = null;
		BinaryNode right_120 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		left_98.element = element_118;
		left_98.left = left_119;
		left_98.right = right_120;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK117() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		BinaryNode left_98 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode left_119 = null;
		BinaryNode right_120 = t;
		int element_73 = 0;
		int element_1 = 3;
		int element_118 = 1;
		int element_97 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_99 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		left_98.element = element_118;
		left_98.left = left_119;
		left_98.right = right_120;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK118() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		BinaryNode left_98 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode left_119 = null;
		BinaryNode right_120 = left_2;
		int element_73 = 0;
		int element_1 = 3;
		int element_118 = 1;
		int element_97 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_99 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		left_98.element = element_118;
		left_98.left = left_119;
		left_98.right = right_120;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK119() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		BinaryNode left_98 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode left_119 = null;
		BinaryNode right_120 = right_75;
		int element_73 = 0;
		int element_1 = 3;
		int element_118 = 1;
		int element_97 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_99 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		left_98.element = element_118;
		left_98.left = left_119;
		left_98.right = right_120;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK120() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		BinaryNode left_98 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode left_119 = null;
		BinaryNode right_120 = left_98;
		int element_73 = 0;
		int element_1 = 3;
		int element_118 = 1;
		int element_97 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_99 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		left_98.element = element_118;
		left_98.left = left_119;
		left_98.right = right_120;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK121() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		BinaryNode left_98 = new BinaryNode();
		BinaryNode right_120 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode left_119 = null;
		int element_73 = -2;
		int element_1 = 1;
		int element_118 = -1;
		int element_124 = -1;
		int element_97 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_99 = null;
		BinaryNode left_125 = null;
		BinaryNode right_126 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		left_98.element = element_118;
		left_98.left = left_119;
		left_98.right = right_120;
		right_120.element = element_124;
		right_120.left = left_125;
		right_120.right = right_126;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK122() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		BinaryNode left_98 = new BinaryNode();
		BinaryNode right_120 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode left_119 = null;
		int element_73 = -2;
		int element_1 = 1;
		int element_118 = -1;
		int element_124 = 0;
		int element_97 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_99 = null;
		BinaryNode left_125 = null;
		BinaryNode right_126 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		left_98.element = element_118;
		left_98.left = left_119;
		left_98.right = right_120;
		right_120.element = element_124;
		right_120.left = left_125;
		right_120.right = right_126;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK123() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		BinaryNode left_98 = new BinaryNode();
		BinaryNode left_119 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode left_131 = t;
		int element_130 = 1;
		int element_73 = 0;
		int element_1 = 4;
		int element_118 = 2;
		int element_97 = 3;
		BinaryNode right_3 = null;
		BinaryNode right_99 = null;
		BinaryNode right_120 = null;
		BinaryNode right_132 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		left_98.element = element_118;
		left_98.left = left_119;
		left_98.right = right_120;
		left_119.element = element_130;
		left_119.left = left_131;
		left_119.right = right_132;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK124() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		BinaryNode left_98 = new BinaryNode();
		BinaryNode left_119 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode left_131 = left_2;
		int element_130 = 1;
		int element_73 = 0;
		int element_1 = 4;
		int element_118 = 2;
		int element_97 = 3;
		BinaryNode right_3 = null;
		BinaryNode right_99 = null;
		BinaryNode right_120 = null;
		BinaryNode right_132 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		left_98.element = element_118;
		left_98.left = left_119;
		left_98.right = right_120;
		left_119.element = element_130;
		left_119.left = left_131;
		left_119.right = right_132;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK125() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		BinaryNode left_98 = new BinaryNode();
		BinaryNode left_119 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode left_131 = right_75;
		int element_130 = 1;
		int element_73 = 0;
		int element_1 = 4;
		int element_118 = 2;
		int element_97 = 3;
		BinaryNode right_3 = null;
		BinaryNode right_99 = null;
		BinaryNode right_120 = null;
		BinaryNode right_132 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		left_98.element = element_118;
		left_98.left = left_119;
		left_98.right = right_120;
		left_119.element = element_130;
		left_119.left = left_131;
		left_119.right = right_132;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK126() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		BinaryNode left_98 = new BinaryNode();
		BinaryNode left_119 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode left_131 = left_98;
		int element_130 = 1;
		int element_73 = 0;
		int element_1 = 4;
		int element_118 = 2;
		int element_97 = 3;
		BinaryNode right_3 = null;
		BinaryNode right_99 = null;
		BinaryNode right_120 = null;
		BinaryNode right_132 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		left_98.element = element_118;
		left_98.left = left_119;
		left_98.right = right_120;
		left_119.element = element_130;
		left_119.left = left_131;
		left_119.right = right_132;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK127() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		BinaryNode left_98 = new BinaryNode();
		BinaryNode left_119 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		BinaryNode left_131 = left_119;
		int element_130 = 1;
		int element_73 = 0;
		int element_1 = 4;
		int element_118 = 2;
		int element_97 = 3;
		BinaryNode right_3 = null;
		BinaryNode right_99 = null;
		BinaryNode right_120 = null;
		BinaryNode right_132 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		left_98.element = element_118;
		left_98.left = left_119;
		left_98.right = right_120;
		left_119.element = element_130;
		left_119.left = left_131;
		left_119.right = right_132;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK128() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		BinaryNode left_98 = new BinaryNode();
		BinaryNode left_119 = new BinaryNode();
		BinaryNode left_131 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		int element_130 = 1;
		int element_73 = 0;
		int element_136 = 0;
		int element_1 = 4;
		int element_118 = 2;
		int element_97 = 3;
		BinaryNode right_3 = null;
		BinaryNode right_99 = null;
		BinaryNode right_120 = null;
		BinaryNode right_132 = null;
		BinaryNode left_137 = null;
		BinaryNode right_138 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		left_98.element = element_118;
		left_98.left = left_119;
		left_98.right = right_120;
		left_119.element = element_130;
		left_119.left = left_131;
		left_119.right = right_132;
		left_131.element = element_136;
		left_131.left = left_137;
		left_131.right = right_138;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK129() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		BinaryNode left_98 = new BinaryNode();
		BinaryNode left_119 = new BinaryNode();
		BinaryNode left_131 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		int element_130 = 0;
		int element_73 = -1;
		int element_136 = 0;
		int element_1 = 3;
		int element_118 = 1;
		int element_97 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_99 = null;
		BinaryNode right_120 = null;
		BinaryNode right_132 = null;
		BinaryNode left_137 = null;
		BinaryNode right_138 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		left_98.element = element_118;
		left_98.left = left_119;
		left_98.right = right_120;
		left_119.element = element_130;
		left_119.left = left_131;
		left_119.right = right_132;
		left_131.element = element_136;
		left_131.left = left_137;
		left_131.right = right_138;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK130() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		BinaryNode left_98 = new BinaryNode();
		BinaryNode left_119 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		int element_130 = 0;
		int element_73 = 0;
		int element_1 = 3;
		int element_118 = 1;
		int element_97 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_99 = null;
		BinaryNode right_120 = null;
		BinaryNode left_131 = null;
		BinaryNode right_132 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		left_98.element = element_118;
		left_98.left = left_119;
		left_98.right = right_120;
		left_119.element = element_130;
		left_119.left = left_131;
		left_119.right = right_132;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK131() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		BinaryNode left_98 = new BinaryNode();
		BinaryNode left_119 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		int element_130 = 0;
		int element_73 = -1;
		int element_1 = 2;
		int element_118 = 0;
		int element_97 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_99 = null;
		BinaryNode right_120 = null;
		BinaryNode left_131 = null;
		BinaryNode right_132 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		left_98.element = element_118;
		left_98.left = left_119;
		left_98.right = right_120;
		left_119.element = element_130;
		left_119.left = left_131;
		left_119.right = right_132;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK132() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		BinaryNode left_98 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		int element_1 = 2;
		int element_118 = 0;
		int element_73 = 0;
		int element_97 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_99 = null;
		BinaryNode left_119 = null;
		BinaryNode right_120 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		left_98.element = element_118;
		left_98.left = left_119;
		left_98.right = right_120;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK133() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		BinaryNode left_98 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		int element_1 = 1;
		int element_118 = 0;
		int element_73 = -1;
		int element_97 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_99 = null;
		BinaryNode left_119 = null;
		BinaryNode right_120 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		left_98.element = element_118;
		left_98.left = left_119;
		left_98.right = right_120;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK134() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		int element_1 = 0;
		int element_73 = -1;
		int element_97 = -1;
		BinaryNode right_3 = null;
		BinaryNode left_98 = null;
		BinaryNode right_99 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK135() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		obj.root = t;
		BinaryNode left_74 = null;
		int element_1 = 0;
		int element_73 = -1;
		int element_97 = 0;
		BinaryNode right_3 = null;
		BinaryNode left_98 = null;
		BinaryNode right_99 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		right_75.element = element_97;
		right_75.left = left_98;
		right_75.right = right_99;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK136() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = t;
		int element_1 = 0;
		int element_142 = -2;
		int element_73 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK137() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = left_2;
		int element_1 = 1;
		int element_142 = -1;
		int element_73 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK138() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = left_74;
		int element_1 = 1;
		int element_142 = -1;
		int element_73 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK139() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		BinaryNode right_144 = t;
		int element_1 = 1;
		int element_142 = -1;
		int element_73 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK140() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		BinaryNode right_144 = left_2;
		int element_142 = -1;
		int element_73 = 0;
		int element_1 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK141() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		BinaryNode right_144 = left_74;
		int element_142 = -1;
		int element_73 = 0;
		int element_1 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK142() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		BinaryNode right_144 = null;
		BinaryNode right_75 = t;
		int element_142 = -1;
		int element_73 = 0;
		int element_1 = 1;
		BinaryNode right_3 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK143() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		BinaryNode right_144 = null;
		BinaryNode right_75 = left_2;
		int element_142 = -1;
		int element_73 = 0;
		int element_1 = 1;
		BinaryNode right_3 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK144() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		BinaryNode right_144 = null;
		BinaryNode right_75 = left_74;
		int element_142 = -1;
		int element_73 = 0;
		int element_1 = 1;
		BinaryNode right_3 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK145() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		BinaryNode right_144 = null;
		BinaryNode right_75 = null;
		BinaryNode right_3 = t;
		int element_142 = -1;
		int element_73 = 0;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK146() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		BinaryNode right_144 = null;
		BinaryNode right_75 = null;
		BinaryNode right_3 = left_2;
		int element_142 = -1;
		int element_73 = 0;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK147() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		BinaryNode right_144 = null;
		BinaryNode right_75 = null;
		BinaryNode right_3 = left_74;
		int element_142 = -1;
		int element_73 = 0;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK148() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		BinaryNode right_144 = null;
		BinaryNode right_75 = null;
		BinaryNode right_3 = null;
		int element_142 = -1;
		int element_73 = 0;
		int element_1 = 1;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK149() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		BinaryNode right_144 = null;
		BinaryNode right_75 = null;
		int element_142 = -1;
		int element_73 = 0;
		int element_1 = 1;
		int element_145 = 0;
		BinaryNode left_146 = null;
		BinaryNode right_147 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		right_3.element = element_145;
		right_3.left = left_146;
		right_3.right = right_147;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK150() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		BinaryNode right_144 = null;
		BinaryNode left_152 = t;
		int element_142 = -1;
		int element_73 = 0;
		int element_1 = 2;
		int element_151 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_153 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		right_75.element = element_151;
		right_75.left = left_152;
		right_75.right = right_153;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK151() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		BinaryNode right_144 = null;
		BinaryNode left_152 = left_2;
		int element_142 = -1;
		int element_73 = 0;
		int element_1 = 2;
		int element_151 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_153 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		right_75.element = element_151;
		right_75.left = left_152;
		right_75.right = right_153;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK152() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		BinaryNode right_144 = null;
		BinaryNode left_152 = left_74;
		int element_142 = -1;
		int element_73 = 0;
		int element_1 = 2;
		int element_151 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_153 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		right_75.element = element_151;
		right_75.left = left_152;
		right_75.right = right_153;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK153() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		BinaryNode right_144 = null;
		BinaryNode left_152 = right_75;
		int element_142 = -1;
		int element_73 = 0;
		int element_1 = 2;
		int element_151 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_153 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		right_75.element = element_151;
		right_75.left = left_152;
		right_75.right = right_153;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK154() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		BinaryNode left_152 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		BinaryNode right_144 = null;
		int element_142 = -1;
		int element_73 = 0;
		int element_157 = 0;
		int element_1 = 2;
		int element_151 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_153 = null;
		BinaryNode left_158 = null;
		BinaryNode right_159 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		right_75.element = element_151;
		right_75.left = left_152;
		right_75.right = right_153;
		left_152.element = element_157;
		left_152.left = left_158;
		left_152.right = right_159;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK155() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		BinaryNode left_152 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		BinaryNode right_144 = null;
		int element_142 = -2;
		int element_73 = -1;
		int element_157 = 0;
		int element_1 = 1;
		int element_151 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_153 = null;
		BinaryNode left_158 = null;
		BinaryNode right_159 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		right_75.element = element_151;
		right_75.left = left_152;
		right_75.right = right_153;
		left_152.element = element_157;
		left_152.left = left_158;
		left_152.right = right_159;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK156() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		BinaryNode right_144 = null;
		int element_142 = -1;
		int element_73 = 0;
		int element_1 = 1;
		int element_151 = 0;
		BinaryNode right_3 = null;
		BinaryNode left_152 = null;
		BinaryNode right_153 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		right_75.element = element_151;
		right_75.left = left_152;
		right_75.right = right_153;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK157() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode right_75 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		BinaryNode right_144 = null;
		int element_142 = -1;
		int element_73 = 0;
		int element_1 = 1;
		int element_151 = 1;
		BinaryNode right_3 = null;
		BinaryNode left_152 = null;
		BinaryNode right_153 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		right_75.element = element_151;
		right_75.left = left_152;
		right_75.right = right_153;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK158() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode right_144 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		BinaryNode left_164 = t;
		int element_142 = -2;
		int element_163 = -1;
		int element_73 = 0;
		int element_1 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_165 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		right_144.element = element_163;
		right_144.left = left_164;
		right_144.right = right_165;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK159() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode right_144 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		BinaryNode left_164 = left_2;
		int element_142 = -2;
		int element_163 = -1;
		int element_73 = 0;
		int element_1 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_165 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		right_144.element = element_163;
		right_144.left = left_164;
		right_144.right = right_165;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK160() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode right_144 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		BinaryNode left_164 = left_74;
		int element_142 = -2;
		int element_163 = -1;
		int element_73 = 0;
		int element_1 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_165 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		right_144.element = element_163;
		right_144.left = left_164;
		right_144.right = right_165;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK161() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode right_144 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		BinaryNode left_164 = right_144;
		int element_142 = -2;
		int element_163 = -1;
		int element_73 = 0;
		int element_1 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_165 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		right_144.element = element_163;
		right_144.left = left_164;
		right_144.right = right_165;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK162() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode right_144 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		BinaryNode left_164 = null;
		BinaryNode right_165 = t;
		int element_142 = -2;
		int element_163 = -1;
		int element_73 = 0;
		int element_1 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		right_144.element = element_163;
		right_144.left = left_164;
		right_144.right = right_165;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK163() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode right_144 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		BinaryNode left_164 = null;
		BinaryNode right_165 = left_2;
		int element_142 = -2;
		int element_163 = -1;
		int element_73 = 0;
		int element_1 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		right_144.element = element_163;
		right_144.left = left_164;
		right_144.right = right_165;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK164() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode right_144 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		BinaryNode left_164 = null;
		BinaryNode right_165 = left_74;
		int element_142 = -2;
		int element_163 = -1;
		int element_73 = 0;
		int element_1 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		right_144.element = element_163;
		right_144.left = left_164;
		right_144.right = right_165;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK165() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode right_144 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		BinaryNode left_164 = null;
		BinaryNode right_165 = right_144;
		int element_142 = -2;
		int element_163 = -1;
		int element_73 = 0;
		int element_1 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		right_144.element = element_163;
		right_144.left = left_164;
		right_144.right = right_165;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK166() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode right_144 = new BinaryNode();
		BinaryNode right_165 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		BinaryNode left_164 = null;
		int element_142 = -2;
		int element_163 = -1;
		int element_73 = 0;
		int element_169 = -1;
		int element_1 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode left_170 = null;
		BinaryNode right_171 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		right_144.element = element_163;
		right_144.left = left_164;
		right_144.right = right_165;
		right_165.element = element_169;
		right_165.left = left_170;
		right_165.right = right_171;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK167() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode right_144 = new BinaryNode();
		BinaryNode right_165 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		BinaryNode left_164 = null;
		int element_142 = -2;
		int element_163 = -1;
		int element_73 = 0;
		int element_169 = 0;
		int element_1 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode left_170 = null;
		BinaryNode right_171 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		right_144.element = element_163;
		right_144.left = left_164;
		right_144.right = right_165;
		right_165.element = element_169;
		right_165.left = left_170;
		right_165.right = right_171;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK168() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode right_144 = new BinaryNode();
		BinaryNode left_164 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		BinaryNode left_176 = t;
		int element_142 = -3;
		int element_163 = -1;
		int element_73 = 0;
		int element_175 = -2;
		int element_1 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_165 = null;
		BinaryNode right_177 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		right_144.element = element_163;
		right_144.left = left_164;
		right_144.right = right_165;
		left_164.element = element_175;
		left_164.left = left_176;
		left_164.right = right_177;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK169() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode right_144 = new BinaryNode();
		BinaryNode left_164 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		BinaryNode left_176 = left_2;
		int element_142 = -3;
		int element_163 = -1;
		int element_73 = 0;
		int element_175 = -2;
		int element_1 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_165 = null;
		BinaryNode right_177 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		right_144.element = element_163;
		right_144.left = left_164;
		right_144.right = right_165;
		left_164.element = element_175;
		left_164.left = left_176;
		left_164.right = right_177;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK170() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode right_144 = new BinaryNode();
		BinaryNode left_164 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		BinaryNode left_176 = left_74;
		int element_142 = 0;
		int element_163 = 2;
		int element_73 = 3;
		int element_175 = 1;
		int element_1 = 4;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_165 = null;
		BinaryNode right_177 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		right_144.element = element_163;
		right_144.left = left_164;
		right_144.right = right_165;
		left_164.element = element_175;
		left_164.left = left_176;
		left_164.right = right_177;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK171() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode right_144 = new BinaryNode();
		BinaryNode left_164 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		BinaryNode left_176 = right_144;
		int element_142 = 0;
		int element_163 = 2;
		int element_73 = 3;
		int element_175 = 1;
		int element_1 = 4;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_165 = null;
		BinaryNode right_177 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		right_144.element = element_163;
		right_144.left = left_164;
		right_144.right = right_165;
		left_164.element = element_175;
		left_164.left = left_176;
		left_164.right = right_177;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK172() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode right_144 = new BinaryNode();
		BinaryNode left_164 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		BinaryNode left_176 = left_164;
		int element_142 = 0;
		int element_163 = 2;
		int element_73 = 3;
		int element_175 = 1;
		int element_1 = 4;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_165 = null;
		BinaryNode right_177 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		right_144.element = element_163;
		right_144.left = left_164;
		right_144.right = right_165;
		left_164.element = element_175;
		left_164.left = left_176;
		left_164.right = right_177;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK173() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode right_144 = new BinaryNode();
		BinaryNode left_164 = new BinaryNode();
		BinaryNode left_176 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		int element_142 = 0;
		int element_163 = 2;
		int element_181 = 0;
		int element_73 = 3;
		int element_175 = 1;
		int element_1 = 4;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_165 = null;
		BinaryNode right_177 = null;
		BinaryNode left_182 = null;
		BinaryNode right_183 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		right_144.element = element_163;
		right_144.left = left_164;
		right_144.right = right_165;
		left_164.element = element_175;
		left_164.left = left_176;
		left_164.right = right_177;
		left_176.element = element_181;
		left_176.left = left_182;
		left_176.right = right_183;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK174() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode right_144 = new BinaryNode();
		BinaryNode left_164 = new BinaryNode();
		BinaryNode left_176 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		int element_142 = -1;
		int element_163 = 1;
		int element_181 = 0;
		int element_73 = 2;
		int element_175 = 0;
		int element_1 = 3;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_165 = null;
		BinaryNode right_177 = null;
		BinaryNode left_182 = null;
		BinaryNode right_183 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		right_144.element = element_163;
		right_144.left = left_164;
		right_144.right = right_165;
		left_164.element = element_175;
		left_164.left = left_176;
		left_164.right = right_177;
		left_176.element = element_181;
		left_176.left = left_182;
		left_176.right = right_183;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK175() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode right_144 = new BinaryNode();
		BinaryNode left_164 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		int element_142 = 0;
		int element_163 = 1;
		int element_73 = 2;
		int element_175 = 0;
		int element_1 = 3;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_165 = null;
		BinaryNode left_176 = null;
		BinaryNode right_177 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		right_144.element = element_163;
		right_144.left = left_164;
		right_144.right = right_165;
		left_164.element = element_175;
		left_164.left = left_176;
		left_164.right = right_177;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK176() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode right_144 = new BinaryNode();
		BinaryNode left_164 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		int element_142 = -1;
		int element_163 = 0;
		int element_73 = 1;
		int element_175 = 0;
		int element_1 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_165 = null;
		BinaryNode left_176 = null;
		BinaryNode right_177 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		right_144.element = element_163;
		right_144.left = left_164;
		right_144.right = right_165;
		left_164.element = element_175;
		left_164.left = left_176;
		left_164.right = right_177;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK177() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode right_144 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		int element_1 = 1;
		int element_142 = -1;
		int element_73 = 0;
		int element_163 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode left_164 = null;
		BinaryNode right_165 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		right_144.element = element_163;
		right_144.left = left_164;
		right_144.right = right_165;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK178() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode right_144 = new BinaryNode();
		obj.root = t;
		BinaryNode left_143 = null;
		int element_1 = 1;
		int element_142 = -1;
		int element_73 = 0;
		int element_163 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode left_164 = null;
		BinaryNode right_165 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		right_144.element = element_163;
		right_144.left = left_164;
		right_144.right = right_165;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK179() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		obj.root = t;
		BinaryNode left_188 = t;
		int element_1 = 1;
		int element_142 = -1;
		int element_73 = 0;
		int element_187 = -2;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		BinaryNode right_189 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK180() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		obj.root = t;
		BinaryNode left_188 = left_2;
		int element_142 = -1;
		int element_73 = 0;
		int element_1 = 1;
		int element_187 = -2;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		BinaryNode right_189 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK181() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		obj.root = t;
		BinaryNode left_188 = left_74;
		int element_142 = 0;
		int element_73 = 1;
		int element_1 = 2;
		int element_187 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		BinaryNode right_189 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK182() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		obj.root = t;
		BinaryNode left_188 = left_143;
		int element_142 = 0;
		int element_73 = 1;
		int element_1 = 2;
		int element_187 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		BinaryNode right_189 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK183() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		obj.root = t;
		BinaryNode left_188 = null;
		BinaryNode right_189 = t;
		int element_142 = 0;
		int element_73 = 1;
		int element_1 = 2;
		int element_187 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK184() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		obj.root = t;
		BinaryNode left_188 = null;
		BinaryNode right_189 = left_2;
		int element_142 = 0;
		int element_73 = 1;
		int element_1 = 2;
		int element_187 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK185() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		obj.root = t;
		BinaryNode left_188 = null;
		BinaryNode right_189 = left_74;
		int element_142 = 0;
		int element_73 = 1;
		int element_1 = 2;
		int element_187 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK186() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		obj.root = t;
		BinaryNode left_188 = null;
		BinaryNode right_189 = left_143;
		int element_142 = 0;
		int element_73 = 1;
		int element_1 = 2;
		int element_187 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK187() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		obj.root = t;
		BinaryNode left_188 = null;
		BinaryNode right_189 = null;
		BinaryNode right_144 = t;
		int element_142 = 0;
		int element_73 = 1;
		int element_1 = 2;
		int element_187 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK188() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		obj.root = t;
		BinaryNode left_188 = null;
		BinaryNode right_189 = null;
		BinaryNode right_144 = left_2;
		int element_142 = 0;
		int element_73 = 1;
		int element_1 = 2;
		int element_187 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK189() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		obj.root = t;
		BinaryNode left_188 = null;
		BinaryNode right_189 = null;
		BinaryNode right_144 = left_74;
		int element_142 = 0;
		int element_73 = 1;
		int element_1 = 2;
		int element_187 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK190() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		obj.root = t;
		BinaryNode left_188 = null;
		BinaryNode right_189 = null;
		BinaryNode right_144 = left_143;
		int element_142 = -1;
		int element_73 = 0;
		int element_1 = 1;
		int element_187 = -2;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK191() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		BinaryNode right_144 = new BinaryNode();
		obj.root = t;
		BinaryNode left_188 = null;
		BinaryNode right_189 = null;
		int element_142 = 0;
		int element_193 = 0;
		int element_73 = 1;
		int element_1 = 2;
		int element_187 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode left_194 = null;
		BinaryNode right_195 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		right_144.element = element_193;
		right_144.left = left_194;
		right_144.right = right_195;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK192() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		BinaryNode right_144 = new BinaryNode();
		obj.root = t;
		BinaryNode left_188 = null;
		BinaryNode right_189 = null;
		int element_142 = -1;
		int element_193 = 0;
		int element_73 = 0;
		int element_1 = 1;
		int element_187 = -2;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode left_194 = null;
		BinaryNode right_195 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		right_144.element = element_193;
		right_144.left = left_194;
		right_144.right = right_195;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK193() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		BinaryNode right_189 = new BinaryNode();
		obj.root = t;
		BinaryNode left_188 = null;
		BinaryNode left_200 = t;
		int element_142 = 0;
		int element_199 = -1;
		int element_73 = 1;
		int element_1 = 2;
		int element_187 = -2;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		BinaryNode right_201 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		right_189.element = element_199;
		right_189.left = left_200;
		right_189.right = right_201;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK194() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		BinaryNode right_189 = new BinaryNode();
		obj.root = t;
		BinaryNode left_188 = null;
		BinaryNode left_200 = left_2;
		int element_142 = 0;
		int element_199 = -1;
		int element_73 = 1;
		int element_1 = 2;
		int element_187 = -2;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		BinaryNode right_201 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		right_189.element = element_199;
		right_189.left = left_200;
		right_189.right = right_201;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK195() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		BinaryNode right_189 = new BinaryNode();
		obj.root = t;
		BinaryNode left_188 = null;
		BinaryNode left_200 = left_74;
		int element_142 = 0;
		int element_199 = -1;
		int element_73 = 1;
		int element_1 = 2;
		int element_187 = -2;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		BinaryNode right_201 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		right_189.element = element_199;
		right_189.left = left_200;
		right_189.right = right_201;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK196() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		BinaryNode right_189 = new BinaryNode();
		obj.root = t;
		BinaryNode left_188 = null;
		BinaryNode left_200 = left_143;
		int element_142 = 0;
		int element_199 = -1;
		int element_73 = 1;
		int element_1 = 2;
		int element_187 = -2;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		BinaryNode right_201 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		right_189.element = element_199;
		right_189.left = left_200;
		right_189.right = right_201;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK197() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		BinaryNode right_189 = new BinaryNode();
		obj.root = t;
		BinaryNode left_188 = null;
		BinaryNode left_200 = right_189;
		int element_142 = 0;
		int element_199 = -1;
		int element_73 = 1;
		int element_1 = 2;
		int element_187 = -2;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		BinaryNode right_201 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		right_189.element = element_199;
		right_189.left = left_200;
		right_189.right = right_201;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK198() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		BinaryNode right_189 = new BinaryNode();
		BinaryNode left_200 = new BinaryNode();
		obj.root = t;
		BinaryNode left_188 = null;
		int element_142 = 2;
		int element_199 = 1;
		int element_73 = 3;
		int element_1 = 4;
		int element_205 = 0;
		int element_187 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		BinaryNode right_201 = null;
		BinaryNode left_206 = null;
		BinaryNode right_207 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		right_189.element = element_199;
		right_189.left = left_200;
		right_189.right = right_201;
		left_200.element = element_205;
		left_200.left = left_206;
		left_200.right = right_207;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK199() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		BinaryNode right_189 = new BinaryNode();
		BinaryNode left_200 = new BinaryNode();
		obj.root = t;
		BinaryNode left_188 = null;
		int element_142 = 1;
		int element_199 = 0;
		int element_73 = 2;
		int element_1 = 3;
		int element_205 = 0;
		int element_187 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		BinaryNode right_201 = null;
		BinaryNode left_206 = null;
		BinaryNode right_207 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		right_189.element = element_199;
		right_189.left = left_200;
		right_189.right = right_201;
		left_200.element = element_205;
		left_200.left = left_206;
		left_200.right = right_207;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK200() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		BinaryNode right_189 = new BinaryNode();
		obj.root = t;
		BinaryNode left_188 = null;
		int element_142 = 0;
		int element_199 = -1;
		int element_73 = 1;
		int element_1 = 2;
		int element_187 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		BinaryNode left_200 = null;
		BinaryNode right_201 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		right_189.element = element_199;
		right_189.left = left_200;
		right_189.right = right_201;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK201() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		BinaryNode right_189 = new BinaryNode();
		obj.root = t;
		BinaryNode left_188 = null;
		int element_142 = 0;
		int element_199 = 0;
		int element_73 = 1;
		int element_1 = 2;
		int element_187 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		BinaryNode left_200 = null;
		BinaryNode right_201 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		right_189.element = element_199;
		right_189.left = left_200;
		right_189.right = right_201;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK202() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		BinaryNode left_188 = new BinaryNode();
		obj.root = t;
		BinaryNode left_212 = t;
		int element_142 = -1;
		int element_211 = -3;
		int element_73 = 0;
		int element_1 = 1;
		int element_187 = -2;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		BinaryNode right_189 = null;
		BinaryNode right_213 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		left_188.element = element_211;
		left_188.left = left_212;
		left_188.right = right_213;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK203() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		BinaryNode left_188 = new BinaryNode();
		obj.root = t;
		BinaryNode left_212 = left_2;
		int element_142 = -1;
		int element_211 = -3;
		int element_73 = 0;
		int element_1 = 1;
		int element_187 = -2;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		BinaryNode right_189 = null;
		BinaryNode right_213 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		left_188.element = element_211;
		left_188.left = left_212;
		left_188.right = right_213;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK204() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		BinaryNode left_188 = new BinaryNode();
		obj.root = t;
		BinaryNode left_212 = left_74;
		int element_142 = 0;
		int element_211 = -2;
		int element_73 = 1;
		int element_1 = 2;
		int element_187 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		BinaryNode right_189 = null;
		BinaryNode right_213 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		left_188.element = element_211;
		left_188.left = left_212;
		left_188.right = right_213;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK205() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		BinaryNode left_188 = new BinaryNode();
		obj.root = t;
		BinaryNode left_212 = left_143;
		int element_142 = 1;
		int element_211 = -1;
		int element_73 = 2;
		int element_1 = 3;
		int element_187 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		BinaryNode right_189 = null;
		BinaryNode right_213 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		left_188.element = element_211;
		left_188.left = left_212;
		left_188.right = right_213;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK206() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		BinaryNode left_188 = new BinaryNode();
		obj.root = t;
		BinaryNode left_212 = left_188;
		int element_142 = 1;
		int element_211 = -1;
		int element_73 = 2;
		int element_1 = 3;
		int element_187 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		BinaryNode right_189 = null;
		BinaryNode right_213 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		left_188.element = element_211;
		left_188.left = left_212;
		left_188.right = right_213;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK207() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		BinaryNode left_188 = new BinaryNode();
		obj.root = t;
		BinaryNode left_212 = null;
		BinaryNode right_213 = t;
		int element_142 = 1;
		int element_211 = -1;
		int element_73 = 2;
		int element_1 = 3;
		int element_187 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		BinaryNode right_189 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		left_188.element = element_211;
		left_188.left = left_212;
		left_188.right = right_213;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK208() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		BinaryNode left_188 = new BinaryNode();
		obj.root = t;
		BinaryNode left_212 = null;
		BinaryNode right_213 = left_2;
		int element_142 = 1;
		int element_211 = -1;
		int element_73 = 2;
		int element_1 = 3;
		int element_187 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		BinaryNode right_189 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		left_188.element = element_211;
		left_188.left = left_212;
		left_188.right = right_213;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK209() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		BinaryNode left_188 = new BinaryNode();
		obj.root = t;
		BinaryNode left_212 = null;
		BinaryNode right_213 = left_74;
		int element_142 = 1;
		int element_211 = -1;
		int element_73 = 2;
		int element_1 = 3;
		int element_187 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		BinaryNode right_189 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		left_188.element = element_211;
		left_188.left = left_212;
		left_188.right = right_213;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK210() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		BinaryNode left_188 = new BinaryNode();
		obj.root = t;
		BinaryNode left_212 = null;
		BinaryNode right_213 = left_143;
		int element_142 = 1;
		int element_211 = -1;
		int element_73 = 2;
		int element_1 = 3;
		int element_187 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		BinaryNode right_189 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		left_188.element = element_211;
		left_188.left = left_212;
		left_188.right = right_213;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK211() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		BinaryNode left_188 = new BinaryNode();
		obj.root = t;
		BinaryNode left_212 = null;
		BinaryNode right_213 = left_188;
		int element_142 = 1;
		int element_211 = -1;
		int element_73 = 2;
		int element_1 = 3;
		int element_187 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		BinaryNode right_189 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		left_188.element = element_211;
		left_188.left = left_212;
		left_188.right = right_213;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK212() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		BinaryNode left_188 = new BinaryNode();
		BinaryNode right_213 = new BinaryNode();
		obj.root = t;
		BinaryNode left_212 = null;
		int element_142 = 1;
		int element_211 = -1;
		int element_217 = -1;
		int element_73 = 2;
		int element_1 = 3;
		int element_187 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		BinaryNode right_189 = null;
		BinaryNode left_218 = null;
		BinaryNode right_219 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		left_188.element = element_211;
		left_188.left = left_212;
		left_188.right = right_213;
		right_213.element = element_217;
		right_213.left = left_218;
		right_213.right = right_219;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK213() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		BinaryNode left_188 = new BinaryNode();
		BinaryNode right_213 = new BinaryNode();
		obj.root = t;
		BinaryNode left_212 = null;
		int element_142 = 1;
		int element_211 = -1;
		int element_217 = 0;
		int element_73 = 2;
		int element_1 = 3;
		int element_187 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		BinaryNode right_189 = null;
		BinaryNode left_218 = null;
		BinaryNode right_219 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		left_188.element = element_211;
		left_188.left = left_212;
		left_188.right = right_213;
		right_213.element = element_217;
		right_213.left = left_218;
		right_213.right = right_219;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK214() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		BinaryNode left_188 = new BinaryNode();
		BinaryNode left_212 = new BinaryNode();
		obj.root = t;
		BinaryNode left_224 = t;
		int element_142 = -1;
		int element_211 = -3;
		int element_73 = 0;
		int element_1 = 1;
		int element_223 = -4;
		int element_187 = -2;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		BinaryNode right_189 = null;
		BinaryNode right_213 = null;
		BinaryNode right_225 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		left_188.element = element_211;
		left_188.left = left_212;
		left_188.right = right_213;
		left_212.element = element_223;
		left_212.left = left_224;
		left_212.right = right_225;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK215() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		BinaryNode left_188 = new BinaryNode();
		BinaryNode left_212 = new BinaryNode();
		obj.root = t;
		BinaryNode left_224 = left_2;
		int element_142 = -1;
		int element_211 = -3;
		int element_73 = 0;
		int element_1 = 1;
		int element_223 = -4;
		int element_187 = -2;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		BinaryNode right_189 = null;
		BinaryNode right_213 = null;
		BinaryNode right_225 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		left_188.element = element_211;
		left_188.left = left_212;
		left_188.right = right_213;
		left_212.element = element_223;
		left_212.left = left_224;
		left_212.right = right_225;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK216() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		BinaryNode left_188 = new BinaryNode();
		BinaryNode left_212 = new BinaryNode();
		obj.root = t;
		BinaryNode left_224 = left_74;
		int element_142 = 0;
		int element_211 = -2;
		int element_73 = 1;
		int element_1 = 2;
		int element_223 = -3;
		int element_187 = -1;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		BinaryNode right_189 = null;
		BinaryNode right_213 = null;
		BinaryNode right_225 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		left_188.element = element_211;
		left_188.left = left_212;
		left_188.right = right_213;
		left_212.element = element_223;
		left_212.left = left_224;
		left_212.right = right_225;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK217() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		BinaryNode left_188 = new BinaryNode();
		BinaryNode left_212 = new BinaryNode();
		obj.root = t;
		BinaryNode left_224 = left_143;
		int element_142 = 1;
		int element_211 = -1;
		int element_73 = 2;
		int element_1 = 3;
		int element_223 = -2;
		int element_187 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		BinaryNode right_189 = null;
		BinaryNode right_213 = null;
		BinaryNode right_225 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		left_188.element = element_211;
		left_188.left = left_212;
		left_188.right = right_213;
		left_212.element = element_223;
		left_212.left = left_224;
		left_212.right = right_225;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK218() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		BinaryNode left_188 = new BinaryNode();
		BinaryNode left_212 = new BinaryNode();
		obj.root = t;
		BinaryNode left_224 = left_188;
		int element_142 = 2;
		int element_211 = 0;
		int element_73 = 3;
		int element_1 = 4;
		int element_223 = -1;
		int element_187 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		BinaryNode right_189 = null;
		BinaryNode right_213 = null;
		BinaryNode right_225 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		left_188.element = element_211;
		left_188.left = left_212;
		left_188.right = right_213;
		left_212.element = element_223;
		left_212.left = left_224;
		left_212.right = right_225;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK219() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		BinaryNode left_188 = new BinaryNode();
		BinaryNode left_212 = new BinaryNode();
		obj.root = t;
		BinaryNode left_224 = left_212;
		int element_142 = 2;
		int element_211 = 0;
		int element_73 = 3;
		int element_1 = 4;
		int element_223 = -1;
		int element_187 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		BinaryNode right_189 = null;
		BinaryNode right_213 = null;
		BinaryNode right_225 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		left_188.element = element_211;
		left_188.left = left_212;
		left_188.right = right_213;
		left_212.element = element_223;
		left_212.left = left_224;
		left_212.right = right_225;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK220() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		BinaryNode left_188 = new BinaryNode();
		BinaryNode left_212 = new BinaryNode();
		BinaryNode left_224 = new BinaryNode();
		obj.root = t;
		int element_142 = 3;
		int element_211 = 1;
		int element_73 = 4;
		int element_1 = 5;
		int element_229 = 0;
		int element_223 = 0;
		int element_187 = 2;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		BinaryNode right_189 = null;
		BinaryNode right_213 = null;
		BinaryNode right_225 = null;
		BinaryNode left_230 = null;
		BinaryNode right_231 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		left_188.element = element_211;
		left_188.left = left_212;
		left_188.right = right_213;
		left_212.element = element_223;
		left_212.left = left_224;
		left_212.right = right_225;
		left_224.element = element_229;
		left_224.left = left_230;
		left_224.right = right_231;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK221() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		BinaryNode left_188 = new BinaryNode();
		BinaryNode left_212 = new BinaryNode();
		obj.root = t;
		int element_142 = 2;
		int element_211 = 0;
		int element_73 = 3;
		int element_1 = 4;
		int element_223 = 0;
		int element_187 = 1;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		BinaryNode right_189 = null;
		BinaryNode right_213 = null;
		BinaryNode left_224 = null;
		BinaryNode right_225 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		left_188.element = element_211;
		left_188.left = left_212;
		left_188.right = right_213;
		left_212.element = element_223;
		left_212.left = left_224;
		left_212.right = right_225;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK222() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		BinaryNode left_188 = new BinaryNode();
		obj.root = t;
		int element_1 = 3;
		int element_142 = 1;
		int element_211 = 0;
		int element_73 = 2;
		int element_187 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		BinaryNode right_189 = null;
		BinaryNode left_212 = null;
		BinaryNode right_213 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		left_188.element = element_211;
		left_188.left = left_212;
		left_188.right = right_213;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK223() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		BinaryNode left_143 = new BinaryNode();
		obj.root = t;
		int element_1 = 2;
		int element_142 = 0;
		int element_73 = 1;
		int element_187 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode right_144 = null;
		BinaryNode left_188 = null;
		BinaryNode right_189 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		left_143.element = element_187;
		left_143.left = left_188;
		left_143.right = right_189;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK224() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_74 = new BinaryNode();
		obj.root = t;
		int element_1 = 1;
		int element_142 = 0;
		int element_73 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_75 = null;
		BinaryNode left_143 = null;
		BinaryNode right_144 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		left_74.element = element_142;
		left_74.left = left_143;
		left_74.right = right_144;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

	@Test
	public void test_repOK225() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		obj.root = t;
		int element_1 = 0;
		int element_73 = 0;
		BinaryNode right_3 = null;
		BinaryNode left_74 = null;
		BinaryNode right_75 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_73;
		left_2.left = left_74;
		left_2.right = right_75;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

}

