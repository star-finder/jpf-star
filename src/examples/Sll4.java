
public class Sll4 {
	
	public static Node x = new Node();
	
	public static Node myMethod() {
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
		Sll4.myMethod();
	}

}
