package aatree;
import org.junit.Test;

import common.Constant;
import starlib.precondition.Initializer;

public class AATree_findMaxTest extends TestAa {
	
	@Override
	protected void initPrecondition() {
		String pre = "pre findMax == aat(this_root, this_nullNode)";
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
				"+symbolic.method=aatree.AATree.findMax()",
				"+symbolic.fields=instance",
				"+symbolic.lazy=true")) {
			AATree tree = new AATree();
			tree.findMax();
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}

}
