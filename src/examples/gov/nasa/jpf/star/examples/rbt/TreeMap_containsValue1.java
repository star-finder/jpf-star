package gov.nasa.jpf.star.examples.rbt;

import gov.nasa.jpf.star.examples.rbt.TreeMap.Entry;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class TreeMap_containsValue1 extends TestJPF {

	@Test
	public void test1() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = null;
		obj.size = 0;
		Object value = null;
		obj.modCount = 0;
		obj.containsValue(value);
	}

	@Test
	public void test2() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry parent_5 = null;
		Object value = null;
		Object value_2 = null;
		Entry this_root_300 = obj.root;
		Entry left_3 = null;
		Entry right_4 = null;
		obj.size = 1;
		int key_1 = 3;
		boolean color_6 = true;
		obj.modCount = 0;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		obj.containsValue(value);
	}

	@Test
	public void test3() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry parent_5 = null;
		Object value = null;
		Entry left_3 = null;
		Entry right_4 = null;
		boolean color_6 = true;
		obj.size = 1;
		Object value_2 = new Object();
		obj.modCount = 0;
		int key_1 = 0;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		obj.containsValue(value);
	}

	@Test
	public void test4() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry left_3 = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Object value = null;
		Entry parent_17 = obj.root;
		Object value_14 = null;
		Entry left_300 = left_3;
		Entry left_302 = left_3;
		Entry left_15 = null;
		Entry right_16 = null;
		Entry left_389 = null;
		Entry right_387 = null;
		obj.size = 3;
		boolean color_6 = true;
		boolean color_390 = true;
		boolean color_18 = true;
		int key_13 = 0;
		int key_1 = 1;
		int key_386 = 2;
		Object value_2 = new Object();
		obj.modCount = 0;
		Object value_391 = null;
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
		right_4.key = key_386;
		right_4.value = value_391;
		right_4.left = left_389;
		right_4.right = right_387;
		right_4.parent = obj.root;
		right_4.color = color_390;
		obj.containsValue(value);
	}

	@Test
	public void test5() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry left_3 = new Entry();
		Entry parent_5 = null;
		Object value = null;
		Entry parent_17 = obj.root;
		Object value_14 = null;
		Entry left_300 = left_3;
		Entry left_302 = left_3;
		Entry right_4 = null;
		Entry left_15 = null;
		Entry right_16 = null;
		obj.size = 2;
		boolean color_6 = true;
		boolean color_18 = false;
		int key_13 = 0;
		int key_1 = 1;
		Object value_2 = new Object();
		obj.modCount = 0;
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
		obj.containsValue(value);
	}

	@Test
	public void test6() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry parent_5 = null;
		Entry this_root_300 = obj.root;
		Entry left_3 = null;
		Entry right_4 = null;
		obj.size = 1;
		int key_1 = 4;
		boolean color_6 = true;
		Object value = new Object();
		Object value_2 = value;
		obj.modCount = 0;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		obj.containsValue(value);
	}

	@Test
	public void test7() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry parent_5 = null;
		Entry left_3 = null;
		Entry right_4 = null;
		boolean color_6 = true;
		obj.size = 1;
		Object value = new Object();
		Object value_2 = new Object();
		obj.modCount = 0;
		int key_1 = 0;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		obj.containsValue(value);
	}

	@Test
	public void test8() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry left_3 = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Entry parent_17 = obj.root;
		Entry left_300 = left_3;
		Entry left_302 = left_3;
		Entry left_15 = null;
		Entry right_16 = null;
		Entry left_387 = null;
		Entry right_385 = null;
		obj.size = 3;
		boolean color_6 = true;
		boolean color_388 = true;
		boolean color_18 = true;
		int key_13 = -1;
		int key_1 = 0;
		int key_384 = 1;
		Object value = new Object();
		Object value_2 = new Object();
		Object value_14 = value;
		obj.modCount = 0;
		Object value_389 = null;
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
		right_4.key = key_384;
		right_4.value = value_389;
		right_4.left = left_387;
		right_4.right = right_385;
		right_4.parent = obj.root;
		right_4.color = color_388;
		obj.containsValue(value);
	}

	@Test
	public void test9() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry left_3 = new Entry();
		Entry parent_5 = null;
		Entry parent_17 = obj.root;
		Entry left_300 = left_3;
		Entry left_302 = left_3;
		Entry right_4 = null;
		Entry left_15 = null;
		Entry right_16 = null;
		obj.size = 2;
		boolean color_6 = true;
		boolean color_18 = false;
		int key_13 = 0;
		int key_1 = 1;
		Object value = new Object();
		Object value_2 = new Object();
		Object value_14 = value;
		obj.modCount = 0;
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
		obj.containsValue(value);
	}

}

