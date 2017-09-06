package basic;

public class Sll4 {
	
	public static Node_old x = new Node_old();
	
	public static Node_old myMethod() {
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
