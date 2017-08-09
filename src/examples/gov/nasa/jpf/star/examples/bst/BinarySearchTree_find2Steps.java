package gov.nasa.jpf.star.examples.bst;

import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class BinarySearchTree_find2Steps extends TestJPF {

	@Test
	public void test_repOK1() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = null;
		obj.root = t;
		if(Utilities.repOK(obj)) {obj.find(0);}
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
		if(Utilities.repOK(obj)) {obj.find(0);}
		//obj.repOK(t);
	}

	@Test
	public void test_repOK3() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		obj.root = t;
		int element_1 = 0;
		int element_7 = 0;
		BinaryNode right_3 = null;
		BinaryNode left_8 = null;
		BinaryNode right_9 = null;
		t.element = element_1;
		t.left = left_2;
		t.right = right_3;
		left_2.element = element_7;
		left_2.left = left_8;
		left_2.right = right_9;
		if(Utilities.repOK(obj)) {obj.find(0);}
		//obj.repOK(t);
	}

}

