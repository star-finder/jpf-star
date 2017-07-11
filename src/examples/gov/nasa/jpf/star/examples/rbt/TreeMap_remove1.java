package gov.nasa.jpf.star.examples.rbt;

import gov.nasa.jpf.star.examples.rbt.TreeMap.Entry;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class TreeMap_remove1 extends TestJPF {

	@Test
	public void test1() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = null;
		obj.size = 0;
		int key = 0;
		obj.modCount = 0;
		obj.remove(key);
	}

	@Test
	public void test2() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry parent_5 = null;
		Entry left_3 = null;
		Entry right_4 = null;
		boolean color_6 = true;
		obj.size = 1;
		int key = 0;
		int key_1 = 0;
		obj.modCount = 0;
		Object value_2 = null;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		obj.remove(key);
	}

	@Test
	public void test3() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Entry left_3 = null;
		Entry parent_27 = obj.root;
		Entry right_299 = right_4;
		Entry right_302 = right_4;
		Entry left_25 = null;
		Entry right_26 = null;
		obj.size = 2;
		boolean color_6 = true;
		int key = 0;
		int key_23 = 1;
		int key_1 = 0;
		boolean color_28 = false;
		obj.modCount = 0;
		Object value_2 = null;
		Object value_24 = null;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_23;
		right_4.value = value_24;
		right_4.left = left_25;
		right_4.right = right_26;
		right_4.parent = parent_27;
		right_4.color = color_28;
		obj.remove(key);
	}

	@Test
	public void test4() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry left_3 = new Entry();
		Entry parent_5 = null;
		Entry parent_17 = obj.root;
		Entry right_4 = null;
		Entry left_299 = left_3;
		Entry left_301 = left_3;
		Entry left_15 = null;
		Entry right_16 = null;
		obj.size = 2;
		boolean color_6 = true;
		int key = 0;
		boolean color_18 = false;
		int key_1 = 0;
		int key_13 = -1;
		obj.modCount = 0;
		Object value_2 = null;
		Object value_14 = null;
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
		obj.remove(key);
	}

	@Test
	public void test5() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry parent_5 = null;
		Entry left_3 = null;
		Entry right_4 = null;
		boolean color_6 = true;
		obj.size = 1;
		int key = 0;
		int key_1 = 1;
		obj.modCount = 0;
		Object value_2 = null;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		obj.remove(key);
	}

	@Test
	public void test6() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry left_3 = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Entry parent_17 = obj.root;
		Entry left_15 = null;
		Entry left_300 = left_3;
		Entry right_16 = null;
		Entry left_385 = null;
		Entry right_383 = null;
		boolean color_386 = true;
		obj.size = 3;
		boolean color_6 = true;
		int key = 0;
		boolean color_18 = true;
		int key_1 = 2;
		int key_13 = 1;
		int key_382 = 3;
		obj.modCount = 0;
		Object value_2 = null;
		Object value_14 = null;
		Object value_387 = null;
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
		right_4.key = key_382;
		right_4.value = value_387;
		right_4.left = left_385;
		right_4.right = right_383;
		right_4.parent = obj.root;
		right_4.color = color_386;
		obj.remove(key);
	}

	@Test
	public void test7() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry left_3 = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Entry parent_17 = obj.root;
		Entry right_16 = null;
		Entry left_300 = left_3;
		Entry left_15 = null;
		Entry left_382 = null;
		Entry right_380 = null;
		obj.size = 3;
		boolean color_383 = true;
		boolean color_6 = true;
		int key = 0;
		int key_379 = 2;
		boolean color_18 = true;
		int key_1 = 1;
		int key_13 = -1;
		obj.modCount = 0;
		Object value_2 = null;
		Object value_14 = null;
		Object value_384 = null;
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
		right_4.key = key_379;
		right_4.value = value_384;
		right_4.left = left_382;
		right_4.right = right_380;
		right_4.parent = obj.root;
		right_4.color = color_383;
		obj.remove(key);
	}

	@Test
	public void test8() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry left_3 = new Entry();
		Entry parent_5 = null;
		Entry parent_17 = obj.root;
		Entry left_15 = null;
		Entry right_16 = null;
		Entry right_4 = null;
		obj.size = 2;
		boolean color_18 = false;
		int key_1 = 1;
		int key_13 = 0;
		boolean color_6 = true;
		int key = 0;
		obj.modCount = 0;
		Object value_2 = null;
		Object value_14 = null;
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
		obj.remove(key);
	}

	@Test
	public void test9() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry left_3 = new Entry();
		Entry parent_5 = null;
		Entry parent_17 = obj.root;
		Entry left_15 = null;
		Entry left_300 = left_3;
		Entry right_4 = null;
		Entry right_16 = null;
		obj.size = 2;
		boolean color_6 = true;
		int key = 0;
		boolean color_18 = false;
		int key_1 = 2;
		int key_13 = 1;
		obj.modCount = 0;
		Object value_2 = null;
		Object value_14 = null;
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
		obj.remove(key);
	}

	@Test
	public void test10() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry left_3 = new Entry();
		Entry parent_5 = null;
		Entry parent_17 = obj.root;
		Entry right_16 = null;
		Entry left_300 = left_3;
		Entry right_4 = null;
		Entry left_15 = null;
		obj.size = 2;
		boolean color_18 = false;
		int key_1 = 1;
		int key_13 = -1;
		boolean color_6 = true;
		int key = 0;
		obj.modCount = 0;
		Object value_2 = null;
		Object value_14 = null;
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
		obj.remove(key);
	}

	@Test
	public void test11() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry parent_5 = null;
		Entry right_4 = null;
		Entry left_3 = null;
		boolean color_6 = true;
		obj.size = 1;
		int key = 0;
		int key_1 = -1;
		obj.modCount = 0;
		Object value_2 = null;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		obj.remove(key);
	}

	@Test
	public void test12() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry left_3 = new Entry();
		Entry parent_5 = null;
		Entry parent_27 = obj.root;
		Entry left_25 = null;
		Entry right_300 = right_4;
		Entry right_26 = null;
		Entry left_382 = null;
		Entry right_380 = null;
		obj.size = 3;
		boolean color_383 = true;
		boolean color_6 = true;
		int key = 0;
		int key_379 = -2;
		int key_23 = 1;
		int key_1 = -1;
		boolean color_28 = true;
		obj.modCount = 0;
		Object value_2 = null;
		Object value_24 = null;
		Object value_384 = null;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_23;
		right_4.value = value_24;
		right_4.left = left_25;
		right_4.right = right_26;
		right_4.parent = parent_27;
		right_4.color = color_28;
		left_3.key = key_379;
		left_3.value = value_384;
		left_3.left = left_382;
		left_3.right = right_380;
		left_3.parent = obj.root;
		left_3.color = color_383;
		obj.remove(key);
	}

	@Test
	public void test13() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry left_3 = new Entry();
		Entry parent_5 = null;
		Entry parent_27 = obj.root;
		Entry right_26 = null;
		Entry right_300 = right_4;
		Entry left_25 = null;
		Entry left_385 = null;
		Entry right_383 = null;
		boolean color_386 = true;
		obj.size = 3;
		boolean color_6 = true;
		int key = 0;
		int key_23 = -1;
		int key_1 = -2;
		int key_382 = -3;
		boolean color_28 = true;
		obj.modCount = 0;
		Object value_2 = null;
		Object value_24 = null;
		Object value_387 = null;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_23;
		right_4.value = value_24;
		right_4.left = left_25;
		right_4.right = right_26;
		right_4.parent = parent_27;
		right_4.color = color_28;
		left_3.key = key_382;
		left_3.value = value_387;
		left_3.left = left_385;
		left_3.right = right_383;
		left_3.parent = obj.root;
		left_3.color = color_386;
		obj.remove(key);
	}

	@Test
	public void test14() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Entry parent_27 = obj.root;
		Entry left_25 = null;
		Entry right_26 = null;
		Entry left_3 = null;
		obj.size = 2;
		int key_1 = -1;
		int key_23 = 0;
		boolean color_6 = true;
		boolean color_28 = false;
		int key = 0;
		obj.modCount = 0;
		Object value_2 = null;
		Object value_24 = null;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_23;
		right_4.value = value_24;
		right_4.left = left_25;
		right_4.right = right_26;
		right_4.parent = parent_27;
		right_4.color = color_28;
		obj.remove(key);
	}

	@Test
	public void test15() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Entry parent_27 = obj.root;
		Entry left_25 = null;
		Entry right_300 = right_4;
		Entry left_3 = null;
		Entry right_26 = null;
		obj.size = 2;
		int key_1 = -1;
		int key_23 = 1;
		boolean color_6 = true;
		boolean color_28 = false;
		int key = 0;
		obj.modCount = 0;
		Object value_2 = null;
		Object value_24 = null;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_23;
		right_4.value = value_24;
		right_4.left = left_25;
		right_4.right = right_26;
		right_4.parent = parent_27;
		right_4.color = color_28;
		obj.remove(key);
	}

	@Test
	public void test16() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Entry parent_27 = obj.root;
		Entry right_26 = null;
		Entry right_300 = right_4;
		Entry left_3 = null;
		Entry left_25 = null;
		obj.size = 2;
		boolean color_6 = true;
		int key = 0;
		int key_23 = -1;
		int key_1 = -2;
		boolean color_28 = false;
		obj.modCount = 0;
		Object value_2 = null;
		Object value_24 = null;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_23;
		right_4.value = value_24;
		right_4.left = left_25;
		right_4.right = right_26;
		right_4.parent = parent_27;
		right_4.color = color_28;
		obj.remove(key);
	}

}

