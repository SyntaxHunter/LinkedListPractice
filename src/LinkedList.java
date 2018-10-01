
public class LinkedList<T> {
	
	private Node<T> first;
	
	public static <T>LinkedList<T> init() {
		return new LinkedList<T>();
	}
	
	public Node<T> getFirst(){
		return first;
	}
	
	public void append(T element) {
		if(first != null) {
			// Set last Node to point to new Node with value T
			Node<T> current = first;
			while(current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(new Node<T>(element));
		} else {
			first = new Node<T>(element);
		}
	}

}
