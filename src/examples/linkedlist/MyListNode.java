package linkedlist;

//MyListNode.java
//This class implements basic node stored in a linked list .

public class MyListNode {
	/* Class Members */
	public Object _element; // Node's data
	public MyListNode _next; // Pointer to next node

	public MyListNode() {
		this(null, null);
	}
	
	// C'tor - 1
	MyListNode(Object theElement) {
		this(theElement, null);
	}

	// C'tor - 2
	MyListNode(Object theElement, MyListNode n) {
//		synchronized (this) {
			this._element = theElement;
			this._next = n;
//		}

	}

}
