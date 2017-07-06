package gov.nasa.jpf.star.examples.doublelinkedlist;

import gov.nasa.jpf.star.examples.doublelinkedlist.DoubleLinkedList.Entry;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class DoubleLinkedList_removeLast1 extends TestJPF {

	@Test
	public void test1() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry this_header_114 = obj.header;
		obj.size = 0;
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = obj.header;
		obj.header.previous = this_header_114;
		obj.removeLast();
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
		obj.removeLast();
	}

	@Test
	public void test3() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry prev_3 = new Entry();
		Entry prev_5 = new Entry();
		Entry next_2 = prev_5;
		Entry prev_114 = prev_3;
		Entry this_header_115 = obj.header;
		obj.size = 2;
		obj.modCount = 0;
		Object ele_1 = null;
		Object ele_4 = null;
		Object ele_7 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		prev_3.element = ele_4;
		prev_3.next = obj.header;
		prev_3.previous = prev_5;
		prev_5.element = ele_7;
		prev_5.next = prev_114;
		prev_5.previous = this_header_115;
		obj.removeLast();
	}

	@Test
	public void test4() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry prev_3 = new Entry();
		Entry prev_5 = new Entry();
		Entry prev_8 = new Entry();
		Entry prev_114 = prev_3;
		Entry prev_115 = prev_5;
		Entry this_header_116 = obj.header;
		Entry next_117 = prev_8;
		obj.size = 3;
		Entry next_2 = next_117;
		obj.modCount = 0;
		Object ele_1 = null;
		Object ele_4 = null;
		Object ele_7 = null;
		Object ele_149 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		prev_3.element = ele_4;
		prev_3.next = obj.header;
		prev_3.previous = prev_5;
		prev_5.element = ele_7;
		prev_5.next = prev_114;
		prev_5.previous = prev_8;
		prev_8.element = ele_149;
		prev_8.next = prev_115;
		prev_8.previous = this_header_116;
		obj.removeLast();
	}

}

