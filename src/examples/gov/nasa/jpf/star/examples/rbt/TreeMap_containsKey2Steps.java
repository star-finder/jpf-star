package gov.nasa.jpf.star.examples.rbt;

import gov.nasa.jpf.star.examples.rbt.TreeMap.Entry;
import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class TreeMap_containsKey2Steps extends TestJPF {

	@Test
	public void test_repOK1() throws Exception {
		TreeMap obj = new TreeMap();
		obj.root = null;
		obj.size = 0;
		obj.modCount = 0;
		if(Utilities.repOK(obj)) {obj.containsKey(0);}
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
		if(Utilities.repOK(obj)) {obj.containsKey(0);}
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
		int key_13 = 0;
		Object value_14 = null;
		Entry left_15 = null;
		Entry right_16 = null;
		Entry parent_17 = null;
		boolean color_18 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		parent_5.key = key_13;
		parent_5.value = value_14;
		parent_5.left = left_15;
		parent_5.right = right_16;
		parent_5.parent = parent_17;
		parent_5.color = color_18;
		if(Utilities.repOK(obj)) {obj.containsKey(0);}
		//obj.repOK();
	}

}

