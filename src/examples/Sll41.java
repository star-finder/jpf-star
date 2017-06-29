import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Sll41 extends TestJPF {

	@Test
	public void test1() {
		Sll4.x = null;
		Sll4.myMethod();
	}

	@Test
	public void test2() {
		Sll4.x = new Node();
		Node next_1 = null;
		Sll4.x.next = next_1;
		Sll4.myMethod();
	}

	@Test
	public void test3() {
		Sll4.x = new Node();
		Node next_1 = new Node();
		Node next_2 = null;
		Sll4.x.next = next_1;
		next_1.next = next_2;
		Sll4.myMethod();
	}

	@Test
	public void test4() {
		Sll4.x = new Node();
		Node next_1 = new Node();
		Node next_2 = new Node();
		Node next_3 = null;
		Sll4.x.next = next_1;
		next_1.next = next_2;
		next_2.next = next_3;
		Sll4.myMethod();
	}

}

