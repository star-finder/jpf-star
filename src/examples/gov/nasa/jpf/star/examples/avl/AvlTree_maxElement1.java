package gov.nasa.jpf.star.examples.avl;

import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class AvlTree_maxElement1 extends TestJPF {

	@Test
	public void test_maxElement1() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = null;
		int maxE = 0;
		System.out.println(Utilities.repOK(obj));
		obj.maxElement(maxE);
	}

	@Test
	public void test_maxElement2() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = null;
		AvlNode right_3 = null;
		int height_4 = 0;
		int maxE = 0;
		int element_1 = 1;
		int element_223 = 1;
		int element_224 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		System.out.println(Utilities.repOK(obj));
		obj.maxElement(maxE);
	}

	@Test
	public void test_maxElement3() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = null;
		AvlNode right_3 = null;
		int height_4 = 0;
		int maxE = 0;
		int element_1 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		System.out.println(Utilities.repOK(obj));
		obj.maxElement(maxE);
	}

	@Test
	public void test_maxElement4() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = null;
		AvlNode left_255 = null;
		AvlNode right_254 = null;
		int height_4 = 1;
		int heightL_6 = 0;
		int maxE = 0;
		int element_1 = 1;
		int element_253 = 0;
		int element_223 = 1;
		int element_224 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_253;
		left_2.left = left_255;
		left_2.right = right_254;
		left_2.height = heightL_6;
		System.out.println(Utilities.repOK(obj));
		obj.maxElement(maxE);
	}

	@Test
	public void test_maxElement5() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_269 = null;
		AvlNode right_268 = null;
		int height_4 = 1;
		int maxE = 0;
		int element_1 = 1;
		int heightR_8 = 0;
		int element_267 = 2;
		int element_223 = 1;
		int element_224 = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_267;
		right_3.left = left_269;
		right_3.right = right_268;
		right_3.height = heightR_8;
		System.out.println(Utilities.repOK(obj));
		obj.maxElement(maxE);
	}

	@Test
	public void test_maxElement6() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_55 = null;
		AvlNode right_56 = null;
		int element_1 = 0;
		int heightR_8 = 0;
		int element_54 = 1;
		int element_223 = 0;
		int element_224 = 1;
		int height_4 = 1;
		int element_225 = 1;
		int maxE = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_54;
		right_3.left = left_55;
		right_3.right = right_56;
		right_3.height = heightR_8;
		System.out.println(Utilities.repOK(obj));
		obj.maxElement(maxE);
	}

}

