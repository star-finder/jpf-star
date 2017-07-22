package gov.nasa.jpf.star.examples.stack;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class StackLi_isAcyclic1 extends TestJPF {

	@Test
	public void test_isAcyclic1() throws Exception {
		StackLi obj = new StackLi();
		obj.topOfStack = null;
		obj.isAcyclic();
	}

	@Test
	public void test_isAcyclic2() throws Exception {
		StackLi obj = new StackLi();
		obj.topOfStack = new ListNode();
		ListNode next_3 = null;
		Object element_2 = null;
		obj.topOfStack.element = element_2;
		obj.topOfStack.next = next_3;
		obj.isAcyclic();
	}

	@Test
	public void test_isAcyclic3() throws Exception {
		StackLi obj = new StackLi();
		obj.topOfStack = new ListNode();
		ListNode next_3 = new ListNode();
		ListNode next_6 = null;
		Object element_2 = null;
		Object element_5 = null;
		obj.topOfStack.element = element_2;
		obj.topOfStack.next = next_3;
		next_3.element = element_5;
		next_3.next = next_6;
		obj.isAcyclic();
	}

}

