package gov.nasa.jpf.star.examples.rbt;

import gov.nasa.jpf.star.examples.rbt.TreeMap.Entry;
import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class TreeMap_firstKey1 extends TestJPF {

	@Test
	public void test_firstKey1() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = null;
		obj.size = 0;
		obj.modCount = 0;
		System.out.println(Utilities.repOK(obj));
		obj.firstKey();
	}

	@Test
	public void test_firstKey2() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry parent_5 = null;
		Entry left_3 = null;
		Entry right_4 = null;
		boolean color_6 = true;
		obj.size = 1;
		int key_1 = 3;
		int key_299 = 3;
		obj.modCount = 0;
		Object value_2 = null;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		System.out.println(Utilities.repOK(obj));
		obj.firstKey();
	}

	@Test
	public void test_firstKey3() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry left_3 = new Entry();
		Entry right_4 = new Entry();
		Entry parent_5 = null;
		Entry parent_18 = obj.root;
		Entry left_16 = null;
		Entry left_300 = left_3;
		Entry right_17 = null;
		Entry left_376 = null;
		Entry right_374 = null;
		boolean color_19 = true;
		obj.size = 3;
		boolean color_6 = true;
		boolean color_377 = true;
		int key_1 = 0;
		int key_301 = -1;
		int key_302 = 0;
		int key_14 = -1;
		int key_373 = 1;
		int key_299 = 0;
		obj.modCount = 0;
		Object value_2 = null;
		Object value_15 = null;
		Object value_378 = null;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		left_3.key = key_14;
		left_3.value = value_15;
		left_3.left = left_16;
		left_3.right = right_17;
		left_3.parent = parent_18;
		left_3.color = color_19;
		right_4.key = key_373;
		right_4.value = value_378;
		right_4.left = left_376;
		right_4.right = right_374;
		right_4.parent = obj.root;
		right_4.color = color_377;
		System.out.println(Utilities.repOK(obj));
		obj.firstKey();
	}

	@Test
	public void test_firstKey4() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = new Entry();
		Entry left_3 = new Entry();
		Entry parent_5 = null;
		Entry parent_18 = obj.root;
		Entry left_16 = null;
		Entry left_300 = left_3;
		Entry right_4 = null;
		Entry right_17 = null;
		boolean color_19 = false;
		obj.size = 2;
		int key_1 = 1;
		boolean color_6 = true;
		int key_301 = 0;
		int key_302 = 1;
		int key_14 = 0;
		int key_299 = 1;
		obj.modCount = 0;
		Object value_2 = null;
		Object value_15 = null;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		left_3.key = key_14;
		left_3.value = value_15;
		left_3.left = left_16;
		left_3.right = right_17;
		left_3.parent = parent_18;
		left_3.color = color_19;
		System.out.println(Utilities.repOK(obj));
		obj.firstKey();
	}

}

