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
public class Gantt_removeTest extends TestJPF {
	
	private void initDataNode() {
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
		
		ANTLRInputStream in = new ANTLRInputStream(data);
		DataNodeLexer lexer = new DataNodeLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DataNodeParser parser = new DataNodeParser(tokens);
		
        DataNode[] dns = parser.datas().dns;
        DataNodeMap.put(dns);
	}
	
	private void initPredicate() {
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
		
		ANTLRInputStream in = new ANTLRInputStream(pred);
		InductivePredLexer lexer = new InductivePredLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        InductivePredParser parser = new InductivePredParser(tokens);
        
        InductivePred[] ips = parser.preds().ips;
        InductivePredMap.put(ips);
	}
	
	private void initPrecondition() {
		String pre = "pre removeImplicitDependencies == fst(root,this_myTxn,this_myData)";
		
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
				"+star.max_depth=3",
//				"+star.min_int=-100",
//				"+star.max_int=100",
				"+star.test_path=/Users/HongLongPham/Workspace/JPF_HOME/jpf-star/src/examples/ganttproject",
				"+star.test_package=ganttproject",
				"+star.test_imports=gov.nasa.jpf.star.examples.Utilities;ganttproject.LinkedList.Entry;",
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
