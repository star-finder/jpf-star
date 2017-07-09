package gov.nasa.jpf.star.examples.stack;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class StackLi_pop1 extends TestJPF {

	@Test
	public void test1() throws Exception {
		StackLi obj = new StackLi();
		obj.topOfStack = null;
		obj.pop();
	}

	@Test
	public void test2() throws Exception {
		StackLi obj = new StackLi();
		obj.topOfStack = new ListNode();
		ListNode next_2 = null;
		Object element_1 = null;
		obj.topOfStack.element = element_1;
		obj.topOfStack.next = next_2;
		obj.pop();
	}

	@Test
	public void test3() throws Exception {
		StackLi obj = new StackLi();
		obj.topOfStack = new ListNode();
		ListNode next_2 = new ListNode();
		ListNode next_4 = null;
		Object element_1 = null;
		Object element_3 = null;
		obj.topOfStack.element = element_1;
		obj.topOfStack.next = next_2;
		next_2.element = element_3;
		next_2.next = next_4;
		obj.pop();
	}

}

