package stack;
import org.junit.Test;

import common.Constant;
import common.TestStar;
import star.precondition.Initializer;

public class MyStack_isAcyclicTest extends TestStar {
	
	@Override
	protected void initDataNode() {
		String data = "data ListNode {Object element; ListNode next}";
		Initializer.initDataNode(data);
	}
	
	@Override
	protected void initPredicate() {
//		String pred = "pred stack(root) == root = null || root::ListNode<element,next> * stack(next)";
		String pred1 = "pred stack(root) == root=null || root::ListNode<element,next> * lseg(next,dest) & dest=null || " +
				"root::ListNode<element,next> * lseg(next,dest) & dest=root || root::ListNode<element,next> * lseg(next,tmp) * tmp::ListNode<element,tmpNext> * lseg(tmpNext,dest) & dest=tmp";
		String pred2 = "pred lseg(root,dest) == root=dest || root::ListNode<element,next> * lseg(next,dest)";
		
		String pred = pred1 + ";" + pred2;
		Initializer.initPredicate(pred);
	}
	
	@Override
	protected void initPrecondition() {
		String pre = "pre isAcyclic == stack(this_topOfStack)";
		Initializer.initPrecondition(pre);
	}
	

	@Test
	public void testMain() {
		long begin = System.currentTimeMillis();
		
		if (verifyNoPropertyViolation(
				"+listener=star.StarListener",
				"+star.max_depth=3",
//				"+star.min_int=-100",
//				"+star.max_int=100",
				"+star.test_path=" + Constant.TEST_PATH + "/stack",
				"+star.test_package=stack",
				"+star.test_imports=common.Utilities",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+symbolic.method=stack.StackLi.isAcyclic()",
				"+symbolic.fields=instance",
				"+symbolic.lazy=true")) {
			StackLi stack = new StackLi();
			stack.isAcyclic();
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}

}
