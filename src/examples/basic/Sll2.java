package basic;

public class Sll2 {
	
	public static NodeOld myMethod(NodeOld x) {
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
		NodeOld x = new NodeOld(null);
		Sll2.myMethod(x);
	}

}
