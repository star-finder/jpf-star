package star.examples.doublelinkedlist;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;
import star.examples.Utilities;
import star.examples.doublelinkedlist.DoubleLinkedList.Entry;

public class DoubleLinkedList_add1 extends TestJPF {

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
		System.out.println(Utilities.repOK(obj));
		obj.add(o);
	}

}

