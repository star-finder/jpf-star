package gov.nasa.jpf.star.examples.linkedlist;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class MyLinkedList_insert1 extends TestJPF {

	@Test
	public void test_insert1() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		MyLinkedListItr p = null;
		Object x = null;
		obj._header = null;
		obj._maxsize = 0;
		obj.insert(x,p);
	}

	@Test
	public void test_insert2() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		MyLinkedListItr p = new MyLinkedListItr();
		MyListNode current_1 = null;
		Object x = null;
		obj._header = null;
		obj._maxsize = 0;
		p._current = current_1;
		obj.insert(x,p);
	}

	@Test
	public void test_insert3() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		MyLinkedListItr p = new MyLinkedListItr();
		MyListNode current_1 = new MyListNode();
		Object element_2 = new Object();
		MyListNode next_3 = null;
		Object x = null;
		obj._header = null;
		obj._maxsize = 0;
		p._current = current_1;
		current_1._element = element_2;
		current_1._next = next_3;
		obj.insert(x,p);
	}

}

