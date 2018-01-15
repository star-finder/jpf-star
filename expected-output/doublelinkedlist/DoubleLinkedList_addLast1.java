package doublelinkedlist;

import doublelinkedlist.DoubleLinkedList.Entry;
import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class DoubleLinkedList_addLast1 extends TestJPF {

	@Test
	public void test_addLast1() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry this_header_114 = obj.header;
		obj.size = 0;
		Object ele_1 = null;
		obj.modCount = 0;
		java.lang.Object o = null;
		obj.header.element = ele_1;
		obj.header.next = obj.header;
		obj.header.previous = this_header_114;
		//System.out.println(Utilities.repOK(obj));
		obj.addLast(o);
	}

}

