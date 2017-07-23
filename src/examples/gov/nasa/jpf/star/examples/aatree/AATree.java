package gov.nasa.jpf.star.examples.aatree;

// AATree class
//
// CONSTRUCTION: with no initializer
//
// ******************PUBLIC OPERATIONS*********************
// void insert( x )       --> Insert x
// void remove( x )       --> Remove x
// boolean contains( x )  --> Return true if x is found
// Comparable findMin( )  --> Return smallest item
// Comparable findMax( )  --> Return largest item
// boolean isEmpty( )     --> Return true if empty; else false
// void makeEmpty( )      --> Remove all items
// ******************ERRORS********************************
// Throws UnderflowException as appropriate

/**
 * Implements an AA-tree. Note that all "matching" is based on the compareTo
 * method.
 * 
 * @author Mark Allen Weiss
 */
public class AATree {
	static class AANode {
		int element; // The data in the node

		AANode left; // Left child
		AANode right; // Right child
		int level; // Level

		AANode() {
			this(0, null, null);
		}
		
		// Constructors
		AANode(final int theElement, final AANode lt, final AANode rt) {
			this.element = theElement;
			this.left = lt;
			this.right = rt;
			this.level = 1;
		}
	}

	// Test program; should print min and max and nothing else
	public static void main(final String[] args) {
		final AATree t = new AATree();
		final int NUMS = 40000;
		final int GAP = 307;

		System.out.println("Checking... (no bad output means success)");

		t.insert(NUMS * 2);
		t.insert(NUMS * 3);
		for (int i = GAP; i != 0; i = (i + GAP) % NUMS) {
			t.insert(i);
		}
		System.out.println("Inserts complete");
		assert t.wellFormed();
		t.remove(t.findMax());
		for (int i = 1; i < NUMS; i += 2) {
			t.remove(i);
		}
		t.remove(t.findMax());
		System.out.println("Removes complete");

		if ((t.findMin() != 2) || (t.findMax() != NUMS - 2)) {
			System.out.println("FindMin or FindMax error!");
		}

		for (int i = 2; i < NUMS; i += 2) {
			if (!t.contains(i)) {
				System.out.println("Error: find fails for " + i);
			}
		}

		for (int i = 1; i < NUMS; i += 2) {
			if (t.contains(i)) {
				System.out.println("Error: Found deleted item " + i);
			}
		}
	}

	AANode root;

	final AANode nullNode;

	AANode deletedNode;

	AANode lastNode;

	/**
	 * Construct the tree.
	 */
	public AATree() {
		this.nullNode = new AANode(0, null, null);
		this.nullNode.left = this.nullNode.right = this.nullNode;
		this.nullNode.level = 0;
		this.root = this.nullNode;
	}

	/**
	 * Find an item in the tree.
	 * 
	 * @param x
	 *            the item to search for.
	 * @return true if x is found.
	 */
	// @ requires this.wellFormed();
	// @ ensures this.wellFormed();
	public boolean contains(final int x) {
		AANode current = this.root;
		this.nullNode.element = x;

		for (;;) {
			// int compareResult = x.compareTo(current.element);

			if (x < current.element) {
				current = current.left;
			} else if (x > current.element) {
				current = current.right;
			} else if (current != this.nullNode) {
				return true;
			} else {
				return false;
			}
		}
	}

	/**
	 * Find the largest item in the tree.
	 * 
	 * @return the largest item or throw Underflow if empty.
	 */
	// @ requires this.wellFormed();
	// @ ensures this.wellFormed();
	public int findMax() {
		if (isEmpty()) {
			throw new Underflow();
		}

		AANode ptr = this.root;

		while (ptr.right != this.nullNode) {
			ptr = ptr.right;
		}

		return ptr.element;
	}

	/**
	 * Find the smallest item in the tree.
	 * 
	 * @return the smallest item or throw UnderflowException if empty.
	 */
	// @ requires this.wellFormed();
	// @ ensures this.wellFormed();
	public int findMin() {
		if (isEmpty()) {
			throw new Underflow();
		}

		AANode ptr = this.root;

		while (ptr.left != this.nullNode) {
			ptr = ptr.left;
		}

		return ptr.element;
	}

	/**
	 * Insert into the tree.
	 * 
	 * @param x
	 *            the item to insert.
	 */
	// @ requires this.wellFormed();
	// @ ensures (this.root != this.nullNode) && this.wellFormed();
	public void insert(final int x) {
		this.root = insert(x, this.root);
	}

	/**
	 * Internal method to insert into a subtree.
	 * 
	 * @param x
	 *            the item to insert.
	 * @param t
	 *            the node that roots the subtree.
	 * @return the new root of the subtree.
	 */
	private AANode insert(final int x, AANode t) {
		if (t == this.nullNode) {
			return new AANode(x, this.nullNode, this.nullNode);
		}

		// int compareResult = x.compareTo(t.element);

		if (x < t.element) {
			t.left = insert(x, t.left);
		} else if (x > t.element) {
			t.right = insert(x, t.right);
		} else {
			return t;
		}

		t = skew(t);
		t = split(t);
		return t;
	}

