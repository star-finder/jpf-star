import org.junit.Test;

import gov.nasa.jpf.util.test.TestJPF;

public class MyClassTest extends TestJPF {
	
	@Test
	public void testMain() {
		if (verifyNoPropertyViolation(
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+report.console.property_violation=error,trace")) {
			MyClass.main(null);
		}
	}

}
