package linkedlist;
import org.junit.Test;

import common.Constant;
import common.TestStar;
import starlib.precondition.Initializer;

public class MyLinkedList_insertTest extends TestStar {
	
	@Override
	protected void initDataNode() {
		String data = "data MyLinkedListItr{MyListNode _current}; data MyListNode {Object _element; MyListNode _next}; data Object {}";
		Initializer.initDataNode(data);
	}
	
	@Override
	protected void initPredicate() {
		String pred = "pred sllItr(root) == root = null || root::MyLinkedListItr<current> & current = null || root::MyLinkedListItr<current> * current::MyListNode<element,next> * element::Object<> & next = null";Initializer.initPredicate(pred);
	}
	
	@Override
	protected void initPrecondition() {
		String pre = "pre insert == this__header::MyListNode<element,next> * sllItr(p) & next=null";
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
				"+star.test_path=" + Constant.TEST_PATH + "/linkedlist",
				"+star.test_package=linkedlist",
				"+star.test_imports=common.Utilities",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+symbolic.method=linkedlist.MyLinkedList.insert(sym#sym)",
				"+symbolic.fields=instance",
				"+symbolic.lazy=true")) {
			MyLinkedList list = new MyLinkedList();
			Object x = new Object();
			MyListNode node = new MyListNode();
			MyLinkedListItr itr = new MyLinkedListItr(node);
			list.insert(x, itr);
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}

}
