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
		Entry left_3 = parent_5;
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
		Entry parent_5 = null;
		Entry right_4 = obj.root;
		Entry left_3 = right_4;
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
	public void test_repOK6() throws Exception {
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
	public void test_repOK7() throws Exception {
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
	public void test_repOK8() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry parent_5 = null;
		Entry right_4 = parent_5;
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
	public void test_repOK9() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry parent_5 = null;
		Entry right_4 = parent_5;
		Entry left_3 = parent_5;
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
	public void test_repOK10() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry parent_5 = null;
		Entry right_4 = parent_5;
		Entry left_3 = parent_5;
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
	public void test_repOK11() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry parent_5 = null;
		Entry right_4 = parent_5;
		Entry left_3 = right_4;
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
	public void test_repOK12() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry parent_5 = null;
		Entry right_4 = parent_5;
		Entry left_3 = right_4;
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
	public void test_repOK13() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry parent_5 = null;
		Entry right_4 = parent_5;
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
	public void test_repOK14() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry parent_5 = null;
		Entry right_4 = parent_5;
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
	public void test_repOK15() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry left_3 = new Entry();
		Entry parent_5 = null;
		Entry right_4 = parent_5;
		Entry parent_17 = parent_5;
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
	public void test_repOK16() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry left_3 = new Entry();
		Entry parent_5 = null;
		Entry right_4 = parent_5;
		Entry parent_17 = right_4;
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
	public void test_repOK17() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry left_3 = new Entry();
		Entry parent_5 = null;
		Entry right_4 = parent_5;
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
	public void test_repOK18() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry left_3 = new Entry();
		Entry parent_5 = null;
		Entry right_4 = parent_5;
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
	public void test_repOK19() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry left_3 = new Entry();
		Entry parent_17 = new Entry();
		Entry parent_5 = null;
		Entry right_4 = parent_5;
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
	public void test_repOK20() throws Exception {
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
	public void test_repOK21() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry parent_5 = null;
		Entry right_4 = null;
		Entry left_3 = parent_5;
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
	public void test_repOK22() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry parent_5 = null;
		Entry right_4 = null;
		Entry left_3 = parent_5;
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
	public void test_repOK23() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry parent_5 = null;
		Entry right_4 = null;
		Entry left_3 = right_4;
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
	public void test_repOK24() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry parent_5 = null;
		Entry right_4 = null;
		Entry left_3 = right_4;
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
	public void test_repOK25() throws Exception {
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
	public void test_repOK26() throws Exception {
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
	public void test_repOK27() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry left_3 = new Entry();
		Entry parent_5 = null;
		Entry right_4 = null;
		Entry parent_35 = parent_5;
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
		left_3.key = key_31;
		left_3.value = value_32;
		left_3.left = left_33;
		left_3.right = right_34;
		left_3.parent = parent_35;
		left_3.color = color_36;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK28() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry left_3 = new Entry();
		Entry parent_5 = null;
		Entry right_4 = null;
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
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		left_3.key = key_31;
		left_3.value = value_32;
		left_3.left = left_33;
		left_3.right = right_34;
		left_3.parent = parent_35;
		left_3.color = color_36;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK29() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry left_3 = new Entry();
		Entry parent_5 = null;
		Entry right_4 = null;
		Entry parent_35 = left_3;
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
		left_3.key = key_31;
		left_3.value = value_32;
		left_3.left = left_33;
		left_3.right = right_34;
		left_3.parent = parent_35;
		left_3.color = color_36;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK30() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry left_3 = new Entry();
		Entry parent_5 = null;
		Entry right_4 = null;
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
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		left_3.key = key_31;
		left_3.value = value_32;
		left_3.left = left_33;
		left_3.right = right_34;
		left_3.parent = parent_35;
		left_3.color = color_36;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK31() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry left_3 = new Entry();
		Entry parent_35 = new Entry();
		Entry parent_5 = null;
		Entry right_4 = null;
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
		int key_43 = 0;
		Object value_44 = null;
		Entry left_45 = null;
		Entry right_46 = null;
		Entry parent_47 = null;
		boolean color_48 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		left_3.key = key_31;
		left_3.value = value_32;
		left_3.left = left_33;
		left_3.right = right_34;
		left_3.parent = parent_35;
		left_3.color = color_36;
		parent_35.key = key_43;
		parent_35.value = value_44;
		parent_35.left = left_45;
		parent_35.right = right_46;
		parent_35.parent = parent_47;
		parent_35.color = color_48;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK32() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Entry parent_53 = parent_5;
		Entry left_3 = obj.root;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_49 = 0;
		Object value_50 = null;
		Entry left_51 = null;
		Entry right_52 = null;
		boolean color_54 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_49;
		right_4.value = value_50;
		right_4.left = left_51;
		right_4.right = right_52;
		right_4.parent = parent_53;
		right_4.color = color_54;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK33() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Entry parent_53 = parent_5;
		Entry left_3 = parent_5;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_49 = 0;
		Object value_50 = null;
		Entry left_51 = null;
		Entry right_52 = null;
		boolean color_54 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_49;
		right_4.value = value_50;
		right_4.left = left_51;
		right_4.right = right_52;
		right_4.parent = parent_53;
		right_4.color = color_54;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK34() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Entry parent_53 = parent_5;
		Entry left_3 = right_4;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_49 = 0;
		Object value_50 = null;
		Entry left_51 = null;
		Entry right_52 = null;
		boolean color_54 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_49;
		right_4.value = value_50;
		right_4.left = left_51;
		right_4.right = right_52;
		right_4.parent = parent_53;
		right_4.color = color_54;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK35() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Entry parent_53 = parent_5;
		Entry left_3 = parent_53;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_49 = 0;
		Object value_50 = null;
		Entry left_51 = null;
		Entry right_52 = null;
		boolean color_54 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_49;
		right_4.value = value_50;
		right_4.left = left_51;
		right_4.right = right_52;
		right_4.parent = parent_53;
		right_4.color = color_54;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK36() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Entry parent_53 = parent_5;
		Entry left_3 = null;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_49 = 0;
		Object value_50 = null;
		Entry left_51 = null;
		Entry right_52 = null;
		boolean color_54 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_49;
		right_4.value = value_50;
		right_4.left = left_51;
		right_4.right = right_52;
		right_4.parent = parent_53;
		right_4.color = color_54;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK37() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry left_3 = new Entry();
		Entry parent_5 = null;
		Entry parent_53 = parent_5;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_49 = 0;
		Object value_50 = null;
		Entry left_51 = null;
		Entry right_52 = null;
		boolean color_54 = false;
		int key_97 = 0;
		Object value_98 = null;
		Entry left_99 = null;
		Entry right_100 = null;
		Entry parent_101 = null;
		boolean color_102 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_49;
		right_4.value = value_50;
		right_4.left = left_51;
		right_4.right = right_52;
		right_4.parent = parent_53;
		right_4.color = color_54;
		left_3.key = key_97;
		left_3.value = value_98;
		left_3.left = left_99;
		left_3.right = right_100;
		left_3.parent = parent_101;
		left_3.color = color_102;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK38() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Entry parent_53 = right_4;
		Entry left_3 = obj.root;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_49 = 0;
		Object value_50 = null;
		Entry left_51 = null;
		Entry right_52 = null;
		boolean color_54 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_49;
		right_4.value = value_50;
		right_4.left = left_51;
		right_4.right = right_52;
		right_4.parent = parent_53;
		right_4.color = color_54;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK39() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Entry parent_53 = right_4;
		Entry left_3 = parent_5;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_49 = 0;
		Object value_50 = null;
		Entry left_51 = null;
		Entry right_52 = null;
		boolean color_54 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_49;
		right_4.value = value_50;
		right_4.left = left_51;
		right_4.right = right_52;
		right_4.parent = parent_53;
		right_4.color = color_54;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK40() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Entry parent_53 = right_4;
		Entry left_3 = right_4;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_49 = 0;
		Object value_50 = null;
		Entry left_51 = null;
		Entry right_52 = null;
		boolean color_54 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_49;
		right_4.value = value_50;
		right_4.left = left_51;
		right_4.right = right_52;
		right_4.parent = parent_53;
		right_4.color = color_54;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK41() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Entry parent_53 = right_4;
		Entry left_3 = parent_53;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_49 = 0;
		Object value_50 = null;
		Entry left_51 = null;
		Entry right_52 = null;
		boolean color_54 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_49;
		right_4.value = value_50;
		right_4.left = left_51;
		right_4.right = right_52;
		right_4.parent = parent_53;
		right_4.color = color_54;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK42() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Entry parent_53 = right_4;
		Entry left_3 = null;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_49 = 0;
		Object value_50 = null;
		Entry left_51 = null;
		Entry right_52 = null;
		boolean color_54 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_49;
		right_4.value = value_50;
		right_4.left = left_51;
		right_4.right = right_52;
		right_4.parent = parent_53;
		right_4.color = color_54;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK43() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry left_3 = new Entry();
		Entry parent_5 = null;
		Entry parent_53 = right_4;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_49 = 0;
		Object value_50 = null;
		Entry left_51 = null;
		Entry right_52 = null;
		boolean color_54 = false;
		int key_103 = 0;
		Object value_104 = null;
		Entry left_105 = null;
		Entry right_106 = null;
		Entry parent_107 = null;
		boolean color_108 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_49;
		right_4.value = value_50;
		right_4.left = left_51;
		right_4.right = right_52;
		right_4.parent = parent_53;
		right_4.color = color_54;
		left_3.key = key_103;
		left_3.value = value_104;
		left_3.left = left_105;
		left_3.right = right_106;
		left_3.parent = parent_107;
		left_3.color = color_108;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK44() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Entry parent_53 = null;
		Entry left_3 = obj.root;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_49 = 0;
		Object value_50 = null;
		Entry left_51 = null;
		Entry right_52 = null;
		boolean color_54 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_49;
		right_4.value = value_50;
		right_4.left = left_51;
		right_4.right = right_52;
		right_4.parent = parent_53;
		right_4.color = color_54;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK45() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Entry parent_53 = null;
		Entry left_3 = parent_5;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_49 = 0;
		Object value_50 = null;
		Entry left_51 = null;
		Entry right_52 = null;
		boolean color_54 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_49;
		right_4.value = value_50;
		right_4.left = left_51;
		right_4.right = right_52;
		right_4.parent = parent_53;
		right_4.color = color_54;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK46() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Entry parent_53 = null;
		Entry left_3 = right_4;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_49 = 0;
		Object value_50 = null;
		Entry left_51 = null;
		Entry right_52 = null;
		boolean color_54 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_49;
		right_4.value = value_50;
		right_4.left = left_51;
		right_4.right = right_52;
		right_4.parent = parent_53;
		right_4.color = color_54;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK47() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Entry parent_53 = null;
		Entry left_3 = parent_53;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_49 = 0;
		Object value_50 = null;
		Entry left_51 = null;
		Entry right_52 = null;
		boolean color_54 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_49;
		right_4.value = value_50;
		right_4.left = left_51;
		right_4.right = right_52;
		right_4.parent = parent_53;
		right_4.color = color_54;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK48() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Entry parent_53 = null;
		Entry left_3 = null;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_49 = 0;
		Object value_50 = null;
		Entry left_51 = null;
		Entry right_52 = null;
		boolean color_54 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_49;
		right_4.value = value_50;
		right_4.left = left_51;
		right_4.right = right_52;
		right_4.parent = parent_53;
		right_4.color = color_54;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK49() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry left_3 = new Entry();
		Entry parent_5 = null;
		Entry parent_53 = null;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_49 = 0;
		Object value_50 = null;
		Entry left_51 = null;
		Entry right_52 = null;
		boolean color_54 = false;
		int key_109 = 0;
		Object value_110 = null;
		Entry left_111 = null;
		Entry right_112 = null;
		Entry parent_113 = null;
		boolean color_114 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_49;
		right_4.value = value_50;
		right_4.left = left_51;
		right_4.right = right_52;
		right_4.parent = parent_53;
		right_4.color = color_54;
		left_3.key = key_109;
		left_3.value = value_110;
		left_3.left = left_111;
		left_3.right = right_112;
		left_3.parent = parent_113;
		left_3.color = color_114;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK50() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_53 = new Entry();
		Entry parent_5 = null;
		Entry left_3 = obj.root;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_49 = 0;
		Object value_50 = null;
		Entry left_51 = null;
		Entry right_52 = null;
		boolean color_54 = false;
		int key_115 = 0;
		Object value_116 = null;
		Entry left_117 = null;
		Entry right_118 = null;
		Entry parent_119 = null;
		boolean color_120 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_49;
		right_4.value = value_50;
		right_4.left = left_51;
		right_4.right = right_52;
		right_4.parent = parent_53;
		right_4.color = color_54;
		parent_53.key = key_115;
		parent_53.value = value_116;
		parent_53.left = left_117;
		parent_53.right = right_118;
		parent_53.parent = parent_119;
		parent_53.color = color_120;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK51() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_53 = new Entry();
		Entry parent_5 = null;
		Entry left_3 = parent_5;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_49 = 0;
		Object value_50 = null;
		Entry left_51 = null;
		Entry right_52 = null;
		boolean color_54 = false;
		int key_115 = 0;
		Object value_116 = null;
		Entry left_117 = null;
		Entry right_118 = null;
		Entry parent_119 = null;
		boolean color_120 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_49;
		right_4.value = value_50;
		right_4.left = left_51;
		right_4.right = right_52;
		right_4.parent = parent_53;
		right_4.color = color_54;
		parent_53.key = key_115;
		parent_53.value = value_116;
		parent_53.left = left_117;
		parent_53.right = right_118;
		parent_53.parent = parent_119;
		parent_53.color = color_120;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK52() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_53 = new Entry();
		Entry parent_5 = null;
		Entry left_3 = right_4;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_49 = 0;
		Object value_50 = null;
		Entry left_51 = null;
		Entry right_52 = null;
		boolean color_54 = false;
		int key_115 = 0;
		Object value_116 = null;
		Entry left_117 = null;
		Entry right_118 = null;
		Entry parent_119 = null;
		boolean color_120 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_49;
		right_4.value = value_50;
		right_4.left = left_51;
		right_4.right = right_52;
		right_4.parent = parent_53;
		right_4.color = color_54;
		parent_53.key = key_115;
		parent_53.value = value_116;
		parent_53.left = left_117;
		parent_53.right = right_118;
		parent_53.parent = parent_119;
		parent_53.color = color_120;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK53() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_53 = new Entry();
		Entry parent_5 = null;
		Entry left_3 = parent_53;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_49 = 0;
		Object value_50 = null;
		Entry left_51 = null;
		Entry right_52 = null;
		boolean color_54 = false;
		int key_115 = 0;
		Object value_116 = null;
		Entry left_117 = null;
		Entry right_118 = null;
		Entry parent_119 = null;
		boolean color_120 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_49;
		right_4.value = value_50;
		right_4.left = left_51;
		right_4.right = right_52;
		right_4.parent = parent_53;
		right_4.color = color_54;
		parent_53.key = key_115;
		parent_53.value = value_116;
		parent_53.left = left_117;
		parent_53.right = right_118;
		parent_53.parent = parent_119;
		parent_53.color = color_120;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK54() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_53 = new Entry();
		Entry parent_5 = null;
		Entry left_3 = null;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_49 = 0;
		Object value_50 = null;
		Entry left_51 = null;
		Entry right_52 = null;
		boolean color_54 = false;
		int key_115 = 0;
		Object value_116 = null;
		Entry left_117 = null;
		Entry right_118 = null;
		Entry parent_119 = null;
		boolean color_120 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_49;
		right_4.value = value_50;
		right_4.left = left_51;
		right_4.right = right_52;
		right_4.parent = parent_53;
		right_4.color = color_54;
		parent_53.key = key_115;
		parent_53.value = value_116;
		parent_53.left = left_117;
		parent_53.right = right_118;
		parent_53.parent = parent_119;
		parent_53.color = color_120;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK55() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_53 = new Entry();
		Entry left_3 = new Entry();
		Entry parent_5 = null;
		obj.size = 0;
		obj.modCount = 0;
		int key_1 = 0;
		Object value_2 = null;
		boolean color_6 = false;
		int key_49 = 0;
		Object value_50 = null;
		Entry left_51 = null;
		Entry right_52 = null;
		boolean color_54 = false;
		int key_115 = 0;
		Object value_116 = null;
		Entry left_117 = null;
		Entry right_118 = null;
		Entry parent_119 = null;
		boolean color_120 = false;
		int key_121 = 0;
		Object value_122 = null;
		Entry left_123 = null;
		Entry right_124 = null;
		Entry parent_125 = null;
		boolean color_126 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_49;
		right_4.value = value_50;
		right_4.left = left_51;
		right_4.right = right_52;
		right_4.parent = parent_53;
		right_4.color = color_54;
		parent_53.key = key_115;
		parent_53.value = value_116;
		parent_53.left = left_117;
		parent_53.right = right_118;
		parent_53.parent = parent_119;
		parent_53.color = color_120;
		left_3.key = key_121;
		left_3.value = value_122;
		left_3.left = left_123;
		left_3.right = right_124;
		left_3.parent = parent_125;
		left_3.color = color_126;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

	@Test
	public void test_repOK56() throws Exception {
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
		int key_127 = 0;
		Object value_128 = null;
		Entry left_129 = null;
		Entry right_130 = null;
		Entry parent_131 = null;
		boolean color_132 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		parent_5.key = key_127;
		parent_5.value = value_128;
		parent_5.left = left_129;
		parent_5.right = right_130;
		parent_5.parent = parent_131;
		parent_5.color = color_132;
		assertTrue(Utilities.repOK(obj));
		//obj.repOK();
	}

}

