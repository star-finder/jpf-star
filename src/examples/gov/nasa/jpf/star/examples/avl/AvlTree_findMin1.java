package gov.nasa.jpf.star.examples.avl;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class AvlTree_findMin1 extends TestJPF {

	@Test
	public void test1() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = null;
		obj.findMin();
	}

	@Test
	public void test2() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = null;
		AvlNode right_3 = null;
		int height_4 = 1;
		int element_1 = 3;
		int element_222 = 3;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		obj.findMin();
	}

	@Test
	public void test3() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_10 = null;
		AvlNode right_11 = null;
		AvlNode left_268 = null;
		AvlNode right_267 = null;
		int heightL_6 = 1;
		int element_1 = -1;
		int heightR_8 = 1;
		int element_266 = 0;
		int element_223 = -2;
		int element_224 = -1;
		int height_4 = 2;
		int element_222 = -1;
		int element_9 = -2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_9;
		left_2.left = left_10;
		left_2.right = right_11;
		left_2.height = heightL_6;
		right_3.element = element_266;
		right_3.left = left_268;
		right_3.right = right_267;
		right_3.height = heightR_8;
		obj.findMin();
	}

	@Test
	public void test4() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_20 = null;
		AvlNode right_3 = null;
		AvlNode right_21 = null;
		int heightL_6 = 1;
		int element_19 = 0;
		int element_1 = 1;
		int element_223 = 0;
		int element_224 = 1;
		int height_4 = 2;
		int element_222 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_19;
		left_2.left = left_20;
		left_2.right = right_21;
		left_2.height = heightL_6;
		obj.findMin();
	}

	@Test
	public void test5() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode right_21 = new AvlNode();
		AvlNode left_20 = null;
		AvlNode left_272 = null;
		AvlNode right_271 = null;
		AvlNode left_286 = null;
		AvlNode right_285 = null;
		int heightL_6 = 2;
		int element_19 = -2;
		int element_1 = 0;
		int element_284 = -1;
		int heightR_8 = 1;
		int heightR_23 = 1;
		int element_223 = -2;
		int element_224 = 0;
		int height_4 = 3;
		int element_222 = 0;
		int element_270 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_19;
		left_2.left = left_20;
		left_2.right = right_21;
		left_2.height = heightL_6;
		right_3.element = element_270;
		right_3.left = left_272;
		right_3.right = right_271;
		right_3.height = heightR_8;
		right_21.element = element_284;
		right_21.left = left_286;
		right_21.right = right_285;
		right_21.height = heightR_23;
		obj.findMin();
	}

	@Test
	public void test6() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_249 = null;
		AvlNode right_248 = null;
		int height_4 = 2;
		int element_222 = -1;
		int element_247 = 0;
		int element_1 = -1;
		int heightR_8 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_247;
		right_3.left = left_249;
		right_3.right = right_248;
		right_3.height = heightR_8;
		obj.findMin();
	}

}

