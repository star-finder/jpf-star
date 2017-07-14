package gov.nasa.jpf.star.examples.avl;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class AvlTree_isEmpty1 extends TestJPF {

	@Test
	public void test1() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = null;
		obj.isEmpty();
	}

	@Test
	public void test2() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = null;
		AvlNode right_3 = null;
		int height_4 = 1;
		int element_222 = 3;
		int element_1 = 3;
		int element_223 = 3;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		obj.isEmpty();
	}

	@Test
	public void test3() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = null;
		AvlNode left_250 = null;
		AvlNode right_249 = null;
		int height_4 = 2;
		int element_222 = 1;
		int heightL_6 = 1;
		int element_248 = 0;
		int element_1 = 1;
		int element_223 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_248;
		left_2.left = left_250;
		left_2.right = right_249;
		left_2.height = heightL_6;
		obj.isEmpty();
	}

	@Test
	public void test4() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_264 = null;
		AvlNode right_263 = null;
		int height_4 = 2;
		int element_222 = -1;
		int element_1 = -1;
		int heightR_8 = 1;
		int element_262 = 0;
		int element_223 = -1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_262;
		right_3.left = left_264;
		right_3.right = right_263;
		right_3.height = heightR_8;
		obj.isEmpty();
	}

}

