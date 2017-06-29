import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Sll11 extends TestJPF {

	@Test
	public void test1() {
		Sll1 obj = new Sll1();
		Node x = null;
		obj.myMethod(x);
	}

	@Test
	public void test2() {
		Sll1 obj = new Sll1();
		Node x = new Node();
		Node next_1 = null;
		x.next = next_1;
		obj.myMethod(x);
	}

	@Test
	public void test3() {
		Sll1 obj = new Sll1();
		Node x = new Node();
		Node next_1 = new Node();
		Node next_2 = null;
		x.next = next_1;
		next_1.next = next_2;
		obj.myMethod(x);
	}

	@Test
	public void test4() {
		Sll1 obj = new Sll1();
		Node x = new Node();
		Node next_1 = new Node();
		Node next_2 = new Node();
		Node next_3 = null;
		x.next = next_1;
		next_1.next = next_2;
		next_2.next = next_3;
		obj.myMethod(x);
	}

}

