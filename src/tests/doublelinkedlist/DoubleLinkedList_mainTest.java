package doublelinkedlist;
import org.junit.Test;

import common.Constant;
import common.TestStar;
import star.precondition.Initializer;

public class DoubleLinkedList_mainTest extends TestStar {
	
	@Override
	protected void initDataNode() {
//		String data = "data LinkedList{int modCount; Node first; Node last; int size}; data Node {Object item; Node next; Node prev}; data Object {}";
		
		String data = "data DoubleLinkedList{int modCount; Entry header; int size}; data Entry {Object element; Entry next; Entry previous}; data Object {}";
		Initializer.initDataNode(data);
	}
	
	@Override
	protected void initPredicate() {
//		String pred1 = "pred list(root) == root::LinkedList<modCount,first,last,size> & first=null & last=null & size=0 || " +
//				"root::LinkedList<modCount,first,last,size> * first::Node<itemF,nextF,prevF> * itemF::Object<> & nextF=null & prevF=null & first=last & size=1 || " +
//				"root::LinkedList<modCount,first,last,size> * first::Node<itemF,nextF,prevF> * last::Node<itemL,nextL,prevL> * itemF::Object<> * itemL::Object<> * lseg(nextF,first,last,prevL,size1) & prevF=null & nextL=null & size=2+size1";
//		
//		String pred2 = "pred lseg(next,first,last,prev,size) == next=last & prev=first & size=0 || " +
//				"next::Node<item,next1,prev1> * lseg(next1,next,last,prev,size1) * item::Object<> & prev1=first & size=size1+1";
		
		String pred1 = "pred list(root) == root::DoubleLinkedList<modCount,header,size> * header::Entry<ele,header,header> & size=0 || " +
		"root::DoubleLinkedList<modCount,header,size> * header::Entry<eleH,first,last> * first::Entry<ele1,header,header> & first=last & size=1 || " +
		"root::DoubleLinkedList<modCount,header,size> * header::Entry<eleH,first,last> * first::Entry<ele1,nextF,prevF> * last::Entry<ele2,nextL,prevL> * lseg(nextF,first,last,prevL,size1) & prevF=header & nextL=header & size=2+size1";
		
		String pred2 = "pred lseg(next,first,last,prev,size) == next=last & prev=first & size=0 || " +
				"next::Entry<item,next1,prev1> * lseg(next1,next,last,prev,size1) & prev1=first & size=size1+1";
		
		
//		String pred0 = "pred list(root) == root::DoubleLinkedList<modCount,header,size> * dll(header,size)";
//		String pred1 = "pred dll(header,size) == header::Entry<ele,header,header> & size=0 || header::Entry<ele,next,prev> * nndll(next,header,header,prev,size)";
//		String pred2 = "pred nndll(curr,prev,header,prevH,size) == curr::Entry<ele,header,prev> & prevH=curr & size=1 || curr::Entry<ele,next,prev> * nndll(next,curr,header,prevH,size1) & size=size1+1";
				
		String pred = pred1 + ";" + pred2;
		Initializer.initPredicate(pred);
	}
	
	@Override
	protected void initPrecondition() {
		String pre = "pre sample == list(dll) * o::Object<>";
		Initializer.initPrecondition(pre);
	}
	

	@Test
	public void testMain() {
		long begin = System.currentTimeMillis();
		
		if (verifyNoPropertyViolation(
				"+listener=star.StarListener",
				"+star.max_depth=5",
//				"+star.min_int=-100",
//				"+star.max_int=100",
				"+star.test_path=" + Constant.TEST_PATH + "/doublelinkedlist",
				"+star.test_package=doublelinkedlist",
				"+star.test_imports=doublelinkedlist.DoubleLinkedList.Entry;common.Utilities",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+symbolic.method=doublelinkedlist.Main.sample(sym#sym)",
//				"+symbolic.fields=instance",
				"+symbolic.lazy=true")) {
			Main m = new Main();
			DoubleLinkedList dll = new DoubleLinkedList();
			Object x = new Object();
			
			m.sample(dll, x);
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}

}
