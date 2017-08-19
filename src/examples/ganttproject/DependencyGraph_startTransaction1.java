package ganttproject;

import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class DependencyGraph_startTransaction1 extends TestJPF {

	@Test
	public void test_startTransaction1() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		obj.myData = new GraphData();
		boolean isRunning_1 = true;
		obj.myTxn.isRunning = isRunning_1;
		System.out.println(Utilities.repOK(obj));
		obj.startTransaction();
	}

	@Test
	public void test_startTransaction2() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		obj.myData = new GraphData();
		boolean isRunning_1 = false;
		obj.myTxn.isRunning = isRunning_1;
		System.out.println(Utilities.repOK(obj));
		obj.startTransaction();
	}

}

