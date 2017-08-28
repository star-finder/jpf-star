package gov.nasa.jpf.star.examples.linkedlist;

import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class MyLinkedList_repOKIns1 extends TestJPF {

	@Test
	public void test_repOKIns1() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = null;
		MyLinkedListItr p = null;
		obj._maxsize = 0;
		System.out.println(Utilities.repOK(obj));
		obj.repOKIns(p);
	}

	@Test
	public void test_repOKIns2() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode _next_2 = obj._header;
		MyLinkedListItr p = null;
		obj._maxsize = 0;
		Object _element_1 = null;
		obj._header._element = _element_1;
		obj._header._next = _next_2;
		System.out.println(Utilities.repOK(obj));
		obj.repOKIns(p);
	}

	@Test
	public void test_repOKIns3() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode _next_2 = null;
		MyLinkedListItr p = null;
		obj._maxsize = 0;
		Object _element_1 = null;
		obj._header._element = _element_1;
		obj._header._next = _next_2;
		System.out.println(Utilities.repOK(obj));
		obj.repOKIns(p);
	}

	@Test
	public void test_repOKIns4() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode _next_2 = new MyListNode();
		MyListNode _next_7 = obj._header;
		MyLinkedListItr p = null;
		obj._maxsize = 0;
		Object _element_1 = null;
		Object _element_6 = null;
		obj._header._element = _element_1;
		obj._header._next = _next_2;
		_next_2._element = _element_6;
		_next_2._next = _next_7;
		System.out.println(Utilities.repOK(obj));
		obj.repOKIns(p);
	}

	@Test
	public void test_repOKIns5() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode _next_2 = new MyListNode();
		MyListNode _next_7 = _next_2;
		MyLinkedListItr p = null;
		obj._maxsize = 0;
		Object _element_1 = null;
		Object _element_6 = null;
		obj._header._element = _element_1;
		obj._header._next = _next_2;
		_next_2._element = _element_6;
		_next_2._next = _next_7;
		System.out.println(Utilities.repOK(obj));
		obj.repOKIns(p);
	}

}

