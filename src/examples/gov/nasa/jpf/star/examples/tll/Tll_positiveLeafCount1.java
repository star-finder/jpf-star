package gov.nasa.jpf.star.examples.tll;

import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Tll_positiveLeafCount1 extends TestJPF {

	@Test
	public void test_positiveLeafCount1() throws Exception {
		Tll obj = new Tll();
		obj.root = new Node();
		Node ll = obj.root;
		Node r_3 = null;
		Node n_4 = new Node();
		Node lr = n_4;
		int dv_1 = 0;
		Node p = null;
		Node dl_2 = null;
		obj.root.val = dv_1;
		obj.root.parent = p;
		obj.root.left = dl_2;
		obj.root.right = r_3;
		obj.root.next = n_4;
		System.out.println(Utilities.repOK(obj));
		obj.positiveLeafCount();
	}

	@Test
	public void test_positiveLeafCount2() throws Exception {
		Tll obj = new Tll();
		obj.root = new Node();
		Node r_3 = new Node();
		Node l_5 = new Node();
		Node z_7 = r_3;
		Node r_10 = null;
		Node ll = l_5;
		Node r_17 = null;
		Node n_18 = z_7;
		Node this_root_87 = obj.root;
		int dv_15 = 1;
		Node n_11 = new Node();
		Node lr = n_11;
		int dv_1 = 0;
		Node p = null;
		Node dn_6 = null;
		int dv_8 = 0;
		Node dl_9 = null;
		Node dl_16 = null;
		obj.root.val = dv_1;
		obj.root.parent = p;
		obj.root.left = l_5;
		obj.root.right = r_3;
		obj.root.next = dn_6;
		r_3.val = dv_8;
		r_3.parent = obj.root;
		r_3.left = dl_9;
		r_3.right = r_10;
		r_3.next = n_11;
		l_5.val = dv_15;
		l_5.parent = this_root_87;
		l_5.left = dl_16;
		l_5.right = r_17;
		l_5.next = n_18;
		System.out.println(Utilities.repOK(obj));
		obj.positiveLeafCount();
	}

	@Test
	public void test_positiveLeafCount3() throws Exception {
		Tll obj = new Tll();
		obj.root = new Node();
		Node r_3 = new Node();
		Node l_5 = new Node();
		Node z_7 = r_3;
		Node r_10 = null;
		Node ll = l_5;
		Node r_17 = null;
		Node n_18 = z_7;
		Node this_root_87 = obj.root;
		int dv_15 = 0;
		Node n_11 = new Node();
		Node lr = n_11;
		int dv_1 = 0;
		Node p = null;
		Node dn_6 = null;
		int dv_8 = 0;
		Node dl_9 = null;
		Node dl_16 = null;
		obj.root.val = dv_1;
		obj.root.parent = p;
		obj.root.left = l_5;
		obj.root.right = r_3;
		obj.root.next = dn_6;
		r_3.val = dv_8;
		r_3.parent = obj.root;
		r_3.left = dl_9;
		r_3.right = r_10;
		r_3.next = n_11;
		l_5.val = dv_15;
		l_5.parent = this_root_87;
		l_5.left = dl_16;
		l_5.right = r_17;
		l_5.next = n_18;
		System.out.println(Utilities.repOK(obj));
		obj.positiveLeafCount();
	}

}

