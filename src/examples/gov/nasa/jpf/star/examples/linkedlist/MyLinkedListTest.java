package gov.nasa.jpf.star.examples.linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyLinkedListTest {

	@Test
	public void test_addLast1() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = null;
		Object x = null;
		obj._maxsize = 0;
		Object element = null;
		obj._header._element = element;
		obj._header._next = next;
		obj.addLast(x);
	}

	@Test
	public void test_addLast2() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = new MyListNode();
		Object element_1 = new Object();
		MyListNode next_2 = null;
		Object x = null;
		obj._maxsize = 0;
		Object element = null;
		obj._header._element = element;
		obj._header._next = next;
		next._element = element_1;
		next._next = next_2;
		obj.addLast(x);
	}
	
	@Test
	public void test_clear1() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = null;
		obj._maxsize = 0;
		Object element = null;
		obj._header._element = element;
		obj._header._next = next;
		obj.clear();
	}
	
	@Test
	public void test_find1() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = null;
		Object x = null;
		obj._maxsize = 0;
		Object element = null;
		obj._header._element = element;
		obj._header._next = next;
		obj.find(x);
	}

	@Test
	public void test_find2() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = new MyListNode();
		Object element_1 = new Object();
		Object x = element_1;
		MyListNode next_2 = null;
		obj._maxsize = 0;
		Object element = null;
		obj._header._element = element;
		obj._header._next = next;
		next._element = element_1;
		next._next = next_2;
		obj.find(x);
	}

	@Test
	public void test_find3() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = new MyListNode();
		Object element_1 = new Object();
		MyListNode next_2 = null;
		Object x = new Object();
		obj._maxsize = 0;
		Object element = null;
		obj._header._element = element;
		obj._header._next = next;
		next._element = element_1;
		next._next = next_2;
		obj.find(x);
	}

	@Test
	public void test_find4() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = new MyListNode();
		Object element_1 = new Object();
		MyListNode next_2 = new MyListNode();
		Object element_5 = new Object();
		Object x = element_5;
		MyListNode next_6 = null;
		obj._maxsize = 0;
		Object element = null;
		obj._header._element = element;
		obj._header._next = next;
		next._element = element_1;
		next._next = next_2;
		next_2._element = element_5;
		next_2._next = next_6;
		obj.find(x);
	}
	
	@Test
	public void test_findPrevious1() throws Exception {
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
	public void test_findPrevious2() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = new MyListNode();
		Object element_1 = new Object();
		Object x = element_1;
		MyListNode next_2 = null;
		obj._maxsize = 0;
		Object element = null;
		obj._header._element = element;
		obj._header._next = next;
		next._element = element_1;
		next._next = next_2;
		obj.findPrevious(x);
	}

	@Test
	public void test_findPrevious3() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = new MyListNode();
		Object element_1 = new Object();
		MyListNode next_2 = null;
		Object x = new Object();
		obj._maxsize = 0;
		Object element = null;
		obj._header._element = element;
		obj._header._next = next;
		next._element = element_1;
		next._next = next_2;
		obj.findPrevious(x);
	}

	@Test
	public void test_findPrevious4() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = new MyListNode();
		Object element_1 = new Object();
		MyListNode next_2 = new MyListNode();
		Object element_5 = new Object();
		Object x = element_5;
		MyListNode next_6 = null;
		obj._maxsize = 0;
		Object element = null;
		obj._header._element = element;
		obj._header._next = next;
		next._element = element_1;
		next._next = next_2;
		next_2._element = element_5;
		next_2._next = next_6;
		obj.findPrevious(x);
	}
	
	@Test
	public void test_first1() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = null;
		obj._maxsize = 0;
		Object element = null;
		obj._header._element = element;
		obj._header._next = next;
		obj.first();
	}

	@Test
	public void test_first2() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = new MyListNode();
		Object element_2 = new Object();
		MyListNode next_3 = null;
		obj._maxsize = 0;
		Object element = null;
		obj._header._element = element;
		obj._header._next = next;
		next._element = element_2;
		next._next = next_3;
		obj.first();
	}
	
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
	
	@Test
	public void test_isEmpty1() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = null;
		obj._maxsize = 0;
		Object element = null;
		obj._header._element = element;
		obj._header._next = next;
		obj.isEmpty();
	}

	@Test
	public void test_isEmpty2() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = new MyListNode();
		Object element_1 = new Object();
		MyListNode next_2 = null;
		obj._maxsize = 0;
		Object element = null;
		obj._header._element = element;
		obj._header._next = next;
		next._element = element_1;
		next._next = next_2;
		obj.isEmpty();
	}
	
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
	
	@Test
	public void test_remove1() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = null;
		Object x = null;
		obj._maxsize = 0;
		Object element = null;
		obj._header._element = element;
		obj._header._next = next;
		obj.remove(x);
	}

	@Test
	public void test_remove2() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = new MyListNode();
		Object element_1 = new Object();
		Object x = element_1;
		MyListNode next_2 = null;
		obj._maxsize = 0;
		Object element = null;
		obj._header._element = element;
		obj._header._next = next;
		next._element = element_1;
		next._next = next_2;
		obj.remove(x);
	}

	@Test
	public void test_remove3() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = new MyListNode();
		Object element_1 = new Object();
		MyListNode next_2 = new MyListNode();
		Object element_5 = new Object();
		Object x = element_1;
		MyListNode next_6 = null;
		obj._maxsize = 0;
		Object element = null;
		obj._header._element = element;
		obj._header._next = next;
		next._element = element_1;
		next._next = next_2;
		next_2._element = element_5;
		next_2._next = next_6;
		obj.remove(x);
	}

	@Test
	public void test_remove4() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = new MyListNode();
		Object element_1 = new Object();
		MyListNode next_2 = null;
		Object x = new Object();
		obj._maxsize = 0;
		Object element = null;
		obj._header._element = element;
		obj._header._next = next;
		next._element = element_1;
		next._next = next_2;
		obj.remove(x);
	}
	
	@Test
	public void test_size1() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = null;
		obj._maxsize = 0;
		Object element = null;
		obj._header._element = element;
		obj._header._next = next;
		obj.size();
	}

	@Test
	public void test_size2() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = new MyListNode();
		Object element_1 = new Object();
		MyListNode next_2 = null;
		obj._maxsize = 0;
		Object element = null;
		obj._header._element = element;
		obj._header._next = next;
		next._element = element_1;
		next._next = next_2;
		obj.size();
	}

}
