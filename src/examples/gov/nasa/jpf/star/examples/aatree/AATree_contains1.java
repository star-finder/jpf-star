package gov.nasa.jpf.star.examples.aatree;

import gov.nasa.jpf.star.examples.aatree.AATree.AANode;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class AATree_contains1 extends TestJPF {

	@Test
	public void test1() throws Exception {
		AATree obj = new AATree();
		obj.root = obj.nullNode;
		AANode b_2 = null;
		AANode c_3 = null;
		int d_4 = 0;
		int x = 0;
		int a_1 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.contains(x);
	}

	@Test
	public void test2() throws Exception {
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
		obj.contains(x);
	}

	@Test
	public void test3() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_7 = new AANode();
		AANode left_404 = new AANode();
		AANode right_403 = new AANode();
		AANode b_2 = null;
		AANode c_3 = null;
		AANode this_nullNode_327 = obj.nullNode;
		AANode this_nullNode_331 = obj.nullNode;
		AANode left_13 = this_nullNode_327;
		AANode right_14 = this_nullNode_331;
		AANode left_428 = obj.nullNode;
		AANode right_427 = obj.nullNode;
		AANode left_436 = obj.nullNode;
		AANode right_435 = obj.nullNode;
		int level_8 = 2;
		int element_402 = 3;
		int level_325 = 2;
		int a_1 = 0;
		int element_5 = 1;
		int element_12 = 0;
		int element_326 = 0;
		int element_329 = 1;
		int d_4 = 0;
		int element_426 = 2;
		int level1_401 = 1;
		int element_328 = 0;
		int level1_10 = 1;
		int element_324 = 1;
		int x = 0;
		int element_434 = 4;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_12;
		left_6.left = left_13;
		left_6.right = right_14;
		left_6.level = level1_10;
		right_7.element = element_402;
		right_7.left = left_404;
		right_7.right = right_403;
		right_7.level = level_325;
		left_404.element = element_426;
		left_404.left = left_428;
		left_404.right = right_427;
		left_404.level = level1_401;
		right_403.element = element_434;
		right_403.left = left_436;
		right_403.right = right_435;
		right_403.level = level1_401;
		obj.contains(x);
	}

	@Test
	public void test4() throws Exception {
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
		obj.contains(x);
	}

	@Test
	public void test5() throws Exception {
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
		obj.contains(x);
	}

	@Test
	public void test6() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_7 = new AANode();
		AANode right_38 = new AANode();
		AANode b_2 = null;
		AANode c_3 = null;
		AANode this_nullNode_327 = obj.nullNode;
		AANode this_nullNode_331 = obj.nullNode;
		AANode left_37 = this_nullNode_327;
		AANode left_408 = obj.nullNode;
		AANode right_407 = obj.nullNode;
		AANode left_420 = this_nullNode_331;
		AANode right_419 = this_nullNode_331;
		int level_8 = 2;
		int element_36 = 0;
		int level1_325 = 1;
		int a_1 = 0;
		int element_5 = 2;
		int level1_330 = 1;
		int element_326 = 0;
		int element_329 = 2;
		int element_406 = 3;
		int d_4 = 0;
		int element_418 = 1;
		int element_328 = 0;
		int level1_10 = 1;
		int element_324 = 2;
		int x = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_36;
		left_6.left = left_37;
		left_6.right = right_38;
		left_6.level = level1_325;
		right_7.element = element_406;
		right_7.left = left_408;
		right_7.right = right_407;
		right_7.level = level1_10;
		right_38.element = element_418;
		right_38.left = left_420;
		right_38.right = right_419;
		right_38.level = level1_330;
		obj.contains(x);
	}

	@Test
	public void test7() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_7 = new AANode();
		AANode b_2 = null;
		AANode c_3 = null;
		AANode this_nullNode_327 = obj.nullNode;
		AANode this_nullNode_331 = obj.nullNode;
		AANode left_37 = this_nullNode_327;
		AANode right_38 = this_nullNode_331;
		AANode left_408 = obj.nullNode;
		AANode right_407 = obj.nullNode;
		int level_8 = 2;
		int element_36 = 0;
		int level1_325 = 1;
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
		left_6.element = element_36;
		left_6.left = left_37;
		left_6.right = right_38;
		left_6.level = level1_325;
		right_7.element = element_406;
		right_7.left = left_408;
		right_7.right = right_407;
		right_7.level = level1_10;
		obj.contains(x);
	}

	@Test
	public void test8() throws Exception {
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
		obj.contains(x);
	}

	@Test
	public void test9() throws Exception {
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
		obj.contains(x);
	}

}

