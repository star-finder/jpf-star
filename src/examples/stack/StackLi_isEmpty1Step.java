package stack;

import org.junit.Test;

import basic.Utilities;
import gov.nasa.jpf.util.test.TestJPF;

public class StackLi_isEmpty1Step extends TestJPF {

	@Test
	public void test_isAcyclic1() throws Exception {
		StackLi obj = new StackLi();
		obj.topOfStack = null;
		if(Utilities.repOK(obj)) { obj.isEmpty(); }
//		obj.isAcyclic();
	}

}

