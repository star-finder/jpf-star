package star.examples.linkedlist;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;
import star.examples.Utilities;

public class MyLinkedList_clear1 extends TestJPF {

	@Test
	public void test_clear1() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = null;
		obj._maxsize = 0;
		Object element = null;
		obj._header._element = element;
		obj._header._next = next;
		System.out.println(Utilities.repOK(obj));
		obj.clear();
	}

}

