package gov.nasa.jpf.star.examples.linkedlist;

import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class MyLinkedList_printList1 extends TestJPF {

	@Test
	public void test_printList1() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyLinkedList theList = new MyLinkedList();
		MyListNode header = new MyListNode();
		MyListNode nextH = null;
		MyListNode next = null;
		Object element_25 = new Object();
		Object element = element_25;
		obj._maxsize = 0;
		int size = 0;
		obj._header._element = element;
		obj._header._next = nextH;
		theList._header = header;
		theList._maxsize = size;
		header._element = element_25;
		header._next = next;
		System.out.println(Utilities.repOK(theList));
		obj.printList(theList);
	}

	@Test
	public void test_printList2() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyLinkedList theList = new MyLinkedList();
		MyListNode header = new MyListNode();
		MyListNode next = new MyListNode();
		Object element_1 = new Object();
		MyListNode nextH = null;
		MyListNode next_2 = null;
		Object element_25 = new Object();
		Object element = element_25;
		obj._maxsize = 0;
		int size = 0;
		obj._header._element = element;
		obj._header._next = nextH;
		theList._header = header;
		theList._maxsize = size;
		header._element = element_25;
		header._next = next;
		next._element = element_1;
		next._next = next_2;
		System.out.println(Utilities.repOK(theList));
		obj.printList(theList);
	}

}

