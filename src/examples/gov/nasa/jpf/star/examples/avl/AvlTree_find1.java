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
		AvlNode left_273 = null;
		AvlNode right_272 = null;
		int heightL_6 = 1;
		int element_1 = 2;
		int heightR_8 = 1;
		int element_223 = 1;
		int element_224 = 2;
		int height_4 = 2;
		int element_222 = 2;
		int element_271 = 3;
		int x = 0;
		int element_9 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_9;
		left_2.left = left_10;
		left_2.right = right_11;
		left_2.height = heightL_6;
		right_3.element = element_271;
		right_3.left = left_273;
		right_3.right = right_272;
		right_3.height = heightR_8;
		obj.find(x);
	}

	@Test
	public void test4() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode right_11 = null;
		AvlNode left_10 = null;
		AvlNode left_271 = null;
		AvlNode right_270 = null;
		int heightL_6 = 1;
		int element_1 = 1;
		int heightR_8 = 1;
		int element_269 = 2;
		int element_223 = -1;
		int height_4 = 2;
		int element_222 = 1;
		int x = 0;
		int element_9 = -1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_9;
		left_2.left = left_10;
		left_2.right = right_11;
		left_2.height = heightL_6;
		right_3.element = element_269;
		right_3.left = left_271;
		right_3.right = right_270;
		right_3.height = heightR_8;
		obj.find(x);
	}

	@Test
	public void test5() throws Exception {
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
	public void test6() throws Exception {
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
	public void test7() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_25 = null;
		AvlNode right_26 = null;
		AvlNode left_271 = null;
		AvlNode right_270 = null;
		int heightL_6 = 1;
		int element_1 = -1;
		int heightR_8 = 1;
		int element_269 = -2;
		int element_223 = 1;
		int height_4 = 2;
		int element_222 = -1;
		int x = 0;
		int element_24 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_24;
		right_3.left = left_25;
		right_3.right = right_26;
		right_3.height = heightR_8;
		left_2.element = element_269;
		left_2.left = left_271;
		left_2.right = right_270;
		left_2.height = heightL_6;
		obj.find(x);
	}

	@Test
	public void test8() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_26 = null;
		AvlNode left_25 = null;
		AvlNode left_275 = null;
		AvlNode right_274 = null;
		int element_273 = -3;
		int heightL_6 = 1;
		int element_1 = -2;
		int heightR_8 = 1;
		int element_223 = -2;
		int element_224 = -1;
		int height_4 = 2;
		int element_222 = -2;
		int x = 0;
		int element_24 = -1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_24;
		right_3.left = left_25;
		right_3.right = right_26;
		right_3.height = heightR_8;
		left_2.element = element_273;
		left_2.left = left_275;
		left_2.right = right_274;
		left_2.height = heightL_6;
		obj.find(x);
	}

	@Test
	public void test9() throws Exception {
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
	public void test10() throws Exception {
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
	public void test11() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_40 = null;
		AvlNode right_3 = null;
		AvlNode right_41 = null;
		int heightL_6 = 1;
		int element_1 = 2;
		int element_39 = 1;
		int element_223 = 1;
		int element_224 = 2;
		int height_4 = 2;
		int element_222 = 2;
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
	public void test12() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_41 = null;
		AvlNode right_3 = null;
		AvlNode left_40 = null;
		int heightL_6 = 1;
		int element_1 = 1;
		int element_39 = -1;
		int element_223 = -1;
		int height_4 = 2;
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
	public void test13() throws Exception {
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
	public void test14() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_40 = new AvlNode();
		AvlNode right_41 = null;
		AvlNode left_275 = null;
		AvlNode right_274 = null;
		AvlNode left_289 = null;
		AvlNode right_288 = null;
		int heightL_6 = 2;
		int element_1 = 2;
		int element_39 = 0;
		int heightR_8 = 1;
		int element_223 = 0;
		int height_4 = 3;
		int element_222 = 2;
		int element_287 = -1;
		int heightL_42 = 1;
		int x = 1;
		int element_273 = 3;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_39;
		left_2.left = left_40;
		left_2.right = right_41;
		left_2.height = heightL_6;
		right_3.element = element_273;
		right_3.left = left_275;
		right_3.right = right_274;
		right_3.height = heightR_8;
		left_40.element = element_287;
		left_40.left = left_289;
		left_40.right = right_288;
		left_40.height = heightL_42;
		obj.find(x);
	}

	@Test
	public void test15() throws Exception {
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
	public void test16() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode right_41 = new AvlNode();
		AvlNode left_40 = null;
		AvlNode left_277 = null;
		AvlNode right_276 = null;
		AvlNode left_291 = null;
		AvlNode right_290 = null;
		int heightL_6 = 2;
		int element_1 = 3;
		int heightR_8 = 1;
		int element_39 = 1;
		int element_223 = 1;
		int element_275 = 4;
		int element_224 = 3;
		int height_4 = 3;
		int element_222 = 3;
		int element_289 = 2;
		int heightR_43 = 1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_39;
		left_2.left = left_40;
		left_2.right = right_41;
		left_2.height = heightL_6;
		right_3.element = element_275;
		right_3.left = left_277;
		right_3.right = right_276;
		right_3.height = heightR_8;
		right_41.element = element_289;
		right_41.left = left_291;
		right_41.right = right_290;
		right_41.height = heightR_43;
		obj.find(x);
	}

	@Test
	public void test17() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode right_41 = new AvlNode();
		AvlNode left_40 = null;
		AvlNode left_279 = null;
		AvlNode right_278 = null;
		AvlNode left_307 = null;
		AvlNode right_306 = null;
		int heightL_6 = 2;
		int element_1 = 2;
		int heightR_8 = 1;
		int element_39 = 0;
		int element_277 = 3;
		int element_223 = 0;
		int element_224 = 0;
		int height_4 = 3;
		int element_225 = 2;
		int element_222 = 2;
		int element_305 = 1;
		int heightR_43 = 1;
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
		right_41.element = element_305;
		right_41.left = left_307;
		right_41.right = right_306;
		right_41.height = heightR_43;
		obj.find(x);
	}

	@Test
	public void test18() throws Exception {
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
	public void test19() throws Exception {
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
	public void test20() throws Exception {
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
	public void test21() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_85 = null;
		AvlNode left_2 = null;
		AvlNode right_86 = null;
		int element_1 = -1;
		int heightR_8 = 1;
		int element_223 = 1;
		int height_4 = 2;
		int element_84 = 1;
		int element_222 = -1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_84;
		right_3.left = left_85;
		right_3.right = right_86;
		right_3.height = heightR_8;
		obj.find(x);
	}

	@Test
	public void test22() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode right_86 = null;
		AvlNode left_2 = null;
		AvlNode left_85 = null;
		int element_1 = -2;
		int heightR_8 = 1;
		int element_223 = -2;
		int element_224 = -1;
		int height_4 = 2;
		int element_84 = -1;
		int element_222 = -2;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_84;
		right_3.left = left_85;
		right_3.right = right_86;
		right_3.height = heightR_8;
		obj.find(x);
	}

	@Test
	public void test23() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_85 = null;
		AvlNode right_86 = null;
		int element_1 = -1;
		int heightR_8 = 1;
		int element_223 = -1;
		int element_224 = 0;
		int height_4 = 2;
		int element_84 = 0;
		int element_222 = -1;
		int element_225 = 0;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_84;
		right_3.left = left_85;
		right_3.right = right_86;
		right_3.height = heightR_8;
		obj.find(x);
	}

	@Test
	public void test24() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_85 = new AvlNode();
		AvlNode right_86 = null;
		AvlNode left_279 = null;
		AvlNode right_278 = null;
		AvlNode left_293 = null;
		AvlNode right_292 = null;
		int heightL_6 = 1;
		int element_1 = -3;
		int heightR_8 = 2;
		int element_277 = -4;
		int element_223 = -3;
		int element_224 = -1;
		int height_4 = 3;
		int element_84 = -1;
		int element_222 = -3;
		int element_291 = -2;
		int heightL_87 = 1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_84;
		right_3.left = left_85;
		right_3.right = right_86;
		right_3.height = heightR_8;
		left_2.element = element_277;
		left_2.left = left_279;
		left_2.right = right_278;
		left_2.height = heightL_6;
		left_85.element = element_291;
		left_85.left = left_293;
		left_85.right = right_292;
		left_85.height = heightL_87;
		obj.find(x);
	}

	@Test
	public void test25() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_85 = new AvlNode();
		AvlNode right_86 = null;
		AvlNode left_280 = null;
		AvlNode right_279 = null;
		AvlNode left_294 = null;
		AvlNode right_293 = null;
		int heightL_6 = 1;
		int element_1 = -2;
		int heightR_8 = 2;
		int element_223 = -2;
		int element_224 = 0;
		int height_4 = 3;
		int element_84 = 0;
		int element_222 = -2;
		int element_225 = 0;
		int element_278 = -3;
		int element_292 = -1;
		int heightL_87 = 1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_84;
		right_3.left = left_85;
		right_3.right = right_86;
		right_3.height = heightR_8;
		left_2.element = element_278;
		left_2.left = left_280;
		left_2.right = right_279;
		left_2.height = heightL_6;
		left_85.element = element_292;
		left_85.left = left_294;
		left_85.right = right_293;
		left_85.height = heightL_87;
		obj.find(x);
	}

	@Test
	public void test26() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_86 = new AvlNode();
		AvlNode left_85 = null;
		AvlNode left_275 = null;
		AvlNode right_274 = null;
		AvlNode left_289 = null;
		AvlNode right_288 = null;
		int heightL_6 = 1;
		int element_1 = -2;
		int heightR_8 = 2;
		int element_223 = 0;
		int height_4 = 3;
		int element_84 = 0;
		int element_222 = -2;
		int element_287 = 1;
		int heightR_88 = 1;
		int x = -1;
		int element_273 = -3;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_84;
		right_3.left = left_85;
		right_3.right = right_86;
		right_3.height = heightR_8;
		left_2.element = element_273;
		left_2.left = left_275;
		left_2.right = right_274;
		left_2.height = heightL_6;
		right_86.element = element_287;
		right_86.left = left_289;
		right_86.right = right_288;
		right_86.height = heightR_88;
		obj.find(x);
	}

	@Test
	public void test27() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_86 = new AvlNode();
		AvlNode left_85 = null;
		AvlNode left_280 = null;
		AvlNode right_279 = null;
		AvlNode left_308 = null;
		AvlNode right_307 = null;
		int heightL_6 = 1;
		int element_1 = -1;
		int heightR_8 = 2;
		int element_306 = 1;
		int element_223 = -1;
		int element_224 = 0;
		int height_4 = 3;
		int element_84 = 0;
		int element_222 = -1;
		int element_225 = 0;
		int element_278 = -2;
		int heightR_88 = 1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_84;
		right_3.left = left_85;
		right_3.right = right_86;
		right_3.height = heightR_8;
		left_2.element = element_278;
		left_2.left = left_280;
		left_2.right = right_279;
		left_2.height = heightL_6;
		right_86.element = element_306;
		right_86.left = left_308;
		right_86.right = right_307;
		right_86.height = heightR_88;
		obj.find(x);
	}

	@Test
	public void test28() throws Exception {
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

