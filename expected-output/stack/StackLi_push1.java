package stack;

import common.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class StackLi_push1 extends TestJPF {

	@Test
	public void test_push1() throws Exception {
		StackLi obj = new StackLi();
		obj.topOfStack = null;
		java.lang.Object x = null;
		//System.out.println(Utilities.repOK(obj));
		obj.push(x);
	}

	@Test
	public void test_push2() throws Exception {
		StackLi obj = new StackLi();
		obj.topOfStack = new ListNode();
		ListNode next_3 = null;
		java.lang.Object x = null;
		Object element_2 = null;
		obj.topOfStack.element = element_2;
		obj.topOfStack.next = next_3;
		//System.out.println(Utilities.repOK(obj));
		obj.push(x);
	}

}

