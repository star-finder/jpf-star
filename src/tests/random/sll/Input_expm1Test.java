package random.sll;
import org.junit.Test;

import common.Constant;
import common.TestStar;
import starlib.precondition.Initializer;

public class Input_expm1Test extends TestStar {
	
	@Override
	protected void initDataNode() {
		String data = "data Node {int elem; Node next}";
		Initializer.initDataNode(data);
	}
	
	@Override
	protected void initPredicate() {
		String pred = "pred sll(root) == root = null || root::Node<elem,next> * sll(next)";
		Initializer.initPredicate(pred);
	}
	
	@Override
	protected void initPrecondition() {
		String pre = "pre withExpm1 == sll(root)";
		Initializer.initPrecondition(pre);
	}
	

	@Test
	public void testMain() {
		long begin = System.currentTimeMillis();
		
		if (verifyNoPropertyViolation(
				"+listener=star.StarListener",
				"+star.max_depth=2",
//				"+star.min_int=-100",
//				"+star.max_int=100",
				"+star.test_path=" + Constant.TEST_PATH + "/random/sll",
				"+star.test_package=random.sll",
				"+star.test_imports=common.Utilities",
				"+classpath=build/examples",
				"+sourcepath=src/examples",
				"+symbolic.method=random.sll.Input.withExpm1(sym)",
				"+symbolic.fields=instance",
				"+symbolic.lazy=true")) {
			Input in = new Input();
			in.withExpm1(new Node());
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}

}
