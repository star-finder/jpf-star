package gov.nasa.jpf.star.examples.doublelinkedlist;

import gov.nasa.jpf.star.examples.doublelinkedlist.DoubleLinkedList.Entry;
import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Main_sample5Steps extends TestJPF {

	@Test
	public void test_repOK1() throws Exception {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.header = null;
		obj.modCount = 0;
		obj.size = 0;
		if(Utilities.repOK(obj)) {Main m = new Main(); m.sample(obj, new Object());}
		//obj.repOK();
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
		if(Utilities.repOK(obj)) {Main m = new Main(); m.sample(obj, new Object());}
		//obj.repOK();
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
		if(Utilities.repOK(obj)) {Main m = new Main(); m.sample(obj, new Object());}
		//obj.repOK();
	}

	@Test
	public void test_repOK4() throws Exception {
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
		if(Utilities.repOK(obj)) {Main m = new Main(); m.sample(obj, new Object());}
		//obj.repOK();
	}

	@Test
	public void test_repOK5() throws Exception {
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
		if(Utilities.repOK(obj)) {Main m = new Main(); m.sample(obj, new Object());}
		//obj.repOK();
	}

	@Test
	public void test_repOK6() throws Exception {
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
		if(Utilities.repOK(obj)) {Main m = new Main(); m.sample(obj, new Object());}
		//obj.repOK();
	}

	@Test
	public void test_repOK7() throws Exception {
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
		if(Utilities.repOK(obj)) {Main m = new Main(); m.sample(obj, new Object());}
		//obj.repOK();
	}

	@Test
	public void test_repOK8() throws Exception {
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
		if(Utilities.repOK(obj)) {Main m = new Main(); m.sample(obj, new Object());}
		//obj.repOK();
	}

	@Test
	public void test_repOK9() throws Exception {
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
		if(Utilities.repOK(obj)) {Main m = new Main(); m.sample(obj, new Object());}
		//obj.repOK();
	}

	@Test
	public void test_repOK10() throws Exception {
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
		if(Utilities.repOK(obj)) {Main m = new Main(); m.sample(obj, new Object());}
		//obj.repOK();
	}

	@Test
	public void test_repOK11() throws Exception {
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
		if(Utilities.repOK(obj)) {Main m = new Main(); m.sample(obj, new Object());}
		//obj.repOK();
	}

	@Test
	public void test_repOK12() throws Exception {
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
		Object element_16 = null;
		Entry next_17 = null;
		Entry previous_18 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		previous_9.element = element_16;
		previous_9.next = next_17;
		previous_9.previous = previous_18;
		if(Utilities.repOK(obj)) {Main m = new Main(); m.sample(obj, new Object());}
		//obj.repOK();
	}

	@Test
	public void test_repOK13() throws Exception {
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
		if(Utilities.repOK(obj)) {Main m = new Main(); m.sample(obj, new Object());}
		//obj.repOK();
	}

	@Test
	public void test_repOK14() throws Exception {
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
		if(Utilities.repOK(obj)) {Main m = new Main(); m.sample(obj, new Object());}
		//obj.repOK();
	}

	@Test
	public void test_repOK15() throws Exception {
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
		if(Utilities.repOK(obj)) {Main m = new Main(); m.sample(obj, new Object());}
		//obj.repOK();
	}

	@Test
	public void test_repOK16() throws Exception {
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
		if(Utilities.repOK(obj)) {Main m = new Main(); m.sample(obj, new Object());}
		//obj.repOK();
	}

	@Test
	public void test_repOK17() throws Exception {
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
		if(Utilities.repOK(obj)) {Main m = new Main(); m.sample(obj, new Object());}
		//obj.repOK();
	}

	@Test
	public void test_repOK18() throws Exception {
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
		if(Utilities.repOK(obj)) {Main m = new Main(); m.sample(obj, new Object());}
		//obj.repOK();
	}

	@Test
	public void test_repOK19() throws Exception {
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
		Object element_25 = null;
		Entry next_26 = null;
		Entry previous_27 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		previous_9.element = element_25;
		previous_9.next = next_26;
		previous_9.previous = previous_27;
		if(Utilities.repOK(obj)) {Main m = new Main(); m.sample(obj, new Object());}
		//obj.repOK();
	}

	@Test
	public void test_repOK20() throws Exception {
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
		if(Utilities.repOK(obj)) {Main m = new Main(); m.sample(obj, new Object());}
		//obj.repOK();
	}

	@Test
	public void test_repOK21() throws Exception {
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
		Object element_28 = null;
		Entry next_29 = null;
		Entry previous_30 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		previous_3.element = element_28;
		previous_3.next = next_29;
		previous_3.previous = previous_30;
		if(Utilities.repOK(obj)) {Main m = new Main(); m.sample(obj, new Object());}
		//obj.repOK();
	}

	@Test
	public void test_repOK22() throws Exception {
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
		Object element_28 = null;
		Entry next_29 = null;
		Entry previous_30 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		previous_3.element = element_28;
		previous_3.next = next_29;
		previous_3.previous = previous_30;
		if(Utilities.repOK(obj)) {Main m = new Main(); m.sample(obj, new Object());}
		//obj.repOK();
	}

	@Test
	public void test_repOK23() throws Exception {
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
		Object element_28 = null;
		Entry next_29 = null;
		Entry previous_30 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		previous_3.element = element_28;
		previous_3.next = next_29;
		previous_3.previous = previous_30;
		if(Utilities.repOK(obj)) {Main m = new Main(); m.sample(obj, new Object());}
		//obj.repOK();
	}

	@Test
	public void test_repOK24() throws Exception {
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
		Object element_28 = null;
		Entry next_29 = null;
		Entry previous_30 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		previous_3.element = element_28;
		previous_3.next = next_29;
		previous_3.previous = previous_30;
		if(Utilities.repOK(obj)) {Main m = new Main(); m.sample(obj, new Object());}
		//obj.repOK();
	}

	@Test
	public void test_repOK25() throws Exception {
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
		Object element_28 = null;
		Entry next_29 = null;
		Entry previous_30 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		previous_3.element = element_28;
		previous_3.next = next_29;
		previous_3.previous = previous_30;
		if(Utilities.repOK(obj)) {Main m = new Main(); m.sample(obj, new Object());}
		//obj.repOK();
	}

	@Test
	public void test_repOK26() throws Exception {
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
		Object element_28 = null;
		Entry next_29 = null;
		Entry previous_30 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		previous_3.element = element_28;
		previous_3.next = next_29;
		previous_3.previous = previous_30;
		if(Utilities.repOK(obj)) {Main m = new Main(); m.sample(obj, new Object());}
		//obj.repOK();
	}

	@Test
	public void test_repOK27() throws Exception {
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
		Object element_28 = null;
		Entry next_29 = null;
		Entry previous_30 = null;
		Object element_40 = null;
		Entry next_41 = null;
		Entry previous_42 = null;
		obj.header.element = element_1;
		obj.header.next = next_2;
		obj.header.previous = previous_3;
		next_2.element = element_7;
		next_2.next = next_8;
		next_2.previous = previous_9;
		previous_3.element = element_28;
		previous_3.next = next_29;
		previous_3.previous = previous_30;
		previous_9.element = element_40;
		previous_9.next = next_41;
		previous_9.previous = previous_42;
		if(Utilities.repOK(obj)) {Main m = new Main(); m.sample(obj, new Object());}
		//obj.repOK();
	}

}

