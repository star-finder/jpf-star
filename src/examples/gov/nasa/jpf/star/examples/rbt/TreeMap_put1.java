package gov.nasa.jpf.star.examples.rbt;

import gov.nasa.jpf.star.examples.rbt.TreeMap.Entry;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class TreeMap_put1 extends TestJPF {

	@Test
	public void test1() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = null;
		obj.size = 0;
		int key = 0;
		Object value = null;
		obj.modCount = 0;
		obj.put(key,value);
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
		int key_1 = 1;
		Object value = null;
		obj.modCount = 0;
		Object value_2 = null;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		obj.put(key,value);
	}

	@Test
	public void test3() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry left_3 = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Entry parent_17 = obj.root;
		Entry left_15 = null;
		Entry left_300 = left_3;
		Entry right_16 = null;
		Entry left_381 = null;
		Entry right_379 = null;
		int key_378 = 3;
		obj.size = 3;
		boolean color_382 = true;
		boolean color_6 = true;
		int key = 0;
		boolean color_18 = true;
		int key_1 = 2;
		int key_13 = 1;
		Object value = null;
		obj.modCount = 0;
		Object value_2 = null;
		Object value_14 = null;
		Object value_383 = null;
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
		right_4.key = key_378;
		right_4.value = value_383;
		right_4.left = left_381;
		right_4.right = right_379;
		right_4.parent = obj.root;
		right_4.color = color_382;
		obj.put(key,value);
	}

	@Test
	public void test4() throws Exception {
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
		int key = 0;
		boolean color_388 = true;
		boolean color_18 = true;
		int key_1 = 1;
		int key_13 = 0;
		int key_384 = 2;
		Object value = null;
		obj.modCount = 0;
		Object value_2 = null;
		Object value_14 = null;
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
		obj.put(key,value);
	}

	@Test
	public void test5() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry left_3 = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Entry parent_17 = obj.root;
		Entry right_16 = null;
		Entry left_300 = left_3;
		Entry left_15 = null;
		Entry left_380 = null;
		Entry right_378 = null;
		obj.size = 3;
		boolean color_6 = true;
		int key = 0;
		boolean color_381 = true;
		int key_377 = 2;
		boolean color_18 = true;
		int key_1 = 1;
		int key_13 = -1;
		Object value = null;
		obj.modCount = 0;
		Object value_2 = null;
		Object value_14 = null;
		Object value_382 = null;
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
		right_4.key = key_377;
		right_4.value = value_382;
		right_4.left = left_380;
		right_4.right = right_378;
		right_4.parent = obj.root;
		right_4.color = color_381;
		obj.put(key,value);
	}

	@Test
	public void test6() throws Exception {
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
		Object value = null;
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
		obj.put(key,value);
	}

	@Test
	public void test7() throws Exception {
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
		int key = 0;
		boolean color_18 = false;
		int key_1 = 1;
		int key_13 = 0;
		Object value = null;
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
		obj.put(key,value);
	}

	@Test
	public void test8() throws Exception {
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
		Object value = null;
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
		obj.put(key,value);
	}

	@Test
	public void test9() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry parent_5 = null;
		Entry this_root_300 = obj.root;
		Entry left_3 = null;
		Entry right_4 = null;
		obj.size = 1;
		int key_1 = 0;
		boolean color_6 = true;
		int key = 0;
		Object value = null;
		obj.modCount = 0;
		Object value_2 = null;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		obj.put(key,value);
	}

	@Test
	public void test10() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry parent_5 = null;
		Entry right_4 = null;
		Entry left_3 = null;
		boolean color_6 = true;
		obj.size = 1;
		int key = 0;
		int key_1 = -1;
		Object value = null;
		obj.modCount = 0;
		Object value_2 = null;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		obj.put(key,value);
	}

	@Test
	public void test11() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry left_3 = new Entry();
		Entry parent_5 = null;
		Entry parent_97 = obj.root;
		Entry left_95 = null;
		Entry right_300 = right_4;
		Entry right_96 = null;
		Entry left_380 = null;
		Entry right_378 = null;
		int key_93 = 1;
		obj.size = 3;
		boolean color_6 = true;
		boolean color_98 = true;
		int key = 0;
		boolean color_381 = true;
		int key_377 = -2;
		int key_1 = -1;
		Object value = null;
		obj.modCount = 0;
		Object value_2 = null;
		Object value_94 = null;
		Object value_382 = null;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_93;
		right_4.value = value_94;
		right_4.left = left_95;
		right_4.right = right_96;
		right_4.parent = parent_97;
		right_4.color = color_98;
		left_3.key = key_377;
		left_3.value = value_382;
		left_3.left = left_380;
		left_3.right = right_378;
		left_3.parent = obj.root;
		left_3.color = color_381;
		obj.put(key,value);
	}

	@Test
	public void test12() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry left_3 = new Entry();
		Entry parent_5 = null;
		Entry parent_97 = obj.root;
		Entry right_300 = right_4;
		Entry right_303 = right_4;
		Entry left_95 = null;
		Entry right_96 = null;
		Entry left_389 = null;
		Entry right_387 = null;
		int key_93 = 0;
		obj.size = 3;
		boolean color_6 = true;
		boolean color_98 = true;
		boolean color_390 = true;
		int key = 0;
		int key_1 = -1;
		int key_386 = -2;
		Object value = null;
		obj.modCount = 0;
		Object value_2 = null;
		Object value_94 = null;
		Object value_391 = null;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_93;
		right_4.value = value_94;
		right_4.left = left_95;
		right_4.right = right_96;
		right_4.parent = parent_97;
		right_4.color = color_98;
		left_3.key = key_386;
		left_3.value = value_391;
		left_3.left = left_389;
		left_3.right = right_387;
		left_3.parent = obj.root;
		left_3.color = color_390;
		obj.put(key,value);
	}

	@Test
	public void test13() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry left_3 = new Entry();
		Entry parent_5 = null;
		Entry parent_97 = obj.root;
		Entry right_96 = null;
		Entry right_300 = right_4;
		Entry left_95 = null;
		Entry left_385 = null;
		Entry right_383 = null;
		boolean color_386 = true;
		int key_93 = -1;
		obj.size = 3;
		boolean color_6 = true;
		boolean color_98 = true;
		int key = 0;
		int key_1 = -2;
		int key_382 = -3;
		Object value = null;
		obj.modCount = 0;
		Object value_2 = null;
		Object value_94 = null;
		Object value_387 = null;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_93;
		right_4.value = value_94;
		right_4.left = left_95;
		right_4.right = right_96;
		right_4.parent = parent_97;
		right_4.color = color_98;
		left_3.key = key_382;
		left_3.value = value_387;
		left_3.left = left_385;
		left_3.right = right_383;
		left_3.parent = obj.root;
		left_3.color = color_386;
		obj.put(key,value);
	}

	@Test
	public void test14() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Entry parent_97 = obj.root;
		Entry left_95 = null;
		Entry right_300 = right_4;
		Entry left_3 = null;
		Entry right_96 = null;
		int key_93 = 1;
		obj.size = 2;
		int key_1 = -1;
		boolean color_6 = true;
		boolean color_98 = false;
		int key = 0;
		Object value = null;
		obj.modCount = 0;
		Object value_2 = null;
		Object value_94 = null;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_93;
		right_4.value = value_94;
		right_4.left = left_95;
		right_4.right = right_96;
		right_4.parent = parent_97;
		right_4.color = color_98;
		obj.put(key,value);
	}

	@Test
	public void test15() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Entry parent_97 = obj.root;
		Entry right_300 = right_4;
		Entry right_303 = right_4;
		Entry left_3 = null;
		Entry left_95 = null;
		Entry right_96 = null;
		int key_93 = 0;
		obj.size = 2;
		boolean color_6 = true;
		boolean color_98 = false;
		int key = 0;
		int key_1 = -1;
		Object value = null;
		obj.modCount = 0;
		Object value_2 = null;
		Object value_94 = null;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_93;
		right_4.value = value_94;
		right_4.left = left_95;
		right_4.right = right_96;
		right_4.parent = parent_97;
		right_4.color = color_98;
		obj.put(key,value);
	}

	@Test
	public void test16() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Entry parent_97 = obj.root;
		Entry right_96 = null;
		Entry right_300 = right_4;
		Entry left_3 = null;
		Entry left_95 = null;
		int key_93 = -1;
		obj.size = 2;
		boolean color_6 = true;
		boolean color_98 = false;
		int key = 0;
		int key_1 = -2;
		Object value = null;
		obj.modCount = 0;
		Object value_2 = null;
		Object value_94 = null;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_93;
		right_4.value = value_94;
		right_4.left = left_95;
		right_4.right = right_96;
		right_4.parent = parent_97;
		right_4.color = color_98;
		obj.put(key,value);
	}

}

