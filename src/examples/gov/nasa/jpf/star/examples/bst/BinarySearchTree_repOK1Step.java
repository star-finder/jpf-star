package gov.nasa.jpf.star.examples.bst;

import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class BinarySearchTree_repOK1Step extends TestJPF {

	@Test
	public void test_repOK1() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		BinaryNode t = null;
		obj.root = t;
		System.out.println(Utilities.repOK(obj));
		obj.repOK(t);
	}

}

