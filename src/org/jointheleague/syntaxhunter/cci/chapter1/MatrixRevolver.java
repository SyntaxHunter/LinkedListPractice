package org.jointheleague.syntaxhunter.cci.chapter1;

public class MatrixRevolver {

	public int[][] rotateNew(int[][] matrix){
		if(matrix == null) return null;
		int height = matrix.length;
		if(height == 0) return null;
		
		int[][] rotated = new int[height][height];
		for(int i = 0; i < height; i++) {
			if(matrix[i].length != height) return null;
			for(int j = 0; j < height; j++) {
				rotated[j][height - i - 1] = matrix[i][j];
			}
		}
		return rotated;
	}

	public void rotateSame(int[][] matrix) {
		if(matrix == null) return;
		int height = matrix.length;
		if(height == 0) return;
		
		for(int i = 0; i < height / 2; i++) {
			for(int j = 0; j < (height + 1) / 2; j++) {
				int start = matrix[i][j];
				matrix[i][j] = matrix[height - 1 - j][i];
				matrix[height - 1 - j][i] = matrix[height - 1 - i][height - 1 - j];
				matrix[height - 1 - i][height - 1 - j] = matrix[j][height - 1 - i];
				matrix[j][height - 1 - i] = start;
			}
		}
		
	}
	
}
