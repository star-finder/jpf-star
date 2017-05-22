
public class MyClass {

	public Node myMethod(Node x) {
		if (x == null)
			return null;
		else {
			return x.next;
		}
	}

	// The test driver
	public static void main(String[] args) {
		MyClass mc = new MyClass();
		Node x = new Node();
		mc.myMethod(x);
	}

}

class Node {
	int value;
	Node next;
}
