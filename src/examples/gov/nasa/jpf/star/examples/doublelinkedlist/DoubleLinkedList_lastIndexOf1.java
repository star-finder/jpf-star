package gov.nasa.jpf.star.examples.doublelinkedlist;

import gov.nasa.jpf.star.examples.doublelinkedlist.DoubleLinkedList.Entry;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class DoubleLinkedList_lastIndexOf1 extends TestJPF {

	@Test
	public void test1() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Object o = null;
		Entry this_header_114 = obj.header;
		obj.size = 0;
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = obj.header;
		obj.header.previous = this_header_114;
		System.out.println("1 " + obj.repOK());
		obj.lastIndexOf(o);
	}

	@Test
	public void test2() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry prev_3 = new Entry();
		Object o = null;
		Entry next_2 = prev_3;
		Object ele_4 = null;
		Entry this_header_114 = obj.header;
		obj.size = 1;
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		prev_3.element = ele_4;
		prev_3.next = obj.header;
		prev_3.previous = this_header_114;
		System.out.println("2 " + obj.repOK());
		obj.lastIndexOf(o);
	}

	@Test
	public void test3() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry prev_3 = new Entry();
		Object o = null;
		Entry next_2 = prev_3;
		Entry this_header_114 = obj.header;
		obj.size = 1;
		Object ele_4 = new Object();
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		prev_3.element = ele_4;
		prev_3.next = obj.header;
		prev_3.previous = this_header_114;
		System.out.println("3 " + obj.repOK());
		obj.lastIndexOf(o);
	}

	@Test
	public void test4() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry prev_3 = new Entry();
		Entry prev_5 = new Entry();
		Object o = null;
		Object ele_4 = null;
		Entry prev_114 = prev_3;
		Entry this_header_115 = obj.header;
		Entry next_116 = prev_5;
		obj.size = 2;
		Entry next_2 = next_116;
		obj.modCount = 0;
		Object ele_1 = null;
		Object ele_145 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		prev_3.element = ele_4;
		prev_3.next = obj.header;
		prev_3.previous = prev_5;
		prev_5.element = ele_145;
		prev_5.next = prev_114;
		prev_5.previous = this_header_115;
		System.out.println("4 " + obj.repOK());
		obj.lastIndexOf(o);
	}

	@Test
	public void test5() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry prev_3 = new Entry();
		Entry prev_5 = new Entry();
		Object o = null;
		Entry next_2 = prev_5;
		Object ele_7 = null;
		Entry prev_114 = prev_3;
		Entry this_header_115 = obj.header;
		obj.size = 2;
		Object ele_4 = new Object();
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		prev_3.element = ele_4;
		prev_3.next = obj.header;
		prev_3.previous = prev_5;
		prev_5.element = ele_7;
		prev_5.next = prev_114;
		prev_5.previous = this_header_115;
		System.out.println("5 " + obj.repOK());
		obj.lastIndexOf(o);
	}

	@Test
	public void test6() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry prev_3 = new Entry();
		Entry prev_5 = new Entry();
		Object o = null;
		Entry next_2 = prev_5;
		Entry prev_114 = prev_3;
		Entry this_header_115 = obj.header;
		obj.size = 2;
		Object ele_4 = new Object();
		Object ele_7 = new Object();
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		prev_3.element = ele_4;
		prev_3.next = obj.header;
		prev_3.previous = prev_5;
		prev_5.element = ele_7;
		prev_5.next = prev_114;
		prev_5.previous = this_header_115;
		System.out.println("6 " + obj.repOK());
		obj.lastIndexOf(o);
	}

	@Test
	public void test7() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry prev_3 = new Entry();
		Entry prev_5 = new Entry();
		Entry prev_8 = new Entry();
		Object o = null;
		Object ele_7 = null;
		Entry prev_114 = prev_3;
		Entry prev_115 = prev_5;
		Entry this_header_116 = obj.header;
		Entry next_117 = prev_8;
		obj.size = 3;
		Entry next_2 = next_117;
		Object ele_4 = new Object();
		obj.modCount = 0;
		Object ele_1 = null;
		Object ele_160 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		prev_3.element = ele_4;
		prev_3.next = obj.header;
		prev_3.previous = prev_5;
		prev_5.element = ele_7;
		prev_5.next = prev_114;
		prev_5.previous = prev_8;
		prev_8.element = ele_160;
		prev_8.next = prev_115;
		prev_8.previous = this_header_116;
		System.out.println("7 " + obj.repOK());
		obj.lastIndexOf(o);
	}

	@Test
	public void test8() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry this_header_114 = obj.header;
		obj.size = 0;
		Object o = new Object();
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = obj.header;
		obj.header.previous = this_header_114;
		System.out.println("8 " + obj.repOK());
		obj.lastIndexOf(o);
	}

	@Test
	public void test9() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry prev_3 = new Entry();
		Entry next_2 = prev_3;
		Entry this_header_114 = obj.header;
		obj.size = 1;
		Object o = new Object();
		Object ele_4 = o;
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		prev_3.element = ele_4;
		prev_3.next = obj.header;
		prev_3.previous = this_header_114;
		System.out.println("9 " + obj.repOK());
		obj.lastIndexOf(o);
	}

	@Test
	public void test10() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry prev_3 = new Entry();
		Entry next_2 = prev_3;
		Entry this_header_114 = obj.header;
		obj.size = 1;
		Object o = new Object();
		Object ele_4 = new Object();
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		prev_3.element = ele_4;
		prev_3.next = obj.header;
		prev_3.previous = this_header_114;
		System.out.println("10 " + obj.repOK());
		obj.lastIndexOf(o);
	}

	@Test
	public void test11() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry prev_3 = new Entry();
		Entry prev_5 = new Entry();
		Entry prev_114 = prev_3;
		Entry this_header_115 = obj.header;
		Entry next_116 = prev_5;
		obj.size = 2;
		Entry next_2 = next_116;
		Object o = new Object();
		Object ele_4 = o;
		obj.modCount = 0;
		Object ele_1 = null;
		Object ele_144 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		prev_3.element = ele_4;
		prev_3.next = obj.header;
		prev_3.previous = prev_5;
		prev_5.element = ele_144;
		prev_5.next = prev_114;
		prev_5.previous = this_header_115;
		System.out.println("11 " + obj.repOK());
		obj.lastIndexOf(o);
	}

	@Test
	public void test12() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry prev_3 = new Entry();
		Entry prev_5 = new Entry();
		Entry next_2 = prev_5;
		Entry prev_114 = prev_3;
		Entry this_header_115 = obj.header;
		obj.size = 2;
		Object o = new Object();
		Object ele_4 = new Object();
		Object ele_7 = o;
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		prev_3.element = ele_4;
		prev_3.next = obj.header;
		prev_3.previous = prev_5;
		prev_5.element = ele_7;
		prev_5.next = prev_114;
		prev_5.previous = this_header_115;
		System.out.println("12 " + obj.repOK());
		obj.lastIndexOf(o);
	}

	@Test
	public void test13() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry prev_3 = new Entry();
		Entry prev_5 = new Entry();
		Entry next_2 = prev_5;
		Entry prev_114 = prev_3;
		Entry this_header_115 = obj.header;
		obj.size = 2;
		Object o = new Object();
		Object ele_4 = new Object();
		Object ele_7 = new Object();
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		prev_3.element = ele_4;
		prev_3.next = obj.header;
		prev_3.previous = prev_5;
		prev_5.element = ele_7;
		prev_5.next = prev_114;
		prev_5.previous = this_header_115;
		System.out.println("13 " + obj.repOK());
		obj.lastIndexOf(o);
	}

	@Test
	public void test14() throws Exception {
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
		Object o = new Object();
		Object ele_4 = new Object();
		Object ele_7 = o;
		obj.modCount = 0;
		Object ele_1 = null;
		Object ele_158 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		prev_3.element = ele_4;
		prev_3.next = obj.header;
		prev_3.previous = prev_5;
		prev_5.element = ele_7;
		prev_5.next = prev_114;
		prev_5.previous = prev_8;
		prev_8.element = ele_158;
		prev_8.next = prev_115;
		prev_8.previous = this_header_116;
		System.out.println("14 " + obj.repOK());
		obj.lastIndexOf(o);
	}

}

