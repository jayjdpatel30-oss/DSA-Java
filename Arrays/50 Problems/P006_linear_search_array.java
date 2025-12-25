package Problems;

public class P006_linear_search_array {

	// ========================================================================
	// PROBLEM 6: Linear Search in Array
	// ========================================================================
	/*
	 * Given an integer array and a target value, find the index of the target
	 * using linear search. If not found, return -1.
	 *
	 * Example:
	 * Input  : [10, 20, 30, 40], target = 30
	 * Output : 2
	 *
	 * Approach:
	 * 1. Traverse the array from start to end.
	 * 2. Compare each element with the target.
	 * 3. If match is found, return its index.
	 * 4. If traversal completes, return -1.
	 *
	 * Time Complexity:
	 * O(n)
	 *
	 * Space Complexity:
	 * O(1)
	 */
	public static void main(String[] args) {

		int numbers[] = { 10, 20, 30, 40 };
		int target = 30;

		int indexFound = linearSearch(numbers, target);

		System.out.println(target + ((indexFound == -1) ? " not Found!" : " Found at index : " + indexFound));
	}

	private static int linearSearch(int[] nums, int target) {

		if (nums.length < 1) {
			return -1;
		}

		int index = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				return i;
			}
		}

		return -1;
	}

}
