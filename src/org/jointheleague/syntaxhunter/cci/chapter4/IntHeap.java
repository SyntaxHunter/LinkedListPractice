package org.jointheleague.syntaxhunter.cci.chapter4;

public class IntHeap {
	
	private final int[] a;
	private int last;
	
	public IntHeap(int[] a) {
		this.a = a;
		last = a.length - 1;
		heapify();
	}
	
	public int[] getHeapArrayList() {
		return a.clone();
	}
	
	public void sinkIt(int v, int i) {
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		if (left > last) {
			a[i] = v;
			return;
		}
		int next = right > last || a[left] < a[right]  ? left : right;
		if(a[next] < v) {
			a[i] = a[next];
			sinkIt(v, next);
		} else {
			a[i] = v;
		}
	}
	
	public void floatIt(int v, int i) {
		if(i == 0) {
			a[i] = v;
			return;
		}
		int parent = (i + 1) / 2 - 1;
		if(a[parent] > v) {
			a[i] = a[parent];
			floatIt(v, parent);
		} else {
			a[i] = v;
		}
	}
	
	private void heapify() {
		for(int i = last / 2 - 1; i >= 0; i--) {
			sinkIt(a[i], i);
		}
	}
	
}
