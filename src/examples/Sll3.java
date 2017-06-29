
public class Sll3 {
	
	public Node x = new Node();
	
	public Node myMethod() {
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
		Sll3 sll = new Sll3();
		sll.myMethod();
	}

}
