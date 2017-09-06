package rbt;

import org.junit.Test;

import basic.Utilities;
import gov.nasa.jpf.util.test.TestJPF;
import rbt.TreeMap;
import rbt.TreeMap.Entry;

public class TreeMap_firstKey3Steps extends TestJPF {

	@Test
	public void test_repOK1() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = null;
		obj.size = 0;
		obj.modCount = 0;
		if(Utilities.repOK(obj)) {obj.firstKey();}
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
		if(Utilities.repOK(obj)) {obj.firstKey();}
		//obj.repOK();
	}

	@Test
	public void test_repOK3() throws Exception {
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
		int key_31 = 0;
		Object value_32 = null;
		Entry left_33 = null;
		Entry right_34 = null;
		Entry parent_35 = null;
		boolean color_36 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		parent_5.key = key_31;
		parent_5.value = value_32;
		parent_5.left = left_33;
		parent_5.right = right_34;
		parent_5.parent = parent_35;
		parent_5.color = color_36;
		if(Utilities.repOK(obj)) {obj.firstKey();}
		//obj.repOK();
	}

}

