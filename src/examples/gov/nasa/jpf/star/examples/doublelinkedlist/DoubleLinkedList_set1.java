package gov.nasa.jpf.star.examples.doublelinkedlist;

import gov.nasa.jpf.star.examples.doublelinkedlist.DoubleLinkedList.Entry;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class DoubleLinkedList_set1 extends TestJPF {

	@Test
	public void test1() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		obj.size = 0;
		int index = 0;
		Object element = null;
		obj.modCount = 0;
		Object ele_119 = null;
		obj.header.element = ele_119;
		obj.header.next = obj.header;
		obj.header.previous = obj.header;
		System.out.println("1 " + obj.repOK());
		obj.set(index,element);
	}

	@Test
	public void test2() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry prev_3 = next_2;
		Entry this_header_112 = obj.header;
		obj.size = 1;
		int index = 0;
		Object element = null;
		obj.modCount = 0;
		Object ele_1 = null;
		Object ele_4 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_4;
		next_2.next = obj.header;
		next_2.previous = this_header_112;
		System.out.println("2 " + obj.repOK());
		obj.set(index,element);
	}

	@Test
	public void test3() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry next_5 = new Entry();
		Entry next_112 = next_2;
		Entry this_header_113 = obj.header;
		Entry prev_114 = next_5;
		obj.size = 2;
		int index = 0;
		Entry prev_3 = prev_114;
		Object element = null;
		obj.modCount = 0;
		Object ele_1 = null;
		Object ele_4 = null;
		Object ele_142 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_4;
		next_2.next = next_5;
		next_2.previous = obj.header;
		next_5.element = ele_142;
		next_5.next = this_header_113;
		next_5.previous = next_112;
		System.out.println("3 " + obj.repOK());
		obj.set(index,element);
	}

	@Test
	public void test4() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry next_5 = new Entry();
		Entry prev_3 = next_5;
		Entry this_header_112 = obj.header;
		Entry next_113 = next_2;
		obj.size = 2;
		int index = 1;
		Object element = null;
		obj.modCount = 0;
		Object ele_1 = null;
		Object ele_4 = null;
		Object ele_7 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_4;
		next_2.next = next_5;
		next_2.previous = obj.header;
		next_5.element = ele_7;
		next_5.next = this_header_112;
		next_5.previous = next_113;
		System.out.println("4 " + obj.repOK());
		obj.set(index,element);
	}

	@Test
	public void test5() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry next_5 = new Entry();
		Entry next_8 = new Entry();
		Entry next_112 = next_2;
		Entry next_113 = next_5;
		Entry this_header_114 = obj.header;
		Entry prev_115 = next_8;
		obj.size = 3;
		int index = 1;
		Entry prev_3 = prev_115;
		Object element = null;
		obj.modCount = 0;
		Object ele_1 = null;
		Object ele_4 = null;
		Object ele_7 = null;
		Object ele_153 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_4;
		next_2.next = next_5;
		next_2.previous = obj.header;
		next_5.element = ele_7;
		next_5.next = next_8;
		next_5.previous = next_112;
		next_8.element = ele_153;
		next_8.next = this_header_114;
		next_8.previous = next_113;
		System.out.println("5 " + obj.repOK());
		obj.set(index,element);
	}

	@Test
	public void test6() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		obj.size = 0;
		int index = -1;
		Object element = null;
		obj.modCount = 0;
		Object ele_118 = null;
		obj.header.element = ele_118;
		obj.header.next = obj.header;
		obj.header.previous = obj.header;
		System.out.println("6 " + obj.repOK());
		obj.set(index,element);
	}

}

