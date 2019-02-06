package random.sll;

public class Input {
	
	public boolean repOK(Node root) {
		if (root == null) return true;
		else return !hasLoop(root);
	}
	
	private boolean hasLoop(Node start) {
		Node slow = start;
		Node fast1 = start.next;
		Node fast2 = (fast1 != null) ? fast1.next : null;
		
		while (slow != null && fast1 != null && fast2 != null) {
			if (slow == fast1 || slow == fast2) return true;
			
			fast1 = (fast2 != null) ? fast2.next : null;
			fast2 = (fast1 != null) ? fast1.next : null;
			slow = slow.next;
		}
		
		return false;
	}
	
	public boolean isPrime(int n) {
		if (n < 2) return false;
		
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) return false;
		}
		
		return true;
	}
	
	public boolean isContainPrime(Node root) {
		while (root != null) {
			if (isPrime(root.elem)) return true;
			root = root.next;
		}
		
		return false;
	}
	
	public boolean withAbs(Node root) {
		while (root != null) {
			if (Math.abs(root.elem) == 0) return true;
			root = root.next;
		}
		
		return false;
	}
	
	public boolean withAcos(Node root) {
		while (root != null) {
			if (Math.acos(root.elem) == 0) return true;
			root = root.next;
		}
		
		return false;
	}
	
	public boolean withAsin(Node root) {
		while (root != null) {
			if (Math.asin(root.elem) == 0) return true;
			root = root.next;
		}
		
		return false;
	}
	
	public boolean withAtan(Node root) {
		while (root != null) {
			if (Math.atan(root.elem) == 0) return true;
			root = root.next;
		}
		
		return false;
	}
	
	public boolean withCbrt(Node root) {
		while (root != null) {
			if (Math.cbrt(root.elem) == 0) return true;
			root = root.next;
		}
		
		return false;
	}
	
	public boolean withCeil(Node root) {
		while (root != null) {
			if (Math.ceil(root.elem) == 0) return true;
			root = root.next;
		}
		
		return false;
	}
	
	public boolean withCos(Node root) {
		while (root != null) {
			if (Math.cos(root.elem) == 1) return true;
			root = root.next;
		}
		
		return false;
	}
	
	public boolean withCosh(Node root) {
		while (root != null) {
			if (Math.cosh(root.elem) == 1) return true;
			root = root.next;
		}
		
		return false;
	}
	
	public boolean withDecrementExact(Node root) {
		while (root != null) {
			if (Math.decrementExact(root.elem) == 0) return true;
			root = root.next;
		}
		
		return false;
	}
	
	public boolean withExp(Node root) {
		while (root != null) {
			if (Math.exp(root.elem) == 1) return true;
			root = root.next;
		}
		
		return false;
	}
	
	public boolean withExpm1(Node root) {
		while (root != null) {
			if (Math.expm1(root.elem) == 0) return true;
			root = root.next;
		}
		
		return false;
	}
	
	public boolean withFloor(Node root) {
		while (root != null) {
			if (Math.floor(root.elem) == 0) return true;
			root = root.next;
		}
		
		return false;
	}
	
	public boolean withGetExponent(Node root) {
		while (root != null) {
			if (Math.getExponent(root.elem) == Float.MIN_EXPONENT - 1) return true;
			root = root.next;
		}
		
		return false;
	}
	
	public boolean withIncrementExact(Node root) {
		while (root != null) {
			if (Math.incrementExact(root.elem) == 1) return true;
			root = root.next;
		}
		
		return false;
	}
	
	public boolean withLog(Node root) {
		while (root != null) {
			if (Math.log(root.elem) == 0) return true;
			root = root.next;
		}
		
		return false;
	}
	
	public boolean withLog10(Node root) {
		while (root != null) {
			if (Math.log10(root.elem) == 0) return true;
			root = root.next;
		}
		
		return false;
	}
	
	public boolean withLog1p(Node root) {
		while (root != null) {
			if (Math.log1p(root.elem) == 0) return true;
			root = root.next;
		}
		
		return false;
	}
	
	public boolean withNegateExact(Node root) {
		while (root != null) {
			if (Math.negateExact(root.elem) == 0) return true;
			root = root.next;
		}
		
		return false;
	}
	
	public boolean withNextDown(Node root) {
		while (root != null) {
			if (Math.nextDown(root.elem) == -Float.MIN_VALUE) return true;
			root = root.next;
		}
		
		return false;
	}
	
	public boolean withNextUp(Node root) {
		while (root != null) {
			if (Math.nextUp(root.elem) == Float.MIN_VALUE) return true;
			root = root.next;
		}
		
		return false;
	}
	
	public boolean withRint(Node root) {
		while (root != null) {
			if (Math.rint(root.elem) == 0) return true;
			root = root.next;
		}
		
		return false;
	}
	
	public boolean withRound(Node root) {
		while (root != null) {
			if (Math.round(root.elem) == 0) return true;
			root = root.next;
		}
		
		return false;
	}
	
	public boolean withSignum(Node root) {
		while (root != null) {
			if (Math.signum(root.elem) == 0) return true;
			root = root.next;
		}
		
		return false;
	}
	
	public boolean withSin(Node root) {
		while (root != null) {
			if (Math.sin(root.elem) == 0) return true;
			root = root.next;
		}
		
		return false;
	}
	
	public boolean withSinh(Node root) {
		while (root != null) {
			if (Math.sinh(root.elem) == 0) return true;
			root = root.next;
		}
		
		return false;
	}
	
	public boolean withSqrt(Node root) {
		while (root != null) {
			if (Math.sqrt(root.elem) == 0) return true;
			root = root.next;
		}
		
		return false;
	}
	
	public boolean withTan(Node root) {
		while (root != null) {
			if (Math.tan(root.elem) == 0) return true;
			root = root.next;
		}
		
		return false;
	}
	
	public boolean withTanh(Node root) {
		while (root != null) {
			if (Math.tanh(root.elem) == 0) return true;
			root = root.next;
		}
		
		return false;
	}
	
	public boolean withToDegrees(Node root) {
		while (root != null) {
			if (Math.toDegrees(root.elem) == 0) return true;
			root = root.next;
		}
		
		return false;
	}
	
	public boolean withToIntExact(Node root) {
		while (root != null) {
			if (Math.toIntExact(root.elem) == 0) return true;
			root = root.next;
		}
		
		return false;
	}
	
	public boolean withToRadians(Node root) {
		while (root != null) {
			if (Math.toRadians(root.elem) == 0) return true;
			root = root.next;
		}
		
		return false;
	}
	
	public boolean withUlp(Node root) {
		while (root != null) {
			if (Math.ulp(root.elem) == Float.MIN_VALUE) return true;
			root = root.next;
		}
		
		return false;
	}

	public static void main(String[] args) {
		if (args.length < 1)
			return;
		Input in = new Input();
		switch (args[0]) {
		case "isContainPrime":
			in.isContainPrime(new Node());
			break;
		case "withAbs":
			in.withAbs(new Node());
			break;
		case "withAcos":
			in.withAcos(new Node());
			break;
		case "withAsin":
			in.withAsin(new Node());
			break;
		case "withAtan":
			in.withAtan(new Node());
			break;
		case "withCbrt":
			in.withCbrt(new Node());
			break;
		case "withCeil":
			in.withCeil(new Node());
			break;
		case "withCos":
			in.withCos(new Node());
			break;
		case "withCosh":
			in.withCosh(new Node());
			break;
		case "withDecrementExact":
			in.withDecrementExact(new Node());
			break;
		case "withExp":
			in.withExp(new Node());
			break;
		case "withExpm1":
			in.withExpm1(new Node());
			break;
		case "withFloor":
			in.withFloor(new Node());
			break;
		case "withGetExponent":
			in.withGetExponent(new Node());
			break;
		case "withIncrementExact":
			in.withIncrementExact(new Node());
			break;
		case "withLog":
			in.withLog(new Node());
			break;
		case "withLog10":
			in.withLog10(new Node());
			break;
		case "withLog1p":
			in.withLog1p(new Node());
			break;
		case "withNegateExact":
			in.withNegateExact(new Node());
			break;
		case "withNextDown":
			in.withNextDown(new Node());
			break;
		case "withNextUp":
			in.withNextUp(new Node());
			break;
		case "withRint":
			in.withRint(new Node());
			break;
		case "withRound":
			in.withRound(new Node());
			break;
		case "withSignum":
			in.withSignum(new Node());
			break;
		case "withSin":
			in.withSin(new Node());
			break;
		case "withSinh":
			in.withSinh(new Node());
			break;
		case "withSqrt":
			in.withSqrt(new Node());
			break;
		case "withTan":
			in.withTan(new Node());
			break;
		case "withTanh":
			in.withTanh(new Node());
			break;
		case "withToDegrees":
			in.withToDegrees(new Node());
			break;
		case "withToIntExact":
			in.withToIntExact(new Node());
			break;
		case "withToRadians":
			in.withToRadians(new Node());
			break;
		case "withUlp":
			in.withUlp(new Node());
			break;
		default:
			break;
		}
	}
	
}

class Node {
	
	public int elem;
	
	public Node next;
	
	public Node() {
		this(0, null);
	}
	
	public Node(int elem, Node next) {
		this.elem = elem;
		this.next = next;
	}
	
}