package common;

import aatree.AATree;
import avl.AvlTree;
import bst.BinarySearchTree;
import doublelinkedlist.DoubleLinkedList;
import ganttproject.DependencyGraph;
import linkedlist.MyLinkedList;
import rbt.TreeMap;
import stack.StackLi;
import tll.Tll;

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
			return rbt.repOK();
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
			return false;
		}
	}

}
