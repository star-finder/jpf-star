package gov.nasa.jpf.star.examples.avl;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class AvlTree_makeEmpty1 extends TestJPF {

	@Test
	public void test1() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = null;
		obj.makeEmpty();
	}

}

