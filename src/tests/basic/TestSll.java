package basic;

import common.TestStar;
import starlib.precondition.Initializer;

public class TestSll extends TestStar {

	@Override
	protected void initDataNode() {
		String data = "data NodeOld {NodeOld next}";
		Initializer.initDataNode(data);
	}
	
	@Override
	protected void initPredicate() {
		String pred = "pred sll(root) == root = null || root::NodeOld<next> * sll(next)";
		Initializer.initPredicate(pred);
	}
	
}
