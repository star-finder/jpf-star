package gov.nasa.jpf.star.examples.rbt;

import gov.nasa.jpf.star.examples.rbt.TreeMap.Entry;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class TreeMap_lastKey1 extends TestJPF {

	@Test
	public void test1() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = null;
		obj.size = 0;
		obj.modCount = 0;
		obj.lastKey();
	}

	@Test
	public void test2() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry parent_5 = null;
		Entry right_4 = null;
		Entry left_3 = null;
		boolean color_6 = true;
		obj.size = 1;
		int key_1 = 3;
		obj.modCount = 0;
		Object value_2 = null;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		obj.lastKey();
	}

	@Test
	public void test3() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry left_3 = new Entry();
		Entry parent_5 = null;
		Entry parent_17 = obj.root;
		Entry right_16 = null;
		Entry right_300 = right_4;
		Entry left_15 = null;
		Entry left_376 = null;
		Entry right_374 = null;
		obj.size = 3;
		boolean color_6 = true;
		boolean color_377 = true;
		boolean color_18 = true;
		int key_13 = 0;
		int key_1 = -1;
		int key_373 = -2;
		obj.modCount = 0;
		Object value_2 = null;
		Object value_14 = null;
		Object value_378 = null;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_13;
		right_4.value = value_14;
		right_4.left = left_15;
		right_4.right = right_16;
		right_4.parent = parent_17;
		right_4.color = color_18;
		left_3.key = key_373;
		left_3.value = value_378;
		left_3.left = left_376;
		left_3.right = right_374;
		left_3.parent = obj.root;
		left_3.color = color_377;
		obj.lastKey();
	}

	@Test
	public void test4() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry right_16 = new Entry();
		Entry left_3 = new Entry();
		Entry parent_5 = null;
		Entry parent_17 = obj.root;
		Entry parent_27 = right_4;
		Entry right_26 = null;
		Entry right_300 = right_4;
		Entry right_303 = right_16;
		Entry left_15 = null;
		Entry left_25 = null;
		Entry left_412 = null;
		Entry right_410 = null;
		boolean color_413 = true;
		obj.size = 4;
		boolean color_6 = true;
		boolean color_18 = true;
		int key_23 = 1;
		int key_1 = -1;
		int key_13 = 0;
		boolean color_28 = false;
		int key_409 = -2;
		obj.modCount = 0;
		Object value_2 = null;
		Object value_14 = null;
		Object value_24 = null;
		Object value_414 = null;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_13;
		right_4.value = value_14;
		right_4.left = left_15;
		right_4.right = right_16;
		right_4.parent = parent_17;
		right_4.color = color_18;
		right_16.key = key_23;
		right_16.value = value_24;
		right_16.left = left_25;
		right_16.right = right_26;
		right_16.parent = parent_27;
		right_16.color = color_28;
		left_3.key = key_409;
		left_3.value = value_414;
		left_3.left = left_412;
		left_3.right = right_410;
		left_3.parent = obj.root;
		left_3.color = color_413;
		obj.lastKey();
	}

	@Test
	public void test5() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Entry parent_17 = obj.root;
		Entry right_16 = null;
		Entry right_300 = right_4;
		Entry left_3 = null;
		Entry left_15 = null;
		obj.size = 2;
		boolean color_18 = false;
		int key_1 = -1;
		int key_13 = 0;
		boolean color_6 = true;
		obj.modCount = 0;
		Object value_2 = null;
		Object value_14 = null;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_13;
		right_4.value = value_14;
		right_4.left = left_15;
		right_4.right = right_16;
		right_4.parent = parent_17;
		right_4.color = color_18;
		obj.lastKey();
	}

	@Test
	public void test6() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry right_16 = new Entry();
		Entry left_3 = new Entry();
		Entry left_15 = new Entry();
		Entry parent_5 = null;
		Entry parent_17 = obj.root;
		Entry parent_47 = right_4;
		Entry right_46 = null;
		Entry right_300 = right_4;
		Entry right_303 = right_16;
		Entry left_45 = null;
		Entry left_412 = null;
		Entry right_410 = null;
		Entry left_427 = null;
		Entry right_425 = null;
		obj.size = 5;
		boolean color_6 = true;
		int key_424 = -1;
		int key_43 = 1;
		int key_409 = -3;
		boolean color_428 = true;
		boolean color_413 = true;
		boolean color_48 = true;
		boolean color_18 = false;
		int key_1 = -2;
		int key_13 = 0;
		obj.modCount = 0;
		Object value_2 = null;
		Object value_14 = null;
		Object value_44 = null;
		Object value_414 = null;
		Object value_429 = null;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_13;
		right_4.value = value_14;
		right_4.left = left_15;
		right_4.right = right_16;
		right_4.parent = parent_17;
		right_4.color = color_18;
		right_16.key = key_43;
		right_16.value = value_44;
		right_16.left = left_45;
		right_16.right = right_46;
		right_16.parent = parent_47;
		right_16.color = color_48;
		left_3.key = key_409;
		left_3.value = value_414;
		left_3.left = left_412;
		left_3.right = right_410;
		left_3.parent = obj.root;
		left_3.color = color_413;
		left_15.key = key_424;
		left_15.value = value_429;
		left_15.left = left_427;
		left_15.right = right_425;
		left_15.parent = right_300;
		left_15.color = color_428;
		obj.lastKey();
	}

}

