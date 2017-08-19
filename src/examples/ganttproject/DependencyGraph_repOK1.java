package ganttproject;

import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class DependencyGraph_repOK1 extends TestJPF {

	@Test
	public void test_repOK1() throws Exception {
		DependencyGraph obj = new DependencyGraph();
		obj.myTxn = null;
		obj.myData = null;
		System.out.println(Utilities.repOK(obj));
		obj.repOK();
	}

}

