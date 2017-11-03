package basic;

public class Sll1 {
	
	public NodeOld myMethod(NodeOld x) {
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
