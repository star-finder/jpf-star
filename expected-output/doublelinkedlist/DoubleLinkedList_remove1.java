package doublelinkedlist;

import doublelinkedlist.DoubleLinkedList.Entry;
import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class DoubleLinkedList_remove1 extends TestJPF {

	@Test
	public void test_remove1() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		java.lang.Object o = null;
		Entry this_header_112 = obj.header;
		obj.size = 0;
		Object ele_1 = null;
		obj.modCount = 0;
		obj.header.element = ele_1;
		obj.header.next = obj.header;
		obj.header.previous = this_header_112;
		//System.out.println(Utilities.repOK(obj));
		obj.remove(o);
	}

	@Test
	public void test_remove2() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry this_header_112 = obj.header;
		obj.size = 0;
		java.lang.Object o = new java.lang.Object();
		Object ele_1 = null;
		obj.modCount = 0;
		obj.header.element = ele_1;
		obj.header.next = obj.header;
		obj.header.previous = this_header_112;
		//System.out.println(Utilities.repOK(obj));
		obj.remove(o);
	}

	@Test
	public void test_remove3() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		java.lang.Object o = null;
		Entry prev_3 = next_2;
		Entry this_header_112 = obj.header;
		obj.size = 1;
		Object ele_4 = new Object();
		Object ele_1 = null;
		obj.modCount = 0;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_4;
		next_2.next = obj.header;
		next_2.previous = this_header_112;
		//System.out.println(Utilities.repOK(obj));
		obj.remove(o);
	}

	@Test
	public void test_remove4() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		java.lang.Object o = null;
		Entry prev_3 = next_2;
		Object ele_4 = null;
		Entry this_header_112 = obj.header;
		obj.size = 1;
		Object ele_1 = null;
		obj.modCount = 0;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_4;
		next_2.next = obj.header;
		next_2.previous = this_header_112;
		//System.out.println(Utilities.repOK(obj));
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
		java.lang.Object o = new java.lang.Object();
		Object ele_4 = o;
		Object ele_1 = null;
		obj.modCount = 0;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_4;
		next_2.next = obj.header;
		next_2.previous = this_header_112;
		//System.out.println(Utilities.repOK(obj));
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
		java.lang.Object o = new java.lang.Object();
		Object ele_4 = new Object();
		Object ele_1 = null;
		obj.modCount = 0;
		obj.header.element = ele_1;
		obj.header.next = next_2;
		obj.header.previous = prev_3;
		next_2.element = ele_4;
		next_2.next = obj.header;
		next_2.previous = this_header_112;
		//System.out.println(Utilities.repOK(obj));
		obj.remove(o);
	}

}

