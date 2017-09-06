package stack;

import org.junit.Test;

import basic.Utilities;
import gov.nasa.jpf.util.test.TestJPF;

public class StackLi_isFull1 extends TestJPF {

	@Test
	public void test_isFull1() throws Exception {
		StackLi obj = new StackLi();
		obj.topOfStack = null;
		System.out.println(Utilities.repOK(obj));
		obj.isFull();
	}

}

