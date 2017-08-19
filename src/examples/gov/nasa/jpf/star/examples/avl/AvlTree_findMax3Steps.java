package gov.nasa.jpf.star.examples.avl;

import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class AvlTree_findMax3Steps extends TestJPF {

	@Test
	public void test_repOK1() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = null;
		if(Utilities.repOK(obj)) {obj.findMax();}
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
		if(Utilities.repOK(obj)) {obj.findMax();}
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
		if(Utilities.repOK(obj)) {obj.findMax();}
		//obj.repOK();
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
		if(Utilities.repOK(obj)) {obj.findMax();}
		//obj.repOK();
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
		if(Utilities.repOK(obj)) {obj.findMax();}
		//obj.repOK();
	}

	@Test
	public void test_repOK6() throws Exception {
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
		if(Utilities.repOK(obj)) {obj.findMax();}
		//obj.repOK();
	}

	@Test
	public void test_repOK7() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_14 = obj.root;
		int element_1 = 1;
		int element_13 = 0;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode right_15 = null;
		int height_16 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_13;
		left_2.left = left_14;
		left_2.right = right_15;
		left_2.height = height_16;
		if(Utilities.repOK(obj)) {obj.findMax();}
		//obj.repOK();
	}

	@Test
	public void test_repOK8() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_14 = left_2;
		int element_1 = 0;
		int element_13 = -1;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode right_15 = null;
		int height_16 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_13;
		left_2.left = left_14;
		left_2.right = right_15;
		left_2.height = height_16;
		if(Utilities.repOK(obj)) {obj.findMax();}
		//obj.repOK();
	}

	@Test
	public void test_repOK9() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_14 = new AvlNode();
		int element_1 = 1;
		int element_21 = 0;
		int element_13 = 0;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode right_15 = null;
		int height_16 = 0;
		AvlNode left_22 = null;
		AvlNode right_23 = null;
		int height_24 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_13;
		left_2.left = left_14;
		left_2.right = right_15;
		left_2.height = height_16;
		left_14.element = element_21;
		left_14.left = left_22;
		left_14.right = right_23;
		left_14.height = height_24;
		if(Utilities.repOK(obj)) {obj.findMax();}
		//obj.repOK();
	}

	@Test
	public void test_repOK10() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		int element_1 = 0;
		int element_13 = 0;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode left_14 = null;
		AvlNode right_15 = null;
		int height_16 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_13;
		left_2.left = left_14;
		left_2.right = right_15;
		left_2.height = height_16;
		if(Utilities.repOK(obj)) {obj.findMax();}
		//obj.repOK();
	}

}

