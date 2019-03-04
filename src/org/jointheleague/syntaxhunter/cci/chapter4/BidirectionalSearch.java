package org.jointheleague.syntaxhunter.cci.chapter4;

import org.jointheleague.syntaxhunter.cci.chapter3.Queue;

public class BidirectionalSearch {

	final int[][] adjacencyMatrix;
	final int numNodes;
	Queue<Integer> search;
	boolean[] reachedFromSource;
	boolean[] reachedFromTarget;
	
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
	
	public boolean findPathBFS(int s, int t) { 
		search = new Queue<>();
		reachedFromSource = new boolean[numNodes];
		reachedFromTarget = new boolean[numNodes];
		search.push(s);
		reachedFromSource[s] = true;
		search.push(t);
		reachedFromTarget[t] = true;
		return findPathBFS();
	}
	
	private boolean findPathBFS() {
		if(search.isEmpty()) return false;
		int current = search.pop();
		int[] connectedTo;
		if(reachedFromSource[current]) {
			connectedTo = getSuccessors(current);
		} else {
			connectedTo = getPredecessors(current);
		}
		for(int i = 0; i < numNodes; i++) {
			if(connectedTo[i] == 0) continue;
			if(reachedFromSource[current]) {
				if(reachedFromTarget[i]) {
					return true;
				} else if(!reachedFromSource[i]) {
					search.push(i);
					reachedFromSource[i] = true;
				}
			} else if(reachedFromTarget[current]) {
				if(reachedFromSource[i]) {
					return true;
				} else if (!reachedFromTarget[i]) {
					search.push(i);
					reachedFromTarget[i] = true;
				}
			}
		}
		return findPathBFS();
	}
	
}
