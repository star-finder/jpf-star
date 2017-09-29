package linkedlist;
import org.junit.Test;

import common.Constant;
import common.TestStar;
import star.precondition.Initializer;

public class MyLinkedList_removeTest extends TestStar {
	
	@Override
	protected void initDataNode() {
		String data = "data MyListNode {Object _element; MyListNode _next}; data Object {}";
		Initializer.initDataNode(data);
	}
	
	@Override
	protected void initPredicate() {
		String pred = "pred sll(root) == root = null || root::MyListNode<element,next> * element::Object<> * sll(next)";
		Initializer.initPredicate(pred);
	}
	
	@Override
	protected void initPrecondition() {
		String pre = "pre remove == this__header::MyListNode<element,next> * sll(next)";
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
				"+star.test_path=" + Constant.TEST_PATH + "/linkedlist",
				"+star.test_package=linkedlist",
				"+star.test_imports=common.Utilities",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+symbolic.method=linkedlist.MyLinkedList.remove(sym)",
				"+symbolic.fields=instance",
				"+symbolic.lazy=true")) {
			MyLinkedList list = new MyLinkedList();
			Object x = new Object();
			list.remove(x);
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}

}
