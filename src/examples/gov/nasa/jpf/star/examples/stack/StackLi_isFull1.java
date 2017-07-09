package gov.nasa.jpf.star.examples.stack;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class StackLi_isFull1 extends TestJPF {

	@Test
	public void test1() throws Exception {
		StackLi obj = new StackLi();
		obj.topOfStack = null;
		obj.isFull();
	}

}

