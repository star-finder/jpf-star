package gov.nasa.jpf.star.examples.doublelinkedlist;

import gov.nasa.jpf.star.examples.doublelinkedlist.DoubleLinkedList.Entry;
import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class DoubleLinkedList_repOK1 extends TestJPF {

	@Test
	public void test_repOK1() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = null;
		obj.modCount = 0;
		obj.size = 0;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK2() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = obj.header;
		Entry previous_3 = obj.header;
		obj.size = 0;
		obj.modCount = 0;
		Object element_1 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK3() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = obj.header;
		Entry previous_3 = obj.header;
		obj.size = 2;
		obj.modCount = 0;
		Object element_1 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK4() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = obj.header;
		Entry previous_3 = next_2;
		obj.size = 0;
		obj.modCount = 0;
		Object element_1 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK5() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = obj.header;
		Entry previous_3 = next_2;
		obj.size = 2;
		obj.modCount = 0;
		Object element_1 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK6() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = obj.header;
		Entry previous_3 = null;
		obj.modCount = 0;
		obj.size = 0;
		Object element_1 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK7() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry previous_3 = new Entry();
		Entry next_2 = obj.header;
		obj.modCount = 0;
		obj.size = 0;
		Object element_1 = null;
		Object element_4 = null;
		Entry next_5 = null;
		Entry previous_6 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		previous_3.element = element_4;
		previous_3.next = next_5;
		previous_3.previous = previous_6;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK8() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = null;
		obj.modCount = 0;
		obj.size = 0;
		Object element_1 = null;
		Entry previous_3 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK9() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry previous_3 = obj.header;
		Entry previous_9 = obj.header;
		Entry next_8 = obj.header;
		obj.modCount = 0;
		obj.size = 0;
		Object element_1 = null;
		Object element_7 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK10() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry previous_3 = obj.header;
		Entry previous_9 = obj.header;
		Entry next_8 = next_2;
		obj.modCount = 0;
		obj.size = 0;
		Object element_1 = null;
		Object element_7 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK11() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry previous_3 = obj.header;
		Entry previous_9 = obj.header;
		Entry next_8 = previous_3;
		obj.modCount = 0;
		obj.size = 0;
		Object element_1 = null;
		Object element_7 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK12() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry previous_3 = obj.header;
		Entry previous_9 = obj.header;
		Entry next_8 = previous_9;
		obj.modCount = 0;
		obj.size = 0;
		Object element_1 = null;
		Object element_7 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK13() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry previous_3 = obj.header;
		Entry previous_9 = obj.header;
		Entry next_8 = null;
		obj.modCount = 0;
		obj.size = 0;
		Object element_1 = null;
		Object element_7 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK14() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry previous_3 = obj.header;
		Entry previous_9 = next_2;
		obj.modCount = 0;
		obj.size = 0;
		Object element_1 = null;
		Object element_7 = null;
		Entry next_8 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK15() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry previous_3 = obj.header;
		Entry previous_9 = previous_3;
		Entry next_8 = obj.header;
		obj.modCount = 0;
		obj.size = 0;
		Object element_1 = null;
		Object element_7 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK16() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry previous_3 = obj.header;
		Entry previous_9 = previous_3;
		Entry next_8 = next_2;
		obj.modCount = 0;
		obj.size = 0;
		Object element_1 = null;
		Object element_7 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK17() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry previous_3 = obj.header;
		Entry previous_9 = previous_3;
		Entry next_8 = previous_3;
		obj.modCount = 0;
		obj.size = 0;
		Object element_1 = null;
		Object element_7 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK18() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry previous_3 = obj.header;
		Entry previous_9 = previous_3;
		Entry next_8 = previous_9;
		obj.modCount = 0;
		obj.size = 0;
		Object element_1 = null;
		Object element_7 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK19() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry previous_3 = obj.header;
		Entry previous_9 = previous_3;
		Entry next_8 = null;
		obj.modCount = 0;
		obj.size = 0;
		Object element_1 = null;
		Object element_7 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK20() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry previous_3 = obj.header;
		Entry previous_9 = null;
		obj.modCount = 0;
		obj.size = 0;
		Object element_1 = null;
		Object element_7 = null;
		Entry next_8 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK21() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry previous_9 = new Entry();
		Entry previous_3 = obj.header;
		obj.modCount = 0;
		obj.size = 0;
		Object element_1 = null;
		Object element_7 = null;
		Entry next_8 = null;
		Object element_22 = null;
		Entry next_23 = null;
		Entry previous_24 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		previous_9.element = element_22;
		previous_9.next = next_23;
		previous_9.previous = previous_24;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK22() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry previous_3 = next_2;
		Entry previous_9 = obj.header;
		Entry next_8 = obj.header;
		obj.size = 1;
		obj.modCount = 0;
		Object element_1 = null;
		Object element_7 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK23() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry previous_3 = next_2;
		Entry previous_9 = obj.header;
		Entry next_8 = obj.header;
		obj.size = 3;
		obj.modCount = 0;
		Object element_1 = null;
		Object element_7 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK24() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry previous_3 = next_2;
		Entry previous_9 = obj.header;
		Entry next_8 = next_2;
		obj.modCount = 0;
		obj.size = 0;
		Object element_1 = null;
		Object element_7 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK25() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry previous_3 = next_2;
		Entry previous_9 = obj.header;
		Entry next_8 = previous_3;
		obj.modCount = 0;
		obj.size = 0;
		Object element_1 = null;
		Object element_7 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK26() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry previous_3 = next_2;
		Entry previous_9 = obj.header;
		Entry next_8 = previous_9;
		obj.size = 1;
		obj.modCount = 0;
		Object element_1 = null;
		Object element_7 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK27() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry previous_3 = next_2;
		Entry previous_9 = obj.header;
		Entry next_8 = previous_9;
		obj.size = 3;
		obj.modCount = 0;
		Object element_1 = null;
		Object element_7 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK28() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry previous_3 = next_2;
		Entry previous_9 = obj.header;
		Entry next_8 = null;
		obj.modCount = 0;
		obj.size = 0;
		Object element_1 = null;
		Object element_7 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK29() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry previous_3 = next_2;
		Entry previous_9 = next_2;
		obj.modCount = 0;
		obj.size = 0;
		Object element_1 = null;
		Object element_7 = null;
		Entry next_8 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK30() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry previous_3 = next_2;
		Entry previous_9 = previous_3;
		obj.modCount = 0;
		obj.size = 0;
		Object element_1 = null;
		Object element_7 = null;
		Entry next_8 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK31() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry previous_3 = next_2;
		Entry previous_9 = null;
		obj.modCount = 0;
		obj.size = 0;
		Object element_1 = null;
		Object element_7 = null;
		Entry next_8 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK32() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry previous_9 = new Entry();
		Entry previous_3 = next_2;
		obj.modCount = 0;
		obj.size = 0;
		Object element_1 = null;
		Object element_7 = null;
		Entry next_8 = null;
		Object element_31 = null;
		Entry next_32 = null;
		Entry previous_33 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		previous_9.element = element_31;
		previous_9.next = next_32;
		previous_9.previous = previous_33;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK33() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry previous_3 = null;
		obj.modCount = 0;
		obj.size = 0;
		Object element_1 = null;
		Object element_7 = null;
		Entry next_8 = null;
		Entry previous_9 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK34() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry previous_3 = new Entry();
		Entry previous_9 = obj.header;
		Entry next_8 = obj.header;
		obj.modCount = 0;
		obj.size = 0;
		Object element_1 = null;
		Object element_7 = null;
		Object element_34 = null;
		Entry next_35 = null;
		Entry previous_36 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		previous_3.element = element_34;
		previous_3.next = next_35;
		previous_3.previous = previous_36;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK35() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry previous_3 = new Entry();
		Entry previous_9 = obj.header;
		Entry next_8 = next_2;
		obj.modCount = 0;
		obj.size = 0;
		Object element_1 = null;
		Object element_7 = null;
		Object element_34 = null;
		Entry next_35 = null;
		Entry previous_36 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		previous_3.element = element_34;
		previous_3.next = next_35;
		previous_3.previous = previous_36;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK36() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry previous_3 = new Entry();
		Entry previous_9 = obj.header;
		Entry next_8 = previous_9;
		obj.modCount = 0;
		obj.size = 0;
		Object element_1 = null;
		Object element_7 = null;
		Object element_34 = null;
		Entry next_35 = null;
		Entry previous_36 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		previous_3.element = element_34;
		previous_3.next = next_35;
		previous_3.previous = previous_36;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK37() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry previous_3 = new Entry();
		Entry previous_9 = obj.header;
		Entry next_8 = null;
		obj.modCount = 0;
		obj.size = 0;
		Object element_1 = null;
		Object element_7 = null;
		Object element_34 = null;
		Entry next_35 = null;
		Entry previous_36 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		previous_3.element = element_34;
		previous_3.next = next_35;
		previous_3.previous = previous_36;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK38() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry previous_3 = new Entry();
		Entry previous_9 = next_2;
		obj.modCount = 0;
		obj.size = 0;
		Object element_1 = null;
		Object element_7 = null;
		Entry next_8 = null;
		Object element_34 = null;
		Entry next_35 = null;
		Entry previous_36 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		previous_3.element = element_34;
		previous_3.next = next_35;
		previous_3.previous = previous_36;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK39() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry previous_3 = new Entry();
		Entry previous_9 = previous_3;
		obj.modCount = 0;
		obj.size = 0;
		Object element_1 = null;
		Object element_7 = null;
		Entry next_8 = null;
		Object element_34 = null;
		Entry next_35 = null;
		Entry previous_36 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		previous_3.element = element_34;
		previous_3.next = next_35;
		previous_3.previous = previous_36;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK40() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry previous_3 = new Entry();
		Entry previous_9 = null;
		obj.modCount = 0;
		obj.size = 0;
		Object element_1 = null;
		Object element_7 = null;
		Entry next_8 = null;
		Object element_34 = null;
		Entry next_35 = null;
		Entry previous_36 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		previous_3.element = element_34;
		previous_3.next = next_35;
		previous_3.previous = previous_36;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK41() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = new Entry();
		Entry next_2 = new Entry();
		Entry previous_3 = new Entry();
		Entry previous_9 = new Entry();
		obj.modCount = 0;
		obj.size = 0;
		Object element_1 = null;
		Object element_7 = null;
		Entry next_8 = null;
		Object element_34 = null;
		Entry next_35 = null;
		Entry previous_36 = null;
		Object element_46 = null;
		Entry next_47 = null;
		Entry previous_48 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		previous_3.element = element_34;
		previous_3.next = next_35;
		previous_3.previous = previous_36;
		previous_9.element = element_46;
		previous_9.next = next_47;
		previous_9.previous = previous_48;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

}

