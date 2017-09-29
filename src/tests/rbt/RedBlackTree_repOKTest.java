package rbt;
import org.junit.Test;

import common.Constant;
import common.TestStar;
import star.precondition.Initializer;

public class RedBlackTree_repOKTest extends TestStar {
	
	@Override
	protected void initDataNode() {
		String data = "data Entry {int key; Object value; Entry left; Entry right; Entry parent; boolean color}";
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
				"+star.test_path=" + Constant.TEST_PATH + "/rbt",
				"+star.test_package=rbt",
				"+star.test_imports=rbt.TreeMap.Entry;common.Utilities",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+symbolic.method=rbt.TreeMap.repOK()",
				"+symbolic.fields=instance",
				"+symbolic.lazy=true")) {
			TreeMap tree = new TreeMap();
			tree.repOK();
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}

}
