package gov.nasa.jpf.star.examples.avl;

import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class AvlTree_find2Steps extends TestJPF {

	@Test
	public void test_repOK1() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = null;
		if(Utilities.repOK(obj)) {obj.find(0);}
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
		if(Utilities.repOK(obj)) {obj.find(0);}
		//obj.repOK();
	}

	@Test
	public void test_repOK3() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		int element_1 = 0;
		int element_9 = 0;
		AvlNode right_3 = null;
		int height_4 = 0;
		AvlNode left_10 = null;
		AvlNode right_11 = null;
		int height_12 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_9;
		left_2.left = left_10;
		left_2.right = right_11;
		left_2.height = height_12;
		if(Utilities.repOK(obj)) {obj.find(0);}
		//obj.repOK();
	}

}

