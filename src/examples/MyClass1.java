import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class MyClass1 extends TestJPF {

	@Test
	public void test1() {
		MyClass obj = new MyClass();
		int i = 0;
		int j = 1;
		obj.myMethod2(i,j);
	}

	@Test
	public void test2() {
		MyClass obj = new MyClass();
		int i = 1;
		int j = 1;
		obj.myMethod2(i,j);
	}

	@Test
	public void test3() {
		MyClass obj = new MyClass();
		int i = 0;
		int j = 2;
		obj.myMethod2(i,j);
	}

	@Test
	public void test4() {
		MyClass obj = new MyClass();
		int i = 0;
		int j = 0;
		obj.myMethod2(i,j);
	}

}

