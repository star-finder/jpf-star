package avl;
import org.junit.Test;

import common.Constant;
import common.TestStar;
import star.precondition.Initializer;

public class Avl_minElementTest extends TestStar {
	
	@Override
	protected void initDataNode() {
		String data = "data AvlNode {int element; AvlNode left; AvlNode right; int height}";
		Initializer.initDataNode(data);
	}
	
	@Override
	protected void initPredicate() {
		String pred1 = "pred avl(root) == root = null || " + 
				"root::AvlNode<element,left,right,height> * avlE(left,minE,element,heightL) * avlE(right,element,maxE,heightR) & heightL=heightR & height=heightL+1 || " +
				"root::AvlNode<element,left,right,height> * avlE(left,minE,element,heightL) * avlE(right,element,maxE,heightR) & heightL=heightR+1 & height=heightL+1 || " +
				"root::AvlNode<element,left,right,height> * avlE(left,minE,element,heightL) * avlE(right,element,maxE,heightR) & heightL+1=heightR & height=heightR+1";
		
		String pred2 = "pred avlE(root,minE,maxE,height) == root=null & height=0-1 || " +
				"root::AvlNode<element,left,right,height> * avlE(left,minE,element,heightL) * avlE(right,element,maxE,heightR) & minE<element & element<maxE & heightL=heightR & height=heightL+1 || " +
				"root::AvlNode<element,left,right,height> * avlE(left,minE,element,heightL) * avlE(right,element,maxE,heightR) & minE<element & element<maxE & heightL=heightR+1 & height=heightL+1 || " +
				"root::AvlNode<element,left,right,height> * avlE(left,minE,element,heightL) * avlE(right,element,maxE,heightR) & minE<element & element<maxE & heightL+1=heightR & height=heightR+1";
		
		String pred = pred1 + ";" + pred2;
		Initializer.initPredicate(pred);
	}
	
	@Override
	protected void initPrecondition() {
		String pre = "pre minElement == avl(this_root)";
		Initializer.initPrecondition(pre);
	}
	

	@Test
	public void testMain() {
		long begin = System.currentTimeMillis();
		
		if (verifyNoPropertyViolation(
				"+listener=star.StarListener",
				"+star.max_depth=3",
//				"+star.min_int=-100",
//				"+star.max_int=100",
				"+star.test_path=" + Constant.TEST_PATH + "/avl",
				"+star.test_package=avl",
				"+star.test_imports=common.Utilities",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+symbolic.method=avl.AvlTree.minElement(sym)",
				"+symbolic.fields=instance",
				"+symbolic.lazy=true")) {
			AvlTree tree = new AvlTree();
			tree.minElement(0);
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}

}
