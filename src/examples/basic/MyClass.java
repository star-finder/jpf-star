package basic;

public class MyClass {
	
	static Node_old x;
		
	public Node_old foo(Node_old x) {
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

	public Node_old foo1(Node_old x, Node_old y) {
		if (x == y) {
			return x;
		} else {
			return x.next;
		}
	}
	
	public static Node_old myMethod(Node_old x) {
//		return foo(x);
//		return foo1(x, x.next);
//		while (x != null) {
//			x = x.next;
//		}
//		
//		return x;
		
//		x = new Node(x);
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
	
	public Node_old myMethod1(Node_old x, Node_old y) {
		if (x != y) {
			return null;
		} else {
			Node_old z = y.next;
			if (z == null) {
				return null;
			} else {
				return x;
			}
		}
	}
	
	public Node_old myMethod2(int i, int j) {
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
		Node_old x = new Node_old(null);
//		Node y = new Node();
//		MyClass.myMethod(x);
		int i = 0;
		int j = 0;
		mc.myMethod2(i, j);
//		mc.myMethod1(x, y);
	}

}
