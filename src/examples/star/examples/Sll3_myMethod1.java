package star.examples;

import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Sll3_myMethod1 extends TestJPF {

	@Test
	public void test1() throws Exception {
		Sll3 obj = new Sll3();
		obj.x = null;
		obj.myMethod();
	}

	@Test
	public void test2() throws Exception {
		Sll3 obj = new Sll3();
		obj.x = new Node_old();
		Node_old next_1 = null;
		obj.x.next = next_1;
		obj.myMethod();
	}

	@Test
	public void test3() throws Exception {
		Sll3 obj = new Sll3();
		obj.x = new Node_old();
		Node_old next_1 = new Node_old();
		Node_old next_2 = null;
		obj.x.next = next_1;
		next_1.next = next_2;
		obj.myMethod();
	}

	@Test
	public void test4() throws Exception {
		Sll3 obj = new Sll3();
		obj.x = new Node_old();
		Node_old next_1 = new Node_old();
		Node_old next_2 = new Node_old();
		Node_old next_3 = null;
		obj.x.next = next_1;
		next_1.next = next_2;
		next_2.next = next_3;
		obj.myMethod();
	}

}

