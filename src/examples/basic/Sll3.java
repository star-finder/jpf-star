package basic;

public class Sll3 {
	
	public Node_old x = new Node_old();
	
	public Node_old myMethod() {
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
