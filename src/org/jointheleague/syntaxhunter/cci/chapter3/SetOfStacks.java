package org.jointheleague.syntaxhunter.cci.chapter3;

public class SetOfStacks<T> {
	
	private int maxHeight;
	private Stack<Stack<T>> setOfStacks = new Stack<>();
	
	public SetOfStacks() {
		this(3);
	}
	
	public SetOfStacks(int maxHeight) {
		this.maxHeight = maxHeight;
	}
	
	public T pop() {
		if(setOfStacks.isEmpty()) return null;
		Stack<T> stack = setOfStacks.peek();
		T item = stack.pop();
		if(stack.isEmpty()) setOfStacks.pop();
		return item;
	}
	
	public void push(T item) {
		if(setOfStacks.isEmpty() || setOfStacks.peek().height() == maxHeight)
			setOfStacks.push(new Stack<T>());
		setOfStacks.peek().push(item);
	}
	
	public T peek() {
		if(setOfStacks.isEmpty()) return null;
		return setOfStacks.peek().peek();
	}
	
	public boolean isEmpty() {
		return setOfStacks.isEmpty();
	}
	
	public int height() {
		return setOfStacks.height();
	}
	
}
