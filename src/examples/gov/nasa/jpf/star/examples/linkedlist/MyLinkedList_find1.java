package gov.nasa.jpf.star.examples.linkedlist;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class MyLinkedList_find1 extends TestJPF {

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
		obj.find(x);
	}

	@Test
	public void test2() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = new MyListNode();
		Object element_1 = null;
		MyListNode next_2 = null;
		Object x = null;
		obj._maxsize = 0;
		Object element = null;
		obj._header._element = element;
		obj._header._next = next;
		next._element = element_1;
		next._next = next_2;
		obj.find(x);
	}

	@Test
	public void test3() throws Exception {
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
	public void test4() throws Exception {
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
	public void test5() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = new MyListNode();
		Object element_1 = new Object();
		MyListNode next_2 = new MyListNode();
		Object element_3 = null;
		MyListNode next_4 = null;
		Object x = new Object();
		obj._maxsize = 0;
		Object element = null;
		obj._header._element = element;
		obj._header._next = next;
		next._element = element_1;
		next._next = next_2;
		next_2._element = element_3;
		next_2._next = next_4;
		obj.find(x);
	}

	@Test
	public void test6() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = new MyListNode();
		Object element_1 = new Object();
		MyListNode next_2 = new MyListNode();
		Object element_3 = new Object();
		Object x = element_3;
		MyListNode next_4 = null;
		obj._maxsize = 0;
		Object element = null;
		obj._header._element = element;
		obj._header._next = next;
		next._element = element_1;
		next._next = next_2;
		next_2._element = element_3;
		next_2._next = next_4;
		obj.find(x);
	}

	@Test
	public void test7() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = new MyListNode();
		Object element_1 = new Object();
		MyListNode next_2 = new MyListNode();
		Object element_3 = new Object();
		MyListNode next_4 = null;
		Object x = new Object();
		obj._maxsize = 0;
		Object element = null;
		obj._header._element = element;
		obj._header._next = next;
		next._element = element_1;
		next._next = next_2;
		next_2._element = element_3;
		next_2._next = next_4;
		obj.find(x);
	}

	@Test
	public void test8() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = new MyListNode();
		Object element_1 = new Object();
		MyListNode next_2 = new MyListNode();
		Object element_3 = new Object();
		MyListNode next_4 = new MyListNode();
		Object element_5 = null;
		MyListNode next_6 = null;
		Object x = new Object();
		obj._maxsize = 0;
		Object element = null;
		obj._header._element = element;
		obj._header._next = next;
		next._element = element_1;
		next._next = next_2;
		next_2._element = element_3;
		next_2._next = next_4;
		next_4._element = element_5;
		next_4._next = next_6;
		obj.find(x);
	}

}

