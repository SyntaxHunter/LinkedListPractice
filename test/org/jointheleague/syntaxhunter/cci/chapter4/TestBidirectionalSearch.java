package org.jointheleague.syntaxhunter.cci.chapter4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestBidirectionalSearch {

	int[][] adjacencyMatrix = {	{0,1,0,0,0},
								{0,0,1,1,0},
								{0,0,0,1,1},
								{0,0,1,0,1},
								{0,0,0,0,0},};
	
	@Test
	void testGetPredecessorsAndSucessors() {
		BidirectionalSearch search = new BidirectionalSearch(adjacencyMatrix);
		assertArrayEquals(new int[]{0,0,1,1,0}, search.getSuccessors(1));
		assertArrayEquals(new int[]{1,0,0,0,0}, search.getPredecessors(1));
	}

	@Test
	void testFindPathBFS() {
		BidirectionalSearch search = new BidirectionalSearch(adjacencyMatrix);
		assertTrue(search.findPathBFS(0, 4));
		assertFalse(search.findPathBFS(3,1));
	}
	
}
