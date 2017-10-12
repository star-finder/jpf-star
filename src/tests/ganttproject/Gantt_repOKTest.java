package ganttproject;
import org.junit.Test;

import common.Constant;
import common.TestStar;
import starlib.precondition.Initializer;

public class Gantt_repOKTest extends TestStar {
	
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
	}
	
	@Override
	protected void initPrecondition() {
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
				"+star.test_path=" + Constant.TEST_PATH + "/ganttproject",
				"+star.test_package=ganttproject",
				"+star.test_imports=common.Utilities",
				"+classpath=build/examples;lib/ganttproject-guava.jar", 
				"+sourcepath=src/examples",
				"+symbolic.method=ganttproject.DependencyGraph.repOK()",
				"+symbolic.fields=instance",
				"+symbolic.lazy=true")) {
			DependencyGraph graph = new DependencyGraph();
			graph.repOK();
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}

}
