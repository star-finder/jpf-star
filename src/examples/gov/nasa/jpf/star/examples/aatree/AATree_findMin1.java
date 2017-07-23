package gov.nasa.jpf.star.examples.aatree;

import gov.nasa.jpf.star.examples.aatree.AATree.AANode;
import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class AATree_findMin1 extends TestJPF {

	@Test
	public void test_findMin1() throws Exception {
		AATree obj = new AATree();
		obj.root = obj.nullNode;
		AANode b_2 = null;
		AANode c_3 = null;
		int d_4 = 0;
		int a_1 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		System.out.println(Utilities.repOK(obj));
		obj.findMin();
	}

	@Test
	public void test_findMin2() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode b_2 = null;
		AANode c_3 = null;
		AANode left_6 = obj.nullNode;
		AANode left_366 = obj.nullNode;
		AANode right_365 = obj.nullNode;
		int level_8 = 1;
		int d_4 = 0;
		int level_325 = 1;
		int element_5 = -1;
		int a_1 = 0;
		int element_364 = 0;
		int element_324 = -1;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_364;
		right_7.left = left_366;
		right_7.right = right_365;
		right_7.level = level_325;
		System.out.println(Utilities.repOK(obj));
		obj.findMin();
	}

	@Test
	public void test_findMin3() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode b_2 = null;
		AANode c_3 = null;
		AANode left_6 = obj.nullNode;
		AANode right_7 = obj.nullNode;
		int level_8 = 1;
		int d_4 = 0;
		int element_5 = 5;
		int element_324 = 5;
		int a_1 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		System.out.println(Utilities.repOK(obj));
		obj.findMin();
	}

	@Test
	public void test_findMin4() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_7 = new AANode();
		AANode b_2 = null;
		AANode c_3 = null;
		AANode left_18 = obj.nullNode;
		AANode this_nullNode_328 = obj.nullNode;
		AANode right_19 = this_nullNode_328;
		AANode left_395 = obj.nullNode;
		AANode right_394 = obj.nullNode;
		int level_8 = 2;
		int d_4 = 0;
		int level1_325 = 1;
		int element_327 = -1;
		int a_1 = 0;
		int element_17 = -2;
		int element_5 = -1;
		int level1_10 = 1;
		int element_326 = -2;
		int element_324 = -1;
		int element_393 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_17;
		left_6.left = left_18;
		left_6.right = right_19;
		left_6.level = level1_325;
		right_7.element = element_393;
		right_7.left = left_395;
		right_7.right = right_394;
		right_7.level = level1_10;
		System.out.println(Utilities.repOK(obj));
		obj.findMin();
	}

}

