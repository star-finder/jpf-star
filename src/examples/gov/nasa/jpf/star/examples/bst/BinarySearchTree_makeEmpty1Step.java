package gov.nasa.jpf.star.examples.bst;

import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class BinarySearchTree_makeEmpty1Step extends TestJPF {

	@Test
	public void test_repOK1() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = null;
		obj.root = t;
		if(Utilities.repOK(obj)) {obj.makeEmpty();}
//		obj.repOK(t);
	}

}

