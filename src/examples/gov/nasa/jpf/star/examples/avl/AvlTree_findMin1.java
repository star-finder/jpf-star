package gov.nasa.jpf.star.examples.avl;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class AvlTree_findMin1 extends TestJPF {

	@Test
	public void test1() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = null;
		System.out.println("1 " + obj.wellFormed());
		obj.findMin();
	}

	@Test
	public void test2() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = null;
		AvlNode right_3 = null;
		int height_4 = 0;
		int element_1 = 3;
		int element_223 = 3;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		System.out.println("2 " + obj.wellFormed());
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
		AvlNode left_270 = null;
		AvlNode right_269 = null;
		int heightL_6 = 0;
		int element_1 = -1;
		int heightR_8 = 0;
		int element_223 = -1;
		int element_224 = -2;
		int height_4 = 1;
		int element_225 = -1;
		int element_268 = 0;
		int element_9 = -2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_9;
		left_2.left = left_10;
		left_2.right = right_11;
		left_2.height = heightL_6;
		right_3.element = element_268;
		right_3.left = left_270;
		right_3.right = right_269;
		right_3.height = heightR_8;
		System.out.println("3 " + obj.wellFormed());
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
		int heightL_6 = 0;
		int element_19 = 0;
		int element_1 = 1;
		int element_223 = 1;
		int element_224 = 0;
		int height_4 = 1;
		int element_225 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_19;
		left_2.left = left_20;
		left_2.right = right_21;
		left_2.height = heightL_6;
		System.out.println("4 " + obj.wellFormed());
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
		AvlNode left_274 = null;
		AvlNode right_273 = null;
		AvlNode left_288 = null;
		AvlNode right_287 = null;
		int heightL_6 = 1;
		int element_19 = 0;
		int element_1 = 2;
		int heightR_8 = 0;
		int heightR_23 = 0;
		int element_223 = 2;
		int element_224 = 0;
		int height_4 = 2;
		int element_225 = 2;
		int element_272 = 3;
		int element_286 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_19;
		left_2.left = left_20;
		left_2.right = right_21;
		left_2.height = heightL_6;
		right_3.element = element_272;
		right_3.left = left_274;
		right_3.right = right_273;
		right_3.height = heightR_8;
		right_21.element = element_286;
		right_21.left = left_288;
		right_21.right = right_287;
		right_21.height = heightR_23;
		System.out.println("5 " + obj.wellFormed());
		obj.findMin();
	}

	@Test
	public void test6() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_251 = null;
		AvlNode right_250 = null;
		int height_4 = 1;
		int element_249 = 0;
		int element_1 = -1;
		int heightR_8 = 0;
		int element_223 = -1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_249;
		right_3.left = left_251;
		right_3.right = right_250;
		right_3.height = heightR_8;
		System.out.println("6 " + obj.wellFormed());
		obj.findMin();
	}

}

