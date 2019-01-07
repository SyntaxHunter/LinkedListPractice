package org.jointheleague.syntaxhunter.cci.chapter3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestQueue {

	@Test
	void testQueue() {
		Queue<Integer> q1 = new Queue<>();
		assertNotNull(q1);
	}
	
	@Test
	void testPopAndPush() {
		Queue<Integer> q1 = new Queue<>();
		assertNull(q1.pop());
		q1.push(Integer.valueOf(3));
		q1.push(Integer.valueOf(5));
		assertEquals(Integer.valueOf(3), q1.pop());
		q1.push(Integer.valueOf(1));
		assertEquals(Integer.valueOf(5), q1.pop());
		assertEquals(Integer.valueOf(1), q1.pop());
		assertNull(q1.pop());
	}
	
	@Test
	void testIsEmpty() {
		Queue<Integer> q1 = new Queue<>();
		assertTrue(q1.isEmpty());
		q1.push(Integer.valueOf(3));
		assertFalse(q1.isEmpty());
		q1.pop();
		assertTrue(q1.isEmpty());
	}

}
