package gov.nasa.jpf.star.examples.aatree;

import gov.nasa.jpf.star.examples.aatree.AATree.AANode;
import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class AATree_wellFormed9Steps extends TestJPF {

	@Test
	public void test_wellFormed1() throws Exception {
		AATree obj = new AATree();
		obj.root = null;
		obj.deletedNode = null;
		obj.lastNode = null;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
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
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed3() throws Exception {
		AATree obj = new AATree();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		obj.root = obj.nullNode;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed4() throws Exception {
		AATree obj = new AATree();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		obj.root = null;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed5() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode right_7 = obj.nullNode;
		int level_8 = 4;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_5 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed6() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode right_7 = obj.nullNode;
		int level_8 = 1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_5 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed7() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode right_7 = obj.root;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_5 = 0;
		int level_8 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed8() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode right_7 = null;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_5 = 0;
		int level_8 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed9() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_10 = obj.nullNode;
		AANode right_11 = obj.nullNode;
		int element_9 = 0;
		int element_5 = -1;
		int level_8 = 6;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_12 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed10() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_10 = obj.nullNode;
		AANode right_11 = obj.nullNode;
		int element_9 = 0;
		int level_8 = 1;
		int element_5 = -1;
		int level_12 = 2;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed11() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_10 = obj.nullNode;
		AANode right_11 = obj.nullNode;
		int element_9 = 0;
		int level_8 = 1;
		int element_5 = -1;
		int level_12 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed12() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_10 = obj.nullNode;
		AANode right_11 = obj.nullNode;
		int element_9 = 1;
		int level_8 = 1;
		int element_5 = 0;
		int level_12 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed13() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_10 = obj.nullNode;
		AANode right_11 = obj.nullNode;
		int element_9 = 0;
		int level_8 = 1;
		int element_5 = -1;
		int level_12 = 1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed14() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_10 = obj.nullNode;
		AANode right_11 = obj.root;
		int element_9 = 0;
		int element_5 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		int level_12 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed15() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_10 = obj.nullNode;
		AANode right_11 = right_7;
		int element_9 = 0;
		int element_5 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		int level_12 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed16() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_10 = obj.nullNode;
		AANode right_11 = null;
		int element_9 = 0;
		int element_5 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		int level_12 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed17() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode right_11 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_10 = obj.nullNode;
		AANode left_14 = obj.root;
		int element_9 = 0;
		int element_5 = -1;
		int element_13 = 1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		int level_12 = 0;
		AANode right_15 = null;
		int level_16 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		right_11.element = element_13;
		right_11.left = left_14;
		right_11.right = right_15;
		right_11.level = level_16;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed18() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode right_11 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_10 = obj.nullNode;
		AANode left_14 = right_7;
		int element_9 = 0;
		int element_5 = -1;
		int element_13 = 1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		int level_12 = 0;
		AANode right_15 = null;
		int level_16 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		right_11.element = element_13;
		right_11.left = left_14;
		right_11.right = right_15;
		right_11.level = level_16;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed19() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode right_11 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_10 = obj.nullNode;
		AANode left_14 = right_11;
		int element_9 = 0;
		int element_5 = -1;
		int element_13 = 1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		int level_12 = 0;
		AANode right_15 = null;
		int level_16 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		right_11.element = element_13;
		right_11.left = left_14;
		right_11.right = right_15;
		right_11.level = level_16;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed20() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode right_11 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_10 = obj.nullNode;
		AANode left_14 = null;
		int element_9 = 0;
		int element_5 = -1;
		int element_13 = 1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		int level_12 = 0;
		AANode right_15 = null;
		int level_16 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		right_11.element = element_13;
		right_11.left = left_14;
		right_11.right = right_15;
		right_11.level = level_16;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed21() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode right_11 = new AANode();
		AANode left_14 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_10 = obj.nullNode;
		int element_21 = 0;
		int element_5 = -1;
		int element_13 = 1;
		int element_9 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		int level_12 = 0;
		AANode right_15 = null;
		int level_16 = 0;
		AANode left_22 = null;
		AANode right_23 = null;
		int level_24 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		right_11.element = element_13;
		right_11.left = left_14;
		right_11.right = right_15;
		right_11.level = level_16;
		left_14.element = element_21;
		left_14.left = left_22;
		left_14.right = right_23;
		left_14.level = level_24;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed22() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode right_11 = new AANode();
		AANode left_14 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_10 = obj.nullNode;
		int element_21 = 0;
		int element_5 = -2;
		int element_13 = 0;
		int element_9 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		int level_12 = 0;
		AANode right_15 = null;
		int level_16 = 0;
		AANode left_22 = null;
		AANode right_23 = null;
		int level_24 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		right_11.element = element_13;
		right_11.left = left_14;
		right_11.right = right_15;
		right_11.level = level_16;
		left_14.element = element_21;
		left_14.left = left_22;
		left_14.right = right_23;
		left_14.level = level_24;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed23() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode right_11 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_10 = obj.nullNode;
		int element_9 = 0;
		int element_5 = -1;
		int element_13 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		int level_12 = 0;
		AANode left_14 = null;
		AANode right_15 = null;
		int level_16 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		right_11.element = element_13;
		right_11.left = left_14;
		right_11.right = right_15;
		right_11.level = level_16;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed24() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_10 = obj.root;
		int element_9 = 0;
		int element_5 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		AANode right_11 = null;
		int level_12 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed25() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_10 = right_7;
		int element_9 = 0;
		int element_5 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		AANode right_11 = null;
		int level_12 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed26() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_10 = null;
		int element_9 = 0;
		int element_5 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		AANode right_11 = null;
		int level_12 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed27() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_10 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_30 = obj.nullNode;
		AANode right_31 = obj.root;
		int element_9 = 0;
		int element_5 = -2;
		int element_29 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		AANode right_11 = null;
		int level_12 = 0;
		int level_32 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		left_10.element = element_29;
		left_10.left = left_30;
		left_10.right = right_31;
		left_10.level = level_32;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed28() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_10 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_30 = obj.nullNode;
		AANode right_31 = right_7;
		int element_9 = 0;
		int element_5 = -2;
		int element_29 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		AANode right_11 = null;
		int level_12 = 0;
		int level_32 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		left_10.element = element_29;
		left_10.left = left_30;
		left_10.right = right_31;
		left_10.level = level_32;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed29() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_10 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_30 = obj.nullNode;
		AANode right_31 = left_10;
		int element_9 = 0;
		int element_5 = -2;
		int element_29 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		AANode right_11 = null;
		int level_12 = 0;
		int level_32 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		left_10.element = element_29;
		left_10.left = left_30;
		left_10.right = right_31;
		left_10.level = level_32;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed30() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_10 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_30 = obj.nullNode;
		AANode right_31 = null;
		int element_9 = 0;
		int element_5 = -2;
		int element_29 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		AANode right_11 = null;
		int level_12 = 0;
		int level_32 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		left_10.element = element_29;
		left_10.left = left_30;
		left_10.right = right_31;
		left_10.level = level_32;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed31() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_10 = new AANode();
		AANode right_31 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_30 = obj.nullNode;
		int element_5 = -2;
		int element_29 = -1;
		int element_37 = -1;
		int element_9 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		AANode right_11 = null;
		int level_12 = 0;
		int level_32 = 0;
		AANode left_38 = null;
		AANode right_39 = null;
		int level_40 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		left_10.element = element_29;
		left_10.left = left_30;
		left_10.right = right_31;
		left_10.level = level_32;
		right_31.element = element_37;
		right_31.left = left_38;
		right_31.right = right_39;
		right_31.level = level_40;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed32() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_10 = new AANode();
		AANode right_31 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_30 = obj.nullNode;
		int element_5 = -2;
		int element_29 = -1;
		int element_37 = 0;
		int element_9 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		AANode right_11 = null;
		int level_12 = 0;
		int level_32 = 0;
		AANode left_38 = null;
		AANode right_39 = null;
		int level_40 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		left_10.element = element_29;
		left_10.left = left_30;
		left_10.right = right_31;
		left_10.level = level_32;
		right_31.element = element_37;
		right_31.left = left_38;
		right_31.right = right_39;
		right_31.level = level_40;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed33() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_10 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_30 = obj.root;
		int element_9 = 0;
		int element_5 = -2;
		int element_29 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		AANode right_11 = null;
		int level_12 = 0;
		AANode right_31 = null;
		int level_32 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		left_10.element = element_29;
		left_10.left = left_30;
		left_10.right = right_31;
		left_10.level = level_32;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed34() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_10 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_30 = right_7;
		int element_9 = 0;
		int element_5 = -2;
		int element_29 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		AANode right_11 = null;
		int level_12 = 0;
		AANode right_31 = null;
		int level_32 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		left_10.element = element_29;
		left_10.left = left_30;
		left_10.right = right_31;
		left_10.level = level_32;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed35() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_10 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_30 = left_10;
		int element_9 = 0;
		int element_5 = -2;
		int element_29 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		AANode right_11 = null;
		int level_12 = 0;
		AANode right_31 = null;
		int level_32 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		left_10.element = element_29;
		left_10.left = left_30;
		left_10.right = right_31;
		left_10.level = level_32;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed36() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_10 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_30 = null;
		int element_9 = 0;
		int element_5 = -2;
		int element_29 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		AANode right_11 = null;
		int level_12 = 0;
		AANode right_31 = null;
		int level_32 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		left_10.element = element_29;
		left_10.left = left_30;
		left_10.right = right_31;
		left_10.level = level_32;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed37() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_10 = new AANode();
		AANode left_30 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_46 = obj.root;
		int element_5 = 0;
		int element_29 = 2;
		int element_45 = 1;
		int element_9 = 3;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		AANode right_11 = null;
		int level_12 = 0;
		AANode right_31 = null;
		int level_32 = 0;
		AANode right_47 = null;
		int level_48 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		left_10.element = element_29;
		left_10.left = left_30;
		left_10.right = right_31;
		left_10.level = level_32;
		left_30.element = element_45;
		left_30.left = left_46;
		left_30.right = right_47;
		left_30.level = level_48;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed38() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_10 = new AANode();
		AANode left_30 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_46 = right_7;
		int element_5 = -3;
		int element_29 = -1;
		int element_45 = -2;
		int element_9 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		AANode right_11 = null;
		int level_12 = 0;
		AANode right_31 = null;
		int level_32 = 0;
		AANode right_47 = null;
		int level_48 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		left_10.element = element_29;
		left_10.left = left_30;
		left_10.right = right_31;
		left_10.level = level_32;
		left_30.element = element_45;
		left_30.left = left_46;
		left_30.right = right_47;
		left_30.level = level_48;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed39() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_10 = new AANode();
		AANode left_30 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_46 = left_10;
		int element_5 = 0;
		int element_29 = 2;
		int element_45 = 1;
		int element_9 = 3;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		AANode right_11 = null;
		int level_12 = 0;
		AANode right_31 = null;
		int level_32 = 0;
		AANode right_47 = null;
		int level_48 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		left_10.element = element_29;
		left_10.left = left_30;
		left_10.right = right_31;
		left_10.level = level_32;
		left_30.element = element_45;
		left_30.left = left_46;
		left_30.right = right_47;
		left_30.level = level_48;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed40() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_10 = new AANode();
		AANode left_30 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_46 = left_30;
		int element_5 = 0;
		int element_29 = 2;
		int element_45 = 1;
		int element_9 = 3;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		AANode right_11 = null;
		int level_12 = 0;
		AANode right_31 = null;
		int level_32 = 0;
		AANode right_47 = null;
		int level_48 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		left_10.element = element_29;
		left_10.left = left_30;
		left_10.right = right_31;
		left_10.level = level_32;
		left_30.element = element_45;
		left_30.left = left_46;
		left_30.right = right_47;
		left_30.level = level_48;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed41() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_10 = new AANode();
		AANode left_30 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode left_46 = null;
		int element_5 = 0;
		int element_29 = 2;
		int element_45 = 1;
		int element_9 = 3;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		AANode right_11 = null;
		int level_12 = 0;
		AANode right_31 = null;
		int level_32 = 0;
		AANode right_47 = null;
		int level_48 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		left_10.element = element_29;
		left_10.left = left_30;
		left_10.right = right_31;
		left_10.level = level_32;
		left_30.element = element_45;
		left_30.left = left_46;
		left_30.right = right_47;
		left_30.level = level_48;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed42() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_10 = new AANode();
		AANode left_30 = new AANode();
		AANode left_46 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		int element_5 = 0;
		int element_53 = 0;
		int element_29 = 2;
		int element_45 = 1;
		int element_9 = 3;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		AANode right_11 = null;
		int level_12 = 0;
		AANode right_31 = null;
		int level_32 = 0;
		AANode right_47 = null;
		int level_48 = 0;
		AANode left_54 = null;
		AANode right_55 = null;
		int level_56 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		left_10.element = element_29;
		left_10.left = left_30;
		left_10.right = right_31;
		left_10.level = level_32;
		left_30.element = element_45;
		left_30.left = left_46;
		left_30.right = right_47;
		left_30.level = level_48;
		left_46.element = element_53;
		left_46.left = left_54;
		left_46.right = right_55;
		left_46.level = level_56;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed43() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_10 = new AANode();
		AANode left_30 = new AANode();
		AANode left_46 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		int element_5 = -1;
		int element_53 = 0;
		int element_29 = 1;
		int element_45 = 0;
		int element_9 = 2;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		AANode right_11 = null;
		int level_12 = 0;
		AANode right_31 = null;
		int level_32 = 0;
		AANode right_47 = null;
		int level_48 = 0;
		AANode left_54 = null;
		AANode right_55 = null;
		int level_56 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		left_10.element = element_29;
		left_10.left = left_30;
		left_10.right = right_31;
		left_10.level = level_32;
		left_30.element = element_45;
		left_30.left = left_46;
		left_30.right = right_47;
		left_30.level = level_48;
		left_46.element = element_53;
		left_46.left = left_54;
		left_46.right = right_55;
		left_46.level = level_56;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed44() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_10 = new AANode();
		AANode left_30 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		int element_9 = 2;
		int element_5 = 0;
		int element_29 = 1;
		int element_45 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		AANode right_11 = null;
		int level_12 = 0;
		AANode right_31 = null;
		int level_32 = 0;
		AANode left_46 = null;
		AANode right_47 = null;
		int level_48 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		left_10.element = element_29;
		left_10.left = left_30;
		left_10.right = right_31;
		left_10.level = level_32;
		left_30.element = element_45;
		left_30.left = left_46;
		left_30.right = right_47;
		left_30.level = level_48;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed45() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_10 = new AANode();
		AANode left_30 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		int element_9 = 1;
		int element_5 = -1;
		int element_29 = 0;
		int element_45 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		AANode right_11 = null;
		int level_12 = 0;
		AANode right_31 = null;
		int level_32 = 0;
		AANode left_46 = null;
		AANode right_47 = null;
		int level_48 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		left_10.element = element_29;
		left_10.left = left_30;
		left_10.right = right_31;
		left_10.level = level_32;
		left_30.element = element_45;
		left_30.left = left_46;
		left_30.right = right_47;
		left_30.level = level_48;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed46() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_10 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		int element_9 = 0;
		int element_5 = -1;
		int element_29 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		AANode right_11 = null;
		int level_12 = 0;
		AANode left_30 = null;
		AANode right_31 = null;
		int level_32 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		left_10.element = element_29;
		left_10.left = left_30;
		left_10.right = right_31;
		left_10.level = level_32;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed47() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_10 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		int element_9 = 0;
		int element_5 = -1;
		int element_29 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		AANode right_11 = null;
		int level_12 = 0;
		AANode left_30 = null;
		AANode right_31 = null;
		int level_32 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		left_10.element = element_29;
		left_10.left = left_30;
		left_10.right = right_31;
		left_10.level = level_32;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed48() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		int element_5 = 0;
		int element_9 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		AANode left_10 = null;
		AANode right_11 = null;
		int level_12 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_9;
		right_7.left = left_10;
		right_7.right = right_11;
		right_7.level = level_12;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed49() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.root;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_5 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed50() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = null;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_5 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed51() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = obj.nullNode;
		AANode right_63 = obj.nullNode;
		AANode right_7 = obj.nullNode;
		int level_8 = 6;
		int element_61 = 0;
		int level_4 = 0;
		int element_5 = 1;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_64 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed52() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = obj.nullNode;
		AANode right_63 = obj.nullNode;
		AANode right_7 = obj.nullNode;
		int level_8 = 1;
		int level_64 = 6;
		int element_61 = 0;
		int level_4 = 0;
		int element_5 = 1;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed53() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = obj.nullNode;
		AANode right_63 = obj.nullNode;
		AANode right_7 = obj.nullNode;
		int element_5 = 0;
		int level_8 = 1;
		int element_61 = -1;
		int level_4 = 0;
		int level_64 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed54() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = obj.nullNode;
		AANode right_63 = obj.nullNode;
		AANode right_7 = obj.root;
		int element_61 = 0;
		int level_4 = 0;
		int element_5 = 1;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		int level_64 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed55() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = obj.nullNode;
		AANode right_63 = obj.nullNode;
		AANode right_7 = left_6;
		int element_61 = 0;
		int level_4 = 0;
		int element_5 = 1;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		int level_64 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed56() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = obj.nullNode;
		AANode right_63 = obj.nullNode;
		AANode right_7 = null;
		int element_61 = -1;
		int level_4 = 0;
		int element_5 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		int level_64 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed57() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_7 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = obj.nullNode;
		AANode right_63 = obj.nullNode;
		AANode left_66 = obj.root;
		int element_65 = 1;
		int element_61 = -1;
		int level_4 = 0;
		int element_5 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		int level_64 = 0;
		AANode right_67 = null;
		int level_68 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		right_7.element = element_65;
		right_7.left = left_66;
		right_7.right = right_67;
		right_7.level = level_68;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed58() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_7 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = obj.nullNode;
		AANode right_63 = obj.nullNode;
		AANode left_66 = left_6;
		int element_65 = 2;
		int element_61 = 0;
		int level_4 = 0;
		int element_5 = 1;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		int level_64 = 0;
		AANode right_67 = null;
		int level_68 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		right_7.element = element_65;
		right_7.left = left_66;
		right_7.right = right_67;
		right_7.level = level_68;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed59() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_7 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = obj.nullNode;
		AANode right_63 = obj.nullNode;
		AANode left_66 = right_7;
		int element_65 = 1;
		int element_61 = -1;
		int level_4 = 0;
		int element_5 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		int level_64 = 0;
		AANode right_67 = null;
		int level_68 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		right_7.element = element_65;
		right_7.left = left_66;
		right_7.right = right_67;
		right_7.level = level_68;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed60() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_7 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = obj.nullNode;
		AANode right_63 = obj.nullNode;
		AANode left_66 = null;
		int element_65 = 1;
		int element_61 = -1;
		int level_4 = 0;
		int element_5 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		int level_64 = 0;
		AANode right_67 = null;
		int level_68 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		right_7.element = element_65;
		right_7.left = left_66;
		right_7.right = right_67;
		right_7.level = level_68;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed61() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_7 = new AANode();
		AANode left_66 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = obj.nullNode;
		AANode right_63 = obj.nullNode;
		int element_65 = 1;
		int element_5 = 0;
		int element_73 = 0;
		int element_61 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		int level_64 = 0;
		AANode right_67 = null;
		int level_68 = 0;
		AANode left_74 = null;
		AANode right_75 = null;
		int level_76 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		right_7.element = element_65;
		right_7.left = left_66;
		right_7.right = right_67;
		right_7.level = level_68;
		left_66.element = element_73;
		left_66.left = left_74;
		left_66.right = right_75;
		left_66.level = level_76;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed62() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_7 = new AANode();
		AANode left_66 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = obj.nullNode;
		AANode right_63 = obj.nullNode;
		int element_65 = 0;
		int element_5 = -1;
		int element_73 = 0;
		int element_61 = -2;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		int level_64 = 0;
		AANode right_67 = null;
		int level_68 = 0;
		AANode left_74 = null;
		AANode right_75 = null;
		int level_76 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		right_7.element = element_65;
		right_7.left = left_66;
		right_7.right = right_67;
		right_7.level = level_68;
		left_66.element = element_73;
		left_66.left = left_74;
		left_66.right = right_75;
		left_66.level = level_76;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed63() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_7 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = obj.nullNode;
		AANode right_63 = obj.nullNode;
		int element_65 = 0;
		int element_61 = -1;
		int level_4 = 0;
		int element_5 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		int level_64 = 0;
		AANode left_66 = null;
		AANode right_67 = null;
		int level_68 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		right_7.element = element_65;
		right_7.left = left_66;
		right_7.right = right_67;
		right_7.level = level_68;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed64() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = obj.nullNode;
		AANode right_63 = obj.root;
		int element_61 = 0;
		int level_4 = 0;
		int element_5 = 1;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_64 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed65() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = obj.nullNode;
		AANode right_63 = left_6;
		int element_61 = 0;
		int level_4 = 0;
		int element_5 = 1;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_64 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed66() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = obj.nullNode;
		AANode right_63 = null;
		int element_61 = -1;
		int level_4 = 0;
		int element_5 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_64 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed67() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_63 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = obj.nullNode;
		AANode left_82 = obj.nullNode;
		AANode right_83 = obj.root;
		int element_81 = 1;
		int element_61 = 0;
		int level_4 = 0;
		int element_5 = 2;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_64 = 0;
		int level_84 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		right_63.element = element_81;
		right_63.left = left_82;
		right_63.right = right_83;
		right_63.level = level_84;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed68() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_63 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = obj.nullNode;
		AANode left_82 = obj.nullNode;
		AANode right_83 = left_6;
		int element_81 = 1;
		int element_61 = 0;
		int level_4 = 0;
		int element_5 = 2;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_64 = 0;
		int level_84 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		right_63.element = element_81;
		right_63.left = left_82;
		right_63.right = right_83;
		right_63.level = level_84;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed69() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_63 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = obj.nullNode;
		AANode left_82 = obj.nullNode;
		AANode right_83 = right_63;
		int element_81 = 1;
		int element_61 = 0;
		int level_4 = 0;
		int element_5 = 2;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_64 = 0;
		int level_84 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		right_63.element = element_81;
		right_63.left = left_82;
		right_63.right = right_83;
		right_63.level = level_84;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed70() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_63 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = obj.nullNode;
		AANode left_82 = obj.nullNode;
		AANode right_83 = null;
		int element_81 = 1;
		int element_61 = 0;
		int level_4 = 0;
		int element_5 = 2;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_64 = 0;
		int level_84 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		right_63.element = element_81;
		right_63.left = left_82;
		right_63.right = right_83;
		right_63.level = level_84;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed71() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_63 = new AANode();
		AANode right_83 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = obj.nullNode;
		AANode left_82 = obj.nullNode;
		int element_81 = -1;
		int element_5 = 0;
		int element_89 = -1;
		int element_61 = -2;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_64 = 0;
		int level_84 = 0;
		AANode left_90 = null;
		AANode right_91 = null;
		int level_92 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		right_63.element = element_81;
		right_63.left = left_82;
		right_63.right = right_83;
		right_63.level = level_84;
		right_83.element = element_89;
		right_83.left = left_90;
		right_83.right = right_91;
		right_83.level = level_92;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed72() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_63 = new AANode();
		AANode right_83 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = obj.nullNode;
		AANode left_82 = obj.nullNode;
		int element_81 = -1;
		int element_5 = 0;
		int element_89 = 0;
		int element_61 = -2;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_64 = 0;
		int level_84 = 0;
		AANode left_90 = null;
		AANode right_91 = null;
		int level_92 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		right_63.element = element_81;
		right_63.left = left_82;
		right_63.right = right_83;
		right_63.level = level_84;
		right_83.element = element_89;
		right_83.left = left_90;
		right_83.right = right_91;
		right_83.level = level_92;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed73() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_63 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = obj.nullNode;
		AANode left_82 = obj.root;
		int element_81 = 1;
		int element_61 = 0;
		int level_4 = 0;
		int element_5 = 2;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_64 = 0;
		AANode right_83 = null;
		int level_84 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		right_63.element = element_81;
		right_63.left = left_82;
		right_63.right = right_83;
		right_63.level = level_84;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed74() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_63 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = obj.nullNode;
		AANode left_82 = left_6;
		int element_81 = 1;
		int element_61 = 0;
		int level_4 = 0;
		int element_5 = 2;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_64 = 0;
		AANode right_83 = null;
		int level_84 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		right_63.element = element_81;
		right_63.left = left_82;
		right_63.right = right_83;
		right_63.level = level_84;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed75() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_63 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = obj.nullNode;
		AANode left_82 = right_63;
		int element_81 = 1;
		int element_61 = 0;
		int level_4 = 0;
		int element_5 = 2;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_64 = 0;
		AANode right_83 = null;
		int level_84 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		right_63.element = element_81;
		right_63.left = left_82;
		right_63.right = right_83;
		right_63.level = level_84;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed76() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_63 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = obj.nullNode;
		AANode left_82 = null;
		int element_81 = 1;
		int element_61 = 0;
		int level_4 = 0;
		int element_5 = 2;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_64 = 0;
		AANode right_83 = null;
		int level_84 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		right_63.element = element_81;
		right_63.left = left_82;
		right_63.right = right_83;
		right_63.level = level_84;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed77() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_63 = new AANode();
		AANode left_82 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = obj.nullNode;
		AANode left_98 = obj.root;
		int element_97 = 1;
		int element_81 = 2;
		int element_5 = 3;
		int element_61 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_64 = 0;
		AANode right_83 = null;
		int level_84 = 0;
		AANode right_99 = null;
		int level_100 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		right_63.element = element_81;
		right_63.left = left_82;
		right_63.right = right_83;
		right_63.level = level_84;
		left_82.element = element_97;
		left_82.left = left_98;
		left_82.right = right_99;
		left_82.level = level_100;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed78() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_63 = new AANode();
		AANode left_82 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = obj.nullNode;
		AANode left_98 = left_6;
		int element_97 = 1;
		int element_81 = 2;
		int element_5 = 3;
		int element_61 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_64 = 0;
		AANode right_83 = null;
		int level_84 = 0;
		AANode right_99 = null;
		int level_100 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		right_63.element = element_81;
		right_63.left = left_82;
		right_63.right = right_83;
		right_63.level = level_84;
		left_82.element = element_97;
		left_82.left = left_98;
		left_82.right = right_99;
		left_82.level = level_100;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed79() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_63 = new AANode();
		AANode left_82 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = obj.nullNode;
		AANode left_98 = right_63;
		int element_97 = 1;
		int element_81 = 2;
		int element_5 = 3;
		int element_61 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_64 = 0;
		AANode right_83 = null;
		int level_84 = 0;
		AANode right_99 = null;
		int level_100 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		right_63.element = element_81;
		right_63.left = left_82;
		right_63.right = right_83;
		right_63.level = level_84;
		left_82.element = element_97;
		left_82.left = left_98;
		left_82.right = right_99;
		left_82.level = level_100;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed80() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_63 = new AANode();
		AANode left_82 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = obj.nullNode;
		AANode left_98 = left_82;
		int element_97 = 1;
		int element_81 = 2;
		int element_5 = 3;
		int element_61 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_64 = 0;
		AANode right_83 = null;
		int level_84 = 0;
		AANode right_99 = null;
		int level_100 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		right_63.element = element_81;
		right_63.left = left_82;
		right_63.right = right_83;
		right_63.level = level_84;
		left_82.element = element_97;
		left_82.left = left_98;
		left_82.right = right_99;
		left_82.level = level_100;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed81() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_63 = new AANode();
		AANode left_82 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = obj.nullNode;
		AANode left_98 = null;
		int element_97 = 1;
		int element_81 = 2;
		int element_5 = 3;
		int element_61 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_64 = 0;
		AANode right_83 = null;
		int level_84 = 0;
		AANode right_99 = null;
		int level_100 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		right_63.element = element_81;
		right_63.left = left_82;
		right_63.right = right_83;
		right_63.level = level_84;
		left_82.element = element_97;
		left_82.left = left_98;
		left_82.right = right_99;
		left_82.level = level_100;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed82() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_63 = new AANode();
		AANode left_82 = new AANode();
		AANode left_98 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = obj.nullNode;
		int element_97 = 1;
		int element_81 = 2;
		int element_5 = 3;
		int element_61 = 0;
		int element_105 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_64 = 0;
		AANode right_83 = null;
		int level_84 = 0;
		AANode right_99 = null;
		int level_100 = 0;
		AANode left_106 = null;
		AANode right_107 = null;
		int level_108 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		right_63.element = element_81;
		right_63.left = left_82;
		right_63.right = right_83;
		right_63.level = level_84;
		left_82.element = element_97;
		left_82.left = left_98;
		left_82.right = right_99;
		left_82.level = level_100;
		left_98.element = element_105;
		left_98.left = left_106;
		left_98.right = right_107;
		left_98.level = level_108;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed83() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_63 = new AANode();
		AANode left_82 = new AANode();
		AANode left_98 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = obj.nullNode;
		int element_97 = 0;
		int element_81 = 1;
		int element_5 = 2;
		int element_61 = -1;
		int element_105 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_64 = 0;
		AANode right_83 = null;
		int level_84 = 0;
		AANode right_99 = null;
		int level_100 = 0;
		AANode left_106 = null;
		AANode right_107 = null;
		int level_108 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		right_63.element = element_81;
		right_63.left = left_82;
		right_63.right = right_83;
		right_63.level = level_84;
		left_82.element = element_97;
		left_82.left = left_98;
		left_82.right = right_99;
		left_82.level = level_100;
		left_98.element = element_105;
		left_98.left = left_106;
		left_98.right = right_107;
		left_98.level = level_108;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed84() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_63 = new AANode();
		AANode left_82 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = obj.nullNode;
		int element_81 = 1;
		int element_97 = 0;
		int element_61 = 0;
		int level_4 = 0;
		int element_5 = 2;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_64 = 0;
		AANode right_83 = null;
		int level_84 = 0;
		AANode left_98 = null;
		AANode right_99 = null;
		int level_100 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		right_63.element = element_81;
		right_63.left = left_82;
		right_63.right = right_83;
		right_63.level = level_84;
		left_82.element = element_97;
		left_82.left = left_98;
		left_82.right = right_99;
		left_82.level = level_100;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed85() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_63 = new AANode();
		AANode left_82 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = obj.nullNode;
		int element_81 = 0;
		int element_97 = 0;
		int element_61 = -1;
		int level_4 = 0;
		int element_5 = 1;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_64 = 0;
		AANode right_83 = null;
		int level_84 = 0;
		AANode left_98 = null;
		AANode right_99 = null;
		int level_100 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		right_63.element = element_81;
		right_63.left = left_82;
		right_63.right = right_83;
		right_63.level = level_84;
		left_82.element = element_97;
		left_82.left = left_98;
		left_82.right = right_99;
		left_82.level = level_100;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed86() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_63 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = obj.nullNode;
		int element_81 = 0;
		int element_61 = 0;
		int level_4 = 0;
		int element_5 = 1;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_64 = 0;
		AANode left_82 = null;
		AANode right_83 = null;
		int level_84 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		right_63.element = element_81;
		right_63.left = left_82;
		right_63.right = right_83;
		right_63.level = level_84;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed87() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_63 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = obj.nullNode;
		int element_81 = 0;
		int element_61 = -1;
		int level_4 = 0;
		int element_5 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_64 = 0;
		AANode left_82 = null;
		AANode right_83 = null;
		int level_84 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		right_63.element = element_81;
		right_63.left = left_82;
		right_63.right = right_83;
		right_63.level = level_84;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed88() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = obj.root;
		int element_61 = 0;
		int level_4 = 0;
		int element_5 = 1;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed89() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = left_6;
		int element_61 = -1;
		int level_4 = 0;
		int element_5 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed90() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_62 = null;
		int element_61 = 0;
		int level_4 = 0;
		int element_5 = 1;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed91() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_114 = obj.nullNode;
		AANode right_115 = obj.nullNode;
		AANode right_63 = obj.root;
		int element_113 = -1;
		int element_61 = 0;
		int level_4 = 0;
		int element_5 = 1;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_64 = 0;
		int level_116 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed92() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_114 = obj.nullNode;
		AANode right_115 = obj.nullNode;
		AANode right_63 = left_6;
		int element_113 = -1;
		int element_61 = 0;
		int level_4 = 0;
		int element_5 = 1;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_64 = 0;
		int level_116 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed93() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_114 = obj.nullNode;
		AANode right_115 = obj.nullNode;
		AANode right_63 = left_62;
		int element_113 = -1;
		int element_61 = 0;
		int level_4 = 0;
		int element_5 = 1;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_64 = 0;
		int level_116 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed94() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_114 = obj.nullNode;
		AANode right_115 = obj.nullNode;
		AANode right_63 = null;
		int element_113 = -1;
		int element_61 = 0;
		int level_4 = 0;
		int element_5 = 1;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_64 = 0;
		int level_116 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed95() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode right_63 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_114 = obj.nullNode;
		AANode right_115 = obj.nullNode;
		int element_121 = 0;
		int element_5 = 1;
		int element_113 = -1;
		int element_61 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_64 = 0;
		int level_116 = 0;
		AANode left_122 = null;
		AANode right_123 = null;
		int level_124 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		right_63.element = element_121;
		right_63.left = left_122;
		right_63.right = right_123;
		right_63.level = level_124;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed96() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode right_63 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_114 = obj.nullNode;
		AANode right_115 = obj.nullNode;
		int element_121 = 1;
		int element_5 = 1;
		int element_113 = -1;
		int element_61 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_64 = 0;
		int level_116 = 0;
		AANode left_122 = null;
		AANode right_123 = null;
		int level_124 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		right_63.element = element_121;
		right_63.left = left_122;
		right_63.right = right_123;
		right_63.level = level_124;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed97() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_114 = obj.nullNode;
		AANode right_115 = obj.root;
		int element_113 = -1;
		int element_61 = 0;
		int level_4 = 0;
		int element_5 = 1;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		int level_116 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed98() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_114 = obj.nullNode;
		AANode right_115 = left_6;
		int element_113 = -1;
		int element_61 = 0;
		int level_4 = 0;
		int element_5 = 1;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		int level_116 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed99() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_114 = obj.nullNode;
		AANode right_115 = left_62;
		int element_113 = -1;
		int element_61 = 0;
		int level_4 = 0;
		int element_5 = 1;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		int level_116 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed100() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_114 = obj.nullNode;
		AANode right_115 = null;
		int element_113 = -1;
		int element_61 = 0;
		int level_4 = 0;
		int element_5 = 1;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		int level_116 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed101() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode right_115 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_114 = obj.nullNode;
		AANode left_130 = obj.root;
		int element_5 = 1;
		int element_113 = -2;
		int element_61 = 0;
		int element_129 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		int level_116 = 0;
		AANode right_131 = null;
		int level_132 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		right_115.element = element_129;
		right_115.left = left_130;
		right_115.right = right_131;
		right_115.level = level_132;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed102() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode right_115 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_114 = obj.nullNode;
		AANode left_130 = left_6;
		int element_5 = 1;
		int element_113 = -2;
		int element_61 = 0;
		int element_129 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		int level_116 = 0;
		AANode right_131 = null;
		int level_132 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		right_115.element = element_129;
		right_115.left = left_130;
		right_115.right = right_131;
		right_115.level = level_132;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed103() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode right_115 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_114 = obj.nullNode;
		AANode left_130 = left_62;
		int element_5 = 1;
		int element_113 = -2;
		int element_61 = 0;
		int element_129 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		int level_116 = 0;
		AANode right_131 = null;
		int level_132 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		right_115.element = element_129;
		right_115.left = left_130;
		right_115.right = right_131;
		right_115.level = level_132;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed104() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode right_115 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_114 = obj.nullNode;
		AANode left_130 = right_115;
		int element_5 = 1;
		int element_113 = -2;
		int element_61 = 0;
		int element_129 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		int level_116 = 0;
		AANode right_131 = null;
		int level_132 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		right_115.element = element_129;
		right_115.left = left_130;
		right_115.right = right_131;
		right_115.level = level_132;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed105() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode right_115 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_114 = obj.nullNode;
		AANode left_130 = null;
		int element_5 = 1;
		int element_113 = -2;
		int element_61 = 0;
		int element_129 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		int level_116 = 0;
		AANode right_131 = null;
		int level_132 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		right_115.element = element_129;
		right_115.left = left_130;
		right_115.right = right_131;
		right_115.level = level_132;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed106() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode right_115 = new AANode();
		AANode left_130 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_114 = obj.nullNode;
		int element_137 = 0;
		int element_5 = 3;
		int element_113 = 0;
		int element_61 = 2;
		int element_129 = 1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		int level_116 = 0;
		AANode right_131 = null;
		int level_132 = 0;
		AANode left_138 = null;
		AANode right_139 = null;
		int level_140 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		right_115.element = element_129;
		right_115.left = left_130;
		right_115.right = right_131;
		right_115.level = level_132;
		left_130.element = element_137;
		left_130.left = left_138;
		left_130.right = right_139;
		left_130.level = level_140;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed107() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode right_115 = new AANode();
		AANode left_130 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_114 = obj.nullNode;
		int element_137 = 0;
		int element_5 = 2;
		int element_113 = -1;
		int element_61 = 1;
		int element_129 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		int level_116 = 0;
		AANode right_131 = null;
		int level_132 = 0;
		AANode left_138 = null;
		AANode right_139 = null;
		int level_140 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		right_115.element = element_129;
		right_115.left = left_130;
		right_115.right = right_131;
		right_115.level = level_132;
		left_130.element = element_137;
		left_130.left = left_138;
		left_130.right = right_139;
		left_130.level = level_140;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed108() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode right_115 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_114 = obj.nullNode;
		int element_129 = -1;
		int element_113 = -1;
		int element_61 = 0;
		int level_4 = 0;
		int element_5 = 1;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		int level_116 = 0;
		AANode left_130 = null;
		AANode right_131 = null;
		int level_132 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		right_115.element = element_129;
		right_115.left = left_130;
		right_115.right = right_131;
		right_115.level = level_132;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed109() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode right_115 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_114 = obj.nullNode;
		int element_129 = 0;
		int element_113 = -1;
		int element_61 = 0;
		int level_4 = 0;
		int element_5 = 1;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		int level_116 = 0;
		AANode left_130 = null;
		AANode right_131 = null;
		int level_132 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		right_115.element = element_129;
		right_115.left = left_130;
		right_115.right = right_131;
		right_115.level = level_132;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed110() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_114 = obj.root;
		int element_113 = -1;
		int element_61 = 0;
		int level_4 = 0;
		int element_5 = 1;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		AANode right_115 = null;
		int level_116 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed111() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_114 = left_6;
		int element_113 = -1;
		int element_61 = 0;
		int level_4 = 0;
		int element_5 = 1;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		AANode right_115 = null;
		int level_116 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed112() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_114 = left_62;
		int element_113 = -1;
		int element_61 = 0;
		int level_4 = 0;
		int element_5 = 1;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		AANode right_115 = null;
		int level_116 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed113() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_114 = null;
		int element_113 = -1;
		int element_61 = 0;
		int level_4 = 0;
		int element_5 = 1;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		AANode right_115 = null;
		int level_116 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed114() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode left_114 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_146 = obj.nullNode;
		AANode right_147 = obj.root;
		int element_5 = 2;
		int element_113 = 0;
		int element_61 = 1;
		int element_145 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		AANode right_115 = null;
		int level_116 = 0;
		int level_148 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		left_114.element = element_145;
		left_114.left = left_146;
		left_114.right = right_147;
		left_114.level = level_148;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed115() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode left_114 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_146 = obj.nullNode;
		AANode right_147 = left_6;
		int element_5 = 2;
		int element_113 = 0;
		int element_61 = 1;
		int element_145 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		AANode right_115 = null;
		int level_116 = 0;
		int level_148 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		left_114.element = element_145;
		left_114.left = left_146;
		left_114.right = right_147;
		left_114.level = level_148;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed116() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode left_114 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_146 = obj.nullNode;
		AANode right_147 = left_62;
		int element_5 = 2;
		int element_113 = 0;
		int element_61 = 1;
		int element_145 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		AANode right_115 = null;
		int level_116 = 0;
		int level_148 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		left_114.element = element_145;
		left_114.left = left_146;
		left_114.right = right_147;
		left_114.level = level_148;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed117() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode left_114 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_146 = obj.nullNode;
		AANode right_147 = left_114;
		int element_5 = 2;
		int element_113 = 0;
		int element_61 = 1;
		int element_145 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		AANode right_115 = null;
		int level_116 = 0;
		int level_148 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		left_114.element = element_145;
		left_114.left = left_146;
		left_114.right = right_147;
		left_114.level = level_148;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed118() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode left_114 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_146 = obj.nullNode;
		AANode right_147 = null;
		int element_5 = 2;
		int element_113 = 0;
		int element_61 = 1;
		int element_145 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		AANode right_115 = null;
		int level_116 = 0;
		int level_148 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		left_114.element = element_145;
		left_114.left = left_146;
		left_114.right = right_147;
		left_114.level = level_148;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed119() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode left_114 = new AANode();
		AANode right_147 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_146 = obj.nullNode;
		int element_5 = 2;
		int element_113 = 0;
		int element_153 = -1;
		int element_61 = 1;
		int element_145 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		AANode right_115 = null;
		int level_116 = 0;
		int level_148 = 0;
		AANode left_154 = null;
		AANode right_155 = null;
		int level_156 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		left_114.element = element_145;
		left_114.left = left_146;
		left_114.right = right_147;
		left_114.level = level_148;
		right_147.element = element_153;
		right_147.left = left_154;
		right_147.right = right_155;
		right_147.level = level_156;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed120() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode left_114 = new AANode();
		AANode right_147 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_146 = obj.nullNode;
		int element_5 = 2;
		int element_113 = 0;
		int element_153 = 0;
		int element_61 = 1;
		int element_145 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		AANode right_115 = null;
		int level_116 = 0;
		int level_148 = 0;
		AANode left_154 = null;
		AANode right_155 = null;
		int level_156 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		left_114.element = element_145;
		left_114.left = left_146;
		left_114.right = right_147;
		left_114.level = level_148;
		right_147.element = element_153;
		right_147.left = left_154;
		right_147.right = right_155;
		right_147.level = level_156;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed121() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode left_114 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_146 = obj.root;
		int element_113 = -1;
		int element_61 = 0;
		int element_145 = -2;
		int level_4 = 0;
		int element_5 = 1;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		AANode right_115 = null;
		int level_116 = 0;
		AANode right_147 = null;
		int level_148 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		left_114.element = element_145;
		left_114.left = left_146;
		left_114.right = right_147;
		left_114.level = level_148;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed122() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode left_114 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_146 = left_6;
		int element_113 = -1;
		int element_61 = 0;
		int element_145 = -2;
		int level_4 = 0;
		int element_5 = 1;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		AANode right_115 = null;
		int level_116 = 0;
		AANode right_147 = null;
		int level_148 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		left_114.element = element_145;
		left_114.left = left_146;
		left_114.right = right_147;
		left_114.level = level_148;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed123() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode left_114 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_146 = left_62;
		int element_113 = 0;
		int element_61 = 1;
		int element_145 = -1;
		int level_4 = 0;
		int element_5 = 2;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		AANode right_115 = null;
		int level_116 = 0;
		AANode right_147 = null;
		int level_148 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		left_114.element = element_145;
		left_114.left = left_146;
		left_114.right = right_147;
		left_114.level = level_148;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed124() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode left_114 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_146 = left_114;
		int element_113 = 0;
		int element_61 = 1;
		int element_145 = -1;
		int level_4 = 0;
		int element_5 = 2;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		AANode right_115 = null;
		int level_116 = 0;
		AANode right_147 = null;
		int level_148 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		left_114.element = element_145;
		left_114.left = left_146;
		left_114.right = right_147;
		left_114.level = level_148;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed125() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode left_114 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_146 = null;
		int element_113 = 0;
		int element_61 = 1;
		int element_145 = -1;
		int level_4 = 0;
		int element_5 = 2;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		AANode right_115 = null;
		int level_116 = 0;
		AANode right_147 = null;
		int level_148 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		left_114.element = element_145;
		left_114.left = left_146;
		left_114.right = right_147;
		left_114.level = level_148;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed126() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode left_114 = new AANode();
		AANode left_146 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_162 = obj.root;
		int element_5 = 1;
		int element_113 = -1;
		int element_161 = -3;
		int element_61 = 0;
		int element_145 = -2;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		AANode right_115 = null;
		int level_116 = 0;
		AANode right_147 = null;
		int level_148 = 0;
		AANode right_163 = null;
		int level_164 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		left_114.element = element_145;
		left_114.left = left_146;
		left_114.right = right_147;
		left_114.level = level_148;
		left_146.element = element_161;
		left_146.left = left_162;
		left_146.right = right_163;
		left_146.level = level_164;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed127() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode left_114 = new AANode();
		AANode left_146 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_162 = left_6;
		int element_5 = 1;
		int element_113 = -1;
		int element_161 = -3;
		int element_61 = 0;
		int element_145 = -2;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		AANode right_115 = null;
		int level_116 = 0;
		AANode right_147 = null;
		int level_148 = 0;
		AANode right_163 = null;
		int level_164 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		left_114.element = element_145;
		left_114.left = left_146;
		left_114.right = right_147;
		left_114.level = level_148;
		left_146.element = element_161;
		left_146.left = left_162;
		left_146.right = right_163;
		left_146.level = level_164;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed128() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode left_114 = new AANode();
		AANode left_146 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_162 = left_62;
		int element_5 = 2;
		int element_113 = 0;
		int element_161 = -2;
		int element_61 = 1;
		int element_145 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		AANode right_115 = null;
		int level_116 = 0;
		AANode right_147 = null;
		int level_148 = 0;
		AANode right_163 = null;
		int level_164 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		left_114.element = element_145;
		left_114.left = left_146;
		left_114.right = right_147;
		left_114.level = level_148;
		left_146.element = element_161;
		left_146.left = left_162;
		left_146.right = right_163;
		left_146.level = level_164;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed129() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode left_114 = new AANode();
		AANode left_146 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_162 = left_114;
		int element_5 = 3;
		int element_113 = 1;
		int element_161 = -1;
		int element_61 = 2;
		int element_145 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		AANode right_115 = null;
		int level_116 = 0;
		AANode right_147 = null;
		int level_148 = 0;
		AANode right_163 = null;
		int level_164 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		left_114.element = element_145;
		left_114.left = left_146;
		left_114.right = right_147;
		left_114.level = level_148;
		left_146.element = element_161;
		left_146.left = left_162;
		left_146.right = right_163;
		left_146.level = level_164;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed130() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode left_114 = new AANode();
		AANode left_146 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_162 = left_146;
		int element_5 = 3;
		int element_113 = 1;
		int element_161 = -1;
		int element_61 = 2;
		int element_145 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		AANode right_115 = null;
		int level_116 = 0;
		AANode right_147 = null;
		int level_148 = 0;
		AANode right_163 = null;
		int level_164 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		left_114.element = element_145;
		left_114.left = left_146;
		left_114.right = right_147;
		left_114.level = level_148;
		left_146.element = element_161;
		left_146.left = left_162;
		left_146.right = right_163;
		left_146.level = level_164;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed131() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode left_114 = new AANode();
		AANode left_146 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_162 = null;
		int element_5 = 3;
		int element_113 = 1;
		int element_161 = -1;
		int element_61 = 2;
		int element_145 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		AANode right_115 = null;
		int level_116 = 0;
		AANode right_147 = null;
		int level_148 = 0;
		AANode right_163 = null;
		int level_164 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		left_114.element = element_145;
		left_114.left = left_146;
		left_114.right = right_147;
		left_114.level = level_148;
		left_146.element = element_161;
		left_146.left = left_162;
		left_146.right = right_163;
		left_146.level = level_164;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed132() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode left_114 = new AANode();
		AANode left_146 = new AANode();
		AANode left_162 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		int element_5 = 4;
		int element_113 = 2;
		int element_161 = 0;
		int element_61 = 3;
		int element_169 = 0;
		int element_145 = 1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		AANode right_115 = null;
		int level_116 = 0;
		AANode right_147 = null;
		int level_148 = 0;
		AANode right_163 = null;
		int level_164 = 0;
		AANode left_170 = null;
		AANode right_171 = null;
		int level_172 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		left_114.element = element_145;
		left_114.left = left_146;
		left_114.right = right_147;
		left_114.level = level_148;
		left_146.element = element_161;
		left_146.left = left_162;
		left_146.right = right_163;
		left_146.level = level_164;
		left_162.element = element_169;
		left_162.left = left_170;
		left_162.right = right_171;
		left_162.level = level_172;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed133() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode left_114 = new AANode();
		AANode left_146 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		int element_5 = 3;
		int element_113 = 1;
		int element_161 = 0;
		int element_61 = 2;
		int element_145 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		AANode right_115 = null;
		int level_116 = 0;
		AANode right_147 = null;
		int level_148 = 0;
		AANode left_162 = null;
		AANode right_163 = null;
		int level_164 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		left_114.element = element_145;
		left_114.left = left_146;
		left_114.right = right_147;
		left_114.level = level_148;
		left_146.element = element_161;
		left_146.left = left_162;
		left_146.right = right_163;
		left_146.level = level_164;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed134() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode left_114 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		int element_113 = 0;
		int element_61 = 1;
		int element_145 = 0;
		int level_4 = 0;
		int element_5 = 2;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		AANode right_115 = null;
		int level_116 = 0;
		AANode left_146 = null;
		AANode right_147 = null;
		int level_148 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		left_114.element = element_145;
		left_114.left = left_146;
		left_114.right = right_147;
		left_114.level = level_148;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed135() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_62 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		int element_113 = 0;
		int element_61 = 0;
		int level_4 = 0;
		int element_5 = 1;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_63 = null;
		int level_64 = 0;
		AANode left_114 = null;
		AANode right_115 = null;
		int level_116 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		left_62.element = element_113;
		left_62.left = left_114;
		left_62.right = right_115;
		left_62.level = level_116;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed136() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		int element_61 = 0;
		int level_4 = 0;
		int element_5 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode left_62 = null;
		AANode right_63 = null;
		int level_64 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_61;
		left_6.left = left_62;
		left_6.right = right_63;
		left_6.level = level_64;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed137() throws Exception {
		AATree obj = new AATree();
		AANode left_2 = obj.nullNode;
		AANode right_3 = null;
		int level_4 = 0;
		obj.root = null;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed138() throws Exception {
		AATree obj = new AATree();
		AANode right_3 = new AANode();
		AANode left_2 = obj.nullNode;
		int level_4 = 0;
		obj.root = null;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_177 = 0;
		AANode left_178 = null;
		AANode right_179 = null;
		int level_180 = 0;
		right_3.element = element_177;
		right_3.left = left_178;
		right_3.right = right_179;
		right_3.level = level_180;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed139() throws Exception {
		AATree obj = new AATree();
		AANode left_2 = null;
		int level_4 = 0;
		obj.root = null;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_3 = null;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

	@Test
	public void test_wellFormed140() throws Exception {
		AATree obj = new AATree();
		AANode left_2 = new AANode();
		int level_4 = 0;
		obj.root = null;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_3 = null;
		int element_181 = 0;
		AANode left_182 = null;
		AANode right_183 = null;
		int level_184 = 0;
		left_2.element = element_181;
		left_2.left = left_182;
		left_2.right = right_183;
		left_2.level = level_184;
		assertTrue(Utilities.repOK(obj));
		//obj.wellFormed();
	}

}

