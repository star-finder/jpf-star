package aatree;
import org.junit.Test;

import common.Constant;
import common.TestStar;
import star.precondition.Initializer;

public class AATree_wellFormedTest extends TestStar {
	
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
	
	@Override
	protected void initPrecondition() {
//		String pre = "pre contains == aat(this_root, this_nullNode)";
//		
//		ANTLRInputStream in = new ANTLRInputStream(pre);
//		PreconditionLexer lexer = new PreconditionLexer(in);
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//        PreconditionParser parser = new PreconditionParser(tokens);
//        
//        Precondition[] ps = parser.pres().ps;
//        PreconditionMap.put(ps);
	}
	

	@Test
	public void testMain() {
		long begin = System.currentTimeMillis();
		
		if (verifyNoPropertyViolation(
				"+listener=star.StarListener",
				"+star.max_depth=9",
				"+star.lazy=true",
//				"+star.min_int=-100",
//				"+star.max_int=100",
				"+star.test_path=" + Constant.TEST_PATH + "/aatree",
				"+star.test_package=aatree",
				"+star.test_imports=aatree.AATree.AANode;common.Utilities",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+symbolic.method=aatree.AATree.wellFormed()",
				"+symbolic.fields=instance",
				"+symbolic.lazy=true")) {
			AATree tree = new AATree();
			tree.wellFormed();
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}

}
