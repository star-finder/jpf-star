package gov.nasa.jpf.star.examples.tll;

import java.util.ArrayList;
import java.util.List;

public class Tll {
	
	public Node root;
	
	public boolean checkShape(Node parent, Node curr, List<Node> leaves) {
		if (parent == null || curr.parent == parent) {
			if (curr.right == null) {
				leaves.add(curr);
				return true;
			}
			else if (curr.left == null)
				return false;
			else
				return checkShape(curr, curr.left, leaves) && checkShape(curr, curr.right, leaves);
		}
		
		return false;
	}
	
	public boolean repOK() {
		if (root == null) return false;
		
		List<Node> leaves = new ArrayList<Node>();
		if (!checkShape(null, root, leaves)) return false;
		
		Node ll = leaves.get(0);
		
		for (int i = 1; i < leaves.size(); i++) {
			Node l = leaves.get(i);
			if (ll.next != l) return false;
			
			ll = l;
		}
		
		return true;
	}

	int positiveLeafCount() {
		int count = 0;

		Node ll = root;

		while (ll.right != null) {
			ll = ll.left;
		}

		Node lr = root;

		while (lr.right != null) {
			lr = lr.right;
		}

		while (ll != lr) {
			if (ll.val > 0)
				count++;
			ll = ll.next;
		}

		return count;
	}

}
