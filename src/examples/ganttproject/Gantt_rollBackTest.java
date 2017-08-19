package ganttproject;
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
public class Gantt_rollBackTest extends TestJPF {
	
	private void initDataNode() {
		String data1 = "data Transaction {boolean isRunning; LinkedListNode myTouchedNodes}";
		String data2 = "data GraphData {void myLayers; GraphData myBackup; Transaction myTxn}";
		String data3 = "data LinkedListNode {void modCount; EntryNode header; int size}";
		String data4 = "data Node {void myTask; NodeData myData}";
		String data5 = "data NodeData {void myLevel; void myIncoming; void myOutgoing; void myNode; void myTxn; NodeData myBackup}";
		String data6 = "data EntryNode {Node element; EntryNode next; EntryNode previous}";
		
		String data = data1 + ";" + data2 + ";" + data3 + ";" + data4 + ";" + data5 + ";" + data6;
		
		ANTLRInputStream in = new ANTLRInputStream(data);
		DataNodeLexer lexer = new DataNodeLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DataNodeParser parser = new DataNodeParser(tokens);
		
        DataNode[] dns = parser.datas().dns;
        DataNodeMap.put(dns);
	}
	
	private void initPredicate() {
		String pred1 = "pred cond(trans,myData) == trans::Transaction<isRunning,myTouchedNodes> * backupPred(myData) * myTouchedNodes::LinkedListNode<_,header,size> * dll(header,size)";
		String pred2 = "pred backupPred(myData) == myData::GraphData<_,backup,trans> * trans::Transaction<isRunning,_> & backup=null || myData::GraphData<_,backup,trans> * trans::Transaction<isRunning,_> * backupPred(backup)";
		
		String pred3 = "pred dll(header,size) == header::EntryNode<ele,header,header> & size=0 || header::EntryNode<ele,next,prev> * nndll(next,header,header,prev,size)";
		String pred4 = "pred nndll(curr,prev,header,prevH,size) == curr::EntryNode<ele,header,prev> * ele::Node<_,myData1> * myData1::NodeData<_,_,_,_,_,myBackup> & prevH=curr & size=1 || curr::EntryNode<ele,next,prev> * ele::Node<_,myData1> * myData1::NodeData<_,_,_,_,_,myBackup> * nndll(next,curr,header,prevH,size1) & size=size1+1";
		
		String pred = pred1 + ";" + pred2 + ";" + pred3 + ";" + pred4;
		
		ANTLRInputStream in = new ANTLRInputStream(pred);
		InductivePredLexer lexer = new InductivePredLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        InductivePredParser parser = new InductivePredParser(tokens);
        
        InductivePred[] ips = parser.preds().ips;
        InductivePredMap.put(ips);
	}
	
	private void initPrecondition() {
		String pre = "pre rollbackTransaction == cond(this_myTxn,this_myData)";
		
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
				"+star.max_depth=4",
//				"+star.min_int=-100",
//				"+star.max_int=100",
				"+star.test_path=/Users/HongLongPham/Workspace/JPF_HOME/jpf-star/src/examples/ganttproject",
				"+star.test_package=ganttproject",
				"+star.test_imports=gov.nasa.jpf.star.examples.Utilities;ganttproject.LinkedListNode.EntryNode;",
				"+classpath=build/examples;lib/ganttproject-guava.jar", 
				"+sourcepath=src/examples",
				"+symbolic.method=ganttproject.DependencyGraph.rollbackTransaction()",
				"+symbolic.fields=instance",
				"+symbolic.lazy=true")) {
			DependencyGraph graph = new DependencyGraph();
			graph.rollbackTransaction();
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}

}
