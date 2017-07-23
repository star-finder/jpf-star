package gov.nasa.jpf.star.examples.rbt;

import gov.nasa.jpf.star.examples.rbt.TreeMap.Entry;
import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class TreeMap_containsKey1 extends TestJPF {

	@Test
	public void test_containsKey1() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = null;
		obj.size = 0;
		int key = 0;
		obj.modCount = 0;
		System.out.println(Utilities.repOK(obj));
		obj.containsKey(key);
	}

	@Test
	public void test_containsKey2() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry parent_5 = null;
		Entry this_root_300 = obj.root;
		Entry left_3 = null;
		Entry right_4 = null;
		obj.size = 1;
		int key_301 = 0;
		int key_1 = 0;
		boolean color_6 = true;
		int key = 0;
		int key_299 = 0;
		obj.modCount = 0;
		Object value_2 = null;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		System.out.println(Utilities.repOK(obj));
		obj.containsKey(key);
	}

	@Test
	public void test_containsKey3() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry parent_5 = null;
		Entry left_3 = null;
		Entry right_4 = null;
		boolean color_6 = true;
		obj.size = 1;
		int key = 0;
		int key_1 = 1;
		int key_299 = 1;
		obj.modCount = 0;
		Object value_2 = null;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		System.out.println(Utilities.repOK(obj));
		obj.containsKey(key);
	}

	@Test
	public void test_containsKey4() throws Exception {
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
		Entry left_388 = null;
		Entry right_386 = null;
		obj.size = 3;
		int key_304 = 0;
		boolean color_6 = true;
		int key_385 = 1;
		int key = -1;
		boolean color_18 = true;
		int key_1 = 0;
		int key_13 = -1;
		int key_301 = -1;
		int key_303 = -1;
		boolean color_389 = true;
		int key_299 = 0;
		obj.modCount = 0;
		Object value_2 = null;
		Object value_14 = null;
		Object value_390 = null;
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
		right_4.key = key_385;
		right_4.value = value_390;
		right_4.left = left_388;
		right_4.right = right_386;
		right_4.parent = obj.root;
		right_4.color = color_389;
		System.out.println(Utilities.repOK(obj));
		obj.containsKey(key);
	}

	@Test
	public void test_containsKey5() throws Exception {
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
		int key = 0;
		boolean color_18 = false;
		int key_1 = 1;
		int key_13 = 0;
		int key_301 = 0;
		int key_303 = 0;
		int key_299 = 1;
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
		System.out.println(Utilities.repOK(obj));
		obj.containsKey(key);
	}

	@Test
	public void test_containsKey6() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry parent_5 = null;
		Entry right_4 = null;
		Entry left_3 = null;
		boolean color_6 = true;
		obj.size = 1;
		int key = 0;
		int key_1 = -1;
		int key_299 = -1;
		obj.modCount = 0;
		Object value_2 = null;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		System.out.println(Utilities.repOK(obj));
		obj.containsKey(key);
	}

	@Test
	public void test_containsKey7() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry left_3 = new Entry();
		Entry parent_5 = null;
		Entry parent_67 = obj.root;
		Entry right_300 = right_4;
		Entry right_303 = right_4;
		Entry left_65 = null;
		Entry right_66 = null;
		Entry left_388 = null;
		Entry right_386 = null;
		obj.size = 3;
		int key_304 = 1;
		boolean color_6 = true;
		int key_385 = -1;
		int key_63 = 1;
		int key = 1;
		boolean color_68 = true;
		int key_1 = 0;
		int key_301 = 0;
		int key_302 = 1;
		boolean color_389 = true;
		int key_299 = 0;
		obj.modCount = 0;
		Object value_2 = null;
		Object value_64 = null;
		Object value_390 = null;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_63;
		right_4.value = value_64;
		right_4.left = left_65;
		right_4.right = right_66;
		right_4.parent = parent_67;
		right_4.color = color_68;
		left_3.key = key_385;
		left_3.value = value_390;
		left_3.left = left_388;
		left_3.right = right_386;
		left_3.parent = obj.root;
		left_3.color = color_389;
		System.out.println(Utilities.repOK(obj));
		obj.containsKey(key);
	}

	@Test
	public void test_containsKey8() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Entry parent_67 = obj.root;
		Entry right_300 = right_4;
		Entry right_303 = right_4;
		Entry left_3 = null;
		Entry left_65 = null;
		Entry right_66 = null;
		obj.size = 2;
		int key_304 = 0;
		boolean color_6 = true;
		int key_63 = 0;
		int key = 0;
		boolean color_68 = false;
		int key_1 = -1;
		int key_301 = -1;
		int key_302 = 0;
		int key_299 = -1;
		obj.modCount = 0;
		Object value_2 = null;
		Object value_64 = null;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		right_4.key = key_63;
		right_4.value = value_64;
		right_4.left = left_65;
		right_4.right = right_66;
		right_4.parent = parent_67;
		right_4.color = color_68;
		System.out.println(Utilities.repOK(obj));
		obj.containsKey(key);
	}

}

