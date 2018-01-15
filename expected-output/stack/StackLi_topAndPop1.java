package stack;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class StackLi_topAndPop1 extends TestJPF {

	@Test
	public void test_topAndPop1() throws Exception {
		StackLi obj = new StackLi();
		obj.topOfStack = null;
		//System.out.println(Utilities.repOK(obj));
		obj.topAndPop();
	}

	@Test
	public void test_topAndPop2() throws Exception {
		StackLi obj = new StackLi();
		obj.topOfStack = new ListNode();
		ListNode next_2 = null;
		Object element_1 = null;
		obj.topOfStack.element = element_1;
		obj.topOfStack.next = next_2;
		//System.out.println(Utilities.repOK(obj));
		obj.topAndPop();
	}

	@Test
	public void test_topAndPop3() throws Exception {
		StackLi obj = new StackLi();
		obj.topOfStack = new ListNode();
		ListNode next_2 = new ListNode();
		ListNode next_4 = null;
		Object element_3 = null;
		Object element_1 = null;
		obj.topOfStack.element = element_1;
		obj.topOfStack.next = next_2;
		next_2.element = element_3;
		next_2.next = next_4;
		//System.out.println(Utilities.repOK(obj));
		obj.topAndPop();
	}

}

