package gov.nasa.jpf.star.examples.bst;

import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class BinarySearchTree_insert1 extends TestJPF {

	@Test
	public void test_insert1() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = null;
		int x = 0;
		System.out.println(Utilities.repOK(obj));
		obj.insert(x);
	}

	@Test
	public void test_insert2() throws Exception {
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
		obj.insert(x);
	}

	@Test
	public void test_insert3() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode left_2 = new BinaryNode();
		BinaryNode right_3 = null;
		BinaryNode left_8 = null;
		BinaryNode right_9 = null;
		int element_77 = 0;
		int element_79 = 1;
		int element_1 = 1;
		int element_7 = 0;
		int element_76 = 1;
		int element_78 = 0;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		left_2.element = element_7;
		left_2.left = left_8;
		left_2.right = right_9;
		System.out.println(Utilities.repOK(obj));
		obj.insert(x);
	}

	@Test
	public void test_insert4() throws Exception {
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
		obj.insert(x);
	}

	@Test
	public void test_insert5() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = new BinaryNode();
		BinaryNode right_3 = new BinaryNode();
		BinaryNode left_2 = null;
		BinaryNode left_18 = null;
		BinaryNode right_19 = null;
		int element_77 = -1;
		int element_79 = 0;
		int element_1 = -1;
		int element_76 = -1;
		int element_78 = 0;
		int x = 0;
		int element_17 = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		right_3.element = element_17;
		right_3.left = left_18;
		right_3.right = right_19;
		System.out.println(Utilities.repOK(obj));
		obj.insert(x);
	}

	@Test
	public void test_insert6() throws Exception {
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
		obj.insert(x);
	}

}

