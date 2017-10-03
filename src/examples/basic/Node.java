package basic;

public class Node {

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
