package ganttproject;

import gov.nasa.jpf.star.examples.Utilities;
import ganttproject.LinkedListNode.EntryNode;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class DependencyGraph_rollbackTransaction1 extends TestJPF {

	@Test
	public void test_rollbackTransaction1() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedListNode myTouchedNodes_2 = new LinkedListNode();
		obj.myData = new GraphData();
		Transaction trans_228 = new Transaction();
		EntryNode header_3 = new EntryNode();
		GraphData backup_229 = null;
		int size_213 = 0;
		int size_4 = 0;
		boolean isRunning_1 = false;
		boolean isRunning_227 = false;
		Node ele_236 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_229;
		obj.myData.myTxn = trans_228;
		trans_228.isRunning = isRunning_227;
		header_3.element = ele_236;
		header_3.next = header_3;
		header_3.previous = header_3;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction2() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedListNode myTouchedNodes_2 = new LinkedListNode();
		obj.myData = new GraphData();
		Transaction trans_6 = new Transaction();
		EntryNode header_3 = new EntryNode();
		GraphData backup_5 = null;
		EntryNode header_215 = header_3;
		EntryNode header_216 = header_3;
		int size_4 = 0;
		boolean isRunning_1 = true;
		boolean isRunning_7 = true;
		Node ele_9 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_5;
		obj.myData.myTxn = trans_6;
		trans_6.isRunning = isRunning_7;
		header_3.element = ele_9;
		header_3.next = header_215;
		header_3.previous = header_216;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction3() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedListNode myTouchedNodes_2 = new LinkedListNode();
		obj.myData = new GraphData();
		Transaction trans_6 = new Transaction();
		EntryNode header_3 = new EntryNode();
		EntryNode next_10 = new EntryNode();
		Node ele_12 = new Node();
		NodeData myData1_13 = new NodeData();
		GraphData backup_5 = null;
		EntryNode prev_11 = next_10;
		EntryNode header_223 = header_3;
		EntryNode header_224 = header_3;
		boolean isRunning_1 = true;
		int size_4 = 1;
		boolean isRunning_7 = true;
		Node ele_9 = null;
		NodeData myBackup_14 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_5;
		obj.myData.myTxn = trans_6;
		trans_6.isRunning = isRunning_7;
		header_3.element = ele_9;
		header_3.next = next_10;
		header_3.previous = prev_11;
		next_10.element = ele_12;
		next_10.next = header_223;
		next_10.previous = header_224;
		ele_12.myData = myData1_13;
		myData1_13.myBackup = myBackup_14;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction4() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedListNode myTouchedNodes_2 = new LinkedListNode();
		obj.myData = new GraphData();
		Transaction trans_6 = new Transaction();
		EntryNode header_3 = new EntryNode();
		EntryNode next_10 = new EntryNode();
		Node ele_12 = new Node();
		NodeData myData1_13 = new NodeData();
		GraphData backup_5 = null;
		EntryNode prev_11 = next_10;
		NodeData myBackup_14 = null;
		EntryNode header_223 = header_3;
		EntryNode header_224 = header_3;
		boolean isRunning_1 = true;
		int size_4 = 1;
		boolean isRunning_7 = true;
		Node ele_9 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_5;
		obj.myData.myTxn = trans_6;
		trans_6.isRunning = isRunning_7;
		header_3.element = ele_9;
		header_3.next = next_10;
		header_3.previous = prev_11;
		next_10.element = ele_12;
		next_10.next = header_223;
		next_10.previous = header_224;
		ele_12.myData = myData1_13;
		myData1_13.myBackup = myBackup_14;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction5() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedListNode myTouchedNodes_2 = new LinkedListNode();
		obj.myData = new GraphData();
		Transaction trans_6 = new Transaction();
		EntryNode header_3 = new EntryNode();
		EntryNode next_10 = new EntryNode();
		Node ele_12 = new Node();
		NodeData myData1_13 = new NodeData();
		GraphData backup_5 = null;
		EntryNode prev_11 = next_10;
		EntryNode header_223 = header_3;
		EntryNode header_224 = header_3;
		boolean isRunning_1 = true;
		int size_4 = 1;
		boolean isRunning_7 = true;
		NodeData myBackup_14 = new NodeData();
		Node ele_9 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_5;
		obj.myData.myTxn = trans_6;
		trans_6.isRunning = isRunning_7;
		header_3.element = ele_9;
		header_3.next = next_10;
		header_3.previous = prev_11;
		next_10.element = ele_12;
		next_10.next = header_223;
		next_10.previous = header_224;
		ele_12.myData = myData1_13;
		myData1_13.myBackup = myBackup_14;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction6() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedListNode myTouchedNodes_2 = new LinkedListNode();
		obj.myData = new GraphData();
		Transaction trans_6 = new Transaction();
		EntryNode header_3 = new EntryNode();
		EntryNode next_10 = new EntryNode();
		Node ele_12 = new Node();
		NodeData myData1_13 = new NodeData();
		EntryNode next_15 = new EntryNode();
		Node ele_289 = new Node();
		NodeData myData1_287 = new NodeData();
		GraphData backup_5 = null;
		EntryNode header_223 = header_3;
		EntryNode next_224 = next_10;
		EntryNode header_225 = header_3;
		EntryNode prev_226 = next_15;
		boolean isRunning_1 = true;
		int size_4 = 2;
		boolean isRunning_7 = true;
		EntryNode prev_11 = prev_226;
		Node ele_9 = null;
		NodeData myBackup_14 = null;
		NodeData myBackup_281 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_5;
		obj.myData.myTxn = trans_6;
		trans_6.isRunning = isRunning_7;
		header_3.element = ele_9;
		header_3.next = next_10;
		header_3.previous = prev_11;
		next_10.element = ele_12;
		next_10.next = next_15;
		next_10.previous = header_223;
		ele_12.myData = myData1_13;
		myData1_13.myBackup = myBackup_14;
		next_15.element = ele_289;
		next_15.next = header_225;
		next_15.previous = next_224;
		ele_289.myData = myData1_287;
		myData1_287.myBackup = myBackup_281;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction7() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedListNode myTouchedNodes_2 = new LinkedListNode();
		obj.myData = new GraphData();
		Transaction trans_6 = new Transaction();
		EntryNode header_3 = new EntryNode();
		GraphData backup_5 = null;
		EntryNode header_215 = header_3;
		EntryNode header_216 = header_3;
		int size_4 = 0;
		boolean isRunning_1 = true;
		boolean isRunning_7 = false;
		Node ele_9 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_5;
		obj.myData.myTxn = trans_6;
		trans_6.isRunning = isRunning_7;
		header_3.element = ele_9;
		header_3.next = header_215;
		header_3.previous = header_216;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction8() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedListNode myTouchedNodes_2 = new LinkedListNode();
		obj.myData = new GraphData();
		Transaction trans_6 = new Transaction();
		EntryNode header_3 = new EntryNode();
		EntryNode next_10 = new EntryNode();
		Node ele_12 = new Node();
		NodeData myData1_13 = new NodeData();
		GraphData backup_5 = null;
		EntryNode prev_11 = next_10;
		EntryNode header_223 = header_3;
		EntryNode header_224 = header_3;
		boolean isRunning_1 = true;
		int size_4 = 1;
		boolean isRunning_7 = false;
		Node ele_9 = null;
		NodeData myBackup_14 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_5;
		obj.myData.myTxn = trans_6;
		trans_6.isRunning = isRunning_7;
		header_3.element = ele_9;
		header_3.next = next_10;
		header_3.previous = prev_11;
		next_10.element = ele_12;
		next_10.next = header_223;
		next_10.previous = header_224;
		ele_12.myData = myData1_13;
		myData1_13.myBackup = myBackup_14;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction9() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedListNode myTouchedNodes_2 = new LinkedListNode();
		obj.myData = new GraphData();
		Transaction trans_6 = new Transaction();
		EntryNode header_3 = new EntryNode();
		EntryNode next_10 = new EntryNode();
		Node ele_12 = new Node();
		NodeData myData1_13 = new NodeData();
		GraphData backup_5 = null;
		EntryNode prev_11 = next_10;
		NodeData myBackup_14 = null;
		EntryNode header_223 = header_3;
		EntryNode header_224 = header_3;
		boolean isRunning_1 = true;
		int size_4 = 1;
		boolean isRunning_7 = false;
		Node ele_9 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_5;
		obj.myData.myTxn = trans_6;
		trans_6.isRunning = isRunning_7;
		header_3.element = ele_9;
		header_3.next = next_10;
		header_3.previous = prev_11;
		next_10.element = ele_12;
		next_10.next = header_223;
		next_10.previous = header_224;
		ele_12.myData = myData1_13;
		myData1_13.myBackup = myBackup_14;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction10() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedListNode myTouchedNodes_2 = new LinkedListNode();
		obj.myData = new GraphData();
		Transaction trans_6 = new Transaction();
		EntryNode header_3 = new EntryNode();
		EntryNode next_10 = new EntryNode();
		Node ele_12 = new Node();
		NodeData myData1_13 = new NodeData();
		GraphData backup_5 = null;
		EntryNode prev_11 = next_10;
		EntryNode header_223 = header_3;
		EntryNode header_224 = header_3;
		boolean isRunning_1 = true;
		int size_4 = 1;
		boolean isRunning_7 = false;
		NodeData myBackup_14 = new NodeData();
		Node ele_9 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_5;
		obj.myData.myTxn = trans_6;
		trans_6.isRunning = isRunning_7;
		header_3.element = ele_9;
		header_3.next = next_10;
		header_3.previous = prev_11;
		next_10.element = ele_12;
		next_10.next = header_223;
		next_10.previous = header_224;
		ele_12.myData = myData1_13;
		myData1_13.myBackup = myBackup_14;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction11() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedListNode myTouchedNodes_2 = new LinkedListNode();
		obj.myData = new GraphData();
		Transaction trans_6 = new Transaction();
		EntryNode header_3 = new EntryNode();
		EntryNode next_10 = new EntryNode();
		Node ele_12 = new Node();
		NodeData myData1_13 = new NodeData();
		EntryNode next_15 = new EntryNode();
		Node ele_289 = new Node();
		NodeData myData1_287 = new NodeData();
		GraphData backup_5 = null;
		EntryNode header_223 = header_3;
		EntryNode next_224 = next_10;
		EntryNode header_225 = header_3;
		EntryNode prev_226 = next_15;
		boolean isRunning_1 = true;
		int size_4 = 2;
		boolean isRunning_7 = false;
		EntryNode prev_11 = prev_226;
		Node ele_9 = null;
		NodeData myBackup_14 = null;
		NodeData myBackup_281 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_5;
		obj.myData.myTxn = trans_6;
		trans_6.isRunning = isRunning_7;
		header_3.element = ele_9;
		header_3.next = next_10;
		header_3.previous = prev_11;
		next_10.element = ele_12;
		next_10.next = next_15;
		next_10.previous = header_223;
		ele_12.myData = myData1_13;
		myData1_13.myBackup = myBackup_14;
		next_15.element = ele_289;
		next_15.next = header_225;
		next_15.previous = next_224;
		ele_289.myData = myData1_287;
		myData1_287.myBackup = myBackup_281;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction12() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedListNode myTouchedNodes_2 = new LinkedListNode();
		obj.myData = new GraphData();
		Transaction trans_6 = new Transaction();
		GraphData backup_5 = new GraphData();
		Transaction trans_28 = new Transaction();
		EntryNode header_3 = new EntryNode();
		GraphData backup_27 = null;
		EntryNode header_217 = header_3;
		EntryNode header_218 = header_3;
		boolean isRunning_1 = true;
		boolean isRunning_29 = true;
		int size_4 = 0;
		boolean isRunning_7 = true;
		Node ele_9 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_5;
		obj.myData.myTxn = trans_6;
		trans_6.isRunning = isRunning_7;
		backup_5.myBackup = backup_27;
		backup_5.myTxn = trans_28;
		trans_28.isRunning = isRunning_29;
		header_3.element = ele_9;
		header_3.next = header_217;
		header_3.previous = header_218;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction13() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedListNode myTouchedNodes_2 = new LinkedListNode();
		obj.myData = new GraphData();
		Transaction trans_6 = new Transaction();
		GraphData backup_5 = new GraphData();
		Transaction trans_28 = new Transaction();
		EntryNode header_3 = new EntryNode();
		GraphData backup_27 = null;
		EntryNode header_217 = header_3;
		EntryNode header_218 = header_3;
		boolean isRunning_29 = false;
		boolean isRunning_1 = true;
		int size_4 = 0;
		boolean isRunning_7 = true;
		Node ele_9 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_5;
		obj.myData.myTxn = trans_6;
		trans_6.isRunning = isRunning_7;
		backup_5.myBackup = backup_27;
		backup_5.myTxn = trans_28;
		trans_28.isRunning = isRunning_29;
		header_3.element = ele_9;
		header_3.next = header_217;
		header_3.previous = header_218;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction14() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedListNode myTouchedNodes_2 = new LinkedListNode();
		obj.myData = new GraphData();
		Transaction trans_6 = new Transaction();
		GraphData backup_5 = new GraphData();
		Transaction trans_28 = new Transaction();
		EntryNode header_3 = new EntryNode();
		GraphData backup_27 = new GraphData();
		Transaction trans_256 = new Transaction();
		EntryNode header_217 = header_3;
		EntryNode header_218 = header_3;
		GraphData backup_257 = null;
		boolean isRunning_29 = false;
		boolean isRunning_1 = true;
		int size_4 = 0;
		boolean isRunning_7 = true;
		Node ele_9 = null;
		boolean isRunning_255 = false;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_5;
		obj.myData.myTxn = trans_6;
		trans_6.isRunning = isRunning_7;
		backup_5.myBackup = backup_27;
		backup_5.myTxn = trans_28;
		trans_28.isRunning = isRunning_29;
		header_3.element = ele_9;
		header_3.next = header_217;
		header_3.previous = header_218;
		backup_27.myBackup = backup_257;
		backup_27.myTxn = trans_256;
		trans_256.isRunning = isRunning_255;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction15() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedListNode myTouchedNodes_2 = new LinkedListNode();
		obj.myData = new GraphData();
		Transaction trans_6 = new Transaction();
		EntryNode header_3 = new EntryNode();
		GraphData backup_5 = new GraphData();
		Transaction trans_247 = new Transaction();
		EntryNode header_215 = header_3;
		EntryNode header_216 = header_3;
		GraphData backup_248 = null;
		int size_4 = 0;
		boolean isRunning_1 = true;
		boolean isRunning_7 = false;
		Node ele_9 = null;
		boolean isRunning_246 = false;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_5;
		obj.myData.myTxn = trans_6;
		trans_6.isRunning = isRunning_7;
		header_3.element = ele_9;
		header_3.next = header_215;
		header_3.previous = header_216;
		backup_5.myBackup = backup_248;
		backup_5.myTxn = trans_247;
		trans_247.isRunning = isRunning_246;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction16() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedListNode myTouchedNodes_2 = new LinkedListNode();
		obj.myData = new GraphData();
		Transaction trans_6 = new Transaction();
		EntryNode header_3 = new EntryNode();
		EntryNode next_10 = new EntryNode();
		Node ele_12 = new Node();
		NodeData myData1_13 = new NodeData();
		GraphData backup_5 = new GraphData();
		Transaction trans_270 = new Transaction();
		EntryNode prev_11 = next_10;
		EntryNode header_223 = header_3;
		EntryNode header_224 = header_3;
		GraphData backup_271 = null;
		boolean isRunning_1 = true;
		int size_4 = 1;
		boolean isRunning_7 = false;
		Node ele_9 = null;
		NodeData myBackup_14 = null;
		boolean isRunning_269 = false;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_5;
		obj.myData.myTxn = trans_6;
		trans_6.isRunning = isRunning_7;
		header_3.element = ele_9;
		header_3.next = next_10;
		header_3.previous = prev_11;
		next_10.element = ele_12;
		next_10.next = header_223;
		next_10.previous = header_224;
		ele_12.myData = myData1_13;
		myData1_13.myBackup = myBackup_14;
		backup_5.myBackup = backup_271;
		backup_5.myTxn = trans_270;
		trans_270.isRunning = isRunning_269;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction17() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedListNode myTouchedNodes_2 = new LinkedListNode();
		obj.myData = new GraphData();
		Transaction trans_6 = new Transaction();
		EntryNode header_3 = new EntryNode();
		EntryNode next_10 = new EntryNode();
		Node ele_12 = new Node();
		NodeData myData1_13 = new NodeData();
		GraphData backup_5 = new GraphData();
		Transaction trans_277 = new Transaction();
		EntryNode prev_11 = next_10;
		NodeData myBackup_14 = null;
		EntryNode header_223 = header_3;
		EntryNode header_224 = header_3;
		GraphData backup_278 = null;
		boolean isRunning_1 = true;
		int size_4 = 1;
		boolean isRunning_7 = false;
		Node ele_9 = null;
		boolean isRunning_276 = false;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_5;
		obj.myData.myTxn = trans_6;
		trans_6.isRunning = isRunning_7;
		header_3.element = ele_9;
		header_3.next = next_10;
		header_3.previous = prev_11;
		next_10.element = ele_12;
		next_10.next = header_223;
		next_10.previous = header_224;
		ele_12.myData = myData1_13;
		myData1_13.myBackup = myBackup_14;
		backup_5.myBackup = backup_278;
		backup_5.myTxn = trans_277;
		trans_277.isRunning = isRunning_276;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction18() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedListNode myTouchedNodes_2 = new LinkedListNode();
		obj.myData = new GraphData();
		Transaction trans_6 = new Transaction();
		EntryNode header_3 = new EntryNode();
		EntryNode next_10 = new EntryNode();
		Node ele_12 = new Node();
		NodeData myData1_13 = new NodeData();
		GraphData backup_5 = new GraphData();
		Transaction trans_277 = new Transaction();
		EntryNode prev_11 = next_10;
		EntryNode header_223 = header_3;
		EntryNode header_224 = header_3;
		GraphData backup_278 = null;
		boolean isRunning_1 = true;
		int size_4 = 1;
		boolean isRunning_7 = false;
		NodeData myBackup_14 = new NodeData();
		Node ele_9 = null;
		boolean isRunning_276 = false;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_5;
		obj.myData.myTxn = trans_6;
		trans_6.isRunning = isRunning_7;
		header_3.element = ele_9;
		header_3.next = next_10;
		header_3.previous = prev_11;
		next_10.element = ele_12;
		next_10.next = header_223;
		next_10.previous = header_224;
		ele_12.myData = myData1_13;
		myData1_13.myBackup = myBackup_14;
		backup_5.myBackup = backup_278;
		backup_5.myTxn = trans_277;
		trans_277.isRunning = isRunning_276;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

	@Test
	public void test_rollbackTransaction19() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = new Transaction();
		LinkedListNode myTouchedNodes_2 = new LinkedListNode();
		obj.myData = new GraphData();
		Transaction trans_6 = new Transaction();
		EntryNode header_3 = new EntryNode();
		EntryNode next_10 = new EntryNode();
		Node ele_12 = new Node();
		NodeData myData1_13 = new NodeData();
		GraphData backup_5 = new GraphData();
		Transaction trans_280 = new Transaction();
		EntryNode next_15 = new EntryNode();
		Node ele_296 = new Node();
		NodeData myData1_294 = new NodeData();
		EntryNode header_223 = header_3;
		EntryNode next_224 = next_10;
		EntryNode header_225 = header_3;
		GraphData backup_281 = null;
		EntryNode prev_226 = next_15;
		boolean isRunning_1 = true;
		int size_4 = 2;
		boolean isRunning_7 = false;
		EntryNode prev_11 = prev_226;
		Node ele_9 = null;
		NodeData myBackup_14 = null;
		boolean isRunning_279 = false;
		NodeData myBackup_288 = null;
		obj.myTxn.isRunning = isRunning_1;
		obj.myTxn.myTouchedNodes = myTouchedNodes_2;
		myTouchedNodes_2.header = header_3;
		myTouchedNodes_2.size = size_4;
		obj.myData.myBackup = backup_5;
		obj.myData.myTxn = trans_6;
		trans_6.isRunning = isRunning_7;
		header_3.element = ele_9;
		header_3.next = next_10;
		header_3.previous = prev_11;
		next_10.element = ele_12;
		next_10.next = next_15;
		next_10.previous = header_223;
		ele_12.myData = myData1_13;
		myData1_13.myBackup = myBackup_14;
		backup_5.myBackup = backup_281;
		backup_5.myTxn = trans_280;
		trans_280.isRunning = isRunning_279;
		next_15.element = ele_296;
		next_15.next = header_225;
		next_15.previous = next_224;
		ele_296.myData = myData1_294;
		myData1_294.myBackup = myBackup_288;
		System.out.println(Utilities.repOK(obj));
		obj.rollbackTransaction();
	}

}

