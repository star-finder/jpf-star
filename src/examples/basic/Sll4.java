package basic;

public class Sll4 {
	
	public static NodeOld x = new NodeOld();
	
	public static NodeOld myMethod() {
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
