package gov.nasa.jpf.star.examples.linkedlist;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class MyLinkedList_findPrevious1 extends TestJPF {

	@Test
	public void test1() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = null;
		Object x = null;
		obj._maxsize = 0;
		Object element = null;
		obj._header._element = element;
		obj._header._next = next;
		obj.findPrevious(x);
	}

	@Test
	public void test2() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = new MyListNode();
		MyListNode next_2 = null;
		Object x = null;
		obj._maxsize = 0;
		Object element = null;
		Object element_1 = null;
		obj._header._element = element;
		obj._header._next = next;
		next._element = element_1;
		next._next = next_2;
		obj.findPrevious(x);
	}

}

