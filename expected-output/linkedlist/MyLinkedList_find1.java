package linkedlist;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class MyLinkedList_find1 extends TestJPF {

	@Test
	public void test_find1() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = null;
		java.lang.Object x = null;
		obj._maxsize = 0;
		Object element = null;
		obj._header._element = element;
		obj._header._next = next;
		//System.out.println(Utilities.repOK(obj));
		obj.find(x);
	}

	@Test
	public void test_find2() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = new MyListNode();
		Object element_1 = new Object();
		MyListNode next_2 = null;
		java.lang.Object x = new java.lang.Object();
		obj._maxsize = 0;
		Object element = null;
		obj._header._element = element;
		obj._header._next = next;
		next._element = element_1;
		next._next = next_2;
		//System.out.println(Utilities.repOK(obj));
		obj.find(x);
	}

	@Test
	public void test_find3() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = new MyListNode();
		Object element_1 = new Object();
		MyListNode next_2 = new MyListNode();
		Object element_5 = new Object();
		java.lang.Object x = element_5;
		MyListNode next_6 = null;
		obj._maxsize = 0;
		Object element = null;
		obj._header._element = element;
		obj._header._next = next;
		next._element = element_1;
		next._next = next_2;
		next_2._element = element_5;
		next_2._next = next_6;
		//System.out.println(Utilities.repOK(obj));
		obj.find(x);
	}

	@Test
	public void test_find4() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = new MyListNode();
		Object element_1 = new Object();
		java.lang.Object x = element_1;
		MyListNode next_2 = null;
		obj._maxsize = 0;
		Object element = null;
		obj._header._element = element;
		obj._header._next = next;
		next._element = element_1;
		next._next = next_2;
		//System.out.println(Utilities.repOK(obj));
		obj.find(x);
	}

}

