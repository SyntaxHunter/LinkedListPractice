package org.jointheleague.syntaxhunter.cci.chapter4;

public class Node<T extends Comparable<T>> {
	
	private T value;
	private Node<T> right;
	private Node<T> left;
	
	public Node(T value){
		this.value = value;
	}
	
	public void setRightNode(Node<T> right) {
		this.right = right;
	}
	
	public Node<T> getRightNode() {
		return right;
	}
	
	public void setLeftNode(Node<T> left) {
		this.left = left;
	}
	
	public Node<T> getLeftNode() {
		return left;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
	
}
