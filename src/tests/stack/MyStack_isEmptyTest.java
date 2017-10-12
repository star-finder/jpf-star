package stack;
import org.junit.Test;

import common.Constant;
import common.TestStar;
import starlib.precondition.Initializer;

public class MyStack_isEmptyTest extends TestStar {
	
	@Override
	protected void initDataNode() {
		String data = "data ListNode {Object element; ListNode next}";
		Initializer.initDataNode(data);
	}
	
	@Override
	protected void initPredicate() {
		String pred = "pred stack(root) == root = null || root::ListNode<element,next> * stack(next)";
		Initializer.initPredicate(pred);
	}
	
	@Override
	protected void initPrecondition() {
		String pre = "pre isEmpty == stack(this_topOfStack)";
		Initializer.initPrecondition(pre);
	}
	

	@Test
	public void testMain() {
		long begin = System.currentTimeMillis();
		
		if (verifyNoPropertyViolation(
				"+listener=star.StarListener",
				"+star.max_depth=1",
//				"+star.min_int=-100",
//				"+star.max_int=100",
				"+star.test_path=" + Constant.TEST_PATH + "/stack",
				"+star.test_package=stack",
				"+star.test_imports=common.Utilities",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+symbolic.method=stack.StackLi.isEmpty()",
				"+symbolic.fields=instance",
				"+symbolic.lazy=true")) {
			StackLi stack = new StackLi();
			stack.isEmpty();
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}

}
