package doublelinkedlist;
import org.junit.Test;

import common.Constant;
import common.TestStar;
import star.precondition.Initializer;

public class DoubleLinkedList_repOKTest extends TestStar {
	
	@Override
	protected void initDataNode() {
		String data1 = "data Entry {Object element; Entry next; Entry previous}";
		
		String data = data1;
		Initializer.initDataNode(data);
	}
	
	@Override
	protected void initPredicate() {
		String pred1 = "pred dll(header,size) == header::Entry<ele,header,header> & size=0 || header::Entry<ele,next,prev> * nndll(next,header,header,prev,size);";
		String pred2 = "pred nndll(curr,prev,header,prevH,size) == curr::Entry<ele,header,prev> & prevH=curr & size=1 || curr::Entry<ele,next,prev> * nndll(next,curr,header,prevH,size1) & size=size1+1";
				
		String pred = pred1 + pred2;
		Initializer.initPredicate(pred);
	}
	
	@Override
	protected void initPrecondition() {
//		String pre = "pre toArray == dll(this_header,this_size)";
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
