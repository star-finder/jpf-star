package gov.nasa.jpf.star.examples;

import ganttproject.DependencyGraph;
import gov.nasa.jpf.star.examples.aatree.AATree;
import gov.nasa.jpf.star.examples.avl.AvlTree;
import gov.nasa.jpf.star.examples.bst.BinarySearchTree;
import gov.nasa.jpf.star.examples.doublelinkedlist.DoubleLinkedList;
import gov.nasa.jpf.star.examples.linkedlist.MyLinkedList;
import gov.nasa.jpf.star.examples.rbt.TreeMap;
import gov.nasa.jpf.star.examples.stack.StackLi;
import gov.nasa.jpf.star.examples.tll.Tll;

public class Utilities {
	
	public static boolean repOK(Object obj) {
		if (obj instanceof MyLinkedList) {
			MyLinkedList sll = (MyLinkedList) obj;
			return sll.repOK();
		} else if (obj instanceof DoubleLinkedList) {
			DoubleLinkedList dll = (DoubleLinkedList) obj;
			return dll.repOK();
		} else if (obj instanceof StackLi) { 
			StackLi stack = (StackLi) obj;
			return stack.isAcyclic();
		} else if (obj instanceof BinarySearchTree) {
			BinarySearchTree bst = (BinarySearchTree) obj;
			return bst.repOK(bst.root);
		} else if (obj instanceof AvlTree) {
			AvlTree avl = (AvlTree) obj;
			return avl.ordered() && avl.balanced() && avl.wellFormed();
		} else if (obj instanceof TreeMap) {
			TreeMap rbt = (TreeMap) obj;
			if (rbt.root == null) return true;
			return rbt.root.consistency();
		} else if (obj instanceof AATree) {
			AATree aat = (AATree) obj;
			return aat.wellFormed();
		} else if (obj instanceof Tll) {
			Tll tll = (Tll) obj;
			return tll.repOK();
		} else if (obj instanceof DependencyGraph) {
			DependencyGraph graph = (DependencyGraph) obj;
			return graph.repOK();
		} else {
			return true;
		}
	}

}
