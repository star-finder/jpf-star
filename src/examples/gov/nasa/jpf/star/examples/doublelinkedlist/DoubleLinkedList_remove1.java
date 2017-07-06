package gov.nasa.jpf.star.examples.doublelinkedlist;

import gov.nasa.jpf.star.examples.doublelinkedlist.DoubleLinkedList.Entry;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class DoubleLinkedList_remove1 extends TestJPF {

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
		obj.remove(o);
	}

	@Test
	public void test2() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Object o = null;
		Entry prev_3 = next_2;
		Object ele_4 = null;
		Entry e = obj.header;
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
		obj.remove(o);
	}

	@Test
	public void test3() throws Exception {
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
		obj.remove(o);
	}

	@Test
	public void test4() throws Exception {
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
		obj.remove(o);
	}

	@Test
	public void test5() throws Exception {
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
		obj.remove(o);
	}

	@Test
	public void test6() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry next_5 = new Entry();
		Object o = null;
		Object ele_4 = null;
		Entry e = obj.header;
		Entry next_112 = next_2;
		Entry this_header_113 = obj.header;
		Entry prev_114 = next_5;
		obj.size = 2;
		Entry prev_3 = prev_114;
		obj.modCount = 0;
		Object ele_1 = null;
		Object ele_145 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_4;
		next_2.next = next_5;
		next_2.previous = obj.header;
		next_5.element = ele_145;
		next_5.next = this_header_113;
		next_5.previous = next_112;
		obj.remove(o);
	}

	@Test
	public void test7() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry next_5 = new Entry();
		Object o = null;
		Object ele_4 = null;
		Entry prev_3 = next_5;
		Entry this_header_112 = obj.header;
		Entry next_113 = next_2;
		obj.size = 2;
		obj.modCount = 0;
		Object ele_1 = null;
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
		obj.remove(o);
	}

	@Test
	public void test8() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry next_5 = new Entry();
		Object o = null;
		Object ele_4 = null;
		Entry prev_3 = next_5;
		Entry this_header_112 = obj.header;
		Entry next_113 = next_2;
		obj.size = 2;
		obj.modCount = 0;
		Object ele_1 = null;
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
		obj.remove(o);
	}

	@Test
	public void test9() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry next_5 = new Entry();
		Entry next_8 = new Entry();
		Object o = null;
		Object ele_4 = null;
		Entry next_112 = next_2;
		Entry next_113 = next_5;
		Entry this_header_114 = obj.header;
		Entry prev_115 = next_8;
		obj.size = 3;
		Entry prev_3 = prev_115;
		obj.modCount = 0;
		Object ele_1 = null;
		Object ele_7 = null;
		Object ele_155 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_4;
		next_2.next = next_5;
		next_2.previous = obj.header;
		next_5.element = ele_7;
		next_5.next = next_8;
		next_5.previous = next_112;
		next_8.element = ele_155;
		next_8.next = this_header_114;
		next_8.previous = next_113;
		obj.remove(o);
	}

	@Test
	public void test10() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry next_5 = new Entry();
		Entry next_8 = new Entry();
		Object o = null;
		Object ele_4 = null;
		Entry next_112 = next_2;
		Entry next_113 = next_5;
		Entry this_header_114 = obj.header;
		Entry prev_115 = next_8;
		obj.size = 3;
		Entry prev_3 = prev_115;
		obj.modCount = 0;
		Object ele_1 = null;
		Object ele_7 = null;
		Object ele_155 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_4;
		next_2.next = next_5;
		next_2.previous = obj.header;
		next_5.element = ele_7;
		next_5.next = next_8;
		next_5.previous = next_112;
		next_8.element = ele_155;
		next_8.next = this_header_114;
		next_8.previous = next_113;
		obj.remove(o);
	}

	@Test
	public void test11() throws Exception {
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
		obj.remove(o);
	}

	@Test
	public void test12() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry prev_3 = next_2;
		Entry e = obj.header;
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
		obj.remove(o);
	}

	@Test
	public void test13() throws Exception {
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
		obj.remove(o);
	}

	@Test
	public void test14() throws Exception {
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
		obj.remove(o);
	}

	@Test
	public void test15() throws Exception {
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
		obj.remove(o);
	}

	@Test
	public void test16() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry next_5 = new Entry();
		Entry e = obj.header;
		Entry next_112 = next_2;
		Entry this_header_113 = obj.header;
		Entry prev_114 = next_5;
		obj.size = 2;
		Entry prev_3 = prev_114;
		Object o = null;
		obj.modCount = 0;
		Object ele_1 = null;
		Object ele_4 = null;
		Object ele_144 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_4;
		next_2.next = next_5;
		next_2.previous = obj.header;
		next_5.element = ele_144;
		next_5.next = this_header_113;
		next_5.previous = next_112;
		obj.remove(o);
	}

	@Test
	public void test17() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry next_5 = new Entry();
		Entry prev_3 = next_5;
		Entry this_header_112 = obj.header;
		Entry next_113 = next_2;
		obj.size = 2;
		Object o = null;
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
		obj.remove(o);
	}

	@Test
	public void test18() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry next_5 = new Entry();
		Entry prev_3 = next_5;
		Entry this_header_112 = obj.header;
		Entry next_113 = next_2;
		obj.size = 2;
		Object o = null;
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
		obj.remove(o);
	}

	@Test
	public void test19() throws Exception {
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
		Entry prev_3 = prev_115;
		Object o = null;
		obj.modCount = 0;
		Object ele_1 = null;
		Object ele_4 = null;
		Object ele_7 = null;
		Object ele_154 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_4;
		next_2.next = next_5;
		next_2.previous = obj.header;
		next_5.element = ele_7;
		next_5.next = next_8;
		next_5.previous = next_112;
		next_8.element = ele_154;
		next_8.next = this_header_114;
		next_8.previous = next_113;
		obj.remove(o);
	}

	@Test
	public void test20() throws Exception {
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
		Entry prev_3 = prev_115;
		Object o = null;
		obj.modCount = 0;
		Object ele_1 = null;
		Object ele_4 = null;
		Object ele_7 = null;
		Object ele_154 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_4;
		next_2.next = next_5;
		next_2.previous = obj.header;
		next_5.element = ele_7;
		next_5.next = next_8;
		next_5.previous = next_112;
		next_8.element = ele_154;
		next_8.next = this_header_114;
		next_8.previous = next_113;
		obj.remove(o);
	}

}

