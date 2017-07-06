package gov.nasa.jpf.star.examples.doublelinkedlist;

import gov.nasa.jpf.star.examples.doublelinkedlist.DoubleLinkedList.Entry;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class DoubleLinkedList_removeI1 extends TestJPF {

	@Test
	public void test1() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		obj.size = 0;
		int index = 0;
		obj.modCount = 0;
		Object ele_119 = null;
		obj.header.element = ele_119;
		obj.header.next = obj.header;
		obj.header.previous = obj.header;
		obj.removeI(index);
	}

	@Test
	public void test2() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		obj.size = 0;
		int index = -1;
		obj.modCount = 0;
		Object ele_118 = null;
		obj.header.element = ele_118;
		obj.header.next = obj.header;
		obj.header.previous = obj.header;
		obj.removeI(index);
	}

}

