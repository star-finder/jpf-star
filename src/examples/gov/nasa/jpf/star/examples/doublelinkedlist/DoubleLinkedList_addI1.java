package gov.nasa.jpf.star.examples.doublelinkedlist;

import gov.nasa.jpf.star.examples.doublelinkedlist.DoubleLinkedList.Entry;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class DoubleLinkedList_addI1 extends TestJPF {

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
		obj.addI(index,element);
	}

	@Test
	public void test_addI4() throws Exception {
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
		obj.addI(index,element);
	}

}

