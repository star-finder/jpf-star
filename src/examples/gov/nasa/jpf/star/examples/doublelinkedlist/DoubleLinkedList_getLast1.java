package gov.nasa.jpf.star.examples.doublelinkedlist;

import gov.nasa.jpf.star.examples.doublelinkedlist.DoubleLinkedList.Entry;
import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class DoubleLinkedList_getLast1 extends TestJPF {

	@Test
	public void test_getLast1() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		obj.size = 0;
		obj.modCount = 0;
		Object ele_118 = null;
		obj.header.element = ele_118;
		obj.header.next = obj.header;
		obj.header.previous = obj.header;
		System.out.println(Utilities.repOK(obj));
		obj.getLast();
	}

	@Test
	public void test_getLast2() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry prev_4 = new Entry();
		Entry next_3 = prev_4;
		Entry this_header_114 = obj.header;
		obj.size = 1;
		obj.modCount = 0;
		Object ele_2 = null;
		Object ele_5 = null;
		obj.header.element = ele_2;
		obj.header.next = next_3;
		obj.header.previous = prev_4;
		prev_4.element = ele_5;
		prev_4.next = obj.header;
		prev_4.previous = this_header_114;
		System.out.println(Utilities.repOK(obj));
		obj.getLast();
	}

	@Test
	public void test_getLast3() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry prev_4 = new Entry();
		Entry prev_6 = new Entry();
		Entry prev_114 = prev_4;
		Entry this_header_115 = obj.header;
		Entry next_116 = prev_6;
		obj.size = 2;
		Entry next_3 = next_116;
		obj.modCount = 0;
		Object ele_2 = null;
		Object ele_5 = null;
		Object ele_139 = null;
		obj.header.element = ele_2;
		obj.header.next = next_3;
		obj.header.previous = prev_4;
		prev_4.element = ele_5;
		prev_4.next = obj.header;
		prev_4.previous = prev_6;
		prev_6.element = ele_139;
		prev_6.next = prev_114;
		prev_6.previous = this_header_115;
		System.out.println(Utilities.repOK(obj));
		obj.getLast();
	}

}

