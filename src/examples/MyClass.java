
public class MyClass {

	public Node myMethod(Node x, Node y) {
		if (x != y)
			return null;
		else {
			return x.next;
		}
	}

	// The test driver
	public static void main(String[] args) {
		MyClass mc = new MyClass();
		Node x = new Node();
		mc.myMethod(x, x);
	}

}

class Node {
	int value;
	Node next;
}
