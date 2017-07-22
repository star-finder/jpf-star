package gov.nasa.jpf.star.examples.sample;

import gov.nasa.jpf.star.examples.sample.LinkedList.Node;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Main_sample1 extends TestJPF {

	@Test
	public void test1() throws Exception {
		Main obj = new Main();
		Object o = new Object();
		LinkedList dll = new LinkedList();
		Node first_2 = null;
		Node last_3 = null;
		int size_4 = 0;
		int modCount_1 = 0;
		dll.modCount = modCount_1;
		dll.first = first_2;
		dll.last = last_3;
		dll.size = size_4;
		obj.sample(dll,o);
	}

	@Test
	public void test2() throws Exception {
		Main obj = new Main();
		Object o = new Object();
		LinkedList dll = new LinkedList();
		Node first_2 = new Node();
		Object itemF_5 = new Object();
		Node nextF_6 = null;
		Node prevF_7 = null;
		Node last_3 = first_2;
		int size_4 = 1;
		int modCount_1 = 0;
		dll.modCount = modCount_1;
		dll.first = first_2;
		dll.last = last_3;
		dll.size = size_4;
		first_2.item = itemF_5;
		first_2.next = nextF_6;
		first_2.prev = prevF_7;
		obj.sample(dll,o);
	}

	@Test
	public void test3() throws Exception {
		Main obj = new Main();
		Object o = new Object();
		LinkedList dll = new LinkedList();
		Node first_2 = new Node();
		Node last_3 = new Node();
		Object itemF_5 = new Object();
		Object itemL_8 = new Object();
		Node nextF_6 = new Node();
		Object item_12 = new Object();
		Node next1_13 = new Node();
		Object item_16 = new Object();
		Node next1_17 = new Node();
		Object item_20 = new Object();
		Node next1_21 = new Node();
		Object item_24 = new Object();
		Node prevF_7 = null;
		Node nextL_9 = null;
		Node prev1_14 = first_2;
		Node prev1_18 = nextF_6;
		Node prev1_22 = next1_13;
		Node prev1_26 = next1_17;
		Node next1_25 = last_3;
		Node prevL_10 = next1_21;
		int size_4 = 6;
		int modCount_1 = 0;
		dll.modCount = modCount_1;
		dll.first = first_2;
		dll.last = last_3;
		dll.size = size_4;
		first_2.item = itemF_5;
		first_2.next = nextF_6;
		first_2.prev = prevF_7;
		last_3.item = itemL_8;
		last_3.next = nextL_9;
		last_3.prev = prevL_10;
		nextF_6.item = item_12;
		nextF_6.next = next1_13;
		nextF_6.prev = prev1_14;
		next1_13.item = item_16;
		next1_13.next = next1_17;
		next1_13.prev = prev1_18;
		next1_17.item = item_20;
		next1_17.next = next1_21;
		next1_17.prev = prev1_22;
		next1_21.item = item_24;
		next1_21.next = next1_25;
		next1_21.prev = prev1_26;
		obj.sample(dll,o);
	}

	@Test
	public void test4() throws Exception {
		Main obj = new Main();
		Object o = new Object();
		LinkedList dll = new LinkedList();
		Node first_2 = new Node();
		Node last_3 = new Node();
		Object itemF_5 = new Object();
		Object itemL_8 = new Object();
		Node nextF_6 = new Node();
		Object item_12 = new Object();
		Node next1_13 = new Node();
		Object item_16 = new Object();
		Node next1_17 = new Node();
		Object item_20 = new Object();
		Node next1_21 = new Node();
		Object item_24 = new Object();
		Node next1_25 = new Node();
		Object item_28 = new Object();
		Node prevF_7 = null;
		Node nextL_9 = null;
		Node prev1_14 = first_2;
		Node prev1_18 = nextF_6;
		Node prev1_22 = next1_13;
		Node prev1_26 = next1_17;
		Node prev1_30 = next1_21;
		Node next1_29 = last_3;
		Node prevL_10 = next1_25;
		int size_4 = 7;
		int modCount_1 = 0;
		dll.modCount = modCount_1;
		dll.first = first_2;
		dll.last = last_3;
		dll.size = size_4;
		first_2.item = itemF_5;
		first_2.next = nextF_6;
		first_2.prev = prevF_7;
		last_3.item = itemL_8;
		last_3.next = nextL_9;
		last_3.prev = prevL_10;
		nextF_6.item = item_12;
		nextF_6.next = next1_13;
		nextF_6.prev = prev1_14;
		next1_13.item = item_16;
		next1_13.next = next1_17;
		next1_13.prev = prev1_18;
		next1_17.item = item_20;
		next1_17.next = next1_21;
		next1_17.prev = prev1_22;
		next1_21.item = item_24;
		next1_21.next = next1_25;
		next1_21.prev = prev1_26;
		next1_25.item = item_28;
		next1_25.next = next1_29;
		next1_25.prev = prev1_30;
		obj.sample(dll,o);
	}

	@Test
	public void test5() throws Exception {
		Main obj = new Main();
		Object o = new Object();
		LinkedList dll = new LinkedList();
		Node first_2 = new Node();
		Node last_3 = new Node();
		Object itemF_5 = new Object();
		Object itemL_8 = new Object();
		Node nextF_6 = new Node();
		Object item_12 = new Object();
		Node next1_13 = new Node();
		Object item_16 = new Object();
		Node next1_17 = new Node();
		Object item_20 = new Object();
		Node next1_21 = new Node();
		Object item_24 = new Object();
		Node next1_25 = new Node();
		Object item_28 = new Object();
		Node next1_29 = new Node();
		Object item_32 = new Object();
		Node prevF_7 = null;
		Node nextL_9 = null;
		Node prev1_14 = first_2;
		Node prev1_18 = nextF_6;
		Node prev1_22 = next1_13;
		Node prev1_26 = next1_17;
		Node prev1_30 = next1_21;
		Node prev1_34 = next1_25;
		Node next1_33 = last_3;
		Node prevL_10 = next1_29;
		int size_4 = 8;
		int modCount_1 = 0;
		dll.modCount = modCount_1;
		dll.first = first_2;
		dll.last = last_3;
		dll.size = size_4;
		first_2.item = itemF_5;
		first_2.next = nextF_6;
		first_2.prev = prevF_7;
		last_3.item = itemL_8;
		last_3.next = nextL_9;
		last_3.prev = prevL_10;
		nextF_6.item = item_12;
		nextF_6.next = next1_13;
		nextF_6.prev = prev1_14;
		next1_13.item = item_16;
		next1_13.next = next1_17;
		next1_13.prev = prev1_18;
		next1_17.item = item_20;
		next1_17.next = next1_21;
		next1_17.prev = prev1_22;
		next1_21.item = item_24;
		next1_21.next = next1_25;
		next1_21.prev = prev1_26;
		next1_25.item = item_28;
		next1_25.next = next1_29;
		next1_25.prev = prev1_30;
		next1_29.item = item_32;
		next1_29.next = next1_33;
		next1_29.prev = prev1_34;
		obj.sample(dll,o);
	}

	@Test
	public void test6() throws Exception {
		Main obj = new Main();
		Object o = new Object();
		LinkedList dll = new LinkedList();
		Node first_2 = new Node();
		Node last_3 = new Node();
		Object itemF_5 = new Object();
		Object itemL_8 = new Object();
		Node nextF_6 = new Node();
		Object item_12 = new Object();
		Node next1_13 = new Node();
		Object item_16 = new Object();
		Node next1_17 = new Node();
		Object item_20 = new Object();
		Node next1_21 = new Node();
		Object item_24 = new Object();
		Node next1_25 = new Node();
		Object item_28 = new Object();
		Node next1_29 = new Node();
		Object item_32 = new Object();
		Node next1_33 = new Node();
		Object item_36 = new Object();
		Node prevF_7 = null;
		Node nextL_9 = null;
		Node prev1_14 = first_2;
		Node prev1_18 = nextF_6;
		Node prev1_22 = next1_13;
		Node prev1_26 = next1_17;
		Node prev1_30 = next1_21;
		Node prev1_34 = next1_25;
		Node prev1_38 = next1_29;
		Node next1_135 = next1_33;
		Node last_136 = last_3;
		Node next1_37 = last_136;
		Node prevL_137 = next1_135;
		int size_4 = 9;
		Node prevL_10 = prevL_137;
		int modCount_1 = 0;
		dll.modCount = modCount_1;
		dll.first = first_2;
		dll.last = last_3;
		dll.size = size_4;
		first_2.item = itemF_5;
		first_2.next = nextF_6;
		first_2.prev = prevF_7;
		last_3.item = itemL_8;
		last_3.next = nextL_9;
		last_3.prev = prevL_10;
		nextF_6.item = item_12;
		nextF_6.next = next1_13;
		nextF_6.prev = prev1_14;
		next1_13.item = item_16;
		next1_13.next = next1_17;
		next1_13.prev = prev1_18;
		next1_17.item = item_20;
		next1_17.next = next1_21;
		next1_17.prev = prev1_22;
		next1_21.item = item_24;
		next1_21.next = next1_25;
		next1_21.prev = prev1_26;
		next1_25.item = item_28;
		next1_25.next = next1_29;
		next1_25.prev = prev1_30;
		next1_29.item = item_32;
		next1_29.next = next1_33;
		next1_29.prev = prev1_34;
		next1_33.item = item_36;
		next1_33.next = next1_37;
		next1_33.prev = prev1_38;
		obj.sample(dll,o);
	}

	@Test
	public void test7() throws Exception {
		Main obj = new Main();
		Object o = new Object();
		LinkedList dll = new LinkedList();
		Node first_2 = new Node();
		Node last_3 = new Node();
		Object itemF_5 = new Object();
		Object itemL_8 = new Object();
		Node prevF_7 = null;
		Node nextL_9 = null;
		Node first_135 = first_2;
		Node last_136 = last_3;
		Node nextF_6 = last_136;
		Node prevL_137 = first_135;
		int size_4 = 2;
		Node prevL_10 = prevL_137;
		int modCount_1 = 0;
		dll.modCount = modCount_1;
		dll.first = first_2;
		dll.last = last_3;
		dll.size = size_4;
		first_2.item = itemF_5;
		first_2.next = nextF_6;
		first_2.prev = prevF_7;
		last_3.item = itemL_8;
		last_3.next = nextL_9;
		last_3.prev = prevL_10;
		obj.sample(dll,o);
	}

}

