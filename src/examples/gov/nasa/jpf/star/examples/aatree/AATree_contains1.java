package gov.nasa.jpf.star.examples.aatree;

import gov.nasa.jpf.star.examples.aatree.AATree.AANode;
import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class AATree_contains1 extends TestJPF {

	@Test
	public void test_contains1() throws Exception {
		AATree obj = new AATree();
		obj.root = obj.nullNode;
		AANode b_2 = null;
		AANode c_3 = null;
		int d_4 = 0;
		int x = 0;
		int a_1 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		System.out.println(Utilities.repOK(obj));
		obj.contains(x);
	}

	@Test
	public void test_contains2() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode b_2 = null;
		AANode c_3 = null;
		AANode left_6 = obj.nullNode;
		AANode left_370 = obj.nullNode;
		AANode right_369 = obj.nullNode;
		int level_8 = 1;
		int d_4 = 0;
		int level_325 = 1;
		int element_5 = 1;
		int a_1 = 0;
		int element_368 = 2;
		int element_324 = 1;
		int x = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_368;
		right_7.left = left_370;
		right_7.right = right_369;
		right_7.level = level_325;
		System.out.println(Utilities.repOK(obj));
		obj.contains(x);
	}

	@Test
	public void test_contains3() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode b_2 = null;
		AANode c_3 = null;
		AANode this_nullNode_328 = obj.nullNode;
		AANode this_nullNode_331 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_17 = this_nullNode_328;
		AANode right_18 = this_nullNode_331;
		int level_8 = 1;
		int d_4 = 0;
		int element_327 = 0;
		int level_325 = 1;
		int a_1 = 0;
		int element_5 = -1;
		int element_326 = -1;
		int element_16 = 0;
		int element_324 = -1;
		int x = 0;
		int element_329 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_16;
		right_7.left = left_17;
		right_7.right = right_18;
		right_7.level = level_325;
		System.out.println(Utilities.repOK(obj));
		obj.contains(x);
	}

	@Test
	public void test_contains4() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode b_2 = null;
		AANode c_3 = null;
		AANode this_nullNode_327 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_385 = this_nullNode_327;
		AANode right_384 = this_nullNode_327;
		int level_8 = 1;
		int d_4 = 0;
		int level_326 = 1;
		int a_1 = 0;
		int element_5 = 0;
		int element_324 = 0;
		int element_383 = 1;
		int x = 0;
		int element_325 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_383;
		right_7.left = left_385;
		right_7.right = right_384;
		right_7.level = level_326;
		System.out.println(Utilities.repOK(obj));
		obj.contains(x);
	}

	@Test
	public void test_contains5() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode b_2 = null;
		AANode c_3 = null;
		AANode left_6 = obj.nullNode;
		AANode right_7 = obj.nullNode;
		int element_5 = 1;
		int level_8 = 1;
		int d_4 = 0;
		int element_324 = 1;
		int x = 0;
		int a_1 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		System.out.println(Utilities.repOK(obj));
		obj.contains(x);
	}

	@Test
	public void test_contains6() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_7 = new AANode();
		AANode b_2 = null;
		AANode c_3 = null;
		AANode this_nullNode_327 = obj.nullNode;
		AANode this_nullNode_331 = obj.nullNode;
		AANode left_29 = this_nullNode_327;
		AANode right_30 = this_nullNode_331;
		AANode left_408 = obj.nullNode;
		AANode right_407 = obj.nullNode;
		int level_8 = 2;
		int level1_325 = 1;
		int element_28 = 0;
		int a_1 = 0;
		int element_5 = 1;
		int element_326 = 0;
		int element_329 = 1;
		int element_406 = 2;
		int d_4 = 0;
		int element_328 = 0;
		int level1_10 = 1;
		int element_324 = 1;
		int x = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_28;
		left_6.left = left_29;
		left_6.right = right_30;
		left_6.level = level1_325;
		right_7.element = element_406;
		right_7.left = left_408;
		right_7.right = right_407;
		right_7.level = level1_10;
		System.out.println(Utilities.repOK(obj));
		obj.contains(x);
	}

	@Test
	public void test_contains7() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode b_2 = null;
		AANode c_3 = null;
		AANode right_7 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		int element_5 = -1;
		int level_8 = 1;
		int d_4 = 0;
		int element_324 = -1;
		int x = 0;
		int a_1 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		System.out.println(Utilities.repOK(obj));
		obj.contains(x);
	}

	@Test
	public void test_contains8() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_6 = new AANode();
		AANode b_2 = null;
		AANode c_3 = null;
		AANode this_nullNode_328 = obj.nullNode;
		AANode this_nullNode_331 = obj.nullNode;
		AANode left_49 = this_nullNode_328;
		AANode right_50 = this_nullNode_331;
		AANode left_409 = obj.nullNode;
		AANode right_408 = obj.nullNode;
		int level_8 = 2;
		int level1_325 = 1;
		int element_327 = 0;
		int a_1 = 0;
		int element_5 = -1;
		int element_326 = -1;
		int element_329 = 0;
		int d_4 = 0;
		int element_407 = -2;
		int level1_10 = 1;
		int element_48 = 0;
		int element_324 = -1;
		int x = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_48;
		right_7.left = left_49;
		right_7.right = right_50;
		right_7.level = level1_325;
		left_6.element = element_407;
		left_6.left = left_409;
		left_6.right = right_408;
		left_6.level = level1_10;
		System.out.println(Utilities.repOK(obj));
		obj.contains(x);
	}

	@Test
	public void test_contains9() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode b_2 = null;
		AANode c_3 = null;
		AANode this_nullNode_327 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode right_7 = this_nullNode_327;
		int level_8 = 1;
		int d_4 = 0;
		int a_1 = 0;
		int element_5 = 0;
		int element_324 = 0;
		int x = 0;
		int element_325 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		System.out.println(Utilities.repOK(obj));
		obj.contains(x);
	}

}

