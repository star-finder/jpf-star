package aatree;
import org.junit.Test;

import common.Constant;
import starlib.precondition.Initializer;

public class AATree_findMinTest extends TestAa {
	
	@Override
	protected void initPrecondition() {
		String pre = "pre findMin == aat(this_root, this_nullNode)";
		Initializer.initPrecondition(pre);
	}
	

	@Test
	public void testMain() {
		long begin = System.currentTimeMillis();
		
		if (verifyNoPropertyViolation(
				"+listener=star.StarListener",
				"+star.max_depth=3",
//				"+star.min_int=-100",
//				"+star.max_int=100",
				"+star.test_path=" + Constant.TEST_PATH + "/aatree",
				"+star.test_package=aatree",
				"+star.test_imports=aatree.AATree.AANode;common.Utilities",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+symbolic.method=aatree.AATree.findMin()",
				"+symbolic.fields=instance",
				"+symbolic.lazy=true")) {
			AATree tree = new AATree();
			tree.findMin();
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}

}
