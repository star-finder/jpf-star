package gov.nasa.jpf.star.examples.doublelinkedlist;

import gov.nasa.jpf.star.examples.doublelinkedlist.DoubleLinkedList.Entry;
import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class DoubleLinkedList_getFirst1 extends TestJPF {

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
		System.out.println(Utilities.repOK(obj));
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
		System.out.println(Utilities.repOK(obj));
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
		System.out.println(Utilities.repOK(obj));
		obj.getFirst();
	}

}

