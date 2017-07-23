package gov.nasa.jpf.star.examples.avl;

import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class AvlTree_find1 extends TestJPF {

	@Test
	public void test_find1() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = null;
		int x = 0;
		System.out.println(Utilities.repOK(obj));
		obj.find(x);
	}

	@Test
	public void test_find2() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = null;
		AvlNode right_3 = null;
		int height_4 = 0;
		int element_1 = 1;
		int x = 0;
		int element_223 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		System.out.println(Utilities.repOK(obj));
		obj.find(x);
	}

	@Test
	public void test_find3() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_10 = null;
		AvlNode right_11 = null;
		AvlNode left_276 = null;
		AvlNode right_275 = null;
		int heightL_6 = 0;
		int element_1 = 1;
		int heightR_8 = 0;
		int element_223 = 1;
		int element_224 = 0;
		int height_4 = 1;
		int element_225 = 0;
		int element_226 = 1;
		int x = 0;
		int element_9 = 0;
		int element_274 = 2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_9;
		left_2.left = left_10;
		left_2.right = right_11;
		left_2.height = heightL_6;
		right_3.element = element_274;
		right_3.left = left_276;
		right_3.right = right_275;
		right_3.height = heightR_8;
		System.out.println(Utilities.repOK(obj));
		obj.find(x);
	}

	@Test
	public void test_find4() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = null;
		AvlNode left_2 = null;
		int height_4 = 0;
		int element_1 = -1;
		int x = 0;
		int element_223 = -1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		System.out.println(Utilities.repOK(obj));
		obj.find(x);
	}

	@Test
	public void test_find5() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_25 = null;
		AvlNode right_26 = null;
		AvlNode left_277 = null;
		AvlNode right_276 = null;
		int heightL_6 = 0;
		int element_1 = -1;
		int heightR_8 = 0;
		int element_223 = -1;
		int element_275 = -2;
		int element_224 = -1;
		int height_4 = 1;
		int element_225 = 0;
		int element_226 = 0;
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
		left_2.element = element_275;
		left_2.left = left_277;
		left_2.right = right_276;
		left_2.height = heightL_6;
		System.out.println(Utilities.repOK(obj));
		obj.find(x);
	}

	@Test
	public void test_find6() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = null;
		AvlNode right_3 = null;
		int height_4 = 0;
		int element_1 = 0;
		int x = 0;
		int element_223 = 0;
		int element_224 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		System.out.println(Utilities.repOK(obj));
		obj.find(x);
	}

	@Test
	public void test_find7() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = null;
		AvlNode left_40 = null;
		AvlNode right_41 = null;
		int heightL_6 = 0;
		int element_1 = 1;
		int element_39 = 0;
		int element_223 = 1;
		int element_224 = 0;
		int height_4 = 1;
		int element_225 = 0;
		int element_226 = 1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_39;
		left_2.left = left_40;
		left_2.right = right_41;
		left_2.height = heightL_6;
		System.out.println(Utilities.repOK(obj));
		obj.find(x);
	}

	@Test
	public void test_find8() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_40 = new AvlNode();
		AvlNode right_41 = null;
		AvlNode left_280 = null;
		AvlNode right_279 = null;
		AvlNode left_294 = null;
		AvlNode right_293 = null;
		int heightL_6 = 1;
		int element_1 = 1;
		int element_39 = 0;
		int heightR_8 = 0;
		int element_223 = 1;
		int element_224 = 0;
		int height_4 = 2;
		int element_225 = 0;
		int element_278 = 2;
		int element_292 = -1;
		int heightL_42 = 0;
		int element_226 = 1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_39;
		left_2.left = left_40;
		left_2.right = right_41;
		left_2.height = heightL_6;
		right_3.element = element_278;
		right_3.left = left_280;
		right_3.right = right_279;
		right_3.height = heightR_8;
		left_40.element = element_292;
		left_40.left = left_294;
		left_40.right = right_293;
		left_40.height = heightL_42;
		System.out.println(Utilities.repOK(obj));
		obj.find(x);
	}

	@Test
	public void test_find9() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = null;
		AvlNode left_256 = null;
		AvlNode right_255 = null;
		int height_4 = 1;
		int heightL_6 = 0;
		int element_1 = -1;
		int element_254 = -2;
		int x = 0;
		int element_223 = -1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_254;
		left_2.left = left_256;
		left_2.right = right_255;
		left_2.height = heightL_6;
		System.out.println(Utilities.repOK(obj));
		obj.find(x);
	}

	@Test
	public void test_find10() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = null;
		AvlNode left_256 = null;
		AvlNode right_255 = null;
		int height_4 = 1;
		int heightL_6 = 0;
		int element_1 = 0;
		int element_254 = -1;
		int x = 0;
		int element_223 = 0;
		int element_224 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_254;
		left_2.left = left_256;
		left_2.right = right_255;
		left_2.height = heightL_6;
		System.out.println(Utilities.repOK(obj));
		obj.find(x);
	}

	@Test
	public void test_find11() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_255 = null;
		AvlNode right_254 = null;
		int height_4 = 1;
		int element_1 = 1;
		int heightR_8 = 0;
		int element_253 = 2;
		int x = 0;
		int element_223 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_253;
		right_3.left = left_255;
		right_3.right = right_254;
		right_3.height = heightR_8;
		System.out.println(Utilities.repOK(obj));
		obj.find(x);
	}

	@Test
	public void test_find12() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_75 = null;
		AvlNode right_76 = null;
		int element_1 = -1;
		int heightR_8 = 0;
		int element_223 = -1;
		int element_224 = -1;
		int height_4 = 1;
		int element_225 = 0;
		int element_74 = 0;
		int element_226 = 0;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_74;
		right_3.left = left_75;
		right_3.right = right_76;
		right_3.height = heightR_8;
		System.out.println(Utilities.repOK(obj));
		obj.find(x);
	}

	@Test
	public void test_find13() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_75 = new AvlNode();
		AvlNode right_76 = null;
		AvlNode left_281 = null;
		AvlNode right_280 = null;
		AvlNode left_295 = null;
		AvlNode right_294 = null;
		int heightL_6 = 0;
		int heightL_77 = 0;
		int element_1 = -2;
		int heightR_8 = 1;
		int element_223 = -2;
		int element_224 = -2;
		int height_4 = 2;
		int element_225 = 0;
		int element_74 = 0;
		int element_279 = -3;
		int element_293 = -1;
		int element_226 = 0;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_74;
		right_3.left = left_75;
		right_3.right = right_76;
		right_3.height = heightR_8;
		left_2.element = element_279;
		left_2.left = left_281;
		left_2.right = right_280;
		left_2.height = heightL_6;
		left_75.element = element_293;
		left_75.left = left_295;
		left_75.right = right_294;
		left_75.height = heightL_77;
		System.out.println(Utilities.repOK(obj));
		obj.find(x);
	}

	@Test
	public void test_find14() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_270 = null;
		AvlNode right_269 = null;
		int height_4 = 1;
		int element_268 = 1;
		int element_1 = 0;
		int heightR_8 = 0;
		int x = 0;
		int element_223 = 0;
		int element_224 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_268;
		right_3.left = left_270;
		right_3.right = right_269;
		right_3.height = heightR_8;
		System.out.println(Utilities.repOK(obj));
		obj.find(x);
	}

}

