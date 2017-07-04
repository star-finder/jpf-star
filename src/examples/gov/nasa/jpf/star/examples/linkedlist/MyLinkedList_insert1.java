package gov.nasa.jpf.star.examples.linkedlist;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class MyLinkedList_insert1 extends TestJPF {

	@Test
	public void test1() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		MyLinkedListItr p = new MyLinkedListItr();
		MyListNode current = new MyListNode();
		MyListNode next = null;
		Object x = null;
		obj._header = null;
		obj._maxsize = 0;
		Object element = null;
		p._current = current;
		current._element = element;
		current._next = next;
		obj.insert(x,p);
	}

}

