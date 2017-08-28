package star.examples.bst;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;
import star.examples.Utilities;

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

