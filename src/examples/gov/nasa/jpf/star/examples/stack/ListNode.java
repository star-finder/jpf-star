package gov.nasa.jpf.star.examples.stack;

public class ListNode {
	
	public ListNode() {
	}

	// Constructors
	ListNode(Object theElement) {
		this(theElement, null);
	}

	ListNode(Object theElement, ListNode n) {
		element = theElement;
		next = n;
	}

	// Friendly data; accessible by other package routines
	Object element;
	ListNode next;
	
}
