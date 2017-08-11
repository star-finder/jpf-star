package ganttproject;

import gov.nasa.jpf.star.examples.Utilities;
import ganttproject.LinkedList.Entry;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class DependencyGraph_rollbackTransaction1 extends TestJPF {

	@Test
	public void test_rollbackTransaction1() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedList myTouchedNodes_2 = new LinkedList();
		obj.myData = new GraphData();
		Entry header_3 = new Entry();
		GraphData backup_244 = null;
		int size_231 = 0;
		boolean isRunning_1 = false;
		int size_4 = 0;
		Node ele_248 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_244;
		obj.myData.myTxn = obj.myTxn;
		header_3.element = ele_248;
		header_3.next = header_3;
		header_3.previous = header_3;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction2() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedList myTouchedNodes_2 = new LinkedList();
		obj.myData = new GraphData();
		Entry header_3 = new Entry();
		GraphData backup_5 = null;
		Entry header_232 = header_3;
		Entry header_233 = header_3;
		int size_4 = 0;
		boolean isRunning_1 = true;
		Node ele_7 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_5;
		obj.myData.myTxn = obj.myTxn;
		header_3.element = ele_7;
		header_3.next = header_232;
		header_3.previous = header_233;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction3() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedList myTouchedNodes_2 = new LinkedList();
		obj.myData = new GraphData();
		Entry header_3 = new Entry();
		Entry next_8 = new Entry();
		Node ele_10 = new Node();
		NodeData myData_277 = new NodeData();
		GraphData backup_5 = null;
		Entry prev_9 = next_8;
		Entry header_234 = header_3;
		Entry header_235 = header_3;
		NodeData myBackup_271 = null;
		boolean isRunning_1 = true;
		int size_4 = 1;
		Node ele_7 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_5;
		obj.myData.myTxn = obj.myTxn;
		header_3.element = ele_7;
		header_3.next = next_8;
		header_3.previous = prev_9;
		next_8.element = ele_10;
		next_8.next = header_234;
		next_8.previous = header_235;
		ele_10.myData = myData_277;
		myData_277.myBackup = myBackup_271;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction4() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedList myTouchedNodes_2 = new LinkedList();
		obj.myData = new GraphData();
		Entry header_3 = new Entry();
		Entry next_8 = new Entry();
		Node ele_10 = new Node();
		NodeData myData_14 = new NodeData();
		GraphData backup_5 = null;
		Entry prev_9 = next_8;
		NodeData myBackup_15 = null;
		Entry header_240 = header_3;
		Entry header_241 = header_3;
		boolean isRunning_1 = true;
		int size_4 = 1;
		Node ele_7 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_5;
		obj.myData.myTxn = obj.myTxn;
		header_3.element = ele_7;
		header_3.next = next_8;
		header_3.previous = prev_9;
		next_8.element = ele_10;
		next_8.next = header_240;
		next_8.previous = header_241;
		ele_10.myData = myData_14;
		myData_14.myBackup = myBackup_15;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction5() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedList myTouchedNodes_2 = new LinkedList();
		obj.myData = new GraphData();
		Entry header_3 = new Entry();
		Entry next_8 = new Entry();
		Node ele_10 = new Node();
		NodeData myData_14 = new NodeData();
		GraphData backup_5 = null;
		Entry prev_9 = next_8;
		NodeData myBackup_15 = myData_14;
		Entry header_240 = header_3;
		Entry header_241 = header_3;
		boolean isRunning_1 = true;
		int size_4 = 1;
		Node ele_7 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_5;
		obj.myData.myTxn = obj.myTxn;
		header_3.element = ele_7;
		header_3.next = next_8;
		header_3.previous = prev_9;
		next_8.element = ele_10;
		next_8.next = header_240;
		next_8.previous = header_241;
		ele_10.myData = myData_14;
		myData_14.myBackup = myBackup_15;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction6() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedList myTouchedNodes_2 = new LinkedList();
		obj.myData = new GraphData();
		Entry header_3 = new Entry();
		Entry next_8 = new Entry();
		Entry next_11 = new Entry();
		Node ele_10 = new Node();
		NodeData myData_291 = new NodeData();
		Node ele_281 = new Node();
		NodeData myData_306 = new NodeData();
		GraphData backup_5 = null;
		Entry header_234 = header_3;
		Entry next_235 = next_8;
		Entry header_236 = header_3;
		Entry prev_237 = next_11;
		NodeData myBackup_285 = null;
		NodeData myBackup_300 = null;
		boolean isRunning_1 = true;
		int size_4 = 2;
		Entry prev_9 = prev_237;
		Node ele_7 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_5;
		obj.myData.myTxn = obj.myTxn;
		header_3.element = ele_7;
		header_3.next = next_8;
		header_3.previous = prev_9;
		next_8.element = ele_10;
		next_8.next = next_11;
		next_8.previous = header_234;
		next_11.element = ele_281;
		next_11.next = header_236;
		next_11.previous = next_235;
		ele_10.myData = myData_291;
		myData_291.myBackup = myBackup_285;
		ele_281.myData = myData_306;
		myData_306.myBackup = myBackup_300;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction7() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedList myTouchedNodes_2 = new LinkedList();
		obj.myData = new GraphData();
		GraphData backup_5 = new GraphData();
		Entry header_3 = new Entry();
		GraphData backup_22 = null;
		Transaction this_myTxn_233 = obj.myTxn;
		Entry header_234 = header_3;
		Entry header_235 = header_3;
		boolean isRunning_1 = true;
		int size_4 = 0;
		Node ele_7 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_5;
		obj.myData.myTxn = obj.myTxn;
		backup_5.myBackup = backup_22;
		backup_5.myTxn = this_myTxn_233;
		header_3.element = ele_7;
		header_3.next = header_234;
		header_3.previous = header_235;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction8() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedList myTouchedNodes_2 = new LinkedList();
		obj.myData = new GraphData();
		GraphData backup_5 = new GraphData();
		Entry header_3 = new Entry();
		Entry next_8 = new Entry();
		Node ele_10 = new Node();
		NodeData myData_286 = new NodeData();
		GraphData backup_22 = null;
		Entry prev_9 = next_8;
		Transaction this_myTxn_235 = obj.myTxn;
		Entry header_236 = header_3;
		Entry header_237 = header_3;
		NodeData myBackup_280 = null;
		boolean isRunning_1 = true;
		int size_4 = 1;
		Node ele_7 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_5;
		obj.myData.myTxn = obj.myTxn;
		backup_5.myBackup = backup_22;
		backup_5.myTxn = this_myTxn_235;
		header_3.element = ele_7;
		header_3.next = next_8;
		header_3.previous = prev_9;
		next_8.element = ele_10;
		next_8.next = header_236;
		next_8.previous = header_237;
		ele_10.myData = myData_286;
		myData_286.myBackup = myBackup_280;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction9() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedList myTouchedNodes_2 = new LinkedList();
		obj.myData = new GraphData();
		GraphData backup_5 = new GraphData();
		Entry header_3 = new Entry();
		Entry next_8 = new Entry();
		Entry next_11 = new Entry();
		Node ele_10 = new Node();
		NodeData myData_300 = new NodeData();
		Node ele_290 = new Node();
		NodeData myData_315 = new NodeData();
		GraphData backup_22 = null;
		Transaction this_myTxn_235 = obj.myTxn;
		Entry header_236 = header_3;
		Entry next_237 = next_8;
		Entry header_238 = header_3;
		Entry prev_239 = next_11;
		NodeData myBackup_294 = null;
		NodeData myBackup_309 = null;
		boolean isRunning_1 = true;
		int size_4 = 2;
		Entry prev_9 = prev_239;
		Node ele_7 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_5;
		obj.myData.myTxn = obj.myTxn;
		backup_5.myBackup = backup_22;
		backup_5.myTxn = this_myTxn_235;
		header_3.element = ele_7;
		header_3.next = next_8;
		header_3.previous = prev_9;
		next_8.element = ele_10;
		next_8.next = next_11;
		next_8.previous = header_236;
		next_11.element = ele_290;
		next_11.next = header_238;
		next_11.previous = next_237;
		ele_10.myData = myData_300;
		myData_300.myBackup = myBackup_294;
		ele_290.myData = myData_315;
		myData_315.myBackup = myBackup_309;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction10() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedList myTouchedNodes_2 = new LinkedList();
		obj.myData = new GraphData();
		GraphData backup_5 = new GraphData();
		GraphData backup_22 = new GraphData();
		Entry header_3 = new Entry();
		GraphData backup_26 = null;
		Transaction this_myTxn_234 = obj.myTxn;
		Transaction this_myTxn_235 = obj.myTxn;
		Entry header_236 = header_3;
		Entry header_237 = header_3;
		boolean isRunning_1 = true;
		int size_4 = 0;
		Node ele_7 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_5;
		obj.myData.myTxn = obj.myTxn;
		backup_5.myBackup = backup_22;
		backup_5.myTxn = this_myTxn_234;
		backup_22.myBackup = backup_26;
		backup_22.myTxn = this_myTxn_235;
		header_3.element = ele_7;
		header_3.next = header_236;
		header_3.previous = header_237;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

}

