package basic;
import org.junit.Test;

import common.Constant;
import starlib.precondition.Initializer;

public class Sll4Test extends TestSll {
	
	@Override
	protected void initPrecondition() {
		String pre = "pre myMethod == sll(Sll4_x)";
		Initializer.initPrecondition(pre);
	}
	

	@Test
	public void testMain() {
		if (verifyNoPropertyViolation(
				"+listener=star.StarListener",
//				"+star.max_len_pc=6",
//				"+star.min_int=-100",
//				"+star.max_int=100",
//				"+star.lazy=false",
				"+star.test_path=" + Constant.TEST_PATH + "/basic",
				"+star.test_package=basic",
				"+star.test_imports=common.Utilities",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+symbolic.method=basic.Sll4.myMethod()",
				"+symbolic.fields=static",
				"+symbolic.lazy=true")) {
			Sll4.main(null);
		}
	}

}
