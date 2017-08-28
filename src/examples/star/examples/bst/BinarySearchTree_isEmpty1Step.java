package star.examples.bst;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;
import star.examples.Utilities;

public class BinarySearchTree_isEmpty1Step extends TestJPF {

	@Test
	public void test_repOK1() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = null;
		obj.root = t;
		if(Utilities.repOK(obj)) {obj.isEmpty();}
//		obj.repOK(t);
	}

}

