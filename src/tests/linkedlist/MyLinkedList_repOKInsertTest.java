package linkedlist;
import org.junit.Test;

import common.Constant;
import common.TestStar;
import star.precondition.Initializer;

public class MyLinkedList_repOKInsertTest extends TestStar {
	
	@Override
	protected void initDataNode() {
		String data = "data MyLinkedListItr{MyListNode _current}; data MyListNode {Object _element; MyListNode _next}; data Object {}";
		Initializer.initDataNode(data);
	}
	
	@Override
	protected void initPredicate() {
		String pred = "pred sll(root) == root = null || root::MyListNode<element,next> * element::Object<> * sll(next)";
		Initializer.initPredicate(pred);
	}
	
	@Override
	protected void initPrecondition() {
//		String pre = "pre remove == this__header::MyListNode<element,next> * sll(next)";
//		
//		ANTLRInputStream in = new ANTLRInputStream(pre);
//		PreconditionLexer lexer = new PreconditionLexer(in);
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//        PreconditionParser parser = new PreconditionParser(tokens);
//        
//        Precondition[] ps = parser.pres().ps;
//        PreconditionMap.put(ps);
	}
	

	@Test
	public void testMain() {
		long begin = System.currentTimeMillis();
		
		if (verifyNoPropertyViolation(
				"+listener=star.StarListener",
				"+star.max_depth=3",
				"+star.lazy=true",
//				"+star.min_int=-100",
//				"+star.max_int=100",
				"+star.test_path=" + Constant.TEST_PATH + "/linkedlist",
				"+star.test_package=linkedlist",
				"+star.test_imports=common.Utilities",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+symbolic.method=linkedlist.MyLinkedList.repOKIns(sym)",
				"+symbolic.fields=instance",
				"+symbolic.lazy=true")) {
			MyLinkedList list = new MyLinkedList();
			MyListNode node = new MyListNode();
			MyLinkedListItr itr = new MyLinkedListItr(node);
			list.repOKIns(itr);
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}

}
