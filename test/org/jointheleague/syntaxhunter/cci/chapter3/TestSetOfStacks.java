package org.jointheleague.syntaxhunter.cci.chapter3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSetOfStacks {

	@Test
	void testSetofStacks() {
		SetOfStacks<Integer> stacks1 = new SetOfStacks<>();
		SetOfStacks<Integer> stacks2 = new SetOfStacks<>(3);
		assertNotNull(stacks1);
		assertNotNull(stacks2);
	}
	
	@Test
	void testPushPopAndPeek() {
		SetOfStacks<Integer> stacks = new SetOfStacks<>();
		assertNull(stacks.peek());
		assertNull(stacks.pop());
		stacks.push(Integer.valueOf(11));
		stacks.push(Integer.valueOf(12));
		stacks.push(Integer.valueOf(13));
		stacks.push(Integer.valueOf(21));
		assertEquals(2, stacks.height());
		assertEquals(Integer.valueOf(21), stacks.peek());
		assertEquals(Integer.valueOf(21), stacks.pop());
		assertEquals(Integer.valueOf(13), stacks.peek());
		assertEquals(Integer.valueOf(13), stacks.pop());
		stacks.pop();
		stacks.pop();
		assertNull(stacks.peek());
		assertNull(stacks.pop());
	}
	
	@Test
	void testIsEmpty() {
		SetOfStacks<Integer> stacks = new SetOfStacks<>();
		assertTrue(stacks.isEmpty());
		stacks.push(1);
		assertFalse(stacks.isEmpty());
	}

}
