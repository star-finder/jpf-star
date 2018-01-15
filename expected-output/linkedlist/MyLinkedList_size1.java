package linkedlist;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class MyLinkedList_size1 extends TestJPF {

	@Test
	public void test_size1() throws Exception {
		MyLinkedList obj = new MyLinkedList();
		obj._header = new MyListNode();
		MyListNode next = null;
		obj._maxsize = 0;
		Object element = null;
		obj._header._element = element;
		obj._header._next = next;
		//System.out.println(Utilities.repOK(obj));
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
		//System.out.println(Utilities.repOK(obj));
		obj.size();
	}

}

