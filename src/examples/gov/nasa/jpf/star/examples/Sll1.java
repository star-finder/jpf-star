package gov.nasa.jpf.star.examples;

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

}
