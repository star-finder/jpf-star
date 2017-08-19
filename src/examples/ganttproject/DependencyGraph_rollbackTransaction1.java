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
		Transaction trans1_261 = new Transaction();
		Entry header_3 = new Entry();
		int size_4 = 0;
		boolean isRunning_1 = false;
		boolean isRunning1_260 = false;
		int size_246 = 0;
		Node ele_268 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myTxn = trans1_261;
		trans1_261.isRunning = isRunning1_260;
		header_3.element = ele_268;
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
		Transaction trans1_5 = new Transaction();
		Entry header_3 = new Entry();
		Entry header_249 = header_3;
		Entry header_250 = header_3;
		boolean isRunning1_6 = false;
		int size_4 = 0;
		boolean isRunning_1 = true;
		Node ele_9 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myTxn = trans1_5;
		trans1_5.isRunning = isRunning1_6;
		header_3.element = ele_9;
		header_3.next = header_249;
		header_3.previous = header_250;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction3() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedList myTouchedNodes_2 = new LinkedList();
		obj.myData = new GraphData();
		Transaction trans1_5 = new Transaction();
		Entry header_3 = new Entry();
		Entry next_10 = new Entry();
		Node ele_12 = new Node();
		NodeData myData_296 = new NodeData();
		Entry prev_11 = next_10;
		Entry header_251 = header_3;
		Entry header_252 = header_3;
		NodeData myBackup_290 = null;
		boolean isRunning_1 = true;
		boolean isRunning1_6 = false;
		int size_4 = 1;
		Node ele_9 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myTxn = trans1_5;
		trans1_5.isRunning = isRunning1_6;
		header_3.element = ele_9;
		header_3.next = next_10;
		header_3.previous = prev_11;
		next_10.element = ele_12;
		next_10.next = header_251;
		next_10.previous = header_252;
		ele_12.myData = myData_296;
		myData_296.myBackup = myBackup_290;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction4() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedList myTouchedNodes_2 = new LinkedList();
		obj.myData = new GraphData();
		Transaction trans1_5 = new Transaction();
		Entry header_3 = new Entry();
		Entry next_10 = new Entry();
		Node ele_12 = new Node();
		NodeData myData_16 = new NodeData();
		Entry prev_11 = next_10;
		NodeData myBackup_17 = null;
		Entry header_257 = header_3;
		Entry header_258 = header_3;
		boolean isRunning_1 = true;
		boolean isRunning1_6 = false;
		int size_4 = 1;
		Node ele_9 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myTxn = trans1_5;
		trans1_5.isRunning = isRunning1_6;
		header_3.element = ele_9;
		header_3.next = next_10;
		header_3.previous = prev_11;
		next_10.element = ele_12;
		next_10.next = header_257;
		next_10.previous = header_258;
		ele_12.myData = myData_16;
		myData_16.myBackup = myBackup_17;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction5() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedList myTouchedNodes_2 = new LinkedList();
		obj.myData = new GraphData();
		Transaction trans1_5 = new Transaction();
		Entry header_3 = new Entry();
		Entry next_10 = new Entry();
		Node ele_12 = new Node();
		NodeData myData_16 = new NodeData();
		Entry prev_11 = next_10;
		NodeData myBackup_17 = myData_16;
		Entry header_257 = header_3;
		Entry header_258 = header_3;
		boolean isRunning_1 = true;
		boolean isRunning1_6 = false;
		int size_4 = 1;
		Node ele_9 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myTxn = trans1_5;
		trans1_5.isRunning = isRunning1_6;
		header_3.element = ele_9;
		header_3.next = next_10;
		header_3.previous = prev_11;
		next_10.element = ele_12;
		next_10.next = header_257;
		next_10.previous = header_258;
		ele_12.myData = myData_16;
		myData_16.myBackup = myBackup_17;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction6() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedList myTouchedNodes_2 = new LinkedList();
		obj.myData = new GraphData();
		Transaction trans1_5 = new Transaction();
		Entry header_3 = new Entry();
		Entry next_10 = new Entry();
		Entry next_13 = new Entry();
		Node ele_12 = new Node();
		NodeData myData_310 = new NodeData();
		Node ele_300 = new Node();
		NodeData myData_325 = new NodeData();
		Entry header_251 = header_3;
		Entry next_252 = next_10;
		Entry header_253 = header_3;
		Entry prev_254 = next_13;
		NodeData myBackup_304 = null;
		NodeData myBackup_319 = null;
		boolean isRunning1_6 = false;
		boolean isRunning_1 = true;
		int size_4 = 2;
		Entry prev_11 = prev_254;
		Node ele_9 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myTxn = trans1_5;
		trans1_5.isRunning = isRunning1_6;
		header_3.element = ele_9;
		header_3.next = next_10;
		header_3.previous = prev_11;
		next_10.element = ele_12;
		next_10.next = next_13;
		next_10.previous = header_251;
		next_13.element = ele_300;
		next_13.next = header_253;
		next_13.previous = next_252;
		ele_12.myData = myData_310;
		myData_310.myBackup = myBackup_304;
		ele_300.myData = myData_325;
		myData_325.myBackup = myBackup_319;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction7() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedList myTouchedNodes_2 = new LinkedList();
		obj.myData = new GraphData();
		Entry header_3 = new Entry();
		GraphData backup_7 = null;
		Entry header_247 = header_3;
		Entry header_248 = header_3;
		int size_4 = 0;
		boolean isRunning_1 = true;
		Node ele_9 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_7;
		obj.myData.myTxn = obj.myTxn;
		header_3.element = ele_9;
		header_3.next = header_247;
		header_3.previous = header_248;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction8() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedList myTouchedNodes_2 = new LinkedList();
		obj.myData = new GraphData();
		Entry header_3 = new Entry();
		Entry next_10 = new Entry();
		Node ele_12 = new Node();
		NodeData myData_292 = new NodeData();
		GraphData backup_7 = null;
		Entry prev_11 = next_10;
		Entry header_249 = header_3;
		Entry header_250 = header_3;
		NodeData myBackup_286 = null;
		boolean isRunning_1 = true;
		int size_4 = 1;
		Node ele_9 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_7;
		obj.myData.myTxn = obj.myTxn;
		header_3.element = ele_9;
		header_3.next = next_10;
		header_3.previous = prev_11;
		next_10.element = ele_12;
		next_10.next = header_249;
		next_10.previous = header_250;
		ele_12.myData = myData_292;
		myData_292.myBackup = myBackup_286;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction9() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedList myTouchedNodes_2 = new LinkedList();
		obj.myData = new GraphData();
		Entry header_3 = new Entry();
		Entry next_10 = new Entry();
		Node ele_12 = new Node();
		NodeData myData_16 = new NodeData();
		GraphData backup_7 = null;
		Entry prev_11 = next_10;
		NodeData myBackup_17 = null;
		Entry header_255 = header_3;
		Entry header_256 = header_3;
		boolean isRunning_1 = true;
		int size_4 = 1;
		Node ele_9 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_7;
		obj.myData.myTxn = obj.myTxn;
		header_3.element = ele_9;
		header_3.next = next_10;
		header_3.previous = prev_11;
		next_10.element = ele_12;
		next_10.next = header_255;
		next_10.previous = header_256;
		ele_12.myData = myData_16;
		myData_16.myBackup = myBackup_17;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction10() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedList myTouchedNodes_2 = new LinkedList();
		obj.myData = new GraphData();
		Entry header_3 = new Entry();
		Entry next_10 = new Entry();
		Node ele_12 = new Node();
		NodeData myData_16 = new NodeData();
		GraphData backup_7 = null;
		Entry prev_11 = next_10;
		NodeData myBackup_17 = myData_16;
		Entry header_255 = header_3;
		Entry header_256 = header_3;
		boolean isRunning_1 = true;
		int size_4 = 1;
		Node ele_9 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_7;
		obj.myData.myTxn = obj.myTxn;
		header_3.element = ele_9;
		header_3.next = next_10;
		header_3.previous = prev_11;
		next_10.element = ele_12;
		next_10.next = header_255;
		next_10.previous = header_256;
		ele_12.myData = myData_16;
		myData_16.myBackup = myBackup_17;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction11() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedList myTouchedNodes_2 = new LinkedList();
		obj.myData = new GraphData();
		Entry header_3 = new Entry();
		Entry next_10 = new Entry();
		Entry next_13 = new Entry();
		Node ele_12 = new Node();
		NodeData myData_306 = new NodeData();
		Node ele_296 = new Node();
		NodeData myData_321 = new NodeData();
		GraphData backup_7 = null;
		Entry header_249 = header_3;
		Entry next_250 = next_10;
		Entry header_251 = header_3;
		Entry prev_252 = next_13;
		NodeData myBackup_300 = null;
		NodeData myBackup_315 = null;
		boolean isRunning_1 = true;
		int size_4 = 2;
		Entry prev_11 = prev_252;
		Node ele_9 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_7;
		obj.myData.myTxn = obj.myTxn;
		header_3.element = ele_9;
		header_3.next = next_10;
		header_3.previous = prev_11;
		next_10.element = ele_12;
		next_10.next = next_13;
		next_10.previous = header_249;
		next_13.element = ele_296;
		next_13.next = header_251;
		next_13.previous = next_250;
		ele_12.myData = myData_306;
		myData_306.myBackup = myBackup_300;
		ele_296.myData = myData_321;
		myData_321.myBackup = myBackup_315;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction12() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedList myTouchedNodes_2 = new LinkedList();
		obj.myData = new GraphData();
		GraphData backup_7 = new GraphData();
		Transaction trans1_27 = new Transaction();
		Entry header_3 = new Entry();
		Entry header_250 = header_3;
		Entry header_251 = header_3;
		boolean isRunning1_28 = false;
		int size_4 = 0;
		boolean isRunning_1 = true;
		Node ele_9 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_7;
		obj.myData.myTxn = obj.myTxn;
		backup_7.myTxn = trans1_27;
		trans1_27.isRunning = isRunning1_28;
		header_3.element = ele_9;
		header_3.next = header_250;
		header_3.previous = header_251;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction13() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedList myTouchedNodes_2 = new LinkedList();
		obj.myData = new GraphData();
		GraphData backup_7 = new GraphData();
		Transaction trans1_27 = new Transaction();
		Entry header_3 = new Entry();
		Entry next_10 = new Entry();
		Node ele_12 = new Node();
		NodeData myData_301 = new NodeData();
		Entry prev_11 = next_10;
		Entry header_252 = header_3;
		Entry header_253 = header_3;
		NodeData myBackup_295 = null;
		boolean isRunning1_28 = false;
		boolean isRunning_1 = true;
		int size_4 = 1;
		Node ele_9 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_7;
		obj.myData.myTxn = obj.myTxn;
		backup_7.myTxn = trans1_27;
		trans1_27.isRunning = isRunning1_28;
		header_3.element = ele_9;
		header_3.next = next_10;
		header_3.previous = prev_11;
		next_10.element = ele_12;
		next_10.next = header_252;
		next_10.previous = header_253;
		ele_12.myData = myData_301;
		myData_301.myBackup = myBackup_295;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction14() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedList myTouchedNodes_2 = new LinkedList();
		obj.myData = new GraphData();
		GraphData backup_7 = new GraphData();
		Transaction trans1_27 = new Transaction();
		Entry header_3 = new Entry();
		Entry next_10 = new Entry();
		Entry next_13 = new Entry();
		Node ele_12 = new Node();
		NodeData myData_315 = new NodeData();
		Node ele_305 = new Node();
		NodeData myData_330 = new NodeData();
		Entry header_252 = header_3;
		Entry next_253 = next_10;
		Entry header_254 = header_3;
		Entry prev_255 = next_13;
		NodeData myBackup_309 = null;
		NodeData myBackup_324 = null;
		boolean isRunning1_28 = false;
		boolean isRunning_1 = true;
		int size_4 = 2;
		Entry prev_11 = prev_255;
		Node ele_9 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_7;
		obj.myData.myTxn = obj.myTxn;
		backup_7.myTxn = trans1_27;
		trans1_27.isRunning = isRunning1_28;
		header_3.element = ele_9;
		header_3.next = next_10;
		header_3.previous = prev_11;
		next_10.element = ele_12;
		next_10.next = next_13;
		next_10.previous = header_252;
		next_13.element = ele_305;
		next_13.next = header_254;
		next_13.previous = next_253;
		ele_12.myData = myData_315;
		myData_315.myBackup = myBackup_309;
		ele_305.myData = myData_330;
		myData_330.myBackup = myBackup_324;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction15() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedList myTouchedNodes_2 = new LinkedList();
		obj.myData = new GraphData();
		GraphData backup_7 = new GraphData();
		Entry header_3 = new Entry();
		GraphData backup_29 = null;
		Transaction this_myTxn_248 = obj.myTxn;
		Entry header_249 = header_3;
		Entry header_250 = header_3;
		boolean isRunning_1 = true;
		int size_4 = 0;
		Node ele_9 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_7;
		obj.myData.myTxn = obj.myTxn;
		backup_7.myBackup = backup_29;
		backup_7.myTxn = this_myTxn_248;
		header_3.element = ele_9;
		header_3.next = header_249;
		header_3.previous = header_250;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction16() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedList myTouchedNodes_2 = new LinkedList();
		obj.myData = new GraphData();
		GraphData backup_7 = new GraphData();
		Entry header_3 = new Entry();
		Entry next_10 = new Entry();
		Node ele_12 = new Node();
		NodeData myData_301 = new NodeData();
		GraphData backup_29 = null;
		Entry prev_11 = next_10;
		Transaction this_myTxn_250 = obj.myTxn;
		Entry header_251 = header_3;
		Entry header_252 = header_3;
		NodeData myBackup_295 = null;
		boolean isRunning_1 = true;
		int size_4 = 1;
		Node ele_9 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_7;
		obj.myData.myTxn = obj.myTxn;
		backup_7.myBackup = backup_29;
		backup_7.myTxn = this_myTxn_250;
		header_3.element = ele_9;
		header_3.next = next_10;
		header_3.previous = prev_11;
		next_10.element = ele_12;
		next_10.next = header_251;
		next_10.previous = header_252;
		ele_12.myData = myData_301;
		myData_301.myBackup = myBackup_295;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction17() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedList myTouchedNodes_2 = new LinkedList();
		obj.myData = new GraphData();
		GraphData backup_7 = new GraphData();
		Entry header_3 = new Entry();
		Entry next_10 = new Entry();
		Entry next_13 = new Entry();
		Node ele_12 = new Node();
		NodeData myData_315 = new NodeData();
		Node ele_305 = new Node();
		NodeData myData_330 = new NodeData();
		GraphData backup_29 = null;
		Transaction this_myTxn_250 = obj.myTxn;
		Entry header_251 = header_3;
		Entry next_252 = next_10;
		Entry header_253 = header_3;
		Entry prev_254 = next_13;
		NodeData myBackup_309 = null;
		NodeData myBackup_324 = null;
		boolean isRunning_1 = true;
		int size_4 = 2;
		Entry prev_11 = prev_254;
		Node ele_9 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_7;
		obj.myData.myTxn = obj.myTxn;
		backup_7.myBackup = backup_29;
		backup_7.myTxn = this_myTxn_250;
		header_3.element = ele_9;
		header_3.next = next_10;
		header_3.previous = prev_11;
		next_10.element = ele_12;
		next_10.next = next_13;
		next_10.previous = header_251;
		next_13.element = ele_305;
		next_13.next = header_253;
		next_13.previous = next_252;
		ele_12.myData = myData_315;
		myData_315.myBackup = myBackup_309;
		ele_305.myData = myData_330;
		myData_330.myBackup = myBackup_324;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction18() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedList myTouchedNodes_2 = new LinkedList();
		obj.myData = new GraphData();
		GraphData backup_7 = new GraphData();
		GraphData backup_29 = new GraphData();
		Transaction trans1_36 = new Transaction();
		Entry header_3 = new Entry();
		Transaction this_myTxn_251 = obj.myTxn;
		Entry header_252 = header_3;
		Entry header_253 = header_3;
		boolean isRunning_1 = true;
		boolean isRunning1_37 = false;
		int size_4 = 0;
		Node ele_9 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_7;
		obj.myData.myTxn = obj.myTxn;
		backup_7.myBackup = backup_29;
		backup_7.myTxn = this_myTxn_251;
		backup_29.myTxn = trans1_36;
		trans1_36.isRunning = isRunning1_37;
		header_3.element = ele_9;
		header_3.next = header_252;
		header_3.previous = header_253;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction19() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedList myTouchedNodes_2 = new LinkedList();
		obj.myData = new GraphData();
		GraphData backup_7 = new GraphData();
		GraphData backup_29 = new GraphData();
		Entry header_3 = new Entry();
		GraphData backup_38 = null;
		Transaction this_myTxn_249 = obj.myTxn;
		Transaction this_myTxn_250 = obj.myTxn;
		Entry header_251 = header_3;
		Entry header_252 = header_3;
		boolean isRunning_1 = true;
		int size_4 = 0;
		Node ele_9 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_7;
		obj.myData.myTxn = obj.myTxn;
		backup_7.myBackup = backup_29;
		backup_7.myTxn = this_myTxn_249;
		backup_29.myBackup = backup_38;
		backup_29.myTxn = this_myTxn_250;
		header_3.element = ele_9;
		header_3.next = header_251;
		header_3.previous = header_252;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

}

