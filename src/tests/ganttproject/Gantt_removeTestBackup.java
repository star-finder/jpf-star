package ganttproject;
import org.junit.Test;

import common.Constant;
import common.TestStar;
import starlib.precondition.Initializer;

public class Gantt_removeTestBackup extends TestStar {
	
	@Override
	protected void initDataNode() {
		String data1 = "data Transaction {boolean isRunning; LinkedList myTouchedNodes}";
		String data2 = "data GraphData {void myLayers; GraphData myBackup; Transaction myTxn}";
		String data3 = "data LinkedList {void modCount; Entry header; int size}";
		String data4 = "data Node {void myTask; NodeData myData}";
		String data5 = "data NodeData {void myLevel; LinkedList myIncoming; LinkedList myOutgoing; void myNode; void myTxn; NodeData myBackup}";
		String data6 = "data Entry {Node element; Entry next; Entry previous}";
		String data7 = "data ExplicitDependencyImpl {void myDep; void myStartRange; void myEndRange; void mySrcNode; void myDstNode; void isWeak}";
		String data8 = "data ImplicitInheritedDependency {void myExplicitDep; void mySrc; void myDst}";
		String data9 = "data ImplicitSubSuperTaskDependency {void mySubTask; void mySuperTask; void myStartRange; void myEndRange}";
		
		String data = data1 + ";" + data2 + ";" + data3 + ";" + data4 + ";" + data5 + ";" + data6 + ";" + data7 + ";" + data8 + ";" + data9;
		Initializer.initDataNode(data);
	}
	
