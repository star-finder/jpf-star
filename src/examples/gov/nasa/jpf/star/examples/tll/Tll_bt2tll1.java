package gov.nasa.jpf.star.examples.tll;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Tll_bt2tll1 extends TestJPF {

	@Test
	public void test1() throws Exception {
		Tll obj = new Tll();
		Tree x = new Tree();
		Tree r_3 = null;
		Tree p = null;
		Tree t = null;
		Tree dp_1 = null;
		Tree dl_2 = null;
		Tree dn_4 = null;
		x.parent = dp_1;
		x.left = dl_2;
		x.right = r_3;
		x.next = dn_4;
		obj.bt2tll(x,p,t);
	}

	@Test
	public void test2() throws Exception {
		Tll obj = new Tll();
		Tree x = new Tree();
		Tree r_3 = new Tree();
		Tree l_5 = new Tree();
		Tree r_9 = null;
		Tree r_72 = null;
		Tree p = null;
		Tree t = null;
		Tree dp_1 = null;
		Tree dn_4 = null;
		Tree dp_7 = null;
		Tree dl_8 = null;
		Tree dn_10 = null;
		Tree dp_74 = null;
		Tree dl_73 = null;
		Tree dn_71 = null;
		x.parent = dp_1;
		x.left = l_5;
		x.right = r_3;
		x.next = dn_4;
		r_3.parent = dp_7;
		r_3.left = dl_8;
		r_3.right = r_9;
		r_3.next = dn_10;
		l_5.parent = dp_74;
		l_5.left = dl_73;
		l_5.right = r_72;
		l_5.next = dn_71;
		obj.bt2tll(x,p,t);
	}

	@Test
	public void test3() throws Exception {
		Tll obj = new Tll();
		Tree x = new Tree();
		Tree r_3 = new Tree();
		Tree l_5 = new Tree();
		Tree r_9 = null;
		Tree r_15 = null;
		Tree p = null;
		Tree t = null;
		Tree dp_1 = null;
		Tree dn_4 = null;
		Tree dp_7 = null;
		Tree dl_8 = null;
		Tree dn_10 = null;
		Tree dp_13 = null;
		Tree dl_14 = null;
		Tree dn_16 = null;
		x.parent = dp_1;
		x.left = l_5;
		x.right = r_3;
		x.next = dn_4;
		r_3.parent = dp_7;
		r_3.left = dl_8;
		r_3.right = r_9;
		r_3.next = dn_10;
		l_5.parent = dp_13;
		l_5.left = dl_14;
		l_5.right = r_15;
		l_5.next = dn_16;
		obj.bt2tll(x,p,t);
	}

	@Test
	public void test4() throws Exception {
		Tll obj = new Tll();
		Tree x = new Tree();
		Tree r_3 = new Tree();
		Tree l_5 = new Tree();
		Tree r_15 = new Tree();
		Tree l_17 = new Tree();
		Tree r_9 = null;
		Tree r_21 = null;
		Tree l_54 = l_5;
		Tree r_90 = null;
		Tree p = null;
		Tree t = null;
		Tree dp_1 = null;
		Tree dn_4 = null;
		Tree dp_7 = null;
		Tree dl_8 = null;
		Tree dn_10 = null;
		Tree dp_13 = null;
		Tree dn_16 = null;
		Tree dp_19 = null;
		Tree dl_20 = null;
		Tree dn_22 = null;
		Tree dp_92 = null;
		Tree dl_91 = null;
		Tree dn_89 = null;
		x.parent = dp_1;
		x.left = l_5;
		x.right = r_3;
		x.next = dn_4;
		r_3.parent = dp_7;
		r_3.left = dl_8;
		r_3.right = r_9;
		r_3.next = dn_10;
		l_5.parent = dp_13;
		l_5.left = l_17;
		l_5.right = r_15;
		l_5.next = dn_16;
		r_15.parent = dp_19;
		r_15.left = dl_20;
		r_15.right = r_21;
		r_15.next = dn_22;
		l_17.parent = dp_92;
		l_17.left = dl_91;
		l_17.right = r_90;
		l_17.next = dn_89;
		obj.bt2tll(x,p,t);
	}

	@Test
	public void test5() throws Exception {
		Tll obj = new Tll();
		Tree x = new Tree();
		Tree r_3 = new Tree();
		Tree l_5 = new Tree();
		Tree r_15 = new Tree();
		Tree l_17 = new Tree();
		Tree r_9 = null;
		Tree r_21 = null;
		Tree r_27 = null;
		Tree p = null;
		Tree t = null;
		Tree dp_1 = null;
		Tree dn_4 = null;
		Tree dp_7 = null;
		Tree dl_8 = null;
		Tree dn_10 = null;
		Tree dp_13 = null;
		Tree dn_16 = null;
		Tree dp_19 = null;
		Tree dl_20 = null;
		Tree dn_22 = null;
		Tree dp_25 = null;
		Tree dl_26 = null;
		Tree dn_28 = null;
		x.parent = dp_1;
		x.left = l_5;
		x.right = r_3;
		x.next = dn_4;
		r_3.parent = dp_7;
		r_3.left = dl_8;
		r_3.right = r_9;
		r_3.next = dn_10;
		l_5.parent = dp_13;
		l_5.left = l_17;
		l_5.right = r_15;
		l_5.next = dn_16;
		r_15.parent = dp_19;
		r_15.left = dl_20;
		r_15.right = r_21;
		r_15.next = dn_22;
		l_17.parent = dp_25;
		l_17.left = dl_26;
		l_17.right = r_27;
		l_17.next = dn_28;
		obj.bt2tll(x,p,t);
	}

	@Test
	public void test6() throws Exception {
		Tll obj = new Tll();
		Tree x = new Tree();
		Tree r_3 = new Tree();
		Tree r_9 = new Tree();
		Tree l_5 = new Tree();
		Tree l_11 = new Tree();
		Tree r_33 = null;
		Tree r_54 = r_3;
		Tree r_83 = null;
		Tree r_92 = null;
		Tree p = null;
		Tree t = null;
		Tree dp_1 = null;
		Tree dn_4 = null;
		Tree dp_7 = null;
		Tree dn_10 = null;
		Tree dp_31 = null;
		Tree dl_32 = null;
		Tree dn_34 = null;
		Tree dp_85 = null;
		Tree dl_84 = null;
		Tree dn_82 = null;
		Tree dp_94 = null;
		Tree dl_93 = null;
		Tree dn_91 = null;
		x.parent = dp_1;
		x.left = l_5;
		x.right = r_3;
		x.next = dn_4;
		r_3.parent = dp_7;
		r_3.left = l_11;
		r_3.right = r_9;
		r_3.next = dn_10;
		r_9.parent = dp_31;
		r_9.left = dl_32;
		r_9.right = r_33;
		r_9.next = dn_34;
		l_5.parent = dp_85;
		l_5.left = dl_84;
		l_5.right = r_83;
		l_5.next = dn_82;
		l_11.parent = dp_94;
		l_11.left = dl_93;
		l_11.right = r_92;
		l_11.next = dn_91;
		obj.bt2tll(x,p,t);
	}

	@Test
	public void test7() throws Exception {
		Tll obj = new Tll();
		Tree x = new Tree();
		Tree r_3 = new Tree();
		Tree r_9 = new Tree();
		Tree l_11 = new Tree();
		Tree l_5 = new Tree();
		Tree r_33 = null;
		Tree r_39 = null;
		Tree r_86 = null;
		Tree p = null;
		Tree t = null;
		Tree dp_1 = null;
		Tree dn_4 = null;
		Tree dp_7 = null;
		Tree dn_10 = null;
		Tree dp_31 = null;
		Tree dl_32 = null;
		Tree dn_34 = null;
		Tree dp_37 = null;
		Tree dl_38 = null;
		Tree dn_40 = null;
		Tree dp_88 = null;
		Tree dl_87 = null;
		Tree dn_85 = null;
		x.parent = dp_1;
		x.left = l_5;
		x.right = r_3;
		x.next = dn_4;
		r_3.parent = dp_7;
		r_3.left = l_11;
		r_3.right = r_9;
		r_3.next = dn_10;
		r_9.parent = dp_31;
		r_9.left = dl_32;
		r_9.right = r_33;
		r_9.next = dn_34;
		l_11.parent = dp_37;
		l_11.left = dl_38;
		l_11.right = r_39;
		l_11.next = dn_40;
		l_5.parent = dp_88;
		l_5.left = dl_87;
		l_5.right = r_86;
		l_5.next = dn_85;
		obj.bt2tll(x,p,t);
	}

	@Test
	public void test8() throws Exception {
		Tll obj = new Tll();
		Tree x = new Tree();
		Tree r_3 = new Tree();
		Tree r_9 = new Tree();
		Tree l_11 = new Tree();
		Tree l_5 = new Tree();
		Tree r_33 = null;
		Tree r_39 = null;
		Tree r_15 = null;
		Tree p = null;
		Tree t = null;
		Tree dp_1 = null;
		Tree dn_4 = null;
		Tree dp_7 = null;
		Tree dn_10 = null;
		Tree dp_31 = null;
		Tree dl_32 = null;
		Tree dn_34 = null;
		Tree dp_37 = null;
		Tree dl_38 = null;
		Tree dn_40 = null;
		Tree dp_13 = null;
		Tree dl_14 = null;
		Tree dn_16 = null;
		x.parent = dp_1;
		x.left = l_5;
		x.right = r_3;
		x.next = dn_4;
		r_3.parent = dp_7;
		r_3.left = l_11;
		r_3.right = r_9;
		r_3.next = dn_10;
		r_9.parent = dp_31;
		r_9.left = dl_32;
		r_9.right = r_33;
		r_9.next = dn_34;
		l_11.parent = dp_37;
		l_11.left = dl_38;
		l_11.right = r_39;
		l_11.next = dn_40;
		l_5.parent = dp_13;
		l_5.left = dl_14;
		l_5.right = r_15;
		l_5.next = dn_16;
		obj.bt2tll(x,p,t);
	}

}

