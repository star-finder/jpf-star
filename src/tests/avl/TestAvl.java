package avl;

import common.TestStar;
import starlib.precondition.Initializer;

public class TestAvl extends TestStar{

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

}
