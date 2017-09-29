package avl;
import org.junit.Test;

import common.Constant;
import common.TestStar;
import star.data.DataNodeMap;
import star.precondition.Initializer;

public class Avl_repOKTest extends TestStar {
	
	@Override
	protected void initDataNode() {
		String data = "data AvlNode {int element; AvlNode left; AvlNode right; int height}";
		Initializer.initDataNode(data);
	}

	@Test
	public void testMain() {
		long begin = System.currentTimeMillis();
		
		if (verifyNoPropertyViolation(
				"+listener=star.StarListener",
				"+star.max_depth=5",
				"+star.lazy=true",
//				"+star.min_int=-100",
//				"+star.max_int=100",
				"+star.test_path=" + Constant.TEST_PATH + "/avl",
				"+star.test_package=avl",
				"+star.test_imports=common.Utilities",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+symbolic.method=avl.AvlTree.repOK()",
				"+symbolic.fields=instance",
				"+symbolic.lazy=true")) {
			AvlTree tree = new AvlTree();
			tree.repOK();
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}

}
