package gov.nasa.jpf.star.examples;

public class Unzip {

	public Node unzip(Node x, Node y) {
		Node dummyHead = new Node(0, null);
		Node z = dummyHead;
		while (x != null) {
			z.next = new Node(x.val + y.val, null);
			x = x.next;
			y = y.next;
			z = z.next;
		}
		return dummyHead.next;
	}

}

class Node {

	public int val;

	public Node next;

	public Node() {
		this(0, null);
	}

	public Node(int val, Node next) {
		this.val = val;
		this.next = next;
	}

}
