
public class MyClass {

	public Node myMethod(Node x) {
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

	// The test driver
	public static void main(String[] args) {
		MyClass mc = new MyClass();
		Node x = new Node();
		Node y = new Node();
		mc.myMethod1(x, y);
	}

}

class Node {
	int value;
	Node next;
}
