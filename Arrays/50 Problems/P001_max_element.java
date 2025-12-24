package Problems;

public class P001_max_element {

	// ========================================================================
	// PROBLEM 1: Find Maximum Element in Array
	// ========================================================================
	/**
	 * Given an integer array, find and return the maximum element present in the
	 * array. If the array is empty, return 0. Example: Input : [45, 18, 7, 30]
	 * Output : 45
	 *
	 * Approach: 
	 * 1. Initialize a variable `max` to store the maximum value. 
	 * 2. Traverse through each element of the array. 
	 * 3. Compare the current element with `max`. 
	 * 4. If the current element is greater, update `max`. 
	 * 5. After completing the traversal, return `max`.
	 *
	 * Time Complexity: O(n) — where n is the number of elements in the array. The
	 * array is traversed once.
	 *
	 * Space Complexity: O(1) — constant extra space is used.
	 */

	public static void main(String[] args) {

		int[] numbers = { 45, 18, 7, 30 };
		System.out.println("Maximum Element in Array : " + max(numbers));

	}

	private static int max(int[] numbers) {

		int max = 0;

		if (numbers.length < 1) {
			return max;
		}

//		for (int num : numbers) {
//			max = Math.max(num, max);
//		}

		for (int val : numbers) {
			if (val > max) {
				max = val;
			}
		}
		
		return max;
	}

}
