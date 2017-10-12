package aatree;
import org.junit.Test;

import common.Constant;
import common.TestStar;
import starlib.precondition.Initializer;

public class AATree_wellFormedTest extends TestStar {
	
	@Override
	protected void initDataNode() {
		String data = "data AANode {int element; AANode left; AANode right; int level}";
		Initializer.initDataNode(data);
	}

	@Test
	public void testMain() {
		long begin = System.currentTimeMillis();
		
		if (verifyNoPropertyViolation(
				"+listener=star.StarListener",
				"+star.max_depth=9",
				"+star.lazy=true",
//				"+star.min_int=-100",
//				"+star.max_int=100",
				"+star.test_path=" + Constant.TEST_PATH + "/aatree",
				"+star.test_package=aatree",
				"+star.test_imports=aatree.AATree.AANode;common.Utilities",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+symbolic.method=aatree.AATree.wellFormed()",
				"+symbolic.fields=instance",
				"+symbolic.lazy=true")) {
			AATree tree = new AATree();
			tree.wellFormed();
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}

}
