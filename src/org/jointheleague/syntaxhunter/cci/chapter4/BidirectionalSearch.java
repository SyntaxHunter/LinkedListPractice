package org.jointheleague.syntaxhunter.cci.chapter4;

import org.jointheleague.syntaxhunter.cci.chapter3.Queue;

public class BidirectionalSearch {

	final int[][] adjacencyMatrix;
	final int numNodes;
	Queue<Integer> search;
	
	public BidirectionalSearch(int[][] adjacencyMatrix) {
		this.adjacencyMatrix = adjacencyMatrix;
		numNodes = adjacencyMatrix.length;
	}
	
	public int[] getPredecessors(int num) {
		int[] predecessors = new int[adjacencyMatrix.length];
		for(int i = 0; i < adjacencyMatrix.length; i++) {
			predecessors[i] = adjacencyMatrix[i][num];
		}
		return predecessors;
		 
	}
	
	public int[] getSuccessors(int num) {
		return adjacencyMatrix[num];
	}
	
	public boolean findPathDFS(int s, int t) {
		boolean[] beenTo = new boolean[adjacencyMatrix.length];
		search = new Queue<>();
		return findPathDFS(s, t, beenTo);
	}
	
	private boolean findPathDFS(int s, int t, boolean[] beenTo) {
		int[] successors = getSuccessors(s);
		for(int i = 0; i < adjacencyMatrix.length; i++) {
			if (successors[i] == t) return true;
			else if (successors[i] == 1 && !beenTo[i]) {
				search.push(i);
				beenTo[i] = true;
			}
		}
		while (!search.isEmpty()) {
			boolean found = findPathDFS(s, t, beenTo);
			if (found) return found;
		}
		return false;
	}
	
}
