package org.jointheleague.syntaxhunter.cci.chapter3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestStack {

	@Test
	void testStack() {
		Stack<Integer> s1 = new Stack<>();
		assertNotNull(s1);
	}
	
	@Test
	void testStackPushPopAndPeek() {
		Stack<Integer> s1 = new Stack<>();
		assertNull(s1.pop());
		assertNull(s1.peek());
		s1.push(Integer.valueOf(3));
		s1.push(Integer.valueOf(5));
		assertEquals(Integer.valueOf(5), s1.peek());
		assertEquals(Integer.valueOf(5), s1.pop());
		assertEquals(Integer.valueOf(3), s1.peek());
		assertEquals(Integer.valueOf(3), s1.pop());
		assertNull(s1.pop());
		assertNull(s1.peek());
	}
	
	@Test
	void testStackIsEmpty() {
		Stack<Integer> s1 = new Stack<>();
		assertTrue(s1.isEmpty());
		s1.push(3);
		assertFalse(s1.isEmpty());
	}

}
