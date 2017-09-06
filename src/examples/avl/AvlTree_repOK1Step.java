package avl;

import org.junit.Test;

import basic.Utilities;
import gov.nasa.jpf.util.test.TestJPF;

public class AvlTree_repOK1Step extends TestJPF {

	@Test
	public void test_repOK1() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = null;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

}

