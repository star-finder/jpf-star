package basic;

import org.junit.Test;

import common.Constant;
import common.TestStar;
import star.precondition.Initializer;

public class BigIntegerTest extends TestStar {
	
	@Override
	protected void initDataNode() {
		String data = "data Node {int val; Node next}";
		Initializer.initDataNode(data);
	}
	
	@Override
	protected void initPredicate() {
		String pred = "pred precondition(a,b) == a=null & b=null || a::Node<_,next1> * b::Node<_,next2> * precondition(next1,next2)";
		Initializer.initPredicate(pred);
	}
	
	@Override
	protected void initPrecondition() {
		String pre = "pre add == precondition(x,y)";
		Initializer.initPrecondition(pre);
	}
	

	@Test
	public void testAdd() {
		if (verifyNoPropertyViolation(
				"+listener=star.StarListener",
//				"+star.max_len_pc=6",
//				"+star.min_int=-100",
//				"+star.max_int=100",
//				"+star.lazy=false",
				"+star.max_depth=4",
				"+star.test_path=" + Constant.TEST_PATH + "/basic",
				"+star.test_package=basic",
				"+star.test_imports=basic.BigInteger;common.Utilities",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+symbolic.method=basic.BigInteger.add(sym#sym)",
				"+symbolic.lazy=true"
				)) {
			BigInteger obj = new BigInteger();
			Node x = new Node();
			Node y = new Node();
			obj.add(x, y);
		}
	}

}
