package gov.nasa.jpf.star.examples.avl;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class AvlTree_find1 extends TestJPF {

	@Test
	public void test1() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = null;
		int x = 0;
		obj.find(x);
	}

	@Test
	public void test2() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = null;
		AvlNode right_3 = null;
		int height_4 = 1;
		int element_222 = 1;
		int element_1 = 1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		obj.find(x);
	}

	@Test
	public void test3() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_10 = null;
		AvlNode right_11 = null;
		AvlNode left_275 = null;
		AvlNode right_274 = null;
		int heightL_6 = 1;
		int element_1 = 1;
		int heightR_8 = 1;
		int element_223 = 0;
		int element_224 = 0;
		int height_4 = 2;
		int element_225 = 1;
		int element_222 = 1;
		int x = 0;
		int element_9 = 0;
		int element_273 = 2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_9;
		left_2.left = left_10;
		left_2.right = right_11;
		left_2.height = heightL_6;
		right_3.element = element_273;
		right_3.left = left_275;
		right_3.right = right_274;
		right_3.height = heightR_8;
		obj.find(x);
	}

	@Test
	public void test4() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = null;
		AvlNode left_2 = null;
		int height_4 = 1;
		int element_222 = -1;
		int element_1 = -1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		obj.find(x);
	}

	@Test
	public void test5() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_25 = null;
		AvlNode right_26 = null;
		AvlNode left_276 = null;
		AvlNode right_275 = null;
		int element_274 = -2;
		int heightL_6 = 1;
		int element_1 = -1;
		int heightR_8 = 1;
		int element_223 = -1;
		int element_224 = 0;
		int height_4 = 2;
		int element_222 = -1;
		int element_225 = 0;
		int x = 0;
		int element_24 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_24;
		right_3.left = left_25;
		right_3.right = right_26;
		right_3.height = heightR_8;
		left_2.element = element_274;
		left_2.left = left_276;
		left_2.right = right_275;
		left_2.height = heightL_6;
		obj.find(x);
	}

	@Test
	public void test6() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = null;
		AvlNode right_3 = null;
		int height_4 = 1;
		int element_222 = 0;
		int element_1 = 0;
		int x = 0;
		int element_223 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		obj.find(x);
	}

	@Test
	public void test7() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = null;
		AvlNode left_40 = null;
		AvlNode right_41 = null;
		int heightL_6 = 1;
		int element_1 = 1;
		int element_39 = 0;
		int element_223 = 0;
		int element_224 = 0;
		int height_4 = 2;
		int element_225 = 1;
		int element_222 = 1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_39;
		left_2.left = left_40;
		left_2.right = right_41;
		left_2.height = heightL_6;
		obj.find(x);
	}

	@Test
	public void test8() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_40 = new AvlNode();
		AvlNode right_41 = null;
		AvlNode left_279 = null;
		AvlNode right_278 = null;
		AvlNode left_293 = null;
		AvlNode right_292 = null;
		int heightL_6 = 2;
		int element_1 = 1;
		int heightR_8 = 1;
		int element_39 = 0;
		int element_277 = 2;
		int element_223 = 0;
		int element_224 = 0;
		int height_4 = 3;
		int element_225 = 1;
		int element_222 = 1;
		int element_291 = -1;
		int heightL_42 = 1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_39;
		left_2.left = left_40;
		left_2.right = right_41;
		left_2.height = heightL_6;
		right_3.element = element_277;
		right_3.left = left_279;
		right_3.right = right_278;
		right_3.height = heightR_8;
		left_40.element = element_291;
		left_40.left = left_293;
		left_40.right = right_292;
		left_40.height = heightL_42;
		obj.find(x);
	}

	@Test
	public void test9() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = null;
		AvlNode left_254 = null;
		AvlNode right_253 = null;
		int height_4 = 2;
		int element_222 = -1;
		int heightL_6 = 1;
		int element_1 = -1;
		int x = 0;
		int element_252 = -2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_252;
		left_2.left = left_254;
		left_2.right = right_253;
		left_2.height = heightL_6;
		obj.find(x);
	}

	@Test
	public void test10() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = null;
		AvlNode left_255 = null;
		AvlNode right_254 = null;
		int height_4 = 2;
		int element_222 = 0;
		int heightL_6 = 1;
		int element_1 = 0;
		int element_253 = -1;
		int x = 0;
		int element_223 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_253;
		left_2.left = left_255;
		left_2.right = right_254;
		left_2.height = heightL_6;
		obj.find(x);
	}

	@Test
	public void test11() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_253 = null;
		AvlNode right_252 = null;
		int height_4 = 2;
		int element_222 = 1;
		int element_1 = 1;
		int heightR_8 = 1;
		int x = 0;
		int element_251 = 2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_251;
		right_3.left = left_253;
		right_3.right = right_252;
		right_3.height = heightR_8;
		obj.find(x);
	}

	@Test
	public void test12() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_75 = null;
		AvlNode right_76 = null;
		int element_1 = -1;
		int heightR_8 = 1;
		int element_223 = -1;
		int element_224 = 0;
		int height_4 = 2;
		int element_222 = -1;
		int element_74 = 0;
		int element_225 = 0;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_74;
		right_3.left = left_75;
		right_3.right = right_76;
		right_3.height = heightR_8;
		obj.find(x);
	}

	@Test
	public void test13() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_75 = new AvlNode();
		AvlNode right_76 = null;
		AvlNode left_280 = null;
		AvlNode right_279 = null;
		AvlNode left_294 = null;
		AvlNode right_293 = null;
		int heightL_6 = 1;
		int heightL_77 = 1;
		int element_1 = -2;
		int heightR_8 = 2;
		int element_223 = -2;
		int element_224 = 0;
		int height_4 = 3;
		int element_74 = 0;
		int element_222 = -2;
		int element_225 = 0;
		int element_278 = -3;
		int element_292 = -1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_74;
		right_3.left = left_75;
		right_3.right = right_76;
		right_3.height = heightR_8;
		left_2.element = element_278;
		left_2.left = left_280;
		left_2.right = right_279;
		left_2.height = heightL_6;
		left_75.element = element_292;
		left_75.left = left_294;
		left_75.right = right_293;
		left_75.height = heightL_77;
		obj.find(x);
	}

	@Test
	public void test14() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_269 = null;
		AvlNode right_268 = null;
		int height_4 = 2;
		int element_222 = 0;
		int element_1 = 0;
		int heightR_8 = 1;
		int element_267 = 1;
		int x = 0;
		int element_223 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_267;
		right_3.left = left_269;
		right_3.right = right_268;
		right_3.height = heightR_8;
		obj.find(x);
	}

}

