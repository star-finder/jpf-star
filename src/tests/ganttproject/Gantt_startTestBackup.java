package ganttproject;
import org.junit.Test;

import common.Constant;
import common.TestStar;
import star.precondition.Initializer;

public class Gantt_startTestBackup extends TestStar {
	
	@Override
	protected void initDataNode() {
		String data1 = "data Transaction {boolean isRunning; void myTouchedNodes}";
		String data2 = "data GraphData {void myLayers; void myBackup; void myTxn}";
		
		String data = data1 + ";" + data2;
		Initializer.initDataNode(data);
	}
	
	@Override
	protected void initPredicate() {
		String pred = "pred cond(trans,myData) == trans::Transaction<isRunning,_> * myData::GraphData<_,_,_>";
		Initializer.initPredicate(pred);
	}
	
	@Override
	protected void initPrecondition() {
		String pre = "pre startTransaction == cond(this_myTxn,this_myData)";
		Initializer.initPrecondition(pre);
	}
	

	@Test
	public void testMain() {
		long begin = System.currentTimeMillis();
		
		if (verifyNoPropertyViolation(
				"+listener=star.StarListener",
				"+star.max_depth=1",
//				"+star.min_int=-100",
//				"+star.max_int=100",
				"+star.test_path=" + Constant.TEST_PATH + "/ganttproject",
				"+star.test_package=ganttproject",
				"+star.test_imports=common.Utilities",
				"+classpath=build/examples;lib/ganttproject-guava.jar", 
				"+sourcepath=src/examples",
				"+symbolic.method=ganttproject.DependencyGraph.startTransaction()",
				"+symbolic.fields=instance",
				"+symbolic.lazy=true")) {
			DependencyGraph graph = new DependencyGraph();
			graph.startTransaction();
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}

}
