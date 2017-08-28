package gov.nasa.jpf.star.examples;

import gov.nasa.jpf.star.examples.Utilities;
import org.junit.Test;
import gov.nasa.jpf.util.test.TestJPF;

public class Unzip_unzip1 extends TestJPF {

	@Test
	public void test_unzip1() throws Exception {
		Unzip obj = new Unzip();
		Node x = null;
		Node y = null;
		System.out.println(Utilities.repOK(obj));
		obj.unzip(x,y);
	}

	@Test
	public void test_unzip2() throws Exception {
		Unzip obj = new Unzip();
		Node x = new Node();
		Node y = new Node();
		Node next1_2 = null;
		Node next2_3 = null;
		x.next = next1_2;
		y.next = next2_3;
		System.out.println(Utilities.repOK(obj));
		obj.unzip(x,y);
	}

	@Test
	public void test_unzip3() throws Exception {
		Unzip obj = new Unzip();
		Node x = new Node();
		Node y = new Node();
		Node next1_2 = new Node();
		Node next2_3 = new Node();
		Node next1_5 = null;
		Node next2_6 = null;
		x.next = next1_2;
		y.next = next2_3;
		next1_2.next = next1_5;
		next2_3.next = next2_6;
		System.out.println(Utilities.repOK(obj));
		obj.unzip(x,y);
	}

	@Test
	public void test_unzip4() throws Exception {
		Unzip obj = new Unzip();
		Node x = new Node();
		Node y = new Node();
		Node next1_2 = new Node();
		Node next2_3 = new Node();
		Node next1_5 = new Node();
		Node next2_6 = new Node();
		Node next1_8 = null;
		Node next2_9 = null;
		x.next = next1_2;
		y.next = next2_3;
		next1_2.next = next1_5;
		next2_3.next = next2_6;
		next1_5.next = next1_8;
		next2_6.next = next2_9;
		System.out.println(Utilities.repOK(obj));
		obj.unzip(x,y);
	}

}

