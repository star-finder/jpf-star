
public class MyClass {
	
	static Node x;
		
	public Node foo(Node x) {
		if (x == null) {
			return null;
		} else {
			x = x.next;
			if (x == null)
				return x;
			else
				return x.next;
		}
	}

	public Node foo1(Node x, Node y) {
		if (x == y) {
			return x;
		} else {
			return x.next;
		}
	}
	
	public static Node myMethod() {
//		return foo(x);
//		return foo1(x, x.next);
//		while (x != null) {
//			x = x.next;
//		}
//		
//		return x;
		
		if (x == null) {
			return null;
		} else {
			x = x.next;
			if (x == null)
				return x;
			else
				return x.next;
		}
	}
	
	public Node myMethod1(Node x, Node y) {
		if (x != y) {
			return null;
		} else {
			Node z = y.next;
			if (z == null) {
				return null;
			} else {
				return x;
			}
		}
	}
	
	public Node myMethod2(int i, int j) {
//		i = i + j;
//		if (i - 1 > 0) {
//			i = 2 * i - 1;
//			if (((int) i) > 0)
//				return null;
//			else
//				return null;
//		} else {
//			return null;
//		}
		
		i = i + 2 * j;
		switch (i) {
		case 2:
			return null;
		case 4:
			return null;
		default:
			return null;
		}
	}

	// The test driver
	public static void main(String[] args) {
		MyClass mc = new MyClass();
//		Node x = new Node();
//		Node y = new Node();
//		MyClass.myMethod();
		int i = 0;
		int j = 0;
		mc.myMethod2(i, j);
//		mc.myMethod1(x, y);
	}

}

class Node {
	Node next;
}
