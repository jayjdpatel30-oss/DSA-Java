package Arrays;

import java.util.Arrays;

public class LC_48_rotate_image {
	
	// ========================================================================
    // LeetCode 48: Rotate Image
    // ========================================================================
    /**
     * Problem Statement:
     * You are given an n x n 2D matrix representing an image, rotate the image 
     * by 90 degrees (clockwise).
     * You have to rotate the image in-place, which means you have to modify 
     * the input 2D matrix directly. DO NOT allocate another 2D matrix.
     * 
     * Example:
     * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
     * Output: [[7,4,1],[8,5,2],[9,6,3]]
     * 
     * Visualization:
     * [1,2,3]    [7,4,1]
     * [4,5,6] -> [8,5,2]
     * [7,8,9]    [9,6,3]
     *
     * Approach:
     * Two-step transformation:
     * 1. Transpose the matrix (swap across diagonal)
     * 2. Reverse each row
     * 
     * Why it works:
     * Transpose:        Reverse rows:
     * [1,4,7]           [7,4,1]
     * [2,5,8]    ->     [8,5,2]
     * [3,6,9]           [9,6,3]
     * 
     * Time Complexity: O(n²) - visit each element
     * Space Complexity: O(1) - in-place
     */
	
	public static void main(String[] args) {
		
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(Arrays.deepToString(rotate(matrix)));
	}
	
	private static int[][] rotate(int[][] matrix){
		
		int[][] result = new int[matrix.length][matrix[0].length];
		
		// row to column
		for(int i = 0; i < matrix.length; i++) {	
			for(int j = 0; j < matrix.length; j++) {
				result[i][j] = matrix[j][i];
			}
		}
		
//		 swap elements
		for(int i = 0; i < result.length; i++) {	
			for(int j = 0; j < result.length/2; j++) {
				
				int temp = result[i][j];
				result[i][j] = result[i][result.length - 1 - i];
				result[i][result.length - 1 - i] = temp;
			}
		}
		
		return result;
	}

}

// Output :
// [[7, 4, 1], [5, 2, 8], [3, 6, 9]]
