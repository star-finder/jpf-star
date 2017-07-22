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
		int key_301 = 3;
		boolean color_6 = true;
		int key_299 = 3;
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
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Object value = null;
		Entry left_3 = null;
		Entry parent_27 = obj.root;
		Object value_24 = null;
		Entry right_299 = right_4;
		Entry right_302 = right_4;
		Entry left_25 = null;
		Entry right_26 = null;
		obj.size = 2;
		boolean color_6 = true;
		int key_300 = -1;
		int key_23 = 0;
		int key_1 = -1;
		int key_301 = 0;
		int key_303 = 0;
		boolean color_28 = false;
		Object value_2 = new Object();
		obj.modCount = 0;
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
		obj.containsValue(value);
	}

	@Test
	public void test5() throws Exception {
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
		int key_304 = 1;
		boolean color_6 = true;
		boolean color_390 = true;
		boolean color_18 = true;
		int key_13 = 0;
		int key_1 = 1;
		int key_301 = 0;
		int key_303 = 0;
		int key_386 = 2;
		int key_299 = 1;
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
	public void test6() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry left_3 = new Entry();
		Entry right_16 = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Object value = null;
		Entry parent_17 = obj.root;
		Entry left_15 = null;
		Entry parent_67 = left_3;
		Object value_64 = null;
		Entry right_300 = right_16;
		Entry right_303 = right_16;
		Entry left_65 = null;
		Entry right_66 = null;
		Entry left_424 = null;
		Entry right_422 = null;
		obj.size = 4;
		boolean color_425 = true;
		int key_304 = -1;
		boolean color_6 = true;
		int key_63 = -1;
		boolean color_68 = false;
		boolean color_18 = true;
		int key_421 = 1;
		int key_13 = -2;
		int key_1 = 0;
		int key_301 = -2;
		int key_302 = -1;
		int key_305 = 0;
		int key_299 = 0;
		Object value_2 = new Object();
		Object value_14 = new Object();
		obj.modCount = 0;
		Object value_426 = null;
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
		right_16.key = key_63;
		right_16.value = value_64;
		right_16.left = left_65;
		right_16.right = right_66;
		right_16.parent = parent_67;
		right_16.color = color_68;
		right_4.key = key_421;
		right_4.value = value_426;
		right_4.left = left_424;
		right_4.right = right_422;
		right_4.parent = obj.root;
		right_4.color = color_425;
		obj.containsValue(value);
	}

	@Test
	public void test7() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry left_3 = new Entry();
		Entry left_15 = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Object value = null;
		Entry parent_17 = obj.root;
		Entry parent_57 = left_3;
		Object value_54 = null;
		Entry left_300 = left_3;
		Entry left_303 = left_15;
		Entry left_305 = left_15;
		Entry right_16 = null;
		Entry left_55 = null;
		Entry right_56 = null;
		Entry left_428 = null;
		Entry right_426 = null;
		obj.size = 4;
		int key_306 = -1;
		boolean color_58 = false;
		boolean color_6 = true;
		boolean color_429 = true;
		int key_425 = 2;
		int key_307 = 0;
		int key_302 = 1;
		int key_304 = -1;
		boolean color_18 = true;
		int key_13 = 0;
		int key_1 = 1;
		int key_53 = -1;
		int key_301 = 0;
		int key_299 = 1;
		Object value_2 = new Object();
		Object value_14 = new Object();
		obj.modCount = 0;
		Object value_430 = null;
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
		left_15.key = key_53;
		left_15.value = value_54;
		left_15.left = left_55;
		left_15.right = right_56;
		left_15.parent = parent_57;
		left_15.color = color_58;
		right_4.key = key_425;
		right_4.value = value_430;
		right_4.left = left_428;
		right_4.right = right_426;
		right_4.parent = obj.root;
		right_4.color = color_429;
		obj.containsValue(value);
	}

	@Test
	public void test8() throws Exception {
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
		int key_304 = 1;
		boolean color_6 = true;
		boolean color_18 = false;
		int key_13 = 0;
		int key_1 = 1;
		int key_301 = 0;
		int key_303 = 0;
		int key_299 = 1;
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
	public void test9() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry parent_5 = null;
		Entry this_root_300 = obj.root;
		Entry left_3 = null;
		Entry right_4 = null;
		obj.size = 1;
		int key_1 = 4;
		int key_301 = 4;
		boolean color_6 = true;
		int key_299 = 4;
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
	public void test10() throws Exception {
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
	public void test11() throws Exception {
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
		int key_300 = -1;
		int key_23 = 0;
		int key_1 = -1;
		int key_301 = 0;
		int key_303 = 0;
		boolean color_28 = false;
		Object value = new Object();
		Object value_2 = new Object();
		Object value_24 = value;
		obj.modCount = 0;
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
		obj.containsValue(value);
	}

	@Test
	public void test12() throws Exception {
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
		int key_304 = 0;
		boolean color_6 = true;
		boolean color_388 = true;
		boolean color_18 = true;
		int key_13 = -1;
		int key_1 = 0;
		int key_301 = -1;
		int key_303 = -1;
		int key_384 = 1;
		int key_299 = 0;
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
	public void test13() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry left_3 = new Entry();
		Entry right_16 = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Entry parent_17 = obj.root;
		Entry left_15 = null;
		Entry parent_67 = left_3;
		Entry right_300 = right_16;
		Entry right_303 = right_16;
		Entry left_65 = null;
		Entry right_66 = null;
		Entry left_421 = null;
		Entry right_419 = null;
		obj.size = 4;
		boolean color_422 = true;
		int key_304 = 1;
		boolean color_6 = true;
		int key_63 = 1;
		boolean color_68 = false;
		boolean color_18 = true;
		int key_13 = 0;
		int key_1 = 2;
		int key_301 = 0;
		int key_302 = 1;
		int key_305 = 2;
		int key_418 = 3;
		int key_299 = 2;
		Object value = new Object();
		Object value_2 = new Object();
		Object value_14 = new Object();
		Object value_64 = value;
		obj.modCount = 0;
		Object value_423 = null;
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
		right_16.key = key_63;
		right_16.value = value_64;
		right_16.left = left_65;
		right_16.right = right_66;
		right_16.parent = parent_67;
		right_16.color = color_68;
		right_4.key = key_418;
		right_4.value = value_423;
		right_4.left = left_421;
		right_4.right = right_419;
		right_4.parent = obj.root;
		right_4.color = color_422;
		obj.containsValue(value);
	}

	@Test
	public void test14() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry left_3 = new Entry();
		Entry left_15 = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Entry parent_17 = obj.root;
		Entry parent_57 = left_3;
		Entry left_300 = left_3;
		Entry left_303 = left_15;
		Entry left_305 = left_15;
		Entry right_16 = null;
		Entry left_55 = null;
		Entry right_56 = null;
		Entry left_425 = null;
		Entry right_423 = null;
		obj.size = 4;
		int key_306 = -1;
		boolean color_58 = false;
		boolean color_6 = true;
		int key_307 = 0;
		int key_302 = 1;
		int key_304 = -1;
		boolean color_426 = true;
		int key_422 = 2;
		boolean color_18 = true;
		int key_13 = 0;
		int key_1 = 1;
		int key_53 = -1;
		int key_301 = 0;
		int key_299 = 1;
		Object value = new Object();
		Object value_2 = new Object();
		Object value_14 = new Object();
		Object value_54 = value;
		obj.modCount = 0;
		Object value_427 = null;
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
		left_15.key = key_53;
		left_15.value = value_54;
		left_15.left = left_55;
		left_15.right = right_56;
		left_15.parent = parent_57;
		left_15.color = color_58;
		right_4.key = key_422;
		right_4.value = value_427;
		right_4.left = left_425;
		right_4.right = right_423;
		right_4.parent = obj.root;
		right_4.color = color_426;
		obj.containsValue(value);
	}

	@Test
	public void test15() throws Exception {
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
		int key_304 = 1;
		boolean color_6 = true;
		boolean color_18 = false;
		int key_13 = 0;
		int key_1 = 1;
		int key_301 = 0;
		int key_303 = 0;
		int key_299 = 1;
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

