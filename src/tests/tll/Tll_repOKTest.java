package tll;
import org.junit.Test;

import common.Constant;
import common.TestStar;
import star.precondition.Initializer;

public class Tll_repOKTest extends TestStar {
	
	@Override
	protected void initDataNode() {
		String data = "data Node {int val; Node parent; Node left; Node right; Node next}";
		Initializer.initDataNode(data);
	}

	@Test
	public void testMain() {
		long begin = System.currentTimeMillis();
		
		if (verifyNoPropertyViolation(
				"+listener=star.StarListener",
				"+star.max_depth=3",
				"+star.lazy=true",
//				"+star.min_int=-100",
//				"+star.max_int=100",
				"+star.test_path=" + Constant.TEST_PATH + "/tll",
				"+star.test_package=tll",
				"+star.test_imports=common.Utilities",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+symbolic.method=tll.Tll.repOK()",
				"+symbolic.fields=instance",
				"+symbolic.lazy=true")) {
			Tll tll = new Tll();
			tll.repOK();
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}

}
