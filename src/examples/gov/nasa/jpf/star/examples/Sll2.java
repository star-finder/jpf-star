package gov.nasa.jpf.star.examples;

public class Sll2 {
	
	public static Node_old myMethod(Node_old x) {
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
		Node_old x = new Node_old(null);
		Sll2.myMethod(x);
	}

}
