package org.jointheleague.syntaxhunter.linkedlist;

public class LinkedList<T> {
	
	private Node<T> first;
	private Node<T> last;
	
	public static <T>LinkedList<T> init() {
		return new LinkedList<T>();
	}
	
	public Node<T> getFirst(){
		return first;
	}
	
	public Node<T> getLast(){
		return last;
	}
	
	public void append(T element) {
		if(first != null) {
			// Set last Node to point to new Node with value T
			Node<T> next = new Node<T>(element);
			last.setNext(next);
			next.setPrevious(last);
			last = next;
		} else {
			first = new Node<T>(element);
			last = first;
		}
	}
	
	public void prepend(T element) {
		if(first != null) {
			Node<T> second = first;
			first = new Node<T>(element);
			second.setPrevious(first);
			first.setNext(second);
		} else {
			first = new Node<T>(element);
			last = first;
		}
	}
	
	public void removeFirst() {
		if(first != null) {
			first = first.getNext();
			first.setPrevious(null);
		}
	}
	
	public T removeLast() {
		if(last != null) {
			if(last != first) {
				T value = last.getValue();
				last = last.getPrevious();
				last.setNext(null);
				return value;
			} else {
				T value = first.getValue();
				first = null;
				last = null;
				return value;
			}
		} else {
			return null;
		}
	}
	
	public boolean remove(T value) {
		boolean removed = false;
		if(first != null) {
			Node<T> current = first;
			while(!removed) {
				if(current.getValue() == value) {
					Node<T> previous = current.getPrevious();
					Node<T> next = current.getNext();
					
					if(previous == null && next == null) {
						first = null;
						last = null;
					} else if(previous == null) {
						first = next;
						next.setPrevious(null);
					} else if(next == null) {
						last = previous;
						previous.setNext(null);
					} else {
						previous.setNext(next);
						next.setPrevious(previous);
					}
					removed = true;
				} else {
					if(current.getNext() != null) {
						current = current.getNext();
					} else {
						continue;
					}
				}
			}
		}
		return removed;
	}

}
