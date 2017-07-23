package gov.nasa.jpf.star.examples;

import gov.nasa.jpf.star.examples.bst.BinarySearchTree;

public class Utilities {
	
	public static boolean repOK(Object obj) {
		if (obj instanceof BinarySearchTree) {
			BinarySearchTree bst = (BinarySearchTree) obj;
			return bst.repOK(bst.root);
		} else {
			return true;
		}
	}

}
