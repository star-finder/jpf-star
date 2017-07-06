package gov.nasa.jpf.star.examples.doublelinkedlist;

import gov.nasa.jpf.star.examples.doublelinkedlist.DoubleLinkedList.Entry;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class DoubleLinkedList_contains1 extends TestJPF {

	@Test
	public void test1() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Object o = null;
		Entry this_header_112 = obj.header;
		obj.size = 0;
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = obj.header;
		obj.header.previous = this_header_112;
		obj.contains(o);
	}

	@Test
	public void test2() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Object o = null;
		Entry prev_3 = next_2;
		Object ele_4 = null;
		Entry this_header_112 = obj.header;
		obj.size = 1;
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_4;
		next_2.next = obj.header;
		next_2.previous = this_header_112;
		obj.contains(o);
	}

	@Test
	public void test3() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Object o = null;
		Entry prev_3 = next_2;
		Entry this_header_112 = obj.header;
		obj.size = 1;
		obj.modCount = 0;
		Object ele_1 = null;
		Object ele_4 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_4;
		next_2.next = obj.header;
		next_2.previous = this_header_112;
		obj.contains(o);
	}

	@Test
	public void test4() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry next_5 = new Entry();
		Object o = null;
		Object ele_4 = null;
		Entry next_112 = next_2;
		Entry this_header_113 = obj.header;
		Entry prev_114 = next_5;
		obj.size = 2;
		Entry prev_3 = prev_114;
		obj.modCount = 0;
		Object ele_1 = null;
		Object ele_143 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_4;
		next_2.next = next_5;
		next_2.previous = obj.header;
		next_5.element = ele_143;
		next_5.next = this_header_113;
		next_5.previous = next_112;
		obj.contains(o);
	}

	@Test
	public void test5() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry this_header_112 = obj.header;
		obj.size = 0;
		Object o = null;
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = obj.header;
		obj.header.previous = this_header_112;
		obj.contains(o);
	}

	@Test
	public void test6() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry prev_3 = next_2;
		Entry this_header_112 = obj.header;
		obj.size = 1;
		Object o = null;
		obj.modCount = 0;
		Object ele_1 = null;
		Object ele_4 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_4;
		next_2.next = obj.header;
		next_2.previous = this_header_112;
		obj.contains(o);
	}

	@Test
	public void test7() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry prev_3 = next_2;
		Entry this_header_112 = obj.header;
		obj.size = 1;
		Object o = null;
		obj.modCount = 0;
		Object ele_1 = null;
		Object ele_4 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_4;
		next_2.next = obj.header;
		next_2.previous = this_header_112;
		obj.contains(o);
	}

	@Test
	public void test8() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry next_5 = new Entry();
		Entry next_112 = next_2;
		Entry this_header_113 = obj.header;
		Entry prev_114 = next_5;
		obj.size = 2;
		Entry prev_3 = prev_114;
		Object o = null;
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
		obj.contains(o);
	}

}

