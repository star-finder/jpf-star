
public class Sll2 {
	
	public static Node myMethod(Node x) {
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
	
	// The test driver
	public static void main(String[] args) {
		Node x = new Node(null);
		Sll2.myMethod(x);
	}

}
