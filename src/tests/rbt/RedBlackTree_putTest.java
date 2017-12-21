package rbt;
import org.junit.Test;

import common.Constant;
import common.TestStar;
import starlib.precondition.Initializer;

public class RedBlackTree_putTest extends TestStar {
	
	@Override
	protected void initDataNode() {
		String data = "data Entry {int key; Object value; Entry left; Entry right; Entry parent; boolean color}";
		Initializer.initDataNode(data);
	}
	
	@Override
	protected void initPredicate() {
		String pred1 = "pred rbt(root,size) == root=null & size=0 || " +
			"root::Entry<key,value,left,right,parent,color> * rbtE(left,root,minE,key,sizeL,bhL) * rbtE(right,root,key,maxE,sizeR,bhR) & parent=null & color=1 & size=sizeL+sizeR+1 & bhL=bhR";
		
		String pred2 = "pred rbtE(root,pa,minE,maxE,size,bh) == root=null & size=0 & bh=0 || " +
			"root::Entry<key,value,left,right,parent,color> * rbtE(left,root,minE,key,sizeL,bhL) * rbtE(right,root,key,maxE,sizeR,bhR) & minE<key & key<maxE & parent=pa & color=1 & size=sizeL+sizeR+1 & bhL=bhR & bh=1+bhL || " +
			"root::Entry<key,value,left,right,parent,color> * rbtB(left,root,minE,key,sizeL,bhL) * rbtB(right,root,key,maxE,sizeR,bhR) & minE<key & key<maxE & parent=pa & color=0 & size=sizeL+sizeR+1 & bhL=bhR & bh=bhL";
		
		String pred3 = "pred rbtB(root,pa,minE,maxE,size,bh) == root=null & size=0 & bh=0 || " +
			"root::Entry<key,value,left,right,parent,color> * rbtE(left,root,minE,key,sizeL,bhL) * rbtE(right,root,key,maxE,sizeR,bhR) & minE<key & key<maxE & parent=pa & color=1 & size=sizeL+sizeR+1 & bhL=bhR & bh=1+bhL";
		
		String pred = pred1 + ";" + pred2 + ";" + pred3;
				Initializer.initPredicate(pred);
	}
	
	@Override
	protected void initPrecondition() {
		String pre = "pre put == rbt(this_root,this_size)";
		Initializer.initPrecondition(pre);
	}
	

	@Test
	public void testMain() {
		long begin = System.currentTimeMillis();
		
		if (verifyNoPropertyViolation(
				"+listener=star.StarListener",
				"+star.max_depth=7",
				"+star.max_time=5",
//				"+star.min_int=-100",
//				"+star.max_int=100",
				"+star.test_path=" + Constant.TEST_PATH + "/rbt",
				"+star.test_package=rbt",
				"+star.test_imports=rbt.TreeMap.Entry;common.Utilities",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+symbolic.method=rbt.TreeMap.put(sym#sym)",
				"+symbolic.fields=instance",
				"+symbolic.lazy=true")) {
			TreeMap tree = new TreeMap();
			Object o = new Object();
			tree.put(0, o);
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}

}
