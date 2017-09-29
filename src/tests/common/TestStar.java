package common;

import org.junit.Before;

import gov.nasa.jpf.util.test.TestJPF;
import star.testgeneration.TestGenerator;

public abstract class TestStar extends TestJPF {
	
	protected abstract void initDataNode();
	protected abstract void initPredicate();
	protected abstract void initPrecondition();
	
	@Before
	public void init() {
		initDataNode();
		initPredicate();
		initPrecondition();
		TestGenerator.reset();
	}
}
