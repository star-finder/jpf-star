package gov.nasa.jpf.star.examples.doublelinkedlist;

import gov.nasa.jpf.star.examples.doublelinkedlist.DoubleLinkedList.Entry;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class DoubleLinkedList_getLast1 extends TestJPF {

	@Test
	public void test1() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		obj.size = 0;
		obj.modCount = 0;
		Object ele_118 = null;
		obj.header.element = ele_118;
		obj.header.next = obj.header;
		obj.header.previous = obj.header;
		obj.getLast();
	}

	@Test
	public void test2() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry prev_3 = new Entry();
		Entry next_2 = prev_3;
		Entry this_header_114 = obj.header;
		obj.size = 1;
		obj.modCount = 0;
		Object ele_1 = null;
		Object ele_4 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		prev_3.element = ele_4;
		prev_3.next = obj.header;
		prev_3.previous = this_header_114;
		obj.getLast();
	}

	@Test
	public void test3() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry prev_3 = new Entry();
		Entry prev_5 = new Entry();
		Entry prev_114 = prev_3;
		Entry this_header_115 = obj.header;
		Entry next_116 = prev_5;
		obj.size = 2;
		Entry next_2 = next_116;
		obj.modCount = 0;
		Object ele_1 = null;
		Object ele_4 = null;
		Object ele_139 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		prev_3.element = ele_4;
		prev_3.next = obj.header;
		prev_3.previous = prev_5;
		prev_5.element = ele_139;
		prev_5.next = prev_114;
		prev_5.previous = this_header_115;
		obj.getLast();
	}

}

