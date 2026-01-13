package Arrays;

import java.util.Arrays;

public class LC_73_set_matrix_zeroes {
	
	// ========================================================================
    // LeetCode 73: Set Matrix Zeroes
    // ========================================================================
    /**
     * Problem Statement:
     * Given an m x n integer matrix, if an element is 0, set its entire row 
     * and column to 0's. You must do it in place.
     * 
     * Example 1:
     * Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
     * Output: [[1,0,1],[0,0,0],[1,0,1]]
     * 
     * Example 2:
     * Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
     * Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
     * 
     * Follow-up:
     * - A straightforward solution using O(mn) space is probably bad.
     * - Could you devise an O(m + n) solution?
     * - Could you devise an O(1) solution?
     * 
     * Approach : O(1) space - Use first row/col as markers (OPTIMAL)
     * 
     * Optimal Approach:
     * 1. Use first row and first column as markers
     * 2. Use separate variables for first row and first column
     * 3. Mark zeros
     * 4. Set zeros based on markers
     * 5. Handle first row and column
     * 
     * Time Complexity: O(m × n)
     * Space Complexity: O(1)
     */
	
	public static void main(String[] args) {
		
//		int matrix[][] = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
		int matrix[][] = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
		setMatrixZeroes(matrix);
	}
	
	private static void setMatrixZeroes(int[][] matrix) {

		int n = matrix.length;
		int m = matrix[0].length;
		
		boolean firstRowZero = false;
		boolean firstColZero = false;
		
		for (int i = 0; i < m; i++) {
			if (matrix[0][i] == 0) {
				firstRowZero = true;
				break;
			}
		}
		
		for (int i = 0; i < n; i++) {
			if(matrix[i][0] == 0) {
				firstColZero = true;
				break;
			}
		}
		
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < m; j++) {
				if (matrix[i][j] == 0) {
					matrix[0][j] = 0;
					matrix[i][0] = 0;
				}
			}
		}
		
		//setting zeroes
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < m; j++) {
				if (matrix[i][0] == 0 || matrix[0][j] == 0) {
					matrix[i][j] = 0;
				}
			}
		}
		
		if (firstRowZero) {
			for (int i = 0; i < m; i++) {
				matrix[0][i] = 0;
			}
		}
		
		if(firstColZero) {
			for (int i = 0; i < n; i++) {
				matrix[i][0] = 0;
			}
		}
		
		System.out.println(Arrays.deepToString(matrix));
	}

}
