package gov.nasa.jpf.star.examples.avl;

import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class AvlTree_repOK1 extends TestJPF {

	@Test
	public void test_repOK1() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = null;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK2() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = obj.root;
		int element_1 = 0;
		AvlNode right_3 = null;
		int height_4 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK3() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = null;
		AvlNode right_3 = obj.root;
		int element_1 = 0;
		int height_4 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK4() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = null;
		AvlNode right_3 = null;
		int height_4 = 1;
		int element_1 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK5() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = null;
		AvlNode right_3 = null;
		int height_4 = 0;
		int element_1 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK6() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = obj.root;
		int element_1 = -1;
		int element_5 = 0;
		int height_4 = 0;
		AvlNode right_7 = null;
		int height_8 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_5;
		right_3.left = left_6;
		right_3.right = right_7;
		right_3.height = height_8;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK7() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = right_3;
		int element_1 = -1;
		int element_5 = 0;
		int height_4 = 0;
		AvlNode right_7 = null;
		int height_8 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_5;
		right_3.left = left_6;
		right_3.right = right_7;
		right_3.height = height_8;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK8() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = null;
		AvlNode right_7 = obj.root;
		int element_1 = -1;
		int element_5 = 0;
		int height_4 = 0;
		int height_8 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_5;
		right_3.left = left_6;
		right_3.right = right_7;
		right_3.height = height_8;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK9() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = null;
		AvlNode right_7 = right_3;
		int element_1 = -1;
		int element_5 = 0;
		int height_4 = 0;
		int height_8 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_5;
		right_3.left = left_6;
		right_3.right = right_7;
		right_3.height = height_8;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK10() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = null;
		AvlNode right_7 = null;
		int element_1 = -1;
		int height_4 = 3;
		int height_8 = 0;
		int element_5 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_5;
		right_3.left = left_6;
		right_3.right = right_7;
		right_3.height = height_8;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK11() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = null;
		AvlNode right_7 = null;
		int height_4 = 1;
		int element_1 = 0;
		int height_8 = 0;
		int element_5 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_5;
		right_3.left = left_6;
		right_3.right = right_7;
		right_3.height = height_8;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK12() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = null;
		AvlNode right_7 = null;
		int element_1 = 0;
		int height_8 = 3;
		int element_5 = 1;
		int height_4 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_5;
		right_3.left = left_6;
		right_3.right = right_7;
		right_3.height = height_8;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK13() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = null;
		AvlNode right_7 = null;
		int element_1 = -1;
		int height_4 = 2;
		int height_8 = -2;
		int element_5 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_5;
		right_3.left = left_6;
		right_3.right = right_7;
		right_3.height = height_8;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK14() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = null;
		AvlNode right_7 = null;
		int height_4 = 0;
		int element_1 = 0;
		int height_8 = -2;
		int element_5 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_5;
		right_3.left = left_6;
		right_3.right = right_7;
		right_3.height = height_8;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK15() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = null;
		AvlNode right_7 = null;
		int element_1 = -1;
		int height_4 = 2;
		int height_8 = -1;
		int element_5 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_5;
		right_3.left = left_6;
		right_3.right = right_7;
		right_3.height = height_8;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK16() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = null;
		AvlNode right_7 = null;
		int height_4 = 0;
		int element_1 = 0;
		int height_8 = -1;
		int element_5 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_5;
		right_3.left = left_6;
		right_3.right = right_7;
		right_3.height = height_8;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK17() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode right_7 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = null;
		int element_1 = -1;
		int element_9 = 0;
		int element_5 = 0;
		int height_4 = 0;
		int height_8 = 0;
		AvlNode left_10 = null;
		AvlNode right_11 = null;
		int height_12 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_5;
		right_3.left = left_6;
		right_3.right = right_7;
		right_3.height = height_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.height = height_12;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK18() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_6 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_18 = obj.root;
		int element_1 = -2;
		int element_17 = -1;
		int element_5 = 0;
		int height_4 = 0;
		AvlNode right_7 = null;
		int height_8 = 0;
		AvlNode right_19 = null;
		int height_20 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_5;
		right_3.left = left_6;
		right_3.right = right_7;
		right_3.height = height_8;
		left_6.element = element_17;
		left_6.left = left_18;
		left_6.right = right_19;
		left_6.height = height_20;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK19() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_6 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_18 = right_3;
		int element_1 = 0;
		int element_17 = 1;
		int element_5 = 2;
		int height_4 = 0;
		AvlNode right_7 = null;
		int height_8 = 0;
		AvlNode right_19 = null;
		int height_20 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_5;
		right_3.left = left_6;
		right_3.right = right_7;
		right_3.height = height_8;
		left_6.element = element_17;
		left_6.left = left_18;
		left_6.right = right_19;
		left_6.height = height_20;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK20() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_6 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_18 = left_6;
		int element_1 = -2;
		int element_17 = -1;
		int element_5 = 0;
		int height_4 = 0;
		AvlNode right_7 = null;
		int height_8 = 0;
		AvlNode right_19 = null;
		int height_20 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_5;
		right_3.left = left_6;
		right_3.right = right_7;
		right_3.height = height_8;
		left_6.element = element_17;
		left_6.left = left_18;
		left_6.right = right_19;
		left_6.height = height_20;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK21() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_6 = new AvlNode();
		AvlNode left_18 = new AvlNode();
		AvlNode left_2 = null;
		int element_1 = 0;
		int element_17 = 1;
		int element_25 = 0;
		int element_5 = 2;
		int height_4 = 0;
		AvlNode right_7 = null;
		int height_8 = 0;
		AvlNode right_19 = null;
		int height_20 = 0;
		AvlNode left_26 = null;
		AvlNode right_27 = null;
		int height_28 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_5;
		right_3.left = left_6;
		right_3.right = right_7;
		right_3.height = height_8;
		left_6.element = element_17;
		left_6.left = left_18;
		left_6.right = right_19;
		left_6.height = height_20;
		left_18.element = element_25;
		left_18.left = left_26;
		left_18.right = right_27;
		left_18.height = height_28;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK22() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_6 = new AvlNode();
		AvlNode left_18 = new AvlNode();
		AvlNode left_2 = null;
		int element_1 = -1;
		int element_17 = 0;
		int element_25 = 0;
		int element_5 = 1;
		int height_4 = 0;
		AvlNode right_7 = null;
		int height_8 = 0;
		AvlNode right_19 = null;
		int height_20 = 0;
		AvlNode left_26 = null;
		AvlNode right_27 = null;
		int height_28 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_5;
		right_3.left = left_6;
		right_3.right = right_7;
		right_3.height = height_8;
		left_6.element = element_17;
		left_6.left = left_18;
		left_6.right = right_19;
		left_6.height = height_20;
		left_18.element = element_25;
		left_18.left = left_26;
		left_18.right = right_27;
		left_18.height = height_28;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK23() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_6 = new AvlNode();
		AvlNode left_2 = null;
		int element_1 = -1;
		int element_17 = -1;
		int element_5 = 0;
		int height_4 = 0;
		AvlNode right_7 = null;
		int height_8 = 0;
		AvlNode left_18 = null;
		AvlNode right_19 = null;
		int height_20 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_5;
		right_3.left = left_6;
		right_3.right = right_7;
		right_3.height = height_8;
		left_6.element = element_17;
		left_6.left = left_18;
		left_6.right = right_19;
		left_6.height = height_20;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK24() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_6 = new AvlNode();
		AvlNode left_2 = null;
		int element_1 = -1;
		int element_17 = 0;
		int element_5 = 0;
		int height_4 = 0;
		AvlNode right_7 = null;
		int height_8 = 0;
		AvlNode left_18 = null;
		AvlNode right_19 = null;
		int height_20 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_5;
		right_3.left = left_6;
		right_3.right = right_7;
		right_3.height = height_8;
		left_6.element = element_17;
		left_6.left = left_18;
		left_6.right = right_19;
		left_6.height = height_20;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK25() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		int element_1 = 0;
		int element_5 = 0;
		int height_4 = 0;
		AvlNode left_6 = null;
		AvlNode right_7 = null;
		int height_8 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_5;
		right_3.left = left_6;
		right_3.right = right_7;
		right_3.height = height_8;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK26() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_34 = obj.root;
		int element_1 = 1;
		int element_33 = 0;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode right_35 = null;
		int height_36 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_33;
		left_2.left = left_34;
		left_2.right = right_35;
		left_2.height = height_36;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK27() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_34 = left_2;
		int element_1 = 0;
		int element_33 = -1;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode right_35 = null;
		int height_36 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_33;
		left_2.left = left_34;
		left_2.right = right_35;
		left_2.height = height_36;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK28() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_34 = null;
		AvlNode right_35 = obj.root;
		int element_1 = 1;
		int element_33 = 0;
		AvlNode right_3 = null;
		int height_4 = 0;
		int height_36 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_33;
		left_2.left = left_34;
		left_2.right = right_35;
		left_2.height = height_36;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK29() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_34 = null;
		AvlNode right_35 = left_2;
		int element_1 = 0;
		int element_33 = -1;
		AvlNode right_3 = null;
		int height_4 = 0;
		int height_36 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_33;
		left_2.left = left_34;
		left_2.right = right_35;
		left_2.height = height_36;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK30() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_34 = null;
		AvlNode right_35 = null;
		AvlNode right_3 = obj.root;
		int element_1 = 1;
		int element_33 = 0;
		int height_4 = 0;
		int height_36 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_33;
		left_2.left = left_34;
		left_2.right = right_35;
		left_2.height = height_36;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK31() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_34 = null;
		AvlNode right_35 = null;
		AvlNode right_3 = left_2;
		int element_1 = 1;
		int element_33 = 0;
		int height_4 = 0;
		int height_36 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_33;
		left_2.left = left_34;
		left_2.right = right_35;
		left_2.height = height_36;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK32() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_34 = null;
		AvlNode right_35 = null;
		AvlNode right_3 = null;
		int height_36 = -2;
		int element_1 = 1;
		int element_33 = 0;
		int height_4 = 3;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_33;
		left_2.left = left_34;
		left_2.right = right_35;
		left_2.height = height_36;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK33() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_34 = null;
		AvlNode right_35 = null;
		AvlNode right_3 = null;
		int height_36 = -2;
		int height_4 = 0;
		int element_1 = 1;
		int element_33 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_33;
		left_2.left = left_34;
		left_2.right = right_35;
		left_2.height = height_36;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK34() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_34 = null;
		AvlNode right_35 = null;
		AvlNode right_3 = null;
		int element_1 = 1;
		int element_33 = 0;
		int height_36 = 3;
		int height_4 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_33;
		left_2.left = left_34;
		left_2.right = right_35;
		left_2.height = height_36;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK35() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_34 = null;
		AvlNode right_35 = null;
		AvlNode right_3 = null;
		int height_36 = 0;
		int element_1 = 1;
		int element_33 = 0;
		int height_4 = 3;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_33;
		left_2.left = left_34;
		left_2.right = right_35;
		left_2.height = height_36;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK36() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_34 = null;
		AvlNode right_35 = null;
		AvlNode right_3 = null;
		int height_36 = 0;
		int height_4 = 1;
		int element_33 = -1;
		int element_1 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_33;
		left_2.left = left_34;
		left_2.right = right_35;
		left_2.height = height_36;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK37() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_34 = null;
		AvlNode right_35 = null;
		AvlNode right_3 = null;
		int height_36 = -1;
		int element_33 = -1;
		int element_1 = 0;
		int height_4 = 2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_33;
		left_2.left = left_34;
		left_2.right = right_35;
		left_2.height = height_36;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK38() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_34 = null;
		AvlNode right_35 = null;
		AvlNode right_3 = null;
		int height_36 = -1;
		int height_4 = 0;
		int element_33 = 0;
		int element_1 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_33;
		left_2.left = left_34;
		left_2.right = right_35;
		left_2.height = height_36;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK39() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_34 = null;
		AvlNode right_35 = null;
		int element_1 = 0;
		int element_33 = -1;
		int element_37 = 0;
		int height_4 = 0;
		int height_36 = 0;
		AvlNode left_38 = null;
		AvlNode right_39 = null;
		int height_40 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_33;
		left_2.left = left_34;
		left_2.right = right_35;
		left_2.height = height_36;
		right_3.element = element_37;
		right_3.left = left_38;
		right_3.right = right_39;
		right_3.height = height_40;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK40() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_35 = new AvlNode();
		AvlNode left_34 = null;
		AvlNode left_46 = obj.root;
		int element_1 = 2;
		int element_33 = 0;
		int element_45 = 1;
		AvlNode right_3 = null;
		int height_4 = 0;
		int height_36 = 0;
		AvlNode right_47 = null;
		int height_48 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_33;
		left_2.left = left_34;
		left_2.right = right_35;
		left_2.height = height_36;
		right_35.element = element_45;
		right_35.left = left_46;
		right_35.right = right_47;
		right_35.height = height_48;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK41() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_35 = new AvlNode();
		AvlNode left_34 = null;
		AvlNode left_46 = left_2;
		int element_1 = 0;
		int element_33 = -2;
		int element_45 = -1;
		AvlNode right_3 = null;
		int height_4 = 0;
		int height_36 = 0;
		AvlNode right_47 = null;
		int height_48 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_33;
		left_2.left = left_34;
		left_2.right = right_35;
		left_2.height = height_36;
		right_35.element = element_45;
		right_35.left = left_46;
		right_35.right = right_47;
		right_35.height = height_48;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK42() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_35 = new AvlNode();
		AvlNode left_34 = null;
		AvlNode left_46 = right_35;
		int element_1 = 0;
		int element_33 = -2;
		int element_45 = -1;
		AvlNode right_3 = null;
		int height_4 = 0;
		int height_36 = 0;
		AvlNode right_47 = null;
		int height_48 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_33;
		left_2.left = left_34;
		left_2.right = right_35;
		left_2.height = height_36;
		right_35.element = element_45;
		right_35.left = left_46;
		right_35.right = right_47;
		right_35.height = height_48;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK43() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_35 = new AvlNode();
		AvlNode left_46 = new AvlNode();
		AvlNode left_34 = null;
		int element_1 = 2;
		int element_33 = 0;
		int element_45 = 1;
		int element_53 = 0;
		AvlNode right_3 = null;
		int height_4 = 0;
		int height_36 = 0;
		AvlNode right_47 = null;
		int height_48 = 0;
		AvlNode left_54 = null;
		AvlNode right_55 = null;
		int height_56 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_33;
		left_2.left = left_34;
		left_2.right = right_35;
		left_2.height = height_36;
		right_35.element = element_45;
		right_35.left = left_46;
		right_35.right = right_47;
		right_35.height = height_48;
		left_46.element = element_53;
		left_46.left = left_54;
		left_46.right = right_55;
		left_46.height = height_56;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK44() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_35 = new AvlNode();
		AvlNode left_46 = new AvlNode();
		AvlNode left_34 = null;
		int element_1 = 1;
		int element_33 = -1;
		int element_45 = 0;
		int element_53 = 0;
		AvlNode right_3 = null;
		int height_4 = 0;
		int height_36 = 0;
		AvlNode right_47 = null;
		int height_48 = 0;
		AvlNode left_54 = null;
		AvlNode right_55 = null;
		int height_56 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_33;
		left_2.left = left_34;
		left_2.right = right_35;
		left_2.height = height_36;
		right_35.element = element_45;
		right_35.left = left_46;
		right_35.right = right_47;
		right_35.height = height_48;
		left_46.element = element_53;
		left_46.left = left_54;
		left_46.right = right_55;
		left_46.height = height_56;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK45() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_35 = new AvlNode();
		AvlNode left_34 = null;
		int element_1 = 0;
		int element_33 = -1;
		int element_45 = -1;
		AvlNode right_3 = null;
		int height_4 = 0;
		int height_36 = 0;
		AvlNode left_46 = null;
		AvlNode right_47 = null;
		int height_48 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_33;
		left_2.left = left_34;
		left_2.right = right_35;
		left_2.height = height_36;
		right_35.element = element_45;
		right_35.left = left_46;
		right_35.right = right_47;
		right_35.height = height_48;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK46() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_35 = new AvlNode();
		AvlNode left_34 = null;
		int element_1 = 0;
		int element_33 = -1;
		int element_45 = 0;
		AvlNode right_3 = null;
		int height_4 = 0;
		int height_36 = 0;
		AvlNode left_46 = null;
		AvlNode right_47 = null;
		int height_48 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_33;
		left_2.left = left_34;
		left_2.right = right_35;
		left_2.height = height_36;
		right_35.element = element_45;
		right_35.left = left_46;
		right_35.right = right_47;
		right_35.height = height_48;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK47() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_34 = new AvlNode();
		AvlNode left_62 = obj.root;
		int element_1 = 1;
		int element_33 = 0;
		int element_61 = -1;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode right_35 = null;
		int height_36 = 0;
		AvlNode right_63 = null;
		int height_64 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_33;
		left_2.left = left_34;
		left_2.right = right_35;
		left_2.height = height_36;
		left_34.element = element_61;
		left_34.left = left_62;
		left_34.right = right_63;
		left_34.height = height_64;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK48() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_34 = new AvlNode();
		AvlNode left_62 = left_2;
		int element_1 = 1;
		int element_33 = 0;
		int element_61 = -1;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode right_35 = null;
		int height_36 = 0;
		AvlNode right_63 = null;
		int height_64 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_33;
		left_2.left = left_34;
		left_2.right = right_35;
		left_2.height = height_36;
		left_34.element = element_61;
		left_34.left = left_62;
		left_34.right = right_63;
		left_34.height = height_64;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK49() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_34 = new AvlNode();
		AvlNode left_62 = left_34;
		int element_1 = 1;
		int element_33 = 0;
		int element_61 = -1;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode right_35 = null;
		int height_36 = 0;
		AvlNode right_63 = null;
		int height_64 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_33;
		left_2.left = left_34;
		left_2.right = right_35;
		left_2.height = height_36;
		left_34.element = element_61;
		left_34.left = left_62;
		left_34.right = right_63;
		left_34.height = height_64;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK50() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_34 = new AvlNode();
		AvlNode left_62 = null;
		AvlNode right_63 = obj.root;
		int element_1 = 1;
		int element_33 = 0;
		int element_61 = -1;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode right_35 = null;
		int height_36 = 0;
		int height_64 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_33;
		left_2.left = left_34;
		left_2.right = right_35;
		left_2.height = height_36;
		left_34.element = element_61;
		left_34.left = left_62;
		left_34.right = right_63;
		left_34.height = height_64;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK51() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_34 = new AvlNode();
		AvlNode left_62 = null;
		AvlNode right_63 = left_2;
		int element_1 = 1;
		int element_33 = 0;
		int element_61 = -1;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode right_35 = null;
		int height_36 = 0;
		int height_64 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_33;
		left_2.left = left_34;
		left_2.right = right_35;
		left_2.height = height_36;
		left_34.element = element_61;
		left_34.left = left_62;
		left_34.right = right_63;
		left_34.height = height_64;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK52() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_34 = new AvlNode();
		AvlNode left_62 = null;
		AvlNode right_63 = left_34;
		int element_1 = 1;
		int element_33 = 0;
		int element_61 = -1;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode right_35 = null;
		int height_36 = 0;
		int height_64 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_33;
		left_2.left = left_34;
		left_2.right = right_35;
		left_2.height = height_36;
		left_34.element = element_61;
		left_34.left = left_62;
		left_34.right = right_63;
		left_34.height = height_64;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK53() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_34 = new AvlNode();
		AvlNode right_63 = new AvlNode();
		AvlNode left_62 = null;
		int element_1 = 1;
		int element_33 = 0;
		int element_69 = -1;
		int element_61 = -1;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode right_35 = null;
		int height_36 = 0;
		int height_64 = 0;
		AvlNode left_70 = null;
		AvlNode right_71 = null;
		int height_72 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_33;
		left_2.left = left_34;
		left_2.right = right_35;
		left_2.height = height_36;
		left_34.element = element_61;
		left_34.left = left_62;
		left_34.right = right_63;
		left_34.height = height_64;
		right_63.element = element_69;
		right_63.left = left_70;
		right_63.right = right_71;
		right_63.height = height_72;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK54() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_34 = new AvlNode();
		AvlNode right_63 = new AvlNode();
		AvlNode left_62 = null;
		int element_1 = 1;
		int element_33 = 0;
		int element_69 = 0;
		int element_61 = -1;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode right_35 = null;
		int height_36 = 0;
		int height_64 = 0;
		AvlNode left_70 = null;
		AvlNode right_71 = null;
		int height_72 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_33;
		left_2.left = left_34;
		left_2.right = right_35;
		left_2.height = height_36;
		left_34.element = element_61;
		left_34.left = left_62;
		left_34.right = right_63;
		left_34.height = height_64;
		right_63.element = element_69;
		right_63.left = left_70;
		right_63.right = right_71;
		right_63.height = height_72;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK55() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_34 = new AvlNode();
		AvlNode left_62 = new AvlNode();
		AvlNode left_78 = obj.root;
		int element_1 = 1;
		int element_33 = 0;
		int element_77 = -2;
		int element_61 = -1;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode right_35 = null;
		int height_36 = 0;
		AvlNode right_63 = null;
		int height_64 = 0;
		AvlNode right_79 = null;
		int height_80 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_33;
		left_2.left = left_34;
		left_2.right = right_35;
		left_2.height = height_36;
		left_34.element = element_61;
		left_34.left = left_62;
		left_34.right = right_63;
		left_34.height = height_64;
		left_62.element = element_77;
		left_62.left = left_78;
		left_62.right = right_79;
		left_62.height = height_80;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK56() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_34 = new AvlNode();
		AvlNode left_62 = new AvlNode();
		AvlNode left_78 = left_2;
		int element_1 = 1;
		int element_33 = 0;
		int element_77 = -2;
		int element_61 = -1;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode right_35 = null;
		int height_36 = 0;
		AvlNode right_63 = null;
		int height_64 = 0;
		AvlNode right_79 = null;
		int height_80 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_33;
		left_2.left = left_34;
		left_2.right = right_35;
		left_2.height = height_36;
		left_34.element = element_61;
		left_34.left = left_62;
		left_34.right = right_63;
		left_34.height = height_64;
		left_62.element = element_77;
		left_62.left = left_78;
		left_62.right = right_79;
		left_62.height = height_80;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK57() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_34 = new AvlNode();
		AvlNode left_62 = new AvlNode();
		AvlNode left_78 = left_34;
		int element_1 = 2;
		int element_33 = 1;
		int element_77 = -1;
		int element_61 = 0;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode right_35 = null;
		int height_36 = 0;
		AvlNode right_63 = null;
		int height_64 = 0;
		AvlNode right_79 = null;
		int height_80 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_33;
		left_2.left = left_34;
		left_2.right = right_35;
		left_2.height = height_36;
		left_34.element = element_61;
		left_34.left = left_62;
		left_34.right = right_63;
		left_34.height = height_64;
		left_62.element = element_77;
		left_62.left = left_78;
		left_62.right = right_79;
		left_62.height = height_80;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK58() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_34 = new AvlNode();
		AvlNode left_62 = new AvlNode();
		AvlNode left_78 = left_62;
		int element_1 = 2;
		int element_33 = 1;
		int element_77 = -1;
		int element_61 = 0;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode right_35 = null;
		int height_36 = 0;
		AvlNode right_63 = null;
		int height_64 = 0;
		AvlNode right_79 = null;
		int height_80 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_33;
		left_2.left = left_34;
		left_2.right = right_35;
		left_2.height = height_36;
		left_34.element = element_61;
		left_34.left = left_62;
		left_34.right = right_63;
		left_34.height = height_64;
		left_62.element = element_77;
		left_62.left = left_78;
		left_62.right = right_79;
		left_62.height = height_80;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK59() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_34 = new AvlNode();
		AvlNode left_62 = new AvlNode();
		AvlNode left_78 = new AvlNode();
		int element_1 = 3;
		int element_33 = 2;
		int element_77 = 0;
		int element_85 = 0;
		int element_61 = 1;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode right_35 = null;
		int height_36 = 0;
		AvlNode right_63 = null;
		int height_64 = 0;
		AvlNode right_79 = null;
		int height_80 = 0;
		AvlNode left_86 = null;
		AvlNode right_87 = null;
		int height_88 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_33;
		left_2.left = left_34;
		left_2.right = right_35;
		left_2.height = height_36;
		left_34.element = element_61;
		left_34.left = left_62;
		left_34.right = right_63;
		left_34.height = height_64;
		left_62.element = element_77;
		left_62.left = left_78;
		left_62.right = right_79;
		left_62.height = height_80;
		left_78.element = element_85;
		left_78.left = left_86;
		left_78.right = right_87;
		left_78.height = height_88;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK60() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_34 = new AvlNode();
		AvlNode left_62 = new AvlNode();
		int element_1 = 2;
		int element_33 = 1;
		int element_77 = 0;
		int element_61 = 0;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode right_35 = null;
		int height_36 = 0;
		AvlNode right_63 = null;
		int height_64 = 0;
		AvlNode left_78 = null;
		AvlNode right_79 = null;
		int height_80 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_33;
		left_2.left = left_34;
		left_2.right = right_35;
		left_2.height = height_36;
		left_34.element = element_61;
		left_34.left = left_62;
		left_34.right = right_63;
		left_34.height = height_64;
		left_62.element = element_77;
		left_62.left = left_78;
		left_62.right = right_79;
		left_62.height = height_80;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK61() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_34 = new AvlNode();
		int element_1 = 1;
		int element_33 = 0;
		int element_61 = 0;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode right_35 = null;
		int height_36 = 0;
		AvlNode left_62 = null;
		AvlNode right_63 = null;
		int height_64 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_33;
		left_2.left = left_34;
		left_2.right = right_35;
		left_2.height = height_36;
		left_34.element = element_61;
		left_34.left = left_62;
		left_34.right = right_63;
		left_34.height = height_64;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK62() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		int element_1 = 0;
		int element_33 = 0;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode left_34 = null;
		AvlNode right_35 = null;
		int height_36 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_33;
		left_2.left = left_34;
		left_2.right = right_35;
		left_2.height = height_36;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

}