	/**
	 * Test if the tree is logically empty.
	 * 
	 * @return true if empty, false otherwise.
	 */
	public boolean isEmpty() {
		return this.root == this.nullNode;
	}

	/**
	 * Make the tree logically empty.
	 */
	public void makeEmpty() {
		this.root = this.nullNode;
	}

	private boolean ordered() {
		return ordered(this.root, new Range());
	}

	private boolean ordered(final AANode t, final Range range) {
		if (t == null) {
			return false;
		}
		if (t == this.nullNode) {
			return true;
		}
		if (!range.inRange(t.element)) {
			return false;
		}
		boolean ret = ordered(t.left, range.setUpper(t.element));
		ret = ret && ordered(t.right, range.setLower(t.element));
		return ret;
	}

	/**
	 * Remove from the tree.
	 * 
	 * @param x
	 *            the item to remove.
	 */
	// @ requires (this.lastNode == null) && (this.deletedNode == null) &&
	// this.wellFormed();
	// @ ensures this.wellFormed();
	public void remove(final int x) {
		this.deletedNode = this.nullNode;
		this.root = remove(x, this.root);
	}

	/**
	 * Internal method to remove from a subtree.
	 * 
	 * @param x
	 *            the item to remove.
	 * @param t
	 *            the node that roots the subtree.
	 * @return the new root of the subtree.
	 */
	private AANode remove(final int x, AANode t) {
		if (t != this.nullNode) {
			// Step 1: Search down the tree and set lastNode and deletedNode
			this.lastNode = t;
			if (x < t.element) {
				t.left = remove(x, t.left);
			} else {
				this.deletedNode = t;
				t.right = remove(x, t.right);
			}

			// Step 2: If at the bottom of the tree and
			// x is present, we remove it
			if (t == this.lastNode) {
				if ((this.deletedNode == this.nullNode) || (x != this.deletedNode.element)) {
					return t; // Item not found; do nothing
				}
				this.deletedNode.element = t.element;
				t = t.right;
			}

			// Step 3: Otherwise, we are not at the bottom; rebalance
			else if ((t.left.level < t.level - 1) || (t.right.level < t.level - 1)) {
				if (t.right.level > --t.level) {
					t.right.level = t.level;
				}
				t = skew(t);
				t.right = skew(t.right);
				t.right.right = skew(t.right.right);
				t = split(t);
				t.right = split(t.right);
			}
		}
		return t;
	}

	/**
	 * Rotate binary tree node with left child.
	 */
	private AANode rotateWithLeftChild(final AANode k2) {
		final AANode k1 = k2.left;
		k2.left = k1.right;
		k1.right = k2;
		return k1;
	}

	/**
	 * Rotate binary tree node with right child.
	 */
	private AANode rotateWithRightChild(final AANode k1) {
		final AANode k2 = k1.right;
		k1.right = k2.left;
		k2.left = k1;
		return k2;
	}

	/**
	 * Skew primitive for AA-trees.
	 * 
	 * @param t
	 *            the node that roots the tree.
	 * @return the new root after the rotation.
	 */
	private AANode skew(AANode t) {
		if (t.left.level == t.level) {
			t = rotateWithLeftChild(t);
		}
		return t;
	}

	/**
	 * Split primitive for AA-trees.
	 * 
	 * @param t
	 *            the node that roots the tree.
	 * @return the new root after the rotation.
	 */
	private AANode split(AANode t) {
		if (t.right.right.level == t.level) {
			t = rotateWithRightChild(t);
			t.level++;
		}
		return t;
	}

	private boolean validGlobals() {
		if ((this.nullNode == null) || (this.nullNode.level != 0)) {
			return false;
		}
		if ((this.nullNode.left != this.nullNode) || (this.nullNode.right != this.nullNode)) {
			return false;
		}
		return true;
	}

	public boolean wellFormed() {
		if (!validGlobals()) {
			return false;
		}
		if (this.root == null) {
			return false;
		}
		return ordered() && wellLevel(this.root, this.root.level + 1);
	}

	// structural invariant of AATree
	// 1. The level of a leaf node is one.
	// 2. The level of a left child is strictly == its parent's level - 1.
	// 3. The level of a right child is less than one or equal to that of its
	// parent.
	// 4. The level of a right grandchild is strictly less than that of its
	// grandparent.
	// 5. Every node of level greater than one must have two children.
	private boolean wellLevel(final AANode node, final int parentLevel) {
		if ((node.left == null) || (node.right == null)) {
			return false;
		}
		if (node == this.nullNode) {
			if (node.level != 0) {
				return false;
			} else {
				return true;
			}
		}
		if ((node.left == this.nullNode) || (node.right == this.nullNode)) {
			if (node.level != 1) {
				return false;
			}
		}
		if (node.left != this.nullNode) {
			if (node.level != node.left.level + 1) {
				return false;
			}
			if (!wellLevel(node.left, node.level)) {
				return false;
			}
		}
		if ((node.right != this.nullNode) && !(parentLevel > node.right.level)) {
			return false;
		}
		if (node.right != this.nullNode) {
			if (!((node.level == node.right.level) || (node.level == node.right.level + 1))) {
				return false;
			}
			return wellLevel(node.right, node.level);
		}
		return true;
	}
}
