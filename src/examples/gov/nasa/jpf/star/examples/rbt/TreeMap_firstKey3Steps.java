package gov.nasa.jpf.star.examples.rbt;

import gov.nasa.jpf.star.examples.rbt.TreeMap.Entry;
import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

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
		int key_37 = 0;
		Object value_38 = null;
		Entry left_39 = null;
		Entry right_40 = null;
		Entry parent_41 = null;
		boolean color_42 = false;
		obj.root.key = key_1;
		obj.root.value = value_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.parent = parent_5;
		obj.root.color = color_6;
		parent_5.key = key_37;
		parent_5.value = value_38;
		parent_5.left = left_39;
		parent_5.right = right_40;
		parent_5.parent = parent_41;
		parent_5.color = color_42;
		if(Utilities.repOK(obj)) {obj.firstKey();}
		//obj.repOK();
	}

}

