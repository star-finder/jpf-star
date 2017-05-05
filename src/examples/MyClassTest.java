import org.junit.Test;

import gov.nasa.jpf.util.test.TestJPF;

public class MyClassTest extends TestJPF {
	
	@Test
	public void testMain() {
		if (verifyNoPropertyViolation(
				"+listener=.star.StarListener",
				"+classpath=build/examples", 
				"+sourcepath=src/examples",
				"+symbolic.method = MyClass.myMethod(sym)",
				"+symbolic.lazy=true",
				"+report.console.property_violation=error,trace")) {
			MyClass.main(null);
		}
	}

}
