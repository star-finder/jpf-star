package gov.nasa.jpf.star.examples.linkedlist;

import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class MyLinkedList_insert1 extends TestJPF {

	@Test
	public void test_insert1() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = null;
		MyLinkedListItr p = null;
		Object x = null;
		obj._maxsize = 0;
		Object element = null;
		obj._header._element = element;
		obj._header._next = next;
		System.out.println(Utilities.repOK(obj));
		System.out.println(obj.repOKIns(p));
		obj.insert(x,p);
	}

	@Test
	public void test_insert2() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyLinkedListItr p = new MyLinkedListItr();
		MyListNode next = null;
		MyListNode current_1 = null;
		Object x = null;
		obj._maxsize = 0;
		Object element = null;
		obj._header._element = element;
		obj._header._next = next;
		p._current = current_1;
		System.out.println(Utilities.repOK(obj));
		System.out.println(obj.repOKIns(p));
		obj.insert(x,p);
	}

	@Test
	public void test_insert3() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyLinkedListItr p = new MyLinkedListItr();
		MyListNode current_1 = new MyListNode();
		Object element_2 = new Object();
		MyListNode next = null;
		MyListNode next_3 = null;
		Object x = null;
		obj._maxsize = 0;
		Object element = null;
		obj._header._element = element;
		obj._header._next = next;
		p._current = current_1;
		current_1._element = element_2;
		current_1._next = next_3;
		System.out.println(Utilities.repOK(obj));
		System.out.println(obj.repOKIns(p));
		obj.insert(x,p);
	}

}

