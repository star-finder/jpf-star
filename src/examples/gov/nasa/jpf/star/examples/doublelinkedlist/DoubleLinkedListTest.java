package gov.nasa.jpf.star.examples.doublelinkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

import gov.nasa.jpf.star.examples.doublelinkedlist.DoubleLinkedList.Entry;

public class DoubleLinkedListTest {

	@Test
	public void test_add1() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry this_header_114 = obj.header;
		obj.size = 0;
		Object o = null;
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = obj.header;
		obj.header.previous = this_header_114;
		System.out.println(obj.repOK());
		obj.add(o);
	}
	
	@Test
	public void test_addFirst1() throws Exception {
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
		System.out.println(obj.repOK());
		obj.addFirst(o);
	}
	
	@Test
	public void test_addI1() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry this_header_112 = obj.header;
		obj.size = 0;
		int index = 0;
		Object element = null;
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = obj.header;
		obj.header.previous = this_header_112;
		System.out.println(obj.repOK());
		obj.addI(index,element);
	}

	@Test
	public void test_addI2() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry this_header_112 = obj.header;
		Entry prev_113 = next_2;
		obj.size = 1;
		int index = 1;
		Entry prev_3 = prev_113;
		Object element = null;
		obj.modCount = 0;
		Object ele_1 = null;
		Object ele_130 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_130;
		next_2.next = this_header_112;
		next_2.previous = obj.header;
		System.out.println(obj.repOK());
		obj.addI(index,element);
	}

	@Test
	public void test_addI3() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		obj.size = 0;
		int index = 1;
		Object element = null;
		obj.modCount = 0;
		Object ele_121 = null;
		obj.header.element = ele_121;
		obj.header.next = obj.header;
		obj.header.previous = obj.header;
		System.out.println(obj.repOK());
		obj.addI(index,element);
	}

	@Test
	public void test_addI4() throws Exception {
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
		Object ele_8 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_8;
		next_2.next = obj.header;
		next_2.previous = this_header_112;
		System.out.println(obj.repOK());
		obj.addI(index,element);
	}

	@Test
	public void test_addI5() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry next_9 = new Entry();
		Entry next_112 = next_2;
		Entry this_header_113 = obj.header;
		Entry prev_114 = next_9;
		obj.size = 2;
		int index = 0;
		Entry prev_3 = prev_114;
		Object element = null;
		obj.modCount = 0;
		Object ele_1 = null;
		Object ele_8 = null;
		Object ele_144 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_8;
		next_2.next = next_9;
		next_2.previous = obj.header;
		next_9.element = ele_144;
		next_9.next = this_header_113;
		next_9.previous = next_112;
		System.out.println(obj.repOK());
		obj.addI(index,element);
	}

	@Test
	public void test_addI6() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		obj.size = 0;
		int index = -1;
		Object element = null;
		obj.modCount = 0;
		Object ele_120 = null;
		obj.header.element = ele_120;
		obj.header.next = obj.header;
		obj.header.previous = obj.header;
		System.out.println(obj.repOK());
		obj.addI(index,element);
	}
	
	@Test
	public void test_addLast1() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry this_header_114 = obj.header;
		obj.size = 0;
		Object o = null;
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = obj.header;
		obj.header.previous = this_header_114;
		System.out.println(obj.repOK());
		obj.addLast(o);
	}
	
	@Test
	public void test_clear1() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry this_header_112 = obj.header;
		obj.size = 0;
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = obj.header;
		obj.header.previous = this_header_112;
		System.out.println(obj.repOK());
		obj.clear();
	}

	@Test
	public void test_clear2() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry this_header_112 = obj.header;
		Entry prev_113 = next_2;
		obj.size = 1;
		Entry prev_3 = prev_113;
		obj.modCount = 0;
		Object ele_1 = null;
		Object ele_125 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_125;
		next_2.next = this_header_112;
		next_2.previous = obj.header;
		System.out.println(obj.repOK());
		obj.clear();
	}
	
	@Test
	public void test_contains1() throws Exception {
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
		System.out.println(obj.repOK());
		obj.contains(o);
	}

	@Test
	public void test_contains2() throws Exception {
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
		System.out.println(obj.repOK());
		obj.contains(o);
	}

	@Test
	public void test_contains3() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Object o = null;
		Entry prev_3 = next_2;
		Entry this_header_112 = obj.header;
		obj.size = 1;
		Object ele_4 = new Object();
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_4;
		next_2.next = obj.header;
		next_2.previous = this_header_112;
		System.out.println(obj.repOK());
		obj.contains(o);
	}

	@Test
	public void test_contains4() throws Exception {
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
		System.out.println(obj.repOK());
		obj.contains(o);
	}

	@Test
	public void test_contains5() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry this_header_112 = obj.header;
		obj.size = 0;
		Object o = new Object();
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = obj.header;
		obj.header.previous = this_header_112;
		System.out.println(obj.repOK());
		obj.contains(o);
	}

	@Test
	public void test_contains6() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry prev_3 = next_2;
		Entry this_header_112 = obj.header;
		obj.size = 1;
		Object o = new Object();
		Object ele_4 = o;
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_4;
		next_2.next = obj.header;
		next_2.previous = this_header_112;
		System.out.println(obj.repOK());
		obj.contains(o);
	}

	@Test
	public void test_contains7() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry prev_3 = next_2;
		Entry this_header_112 = obj.header;
		obj.size = 1;
		Object o = new Object();
		Object ele_4 = new Object();
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_4;
		next_2.next = obj.header;
		next_2.previous = this_header_112;
		System.out.println(obj.repOK());
		obj.contains(o);
	}

	@Test
	public void test_contains8() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry next_5 = new Entry();
		Entry next_112 = next_2;
		Entry this_header_113 = obj.header;
		Entry prev_114 = next_5;
		obj.size = 2;
		Entry prev_3 = prev_114;
		Object o = new Object();
		Object ele_4 = o;
		obj.modCount = 0;
		Object ele_1 = null;
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
		System.out.println(obj.repOK());
		obj.contains(o);
	}
	
	@Test
	public void test_get1() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		obj.size = 0;
		int index = 0;
		obj.modCount = 0;
		Object ele_119 = null;
		obj.header.element = ele_119;
		obj.header.next = obj.header;
		obj.header.previous = obj.header;
		System.out.println(obj.repOK());
		obj.get(index);
	}

	@Test
	public void test_get2() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_4 = new Entry();
		Entry prev_5 = next_4;
		Entry this_header_112 = obj.header;
		obj.size = 1;
		int index = 0;
		obj.modCount = 0;
		Object ele_3 = null;
		Object ele_6 = null;
		obj.header.element = ele_3;
		obj.header.next = next_4;
		obj.header.previous = prev_5;
		next_4.element = ele_6;
		next_4.next = obj.header;
		next_4.previous = this_header_112;
		System.out.println(obj.repOK());
		obj.get(index);
	}

	@Test
	public void test_get3() throws Exception {
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
		obj.modCount = 0;
		Object ele_3 = null;
		Object ele_6 = null;
		Object ele_142 = null;
		obj.header.element = ele_3;
		obj.header.next = next_4;
		obj.header.previous = prev_5;
		next_4.element = ele_6;
		next_4.next = next_7;
		next_4.previous = obj.header;
		next_7.element = ele_142;
		next_7.next = this_header_113;
		next_7.previous = next_112;
		System.out.println(obj.repOK());
		obj.get(index);
	}

	@Test
	public void test_get4() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		obj.size = 0;
		int index = -1;
		obj.modCount = 0;
		Object ele_118 = null;
		obj.header.element = ele_118;
		obj.header.next = obj.header;
		obj.header.previous = obj.header;
		System.out.println(obj.repOK());
		obj.get(index);
	}
	
	@Test
	public void test_getFirst1() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		obj.size = 0;
		obj.modCount = 0;
		Object ele_116 = null;
		obj.header.element = ele_116;
		obj.header.next = obj.header;
		obj.header.previous = obj.header;
		System.out.println(obj.repOK());
		obj.getFirst();
	}

	@Test
	public void test_getFirst2() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_3 = new Entry();
		Entry prev_4 = next_3;
		Entry this_header_112 = obj.header;
		obj.size = 1;
		obj.modCount = 0;
		Object ele_2 = null;
		Object ele_5 = null;
		obj.header.element = ele_2;
		obj.header.next = next_3;
		obj.header.previous = prev_4;
		next_3.element = ele_5;
		next_3.next = obj.header;
		next_3.previous = this_header_112;
		System.out.println(obj.repOK());
		obj.getFirst();
	}

	@Test
	public void test_getFirst3() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_3 = new Entry();
		Entry next_6 = new Entry();
		Entry next_112 = next_3;
		Entry this_header_113 = obj.header;
		Entry prev_114 = next_6;
		obj.size = 2;
		Entry prev_4 = prev_114;
		obj.modCount = 0;
		Object ele_2 = null;
		Object ele_5 = null;
		Object ele_137 = null;
		obj.header.element = ele_2;
		obj.header.next = next_3;
		obj.header.previous = prev_4;
		next_3.element = ele_5;
		next_3.next = next_6;
		next_3.previous = obj.header;
		next_6.element = ele_137;
		next_6.next = this_header_113;
		next_6.previous = next_112;
		System.out.println(obj.repOK());
		obj.getFirst();
	}
	
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
		System.out.println(obj.repOK());
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
		System.out.println(obj.repOK());
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
		System.out.println(obj.repOK());
		obj.getLast();
	}
	
	@Test
	public void test_inList1() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry e = obj.header;
		Entry this_header_112 = obj.header;
		obj.size = 0;
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = obj.header;
		obj.header.previous = this_header_112;
		System.out.println(obj.repOK());
		obj.inList(e);
	}

	@Test
	public void test_inList2() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry this_header_112 = obj.header;
		obj.size = 0;
		Entry e = new Entry();
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = obj.header;
		obj.header.previous = this_header_112;
		System.out.println(obj.repOK());
		obj.inList(e);
	}

	@Test
	public void test_inList3() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry e = obj.header;
		Entry this_header_112 = obj.header;
		Entry prev_113 = next_2;
		obj.size = 1;
		Entry prev_3 = prev_113;
		obj.modCount = 0;
		Object ele_1 = null;
		Object ele_127 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_127;
		next_2.next = this_header_112;
		next_2.previous = obj.header;
		System.out.println(obj.repOK());
		obj.inList(e);
	}

	@Test
	public void test_inList4() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry prev_3 = next_2;
		Entry e = next_2;
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
		System.out.println(obj.repOK());
		obj.inList(e);
	}

	@Test
	public void test_inList5() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry prev_3 = next_2;
		Entry this_header_112 = obj.header;
		obj.size = 1;
		Entry e = new Entry();
		obj.modCount = 0;
		Object ele_1 = null;
		Object ele_4 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_4;
		next_2.next = obj.header;
		next_2.previous = this_header_112;
		System.out.println(obj.repOK());
		obj.inList(e);
	}

	@Test
	public void test_inList6() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry next_5 = new Entry();
		Entry e = next_2;
		Entry next_112 = next_2;
		Entry this_header_113 = obj.header;
		Entry prev_114 = next_5;
		obj.size = 2;
		Entry prev_3 = prev_114;
		obj.modCount = 0;
		Object ele_1 = null;
		Object ele_4 = null;
		Object ele_141 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_4;
		next_2.next = next_5;
		next_2.previous = obj.header;
		next_5.element = ele_141;
		next_5.next = this_header_113;
		next_5.previous = next_112;
		System.out.println(obj.repOK());
		obj.inList(e);
	}
	
	@Test
	public void test_indexOf1() throws Exception {
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
		System.out.println(obj.repOK());
		obj.indexOf(o);
	}

	@Test
	public void test_indexOf2() throws Exception {
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
		System.out.println(obj.repOK());
		obj.indexOf(o);
	}

	@Test
	public void test_indexOf3() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Object o = null;
		Entry prev_3 = next_2;
		Entry this_header_112 = obj.header;
		obj.size = 1;
		Object ele_4 = new Object();
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_4;
		next_2.next = obj.header;
		next_2.previous = this_header_112;
		System.out.println(obj.repOK());
		obj.indexOf(o);
	}

	@Test
	public void test_indexOf4() throws Exception {
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
		System.out.println(obj.repOK());
		obj.indexOf(o);
	}

	@Test
	public void test_indexOf5() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry this_header_112 = obj.header;
		obj.size = 0;
		Object o = new Object();
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = obj.header;
		obj.header.previous = this_header_112;
		System.out.println(obj.repOK());
		obj.indexOf(o);
	}

	@Test
	public void test_indexOf6() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry prev_3 = next_2;
		Entry this_header_112 = obj.header;
		obj.size = 1;
		Object o = new Object();
		Object ele_4 = o;
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_4;
		next_2.next = obj.header;
		next_2.previous = this_header_112;
		System.out.println(obj.repOK());
		obj.indexOf(o);
	}

	@Test
	public void test_indexOf7() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry prev_3 = next_2;
		Entry this_header_112 = obj.header;
		obj.size = 1;
		Object o = new Object();
		Object ele_4 = new Object();
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_4;
		next_2.next = obj.header;
		next_2.previous = this_header_112;
		System.out.println(obj.repOK());
		obj.indexOf(o);
	}

	@Test
	public void test_indexOf8() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry next_5 = new Entry();
		Entry next_112 = next_2;
		Entry this_header_113 = obj.header;
		Entry prev_114 = next_5;
		obj.size = 2;
		Entry prev_3 = prev_114;
		Object o = new Object();
		Object ele_4 = o;
		obj.modCount = 0;
		Object ele_1 = null;
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
		System.out.println(obj.repOK());
		obj.indexOf(o);
	}
	
	@Test
	public void test_lastIndexOf1() throws Exception {
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
		System.out.println(obj.repOK());
		obj.lastIndexOf(o);
	}

	@Test
	public void test_lastIndexOf2() throws Exception {
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
		System.out.println(obj.repOK());
		obj.lastIndexOf(o);
	}

	@Test
	public void test_lastIndexOf3() throws Exception {
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
		System.out.println(obj.repOK());
		obj.lastIndexOf(o);
	}

	@Test
	public void test_lastIndexOf4() throws Exception {
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
		System.out.println(obj.repOK());
		obj.lastIndexOf(o);
	}

	@Test
	public void test_lastIndexOf5() throws Exception {
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
		System.out.println(obj.repOK());
		obj.lastIndexOf(o);
	}

	@Test
	public void test_lastIndexOf6() throws Exception {
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
		System.out.println(obj.repOK());
		obj.lastIndexOf(o);
	}

	@Test
	public void test_lastIndexOf7() throws Exception {
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
		System.out.println(obj.repOK());
		obj.lastIndexOf(o);
	}

	@Test
	public void test_lastIndexOf8() throws Exception {
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
		System.out.println(obj.repOK());
		obj.lastIndexOf(o);
	}
	
	@Test
	public void test_remove1() throws Exception {
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
		System.out.println(obj.repOK());
		obj.remove(o);
	}

	@Test
	public void test_remove2() throws Exception {
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
		System.out.println(obj.repOK());
		obj.remove(o);
	}

	@Test
	public void test_remove3() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Object o = null;
		Entry prev_3 = next_2;
		Entry this_header_112 = obj.header;
		obj.size = 1;
		Object ele_4 = new Object();
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_4;
		next_2.next = obj.header;
		next_2.previous = this_header_112;
		System.out.println(obj.repOK());
		obj.remove(o);
	}

	@Test
	public void test_remove4() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry this_header_112 = obj.header;
		obj.size = 0;
		Object o = new Object();
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = obj.header;
		obj.header.previous = this_header_112;
		System.out.println(obj.repOK());
		obj.remove(o);
	}

	@Test
	public void test_remove5() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry prev_3 = next_2;
		Entry this_header_112 = obj.header;
		obj.size = 1;
		Object o = new Object();
		Object ele_4 = o;
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_4;
		next_2.next = obj.header;
		next_2.previous = this_header_112;
		System.out.println(obj.repOK());
		obj.remove(o);
	}

	@Test
	public void test_remove6() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry prev_3 = next_2;
		Entry this_header_112 = obj.header;
		obj.size = 1;
		Object o = new Object();
		Object ele_4 = new Object();
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_4;
		next_2.next = obj.header;
		next_2.previous = this_header_112;
		System.out.println(obj.repOK());
		obj.remove(o);
	}
	
	@Test
	public void test_removeFirst1() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry this_header_112 = obj.header;
		obj.size = 0;
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = obj.header;
		obj.header.previous = this_header_112;
		System.out.println(obj.repOK());
		obj.removeFirst();
	}

	@Test
	public void test_removeFirst2() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry prev_3 = next_2;
		Entry this_header_112 = obj.header;
		obj.size = 1;
		obj.modCount = 0;
		Object ele_1 = null;
		Object ele_5 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_5;
		next_2.next = obj.header;
		next_2.previous = this_header_112;
		System.out.println(obj.repOK());
		obj.removeFirst();
	}
	
	@Test
	public void test_removeI1() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		obj.size = 0;
		int index = 0;
		obj.modCount = 0;
		Object ele_119 = null;
		obj.header.element = ele_119;
		obj.header.next = obj.header;
		obj.header.previous = obj.header;
		System.out.println(obj.repOK());
		obj.removeI(index);
	}

	@Test
	public void test_removeI2() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_4 = new Entry();
		Entry prev_5 = next_4;
		Entry this_header_112 = obj.header;
		obj.size = 1;
		int index = 0;
		obj.modCount = 0;
		Object ele_3 = null;
		Object ele_6 = null;
		obj.header.element = ele_3;
		obj.header.next = next_4;
		obj.header.previous = prev_5;
		next_4.element = ele_6;
		next_4.next = obj.header;
		next_4.previous = this_header_112;
		System.out.println(obj.repOK());
		obj.removeI(index);
	}

	@Test
	public void test_removeI3() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		obj.size = 0;
		int index = -1;
		obj.modCount = 0;
		Object ele_118 = null;
		obj.header.element = ele_118;
		obj.header.next = obj.header;
		obj.header.previous = obj.header;
		System.out.println(obj.repOK());
		obj.removeI(index);
	}
	
	@Test
	public void test_removeLast1() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry this_header_114 = obj.header;
		obj.size = 0;
		obj.modCount = 0;
		Object ele_1 = null;
		obj.header.element = ele_1;
		obj.header.next = obj.header;
		obj.header.previous = this_header_114;
		System.out.println(obj.repOK());
		obj.removeLast();
	}

	@Test
	public void test_removeLast2() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry prev_3 = new Entry();
		Entry next_2 = prev_3;
		Entry this_header_114 = obj.header;
		obj.size = 1;
		obj.modCount = 0;
		Object ele_1 = null;
		Object ele_5 = null;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		prev_3.element = ele_5;
		prev_3.next = obj.header;
		prev_3.previous = this_header_114;
		System.out.println(obj.repOK());
		obj.removeLast();
	}
	
	@Test
	public void test_set1() throws Exception {
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
		System.out.println(obj.repOK());
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
		Object element = null;
		obj.modCount = 0;
		Object ele_3 = null;
		Object ele_6 = null;
		obj.header.element = ele_3;
		obj.header.next = next_4;
		obj.header.previous = prev_5;
		next_4.element = ele_6;
		next_4.next = obj.header;
		next_4.previous = this_header_112;
		System.out.println(obj.repOK());
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
		Object element = null;
		obj.modCount = 0;
		Object ele_3 = null;
		Object ele_6 = null;
		Object ele_142 = null;
		obj.header.element = ele_3;
		obj.header.next = next_4;
		obj.header.previous = prev_5;
		next_4.element = ele_6;
		next_4.next = next_7;
		next_4.previous = obj.header;
		next_7.element = ele_142;
		next_7.next = this_header_113;
		next_7.previous = next_112;
		System.out.println(obj.repOK());
		obj.set(index,element);
	}

	@Test
	public void test_set4() throws Exception {
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
		System.out.println(obj.repOK());
		obj.set(index,element);
	}
	
	@Test
	public void test_size1() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		obj.size = 0;
		obj.modCount = 0;
		Object ele_114 = null;
		obj.header.element = ele_114;
		obj.header.next = obj.header;
		obj.header.previous = obj.header;
		System.out.println(obj.repOK());
		obj.size();
	}

}
