package gov.nasa.jpf.star.examples.avl;

import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class AvlTree_repOK5Steps extends TestJPF {

	@Test
	public void test_repOK1() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = null;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK4() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = null;
		AvlNode right_3 = left_2;
		int height_4 = 1;
		int element_1 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK5() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = null;
		AvlNode right_3 = left_2;
		int height_4 = 0;
		int element_1 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK6() throws Exception {
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK7() throws Exception {
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK8() throws Exception {
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK9() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = left_2;
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK10() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = left_2;
		AvlNode right_7 = left_2;
		int element_1 = 0;
		int height_4 = 3;
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK11() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = left_2;
		AvlNode right_7 = left_2;
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK12() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = left_2;
		AvlNode right_7 = left_2;
		int element_1 = -1;
		int height_8 = 2;
		int element_5 = 0;
		int height_4 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_5;
		right_3.left = left_6;
		right_3.right = right_7;
		right_3.height = height_8;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK13() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = left_2;
		AvlNode right_7 = left_2;
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK14() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = left_2;
		AvlNode right_7 = left_2;
		int height_4 = 0;
		int element_1 = -1;
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK15() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = left_2;
		AvlNode right_7 = left_2;
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK16() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = left_2;
		AvlNode right_7 = left_2;
		int height_4 = 0;
		int element_1 = -1;
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK17() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = left_2;
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK18() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = left_2;
		AvlNode right_7 = left_6;
		int element_1 = 0;
		int height_4 = 3;
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK19() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = left_2;
		AvlNode right_7 = left_6;
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK20() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = left_2;
		AvlNode right_7 = left_6;
		int element_1 = -1;
		int height_8 = 2;
		int element_5 = 0;
		int height_4 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_5;
		right_3.left = left_6;
		right_3.right = right_7;
		right_3.height = height_8;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK21() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = left_2;
		AvlNode right_7 = left_6;
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK22() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = left_2;
		AvlNode right_7 = left_6;
		int height_4 = 0;
		int element_1 = -1;
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK23() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = left_2;
		AvlNode right_7 = left_6;
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK24() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = left_2;
		AvlNode right_7 = left_6;
		int height_4 = 0;
		int element_1 = -1;
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK25() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = left_2;
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK26() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = left_2;
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK27() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = left_2;
		AvlNode right_7 = null;
		int element_1 = -1;
		int height_8 = 2;
		int element_5 = 0;
		int height_4 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_5;
		right_3.left = left_6;
		right_3.right = right_7;
		right_3.height = height_8;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK28() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = left_2;
		AvlNode right_7 = null;
		int element_1 = 0;
		int height_4 = 3;
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK29() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = left_2;
		AvlNode right_7 = null;
		int height_4 = 0;
		int element_1 = -1;
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK30() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = left_2;
		AvlNode right_7 = null;
		int element_1 = 0;
		int height_4 = 3;
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK31() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = left_2;
		AvlNode right_7 = null;
		int height_4 = 0;
		int element_1 = -1;
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK32() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode right_7 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = left_2;
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK33() throws Exception {
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK34() throws Exception {
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK35() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = null;
		AvlNode right_7 = left_2;
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK36() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = null;
		AvlNode right_7 = left_2;
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK37() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = null;
		AvlNode right_7 = left_2;
		int element_1 = -1;
		int height_8 = 2;
		int element_5 = 0;
		int height_4 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_5;
		right_3.left = left_6;
		right_3.right = right_7;
		right_3.height = height_8;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK38() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = null;
		AvlNode right_7 = left_2;
		int element_1 = 0;
		int height_4 = 3;
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK39() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = null;
		AvlNode right_7 = left_2;
		int height_4 = 0;
		int element_1 = -1;
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK40() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = null;
		AvlNode right_7 = left_2;
		int element_1 = 0;
		int height_4 = 3;
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK41() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = null;
		AvlNode right_7 = left_2;
		int height_4 = 0;
		int element_1 = -1;
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK42() throws Exception {
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK43() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = null;
		AvlNode right_7 = left_6;
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK44() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = null;
		AvlNode right_7 = left_6;
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK45() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = null;
		AvlNode right_7 = left_6;
		int element_1 = -1;
		int height_8 = 2;
		int element_5 = 0;
		int height_4 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_5;
		right_3.left = left_6;
		right_3.right = right_7;
		right_3.height = height_8;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK46() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = null;
		AvlNode right_7 = left_6;
		int element_1 = 0;
		int height_4 = 3;
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK47() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = null;
		AvlNode right_7 = left_6;
		int height_4 = 0;
		int element_1 = -1;
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK48() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = null;
		AvlNode right_7 = left_6;
		int element_1 = 0;
		int height_4 = 3;
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK49() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = null;
		AvlNode right_7 = left_6;
		int height_4 = 0;
		int element_1 = -1;
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK50() throws Exception {
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK51() throws Exception {
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK52() throws Exception {
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK53() throws Exception {
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK54() throws Exception {
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK55() throws Exception {
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK56() throws Exception {
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK57() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode right_7 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_6 = null;
		int element_1 = -1;
		int element_17 = 0;
		int element_5 = 0;
		int height_4 = 0;
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
		right_7.element = element_17;
		right_7.left = left_18;
		right_7.right = right_19;
		right_7.height = height_20;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK58() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_6 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_26 = obj.root;
		int element_1 = -2;
		int element_25 = -1;
		int element_5 = 0;
		int height_4 = 0;
		AvlNode right_7 = null;
		int height_8 = 0;
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
		left_6.element = element_25;
		left_6.left = left_26;
		left_6.right = right_27;
		left_6.height = height_28;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK59() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_6 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_26 = right_3;
		int element_1 = 0;
		int element_25 = 1;
		int element_5 = 2;
		int height_4 = 0;
		AvlNode right_7 = null;
		int height_8 = 0;
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
		left_6.element = element_25;
		left_6.left = left_26;
		left_6.right = right_27;
		left_6.height = height_28;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK60() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_6 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_26 = left_6;
		int element_1 = -2;
		int element_25 = -1;
		int element_5 = 0;
		int height_4 = 0;
		AvlNode right_7 = null;
		int height_8 = 0;
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
		left_6.element = element_25;
		left_6.left = left_26;
		left_6.right = right_27;
		left_6.height = height_28;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK61() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_6 = new AvlNode();
		AvlNode left_26 = new AvlNode();
		AvlNode left_2 = null;
		int element_1 = 0;
		int element_37 = 0;
		int element_25 = 1;
		int element_5 = 2;
		int height_4 = 0;
		AvlNode right_7 = null;
		int height_8 = 0;
		AvlNode right_27 = null;
		int height_28 = 0;
		AvlNode left_38 = null;
		AvlNode right_39 = null;
		int height_40 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_5;
		right_3.left = left_6;
		right_3.right = right_7;
		right_3.height = height_8;
		left_6.element = element_25;
		left_6.left = left_26;
		left_6.right = right_27;
		left_6.height = height_28;
		left_26.element = element_37;
		left_26.left = left_38;
		left_26.right = right_39;
		left_26.height = height_40;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK62() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_6 = new AvlNode();
		AvlNode left_26 = new AvlNode();
		AvlNode left_2 = null;
		int element_1 = -1;
		int element_37 = 0;
		int element_25 = 0;
		int element_5 = 1;
		int height_4 = 0;
		AvlNode right_7 = null;
		int height_8 = 0;
		AvlNode right_27 = null;
		int height_28 = 0;
		AvlNode left_38 = null;
		AvlNode right_39 = null;
		int height_40 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_5;
		right_3.left = left_6;
		right_3.right = right_7;
		right_3.height = height_8;
		left_6.element = element_25;
		left_6.left = left_26;
		left_6.right = right_27;
		left_6.height = height_28;
		left_26.element = element_37;
		left_26.left = left_38;
		left_26.right = right_39;
		left_26.height = height_40;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK63() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_6 = new AvlNode();
		AvlNode left_2 = null;
		int element_1 = -1;
		int element_25 = -1;
		int element_5 = 0;
		int height_4 = 0;
		AvlNode right_7 = null;
		int height_8 = 0;
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
		left_6.element = element_25;
		left_6.left = left_26;
		left_6.right = right_27;
		left_6.height = height_28;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK64() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_6 = new AvlNode();
		AvlNode left_2 = null;
		int element_1 = -1;
		int element_25 = 0;
		int element_5 = 0;
		int height_4 = 0;
		AvlNode right_7 = null;
		int height_8 = 0;
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
		left_6.element = element_25;
		left_6.left = left_26;
		left_6.right = right_27;
		left_6.height = height_28;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK65() throws Exception {
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
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK66() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = obj.root;
		int element_1 = 1;
		int element_45 = 0;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode right_47 = null;
		int height_48 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK67() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = left_2;
		int element_45 = -1;
		int element_1 = 0;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode right_47 = null;
		int height_48 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK68() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = obj.root;
		int element_1 = 1;
		int element_45 = 0;
		AvlNode right_3 = null;
		int height_4 = 0;
		int height_48 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK69() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = left_2;
		int element_45 = -1;
		int element_1 = 0;
		AvlNode right_3 = null;
		int height_4 = 0;
		int height_48 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK70() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = left_46;
		AvlNode right_3 = obj.root;
		int element_1 = 1;
		int element_45 = 0;
		int height_4 = 0;
		int height_48 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK71() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = left_46;
		AvlNode right_3 = left_2;
		int element_1 = 1;
		int element_45 = 0;
		int height_4 = 0;
		int height_48 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK72() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = left_46;
		AvlNode right_3 = left_46;
		int element_1 = 1;
		int element_45 = 0;
		int height_48 = -2;
		int height_4 = 3;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK73() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = left_46;
		AvlNode right_3 = left_46;
		int height_4 = 0;
		int element_1 = 1;
		int height_48 = -2;
		int element_45 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK74() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = left_46;
		AvlNode right_3 = left_46;
		int element_1 = 1;
		int element_45 = 0;
		int height_48 = 3;
		int height_4 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK75() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = left_46;
		AvlNode right_3 = left_46;
		int element_1 = 1;
		int element_45 = 0;
		int height_48 = 0;
		int height_4 = 3;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK76() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = left_46;
		AvlNode right_3 = left_46;
		int height_4 = 1;
		int element_45 = -1;
		int height_48 = 0;
		int element_1 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK77() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = left_46;
		AvlNode right_3 = left_46;
		int element_45 = -1;
		int element_1 = 0;
		int height_48 = -1;
		int height_4 = 2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK78() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = left_46;
		AvlNode right_3 = left_46;
		int height_4 = 0;
		int element_45 = 0;
		int height_48 = -1;
		int element_1 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK79() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = left_46;
		AvlNode right_3 = right_47;
		int element_1 = 1;
		int element_45 = 0;
		int height_48 = -2;
		int height_4 = 3;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK80() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = left_46;
		AvlNode right_3 = right_47;
		int height_4 = 0;
		int element_1 = 1;
		int height_48 = -2;
		int element_45 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK81() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = left_46;
		AvlNode right_3 = right_47;
		int element_1 = 1;
		int element_45 = 0;
		int height_48 = 3;
		int height_4 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK82() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = left_46;
		AvlNode right_3 = right_47;
		int element_1 = 1;
		int element_45 = 0;
		int height_48 = 0;
		int height_4 = 3;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK83() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = left_46;
		AvlNode right_3 = right_47;
		int height_4 = 1;
		int element_45 = -1;
		int height_48 = 0;
		int element_1 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK84() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = left_46;
		AvlNode right_3 = right_47;
		int element_45 = -1;
		int element_1 = 0;
		int height_48 = -1;
		int height_4 = 2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK85() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = left_46;
		AvlNode right_3 = right_47;
		int height_4 = 0;
		int element_45 = 0;
		int height_48 = -1;
		int element_1 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK86() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = left_46;
		AvlNode right_3 = null;
		int element_1 = 1;
		int element_45 = 0;
		int height_48 = -2;
		int height_4 = 3;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK87() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = left_46;
		AvlNode right_3 = null;
		int height_4 = 0;
		int element_1 = 1;
		int height_48 = -2;
		int element_45 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK88() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = left_46;
		AvlNode right_3 = null;
		int element_45 = -1;
		int element_1 = 0;
		int height_48 = 2;
		int height_4 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK89() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = left_46;
		AvlNode right_3 = null;
		int element_45 = -1;
		int element_1 = 0;
		int height_48 = 0;
		int height_4 = 3;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK90() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = left_46;
		AvlNode right_3 = null;
		int height_4 = 1;
		int element_45 = -1;
		int height_48 = 0;
		int element_1 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK91() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = left_46;
		AvlNode right_3 = null;
		int element_45 = -1;
		int element_1 = 0;
		int height_48 = -1;
		int height_4 = 2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK92() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = left_46;
		AvlNode right_3 = null;
		int height_4 = 0;
		int element_45 = 0;
		int height_48 = -1;
		int element_1 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK93() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = left_46;
		int element_45 = -1;
		int element_1 = 0;
		int element_49 = 0;
		int height_4 = 0;
		int height_48 = 0;
		AvlNode left_50 = null;
		AvlNode right_51 = null;
		int height_52 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		right_3.element = element_49;
		right_3.left = left_50;
		right_3.right = right_51;
		right_3.height = height_52;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK94() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = null;
		AvlNode right_3 = obj.root;
		int element_1 = 1;
		int element_45 = 0;
		int height_4 = 0;
		int height_48 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK95() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = null;
		AvlNode right_3 = left_2;
		int element_1 = 1;
		int element_45 = 0;
		int height_4 = 0;
		int height_48 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK96() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = null;
		AvlNode right_3 = left_46;
		int element_1 = 1;
		int element_45 = 0;
		int height_48 = -2;
		int height_4 = 3;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK97() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = null;
		AvlNode right_3 = left_46;
		int height_4 = 0;
		int element_1 = 1;
		int height_48 = -2;
		int element_45 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK98() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = null;
		AvlNode right_3 = left_46;
		int element_45 = -1;
		int element_1 = 0;
		int height_48 = 2;
		int height_4 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK99() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = null;
		AvlNode right_3 = left_46;
		int element_45 = -1;
		int element_1 = 0;
		int height_48 = 0;
		int height_4 = 3;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK100() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = null;
		AvlNode right_3 = left_46;
		int height_4 = 1;
		int element_45 = -1;
		int height_48 = 0;
		int element_1 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK101() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = null;
		AvlNode right_3 = left_46;
		int element_45 = -1;
		int element_1 = 0;
		int height_48 = -1;
		int height_4 = 2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK102() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = null;
		AvlNode right_3 = left_46;
		int height_4 = 0;
		int element_45 = 0;
		int height_48 = -1;
		int element_1 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK103() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = null;
		AvlNode right_3 = right_47;
		int element_1 = 1;
		int element_45 = 0;
		int height_48 = -2;
		int height_4 = 3;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK104() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = null;
		AvlNode right_3 = right_47;
		int height_4 = 0;
		int element_1 = 1;
		int height_48 = -2;
		int element_45 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK105() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = null;
		AvlNode right_3 = right_47;
		int element_45 = -1;
		int element_1 = 0;
		int height_48 = 2;
		int height_4 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK106() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = null;
		AvlNode right_3 = right_47;
		int element_45 = -1;
		int element_1 = 0;
		int height_48 = 0;
		int height_4 = 3;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK107() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = null;
		AvlNode right_3 = right_47;
		int height_4 = 1;
		int element_45 = -1;
		int height_48 = 0;
		int element_1 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK108() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = null;
		AvlNode right_3 = right_47;
		int element_45 = -1;
		int element_1 = 0;
		int height_48 = -1;
		int height_4 = 2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK109() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = null;
		AvlNode right_3 = right_47;
		int height_4 = 0;
		int element_45 = 0;
		int height_48 = -1;
		int element_1 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK110() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = null;
		AvlNode right_3 = null;
		int element_1 = 1;
		int element_45 = 0;
		int height_48 = -2;
		int height_4 = 3;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK111() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = null;
		AvlNode right_3 = null;
		int height_4 = 0;
		int element_1 = 1;
		int height_48 = -2;
		int element_45 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK112() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = null;
		AvlNode right_3 = null;
		int element_1 = 1;
		int element_45 = 0;
		int height_48 = 3;
		int height_4 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK113() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = null;
		AvlNode right_3 = null;
		int element_1 = 1;
		int element_45 = 0;
		int height_48 = 0;
		int height_4 = 3;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK114() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = null;
		AvlNode right_3 = null;
		int height_4 = 1;
		int element_45 = -1;
		int height_48 = 0;
		int element_1 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK115() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = null;
		AvlNode right_3 = null;
		int element_45 = -1;
		int element_1 = 0;
		int height_48 = -1;
		int height_4 = 2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK116() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = null;
		AvlNode right_3 = null;
		int height_4 = 0;
		int element_45 = 0;
		int height_48 = -1;
		int element_1 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK117() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode right_47 = null;
		int element_45 = -1;
		int element_1 = 0;
		int element_57 = 0;
		int height_4 = 0;
		int height_48 = 0;
		AvlNode left_58 = null;
		AvlNode right_59 = null;
		int height_60 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		right_3.element = element_57;
		right_3.left = left_58;
		right_3.right = right_59;
		right_3.height = height_60;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK118() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_47 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode left_66 = obj.root;
		int element_1 = 2;
		int element_45 = 0;
		int element_65 = 1;
		AvlNode right_3 = null;
		int height_4 = 0;
		int height_48 = 0;
		AvlNode right_67 = null;
		int height_68 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		right_47.element = element_65;
		right_47.left = left_66;
		right_47.right = right_67;
		right_47.height = height_68;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK119() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_47 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode left_66 = left_2;
		int element_45 = -2;
		int element_1 = 0;
		int element_65 = -1;
		AvlNode right_3 = null;
		int height_4 = 0;
		int height_48 = 0;
		AvlNode right_67 = null;
		int height_68 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		right_47.element = element_65;
		right_47.left = left_66;
		right_47.right = right_67;
		right_47.height = height_68;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK120() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_47 = new AvlNode();
		AvlNode left_46 = null;
		AvlNode left_66 = right_47;
		int element_45 = -2;
		int element_1 = 0;
		int element_65 = -1;
		AvlNode right_3 = null;
		int height_4 = 0;
		int height_48 = 0;
		AvlNode right_67 = null;
		int height_68 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		right_47.element = element_65;
		right_47.left = left_66;
		right_47.right = right_67;
		right_47.height = height_68;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK121() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_47 = new AvlNode();
		AvlNode left_66 = new AvlNode();
		AvlNode left_46 = null;
		int element_1 = 2;
		int element_45 = 0;
		int element_77 = 0;
		int element_65 = 1;
		AvlNode right_3 = null;
		int height_4 = 0;
		int height_48 = 0;
		AvlNode right_67 = null;
		int height_68 = 0;
		AvlNode left_78 = null;
		AvlNode right_79 = null;
		int height_80 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		right_47.element = element_65;
		right_47.left = left_66;
		right_47.right = right_67;
		right_47.height = height_68;
		left_66.element = element_77;
		left_66.left = left_78;
		left_66.right = right_79;
		left_66.height = height_80;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK122() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_47 = new AvlNode();
		AvlNode left_66 = new AvlNode();
		AvlNode left_46 = null;
		int element_1 = 1;
		int element_45 = -1;
		int element_77 = 0;
		int element_65 = 0;
		AvlNode right_3 = null;
		int height_4 = 0;
		int height_48 = 0;
		AvlNode right_67 = null;
		int height_68 = 0;
		AvlNode left_78 = null;
		AvlNode right_79 = null;
		int height_80 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		right_47.element = element_65;
		right_47.left = left_66;
		right_47.right = right_67;
		right_47.height = height_68;
		left_66.element = element_77;
		left_66.left = left_78;
		left_66.right = right_79;
		left_66.height = height_80;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK123() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_47 = new AvlNode();
		AvlNode left_46 = null;
		int element_45 = -1;
		int element_1 = 0;
		int element_65 = -1;
		AvlNode right_3 = null;
		int height_4 = 0;
		int height_48 = 0;
		AvlNode left_66 = null;
		AvlNode right_67 = null;
		int height_68 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		right_47.element = element_65;
		right_47.left = left_66;
		right_47.right = right_67;
		right_47.height = height_68;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK124() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_47 = new AvlNode();
		AvlNode left_46 = null;
		int element_45 = -1;
		int element_1 = 0;
		int element_65 = 0;
		AvlNode right_3 = null;
		int height_4 = 0;
		int height_48 = 0;
		AvlNode left_66 = null;
		AvlNode right_67 = null;
		int height_68 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		right_47.element = element_65;
		right_47.left = left_66;
		right_47.right = right_67;
		right_47.height = height_68;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK125() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = new AvlNode();
		AvlNode left_86 = obj.root;
		int element_1 = 1;
		int element_45 = 0;
		int element_85 = -1;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode right_47 = null;
		int height_48 = 0;
		AvlNode right_87 = null;
		int height_88 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		left_46.element = element_85;
		left_46.left = left_86;
		left_46.right = right_87;
		left_46.height = height_88;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK126() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = new AvlNode();
		AvlNode left_86 = left_2;
		int element_45 = 0;
		int element_1 = 1;
		int element_85 = -1;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode right_47 = null;
		int height_48 = 0;
		AvlNode right_87 = null;
		int height_88 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		left_46.element = element_85;
		left_46.left = left_86;
		left_46.right = right_87;
		left_46.height = height_88;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK127() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = new AvlNode();
		AvlNode left_86 = left_46;
		int element_1 = 1;
		int element_45 = 0;
		int element_85 = -1;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode right_47 = null;
		int height_48 = 0;
		AvlNode right_87 = null;
		int height_88 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		left_46.element = element_85;
		left_46.left = left_86;
		left_46.right = right_87;
		left_46.height = height_88;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK128() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = new AvlNode();
		AvlNode left_86 = null;
		AvlNode right_87 = obj.root;
		int element_1 = 1;
		int element_45 = 0;
		int element_85 = -1;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode right_47 = null;
		int height_48 = 0;
		int height_88 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		left_46.element = element_85;
		left_46.left = left_86;
		left_46.right = right_87;
		left_46.height = height_88;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK129() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = new AvlNode();
		AvlNode left_86 = null;
		AvlNode right_87 = left_2;
		int element_45 = 0;
		int element_1 = 1;
		int element_85 = -1;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode right_47 = null;
		int height_48 = 0;
		int height_88 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		left_46.element = element_85;
		left_46.left = left_86;
		left_46.right = right_87;
		left_46.height = height_88;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK130() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = new AvlNode();
		AvlNode left_86 = null;
		AvlNode right_87 = left_46;
		int element_45 = 0;
		int element_1 = 1;
		int element_85 = -1;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode right_47 = null;
		int height_48 = 0;
		int height_88 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		left_46.element = element_85;
		left_46.left = left_86;
		left_46.right = right_87;
		left_46.height = height_88;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK131() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = new AvlNode();
		AvlNode right_87 = new AvlNode();
		AvlNode left_86 = null;
		int element_45 = 0;
		int element_1 = 1;
		int element_85 = -1;
		int element_97 = -1;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode right_47 = null;
		int height_48 = 0;
		int height_88 = 0;
		AvlNode left_98 = null;
		AvlNode right_99 = null;
		int height_100 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		left_46.element = element_85;
		left_46.left = left_86;
		left_46.right = right_87;
		left_46.height = height_88;
		right_87.element = element_97;
		right_87.left = left_98;
		right_87.right = right_99;
		right_87.height = height_100;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK132() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = new AvlNode();
		AvlNode right_87 = new AvlNode();
		AvlNode left_86 = null;
		int element_1 = 1;
		int element_45 = 0;
		int element_85 = -1;
		int element_97 = 0;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode right_47 = null;
		int height_48 = 0;
		int height_88 = 0;
		AvlNode left_98 = null;
		AvlNode right_99 = null;
		int height_100 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		left_46.element = element_85;
		left_46.left = left_86;
		left_46.right = right_87;
		left_46.height = height_88;
		right_87.element = element_97;
		right_87.left = left_98;
		right_87.right = right_99;
		right_87.height = height_100;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK133() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = new AvlNode();
		AvlNode left_86 = new AvlNode();
		AvlNode left_106 = obj.root;
		int element_1 = 1;
		int element_45 = 0;
		int element_105 = -2;
		int element_85 = -1;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode right_47 = null;
		int height_48 = 0;
		AvlNode right_87 = null;
		int height_88 = 0;
		AvlNode right_107 = null;
		int height_108 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		left_46.element = element_85;
		left_46.left = left_86;
		left_46.right = right_87;
		left_46.height = height_88;
		left_86.element = element_105;
		left_86.left = left_106;
		left_86.right = right_107;
		left_86.height = height_108;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK134() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = new AvlNode();
		AvlNode left_86 = new AvlNode();
		AvlNode left_106 = left_2;
		int element_1 = 1;
		int element_45 = 0;
		int element_105 = -2;
		int element_85 = -1;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode right_47 = null;
		int height_48 = 0;
		AvlNode right_87 = null;
		int height_88 = 0;
		AvlNode right_107 = null;
		int height_108 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		left_46.element = element_85;
		left_46.left = left_86;
		left_46.right = right_87;
		left_46.height = height_88;
		left_86.element = element_105;
		left_86.left = left_106;
		left_86.right = right_107;
		left_86.height = height_108;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK135() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = new AvlNode();
		AvlNode left_86 = new AvlNode();
		AvlNode left_106 = left_46;
		int element_1 = 2;
		int element_45 = 1;
		int element_105 = -1;
		int element_85 = 0;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode right_47 = null;
		int height_48 = 0;
		AvlNode right_87 = null;
		int height_88 = 0;
		AvlNode right_107 = null;
		int height_108 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		left_46.element = element_85;
		left_46.left = left_86;
		left_46.right = right_87;
		left_46.height = height_88;
		left_86.element = element_105;
		left_86.left = left_106;
		left_86.right = right_107;
		left_86.height = height_108;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK136() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = new AvlNode();
		AvlNode left_86 = new AvlNode();
		AvlNode left_106 = left_86;
		int element_45 = 1;
		int element_1 = 2;
		int element_105 = -1;
		int element_85 = 0;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode right_47 = null;
		int height_48 = 0;
		AvlNode right_87 = null;
		int height_88 = 0;
		AvlNode right_107 = null;
		int height_108 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		left_46.element = element_85;
		left_46.left = left_86;
		left_46.right = right_87;
		left_46.height = height_88;
		left_86.element = element_105;
		left_86.left = left_106;
		left_86.right = right_107;
		left_86.height = height_108;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK137() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = new AvlNode();
		AvlNode left_86 = new AvlNode();
		AvlNode left_106 = new AvlNode();
		int element_45 = 2;
		int element_1 = 3;
		int element_105 = 0;
		int element_85 = 1;
		int element_113 = 0;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode right_47 = null;
		int height_48 = 0;
		AvlNode right_87 = null;
		int height_88 = 0;
		AvlNode right_107 = null;
		int height_108 = 0;
		AvlNode left_114 = null;
		AvlNode right_115 = null;
		int height_116 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		left_46.element = element_85;
		left_46.left = left_86;
		left_46.right = right_87;
		left_46.height = height_88;
		left_86.element = element_105;
		left_86.left = left_106;
		left_86.right = right_107;
		left_86.height = height_108;
		left_106.element = element_113;
		left_106.left = left_114;
		left_106.right = right_115;
		left_106.height = height_116;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK138() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = new AvlNode();
		AvlNode left_86 = new AvlNode();
		int element_45 = 1;
		int element_1 = 2;
		int element_105 = 0;
		int element_85 = 0;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode right_47 = null;
		int height_48 = 0;
		AvlNode right_87 = null;
		int height_88 = 0;
		AvlNode left_106 = null;
		AvlNode right_107 = null;
		int height_108 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		left_46.element = element_85;
		left_46.left = left_86;
		left_46.right = right_87;
		left_46.height = height_88;
		left_86.element = element_105;
		left_86.left = left_106;
		left_86.right = right_107;
		left_86.height = height_108;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK139() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_46 = new AvlNode();
		int element_45 = 0;
		int element_1 = 1;
		int element_85 = 0;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode right_47 = null;
		int height_48 = 0;
		AvlNode left_86 = null;
		AvlNode right_87 = null;
		int height_88 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		left_46.element = element_85;
		left_46.left = left_86;
		left_46.right = right_87;
		left_46.height = height_88;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK140() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		int element_45 = 0;
		int element_1 = 0;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode left_46 = null;
		AvlNode right_47 = null;
		int height_48 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_45;
		left_2.left = left_46;
		left_2.right = right_47;
		left_2.height = height_48;
		if(Utilities.repOK(obj)) {obj.insert(0);}
		//obj.repOK();
	}

}

