package org.jointheleague.syntaxhunter.linkedlist;
import static org.junit.jupiter.api.Assertions.*;

import org.jointheleague.syntaxhunter.linkedlist.LinkedList;
import org.jointheleague.syntaxhunter.linkedlist.Node;
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
	
	@Test
	void testPrepend() {
		LinkedList<Integer> list = LinkedList.init();
		list.prepend(1);
		assertEquals(Integer.valueOf(1), list.getFirst().getValue());
		assertEquals(Integer.valueOf(1), list.getLast().getValue());
		
		list.prepend(0);
		assertEquals(Integer.valueOf(0), list.getFirst().getValue());
		assertEquals(Integer.valueOf(1), list.getFirst().getNext().getValue());
	}
	
	@Test
	void testRemoveFirst() {
		LinkedList<Integer> list = LinkedList.init();
		list.removeFirst();
		
		list.append(-1);
		list.append(0);
		list.removeFirst();
		assertEquals(Integer.valueOf(0), list.getFirst().getValue());
	}
	
	@Test
	void testRemoveLast() {		
		LinkedList<Integer> list = LinkedList.init();
		list.removeLast();
		
		list.append(0);
		list.append(1);
		list.append(2);
		assertEquals(Integer.valueOf(2), list.removeLast());
		assertEquals(Integer.valueOf(1), list.getLast().getValue());
	}
	
	@Test
	void testRemove() {
		LinkedList<Integer> list = LinkedList.init();
		// Empty List
		list.remove(0);
		assertNull(list.getFirst());
		assertNull(list.getLast());
		
		// First and Last in List
		list.append(0);
		list.remove(0);
		assertNull(list.getFirst());
		assertNull(list.getLast());
		
		list.append(0);
		list.append(1);
		list.append(2);
		list.append(1);
		
		// Middle of List: 0 1 2 1, Remove 1
		list.remove(1);
		assertEquals(Integer.valueOf(0), list.getFirst().getValue());
		assertEquals(Integer.valueOf(2), list.getFirst().getNext().getValue());
		assertEquals(Integer.valueOf(1), list.getLast().getValue());
		
		list.append(0);
		
		// First in List: 0 2 1 0, Remove 0
		list.remove(0);
		assertEquals(Integer.valueOf(2), list.getFirst().getValue());
		assertEquals(Integer.valueOf(1), list.getFirst().getNext().getValue());
		assertEquals(Integer.valueOf(0), list.getLast().getValue());
		
		list.append(-1);
		
		// Last in List: 2 1 0 -1, Remove -1
		assertEquals(Integer.valueOf(2), list.getFirst().getValue());
		assertEquals(Integer.valueOf(1), list.getFirst().getNext().getValue());
		assertEquals(Integer.valueOf(0), list.getLast().getValue());
		
	}
}