package star.examples;

import ganttproject.DependencyGraph;
import star.examples.aatree.AATree;
import star.examples.avl.AvlTree;
import star.examples.bst.BinarySearchTree;
import star.examples.doublelinkedlist.DoubleLinkedList;
import star.examples.linkedlist.MyLinkedList;
import star.examples.rbt.TreeMap;
import star.examples.stack.StackLi;
import star.examples.tll.Tll;

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
