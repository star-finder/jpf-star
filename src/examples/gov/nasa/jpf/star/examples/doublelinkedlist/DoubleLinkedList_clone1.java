package gov.nasa.jpf.star.examples.doublelinkedlist;

import gov.nasa.jpf.star.examples.doublelinkedlist.DoubleLinkedList.Entry;
import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class DoubleLinkedList_clone1 extends TestJPF {

	@Test
	public void test_clone1() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry this_header_112 = obj.header;
		obj.size = 0;
		obj.modCount = 0;
		Object ele_4 = null;
		obj.header.element = ele_4;
		obj.header.next = obj.header;
		obj.header.previous = this_header_112;
		System.out.println(Utilities.repOK(obj));
		obj.clone();
	}

	@Test
	public void test_clone2() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_5 = new Entry();
		Entry prev_6 = next_5;
		Entry this_header_112 = obj.header;
		obj.size = 1;
		obj.modCount = 0;
		Object ele_4 = null;
		Object ele_7 = null;
		obj.header.element = ele_4;
		obj.header.next = next_5;
		obj.header.previous = prev_6;
		next_5.element = ele_7;
		next_5.next = obj.header;
		next_5.previous = this_header_112;
		System.out.println(Utilities.repOK(obj));
		obj.clone();
	}

}

