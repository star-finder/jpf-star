package basic;

public class Sll3 {
	
	public NodeOld x = new NodeOld();
	
	public NodeOld myMethod() {
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
