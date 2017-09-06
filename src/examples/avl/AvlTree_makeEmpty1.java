package avl;

import org.junit.Test;

import common.Utilities;
import gov.nasa.jpf.util.test.TestJPF;

public class AvlTree_makeEmpty1 extends TestJPF {

	@Test
	public void test_makeEmpty1() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = null;
		System.out.println(Utilities.repOK(obj));
		obj.makeEmpty();
	}

}

