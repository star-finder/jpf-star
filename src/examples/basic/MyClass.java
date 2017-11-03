package basic;

public class MyClass {
			
	public NodeOld foo(NodeOld x) {
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

	public NodeOld foo1(NodeOld x, NodeOld y) {
		if (x == y) {
			return x;
		} else {
			return x.next;
		}
	}
	
	public static NodeOld myMethod(NodeOld x) {
//		return foo(x);
//		return foo1(x, x.next);
//		while (x != null) {
//			x = x.next;
//		}
//		
//		return x;
		
//		x = new Node(x);
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
	
	public NodeOld myMethod1(NodeOld x, NodeOld y) {
		if (x != y) {
			return null;
		} else {
			NodeOld z = y.next;
			if (z == null) {
				return null;
			} else {
				return x;
			}
		}
	}
	
	public NodeOld myMethod2(int i, int j) {
//		i = i + j;
//		if (i - 1 > 0) {
//			i = 2 * i - 1;
//			if (((int) i) > 0)
//				return null;
//			else
//				return null;
//		} else {
//			return null;
//		}
		
		i = i + 2 * j;
		switch (i) {
		case 2:
			return null;
		case 4:
			return null;
		default:
			return null;
		}
	}

	// The test driver
	public static void main(String[] args) {
		int select = Integer.parseInt(args[0]);
		System.out.println(select);
		NodeOld x = new NodeOld(null);
		MyClass mc = new MyClass();
		switch (select) {
		case 0:
			MyClass.myMethod(x);
			break;
		case 1:
			NodeOld y = new NodeOld();
			mc.myMethod1(x, y);
			break;
		case 2:
			int i = 0;
			int j = 0;
			mc.myMethod2(i, j);
		default:
			break;
		}
	}

}
