package gov.nasa.jpf.star.examples.avl;

import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class AvlTree_insert1 extends TestJPF {

	@Test
	public void test_insert1() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = null;
		int x = 0;
		System.out.println(Utilities.repOK(obj));
		obj.insert(x);
	}

	@Test
	public void test_insert2() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = null;
		AvlNode right_3 = null;
		int height_4 = 0;
		int element_1 = 1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		System.out.println(Utilities.repOK(obj));
		obj.insert(x);
	}

	@Test
	public void test_insert3() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_11 = null;
		AvlNode right_12 = null;
		AvlNode left_17 = null;
		AvlNode right_18 = null;
		int heightL_6 = 0;
		int element_1 = 0;
		int heightR_8 = 0;
		int element_223 = 0;
		int height_4 = 1;
		int element_10 = -1;
		int element_16 = 1;
		int element_224 = 1;
		int element_225 = 1;
		int x = -2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_10;
		left_2.left = left_11;
		left_2.right = right_12;
		left_2.height = heightL_6;
		right_3.element = element_16;
		right_3.left = left_17;
		right_3.right = right_18;
		right_3.height = heightR_8;
		System.out.println(Utilities.repOK(obj));
		obj.insert(x);
	}

	@Test
	public void test_insert4() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode right_12 = null;
		AvlNode left_11 = null;
		AvlNode left_17 = null;
		AvlNode right_18 = null;
		int heightL_6 = 0;
		int element_1 = 0;
		int heightR_8 = 0;
		int element_223 = 0;
		int height_4 = 1;
		int element_10 = -2;
		int element_16 = 1;
		int element_224 = 1;
		int element_225 = 1;
		int x = -1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_10;
		left_2.left = left_11;
		left_2.right = right_12;
		left_2.height = heightL_6;
		right_3.element = element_16;
		right_3.left = left_17;
		right_3.right = right_18;
		right_3.height = heightR_8;
		System.out.println(Utilities.repOK(obj));
		obj.insert(x);
	}

	@Test
	public void test_insert5() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_11 = null;
		AvlNode right_12 = null;
		AvlNode left_17 = null;
		AvlNode right_18 = null;
		int heightL_6 = 0;
		int element_1 = 0;
		int heightR_8 = 0;
		int element_223 = 0;
		int height_4 = 1;
		int element_10 = -1;
		int element_16 = 1;
		int element_224 = 1;
		int element_225 = 1;
		int x = -1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_10;
		left_2.left = left_11;
		left_2.right = right_12;
		left_2.height = heightL_6;
		right_3.element = element_16;
		right_3.left = left_17;
		right_3.right = right_18;
		right_3.height = heightR_8;
		System.out.println(Utilities.repOK(obj));
		obj.insert(x);
	}

	@Test
	public void test_insert6() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = null;
		AvlNode left_2 = null;
		int height_4 = 0;
		int element_1 = -1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		System.out.println(Utilities.repOK(obj));
		obj.insert(x);
	}

	@Test
	public void test_insert7() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_17 = null;
		AvlNode right_18 = null;
		AvlNode left_11 = null;
		AvlNode right_12 = null;
		int heightL_6 = 0;
		int element_1 = 0;
		int heightR_8 = 0;
		int element_223 = -1;
		int height_4 = 1;
		int element_10 = -1;
		int element_16 = 2;
		int element_224 = -1;
		int element_225 = 0;
		int x = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_16;
		right_3.left = left_17;
		right_3.right = right_18;
		right_3.height = heightR_8;
		left_2.element = element_10;
		left_2.left = left_11;
		left_2.right = right_12;
		left_2.height = heightL_6;
		System.out.println(Utilities.repOK(obj));
		obj.insert(x);
	}

	@Test
	public void test_insert8() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_18 = null;
		AvlNode left_17 = null;
		AvlNode left_11 = null;
		AvlNode right_12 = null;
		int heightL_6 = 0;
		int element_1 = 0;
		int heightR_8 = 0;
		int element_223 = -1;
		int height_4 = 1;
		int element_10 = -1;
		int element_16 = 1;
		int element_224 = -1;
		int element_225 = 0;
		int x = 2;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_16;
		right_3.left = left_17;
		right_3.right = right_18;
		right_3.height = heightR_8;
		left_2.element = element_10;
		left_2.left = left_11;
		left_2.right = right_12;
		left_2.height = heightL_6;
		System.out.println(Utilities.repOK(obj));
		obj.insert(x);
	}

	@Test
	public void test_insert9() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_17 = null;
		AvlNode right_18 = null;
		AvlNode left_11 = null;
		AvlNode right_12 = null;
		int heightL_6 = 0;
		int element_1 = 0;
		int heightR_8 = 0;
		int element_223 = -1;
		int height_4 = 1;
		int element_10 = -1;
		int element_16 = 1;
		int element_224 = -1;
		int element_225 = 0;
		int x = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_16;
		right_3.left = left_17;
		right_3.right = right_18;
		right_3.height = heightR_8;
		left_2.element = element_10;
		left_2.left = left_11;
		left_2.right = right_12;
		left_2.height = heightL_6;
		System.out.println(Utilities.repOK(obj));
		obj.insert(x);
	}

	@Test
	public void test_insert10() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = null;
		AvlNode right_3 = null;
		int height_4 = 0;
		int element_1 = 0;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		System.out.println(Utilities.repOK(obj));
		obj.insert(x);
	}

	@Test
	public void test_insert11() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_11 = null;
		AvlNode right_12 = null;
		AvlNode left_17 = null;
		AvlNode right_18 = null;
		int heightL_6 = 0;
		int element_1 = 0;
		int heightR_8 = 0;
		int element_223 = -1;
		int element_224 = -1;
		int height_4 = 1;
		int element_10 = -1;
		int element_16 = 1;
		int element_225 = 0;
		int element_227 = 1;
		int element_228 = 1;
		int element_226 = 0;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_10;
		left_2.left = left_11;
		left_2.right = right_12;
		left_2.height = heightL_6;
		right_3.element = element_16;
		right_3.left = left_17;
		right_3.right = right_18;
		right_3.height = heightR_8;
		System.out.println(Utilities.repOK(obj));
		obj.insert(x);
	}

	@Test
	public void test_insert12() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_47 = null;
		AvlNode right_48 = null;
		AvlNode right_3 = null;
		int height_4 = 1;
		int heightL_6 = 0;
		int element_46 = 1;
		int element_1 = 2;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_46;
		left_2.left = left_47;
		left_2.right = right_48;
		left_2.height = heightL_6;
		System.out.println(Utilities.repOK(obj));
		obj.insert(x);
	}

	@Test
	public void test_insert13() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_48 = null;
		AvlNode left_47 = null;
		AvlNode right_3 = null;
		int height_4 = 1;
		int heightL_6 = 0;
		int element_46 = -1;
		int element_1 = 1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_46;
		left_2.left = left_47;
		left_2.right = right_48;
		left_2.height = heightL_6;
		System.out.println(Utilities.repOK(obj));
		obj.insert(x);
	}

	@Test
	public void test_insert14() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_47 = null;
		AvlNode right_48 = null;
		AvlNode right_3 = null;
		int height_4 = 1;
		int heightL_6 = 0;
		int element_46 = 0;
		int element_1 = 1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_46;
		left_2.left = left_47;
		left_2.right = right_48;
		left_2.height = heightL_6;
		System.out.println(Utilities.repOK(obj));
		obj.insert(x);
	}

	@Test
	public void test_insert15() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode left_47 = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode right_48 = null;
		AvlNode left_69 = null;
		AvlNode right_70 = null;
		AvlNode left_63 = null;
		AvlNode right_64 = null;
		int heightL_49 = 0;
		int heightR_8 = 0;
		int element_228 = 3;
		int element_68 = -1;
		int element_226 = 2;
		int heightL_6 = 1;
		int element_1 = 2;
		int element_62 = 3;
		int element_223 = -1;
		int element_224 = -1;
		int height_4 = 2;
		int element_225 = 0;
		int element_227 = 3;
		int element_46 = 0;
		int x = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_46;
		left_2.left = left_47;
		left_2.right = right_48;
		left_2.height = heightL_6;
		left_47.element = element_68;
		left_47.left = left_69;
		left_47.right = right_70;
		left_47.height = heightL_49;
		right_3.element = element_62;
		right_3.left = left_63;
		right_3.right = right_64;
		right_3.height = heightR_8;
		System.out.println(Utilities.repOK(obj));
		obj.insert(x);
	}

	@Test
	public void test_insert16() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = null;
		AvlNode left_47 = null;
		AvlNode right_48 = null;
		int heightL_6 = 0;
		int element_1 = 0;
		int element_223 = -1;
		int element_224 = -1;
		int height_4 = 1;
		int element_225 = 0;
		int element_46 = -1;
		int x = 1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_46;
		left_2.left = left_47;
		left_2.right = right_48;
		left_2.height = heightL_6;
		System.out.println(Utilities.repOK(obj));
		obj.insert(x);
	}

	@Test
	public void test_insert17() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_3 = null;
		AvlNode left_47 = null;
		AvlNode right_48 = null;
		int heightL_6 = 0;
		int element_1 = 0;
		int element_223 = -1;
		int element_224 = -1;
		int height_4 = 1;
		int element_225 = 0;
		int element_46 = -1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		left_2.element = element_46;
		left_2.left = left_47;
		left_2.right = right_48;
		left_2.height = heightL_6;
		System.out.println(Utilities.repOK(obj));
		obj.insert(x);
	}

	@Test
	public void test_insert18() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_87 = null;
		AvlNode right_88 = null;
		int element_1 = 0;
		int heightR_8 = 0;
		int element_223 = 0;
		int element_224 = 1;
		int height_4 = 1;
		int element_225 = 1;
		int element_86 = 1;
		int x = -1;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_86;
		right_3.left = left_87;
		right_3.right = right_88;
		right_3.height = heightR_8;
		System.out.println(Utilities.repOK(obj));
		obj.insert(x);
	}

	@Test
	public void test_insert19() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_87 = null;
		AvlNode right_88 = null;
		AvlNode left_2 = null;
		int height_4 = 1;
		int element_1 = -1;
		int element_86 = 1;
		int heightR_8 = 0;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_86;
		right_3.left = left_87;
		right_3.right = right_88;
		right_3.height = heightR_8;
		System.out.println(Utilities.repOK(obj));
		obj.insert(x);
	}

	@Test
	public void test_insert20() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode right_88 = null;
		AvlNode left_87 = null;
		AvlNode left_2 = null;
		int height_4 = 1;
		int element_1 = -2;
		int element_86 = -1;
		int heightR_8 = 0;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_86;
		right_3.left = left_87;
		right_3.right = right_88;
		right_3.height = heightR_8;
		System.out.println(Utilities.repOK(obj));
		obj.insert(x);
	}

	@Test
	public void test_insert21() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_87 = null;
		AvlNode right_88 = null;
		AvlNode left_2 = null;
		int height_4 = 1;
		int element_1 = -1;
		int element_86 = 0;
		int heightR_8 = 0;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_86;
		right_3.left = left_87;
		right_3.right = right_88;
		right_3.height = heightR_8;
		System.out.println(Utilities.repOK(obj));
		obj.insert(x);
	}

	@Test
	public void test_insert22() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_87 = new AvlNode();
		AvlNode left_2 = new AvlNode();
		AvlNode right_88 = null;
		AvlNode left_104 = null;
		AvlNode right_105 = null;
		AvlNode left_81 = null;
		AvlNode right_82 = null;
		int element_103 = 1;
		int heightR_8 = 1;
		int element_228 = -1;
		int element_229 = 0;
		int element_226 = 2;
		int heightL_89 = 0;
		int heightL_6 = 0;
		int element_1 = 0;
		int element_223 = 0;
		int element_224 = 1;
		int height_4 = 2;
		int element_225 = 1;
		int element_80 = -1;
		int element_227 = -1;
		int element_86 = 2;
		int x = 3;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_86;
		right_3.left = left_87;
		right_3.right = right_88;
		right_3.height = heightR_8;
		left_87.element = element_103;
		left_87.left = left_104;
		left_87.right = right_105;
		left_87.height = heightL_89;
		left_2.element = element_80;
		left_2.left = left_81;
		left_2.right = right_82;
		left_2.height = heightL_6;
		System.out.println(Utilities.repOK(obj));
		obj.insert(x);
	}

	@Test
	public void test_insert23() throws Exception {
		AvlTree obj = new AvlTree();
		obj.root = new AvlNode();
		AvlNode right_3 = new AvlNode();
		AvlNode left_2 = null;
		AvlNode left_87 = null;
		AvlNode right_88 = null;
		int element_1 = 0;
		int heightR_8 = 0;
		int element_223 = 0;
		int element_224 = 1;
		int height_4 = 1;
		int element_225 = 1;
		int element_86 = 1;
		int x = 0;
		obj.root.element = element_1;
		obj.root.left = left_2;
		obj.root.right = right_3;
		obj.root.height = height_4;
		right_3.element = element_86;
		right_3.left = left_87;
		right_3.right = right_88;
		right_3.height = heightR_8;
		System.out.println(Utilities.repOK(obj));
		obj.insert(x);
	}

}

