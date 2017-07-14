package gov.nasa.jpf.star.examples.aatree;

import gov.nasa.jpf.star.examples.aatree.AATree.AANode;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class AATree_findMax1 extends TestJPF {

	@Test
	public void test1() throws Exception {
		AATree obj = new AATree();
		obj.nullNode = new AANode();
		obj.root = obj.nullNode;
		AANode b_2 = null;
		AANode c_3 = null;
		int d_4 = 0;
		int a_1 = 0;
		obj.deletedNode = null;
		obj.lastNode = null;
		obj.nullNode.element = a_1;
		obj.nullNode.left = b_2;
		obj.nullNode.right = c_3;
		obj.nullNode.level = d_4;
		obj.findMax();
	}

}

