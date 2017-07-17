package gov.nasa.jpf.star.examples.aatree;

import gov.nasa.jpf.star.examples.aatree.AATree.AANode;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class AATree_makeEmpty1 extends TestJPF {

	@Test
	public void test1() throws Exception {
		AATree obj = new AATree();
		obj.root = obj.nullNode;
		AANode b_328 = null;
		AANode c_327 = null;
		int a_329 = 0;
		int d_326 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.makeEmpty();
	}

}

