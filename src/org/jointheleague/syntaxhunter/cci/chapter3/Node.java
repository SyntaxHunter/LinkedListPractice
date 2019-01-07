package org.jointheleague.syntaxhunter.cci.chapter3;

public class Node<T> {

	private final T value;
	private Node<T> next;
	
	public Node(T value, Node<T> next) {
		this.value = value;
		this.next = next;
	}
	
	public Node<T> getNext(){
		return next;
	}
	
	public T getValue() {
		return value;
	}
	
}
