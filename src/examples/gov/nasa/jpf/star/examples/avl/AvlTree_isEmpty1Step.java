package gov.nasa.jpf.star.examples.avl;

import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class AvlTree_isEmpty1Step extends TestJPF {

	@Test
	public void test_repOK1() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = null;
		if(Utilities.repOK(obj)) {obj.isEmpty();}
//		obj.repOK();
	}

}

