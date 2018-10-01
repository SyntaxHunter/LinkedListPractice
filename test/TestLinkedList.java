import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestLinkedList {

	@Test
	void testInit() {
		LinkedList<Integer> list = LinkedList.init();
		assertNotNull(list);
	}

	@Test
	void testApppend() {
		LinkedList<Integer> list = LinkedList.init();
		assertNull(list.getFirst());
		
		int value = 3;
		list.append(value);
		assertNotNull(list.getFirst());
		assertEquals(Integer.valueOf(value), list.getFirst().getValue());
		
		int value2 = 6;
		list.append(2);
		list.append(value2);
		Node<Integer> lastNode = list.getFirst().getNext().getNext();
		assertNotNull(lastNode);
		assertEquals(Integer.valueOf(value2), lastNode.getValue());
	}
	
}