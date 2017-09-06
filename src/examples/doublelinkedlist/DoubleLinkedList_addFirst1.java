package doublelinkedlist;

import org.junit.Test;

import common.Utilities;
import doublelinkedlist.DoubleLinkedList.Entry;
import gov.nasa.jpf.util.test.TestJPF;

public class DoubleLinkedList_addFirst1 extends TestJPF {

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
		System.out.println(Utilities.repOK(obj));
		obj.addFirst(o);
	}

}

