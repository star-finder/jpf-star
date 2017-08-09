package gov.nasa.jpf.star.examples.aatree;

import gov.nasa.jpf.star.examples.aatree.AATree.AANode;
import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class AATree_wellFormed2Steps extends TestJPF {

	@Test
	public void test_wellFormed1() throws Exception {
		AATree obj = new AATree();
		obj.root = null;
		obj.deletedNode = null;
		obj.lastNode = null;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed2() throws Exception {
		AATree obj = new AATree();
		int level_4 = 1;
		obj.root = null;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode left_2 = null;
		AANode right_3 = null;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed3() throws Exception {
		AATree obj = new AATree();
		AANode left_2 = null;
		int level_4 = 0;
		obj.root = null;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_3 = null;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed4() throws Exception {
		AATree obj = new AATree();
		AANode left_2 = new AANode();
		int level_4 = 0;
		obj.root = null;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_3 = null;
		int element_9 = 0;
		AANode left_10 = null;
		AANode right_11 = null;
		int level_12 = 0;
		left_2.element = element_9;
		left_2.left = left_10;
		left_2.right = right_11;
		left_2.level = level_12;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

}

