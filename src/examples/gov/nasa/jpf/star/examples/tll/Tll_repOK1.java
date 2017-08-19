package gov.nasa.jpf.star.examples.tll;

import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Tll_repOK1 extends TestJPF {

	@Test
	public void test_repOK1() throws Exception {
		Tll obj = new Tll();
		obj.root = null;
		if(Utilities.repOK(obj)) {obj.positiveLeafCount();}
		//obj.repOK();
	}

	@Test
	public void test_repOK2() throws Exception {
		Tll obj = new Tll();
		obj.root = new Node();
		Node right_4 = obj.root;
		Node left_3 = null;
		int val_1 = 0;
		Node parent_2 = null;
		Node next_5 = null;
		obj.root.val = val_1;
		obj.root.parent = parent_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.next = next_5;
		if(Utilities.repOK(obj)) {obj.positiveLeafCount();}
		//obj.repOK();
	}

	@Test
	public void test_repOK3() throws Exception {
		Tll obj = new Tll();
		obj.root = new Node();
		Node right_4 = null;
		int val_1 = 0;
		Node parent_2 = null;
		Node left_3 = null;
		Node next_5 = null;
		obj.root.val = val_1;
		obj.root.parent = parent_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.next = next_5;
		if(Utilities.repOK(obj)) {obj.positiveLeafCount();}
		//obj.repOK();
	}

	@Test
	public void test_repOK4() throws Exception {
		Tll obj = new Tll();
		obj.root = new Node();
		Node right_4 = new Node();
		Node left_3 = null;
		int val_1 = 0;
		Node parent_2 = null;
		Node next_5 = null;
		int val_21 = 0;
		Node parent_22 = null;
		Node left_23 = null;
		Node right_24 = null;
		Node next_25 = null;
		obj.root.val = val_1;
		obj.root.parent = parent_2;
		obj.root.left = left_3;
		obj.root.right = right_4;
		obj.root.next = next_5;
		right_4.val = val_21;
		right_4.parent = parent_22;
		right_4.left = left_23;
		right_4.right = right_24;
		right_4.next = next_25;
		if(Utilities.repOK(obj)) {obj.positiveLeafCount();}
		//obj.repOK();
	}

}

