package bst;
import org.junit.Test;

import common.Constant;
import common.TestStar;
import starlib.precondition.Initializer;

public class BinarySearchTree_repOKTest extends TestStar {
	
	@Override
	protected void initDataNode() {
		String data = "data BinaryNode {int element; BinaryNode left; BinaryNode right}";
		Initializer.initDataNode(data);
	}
	
	@Override
	protected void initPredicate() {
//		String pred = "pred bst(root,minE,maxE) == root=null || root::BinaryNode<element,left,right> * bst(left,minE,element) * bst(right,element,maxE) & minE<element & element<maxE";
		
		String pred1 = "pred bst(root) == root = null || root::BinaryNode<element,left,right> * bstE(left,minE,element) * bstE(right,element,maxE)";
		String pred2 = "pred bstE(root,minE,maxE) == root=null || root::BinaryNode<element,left,right> * bstE(left,minE,element) * bstE(right,element,maxE) & minE<element & element<maxE";
		String pred = pred1 + ";" + pred2;
				Initializer.initPredicate(pred);
	}
	
	@Override
	protected void initPrecondition() {
		String pre = "pre repOK == this_root=t";
		Initializer.initPrecondition(pre);
	}
	

	@Test
	public void testMain() {
		long begin = System.currentTimeMillis();
		
		if (verifyNoPropertyViolation(
				"+listener=star.StarListener",
				"+star.max_depth=7",
				"+star.lazy=true",
//				"+star.min_int=-100",
//				"+star.max_int=100",
				"+star.test_path=" + Constant.TEST_PATH + "/bst",
				"+star.test_package=bst",
				"+star.test_imports=common.Utilities",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+symbolic.method=bst.BinarySearchTree.repOK(sym)",
				"+symbolic.fields=instance",
				"+symbolic.lazy=true")) {
			BinarySearchTree tree = new BinarySearchTree();
			tree.repOK(tree.root);
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}

}
