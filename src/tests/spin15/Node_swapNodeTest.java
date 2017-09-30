package spin15;

import org.junit.Test;

import spin15.List;
import common.Constant;
import common.TestStar;
import star.precondition.Initializer;

public class Node_swapNodeTest extends TestStar{

	@Override
	protected void initDataNode() {
		String data = "data Node {int elem; Node next}";
		Initializer.initDataNode(data);
	}
	
	@Override
	protected void initPredicate() {
		String pred = "pred sll(a) == a=null || a::Node<elem1,next1> * sll(next1)";
		Initializer.initPredicate(pred);
	}
	
	@Override
	protected void initPrecondition() {
		String pre = "pre swapNode == sll(this_x)";
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
				"+star.max_depth=3",
				"+star.test_path=" + Constant.TEST_PATH + "/spin15",
				"+star.test_package=spin15",
//				"+star.test_imports=...",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+symbolic.method=spin15.Node.swapNode()",
				"+symbolic.fields=instance",
				"+symbolic.lazy=true")) {
			Node.main(null);
		}
	}
}
