package gov.nasa.jpf.star.examples.tll2;

import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Tll_positiveLeafCount1 extends TestJPF {

	@Test
	public void test_positiveLeafCount1() throws Exception {
		Tll obj = new Tll();
		Node x = new Node();
		Node ll = x;
		Node r_3 = null;
		Node n_4 = new Node();
		Node lr = n_4;
		int dv_1 = 0;
		Node p = null;
		Node dl_2 = null;
		x.val = dv_1;
		x.parent = p;
		x.left = dl_2;
		x.right = r_3;
		x.next = n_4;
		System.out.println(Utilities.repOK(obj));
		obj.positiveLeafCount(x);
	}

	@Test
	public void test_positiveLeafCount2() throws Exception {
		Tll obj = new Tll();
		Node x = new Node();
		Node r_3 = new Node();
		Node l_5 = new Node();
		Node z_7 = r_3;
		Node r_10 = null;
		Node ll = l_5;
		Node r_17 = null;
		Node n_18 = z_7;
		Node x_87 = x;
		int dv_15 = 1;
		Node n_11 = new Node();
		Node lr = n_11;
		int dv_1 = 0;
		Node p = null;
		Node dn_6 = null;
		int dv_8 = 0;
		Node dl_9 = null;
		Node dl_16 = null;
		x.val = dv_1;
		x.parent = p;
		x.left = l_5;
		x.right = r_3;
		x.next = dn_6;
		r_3.val = dv_8;
		r_3.parent = x;
		r_3.left = dl_9;
		r_3.right = r_10;
		r_3.next = n_11;
		l_5.val = dv_15;
		l_5.parent = x_87;
		l_5.left = dl_16;
		l_5.right = r_17;
		l_5.next = n_18;
		System.out.println(Utilities.repOK(obj));
		obj.positiveLeafCount(x);
	}

	@Test
	public void test_positiveLeafCount3() throws Exception {
		Tll obj = new Tll();
		Node x = new Node();
		Node r_3 = new Node();
		Node l_5 = new Node();
		Node z_7 = r_3;
		Node r_10 = null;
		Node ll = l_5;
		Node r_17 = null;
		Node n_18 = z_7;
		Node x_87 = x;
		int dv_15 = 0;
		Node n_11 = new Node();
		Node lr = n_11;
		int dv_1 = 0;
		Node p = null;
		Node dn_6 = null;
		int dv_8 = 0;
		Node dl_9 = null;
		Node dl_16 = null;
		x.val = dv_1;
		x.parent = p;
		x.left = l_5;
		x.right = r_3;
		x.next = dn_6;
		r_3.val = dv_8;
		r_3.parent = x;
		r_3.left = dl_9;
		r_3.right = r_10;
		r_3.next = n_11;
		l_5.val = dv_15;
		l_5.parent = x_87;
		l_5.left = dl_16;
		l_5.right = r_17;
		l_5.next = n_18;
		System.out.println(Utilities.repOK(obj));
		obj.positiveLeafCount(x);
	}

	@Test
	public void test_positiveLeafCount4() throws Exception {
		Tll obj = new Tll();
		Node x = new Node();
		Node r_3 = new Node();
		Node l_5 = new Node();
		Node r_10 = new Node();
		Node l_12 = new Node();
		Node ll = l_5;
		Node r_17 = null;
		Node z_14 = r_10;
		Node r_38 = null;
		Node r_87 = r_3;
		Node x_88 = x;
		Node r_89 = r_3;
		Node z_7 = l_12;
		Node r_140 = null;
		int dv_15 = 1;
		Node n_18 = z_7;
		Node n_39 = new Node();
		Node lr = n_39;
		int dv_1 = 0;
		Node p = null;
		Node dn_6 = null;
		int dv_8 = 0;
		Node dn_13 = null;
		Node dl_16 = null;
		int dv_36 = 0;
		Node dl_37 = null;
		int dv_142 = 0;
		Node dl_141 = null;
		x.val = dv_1;
		x.parent = p;
		x.left = l_5;
		x.right = r_3;
		x.next = dn_6;
		r_3.val = dv_8;
		r_3.parent = x;
		r_3.left = l_12;
		r_3.right = r_10;
		r_3.next = dn_13;
		l_5.val = dv_15;
		l_5.parent = x_88;
		l_5.left = dl_16;
		l_5.right = r_17;
		l_5.next = n_18;
		r_10.val = dv_36;
		r_10.parent = r_89;
		r_10.left = dl_37;
		r_10.right = r_38;
		r_10.next = n_39;
		l_12.val = dv_142;
		l_12.parent = r_87;
		l_12.left = dl_141;
		l_12.right = r_140;
		l_12.next = z_14;
		System.out.println(Utilities.repOK(obj));
		obj.positiveLeafCount(x);
	}

	@Test
	public void test_positiveLeafCount5() throws Exception {
		Tll obj = new Tll();
		Node x = new Node();
		Node r_3 = new Node();
		Node l_5 = new Node();
		Node r_10 = new Node();
		Node l_12 = new Node();
		Node ll = l_5;
		Node r_17 = null;
		Node z_14 = r_10;
		Node r_38 = null;
		Node r_87 = r_3;
		Node x_88 = x;
		Node r_89 = r_3;
		Node z_7 = l_12;
		Node r_140 = null;
		int dv_15 = 0;
		Node n_18 = z_7;
		Node n_39 = new Node();
		Node lr = n_39;
		int dv_1 = 0;
		Node p = null;
		Node dn_6 = null;
		int dv_8 = 0;
		Node dn_13 = null;
		Node dl_16 = null;
		int dv_36 = 0;
		Node dl_37 = null;
		int dv_142 = 0;
		Node dl_141 = null;
		x.val = dv_1;
		x.parent = p;
		x.left = l_5;
		x.right = r_3;
		x.next = dn_6;
		r_3.val = dv_8;
		r_3.parent = x;
		r_3.left = l_12;
		r_3.right = r_10;
		r_3.next = dn_13;
		l_5.val = dv_15;
		l_5.parent = x_88;
		l_5.left = dl_16;
		l_5.right = r_17;
		l_5.next = n_18;
		r_10.val = dv_36;
		r_10.parent = r_89;
		r_10.left = dl_37;
		r_10.right = r_38;
		r_10.next = n_39;
		l_12.val = dv_142;
		l_12.parent = r_87;
		l_12.left = dl_141;
		l_12.right = r_140;
		l_12.next = z_14;
		System.out.println(Utilities.repOK(obj));
		obj.positiveLeafCount(x);
	}

}

