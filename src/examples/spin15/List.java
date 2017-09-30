package spin15;

import java.util.HashSet;
import java.util.Set;

/*
 * Example from Antonio's model counting paper at SPIN 2015,
 * which is in turn adapted from Corina's TACAS 2003 paper
 * about generalized symbolic execution and lazy initialization
 */
class List {
	
	public Node head;

	/*
	 * This repOK is from the paper, so I leave it here for reference, it is an
	 * alternative to the inductive predicate
	 */
	boolean repOk() {
		Set<Node> nodes = new HashSet<Node>();
		Node iterator = head;
		while (iterator != null) {
			// check acyclic
			if (!nodes.add(iterator))
				return false;
			// check bounds
			if (iterator.elem < 1 || iterator.elem > 10)
				return false;
			if (nodes.size() > 6)
				return false;
			iterator = iterator.next;
		}
		return true;
	}

	public static void main(String[] args) {
		List L0 = new List();
		L0.head = L0.head.swapNode();
	}
	
	/*
	public static void mainSPIN15(String[] args) {
		List L0 = new List();
		L0 = (List) Debug.makeSymbolicRef("L0", L0);
		if (L0 != null)
			assert (L0.repOk());
		L0.head = L0.head.swapNode();
	}
	// */
	
	}