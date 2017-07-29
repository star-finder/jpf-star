package gov.nasa.jpf.star.examples.aatree;

import gov.nasa.jpf.star.examples.aatree.AATree.AANode;
import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class AATree_wellFormed1 extends TestJPF {

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
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		obj.root = obj.nullNode;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed4() throws Exception {
		AATree obj = new AATree();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		obj.root = left_2;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed5() throws Exception {
		AATree obj = new AATree();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		obj.root = right_3;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed6() throws Exception {
		AATree obj = new AATree();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		obj.root = null;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed7() throws Exception {
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
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed8() throws Exception {
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
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed9() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode right_7 = left_2;
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
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed10() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode right_7 = left_2;
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
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed11() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode right_7 = right_3;
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
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed12() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode right_7 = right_3;
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
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed13() throws Exception {
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
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed14() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode right_7 = left_6;
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
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed15() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = obj.nullNode;
		AANode right_7 = left_6;
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
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed16() throws Exception {
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
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed17() throws Exception {
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
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed18() throws Exception {
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
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed19() throws Exception {
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
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed20() throws Exception {
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
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed21() throws Exception {
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
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed22() throws Exception {
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
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed23() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = left_2;
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
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed24() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = left_2;
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
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed25() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = left_2;
		AANode right_7 = left_2;
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
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed26() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = left_2;
		AANode right_7 = left_2;
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
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed27() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = left_2;
		AANode right_7 = right_3;
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
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed28() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = left_2;
		AANode right_7 = right_3;
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
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed29() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = left_2;
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
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed30() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = left_2;
		AANode right_7 = left_6;
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
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed31() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = left_2;
		AANode right_7 = left_6;
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
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed32() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = left_2;
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
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed33() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = left_2;
		AANode left_38 = obj.root;
		int element_5 = -1;
		int element_37 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		AANode right_39 = null;
		int level_40 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_37;
		right_7.left = left_38;
		right_7.right = right_39;
		right_7.level = level_40;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed34() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = left_2;
		AANode left_38 = right_7;
		int element_5 = -1;
		int element_37 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		AANode right_39 = null;
		int level_40 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_37;
		right_7.left = left_38;
		right_7.right = right_39;
		right_7.level = level_40;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed35() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = left_2;
		AANode left_38 = null;
		int element_5 = -1;
		int element_37 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		AANode right_39 = null;
		int level_40 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_37;
		right_7.left = left_38;
		right_7.right = right_39;
		right_7.level = level_40;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed36() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_38 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = left_2;
		int element_5 = -1;
		int element_57 = -1;
		int element_37 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		AANode right_39 = null;
		int level_40 = 0;
		AANode left_58 = null;
		AANode right_59 = null;
		int level_60 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_37;
		right_7.left = left_38;
		right_7.right = right_39;
		right_7.level = level_40;
		left_38.element = element_57;
		left_38.left = left_58;
		left_38.right = right_59;
		left_38.level = level_60;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed37() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_38 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = left_2;
		int element_5 = -1;
		int element_57 = 0;
		int element_37 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		AANode right_39 = null;
		int level_40 = 0;
		AANode left_58 = null;
		AANode right_59 = null;
		int level_60 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_37;
		right_7.left = left_38;
		right_7.right = right_39;
		right_7.level = level_40;
		left_38.element = element_57;
		left_38.left = left_58;
		left_38.right = right_59;
		left_38.level = level_60;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed38() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = left_2;
		int element_5 = 0;
		int element_37 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		AANode left_38 = null;
		AANode right_39 = null;
		int level_40 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_37;
		right_7.left = left_38;
		right_7.right = right_39;
		right_7.level = level_40;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed39() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = right_3;
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
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed40() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = right_3;
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
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed41() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = right_3;
		AANode right_7 = left_2;
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
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed42() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = right_3;
		AANode right_7 = left_2;
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
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed43() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = right_3;
		AANode right_7 = right_3;
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
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed44() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = right_3;
		AANode right_7 = right_3;
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
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed45() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = right_3;
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
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed46() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = right_3;
		AANode right_7 = left_6;
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
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed47() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = right_3;
		AANode right_7 = left_6;
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
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed48() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = right_3;
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
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed49() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = right_3;
		AANode left_66 = obj.root;
		int element_5 = -1;
		int element_65 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		AANode right_67 = null;
		int level_68 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_65;
		right_7.left = left_66;
		right_7.right = right_67;
		right_7.level = level_68;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed50() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = right_3;
		AANode left_66 = right_7;
		int element_5 = -1;
		int element_65 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		AANode right_67 = null;
		int level_68 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_65;
		right_7.left = left_66;
		right_7.right = right_67;
		right_7.level = level_68;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed51() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = right_3;
		AANode left_66 = null;
		int element_5 = -1;
		int element_65 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		AANode right_67 = null;
		int level_68 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_65;
		right_7.left = left_66;
		right_7.right = right_67;
		right_7.level = level_68;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed52() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_66 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = right_3;
		int element_5 = -1;
		int element_85 = -1;
		int element_65 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		AANode right_67 = null;
		int level_68 = 0;
		AANode left_86 = null;
		AANode right_87 = null;
		int level_88 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_65;
		right_7.left = left_66;
		right_7.right = right_67;
		right_7.level = level_68;
		left_66.element = element_85;
		left_66.left = left_86;
		left_66.right = right_87;
		left_66.level = level_88;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed53() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_66 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = right_3;
		int element_5 = -1;
		int element_85 = 0;
		int element_65 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		AANode right_67 = null;
		int level_68 = 0;
		AANode left_86 = null;
		AANode right_87 = null;
		int level_88 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_65;
		right_7.left = left_66;
		right_7.right = right_67;
		right_7.level = level_68;
		left_66.element = element_85;
		left_66.left = left_86;
		left_66.right = right_87;
		left_66.level = level_88;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed54() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_7 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_6 = right_3;
		int element_5 = 0;
		int element_65 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_8 = 0;
		AANode left_66 = null;
		AANode right_67 = null;
		int level_68 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		right_7.element = element_65;
		right_7.left = left_66;
		right_7.right = right_67;
		right_7.level = level_68;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed55() throws Exception {
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
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed56() throws Exception {
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
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed57() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_94 = obj.nullNode;
		AANode right_95 = obj.root;
		int element_5 = 1;
		int level_4 = 0;
		int element_93 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_96 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_93;
		left_6.left = left_94;
		left_6.right = right_95;
		left_6.level = level_96;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed58() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_94 = obj.nullNode;
		AANode right_95 = left_6;
		int element_5 = 1;
		int level_4 = 0;
		int element_93 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_96 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_93;
		left_6.left = left_94;
		left_6.right = right_95;
		left_6.level = level_96;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed59() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_94 = obj.nullNode;
		AANode right_95 = null;
		int element_93 = -1;
		int level_4 = 0;
		int element_5 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_96 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_93;
		left_6.left = left_94;
		left_6.right = right_95;
		left_6.level = level_96;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed60() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_95 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_94 = obj.nullNode;
		int element_5 = 1;
		int element_113 = 0;
		int level_4 = 0;
		int element_93 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_96 = 0;
		AANode left_114 = null;
		AANode right_115 = null;
		int level_116 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_93;
		left_6.left = left_94;
		left_6.right = right_95;
		left_6.level = level_96;
		right_95.element = element_113;
		right_95.left = left_114;
		right_95.right = right_115;
		right_95.level = level_116;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed61() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_95 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_94 = obj.nullNode;
		int element_5 = 0;
		int element_113 = 0;
		int level_4 = 0;
		int element_93 = -1;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_96 = 0;
		AANode left_114 = null;
		AANode right_115 = null;
		int level_116 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_93;
		left_6.left = left_94;
		left_6.right = right_95;
		left_6.level = level_96;
		right_95.element = element_113;
		right_95.left = left_114;
		right_95.right = right_115;
		right_95.level = level_116;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed62() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_94 = left_2;
		AANode right_95 = obj.root;
		int element_5 = 1;
		int level_4 = 0;
		int element_93 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_96 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_93;
		left_6.left = left_94;
		left_6.right = right_95;
		left_6.level = level_96;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed63() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_94 = left_2;
		AANode right_95 = left_6;
		int element_5 = 1;
		int level_4 = 0;
		int element_93 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_96 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_93;
		left_6.left = left_94;
		left_6.right = right_95;
		left_6.level = level_96;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed64() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_94 = left_2;
		AANode right_95 = null;
		int element_93 = -1;
		int level_4 = 0;
		int element_5 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_96 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_93;
		left_6.left = left_94;
		left_6.right = right_95;
		left_6.level = level_96;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed65() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_95 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_94 = left_2;
		int element_5 = 1;
		int element_137 = 0;
		int level_4 = 0;
		int element_93 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_96 = 0;
		AANode left_138 = null;
		AANode right_139 = null;
		int level_140 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_93;
		left_6.left = left_94;
		left_6.right = right_95;
		left_6.level = level_96;
		right_95.element = element_137;
		right_95.left = left_138;
		right_95.right = right_139;
		right_95.level = level_140;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed66() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_95 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_94 = left_2;
		int element_5 = 0;
		int element_137 = 0;
		int level_4 = 0;
		int element_93 = -1;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_96 = 0;
		AANode left_138 = null;
		AANode right_139 = null;
		int level_140 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_93;
		left_6.left = left_94;
		left_6.right = right_95;
		left_6.level = level_96;
		right_95.element = element_137;
		right_95.left = left_138;
		right_95.right = right_139;
		right_95.level = level_140;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed67() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_94 = right_3;
		AANode right_95 = obj.root;
		int element_5 = 1;
		int level_4 = 0;
		int element_93 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_96 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_93;
		left_6.left = left_94;
		left_6.right = right_95;
		left_6.level = level_96;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed68() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_94 = right_3;
		AANode right_95 = left_6;
		int element_5 = 1;
		int level_4 = 0;
		int element_93 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_96 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_93;
		left_6.left = left_94;
		left_6.right = right_95;
		left_6.level = level_96;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed69() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_94 = right_3;
		AANode right_95 = null;
		int element_93 = -1;
		int level_4 = 0;
		int element_5 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_96 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_93;
		left_6.left = left_94;
		left_6.right = right_95;
		left_6.level = level_96;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed70() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_95 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_94 = right_3;
		int element_5 = 1;
		int element_161 = 0;
		int level_4 = 0;
		int element_93 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_96 = 0;
		AANode left_162 = null;
		AANode right_163 = null;
		int level_164 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_93;
		left_6.left = left_94;
		left_6.right = right_95;
		left_6.level = level_96;
		right_95.element = element_161;
		right_95.left = left_162;
		right_95.right = right_163;
		right_95.level = level_164;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed71() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode right_95 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_94 = right_3;
		int element_5 = 0;
		int element_161 = 0;
		int level_4 = 0;
		int element_93 = -1;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		int level_96 = 0;
		AANode left_162 = null;
		AANode right_163 = null;
		int level_164 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_93;
		left_6.left = left_94;
		left_6.right = right_95;
		left_6.level = level_96;
		right_95.element = element_161;
		right_95.left = left_162;
		right_95.right = right_163;
		right_95.level = level_164;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed72() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_94 = obj.root;
		int element_5 = 1;
		int level_4 = 0;
		int element_93 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_95 = null;
		int level_96 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_93;
		left_6.left = left_94;
		left_6.right = right_95;
		left_6.level = level_96;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed73() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_94 = left_6;
		int element_93 = -1;
		int level_4 = 0;
		int element_5 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_95 = null;
		int level_96 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_93;
		left_6.left = left_94;
		left_6.right = right_95;
		left_6.level = level_96;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed74() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_94 = null;
		int element_5 = 1;
		int level_4 = 0;
		int element_93 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_95 = null;
		int level_96 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_93;
		left_6.left = left_94;
		left_6.right = right_95;
		left_6.level = level_96;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed75() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_94 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_170 = obj.root;
		int element_5 = 1;
		int element_169 = -1;
		int level_4 = 0;
		int element_93 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_95 = null;
		int level_96 = 0;
		AANode right_171 = null;
		int level_172 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_93;
		left_6.left = left_94;
		left_6.right = right_95;
		left_6.level = level_96;
		left_94.element = element_169;
		left_94.left = left_170;
		left_94.right = right_171;
		left_94.level = level_172;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed76() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_94 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_170 = left_6;
		int element_5 = 1;
		int element_169 = -1;
		int level_4 = 0;
		int element_93 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_95 = null;
		int level_96 = 0;
		AANode right_171 = null;
		int level_172 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_93;
		left_6.left = left_94;
		left_6.right = right_95;
		left_6.level = level_96;
		left_94.element = element_169;
		left_94.left = left_170;
		left_94.right = right_171;
		left_94.level = level_172;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed77() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_94 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_170 = left_94;
		int element_5 = 1;
		int element_169 = -1;
		int level_4 = 0;
		int element_93 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_95 = null;
		int level_96 = 0;
		AANode right_171 = null;
		int level_172 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_93;
		left_6.left = left_94;
		left_6.right = right_95;
		left_6.level = level_96;
		left_94.element = element_169;
		left_94.left = left_170;
		left_94.right = right_171;
		left_94.level = level_172;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed78() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_94 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		AANode left_170 = null;
		int element_5 = 1;
		int element_169 = -1;
		int level_4 = 0;
		int element_93 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_95 = null;
		int level_96 = 0;
		AANode right_171 = null;
		int level_172 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_93;
		left_6.left = left_94;
		left_6.right = right_95;
		left_6.level = level_96;
		left_94.element = element_169;
		left_94.left = left_170;
		left_94.right = right_171;
		left_94.level = level_172;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed79() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_94 = new AANode();
		AANode left_170 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		int element_5 = 2;
		int element_169 = 0;
		int element_185 = 0;
		int level_4 = 0;
		int element_93 = 1;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_95 = null;
		int level_96 = 0;
		AANode right_171 = null;
		int level_172 = 0;
		AANode left_186 = null;
		AANode right_187 = null;
		int level_188 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_93;
		left_6.left = left_94;
		left_6.right = right_95;
		left_6.level = level_96;
		left_94.element = element_169;
		left_94.left = left_170;
		left_94.right = right_171;
		left_94.level = level_172;
		left_170.element = element_185;
		left_170.left = left_186;
		left_170.right = right_187;
		left_170.level = level_188;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed80() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_94 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		int element_93 = 0;
		int element_169 = 0;
		int level_4 = 0;
		int element_5 = 1;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode right_95 = null;
		int level_96 = 0;
		AANode left_170 = null;
		AANode right_171 = null;
		int level_172 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_93;
		left_6.left = left_94;
		left_6.right = right_95;
		left_6.level = level_96;
		left_94.element = element_169;
		left_94.left = left_170;
		left_94.right = right_171;
		left_94.level = level_172;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed81() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_6 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = obj.nullNode;
		int element_93 = 0;
		int level_4 = 0;
		int element_5 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_7 = null;
		int level_8 = 0;
		AANode left_94 = null;
		AANode right_95 = null;
		int level_96 = 0;
		obj.root.element = element_5;
		obj.root.left = left_6;
		obj.root.right = right_7;
		obj.root.level = level_8;
		left_6.element = element_93;
		left_6.left = left_94;
		left_6.right = right_95;
		left_6.level = level_96;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed82() throws Exception {
		AATree obj = new AATree();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		obj.root = obj.nullNode;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed83() throws Exception {
		AATree obj = new AATree();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		obj.root = left_2;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed84() throws Exception {
		AATree obj = new AATree();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		obj.root = right_3;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed85() throws Exception {
		AATree obj = new AATree();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		obj.root = null;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed86() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = obj.nullNode;
		AANode right_195 = obj.nullNode;
		int level_196 = 4;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_193 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed87() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = obj.nullNode;
		AANode right_195 = obj.nullNode;
		int level_196 = 1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_193 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed88() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = obj.nullNode;
		AANode right_195 = left_2;
		int level_196 = 4;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_193 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed89() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = obj.nullNode;
		AANode right_195 = left_2;
		int level_196 = 1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_193 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed90() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = obj.nullNode;
		AANode right_195 = right_3;
		int level_196 = 4;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_193 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed91() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = obj.nullNode;
		AANode right_195 = right_3;
		int level_196 = 1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_193 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed92() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = obj.nullNode;
		AANode right_195 = obj.root;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_193 = 0;
		int level_196 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed93() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = obj.nullNode;
		AANode right_195 = left_194;
		int level_196 = 4;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_193 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed94() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = obj.nullNode;
		AANode right_195 = left_194;
		int level_196 = 1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_193 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed95() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = obj.nullNode;
		AANode right_195 = null;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_193 = 0;
		int level_196 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed96() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_195 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = obj.nullNode;
		AANode left_198 = obj.root;
		int element_193 = -1;
		int element_197 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_196 = 0;
		AANode right_199 = null;
		int level_200 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		right_195.element = element_197;
		right_195.left = left_198;
		right_195.right = right_199;
		right_195.level = level_200;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed97() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_195 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = obj.nullNode;
		AANode left_198 = right_195;
		int element_193 = -1;
		int element_197 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_196 = 0;
		AANode right_199 = null;
		int level_200 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		right_195.element = element_197;
		right_195.left = left_198;
		right_195.right = right_199;
		right_195.level = level_200;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed98() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_195 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = obj.nullNode;
		AANode left_198 = null;
		int element_193 = -1;
		int element_197 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_196 = 0;
		AANode right_199 = null;
		int level_200 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		right_195.element = element_197;
		right_195.left = left_198;
		right_195.right = right_199;
		right_195.level = level_200;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed99() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_195 = new AANode();
		AANode left_198 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = obj.nullNode;
		int element_193 = -1;
		int element_217 = -1;
		int element_197 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_196 = 0;
		AANode right_199 = null;
		int level_200 = 0;
		AANode left_218 = null;
		AANode right_219 = null;
		int level_220 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		right_195.element = element_197;
		right_195.left = left_198;
		right_195.right = right_199;
		right_195.level = level_200;
		left_198.element = element_217;
		left_198.left = left_218;
		left_198.right = right_219;
		left_198.level = level_220;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed100() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_195 = new AANode();
		AANode left_198 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = obj.nullNode;
		int element_193 = -1;
		int element_217 = 0;
		int element_197 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_196 = 0;
		AANode right_199 = null;
		int level_200 = 0;
		AANode left_218 = null;
		AANode right_219 = null;
		int level_220 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		right_195.element = element_197;
		right_195.left = left_198;
		right_195.right = right_199;
		right_195.level = level_200;
		left_198.element = element_217;
		left_198.left = left_218;
		left_198.right = right_219;
		left_198.level = level_220;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed101() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_195 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = obj.nullNode;
		int element_193 = 0;
		int element_197 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_196 = 0;
		AANode left_198 = null;
		AANode right_199 = null;
		int level_200 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		right_195.element = element_197;
		right_195.left = left_198;
		right_195.right = right_199;
		right_195.level = level_200;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed102() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = left_2;
		AANode right_195 = obj.nullNode;
		int level_196 = 4;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_193 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed103() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = left_2;
		AANode right_195 = obj.nullNode;
		int level_196 = 1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_193 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed104() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = left_2;
		AANode right_195 = left_2;
		int level_196 = 4;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_193 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed105() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = left_2;
		AANode right_195 = left_2;
		int level_196 = 1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_193 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed106() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = left_2;
		AANode right_195 = right_3;
		int level_196 = 4;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_193 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed107() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = left_2;
		AANode right_195 = right_3;
		int level_196 = 1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_193 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed108() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = left_2;
		AANode right_195 = obj.root;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_193 = 0;
		int level_196 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed109() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = left_2;
		AANode right_195 = left_194;
		int level_196 = 4;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_193 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed110() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = left_2;
		AANode right_195 = left_194;
		int level_196 = 1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_193 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed111() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = left_2;
		AANode right_195 = null;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_193 = 0;
		int level_196 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed112() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_195 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = left_2;
		AANode left_226 = obj.root;
		int element_225 = 0;
		int element_193 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_196 = 0;
		AANode right_227 = null;
		int level_228 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		right_195.element = element_225;
		right_195.left = left_226;
		right_195.right = right_227;
		right_195.level = level_228;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed113() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_195 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = left_2;
		AANode left_226 = right_195;
		int element_225 = 0;
		int element_193 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_196 = 0;
		AANode right_227 = null;
		int level_228 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		right_195.element = element_225;
		right_195.left = left_226;
		right_195.right = right_227;
		right_195.level = level_228;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed114() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_195 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = left_2;
		AANode left_226 = null;
		int element_225 = 0;
		int element_193 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_196 = 0;
		AANode right_227 = null;
		int level_228 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		right_195.element = element_225;
		right_195.left = left_226;
		right_195.right = right_227;
		right_195.level = level_228;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed115() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_195 = new AANode();
		AANode left_226 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = left_2;
		int element_225 = 0;
		int element_193 = -1;
		int level_4 = 0;
		int element_245 = -1;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_196 = 0;
		AANode right_227 = null;
		int level_228 = 0;
		AANode left_246 = null;
		AANode right_247 = null;
		int level_248 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		right_195.element = element_225;
		right_195.left = left_226;
		right_195.right = right_227;
		right_195.level = level_228;
		left_226.element = element_245;
		left_226.left = left_246;
		left_226.right = right_247;
		left_226.level = level_248;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed116() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_195 = new AANode();
		AANode left_226 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = left_2;
		int element_225 = 0;
		int element_193 = -1;
		int level_4 = 0;
		int element_245 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_196 = 0;
		AANode right_227 = null;
		int level_228 = 0;
		AANode left_246 = null;
		AANode right_247 = null;
		int level_248 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		right_195.element = element_225;
		right_195.left = left_226;
		right_195.right = right_227;
		right_195.level = level_228;
		left_226.element = element_245;
		left_226.left = left_246;
		left_226.right = right_247;
		left_226.level = level_248;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed117() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_195 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = left_2;
		int element_193 = 0;
		int element_225 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_196 = 0;
		AANode left_226 = null;
		AANode right_227 = null;
		int level_228 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		right_195.element = element_225;
		right_195.left = left_226;
		right_195.right = right_227;
		right_195.level = level_228;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed118() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = right_3;
		AANode right_195 = obj.nullNode;
		int level_196 = 4;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_193 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed119() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = right_3;
		AANode right_195 = obj.nullNode;
		int level_196 = 1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_193 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed120() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = right_3;
		AANode right_195 = left_2;
		int level_196 = 4;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_193 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed121() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = right_3;
		AANode right_195 = left_2;
		int level_196 = 1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_193 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed122() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = right_3;
		AANode right_195 = right_3;
		int level_196 = 4;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_193 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed123() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = right_3;
		AANode right_195 = right_3;
		int level_196 = 1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_193 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed124() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = right_3;
		AANode right_195 = obj.root;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_193 = 0;
		int level_196 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed125() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = right_3;
		AANode right_195 = left_194;
		int level_196 = 4;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_193 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed126() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = right_3;
		AANode right_195 = left_194;
		int level_196 = 1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_193 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed127() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = right_3;
		AANode right_195 = null;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_193 = 0;
		int level_196 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed128() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_195 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = right_3;
		AANode left_254 = obj.root;
		int element_193 = -1;
		int element_253 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_196 = 0;
		AANode right_255 = null;
		int level_256 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		right_195.element = element_253;
		right_195.left = left_254;
		right_195.right = right_255;
		right_195.level = level_256;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed129() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_195 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = right_3;
		AANode left_254 = right_195;
		int element_193 = -1;
		int element_253 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_196 = 0;
		AANode right_255 = null;
		int level_256 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		right_195.element = element_253;
		right_195.left = left_254;
		right_195.right = right_255;
		right_195.level = level_256;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed130() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_195 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = right_3;
		AANode left_254 = null;
		int element_193 = -1;
		int element_253 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_196 = 0;
		AANode right_255 = null;
		int level_256 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		right_195.element = element_253;
		right_195.left = left_254;
		right_195.right = right_255;
		right_195.level = level_256;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed131() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_195 = new AANode();
		AANode left_254 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = right_3;
		int element_193 = -1;
		int element_253 = 0;
		int level_4 = 0;
		int element_273 = -1;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_196 = 0;
		AANode right_255 = null;
		int level_256 = 0;
		AANode left_274 = null;
		AANode right_275 = null;
		int level_276 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		right_195.element = element_253;
		right_195.left = left_254;
		right_195.right = right_255;
		right_195.level = level_256;
		left_254.element = element_273;
		left_254.left = left_274;
		left_254.right = right_275;
		left_254.level = level_276;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed132() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_195 = new AANode();
		AANode left_254 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = right_3;
		int element_193 = -1;
		int element_253 = 0;
		int level_4 = 0;
		int element_273 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_196 = 0;
		AANode right_255 = null;
		int level_256 = 0;
		AANode left_274 = null;
		AANode right_275 = null;
		int level_276 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		right_195.element = element_253;
		right_195.left = left_254;
		right_195.right = right_255;
		right_195.level = level_256;
		left_254.element = element_273;
		left_254.left = left_274;
		left_254.right = right_275;
		left_254.level = level_276;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed133() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode right_195 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = right_3;
		int element_193 = 0;
		int element_253 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int level_196 = 0;
		AANode left_254 = null;
		AANode right_255 = null;
		int level_256 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		right_195.element = element_253;
		right_195.left = left_254;
		right_195.right = right_255;
		right_195.level = level_256;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed134() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = obj.root;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_193 = 0;
		AANode right_195 = null;
		int level_196 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed135() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_194 = null;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_193 = 0;
		AANode right_195 = null;
		int level_196 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed136() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_194 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_282 = obj.nullNode;
		AANode right_283 = obj.root;
		int element_193 = 1;
		int element_281 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_195 = null;
		int level_196 = 0;
		int level_284 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		left_194.element = element_281;
		left_194.left = left_282;
		left_194.right = right_283;
		left_194.level = level_284;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed137() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_194 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_282 = obj.nullNode;
		AANode right_283 = left_194;
		int element_193 = 1;
		int element_281 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_195 = null;
		int level_196 = 0;
		int level_284 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		left_194.element = element_281;
		left_194.left = left_282;
		left_194.right = right_283;
		left_194.level = level_284;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed138() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_194 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_282 = obj.nullNode;
		AANode right_283 = null;
		int element_193 = 0;
		int element_281 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_195 = null;
		int level_196 = 0;
		int level_284 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		left_194.element = element_281;
		left_194.left = left_282;
		left_194.right = right_283;
		left_194.level = level_284;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed139() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_194 = new AANode();
		AANode right_283 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_282 = obj.nullNode;
		int element_193 = 1;
		int element_281 = 0;
		int level_4 = 0;
		int element_301 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_195 = null;
		int level_196 = 0;
		int level_284 = 0;
		AANode left_302 = null;
		AANode right_303 = null;
		int level_304 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		left_194.element = element_281;
		left_194.left = left_282;
		left_194.right = right_283;
		left_194.level = level_284;
		right_283.element = element_301;
		right_283.left = left_302;
		right_283.right = right_303;
		right_283.level = level_304;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed140() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_194 = new AANode();
		AANode right_283 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_282 = obj.nullNode;
		int element_193 = 0;
		int element_281 = -1;
		int level_4 = 0;
		int element_301 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_195 = null;
		int level_196 = 0;
		int level_284 = 0;
		AANode left_302 = null;
		AANode right_303 = null;
		int level_304 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		left_194.element = element_281;
		left_194.left = left_282;
		left_194.right = right_283;
		left_194.level = level_284;
		right_283.element = element_301;
		right_283.left = left_302;
		right_283.right = right_303;
		right_283.level = level_304;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed141() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_194 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_282 = left_2;
		AANode right_283 = obj.root;
		int element_193 = 1;
		int element_281 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_195 = null;
		int level_196 = 0;
		int level_284 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		left_194.element = element_281;
		left_194.left = left_282;
		left_194.right = right_283;
		left_194.level = level_284;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed142() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_194 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_282 = left_2;
		AANode right_283 = left_194;
		int element_193 = 1;
		int element_281 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_195 = null;
		int level_196 = 0;
		int level_284 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		left_194.element = element_281;
		left_194.left = left_282;
		left_194.right = right_283;
		left_194.level = level_284;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed143() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_194 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_282 = left_2;
		AANode right_283 = null;
		int element_193 = 0;
		int element_281 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_195 = null;
		int level_196 = 0;
		int level_284 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		left_194.element = element_281;
		left_194.left = left_282;
		left_194.right = right_283;
		left_194.level = level_284;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed144() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_194 = new AANode();
		AANode right_283 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_282 = left_2;
		int element_193 = 1;
		int element_281 = 0;
		int level_4 = 0;
		int element_325 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_195 = null;
		int level_196 = 0;
		int level_284 = 0;
		AANode left_326 = null;
		AANode right_327 = null;
		int level_328 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		left_194.element = element_281;
		left_194.left = left_282;
		left_194.right = right_283;
		left_194.level = level_284;
		right_283.element = element_325;
		right_283.left = left_326;
		right_283.right = right_327;
		right_283.level = level_328;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed145() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_194 = new AANode();
		AANode right_283 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_282 = left_2;
		int element_193 = 0;
		int element_281 = -1;
		int level_4 = 0;
		int element_325 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_195 = null;
		int level_196 = 0;
		int level_284 = 0;
		AANode left_326 = null;
		AANode right_327 = null;
		int level_328 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		left_194.element = element_281;
		left_194.left = left_282;
		left_194.right = right_283;
		left_194.level = level_284;
		right_283.element = element_325;
		right_283.left = left_326;
		right_283.right = right_327;
		right_283.level = level_328;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed146() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_194 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_282 = right_3;
		AANode right_283 = obj.root;
		int element_193 = 1;
		int element_281 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_195 = null;
		int level_196 = 0;
		int level_284 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		left_194.element = element_281;
		left_194.left = left_282;
		left_194.right = right_283;
		left_194.level = level_284;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed147() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_194 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_282 = right_3;
		AANode right_283 = left_194;
		int element_193 = 1;
		int element_281 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_195 = null;
		int level_196 = 0;
		int level_284 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		left_194.element = element_281;
		left_194.left = left_282;
		left_194.right = right_283;
		left_194.level = level_284;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed148() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_194 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_282 = right_3;
		AANode right_283 = null;
		int element_193 = 0;
		int element_281 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_195 = null;
		int level_196 = 0;
		int level_284 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		left_194.element = element_281;
		left_194.left = left_282;
		left_194.right = right_283;
		left_194.level = level_284;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed149() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_194 = new AANode();
		AANode right_283 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_282 = right_3;
		int element_193 = 1;
		int element_281 = 0;
		int element_349 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_195 = null;
		int level_196 = 0;
		int level_284 = 0;
		AANode left_350 = null;
		AANode right_351 = null;
		int level_352 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		left_194.element = element_281;
		left_194.left = left_282;
		left_194.right = right_283;
		left_194.level = level_284;
		right_283.element = element_349;
		right_283.left = left_350;
		right_283.right = right_351;
		right_283.level = level_352;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed150() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_194 = new AANode();
		AANode right_283 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_282 = right_3;
		int element_193 = 0;
		int element_281 = -1;
		int element_349 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_195 = null;
		int level_196 = 0;
		int level_284 = 0;
		AANode left_350 = null;
		AANode right_351 = null;
		int level_352 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		left_194.element = element_281;
		left_194.left = left_282;
		left_194.right = right_283;
		left_194.level = level_284;
		right_283.element = element_349;
		right_283.left = left_350;
		right_283.right = right_351;
		right_283.level = level_352;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed151() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_194 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_282 = obj.root;
		int element_193 = 1;
		int element_281 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_195 = null;
		int level_196 = 0;
		AANode right_283 = null;
		int level_284 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		left_194.element = element_281;
		left_194.left = left_282;
		left_194.right = right_283;
		left_194.level = level_284;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed152() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_194 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_282 = left_194;
		int element_193 = 0;
		int element_281 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_195 = null;
		int level_196 = 0;
		AANode right_283 = null;
		int level_284 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		left_194.element = element_281;
		left_194.left = left_282;
		left_194.right = right_283;
		left_194.level = level_284;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed153() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_194 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_282 = null;
		int element_193 = 1;
		int element_281 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_195 = null;
		int level_196 = 0;
		AANode right_283 = null;
		int level_284 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		left_194.element = element_281;
		left_194.left = left_282;
		left_194.right = right_283;
		left_194.level = level_284;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed154() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_194 = new AANode();
		AANode left_282 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_358 = obj.root;
		int element_193 = 1;
		int element_281 = 0;
		int element_357 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_195 = null;
		int level_196 = 0;
		AANode right_283 = null;
		int level_284 = 0;
		AANode right_359 = null;
		int level_360 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		left_194.element = element_281;
		left_194.left = left_282;
		left_194.right = right_283;
		left_194.level = level_284;
		left_282.element = element_357;
		left_282.left = left_358;
		left_282.right = right_359;
		left_282.level = level_360;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed155() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_194 = new AANode();
		AANode left_282 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_358 = left_194;
		int element_193 = 1;
		int element_281 = 0;
		int element_357 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_195 = null;
		int level_196 = 0;
		AANode right_283 = null;
		int level_284 = 0;
		AANode right_359 = null;
		int level_360 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		left_194.element = element_281;
		left_194.left = left_282;
		left_194.right = right_283;
		left_194.level = level_284;
		left_282.element = element_357;
		left_282.left = left_358;
		left_282.right = right_359;
		left_282.level = level_360;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed156() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_194 = new AANode();
		AANode left_282 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_358 = left_282;
		int element_193 = 1;
		int element_281 = 0;
		int element_357 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_195 = null;
		int level_196 = 0;
		AANode right_283 = null;
		int level_284 = 0;
		AANode right_359 = null;
		int level_360 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		left_194.element = element_281;
		left_194.left = left_282;
		left_194.right = right_283;
		left_194.level = level_284;
		left_282.element = element_357;
		left_282.left = left_358;
		left_282.right = right_359;
		left_282.level = level_360;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed157() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_194 = new AANode();
		AANode left_282 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		AANode left_358 = null;
		int element_193 = 1;
		int element_281 = 0;
		int element_357 = -1;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_195 = null;
		int level_196 = 0;
		AANode right_283 = null;
		int level_284 = 0;
		AANode right_359 = null;
		int level_360 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		left_194.element = element_281;
		left_194.left = left_282;
		left_194.right = right_283;
		left_194.level = level_284;
		left_282.element = element_357;
		left_282.left = left_358;
		left_282.right = right_359;
		left_282.level = level_360;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed158() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_194 = new AANode();
		AANode left_282 = new AANode();
		AANode left_358 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		int element_193 = 2;
		int element_373 = 0;
		int element_281 = 1;
		int element_357 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_195 = null;
		int level_196 = 0;
		AANode right_283 = null;
		int level_284 = 0;
		AANode right_359 = null;
		int level_360 = 0;
		AANode left_374 = null;
		AANode right_375 = null;
		int level_376 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		left_194.element = element_281;
		left_194.left = left_282;
		left_194.right = right_283;
		left_194.level = level_284;
		left_282.element = element_357;
		left_282.left = left_358;
		left_282.right = right_359;
		left_282.level = level_360;
		left_358.element = element_373;
		left_358.left = left_374;
		left_358.right = right_375;
		left_358.level = level_376;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed159() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_194 = new AANode();
		AANode left_282 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		int element_193 = 1;
		int element_281 = 0;
		int element_357 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_195 = null;
		int level_196 = 0;
		AANode right_283 = null;
		int level_284 = 0;
		AANode left_358 = null;
		AANode right_359 = null;
		int level_360 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		left_194.element = element_281;
		left_194.left = left_282;
		left_194.right = right_283;
		left_194.level = level_284;
		left_282.element = element_357;
		left_282.left = left_358;
		left_282.right = right_359;
		left_282.level = level_360;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed160() throws Exception {
		AATree obj = new AATree();
		obj.root = new AANode();
		AANode left_194 = new AANode();
		AANode left_2 = obj.nullNode;
		AANode right_3 = left_2;
		int element_193 = 0;
		int element_281 = 0;
		int level_4 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_195 = null;
		int level_196 = 0;
		AANode left_282 = null;
		AANode right_283 = null;
		int level_284 = 0;
		obj.root.element = element_193;
		obj.root.left = left_194;
		obj.root.right = right_195;
		obj.root.level = level_196;
		left_194.element = element_281;
		left_194.left = left_282;
		left_194.right = right_283;
		left_194.level = level_284;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed161() throws Exception {
		AATree obj = new AATree();
		AANode left_2 = obj.nullNode;
		AANode right_3 = null;
		int level_4 = 0;
		obj.root = null;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed162() throws Exception {
		AATree obj = new AATree();
		AANode right_3 = new AANode();
		AANode left_2 = obj.nullNode;
		int level_4 = 0;
		obj.root = null;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		int element_381 = 0;
		AANode left_382 = null;
		AANode right_383 = null;
		int level_384 = 0;
		right_3.element = element_381;
		right_3.left = left_382;
		right_3.right = right_383;
		right_3.level = level_384;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

	@Test
	public void test_wellFormed163() throws Exception {
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
	public void test_wellFormed164() throws Exception {
		AATree obj = new AATree();
		AANode left_2 = new AANode();
		int level_4 = 0;
		obj.root = null;
		obj.deletedNode = null;
		obj.lastNode = null;
		int element_1 = 0;
		AANode right_3 = null;
		int element_385 = 0;
		AANode left_386 = null;
		AANode right_387 = null;
		int level_388 = 0;
		left_2.element = element_385;
		left_2.left = left_386;
		left_2.right = right_387;
		left_2.level = level_388;
		System.out.println(Utilities.repOK(obj));
		obj.wellFormed();
	}

}

