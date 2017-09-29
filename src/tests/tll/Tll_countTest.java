package tll;
import org.junit.Test;

import common.Constant;
import common.TestStar;
import star.precondition.Initializer;

public class Tll_countTest extends TestStar {
	
	@Override
	protected void initDataNode() {
		String data = "data Node {int val; Node parent; Node left; Node right; Node next}";
		Initializer.initDataNode(data);
	}
	
	@Override
	protected void initPredicate() {
//		String pred1 = "pred tll(x) == x::Node<dv,dp,dl,r,dn> & r=null || x::Node<dv,dp,l,r,dn> * tll1(l,x,z,ll) * tll1(r,x,lr,z) & r!=null";
		String pred = "pred tll(curr,p,lr,ll) == curr::Node<dv,p,dl,r,n> & curr=ll & r=null & n=lr || curr::Node<dv,p,l,r,dn> * tll(l,curr,z,ll) * tll(r,curr,lr,z) & r!=null";
		
//		String pred = pred1 + ";" + pred2;
		Initializer.initPredicate(pred);
	}
	
	@Override
	protected void initPrecondition() {
		String pre = "pre positiveLeafCount == tll(this_root,p,lr,ll)";
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
				"+star.test_path=" + Constant.TEST_PATH + "/tll",
				"+star.test_package=tll",
				"+star.test_imports=common.Utilities",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+symbolic.method=tll.Tll.positiveLeafCount()",
				"+symbolic.fields=instance",
				"+symbolic.lazy=true")) {
			Tll tll = new Tll();
			tll.positiveLeafCount();
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - begin);
	}

}
