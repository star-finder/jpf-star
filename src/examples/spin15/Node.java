package spin15;

/*
 * Example from Antonio's model counting paper at SPIN 2015,
 * which is in turn adapted from Corina's TACAS 2003 paper
 * about generalized symbolic execution and lazy initialization
 */
class Node {
	int elem;
	Node next;
	
	public Node() {}
	
	public Node(int e, Node n) {
		elem = e;
		next = n;
	}

	public Node swapNode() {
		if (elem > next.elem) {
			Node t = next;
			next = t.next;
			t.next = this;
			return t;
		}
		return this;
	}
	
	public static void main (String[] args) {
		Node x = new Node(1, null);
		x = x.swapNode();
	}
}
