package doublelinkedlist;
import org.junit.Test;

import common.Constant;
import common.TestStar;
import star.precondition.Initializer;

public class DoubleLinkedList_repOKTest extends TestStar {
	
	@Override
	protected void initDataNode() {
		String data = "data Entry {Object element; Entry next; Entry previous}";
		Initializer.initDataNode(data);
	}

	@Test
	public void testMain() {
		long begin = System.currentTimeMillis();
		
		if (verifyNoPropertyViolation(
				"+listener=star.StarListener",
				"+star.max_depth=5",
				"+star.lazy=true",
//				"+star.min_int=-100",
//				"+star.max_int=100",
				"+star.test_path=" + Constant.TEST_PATH + "/doublelinkedlist",
				"+star.test_package=doublelinkedlist",
				"+star.test_imports=doublelinkedlist.DoubleLinkedList.Entry;common.Utilities",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+symbolic.method=doublelinkedlist.DoubleLinkedList.repOK()",
				"+symbolic.fields=instance",
				"+symbolic.lazy=true")) {
			DoubleLinkedList list = new DoubleLinkedList();
			list.repOK();
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}

}
