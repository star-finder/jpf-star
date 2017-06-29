
public class Sll1 {
	
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
	
	// The test driver
	public static void main(String[] args) {
		Sll1 sll = new Sll1();
		Node x = new Node(null);
		sll.myMethod(x);
	}

}
