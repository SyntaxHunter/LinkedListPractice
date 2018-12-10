package org.jointheleague.syntaxhunter.cci.chapter1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMatrixRevolver {

	int[][] matrix1 = {{1,	2,	3,	4},
	                   {5,	6,	7,	8},
	                   {9,	10,	11,	12},
	                   {13,	14,	15,	16}};
	
	int[][] matrix1Rotated = {	{13,	9,	5,	1},
								{14,	10,	6,	2},
								{15,	11,	7,	3},
								{16,	12,	8,	4}	};
	
	int[][] matrix2 = {	{1,	2,	3,	4,	5},
						{6,	7,	8,	9,	10},
						{11,	12,	13,	14,	15},
						{16,	17,	18,	19,	20},
						{21,22,	23,	24,	25},	};
	
	int[][] matrix2Rotated = {	{21,	16,	11,	6,	1},
								{22,	17,	12,	7,	2},
								{23,	18,	13,	8,	3},
								{24,	19,	14,	9,	4},
								{25,	20,	15,	10,	5},	};
	
	@Test
	void testRotate1New() {
		MatrixRevolver revolver = new MatrixRevolver();
		int[][] rotated = revolver.rotateNew(matrix1);
		
		assertEquals(matrix1Rotated.length, rotated.length);
		for(int i = 0; i < matrix1Rotated.length; i++) {
			assertArrayEquals(matrix1Rotated[i], rotated[i]);
		}
	}
	
	@Test
	void testRotate2New() {
		MatrixRevolver revolver = new MatrixRevolver();
		int[][] rotated = revolver.rotateNew(matrix2);
		
		assertEquals(matrix2Rotated.length, rotated.length);
		for(int i = 0; i < matrix2Rotated.length; i++) {
			assertArrayEquals(matrix2Rotated[i], rotated[i]);
		}
	}
	
	@Test
	void testRotate1Same() {
		MatrixRevolver revolver = new MatrixRevolver();
		int[][] rotated = matrix1.clone();
		revolver.rotateSame(rotated);
		
		assertEquals(matrix1Rotated.length, rotated.length);
		for(int i = 0; i < matrix1Rotated.length; i++) {
			assertArrayEquals(matrix1Rotated[i], rotated[i]);
		}
	}
	
	@Test
	void testRotate2Same() {
		MatrixRevolver revolver = new MatrixRevolver();
		int[][] rotated = matrix2.clone();
		revolver.rotateSame(rotated);
		
		assertEquals(matrix2Rotated.length, rotated.length);
		for(int i = 0; i < matrix2Rotated.length; i++) {
			assertArrayEquals(matrix2Rotated[i], rotated[i]);
		}
	}

}
