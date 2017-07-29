package gov.nasa.jpf.star.examples.avl;

/**
 * Implements an AVL tree. Note that all "matching" is based on the compareTo
 * method.
 * 
 * @author Mark Allen Weiss
 */
public class AvlTree {
	
	public boolean repOK() {
		return ordered() && balanced() && wellFormed();
	}
	
	/**
	 * Double rotate binary tree node: first left child with its right child;
	 * then node k3 with new left child. For AVL trees, this is a double
	 * rotation for case 2. Update heights, then return new root.
	 */
	private static AvlNode doubleWithLeftChild(final AvlNode k3) {
		k3.left = AvlTree.rotateWithRightChild(k3.left);
		return AvlTree.rotateWithLeftChild(k3);
	}

	/**
	 * Double rotate binary tree node: first right child with its left child;
	 * then node k1 with new right child. For AVL trees, this is a double
	 * rotation for case 3. Update heights, then return new root.
	 */
	private static AvlNode doubleWithRightChild(final AvlNode k1) {
		k1.right = AvlTree.rotateWithLeftChild(k1.right);
		return AvlTree.rotateWithRightChild(k1);
	}

	/**
	 * Return the height of node t, or -1, if null.
	 */
	private static int height(final AvlNode t) {
		return t == null ? -1 : t.height;
	}

	/**
	 * Return maximum of lhs and rhs.
	 */
	private static int max(final int lhs, final int rhs) {
		return lhs > rhs ? lhs : rhs;
	}

	/**
	 * Rotate binary tree node with left child. For AVL trees, this is a single
	 * rotation for case 1. Update heights, then return new root.
	 */
	private static AvlNode rotateWithLeftChild(final AvlNode k2) {
		final AvlNode k1 = k2.left;
		k2.left = k1.right;
		k1.right = k2;
		k2.height = AvlTree.max(AvlTree.height(k2.left), AvlTree.height(k2.right)) + 1;
		k1.height = AvlTree.max(AvlTree.height(k1.left), k2.height) + 1;
		return k1;
	}

	/**
	 * Rotate binary tree node with right child. For AVL trees, this is a single
	 * rotation for case 4. Update heights, then return new root.
	 */
	private static AvlNode rotateWithRightChild(final AvlNode k1) {
		final AvlNode k2 = k1.right;
		k1.right = k2.left;
		k2.left = k1;
		k1.height = AvlTree.max(AvlTree.height(k1.left), AvlTree.height(k1.right)) + 1;
		k2.height = AvlTree.max(AvlTree.height(k2.right), k1.height) + 1;
		return k2;
	}

	/** The tree root. */
	AvlNode root;

	/**
	 * Construct the tree.
	 */
	public AvlTree() {
		this.root = null;
	}

	public boolean balanced() {
		return balanced(this.root);
	}

	private boolean balanced(final AvlNode an) {
		if (an == null) {
			return true;
		}
		final int lh = AvlTree.height(an.left);
		final int rh = AvlTree.height(an.right);
		return ((lh == rh) || (lh == rh + 1) || (lh + 1 == rh)) && balanced(an.left) && balanced(an.right);
	}

	/**
	 * Internal method to get element field.
	 * 
	 * @param t
	 *            the node.
	 * @return the element field or null if t is null.
	 */
	private int elementAt(final AvlNode t) {
		return t == null ? -1 : t.element;
	}

	/**
	 * Find an item in the tree.
	 * 
	 * @param x
	 *            the item to search for.
	 * @return the matching item or null if not found.
	 */
	// @ requires this.ordered() && this.wellFormed() && this.balanced();
	// @ ensures this.ordered() && this.wellFormed() && this.balanced();
	public int find(final int x) {
		return elementAt(find(x, this.root));
	}

	/**
	 * Internal method to find an item in a subtree.
	 * 
	 * @param x
	 *            is item to search for.
	 * @param t
	 *            the node that roots the tree.
	 * @return node containing the matched item.
	 */
	private AvlNode find(final int x, AvlNode t) {
		while (t != null) {
			if (x < t.element) {
				t = t.left;
			} else if (x > t.element) {
				t = t.right;
			} else {
				return t; // Match
			}
		}

		return null; // No match
	}

	/**
	 * Find the largest item in the tree.
	 * 
	 * @return the largest item of null if empty.
	 */
	// @requires this.ordered() && this.wellFormed() && this.balanced();
	// @ensures this.ordered() && this.wellFormed() && this.balanced() &&
	// this.maxElement(\result);
	public int findMax() {
		return elementAt(findMax(this.root));
	}

	/**
	 * Internal method to find the largest item in a subtree.
	 * 
	 * @param t
	 *            the node that roots the tree.
	 * @return node containing the largest item.
	 */
	private AvlNode findMax(AvlNode t) {
		if (t == null) {
			return t;
		}

		while (t.right != null) {
			t = t.right;
		}
		return t;
	}

