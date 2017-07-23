package gov.nasa.jpf.star.examples.bst;

import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class BinarySearchTree_find1 extends TestJPF {

	@Test
	public void test_find1() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = null;
		int x = 0;
		System.out.println(Utilities.repOK(obj));
		obj.find(x);
	}

	@Test
	public void test_find2() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = null;
		BinaryNode right_3 = null;
		int element_1 = 1;
		int element_76 = 1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		System.out.println(Utilities.repOK(obj));
		obj.find(x);
	}

	@Test
	public void test_find3() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = null;
		BinaryNode left_7 = null;
		BinaryNode right_8 = null;
		int element_77 = 0;
		int element_79 = 1;
		int element_1 = 1;
		int element_76 = 1;
		int element_78 = 0;
		int x = 0;
		int element_6 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_6;
		left_2.left = left_7;
		left_2.right = right_8;
		System.out.println(Utilities.repOK(obj));
		obj.find(x);
	}

	@Test
	public void test_find4() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = null;
		BinaryNode left_2 = null;
		int element_1 = -1;
		int element_76 = -1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		System.out.println(Utilities.repOK(obj));
		obj.find(x);
	}

	@Test
	public void test_find5() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_2 = null;
		BinaryNode left_16 = null;
		BinaryNode right_17 = null;
		int element_77 = -1;
		int element_79 = 0;
		int element_15 = 0;
		int element_1 = -1;
		int element_76 = -1;
		int element_78 = 0;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_15;
		right_3.left = left_16;
		right_3.right = right_17;
		System.out.println(Utilities.repOK(obj));
		obj.find(x);
	}

	@Test
	public void test_find6() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = null;
		BinaryNode right_3 = null;
		int element_1 = 0;
		int element_76 = 0;
		int element_77 = 0;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		System.out.println(Utilities.repOK(obj));
		obj.find(x);
	}

}

