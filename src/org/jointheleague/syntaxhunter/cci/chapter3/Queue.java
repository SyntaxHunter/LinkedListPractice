package org.jointheleague.syntaxhunter.cci.chapter3;

public class Queue<T> {

	Node<T> head;
	Node<T> tail;
	
	public T pop() {
		if(isEmpty()) return null;
		if(head == null) revert();
		T value = head.getValue();
		head = head.getNext();
		return value;
	}
	
	private void revert() {
		while(tail != null) {
			head = new Node<>(tail.getValue(), head);
			tail = tail.getNext();
		}
	}
	
	public void push(T item) {
		tail = new Node<>(item, tail);
	}
	
	public boolean isEmpty() {
		return tail == null && head == null;
	}
	
}
