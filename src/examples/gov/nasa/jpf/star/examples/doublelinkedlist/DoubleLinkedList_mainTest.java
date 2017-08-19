package gov.nasa.jpf.star.examples.doublelinkedlist;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Before;
import org.junit.Test;

import gov.nasa.jpf.star.data.DataNode;
import gov.nasa.jpf.star.data.DataNodeLexer;
import gov.nasa.jpf.star.data.DataNodeMap;
import gov.nasa.jpf.star.data.DataNodeParser;
import gov.nasa.jpf.star.precondition.Precondition;
import gov.nasa.jpf.star.precondition.PreconditionLexer;
import gov.nasa.jpf.star.precondition.PreconditionMap;
import gov.nasa.jpf.star.precondition.PreconditionParser;
import gov.nasa.jpf.star.predicate.InductivePred;
import gov.nasa.jpf.star.predicate.InductivePredLexer;
import gov.nasa.jpf.star.predicate.InductivePredMap;
import gov.nasa.jpf.star.predicate.InductivePredParser;
import gov.nasa.jpf.util.test.TestJPF;

@SuppressWarnings("deprecation")
public class DoubleLinkedList_mainTest extends TestJPF {
	
	private void initDataNode() {
//		String data = "data LinkedList{int modCount; Node first; Node last; int size}; data Node {Object item; Node next; Node prev}; data Object {}";
		
		String data = "data DoubleLinkedList{int modCount; Entry header; int size}; data Entry {Object element; Entry next; Entry previous}; data Object {}";
		
		ANTLRInputStream in = new ANTLRInputStream(data);
		DataNodeLexer lexer = new DataNodeLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DataNodeParser parser = new DataNodeParser(tokens);
		
        DataNode[] dns = parser.datas().dns;
        DataNodeMap.put(dns);
	}
	
	private void initPredicate() {
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
		
		ANTLRInputStream in = new ANTLRInputStream(pred);
		InductivePredLexer lexer = new InductivePredLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        InductivePredParser parser = new InductivePredParser(tokens);
        
        InductivePred[] ips = parser.preds().ips;
        InductivePredMap.put(ips);
	}
	
	private void initPrecondition() {
		String pre = "pre sample == list(dll) * o::Object<>";
		
		ANTLRInputStream in = new ANTLRInputStream(pre);
		PreconditionLexer lexer = new PreconditionLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PreconditionParser parser = new PreconditionParser(tokens);
        
        Precondition[] ps = parser.pres().ps;
        PreconditionMap.put(ps);
	}
	
	@Before
	public void init() {
		initDataNode();
		initPredicate();
		initPrecondition();
	}
	
	@Test
	public void testMain() {
		long begin = System.currentTimeMillis();
		
		if (verifyNoPropertyViolation(
				"+listener=.star.StarListener",
				"+star.max_depth=5",
//				"+star.min_int=-100",
//				"+star.max_int=100",
				"+star.test_path=/Users/HongLongPham/Workspace/JPF_HOME/jpf-star/src/examples/gov/nasa/jpf/star/examples/doublelinkedlist",
				"+star.test_package=gov.nasa.jpf.star.examples.doublelinkedlist",
				"+star.test_imports=gov.nasa.jpf.star.examples.doublelinkedlist.DoubleLinkedList.Entry;gov.nasa.jpf.star.examples.Utilities",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+symbolic.method=gov.nasa.jpf.star.examples.doublelinkedlist.Main.sample(sym#sym)",
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
