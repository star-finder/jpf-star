package doublelinkedlist;

import doublelinkedlist.DoubleLinkedList.Entry;
import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class DoubleLinkedList_set1 extends TestJPF {

	@Test
	public void test_set1() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		obj.size = 0;
		int index = 0;
		Object ele_119 = null;
		obj.modCount = 0;
		java.lang.Object element = null;
		obj.header.element = ele_119;
		obj.header.next = obj.header;
		obj.header.previous = obj.header;
		//System.out.println(Utilities.repOK(obj));
		obj.set(index,element);
	}

	@Test
	public void test_set2() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_4 = new Entry();
		Entry prev_5 = next_4;
		Entry this_header_112 = obj.header;
		obj.size = 1;
		int index = 0;
		Object ele_3 = null;
		Object ele_6 = null;
		obj.modCount = 0;
		java.lang.Object element = null;
		obj.header.element = ele_3;
		obj.header.next = next_4;
		obj.header.previous = prev_5;
		next_4.element = ele_6;
		next_4.next = obj.header;
		next_4.previous = this_header_112;
		//System.out.println(Utilities.repOK(obj));
		obj.set(index,element);
	}

	@Test
	public void test_set3() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_4 = new Entry();
		Entry next_7 = new Entry();
		Entry next_112 = next_4;
		Entry this_header_113 = obj.header;
		Entry prev_114 = next_7;
		obj.size = 2;
		int index = 0;
		Entry prev_5 = prev_114;
		Object ele_3 = null;
		Object ele_6 = null;
		Object ele_142 = null;
		obj.modCount = 0;
		java.lang.Object element = null;
		obj.header.element = ele_3;
		obj.header.next = next_4;
		obj.header.previous = prev_5;
		next_4.element = ele_6;
		next_4.next = next_7;
		next_4.previous = obj.header;
		next_7.element = ele_142;
		next_7.next = this_header_113;
		next_7.previous = next_112;
		//System.out.println(Utilities.repOK(obj));
		obj.set(index,element);
	}

	@Test
	public void test_set4() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		obj.size = 0;
		int index = -1;
		obj.modCount = 0;
		Object ele_118 = null;
		java.lang.Object element = null;
		obj.header.element = ele_118;
		obj.header.next = obj.header;
		obj.header.previous = obj.header;
		//System.out.println(Utilities.repOK(obj));
		obj.set(index,element);
	}

}

