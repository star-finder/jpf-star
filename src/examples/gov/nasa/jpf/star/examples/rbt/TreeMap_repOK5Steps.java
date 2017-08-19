package gov.nasa.jpf.star.examples.rbt;

import gov.nasa.jpf.star.examples.rbt.TreeMap.Entry;
import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class TreeMap_repOK5Steps extends TestJPF {

	@Test
	public void test_repOK1() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = null;
		obj.size = 0;
		obj.modCount = 0;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK2() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry parent_5 = obj.root;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		Entry left_3 = null;
		Entry right_4 = null;
		boolean color_6 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK3() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry parent_5 = null;
		Entry right_4 = obj.root;
		Entry left_3 = obj.root;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK4() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry parent_5 = null;
		Entry right_4 = obj.root;
		Entry left_3 = null;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK5() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry left_3 = new Entry();
		Entry parent_5 = null;
		Entry right_4 = obj.root;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_7 = 0;
		Object value_8 = null;
		Entry left_9 = null;
		Entry right_10 = null;
		Entry parent_11 = null;
		boolean color_12 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		left_3.key = key_7;
		left_3.value = value_8;
		left_3.left = left_9;
		left_3.right = right_10;
		left_3.parent = parent_11;
		left_3.color = color_12;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK6() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry parent_5 = null;
		Entry right_4 = null;
		Entry left_3 = obj.root;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK7() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry parent_5 = null;
		Entry right_4 = null;
		Entry left_3 = null;
		boolean color_6 = false;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK8() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry parent_5 = null;
		Entry right_4 = null;
		Entry left_3 = null;
		boolean color_6 = true;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK9() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry left_3 = new Entry();
		Entry parent_5 = null;
		Entry right_4 = null;
		Entry parent_17 = left_3;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_13 = 0;
		Object value_14 = null;
		Entry left_15 = null;
		Entry right_16 = null;
		boolean color_18 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		left_3.key = key_13;
		left_3.value = value_14;
		left_3.left = left_15;
		left_3.right = right_16;
		left_3.parent = parent_17;
		left_3.color = color_18;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK10() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry left_3 = new Entry();
		Entry parent_5 = null;
		Entry right_4 = null;
		Entry parent_17 = null;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_13 = 0;
		Object value_14 = null;
		Entry left_15 = null;
		Entry right_16 = null;
		boolean color_18 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		left_3.key = key_13;
		left_3.value = value_14;
		left_3.left = left_15;
		left_3.right = right_16;
		left_3.parent = parent_17;
		left_3.color = color_18;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK11() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry left_3 = new Entry();
		Entry parent_17 = new Entry();
		Entry parent_5 = null;
		Entry right_4 = null;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_13 = 0;
		Object value_14 = null;
		Entry left_15 = null;
		Entry right_16 = null;
		boolean color_18 = false;
		int key_25 = 0;
		Object value_26 = null;
		Entry left_27 = null;
		Entry right_28 = null;
		Entry parent_29 = null;
		boolean color_30 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		left_3.key = key_13;
		left_3.value = value_14;
		left_3.left = left_15;
		left_3.right = right_16;
		left_3.parent = parent_17;
		left_3.color = color_18;
		parent_17.key = key_25;
		parent_17.value = value_26;
		parent_17.left = left_27;
		parent_17.right = right_28;
		parent_17.parent = parent_29;
		parent_17.color = color_30;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK12() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Entry parent_35 = right_4;
		Entry left_3 = obj.root;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_31 = 0;
		Object value_32 = null;
		Entry left_33 = null;
		Entry right_34 = null;
		boolean color_36 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_31;
		right_4.value = value_32;
		right_4.left = left_33;
		right_4.right = right_34;
		right_4.parent = parent_35;
		right_4.color = color_36;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK13() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Entry parent_35 = right_4;
		Entry left_3 = right_4;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_31 = 0;
		Object value_32 = null;
		Entry left_33 = null;
		Entry right_34 = null;
		boolean color_36 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_31;
		right_4.value = value_32;
		right_4.left = left_33;
		right_4.right = right_34;
		right_4.parent = parent_35;
		right_4.color = color_36;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK14() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Entry parent_35 = right_4;
		Entry left_3 = null;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_31 = 0;
		Object value_32 = null;
		Entry left_33 = null;
		Entry right_34 = null;
		boolean color_36 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_31;
		right_4.value = value_32;
		right_4.left = left_33;
		right_4.right = right_34;
		right_4.parent = parent_35;
		right_4.color = color_36;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK15() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry left_3 = new Entry();
		Entry parent_5 = null;
		Entry parent_35 = right_4;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_31 = 0;
		Object value_32 = null;
		Entry left_33 = null;
		Entry right_34 = null;
		boolean color_36 = false;
		int key_67 = 0;
		Object value_68 = null;
		Entry left_69 = null;
		Entry right_70 = null;
		Entry parent_71 = null;
		boolean color_72 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_31;
		right_4.value = value_32;
		right_4.left = left_33;
		right_4.right = right_34;
		right_4.parent = parent_35;
		right_4.color = color_36;
		left_3.key = key_67;
		left_3.value = value_68;
		left_3.left = left_69;
		left_3.right = right_70;
		left_3.parent = parent_71;
		left_3.color = color_72;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK16() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Entry parent_35 = null;
		Entry left_3 = obj.root;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_31 = 0;
		Object value_32 = null;
		Entry left_33 = null;
		Entry right_34 = null;
		boolean color_36 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_31;
		right_4.value = value_32;
		right_4.left = left_33;
		right_4.right = right_34;
		right_4.parent = parent_35;
		right_4.color = color_36;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK17() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Entry parent_35 = null;
		Entry left_3 = right_4;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_31 = 0;
		Object value_32 = null;
		Entry left_33 = null;
		Entry right_34 = null;
		boolean color_36 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_31;
		right_4.value = value_32;
		right_4.left = left_33;
		right_4.right = right_34;
		right_4.parent = parent_35;
		right_4.color = color_36;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK18() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Entry parent_35 = null;
		Entry left_3 = null;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_31 = 0;
		Object value_32 = null;
		Entry left_33 = null;
		Entry right_34 = null;
		boolean color_36 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_31;
		right_4.value = value_32;
		right_4.left = left_33;
		right_4.right = right_34;
		right_4.parent = parent_35;
		right_4.color = color_36;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK19() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry left_3 = new Entry();
		Entry parent_5 = null;
		Entry parent_35 = null;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_31 = 0;
		Object value_32 = null;
		Entry left_33 = null;
		Entry right_34 = null;
		boolean color_36 = false;
		int key_73 = 0;
		Object value_74 = null;
		Entry left_75 = null;
		Entry right_76 = null;
		Entry parent_77 = null;
		boolean color_78 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_31;
		right_4.value = value_32;
		right_4.left = left_33;
		right_4.right = right_34;
		right_4.parent = parent_35;
		right_4.color = color_36;
		left_3.key = key_73;
		left_3.value = value_74;
		left_3.left = left_75;
		left_3.right = right_76;
		left_3.parent = parent_77;
		left_3.color = color_78;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK20() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_35 = new Entry();
		Entry parent_5 = null;
		Entry left_3 = obj.root;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_31 = 0;
		Object value_32 = null;
		Entry left_33 = null;
		Entry right_34 = null;
		boolean color_36 = false;
		int key_79 = 0;
		Object value_80 = null;
		Entry left_81 = null;
		Entry right_82 = null;
		Entry parent_83 = null;
		boolean color_84 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_31;
		right_4.value = value_32;
		right_4.left = left_33;
		right_4.right = right_34;
		right_4.parent = parent_35;
		right_4.color = color_36;
		parent_35.key = key_79;
		parent_35.value = value_80;
		parent_35.left = left_81;
		parent_35.right = right_82;
		parent_35.parent = parent_83;
		parent_35.color = color_84;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK21() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_35 = new Entry();
		Entry parent_5 = null;
		Entry left_3 = right_4;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_31 = 0;
		Object value_32 = null;
		Entry left_33 = null;
		Entry right_34 = null;
		boolean color_36 = false;
		int key_79 = 0;
		Object value_80 = null;
		Entry left_81 = null;
		Entry right_82 = null;
		Entry parent_83 = null;
		boolean color_84 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_31;
		right_4.value = value_32;
		right_4.left = left_33;
		right_4.right = right_34;
		right_4.parent = parent_35;
		right_4.color = color_36;
		parent_35.key = key_79;
		parent_35.value = value_80;
		parent_35.left = left_81;
		parent_35.right = right_82;
		parent_35.parent = parent_83;
		parent_35.color = color_84;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK22() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_35 = new Entry();
		Entry parent_5 = null;
		Entry left_3 = parent_35;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_31 = 0;
		Object value_32 = null;
		Entry left_33 = null;
		Entry right_34 = null;
		boolean color_36 = false;
		int key_79 = 0;
		Object value_80 = null;
		Entry left_81 = null;
		Entry right_82 = null;
		Entry parent_83 = null;
		boolean color_84 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_31;
		right_4.value = value_32;
		right_4.left = left_33;
		right_4.right = right_34;
		right_4.parent = parent_35;
		right_4.color = color_36;
		parent_35.key = key_79;
		parent_35.value = value_80;
		parent_35.left = left_81;
		parent_35.right = right_82;
		parent_35.parent = parent_83;
		parent_35.color = color_84;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK23() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_35 = new Entry();
		Entry parent_5 = null;
		Entry left_3 = null;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_31 = 0;
		Object value_32 = null;
		Entry left_33 = null;
		Entry right_34 = null;
		boolean color_36 = false;
		int key_79 = 0;
		Object value_80 = null;
		Entry left_81 = null;
		Entry right_82 = null;
		Entry parent_83 = null;
		boolean color_84 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_31;
		right_4.value = value_32;
		right_4.left = left_33;
		right_4.right = right_34;
		right_4.parent = parent_35;
		right_4.color = color_36;
		parent_35.key = key_79;
		parent_35.value = value_80;
		parent_35.left = left_81;
		parent_35.right = right_82;
		parent_35.parent = parent_83;
		parent_35.color = color_84;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK24() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_35 = new Entry();
		Entry left_3 = new Entry();
		Entry parent_5 = null;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_31 = 0;
		Object value_32 = null;
		Entry left_33 = null;
		Entry right_34 = null;
		boolean color_36 = false;
		int key_79 = 0;
		Object value_80 = null;
		Entry left_81 = null;
		Entry right_82 = null;
		Entry parent_83 = null;
		boolean color_84 = false;
		int key_85 = 0;
		Object value_86 = null;
		Entry left_87 = null;
		Entry right_88 = null;
		Entry parent_89 = null;
		boolean color_90 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_31;
		right_4.value = value_32;
		right_4.left = left_33;
		right_4.right = right_34;
		right_4.parent = parent_35;
		right_4.color = color_36;
		parent_35.key = key_79;
		parent_35.value = value_80;
		parent_35.left = left_81;
		parent_35.right = right_82;
		parent_35.parent = parent_83;
		parent_35.color = color_84;
		left_3.key = key_85;
		left_3.value = value_86;
		left_3.left = left_87;
		left_3.right = right_88;
		left_3.parent = parent_89;
		left_3.color = color_90;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK25() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry parent_5 = new Entry();
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		Entry left_3 = null;
		Entry right_4 = null;
		boolean color_6 = false;
		int key_91 = 0;
		Object value_92 = null;
		Entry left_93 = null;
		Entry right_94 = null;
		Entry parent_95 = null;
		boolean color_96 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		parent_5.key = key_91;
		parent_5.value = value_92;
		parent_5.left = left_93;
		parent_5.right = right_94;
		parent_5.parent = parent_95;
		parent_5.color = color_96;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

}

