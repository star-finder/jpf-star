package gov.nasa.jpf.star.examples.avl;

import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class AvlTree_minElement1 extends TestJPF {

	@Test
	public void test_minElement1() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = null;
		int minE = 0;
		System.out.println(Utilities.repOK(obj));
		obj.minElement(minE);
	}

	@Test
	public void test_minElement2() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = null;
		AvlNode right_3 = null;
		int height_4 = 0;
		int minE = 0;
		int element_1 = -1;
		int element_223 = -1;
		int element_224 = -1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		System.out.println(Utilities.repOK(obj));
		obj.minElement(minE);
	}

	@Test
	public void test_minElement3() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = null;
		AvlNode right_3 = null;
		int height_4 = 0;
		int element_1 = 0;
		int minE = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		System.out.println(Utilities.repOK(obj));
		obj.minElement(minE);
	}

	@Test
	public void test_minElement4() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_10 = null;
		AvlNode right_11 = null;
		AvlNode left_275 = null;
		AvlNode right_274 = null;
		int heightL_6 = 0;
		int element_1 = 0;
		int heightR_8 = 0;
		int element_223 = 0;
		int element_224 = -1;
		int height_4 = 1;
		int element_225 = -1;
		int minE = 0;
		int element_226 = 0;
		int element_9 = -1;
		int element_273 = 1;
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
		System.out.println(Utilities.repOK(obj));
		obj.minElement(minE);
	}

	@Test
	public void test_minElement5() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = null;
		AvlNode left_255 = null;
		AvlNode right_254 = null;
		int height_4 = 1;
		int heightL_6 = 0;
		int minE = 0;
		int element_1 = -1;
		int element_253 = -2;
		int element_223 = -1;
		int element_224 = -1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_253;
		left_2.left = left_255;
		left_2.right = right_254;
		left_2.height = heightL_6;
		System.out.println(Utilities.repOK(obj));
		obj.minElement(minE);
	}

	@Test
	public void test_minElement6() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = null;
		AvlNode left_30 = null;
		AvlNode right_31 = null;
		int heightL_6 = 0;
		int element_1 = 0;
		int element_223 = 0;
		int element_224 = -1;
		int height_4 = 1;
		int element_225 = -1;
		int minE = 0;
		int element_29 = -1;
		int element_226 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_29;
		left_2.left = left_30;
		left_2.right = right_31;
		left_2.height = heightL_6;
		System.out.println(Utilities.repOK(obj));
		obj.minElement(minE);
	}

	@Test
	public void test_minElement7() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_30 = new AvlNode();
		AvlNode right_31 = null;
		AvlNode left_279 = null;
		AvlNode right_278 = null;
		AvlNode left_293 = null;
		AvlNode right_292 = null;
		int heightL_6 = 1;
		int element_1 = 1;
		int heightR_8 = 0;
		int element_277 = 2;
		int element_223 = 1;
		int element_224 = 0;
		int height_4 = 2;
		int element_225 = 0;
		int element_291 = -1;
		int heightL_32 = 0;
		int minE = 1;
		int element_29 = 0;
		int element_226 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_29;
		left_2.left = left_30;
		left_2.right = right_31;
		left_2.height = heightL_6;
		right_3.element = element_277;
		right_3.left = left_279;
		right_3.right = right_278;
		right_3.height = heightR_8;
		left_30.element = element_291;
		left_30.left = left_293;
		left_30.right = right_292;
		left_30.height = heightL_32;
		System.out.println(Utilities.repOK(obj));
		obj.minElement(minE);
	}

	@Test
	public void test_minElement8() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_269 = null;
		AvlNode right_268 = null;
		int height_4 = 1;
		int minE = 0;
		int element_1 = -1;
		int heightR_8 = 0;
		int element_267 = 0;
		int element_223 = -1;
		int element_224 = -1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_267;
		right_3.left = left_269;
		right_3.right = right_268;
		right_3.height = heightR_8;
		System.out.println(Utilities.repOK(obj));
		obj.minElement(minE);
	}

}

