package BinarySearch;

public class SearchIn2DMatrix {

	/**
	 * PROBLEM STATEMENT: You are given an m x n integer matrix with the following
	 * properties: - Each row is sorted in non-decreasing order - The first integer
	 * of each row is greater than the last integer of previous row Write an
	 * efficient algorithm that searches for a value target in the matrix.
	 * 
	 * Example: Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
	 * Output: true
	 * 
	 * APPROACH: - Treat the 2D matrix as a 1D sorted array - Use binary search with
	 * index conversion: row = mid / cols, col = mid % cols - This works because
	 * matrix is sorted both row-wise and column-wise
	 * 
	 * TIME COMPLEXITY: O(log(m*n)) - binary search on m*n elements SPACE
	 * COMPLEXITY: O(1) - constant extra space
	 */

	public static void main(String[] args) {

		int nums[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		int target = 3;
		System.out.println(target + " exists in matrix : " + searchMatrix(nums, target));

	}

	public static boolean searchMatrix(int[][] matrix, int target) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return false;
		}

		int rows = matrix.length;
		int cols = matrix[0].length;
		int left = 0;
		int right = rows * cols - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			// Convert 1D index to 2D coordinates
			int midValue = matrix[mid / cols][mid % cols];

			if (midValue == target) {
				return true;
			} else if (midValue < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return false;
	}

}
