package gov.nasa.jpf.star.examples;

import gov.nasa.jpf.star.examples.aatree.AATree;
import gov.nasa.jpf.star.examples.avl.AvlTree;
import gov.nasa.jpf.star.examples.bst.BinarySearchTree;
import gov.nasa.jpf.star.examples.doublelinkedlist.DoubleLinkedList;
import gov.nasa.jpf.star.examples.rbt.TreeMap;

public class Utilities {
	
	public static boolean repOK(Object obj) {
		if (obj instanceof DoubleLinkedList) {
			DoubleLinkedList dll = (DoubleLinkedList) obj;
			return dll.repOK();
		} if (obj instanceof BinarySearchTree) {
			BinarySearchTree bst = (BinarySearchTree) obj;
			return bst.repOK(bst.root);
		} else if (obj instanceof AvlTree) {
			AvlTree avl = (AvlTree) obj;
			return avl.balanced() && avl.ordered() && avl.wellFormed();
		} else if (obj instanceof TreeMap) {
			TreeMap rbt = (TreeMap) obj;
			if (rbt.root == null) return true;
			return rbt.root.consistency();
		} else if (obj instanceof AATree) {
			AATree aat = (AATree) obj;
			return aat.wellFormed();
		} else {
			return true;
		}
	}

}
