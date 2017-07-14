package gov.nasa.jpf.star.examples.avl;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class AvlTree_maxElement1 extends TestJPF {

	@Test
	public void test1() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = null;
		int maxE = 0;
		obj.maxElement(maxE);
	}

	@Test
	public void test2() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = null;
		AvlNode right_3 = null;
		int height_4 = 1;
		int element_222 = 1;
		int maxE = 0;
		int element_1 = 1;
		int element_223 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		obj.maxElement(maxE);
	}

	@Test
	public void test3() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = null;
		AvlNode right_3 = null;
		int height_4 = 1;
		int maxE = 0;
		int element_1 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		obj.maxElement(maxE);
	}

	@Test
	public void test4() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = null;
		AvlNode left_254 = null;
		AvlNode right_253 = null;
		int height_4 = 2;
		int element_222 = 1;
		int heightL_6 = 1;
		int maxE = 0;
		int element_1 = 1;
		int element_223 = 1;
		int element_252 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_252;
		left_2.left = left_254;
		left_2.right = right_253;
		left_2.height = heightL_6;
		obj.maxElement(maxE);
	}

	@Test
	public void test5() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_268 = null;
		AvlNode right_267 = null;
		int height_4 = 2;
		int element_222 = 1;
		int maxE = 0;
		int element_1 = 1;
		int heightR_8 = 1;
		int element_266 = 2;
		int element_223 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_266;
		right_3.left = left_268;
		right_3.right = right_267;
		right_3.height = heightR_8;
		obj.maxElement(maxE);
	}

}

