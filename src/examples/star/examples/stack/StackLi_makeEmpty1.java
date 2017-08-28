package star.examples.stack;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;
import star.examples.Utilities;

public class StackLi_makeEmpty1 extends TestJPF {

	@Test
	public void test_makeEmpty1() throws Exception {
		StackLi obj = new StackLi();
		obj.topOfStack = null;
		System.out.println(Utilities.repOK(obj));
		obj.makeEmpty();
	}

}

