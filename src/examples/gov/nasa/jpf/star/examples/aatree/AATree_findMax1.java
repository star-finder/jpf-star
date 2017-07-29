package gov.nasa.jpf.star.examples.aatree;

import gov.nasa.jpf.star.examples.aatree.AATree.AANode;
import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class AATree_findMax1 extends TestJPF {

	@Test
	public void test_findMax1() throws Exception {
		AATree obj = new AATree();
		obj.root = obj.nullNode;
		AANode b_2 = obj.nullNode;
		AANode c_3 = obj.nullNode;
		int d_4 = 0;
		int a_1 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		System.out.println(Utilities.repOK(obj));
		obj.findMax();
	}

	@Test
	public void test_findMax2() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode b_2 = obj.nullNode;
		AANode c_3 = obj.nullNode;
		AANode right_15 = obj.nullNode;
		AANode this_nullNode_320 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_14 = this_nullNode_320;
		int level_8 = 1;
		int d_4 = 0;
		int level_317 = 1;
		int element_5 = -1;
		int element_13 = 0;
		int a_1 = 0;
		int element_318 = -1;
		int element_316 = -1;
		int element_319 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_13;
		right_7.left = left_14;
		right_7.right = right_15;
		right_7.level = level_317;
		System.out.println(Utilities.repOK(obj));
		obj.findMax();
	}

	@Test
	public void test_findMax3() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode b_2 = obj.nullNode;
		AANode c_3 = obj.nullNode;
		AANode right_7 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		int element_5 = 5;
		int level_8 = 1;
		int d_4 = 0;
		int element_316 = 5;
		int a_1 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		System.out.println(Utilities.repOK(obj));
		obj.findMax();
	}

	@Test
	public void test_findMax4() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_6 = new AANode();
		AANode b_2 = obj.nullNode;
		AANode c_3 = obj.nullNode;
		AANode right_23 = obj.nullNode;
		AANode this_nullNode_320 = obj.nullNode;
		AANode left_22 = this_nullNode_320;
		AANode left_385 = obj.nullNode;
		AANode right_384 = obj.nullNode;
		int level_8 = 2;
		int d_4 = 0;
		int level1_317 = 1;
		int element_21 = 1;
		int a_1 = 0;
		int element_5 = 0;
		int level1_10 = 1;
		int element_318 = 0;
		int element_383 = -1;
		int element_316 = 0;
		int element_319 = 1;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_21;
		right_7.left = left_22;
		right_7.right = right_23;
		right_7.level = level1_317;
		left_6.element = element_383;
		left_6.left = left_385;
		left_6.right = right_384;
		left_6.level = level1_10;
		System.out.println(Utilities.repOK(obj));
		obj.findMax();
	}

}

