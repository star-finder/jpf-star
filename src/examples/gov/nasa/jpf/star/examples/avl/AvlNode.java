package gov.nasa.jpf.star.examples.avl;

// Basic node stored in AVL trees
// Note that this class is not accessible outside
// of package DataStructures

class AvlNode {
	// Friendly data; accessible by other package routines
	int element; // The data in the node

	AvlNode left; // Left child

	AvlNode right; // Right child
	
	int height; // Height

	AvlNode() {
		this(0);
	}
	
	// Constructors
	AvlNode(final int theElement) {
		this(theElement, null, null);
	}

	AvlNode(final int theElement, final AvlNode lt, final AvlNode rt) {
		this.element = theElement;
		this.left = lt;
		this.right = rt;
		this.height = 0;
	}

}
