package common;

import org.junit.After;
import org.junit.Before;

import gov.nasa.jpf.util.test.TestJPF;
import star.testgeneration.TestGenerator;
import starlib.solver.Solver;

public abstract class TestStar extends TestJPF {
	
	protected abstract void initDataNode();
	protected void initPredicate() {}
	protected void initPrecondition() {}
	
	@Before
	public void init() {
		initDataNode();
		initPredicate();
		initPrecondition();
		TestGenerator.reset();
	}
	
	@After
	public void terminate() {
		Solver.terminate();
	}
}
