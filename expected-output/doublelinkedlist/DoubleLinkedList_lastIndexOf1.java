package doublelinkedlist;

import doublelinkedlist.DoubleLinkedList.Entry;
import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class DoubleLinkedList_lastIndexOf1 extends TestJPF {

	@Test
	public void test_lastIndexOf1() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry this_header_114 = obj.header;
		obj.size = 0;
		java.lang.Object o = new java.lang.Object();
		Object ele_1 = null;
		obj.modCount = 0;
		obj.header.element = ele_1;
		obj.header.next = obj.header;
		obj.header.previous = this_header_114;
		//System.out.println(Utilities.repOK(obj));
		obj.lastIndexOf(o);
	}

	@Test
	public void test_lastIndexOf2() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry prev_3 = new Entry();
		Entry prev_5 = new Entry();
		Entry prev_114 = prev_3;
		Entry this_header_115 = obj.header;
		Entry next_116 = prev_5;
		obj.size = 2;
		Entry next_2 = next_116;
		java.lang.Object o = new java.lang.Object();
		Object ele_4 = o;
		Object ele_144 = null;
		Object ele_1 = null;
		obj.modCount = 0;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		prev_3.element = ele_4;
		prev_3.next = obj.header;
		prev_3.previous = prev_5;
		prev_5.element = ele_144;
		prev_5.next = prev_114;
		prev_5.previous = this_header_115;
		//System.out.println(Utilities.repOK(obj));
		obj.lastIndexOf(o);
	}

	@Test
	public void test_lastIndexOf3() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry prev_3 = new Entry();
		Entry next_2 = prev_3;
		Entry this_header_114 = obj.header;
		obj.size = 1;
		java.lang.Object o = new java.lang.Object();
		Object ele_4 = new Object();
		Object ele_1 = null;
		obj.modCount = 0;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		prev_3.element = ele_4;
		prev_3.next = obj.header;
		prev_3.previous = this_header_114;
		//System.out.println(Utilities.repOK(obj));
		obj.lastIndexOf(o);
	}

	@Test
	public void test_lastIndexOf4() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry prev_3 = new Entry();
		java.lang.Object o = null;
		Entry next_2 = prev_3;
		Entry this_header_114 = obj.header;
		obj.size = 1;
		Object ele_4 = new Object();
		Object ele_1 = null;
		obj.modCount = 0;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		prev_3.element = ele_4;
		prev_3.next = obj.header;
		prev_3.previous = this_header_114;
		//System.out.println(Utilities.repOK(obj));
		obj.lastIndexOf(o);
	}

	@Test
	public void test_lastIndexOf5() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry prev_3 = new Entry();
		Entry next_2 = prev_3;
		Entry this_header_114 = obj.header;
		obj.size = 1;
		java.lang.Object o = new java.lang.Object();
		Object ele_4 = o;
		Object ele_1 = null;
		obj.modCount = 0;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		prev_3.element = ele_4;
		prev_3.next = obj.header;
		prev_3.previous = this_header_114;
		//System.out.println(Utilities.repOK(obj));
		obj.lastIndexOf(o);
	}

	@Test
	public void test_lastIndexOf6() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry prev_3 = new Entry();
		java.lang.Object o = null;
		Entry next_2 = prev_3;
		Object ele_4 = null;
		Entry this_header_114 = obj.header;
		obj.size = 1;
		Object ele_1 = null;
		obj.modCount = 0;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		prev_3.element = ele_4;
		prev_3.next = obj.header;
		prev_3.previous = this_header_114;
		//System.out.println(Utilities.repOK(obj));
		obj.lastIndexOf(o);
	}

	@Test
	public void test_lastIndexOf7() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		java.lang.Object o = null;
		Entry this_header_114 = obj.header;
		obj.size = 0;
		Object ele_1 = null;
		obj.modCount = 0;
		obj.header.element = ele_1;
		obj.header.next = obj.header;
		obj.header.previous = this_header_114;
		//System.out.println(Utilities.repOK(obj));
		obj.lastIndexOf(o);
	}

	@Test
	public void test_lastIndexOf8() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry prev_3 = new Entry();
		Entry prev_5 = new Entry();
		java.lang.Object o = null;
		Object ele_4 = null;
		Entry prev_114 = prev_3;
		Entry this_header_115 = obj.header;
		Entry next_116 = prev_5;
		obj.size = 2;
		Entry next_2 = next_116;
		Object ele_145 = null;
		Object ele_1 = null;
		obj.modCount = 0;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		prev_3.element = ele_4;
		prev_3.next = obj.header;
		prev_3.previous = prev_5;
		prev_5.element = ele_145;
		prev_5.next = prev_114;
		prev_5.previous = this_header_115;
		//System.out.println(Utilities.repOK(obj));
		obj.lastIndexOf(o);
	}

}

