package ganttproject;
import org.junit.Test;

import common.Constant;
import common.TestStar;
import starlib.precondition.Initializer;

public class Gantt_rollBackTest extends TestStar {
	
	@Override
	protected void initDataNode() {
		String data1 = "data Transaction {boolean isRunning; LinkedListNode myTouchedNodes}";
		String data2 = "data GraphData {void myLayers; GraphData myBackup; Transaction myTxn}";
		String data3 = "data LinkedListNode {void modCount; EntryNode header; int size}";
		String data4 = "data Node {void myTask; NodeData myData}";
		String data5 = "data NodeData {void myLevel; void myIncoming; void myOutgoing; void myNode; void myTxn; NodeData myBackup}";
		String data6 = "data EntryNode {Node element; EntryNode next; EntryNode previous}";
		
		String data = data1 + ";" + data2 + ";" + data3 + ";" + data4 + ";" + data5 + ";" + data6;
		Initializer.initDataNode(data);
	}
	
	@Override
	protected void initPredicate() {
		String pred1 = "pred cond(trans,myData) == trans::Transaction<isRunning,myTouchedNodes> * backupPred(myData) * myTouchedNodes::LinkedListNode<_,header,size> * dll(header,size)";
		String pred2 = "pred backupPred(myData) == myData::GraphData<_,backup,trans> * trans::Transaction<isRunning,_> & backup=null || myData::GraphData<_,backup,trans> * trans::Transaction<isRunning,_> * backupPred(backup)";
		
		String pred3 = "pred dll(header,size) == header::EntryNode<ele,header,header> & size=0 || header::EntryNode<ele,next,prev> * nndll(next,header,header,prev,size)";
		String pred4 = "pred nndll(curr,prev,header,prevH,size) == curr::EntryNode<ele,header,prev> * ele::Node<_,myData1> * myData1::NodeData<_,_,_,_,_,myBackup> & prevH=curr & size=1 || curr::EntryNode<ele,next,prev> * ele::Node<_,myData1> * myData1::NodeData<_,_,_,_,_,myBackup> * nndll(next,curr,header,prevH,size1) & size=size1+1";
		
		String pred = pred1 + ";" + pred2 + ";" + pred3 + ";" + pred4;
		Initializer.initPredicate(pred);
	}
	
	@Override
	protected void initPrecondition() {
		String pre = "pre rollbackTransaction == cond(this_myTxn,this_myData)";
		Initializer.initPrecondition(pre);
	}
	

	@Test
	public void testMain() {
		long begin = System.currentTimeMillis();
		
		if (verifyNoPropertyViolation(
				"+listener=star.StarListener",
				"+star.max_depth=4",
//				"+star.min_int=-100",
//				"+star.max_int=100",
				"+star.test_path=" + Constant.TEST_PATH + "/ganttproject",
				"+star.test_package=ganttproject",
				"+star.test_imports=common.Utilities;ganttproject.LinkedListNode.EntryNode;",
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
