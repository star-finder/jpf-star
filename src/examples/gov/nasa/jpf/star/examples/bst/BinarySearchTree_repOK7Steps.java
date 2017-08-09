package gov.nasa.jpf.star.examples.bst;

import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class BinarySearchTree_repOK7Steps extends TestJPF {

	@Test
	public void test_repOK1() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = null;
		obj.root = t;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
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
		assertTrue(Utilities.repOK(obj));
		//obj.repOK(t);
	}

}

