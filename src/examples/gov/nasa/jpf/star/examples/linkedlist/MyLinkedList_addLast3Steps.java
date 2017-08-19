package gov.nasa.jpf.star.examples.linkedlist;

import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class MyLinkedList_addLast3Steps extends TestJPF {

	@Test
	public void test_repOK1() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = null;
		obj._maxsize = 0;
		if(Utilities.repOK(obj)) {obj.addLast(null);}
		//obj.repOK();
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
		if(Utilities.repOK(obj)) {obj.addLast(null);}
		//obj.repOK();
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
		if(Utilities.repOK(obj)) {obj.addLast(null);}
		//obj.repOK();
	}

	@Test
	public void test_repOK4() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode _next_2 = new MyListNode();
		MyListNode _next_4 = obj._header;
		obj._maxsize = 0;
		Object _element_1 = null;
		Object _element_3 = null;
		obj._header._element = _element_1;
		obj._header._next = _next_2;
		_next_2._element = _element_3;
		_next_2._next = _next_4;
		if(Utilities.repOK(obj)) {obj.addLast(null);}
		//obj.repOK();
	}

	@Test
	public void test_repOK5() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode _next_2 = new MyListNode();
		MyListNode _next_4 = _next_2;
		obj._maxsize = 0;
		Object _element_1 = null;
		Object _element_3 = null;
		obj._header._element = _element_1;
		obj._header._next = _next_2;
		_next_2._element = _element_3;
		_next_2._next = _next_4;
		if(Utilities.repOK(obj)) {obj.addLast(null);}
		//obj.repOK();
	}

	@Test
	public void test_repOK6() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode _next_2 = new MyListNode();
		MyListNode _next_4 = null;
		obj._maxsize = 0;
		Object _element_1 = null;
		Object _element_3 = null;
		obj._header._element = _element_1;
		obj._header._next = _next_2;
		_next_2._element = _element_3;
		_next_2._next = _next_4;
		if(Utilities.repOK(obj)) {obj.addLast(null);}
		//obj.repOK();
	}

}

