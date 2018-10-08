package org.jointheleague.syntaxhunter.linkedlist;

public class Node<T> {
	
	private final T value;
	private Node<T> previous;
	private Node<T> next;
	
	public Node(T value) {
		this.value = value;
	}
	
	public void setPrevious(Node<T> previous) {
		this.previous = previous;
	}
	
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public Node<T> getPrevious(){
		return previous;
	}
	
	public Node<T> getNext(){
		return next;
	}
	
	public T getValue(){
		return value;
	}
	
}
