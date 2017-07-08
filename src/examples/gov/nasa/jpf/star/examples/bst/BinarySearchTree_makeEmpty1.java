package gov.nasa.jpf.star.examples.bst;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class BinarySearchTree_makeEmpty1 extends TestJPF {

	@Test
	public void test1() throws Exception {
		BinarySearchTree obj = new BinarySearchTree();
		obj.root = null;
		obj.min = 0;
		obj.max = 0;
		obj.makeEmpty();
	}

}

