package gov.nasa.jpf.star.examples.tll2;

public class Tll {

	int positiveLeafCount(Node x) {
		int count = 0;

		Node ll = x;

		while (ll.right != null) {
			ll = ll.left;
		}

		Node lr = x;

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
	
//	int positiveLeafCount1(Node x, Node p, Node lr, Node ll) {
//		int count = 0;
//
//		while (ll != lr) {
//			if (ll.val > 0)
//				count++;
//			ll = ll.next;
//		}
//
//		return count;
//	}

}
