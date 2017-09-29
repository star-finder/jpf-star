package linkedlist;
import org.junit.Test;

import common.Constant;
import common.TestStar;
import star.precondition.Initializer;

public class MyLinkedList_repOKTest extends TestStar {
	
	@Override
	protected void initDataNode() {
		String data = "data MyListNode {Object _element; MyListNode _next}; data Object {}";
		Initializer.initDataNode(data);
	}

	@Test
	public void testMain() {
		long begin = System.currentTimeMillis();
		
		if (verifyNoPropertyViolation(
				"+listener=star.StarListener",
				"+star.max_depth=2",
				"+star.lazy=true",
//				"+star.min_int=-100",
//				"+star.max_int=100",
				"+star.test_path=" + Constant.TEST_PATH + "/linkedlist",
				"+star.test_package=linkedlist",
				"+star.test_imports=common.Utilities",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+symbolic.method=linkedlist.MyLinkedList.repOK()",
				"+symbolic.fields=instance",
				"+symbolic.lazy=true")) {
			MyLinkedList list = new MyLinkedList();
			list.repOK();
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}

}
