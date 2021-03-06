package aatree;

import common.TestStar;
import starlib.precondition.Initializer;

public class TestAa extends TestStar {

	@Override
	protected void initDataNode() {
		String data = "data AANode {int element; AANode left; AANode right; int level}";
		Initializer.initDataNode(data);
	}
	
	@Override
	protected void initPredicate() {
		String pred1 = "pred aat(root,nnull) == nnull::AANode<a,b,c,d> & root=nnull & a=0 & d=0 & b=nnull & c=nnull || " +
				"root::AANode<element,left,right,level> * nnull::AANode<a,b,c,d> * aat1(left,minE,element,level1,nnull) * aat0(right,element,maxE,level,nnull) & level=level1+1 & a=0 & d=0 & b=nnull & c=nnull || " +
				"root::AANode<element,left,right,level> * nnull::AANode<a,b,c,d> * aat1(left,minE,element,level1,nnull) * aat1(right,element,maxE,level1,nnull) & level=level1+1 & a=0 & d=0 & b=nnull & c=nnull";
			
			String pred2 = "pred aat1(root,minE,maxE,level,nnull) == root=nnull & level=0 || " +
				"root::AANode<element,left,right,level> * aat1(left,minE,element,level1,nnull) * aat0(right,element,maxE,level,nnull) & minE<element & element<maxE & level=level1+1 || " +
				"root::AANode<element,left,right,level> * aat1(left,minE,element,level1,nnull) * aat1(right,element,maxE,level1,nnull) & minE<element & element<maxE & level=level1+1";
			
			String pred3 = "pred aat0(root,minE,maxE,level,nnull) == root=nnull & level=0 || " +
					"root::AANode<element,left,right,level> * aat1(left,minE,element,level1,nnull) * aat1(right,element,maxE,level1,nnull) & minE<element & element<maxE & level=level1+1";
			
			String pred = pred1 + ";" + pred2 + ";" + pred3;
		Initializer.initPredicate(pred);
	}
}
