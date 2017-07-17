package gov.nasa.jpf.star.examples.aatree;

import gov.nasa.jpf.star.examples.aatree.AATree.AANode;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class AATree_isEmpty1 extends TestJPF {

	@Test
	public void test1() throws Exception {
		AATree obj = new AATree();
		obj.root = obj.nullNode;
		AANode b_2 = null;
		AANode c_3 = null;
		int d_4 = 0;
		int a_1 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.isEmpty();
	}

	@Test
	public void test2() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode b_2 = null;
		AANode c_3 = null;
		AANode this_nullNode_327 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_380 = this_nullNode_327;
		AANode right_379 = this_nullNode_327;
		int level_8 = 1;
		int d_4 = 0;
		int element_378 = 0;
		int level_326 = 1;
		int a_1 = 0;
		int element_5 = -1;
		int element_324 = -1;
		int element_325 = -1;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_378;
		right_7.left = left_380;
		right_7.right = right_379;
		right_7.level = level_326;
		obj.isEmpty();
	}

	@Test
	public void test3() throws Exception {
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
		int element_5 = 5;
		int element_324 = 5;
		int element_325 = 5;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		obj.isEmpty();
	}

}

