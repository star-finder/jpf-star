package gov.nasa.jpf.star.examples.doublelinkedlist;

import gov.nasa.jpf.star.examples.doublelinkedlist.DoubleLinkedList.Entry;
import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Main_sample1 extends TestJPF {

	@Test
	public void test_sample1() throws Exception {
		Main obj = new Main();
		Object o = new Object();
		DoubleLinkedList dll = new DoubleLinkedList();
		Entry header_2 = new Entry();
		Entry header_145 = header_2;
		Entry header_146 = header_2;
		int size_3 = 0;
		int modCount_1 = 0;
		Object ele_4 = null;
		dll.modCount = modCount_1;
		dll.header = header_2;
		dll.size = size_3;
		header_2.element = ele_4;
		header_2.next = header_145;
		header_2.previous = header_146;
		System.out.println(Utilities.repOK(dll));
		obj.sample(dll,o);
	}

	@Test
	public void test_sample2() throws Exception {
		Main obj = new Main();
		Object o = new Object();
		DoubleLinkedList dll = new DoubleLinkedList();
		Entry header_2 = new Entry();
		Entry first_6 = new Entry();
		Entry last_7 = first_6;
		Entry header_145 = header_2;
		Entry header_146 = header_2;
		int size_3 = 1;
		int modCount_1 = 0;
		Object eleH_5 = null;
		Object ele1_8 = null;
		dll.modCount = modCount_1;
		dll.header = header_2;
		dll.size = size_3;
		header_2.element = eleH_5;
		header_2.next = first_6;
		header_2.previous = last_7;
		first_6.element = ele1_8;
		first_6.next = header_145;
		first_6.previous = header_146;
		System.out.println(Utilities.repOK(dll));
		obj.sample(dll,o);
	}

	@Test
	public void test_sample3() throws Exception {
		Main obj = new Main();
		Object o = new Object();
		DoubleLinkedList dll = new DoubleLinkedList();
		Entry header_2 = new Entry();
		Entry first_6 = new Entry();
		Entry last_7 = new Entry();
		Entry prevF_10 = header_2;
		Entry nextL_12 = header_2;
		Entry first_145 = first_6;
		Entry last_146 = last_7;
		Entry nextF_9 = last_146;
		Entry prevL_147 = first_145;
		int size_3 = 2;
		Entry prevL_13 = prevL_147;
		int modCount_1 = 0;
		Object eleH_5 = null;
		Object ele1_8 = null;
		Object ele2_11 = null;
		dll.modCount = modCount_1;
		dll.header = header_2;
		dll.size = size_3;
		header_2.element = eleH_5;
		header_2.next = first_6;
		header_2.previous = last_7;
		first_6.element = ele1_8;
		first_6.next = nextF_9;
		first_6.previous = prevF_10;
		last_7.element = ele2_11;
		last_7.next = nextL_12;
		last_7.previous = prevL_13;
		System.out.println(Utilities.repOK(dll));
		obj.sample(dll,o);
	}

	@Test
	public void test_sample4() throws Exception {
		Main obj = new Main();
		Object o = new Object();
		DoubleLinkedList dll = new DoubleLinkedList();
		Entry header_2 = new Entry();
		Entry first_6 = new Entry();
		Entry last_7 = new Entry();
		Entry nextF_9 = new Entry();
		Entry next1_25 = new Entry();
		Entry prevF_10 = header_2;
		Entry nextL_12 = header_2;
		Entry prev1_26 = first_6;
		Entry prev1_30 = nextF_9;
		Entry next1_29 = last_7;
		Entry prevL_13 = next1_25;
		Entry newNode_21 = header_2;
		int size_3 = 4;
		int modCount_1 = 0;
		Object eleH_5 = null;
		Object ele1_8 = null;
		Object ele2_11 = null;
		Object item_24 = null;
		Object item_28 = null;
		dll.modCount = modCount_1;
		dll.header = header_2;
		dll.size = size_3;
		header_2.element = eleH_5;
		header_2.next = first_6;
		header_2.previous = last_7;
		first_6.element = ele1_8;
		first_6.next = nextF_9;
		first_6.previous = prevF_10;
		last_7.element = ele2_11;
		last_7.next = nextL_12;
		last_7.previous = prevL_13;
		nextF_9.element = item_24;
		nextF_9.next = next1_25;
		nextF_9.previous = prev1_26;
		next1_25.element = item_28;
		next1_25.next = next1_29;
		next1_25.previous = prev1_30;
		System.out.println(Utilities.repOK(dll));
		obj.sample(dll,o);
	}

	@Test
	public void test_sample5() throws Exception {
		Main obj = new Main();
		Object o = new Object();
		DoubleLinkedList dll = new DoubleLinkedList();
		Entry header_2 = new Entry();
		Entry first_6 = new Entry();
		Entry last_7 = new Entry();
		Entry nextF_9 = new Entry();
		Entry next1_25 = new Entry();
		Entry prevF_10 = header_2;
		Entry nextL_12 = header_2;
		Entry prev1_26 = first_6;
		Entry prev1_30 = nextF_9;
		Entry next1_29 = last_7;
		Entry prevL_13 = next1_25;
		int size_3 = 4;
		Entry newNode_21 = new Entry();
		int modCount_1 = 0;
		Object eleH_5 = null;
		Object ele1_8 = null;
		Object ele2_11 = null;
		Object item_24 = null;
		Object item_28 = null;
		dll.modCount = modCount_1;
		dll.header = header_2;
		dll.size = size_3;
		header_2.element = eleH_5;
		header_2.next = first_6;
		header_2.previous = last_7;
		first_6.element = ele1_8;
		first_6.next = nextF_9;
		first_6.previous = prevF_10;
		last_7.element = ele2_11;
		last_7.next = nextL_12;
		last_7.previous = prevL_13;
		nextF_9.element = item_24;
		nextF_9.next = next1_25;
		nextF_9.previous = prev1_26;
		next1_25.element = item_28;
		next1_25.next = next1_29;
		next1_25.previous = prev1_30;
		System.out.println(Utilities.repOK(dll));
		obj.sample(dll,o);
	}

	@Test
	public void test_sample6() throws Exception {
		Main obj = new Main();
		Object o = new Object();
		DoubleLinkedList dll = new DoubleLinkedList();
		Entry header_2 = new Entry();
		Entry first_6 = new Entry();
		Entry last_7 = new Entry();
		Entry nextF_9 = new Entry();
		Entry next1_25 = new Entry();
		Entry next1_29 = new Entry();
		Entry prevF_10 = header_2;
		Entry nextL_12 = header_2;
		Entry prev1_26 = first_6;
		Entry prev1_30 = nextF_9;
		Entry prev1_34 = next1_25;
		Entry next1_33 = last_7;
		Entry prevL_13 = next1_29;
		Object ele2_11 = o;
		int size_3 = 5;
		int modCount_1 = 0;
		Object eleH_5 = null;
		Object ele1_8 = null;
		Object item_24 = null;
		Object item_28 = null;
		Object item_32 = null;
		dll.modCount = modCount_1;
		dll.header = header_2;
		dll.size = size_3;
		header_2.element = eleH_5;
		header_2.next = first_6;
		header_2.previous = last_7;
		first_6.element = ele1_8;
		first_6.next = nextF_9;
		first_6.previous = prevF_10;
		last_7.element = ele2_11;
		last_7.next = nextL_12;
		last_7.previous = prevL_13;
		nextF_9.element = item_24;
		nextF_9.next = next1_25;
		nextF_9.previous = prev1_26;
		next1_25.element = item_28;
		next1_25.next = next1_29;
		next1_25.previous = prev1_30;
		next1_29.element = item_32;
		next1_29.next = next1_33;
		next1_29.previous = prev1_34;
		System.out.println(Utilities.repOK(dll));
		obj.sample(dll,o);
	}

	@Test
	public void test_sample7() throws Exception {
		Main obj = new Main();
		Object o = new Object();
		DoubleLinkedList dll = new DoubleLinkedList();
		Entry header_2 = new Entry();
		Entry first_6 = new Entry();
		Entry last_7 = new Entry();
		Entry nextF_9 = new Entry();
		Entry next1_25 = new Entry();
		Entry next1_29 = new Entry();
		Entry prevF_10 = header_2;
		Entry nextL_12 = header_2;
		Entry prev1_26 = first_6;
		Entry prev1_30 = nextF_9;
		Entry prev1_34 = next1_25;
		Entry next1_33 = last_7;
		Entry prevL_13 = next1_29;
		int size_3 = 5;
		Object ele2_11 = new Object();
		int modCount_1 = 0;
		Object eleH_5 = null;
		Object ele1_8 = null;
		Object item_24 = null;
		Object item_28 = null;
		Object item_32 = null;
		dll.modCount = modCount_1;
		dll.header = header_2;
		dll.size = size_3;
		header_2.element = eleH_5;
		header_2.next = first_6;
		header_2.previous = last_7;
		first_6.element = ele1_8;
		first_6.next = nextF_9;
		first_6.previous = prevF_10;
		last_7.element = ele2_11;
		last_7.next = nextL_12;
		last_7.previous = prevL_13;
		nextF_9.element = item_24;
		nextF_9.next = next1_25;
		nextF_9.previous = prev1_26;
		next1_25.element = item_28;
		next1_25.next = next1_29;
		next1_25.previous = prev1_30;
		next1_29.element = item_32;
		next1_29.next = next1_33;
		next1_29.previous = prev1_34;
		System.out.println(Utilities.repOK(dll));
		obj.sample(dll,o);
	}

}

