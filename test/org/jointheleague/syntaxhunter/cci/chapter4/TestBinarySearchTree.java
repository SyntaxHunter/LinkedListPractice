package org.jointheleague.syntaxhunter.cci.chapter4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestBinarySearchTree {

	@Test
	void testAdd() {
		BinarySearchTree<Integer> tree = new BinarySearchTree<>();
		assertTrue(tree.add(3));
		tree.add(5);
		tree.add(1);
		tree.add(2);
		assertFalse(tree.add(3));
		assertFalse(tree.add(2));
	}
	
	@Test
	void testSearch() {
		BinarySearchTree<Integer> tree = new BinarySearchTree<>();
		tree.add(20);
		tree.add(24);
		tree.add(12);
		tree.add(8);
		tree.add(14);
		tree.add(16);
		tree.add(15);
		assertEquals(Integer.valueOf(12), tree.search(12).getValue());
		assertEquals(Integer.valueOf(24), tree.search(24).getValue());
		assertEquals(Integer.valueOf(15), tree.search(15).getValue());
		assertNull(tree.search(3));
	}
	
	@Test
	void testRemove() {
		BinarySearchTree<Integer> tree = new BinarySearchTree<>();
		tree.add(20);
		tree.add(24);
		tree.add(12);
		tree.add(8);
		tree.add(16);
		tree.add(17);
		tree.add(13);
		tree.add(14);
		tree.add(15);
		assertTrue(tree.remove(16));
		assertNull(tree.search(16));
	}

}
