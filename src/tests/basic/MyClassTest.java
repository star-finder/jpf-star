package basic;
import org.junit.Test;

import common.Constant;
import common.TestStar;
import starlib.precondition.Initializer;

public class MyClassTest extends TestStar {
	
	@Override
	protected void initDataNode() {
		String data = "data Node_old {Node_old next}";
		Initializer.initDataNode(data);
	}
	
	@Override
	protected void initPredicate() {
		String pred = "pred sll(root) == root = null || root::Node_old<next> * sll(next)";
		Initializer.initPredicate(pred);
	}
	
	@Override
	protected void initPrecondition() {
		String pre = "pre myMethod == sll(x); pre myMethod1 == sll(x) & x=y; pre myMethod2 == i < 100";
		Initializer.initPrecondition(pre);
	}
	
	@Test
	public void testMain() {
		if (verifyNoPropertyViolation(
//				"+listener=.symbc.SymbolicListener",
				"+listener=star.StarListener",
//				"+star.max_len_pc=6",
//				"+star.min_int=-100",
//				"+star.max_int=100",
				"+star.test_path=" + Constant.TEST_PATH + "/basic",
				"+star.test_package=basic",
//				"+star.test_imports",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+star.test_path=" + Constant.TEST_PATH + "/basic",
				"+symbolic.method = basic.MyClass.myMethod(sym)",
//				"+symbolic.fields = instance,static",
				"+symbolic.lazy=true")) {
			MyClass.main(new String[] {"0"});
		}
	}
	
	//*
	@Test
	public void testMain1() {
		if (verifyNoPropertyViolation(
//				"+listener=.symbc.SymbolicListener",
				"+listener=star.StarListener",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+star.test_path=" + Constant.TEST_PATH + "/basic",
				"+star.test_package=basic",
				"+symbolic.method = basic.MyClass.myMethod1(sym#sym)",
				"+symbolic.lazy=true")) {
			MyClass.main(new String[] {"1"});
		}
	}
	//*/
	
	@Test
	public void testMain2() {
		if (verifyNoPropertyViolation(
//				"+listener=.symbc.SymbolicListener",
				"+listener=star.StarListener",
//				"+star.min_int=-100",
//				"+star.max_int=100",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+star.test_path=" + Constant.TEST_PATH + "/basic",
				"+star.test_package=basic",
				"+symbolic.method = basic.MyClass.myMethod2(sym#sym)",
				"+symbolic.lazy=true")) {
			MyClass.main(new String[] {"2"});
		}
	}

}
