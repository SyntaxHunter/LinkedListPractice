package org.jointheleague.syntaxhunter.cci.chapter4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestIntHeap {

	@Test
	void testSinkIt() {
		int[] a = new int[] {1,3,4,4,5,4};
		IntHeap h = new IntHeap(a);
		h.sinkIt(6, 0);
		assertArrayEquals(new int[] {3,4,4,6,5,4}, h.getHeapArrayList());
		h.sinkIt(2, 0);
		assertArrayEquals(new int[] {2,4,4,6,5,4}, h.getHeapArrayList());
	}
	
	@Test
	void testFloatIt() {
		int[] a = new int[] {2,3,4,4,5,4};
		IntHeap h = new IntHeap(a);
		h.floatIt(1, 4);
		assertArrayEquals(new int[] {1,2,4,4,3,4}, h.getHeapArrayList());
		h.floatIt(6, 5);
		assertArrayEquals(new int[] {1,2,4,4,3,6}, h.getHeapArrayList());
	}

}
