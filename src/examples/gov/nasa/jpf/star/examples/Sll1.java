package gov.nasa.jpf.star.examples;

public class Sll1 {
	
	public Node_old myMethod(Node_old x) {
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

}
