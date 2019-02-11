package org.jointheleague.syntaxhunter.cci.chapter4;

public class BinarySearchTree<T extends Comparable<T>> {

	private Node<T> root;

	public boolean add(T value) {
		if(root == null) {
			root = new Node<T>(value);
			return true;
		}
		
		Node<T> previous;
		Node<T> inTree = root;
		int compare;
		
		do {
			compare = inTree.getValue().compareTo(value);
			if(compare < 0) {
				previous = inTree;
				inTree = inTree.getRightNode();
			} else if (compare > 0) {
				previous = inTree;
				inTree = inTree.getLeftNode();
			} else {
				return false;
			}
		} while(inTree != null);
		
		if (compare < 0) {
			previous.setRightNode(new Node<T>(value));
		} else {
			previous.setLeftNode(new Node<T>(value));
		}
		return true;
	}
	
	public Node<T> search(T value) {
		if (root == null) return null;
		
		Node<T> current = root;
		while(current != null) {
			int compare = current.getValue().compareTo(value);
			if (compare == 0) {
				return current;
			} else if (compare < 0) {
				current = current.getRightNode();
			} else {
				current = current.getLeftNode();
			}
		}
		return null;
	}
	
	public boolean remove(T value) {
		Node<T> toRemove = search(value);
		return remove(toRemove);
	}
	
	private boolean remove(Node<T> toRemove) {
		Node<T> replacement = toRemove;
		if (replacement == null) return false;
		if (replacement.getLeftNode() != null) {
			replacement = replacement.getLeftNode();
			while(replacement.getRightNode() != null) {
				replacement = replacement.getRightNode();
			}
			toRemove.setValue(replacement.getValue());
			return remove(replacement);
		} else if (replacement.getRightNode() != null) {
			replacement = replacement.getRightNode();
			while(replacement.getLeftNode() != null) {
				replacement = replacement.getLeftNode();
			}
			toRemove.setValue(replacement.getValue());
			return remove(replacement);
		} else {
			return true;
			// Need to remove last element by knowing parent
		} 
	}
	
	
}
