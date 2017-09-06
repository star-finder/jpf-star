package linkedlist;

import org.junit.Test;

import common.Utilities;
import gov.nasa.jpf.util.test.TestJPF;

public class MyLinkedList_repOK2Steps extends TestJPF {

	@Test
	public void test_repOK1() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = null;
		obj._maxsize = 0;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK2() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode _next_2 = obj._header;
		obj._maxsize = 0;
		Object _element_1 = null;
		obj._header._element = _element_1;
		obj._header._next = _next_2;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK3() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode _next_2 = null;
		obj._maxsize = 0;
		Object _element_1 = null;
		obj._header._element = _element_1;
		obj._header._next = _next_2;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

}

