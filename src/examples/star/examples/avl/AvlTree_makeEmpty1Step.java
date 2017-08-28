package star.examples.avl;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;
import star.examples.Utilities;

public class AvlTree_makeEmpty1Step extends TestJPF {

	@Test
	public void test_repOK1() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = null;
		if(Utilities.repOK(obj)) {obj.makeEmpty();}
//		obj.repOK();
	}

}

