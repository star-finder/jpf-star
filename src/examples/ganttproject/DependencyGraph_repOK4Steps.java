package ganttproject;

import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class DependencyGraph_repOK4Steps extends TestJPF {

	@Test
	public void test_repOK1() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = null;
		obj.myData = null;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK2() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		obj.myData = null;
		boolean isRunning_1 = false;
		LinkedListNode myTouchedNodes_2 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK3() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		obj.myData = new GraphData();
		Transaction myTxn_5 = obj.myTxn;
		LinkedListNode myTouchedNodes_2 = null;
		boolean isRunning_1 = false;
//		void myLayers_3 = null;
		GraphData myBackup_4 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
//		obj.myData.myLayers = myLayers_3;
		obj.myData.myBackup = myBackup_4;
		obj.myData.myTxn = myTxn_5;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK4() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		obj.myData = new GraphData();
		Transaction myTxn_5 = null;
		boolean isRunning_1 = false;
		LinkedListNode myTouchedNodes_2 = null;
//		void myLayers_3 = null;
		GraphData myBackup_4 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
//		obj.myData.myLayers = myLayers_3;
		obj.myData.myBackup = myBackup_4;
		obj.myData.myTxn = myTxn_5;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

	@Test
	public void test_repOK5() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		obj.myData = new GraphData();
		Transaction myTxn_5 = new Transaction();
		LinkedListNode myTouchedNodes_13 = null;
		boolean isRunning_1 = false;
		LinkedListNode myTouchedNodes_2 = null;
//		void myLayers_3 = null;
		GraphData myBackup_4 = null;
		boolean isRunning_12 = false;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
//		obj.myData.myLayers = myLayers_3;
		obj.myData.myBackup = myBackup_4;
		obj.myData.myTxn = myTxn_5;
		myTxn_5.isRunning = isRunning_12;
		myTxn_5.myTouchedNodes = myTouchedNodes_13;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

}

