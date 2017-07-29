package gov.nasa.jpf.star.examples.aatree;

import gov.nasa.jpf.star.examples.aatree.AATree.AANode;
import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class AATree_insert1 extends TestJPF {

	@Test
	public void test_insert1() throws Exception {
		AATree obj = new AATree();
		obj.root = obj.nullNode;
		AANode b_2 = obj.nullNode;
		AANode c_3 = obj.nullNode;
		int d_4 = 0;
		int x = 0;
		int a_1 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		System.out.println(Utilities.repOK(obj));
		obj.insert(x);
	}

	@Test
	public void test_insert2() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode b_2 = obj.nullNode;
		AANode c_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode this_nullNode_321 = obj.nullNode;
		AANode left_19 = obj.nullNode;
		AANode right_20 = this_nullNode_321;
		int level_8 = 1;
		int d_4 = 0;
		int element_18 = 0;
		int element_317 = -1;
		int element_5 = -1;
		int a_1 = 0;
		int level_316 = 1;
		int element_318 = 0;
		int x = -2;
		int element_319 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_18;
		right_7.left = left_19;
		right_7.right = right_20;
		right_7.level = level_316;
		System.out.println(Utilities.repOK(obj));
		obj.insert(x);
	}

	@Test
	public void test_insert3() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode b_2 = obj.nullNode;
		AANode c_3 = obj.nullNode;
		AANode this_nullNode_319 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_375 = this_nullNode_319;
		AANode right_374 = this_nullNode_319;
		int level_8 = 1;
		int d_4 = 0;
		int element_373 = 1;
		int level_318 = 1;
		int element_317 = 0;
		int a_1 = 0;
		int element_5 = 0;
		int element_316 = 0;
		int x = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_373;
		right_7.left = left_375;
		right_7.right = right_374;
		right_7.level = level_318;
		System.out.println(Utilities.repOK(obj));
		obj.insert(x);
	}

	@Test
	public void test_insert4() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode b_2 = obj.nullNode;
		AANode c_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode right_7 = obj.nullNode;
		int element_5 = 1;
		int level_8 = 1;
		int d_4 = 0;
		int x = 0;
		int a_1 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		System.out.println(Utilities.repOK(obj));
		obj.insert(x);
	}

	@Test
	public void test_insert5() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode b_2 = obj.nullNode;
		AANode c_3 = obj.nullNode;
		AANode right_7 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		int element_5 = -1;
		int level_8 = 1;
		int d_4 = 0;
		int x = 0;
		int a_1 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		System.out.println(Utilities.repOK(obj));
		obj.insert(x);
	}

	@Test
	public void test_insert6() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode b_2 = obj.nullNode;
		AANode c_3 = obj.nullNode;
		AANode this_nullNode_319 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode right_7 = this_nullNode_319;
		int level_8 = 1;
		int d_4 = 0;
		int element_317 = 0;
		int a_1 = 0;
		int element_5 = 0;
		int element_316 = 0;
		int x = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		System.out.println(Utilities.repOK(obj));
		obj.insert(x);
	}

}