	/**
	 * Find the smallest item in the tree.
	 * 
	 * @return smallest item or null if empty.
	 */
	// @requires this.ordered() && this.wellFormed() && this.balanced();
	// @ensures this.ordered() && this.wellFormed() && this.balanced() &&
	// this.minElement(\result);
	public int findMin() {
		return elementAt(findMin(this.root));
	}

	/**
	 * Internal method to find the smallest item in a subtree.
	 * 
	 * @param t
	 *            the node that roots the tree.
	 * @return node containing the smallest item.
	 */
	private AvlNode findMin(AvlNode t) {
		if (t == null) {
			return t;
		}

		while (t.left != null) {
			t = t.left;
		}
		return t;
	}

	/**
	 * Insert into the tree; duplicates are ignored.
	 * 
	 * @param x
	 *            the item to insert.
	 */
	// @ requires ordered() && wellFormed() && balanced();
	// @ ensures balanced() && ordered();
	public void insert(final int x) {
		this.root = insert(x, this.root);
	}

	/**
	 * Internal method to insert into a subtree.
	 * 
	 * @param x
	 *            the item to insert.
	 * @param t
	 *            the node that roots the tree.
	 * @return the new root.
	 */
	private AvlNode insert(final int x, AvlNode t) {
		if (t == null) {
			t = new AvlNode(x, null, null);
		} else if (x < t.element) {
			t.left = insert(x, t.left);
			if (AvlTree.height(t.left) - AvlTree.height(t.right) == 2) {
				if (x < t.left.element) {
					t = AvlTree.rotateWithLeftChild(t);
				} else {
					t = AvlTree.doubleWithLeftChild(t);
				}
			}
		} else if (x > t.element) {
			t.right = insert(x, t.right);
			if (AvlTree.height(t.right) - AvlTree.height(t.left) == 2) {
				if (x > t.right.element) {
					t = AvlTree.rotateWithRightChild(t);
				} else {
					t = AvlTree.doubleWithRightChild(t);
				}
			}
		} else {
			; // Duplicate; do nothing
		}
		t.height = AvlTree.max(AvlTree.height(t.left), AvlTree.height(t.right)) + 1;
		return t;
	}

	/**
	 * Test if the tree is logically empty.
	 * 
	 * @return true if empty, false otherwise.
	 */
	public boolean isEmpty() {
		return this.root == null;
	}

	/**
	 * Make the tree logically empty.
	 */
	public void makeEmpty() {
		this.root = null;
	}

	boolean maxElement(final int maxE) {
		return maxElement(maxE, this.root);
	}

	private boolean maxElement(final int maxE, final AvlNode t) {
		if (t == null) {
			return true;
		}
		if (maxE < t.element) {
			return false;
		}
		return maxElement(maxE, t.left) && maxElement(maxE, t.right);
	}

	boolean minElement(final int minE) {
		return minElement(minE, this.root);
	}

	private boolean minElement(final int minE, final AvlNode t) {
		if (t == null) {
			return true;
		}
		if (minE > t.element) {
			return false;
		}
		return minElement(minE, t.left) && minElement(minE, t.right);
	}

	public boolean ordered() {
		return ordered(this.root, new Range());
	}

	private boolean ordered(final AvlNode t, final Range range) {
		if (t == null) {
			return true;
		}
		if (!range.inRange(t.element)) {
			return false;
		}
		boolean ret = true;
		ret = ordered(t.left, range.setUpper(t.element));
		ret = ret && ordered(t.right, range.setLower(t.element));
		return ret;
	}

	/**
	 * Print the tree contents in sorted order.
	 */
	public void printTree() {
		if (isEmpty()) {
			System.out.println("Empty tree");
		} else {
			printTree(this.root);
		}
	}

	/**
	 * Internal method to print a subtree in sorted order.
	 * 
	 * @param t
	 *            the node that roots the tree.
	 */
	private void printTree(final AvlNode t) {
		if (t != null) {
			printTree(t.left);
			System.out.println(t.element);
			printTree(t.right);
		}
	}

	/**
	 * Remove from the tree. Nothing is done if x is not found.
	 * 
	 * @param x
	 *            the item to remove.
	 */
	public void remove(final int x) {
		// System.out.println( "Sorry, remove unimplemented" );
	}

	public boolean wellFormed() {
		return wellFormed(this.root);
	}

	private boolean wellFormed(final AvlNode an) {
		if (an == null) {
			return true;
		}
		if (AvlTree.height(an) != Math.max(AvlTree.height(an.left), AvlTree.height(an.right)) + 1) {
			return false;
		}
		return wellFormed(an.left) && wellFormed(an.right);
	}
}
