package gov.nasa.jpf.star.examples.aatree;

import gov.nasa.jpf.star.examples.aatree.AATree.AANode;
import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class AATree_isEmpty1 extends TestJPF {

	@Test
	public void test_isEmpty1() throws Exception {
		AATree obj = new AATree();
		obj.root = obj.nullNode;
		AANode b_2 = obj.nullNode;
		AANode c_3 = obj.nullNode;
		int d_4 = 0;
		int a_1 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		System.out.println(Utilities.repOK(obj));
		obj.isEmpty();
	}

	@Test
	public void test_isEmpty2() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode b_2 = obj.nullNode;
		AANode c_3 = obj.nullNode;
		AANode this_nullNode_319 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_370 = this_nullNode_319;
		AANode right_369 = this_nullNode_319;
		int level_8 = 1;
		int d_4 = 0;
		int element_317 = -1;
		int level_318 = 1;
		int a_1 = 0;
		int element_5 = -1;
		int element_368 = 0;
		int element_316 = -1;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_368;
		right_7.left = left_370;
		right_7.right = right_369;
		right_7.level = level_318;
		System.out.println(Utilities.repOK(obj));
		obj.isEmpty();
	}

	@Test
	public void test_isEmpty3() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode b_2 = obj.nullNode;
		AANode c_3 = obj.nullNode;
		AANode this_nullNode_319 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode right_7 = this_nullNode_319;
		int level_8 = 1;
		int d_4 = 0;
		int element_317 = 5;
		int a_1 = 0;
		int element_5 = 5;
		int element_316 = 5;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		System.out.println(Utilities.repOK(obj));
		obj.isEmpty();
	}

}

