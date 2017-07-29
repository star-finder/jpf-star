package gov.nasa.jpf.star.examples.aatree;

import gov.nasa.jpf.star.examples.aatree.AATree.AANode;
import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class AATree_makeEmpty1 extends TestJPF {

	@Test
	public void test_makeEmpty1() throws Exception {
		AATree obj = new AATree();
		obj.root = obj.nullNode;
		int d_318 = 0;
		int a_319 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		System.out.println(Utilities.repOK(obj));
		obj.makeEmpty();
	}

}

