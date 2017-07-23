package gov.nasa.jpf.star.examples.avl;

import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class AvlTree_findMax1 extends TestJPF {

	@Test
	public void test_findMax1() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = null;
		System.out.println(Utilities.repOK(obj));
		obj.findMax();
	}

	@Test
	public void test_findMax2() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = null;
		AvlNode left_2 = null;
		int height_4 = 0;
		int element_1 = 3;
		int element_223 = 3;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		System.out.println(Utilities.repOK(obj));
		obj.findMax();
	}

	@Test
	public void test_findMax3() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_11 = null;
		AvlNode left_10 = null;
		AvlNode left_270 = null;
		AvlNode right_269 = null;
		int heightL_6 = 0;
		int element_1 = -1;
		int heightR_8 = 0;
		int element_223 = -1;
		int element_224 = -1;
		int height_4 = 1;
		int element_225 = 0;
		int element_268 = -2;
		int element_9 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_9;
		right_3.left = left_10;
		right_3.right = right_11;
		right_3.height = heightR_8;
		left_2.element = element_268;
		left_2.left = left_270;
		left_2.right = right_269;
		left_2.height = heightL_6;
		System.out.println(Utilities.repOK(obj));
		obj.findMax();
	}

	@Test
	public void test_findMax4() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = null;
		AvlNode left_251 = null;
		AvlNode right_250 = null;
		int height_4 = 1;
		int heightL_6 = 0;
		int element_249 = 0;
		int element_1 = 1;
		int element_223 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_249;
		left_2.left = left_251;
		left_2.right = right_250;
		left_2.height = heightL_6;
		System.out.println(Utilities.repOK(obj));
		obj.findMax();
	}

	@Test
	public void test_findMax5() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode right_26 = null;
		AvlNode left_2 = null;
		AvlNode left_25 = null;
		int element_1 = -1;
		int heightR_8 = 0;
		int element_223 = -1;
		int element_224 = -1;
		int height_4 = 1;
		int element_225 = 0;
		int element_24 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_24;
		right_3.left = left_25;
		right_3.right = right_26;
		right_3.height = heightR_8;
		System.out.println(Utilities.repOK(obj));
		obj.findMax();
	}

	@Test
	public void test_findMax6() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_25 = new AvlNode();
		AvlNode right_26 = null;
		AvlNode left_274 = null;
		AvlNode right_273 = null;
		AvlNode left_288 = null;
		AvlNode right_287 = null;
		int heightL_6 = 0;
		int element_1 = -2;
		int heightR_8 = 1;
		int heightL_27 = 0;
		int element_272 = -3;
		int element_223 = -2;
		int element_224 = -2;
		int height_4 = 2;
		int element_225 = 0;
		int element_286 = -1;
		int element_24 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_24;
		right_3.left = left_25;
		right_3.right = right_26;
		right_3.height = heightR_8;
		left_2.element = element_272;
		left_2.left = left_274;
		left_2.right = right_273;
		left_2.height = heightL_6;
		left_25.element = element_286;
		left_25.left = left_288;
		left_25.right = right_287;
		left_25.height = heightL_27;
		System.out.println(Utilities.repOK(obj));
		obj.findMax();
	}

}

