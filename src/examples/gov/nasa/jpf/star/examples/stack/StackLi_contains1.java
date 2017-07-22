package gov.nasa.jpf.star.examples.stack;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class StackLi_contains1 extends TestJPF {

	@Test
	public void test1() throws Exception {
		StackLi obj = new StackLi();
		obj.topOfStack = null;
		Object e = null;
		obj.contains(e);
	}

	@Test
	public void test2() throws Exception {
		StackLi obj = new StackLi();
		obj.topOfStack = new ListNode();
		ListNode next_2 = null;
		Object e = new Object();
		Object element_1 = e;
		obj.topOfStack.element = element_1;
		obj.topOfStack.next = next_2;
		obj.contains(e);
	}

	@Test
	public void test3() throws Exception {
		StackLi obj = new StackLi();
		obj.topOfStack = new ListNode();
		ListNode next_2 = null;
		Object e = new Object();
		Object element_1 = new Object();
		obj.topOfStack.element = element_1;
		obj.topOfStack.next = next_2;
		obj.contains(e);
	}

	@Test
	public void test4() throws Exception {
		StackLi obj = new StackLi();
		obj.topOfStack = new ListNode();
		ListNode next_2 = new ListNode();
		ListNode next_4 = null;
		Object e = new Object();
		Object element_1 = new Object();
		Object element_3 = e;
		obj.topOfStack.element = element_1;
		obj.topOfStack.next = next_2;
		next_2.element = element_3;
		next_2.next = next_4;
		obj.contains(e);
	}

	@Test
	public void test5() throws Exception {
		StackLi obj = new StackLi();
		obj.topOfStack = new ListNode();
		ListNode next_2 = new ListNode();
		ListNode next_4 = null;
		Object e = new Object();
		Object element_1 = new Object();
		Object element_3 = new Object();
		obj.topOfStack.element = element_1;
		obj.topOfStack.next = next_2;
		next_2.element = element_3;
		next_2.next = next_4;
		obj.contains(e);
	}

	@Test
	public void test6() throws Exception {
		StackLi obj = new StackLi();
		obj.topOfStack = new ListNode();
		ListNode next_2 = new ListNode();
		ListNode next_4 = new ListNode();
		ListNode next_6 = null;
		Object e = new Object();
		Object element_1 = new Object();
		Object element_3 = new Object();
		Object element_5 = e;
		obj.topOfStack.element = element_1;
		obj.topOfStack.next = next_2;
		next_2.element = element_3;
		next_2.next = next_4;
		next_4.element = element_5;
		next_4.next = next_6;
		obj.contains(e);
	}

}

