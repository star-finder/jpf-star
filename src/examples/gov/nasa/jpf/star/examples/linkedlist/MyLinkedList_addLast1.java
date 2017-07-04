package gov.nasa.jpf.star.examples.linkedlist;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class MyLinkedList_addLast1 extends TestJPF {

	@Test
	public void test1() {
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
	public void test2() {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = new MyListNode();
		MyListNode next_2 = null;
		Object x = null;
		obj._maxsize = 0;
		Object element = null;
		Object element_1 = null;
		obj._header._element = element;
		obj._header._next = next;
		next._element = element_1;
		next._next = next_2;
		obj.addLast(x);
	}

	@Test
	public void test3() {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = new MyListNode();
		MyListNode next_2 = new MyListNode();
		MyListNode next_4 = null;
		Object x = null;
		obj._maxsize = 0;
		Object element = null;
		Object element_1 = null;
		Object element_3 = null;
		obj._header._element = element;
		obj._header._next = next;
		next._element = element_1;
		next._next = next_2;
		next_2._element = element_3;
		next_2._next = next_4;
		obj.addLast(x);
	}

	@Test
	public void test4() {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = new MyListNode();
		MyListNode next_2 = new MyListNode();
		MyListNode next_4 = new MyListNode();
		MyListNode next_6 = null;
		Object x = null;
		obj._maxsize = 0;
		Object element = null;
		Object element_1 = null;
		Object element_3 = null;
		Object element_5 = null;
		obj._header._element = element;
		obj._header._next = next;
		next._element = element_1;
		next._next = next_2;
		next_2._element = element_3;
		next_2._next = next_4;
		next_4._element = element_5;
		next_4._next = next_6;
		obj.addLast(x);
	}

	@Test
	public void test5() {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = new MyListNode();
		MyListNode next_2 = new MyListNode();
		MyListNode next_4 = new MyListNode();
		MyListNode next_6 = new MyListNode();
		MyListNode next_8 = null;
		Object x = null;
		obj._maxsize = 0;
		Object element = null;
		Object element_1 = null;
		Object element_3 = null;
		Object element_5 = null;
		Object element_7 = null;
		obj._header._element = element;
		obj._header._next = next;
		next._element = element_1;
		next._next = next_2;
		next_2._element = element_3;
		next_2._next = next_4;
		next_4._element = element_5;
		next_4._next = next_6;
		next_6._element = element_7;
		next_6._next = next_8;
		obj.addLast(x);
	}

	@Test
	public void test6() {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = new MyListNode();
		MyListNode next_2 = new MyListNode();
		MyListNode next_4 = new MyListNode();
		MyListNode next_6 = new MyListNode();
		MyListNode next_8 = new MyListNode();
		MyListNode next_10 = null;
		Object x = null;
		obj._maxsize = 0;
		Object element = null;
		Object element_1 = null;
		Object element_3 = null;
		Object element_5 = null;
		Object element_7 = null;
		Object element_9 = null;
		obj._header._element = element;
		obj._header._next = next;
		next._element = element_1;
		next._next = next_2;
		next_2._element = element_3;
		next_2._next = next_4;
		next_4._element = element_5;
		next_4._next = next_6;
		next_6._element = element_7;
		next_6._next = next_8;
		next_8._element = element_9;
		next_8._next = next_10;
		obj.addLast(x);
	}

	@Test
	public void test7() {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = new MyListNode();
		MyListNode next_2 = new MyListNode();
		MyListNode next_4 = new MyListNode();
		MyListNode next_6 = new MyListNode();
		MyListNode next_8 = new MyListNode();
		MyListNode next_10 = new MyListNode();
		MyListNode next_12 = null;
		Object x = null;
		obj._maxsize = 0;
		Object element = null;
		Object element_1 = null;
		Object element_3 = null;
		Object element_5 = null;
		Object element_7 = null;
		Object element_9 = null;
		Object element_11 = null;
		obj._header._element = element;
		obj._header._next = next;
		next._element = element_1;
		next._next = next_2;
		next_2._element = element_3;
		next_2._next = next_4;
		next_4._element = element_5;
		next_4._next = next_6;
		next_6._element = element_7;
		next_6._next = next_8;
		next_8._element = element_9;
		next_8._next = next_10;
		next_10._element = element_11;
		next_10._next = next_12;
		obj.addLast(x);
	}

	@Test
	public void test8() {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = new MyListNode();
		MyListNode next_2 = new MyListNode();
		MyListNode next_4 = new MyListNode();
		MyListNode next_6 = new MyListNode();
		MyListNode next_8 = new MyListNode();
		MyListNode next_10 = new MyListNode();
		MyListNode next_12 = new MyListNode();
		MyListNode next_14 = null;
		Object x = null;
		obj._maxsize = 0;
		Object element = null;
		Object element_1 = null;
		Object element_3 = null;
		Object element_5 = null;
		Object element_7 = null;
		Object element_9 = null;
		Object element_11 = null;
		Object element_13 = null;
		obj._header._element = element;
		obj._header._next = next;
		next._element = element_1;
		next._next = next_2;
		next_2._element = element_3;
		next_2._next = next_4;
		next_4._element = element_5;
		next_4._next = next_6;
		next_6._element = element_7;
		next_6._next = next_8;
		next_8._element = element_9;
		next_8._next = next_10;
		next_10._element = element_11;
		next_10._next = next_12;
		next_12._element = element_13;
		next_12._next = next_14;
		obj.addLast(x);
	}

	@Test
	public void test9() {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = new MyListNode();
		MyListNode next_2 = new MyListNode();
		MyListNode next_4 = new MyListNode();
		MyListNode next_6 = new MyListNode();
		MyListNode next_8 = new MyListNode();
		MyListNode next_10 = new MyListNode();
		MyListNode next_12 = new MyListNode();
		MyListNode next_14 = new MyListNode();
		MyListNode next_16 = null;
		Object x = null;
		obj._maxsize = 0;
		Object element = null;
		Object element_1 = null;
		Object element_3 = null;
		Object element_5 = null;
		Object element_7 = null;
		Object element_9 = null;
		Object element_11 = null;
		Object element_13 = null;
		Object element_15 = null;
		obj._header._element = element;
		obj._header._next = next;
		next._element = element_1;
		next._next = next_2;
		next_2._element = element_3;
		next_2._next = next_4;
		next_4._element = element_5;
		next_4._next = next_6;
		next_6._element = element_7;
		next_6._next = next_8;
		next_8._element = element_9;
		next_8._next = next_10;
		next_10._element = element_11;
		next_10._next = next_12;
		next_12._element = element_13;
		next_12._next = next_14;
		next_14._element = element_15;
		next_14._next = next_16;
		obj.addLast(x);
	}

}