	@Override
	protected void initPredicate() {
		String pred0 = "pred fst(root,trans,myData) == root::Node<_,nodeData> * nodeData::NodeData<_,myIncoming,myOutgoing,_,_,myBackup> * myIncoming::LinkedList<_,header1,size1> * dll1(header1,size1) * myOutgoing::LinkedList<_,header2,size2> * dll1(header2,size2) * cond(trans,myData) & myBackup=null || " + 
				"root::Node<_,nodeData> * nodeData::NodeData<_,myIncoming,myOutgoing,_,_,myBackup> * myIncoming::LinkedList<_,header1,size1> * dll1(header1,size1) * myOutgoing::LinkedList<_,header2,size2> * dll1(header2,size2) * cond(trans,myData) & myBackup=myData || " +
				"root::Node<_,nodeData> * nodeData::NodeData<_,myIncoming,myOutgoing,_,_,myBackup> * myIncoming::LinkedList<_,header1,size1> * dll2(header1,size1) * myOutgoing::LinkedList<_,header2,size2> * dll2(header2,size2) * cond(trans,myData) & myBackup=null || " +
				"root::Node<_,nodeData> * nodeData::NodeData<_,myIncoming,myOutgoing,_,_,myBackup> * myIncoming::LinkedList<_,header1,size1> * dll2(header1,size1) * myOutgoing::LinkedList<_,header2,size2> * dll2(header2,size2) * cond(trans,myData) & myBackup=myData || " +
				"root::Node<_,nodeData> * nodeData::NodeData<_,myIncoming,myOutgoing,_,_,myBackup> * myIncoming::LinkedList<_,header1,size1> * dll3(header1,size1) * myOutgoing::LinkedList<_,header2,size2> * dll3(header2,size2) * cond(trans,myData) & myBackup=null || " +
				"root::Node<_,nodeData> * nodeData::NodeData<_,myIncoming,myOutgoing,_,_,myBackup> * myIncoming::LinkedList<_,header1,size1> * dll3(header1,size1) * myOutgoing::LinkedList<_,header2,size2> * dll3(header2,size2) * cond(trans,myData) & myBackup=myData";
		
		String pred1 = "pred cond(trans,myData) == trans::Transaction<isRunning,myTouchedNodes> * backupPred(myData,trans) * myTouchedNodes::LinkedList<_,header,size> * dll(header,size)";
		String pred2 = "pred backupPred(myData,trans) == myData::GraphData<_,backup,trans> & backup=null || myData::GraphData<_,backup,trans> * backupPred(backup,trans)";
		
		String pred3 = "pred dll(header,size) == header::Entry<ele,header,header> & size=0 || header::Entry<ele,next,prev> * nndll(next,header,header,prev,size)";
		String pred4 = "pred nndll(curr,prev,header,prevH,size) == curr::Entry<ele,header,prev> * element(ele) & prevH=curr & size=1 || curr::Entry<ele,next,prev> * nndll(next,curr,header,prevH,size1) * element(ele) & size=size1+1";
		
		String pred5 = "pred element(ele) == ele::Node<_,myData> * myData::NodeData<_,myIncoming,myOutgoing,_,_,myBackup> * myIncoming::LinkedList<_,header1,size1> * dll1(header1,size1) * myOutgoing::LinkedList<_,header2,size2> * dll1(header2,size2) & myBackup=null || " + 
				"ele::Node<_,myData> * myData::NodeData<_,myIncoming,myOutgoing,_,_,myBackup> * myIncoming::LinkedList<_,header1,size1> * dll1(header1,size1) * myOutgoing::LinkedList<_,header2,size2> * dll1(header2,size2) & myBackup=myData || " +
				"ele::Node<_,myData> * myData::NodeData<_,myIncoming,myOutgoing,_,_,myBackup> * myIncoming::LinkedList<_,header1,size1> * dll2(header1,size1) * myOutgoing::LinkedList<_,header2,size2> * dll2(header2,size2) & myBackup=null || " +
				"ele::Node<_,myData> * myData::NodeData<_,myIncoming,myOutgoing,_,_,myBackup> * myIncoming::LinkedList<_,header1,size1> * dll2(header1,size1) * myOutgoing::LinkedList<_,header2,size2> * dll2(header2,size2) & myBackup=myData || " +
				"ele::Node<_,myData> * myData::NodeData<_,myIncoming,myOutgoing,_,_,myBackup> * myIncoming::LinkedList<_,header1,size1> * dll3(header1,size1) * myOutgoing::LinkedList<_,header2,size2> * dll3(header2,size2) & myBackup=null || " +
				"ele::Node<_,myData> * myData::NodeData<_,myIncoming,myOutgoing,_,_,myBackup> * myIncoming::LinkedList<_,header1,size1> * dll3(header1,size1) * myOutgoing::LinkedList<_,header2,size2> * dll3(header2,size2) & myBackup=myData";
		
		String pred6 = "pred dll1(header,size) == header::Entry<ele,header,header> & size=0 || header::Entry<ele,next,prev> * nndll1(next,header,header,prev,size)";
		String pred7 = "pred nndll1(curr,prev,header,prevH,size) == curr::Entry<ele1,header,prev> * element1(ele1) & prevH=curr & size=1 || curr::Entry<ele1,next,prev> * nndll1(next,curr,header,prevH,size1) * element(ele1) & size=size1+1";
		
		String pred8 = "pred dll2(header,size) == header::Entry<ele,header,header> & size=0 || header::Entry<ele,next,prev> * nndll2(next,header,header,prev,size)";
		String pred9 = "pred nndll2(curr,prev,header,prevH,size) == curr::Entry<ele2,header,prev> * element2(ele2) & prevH=curr & size=1 || curr::Entry<ele2,next,prev> * nndll2(next,curr,header,prevH,size1) * element(ele2) & size=size1+1";
		
		String pred10 = "pred dll3(header,size) == header::Entry<ele,header,header> & size=0 || header::Entry<ele,next,prev> * nndll3(next,header,header,prev,size)";
		String pred11 = "pred nndll3(curr,prev,header,prevH,size) == curr::Entry<ele3,header,prev> * element3(ele3) & prevH=curr & size=1 || curr::Entry<ele3,next,prev> * nndll3(next,curr,header,prevH,size1) * element(ele3) & size=size1+1";
		
		String pred12 = "pred element1(ele) == ele::ExplicitDependencyImpl<_,_,_,_,_,_>";
		String pred13 = "pred element2(ele) == ele::ImplicitInheritedDependency<_,_,_>";
		String pred14 = "pred element3(ele) == ele::ImplicitSubSuperTaskDependency<_,_,_,_>";
		
		String pred = pred0 + ";" + pred1 + ";" + pred2 + ";" + pred3 + ";" + pred4 + ";" + pred5 + ";" + pred6 + ";" + pred7 + ";" + pred8 +
				";" + pred9 + ";" + pred10 + ";" + pred11 + ";" + pred12 + ";" + pred13 + ";" + pred14;
		Initializer.initPredicate(pred);
	}
	
	@Override
	protected void initPrecondition() {
		String pre = "pre removeImplicitDependencies == fst(root,this_myTxn,this_myData)";
		Initializer.initPrecondition(pre);
	}
	

	@Test
	public void testMain() {
		long begin = System.currentTimeMillis();
		
		if (verifyNoPropertyViolation(
				"+listener=star.StarListener",
				"+star.max_depth=3",
//				"+star.min_int=-100",
//				"+star.max_int=100",
				"+star.test_path=" + Constant.TEST_PATH + "/ganttproject",
				"+star.test_package=ganttproject",
				"+star.test_imports=common.Utilities;ganttproject.LinkedList.Entry;",
				"+classpath=build/examples;lib/ganttproject-guava.jar", 
				"+sourcepath=src/examples",
				"+symbolic.method=ganttproject.DependencyGraph.removeImplicitDependencies(sym)",
				"+symbolic.fields=instance",
				"+symbolic.lazy=true")) {
			DependencyGraph graph = new DependencyGraph();
			graph.removeImplicitDependencies(new Node());
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}

}
