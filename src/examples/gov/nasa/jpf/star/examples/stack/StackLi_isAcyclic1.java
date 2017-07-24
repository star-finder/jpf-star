package gov.nasa.jpf.star.examples.stack;

import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class StackLi_isAcyclic1 extends TestJPF {

	@Test
	public void test_isAcyclic1() throws Exception {
		StackLi obj = new StackLi();
		obj.topOfStack = null;
		System.out.println(Utilities.repOK(obj));
		obj.isAcyclic();
	}

	@Test
	public void test_isAcyclic2() throws Exception {
		StackLi obj = new StackLi();
		obj.topOfStack = new ListNode();
		ListNode dest_4 = null;
		ListNode next_3 = dest_4;
		Object element_2 = null;
		obj.topOfStack.element = element_2;
		obj.topOfStack.next = next_3;
		System.out.println(Utilities.repOK(obj));
		obj.isAcyclic();
	}

	@Test
	public void test_isAcyclic3() throws Exception {
		StackLi obj = new StackLi();
		obj.topOfStack = new ListNode();
		ListNode next_3 = new ListNode();
		ListNode dest_4 = null;
		ListNode next_9 = dest_4;
		Object element_2 = null;
		Object element_8 = null;
		obj.topOfStack.element = element_2;
		obj.topOfStack.next = next_3;
		next_3.element = element_8;
		next_3.next = next_9;
		System.out.println(Utilities.repOK(obj));
		obj.isAcyclic();
	}

	@Test
	public void test_isAcyclic4() throws Exception {
		StackLi obj = new StackLi();
		obj.topOfStack = new ListNode();
		ListNode dest_4 = obj.topOfStack;
		ListNode next_3 = dest_4;
		Object element_2 = null;
		obj.topOfStack.element = element_2;
		obj.topOfStack.next = next_3;
		System.out.println(Utilities.repOK(obj));
		obj.isAcyclic();
	}

	@Test
	public void test_isAcyclic5() throws Exception {
		StackLi obj = new StackLi();
		obj.topOfStack = new ListNode();
		ListNode next_3 = new ListNode();
		ListNode dest_4 = obj.topOfStack;
		ListNode next_18 = dest_4;
		Object element_2 = null;
		Object element_17 = null;
		obj.topOfStack.element = element_2;
		obj.topOfStack.next = next_3;
		next_3.element = element_17;
		next_3.next = next_18;
		System.out.println(Utilities.repOK(obj));
		obj.isAcyclic();
	}

	@Test
	public void test_isAcyclic6() throws Exception {
		StackLi obj = new StackLi();
		obj.topOfStack = new ListNode();
		ListNode tmp_5 = new ListNode();
		ListNode dest_4 = tmp_5;
		ListNode next_3 = tmp_5;
		ListNode tmpNext_6 = dest_4;
		Object element_59 = new Object();
		Object element_2 = element_59;
		obj.topOfStack.element = element_2;
		obj.topOfStack.next = next_3;
		tmp_5.element = element_59;
		tmp_5.next = tmpNext_6;
		System.out.println(Utilities.repOK(obj));
		obj.isAcyclic();
	}

}

