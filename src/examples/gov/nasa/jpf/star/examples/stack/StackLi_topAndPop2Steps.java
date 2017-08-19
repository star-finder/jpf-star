package gov.nasa.jpf.star.examples.stack;

import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class StackLi_topAndPop2Steps extends TestJPF {

	@Test
	public void test_isAcyclic1() throws Exception {
		StackLi obj = new StackLi();
		obj.topOfStack = null;
		if(Utilities.repOK(obj)) {obj.topAndPop();}
		//obj.isAcyclic();
	}

	@Test
	public void test_isAcyclic2() throws Exception {
		StackLi obj = new StackLi();
		obj.topOfStack = new ListNode();
		ListNode next_2 = obj.topOfStack;
		Object element_1 = null;
		obj.topOfStack.element = element_1;
		obj.topOfStack.next = next_2;
		if(Utilities.repOK(obj)) {obj.topAndPop();}
		//obj.isAcyclic();
	}

	@Test
	public void test_isAcyclic3() throws Exception {
		StackLi obj = new StackLi();
		obj.topOfStack = new ListNode();
		ListNode next_2 = null;
		Object element_1 = null;
		obj.topOfStack.element = element_1;
		obj.topOfStack.next = next_2;
		if(Utilities.repOK(obj)) {obj.topAndPop();}
		//obj.isAcyclic();
	}

}

