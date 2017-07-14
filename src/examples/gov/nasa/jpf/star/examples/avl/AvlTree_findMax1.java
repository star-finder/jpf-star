package gov.nasa.jpf.star.examples.avl;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class AvlTree_findMax1 extends TestJPF {

	@Test
	public void test1() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = null;
		obj.findMax();
	}

	@Test
	public void test2() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = null;
		AvlNode left_2 = null;
		int height_4 = 1;
		int element_222 = 3;
		int element_1 = 3;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		obj.findMax();
	}

	@Test
	public void test3() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = null;
		AvlNode left_249 = null;
		AvlNode right_248 = null;
		int height_4 = 2;
		int element_222 = 1;
		int heightL_6 = 1;
		int element_247 = 0;
		int element_1 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_247;
		left_2.left = left_249;
		left_2.right = right_248;
		left_2.height = heightL_6;
		obj.findMax();
	}

}

