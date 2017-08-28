package star.examples.stack;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;
import star.examples.Utilities;

public class StackLi_makeEmpty1Step extends TestJPF {

	@Test
	public void test_isAcyclic1() throws Exception {
		StackLi obj = new StackLi();
		obj.topOfStack = null;
		if(Utilities.repOK(obj)) { obj.makeEmpty(); }
//		obj.isAcyclic();
	}

}

