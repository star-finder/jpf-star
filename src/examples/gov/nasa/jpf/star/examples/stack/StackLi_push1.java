package gov.nasa.jpf.star.examples.stack;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class StackLi_push1 extends TestJPF {

	@Test
	public void test1() throws Exception {
		StackLi obj = new StackLi();
		obj.topOfStack = null;
		Object x = null;
		obj.push(x);
	}

	@Test
	public void test2() throws Exception {
		StackLi obj = new StackLi();
		obj.topOfStack = new ListNode();
		ListNode next_2 = null;
		Object x = null;
		Object element_1 = null;
		obj.topOfStack.element = element_1;
		obj.topOfStack.next = next_2;
		obj.push(x);
	}

}

