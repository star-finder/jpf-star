package gov.nasa.jpf.star.examples.linkedlist;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class MyLinkedList_printList1 extends TestJPF {

	@Test
	public void test_printList1() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		MyLinkedList theList = new MyLinkedList();
		MyListNode header = new MyListNode();
		MyListNode next = null;
		obj._header = null;
		obj._maxsize = 0;
		int size = 0;
		Object element = null;
		theList._header = header;
		theList._maxsize = size;
		header._element = element;
		header._next = next;
		obj.printList(theList);
	}

	@Test
	public void test_printList2() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		MyLinkedList theList = new MyLinkedList();
		MyListNode header = new MyListNode();
		MyListNode next = new MyListNode();
		Object element_1 = new Object();
		MyListNode next_2 = null;
		obj._header = null;
		obj._maxsize = 0;
		int size = 0;
		Object element = null;
		theList._header = header;
		theList._maxsize = size;
		header._element = element;
		header._next = next;
		next._element = element_1;
		next._next = next_2;
		obj.printList(theList);
	}

}

