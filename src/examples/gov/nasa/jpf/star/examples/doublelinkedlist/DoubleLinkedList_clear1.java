package gov.nasa.jpf.star.examples.doublelinkedlist;

import gov.nasa.jpf.star.examples.doublelinkedlist.DoubleLinkedList.Entry;
import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class DoubleLinkedList_clear1 extends TestJPF {

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
		System.out.println(Utilities.repOK(obj));
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
		System.out.println(Utilities.repOK(obj));
		obj.clear();
	}

}

