package org.jointheleague.syntaxhunter.cci.chapter3;

public class Stack<T> {
	
	Node<T> top;
	
	public T pop() {
		if(top == null) return null;
		T value = top.getValue();
		top = top.getNext();
		return value;
	}
	
	public void push(T item) {
		top = new Node<>(item, top);
	}
	
	public T peek() {
		if(top == null) return null;
		return top.getValue();
	}
	
	public boolean isEmpty() {
		return top == null;
	}
}
