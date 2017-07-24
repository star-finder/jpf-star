package gov.nasa.jpf.star.examples.stack;

import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class StackLi_contains1 extends TestJPF {

	@Test
	public void test_contains1() throws Exception {
		StackLi obj = new StackLi();
		obj.topOfStack = null;
		Object e = null;
		System.out.println(Utilities.repOK(obj));
		obj.contains(e);
	}

	@Test
	public void test_contains2() throws Exception {
		StackLi obj = new StackLi();
		obj.topOfStack = new ListNode();
		ListNode next_2 = null;
		Object e = new Object();
		Object element_1 = e;
		obj.topOfStack.element = element_1;
		obj.topOfStack.next = next_2;
		System.out.println(Utilities.repOK(obj));
		obj.contains(e);
	}

	@Test
	public void test_contains3() throws Exception {
		StackLi obj = new StackLi();
		obj.topOfStack = new ListNode();
		ListNode next_2 = null;
		Object e = new Object();
		Object element_1 = new Object();
		obj.topOfStack.element = element_1;
		obj.topOfStack.next = next_2;
		System.out.println(Utilities.repOK(obj));
		obj.contains(e);
	}

	@Test
	public void test_contains4() throws Exception {
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
		System.out.println(Utilities.repOK(obj));
		obj.contains(e);
	}

}

