package gov.nasa.jpf.star.examples.bst;

import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class BinarySearchTree_findMin3Steps extends TestJPF {

	@Test
	public void test_repOK1() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = null;
		obj.root = t;
		if(Utilities.repOK(obj)) {obj.findMin();}
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
		if(Utilities.repOK(obj)) {obj.findMin();}
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
		if(Utilities.repOK(obj)) {obj.findMin();}
		//obj.repOK(t);
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
		if(Utilities.repOK(obj)) {obj.findMin();}
		//obj.repOK(t);
	}

	@Test
	public void test_repOK5() throws Exception {
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
		if(Utilities.repOK(obj)) {obj.findMin();}
		//obj.repOK(t);
	}

	@Test
	public void test_repOK6() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		obj.root = t;
		BinaryNode left_11 = t;
		int element_1 = 1;
		int element_10 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_12 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_10;
		left_2.left = left_11;
		left_2.right = right_12;
		if(Utilities.repOK(obj)) {obj.findMin();}
		//obj.repOK(t);
	}

	@Test
	public void test_repOK7() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		obj.root = t;
		BinaryNode left_11 = left_2;
		int element_1 = 1;
		int element_10 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_12 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_10;
		left_2.left = left_11;
		left_2.right = right_12;
		if(Utilities.repOK(obj)) {obj.findMin();}
		//obj.repOK(t);
	}

	@Test
	public void test_repOK8() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode left_11 = new BinaryNode();
		obj.root = t;
		int element_1 = 1;
		int element_10 = 0;
		int element_16 = 0;
		BinaryNode right_3 = null;
		BinaryNode right_12 = null;
		BinaryNode left_17 = null;
		BinaryNode right_18 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_10;
		left_2.left = left_11;
		left_2.right = right_12;
		left_11.element = element_16;
		left_11.left = left_17;
		left_11.right = right_18;
		if(Utilities.repOK(obj)) {obj.findMin();}
		//obj.repOK(t);
	}

	@Test
	public void test_repOK9() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		obj.root = t;
		int element_1 = 0;
		int element_10 = 0;
		BinaryNode right_3 = null;
		BinaryNode left_11 = null;
		BinaryNode right_12 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_10;
		left_2.left = left_11;
		left_2.right = right_12;
		if(Utilities.repOK(obj)) {obj.findMin();}
		//obj.repOK(t);
	}

}

