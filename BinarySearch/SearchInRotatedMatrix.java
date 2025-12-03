package BinarySearch;

public class SearchInRotatedMatrix {

	// ============================================================================
	// PROBLEM 3: LeetCode 33 - Search in Rotated Sorted Array
	// ============================================================================

	/**
	 * PROBLEM STATEMENT: Given the array nums after rotation and an integer target,
	 * return the index of target if it is in nums, or -1 if it is not in nums. You
	 * must write an algorithm with O(log n) runtime complexity. Array has distinct
	 * values.
	 * 
	 * Example: Input: nums = [4,5,6,7,0,1,2], target = 0 Output: 4
	 * 
	 * Explanation: Array was originally [0,1,2,4,5,6,7] and rotated 4 times
	 * 
	 * APPROACH: - At least one half of the array is always sorted - Identify which
	 * half is sorted by comparing nums[left] with nums[mid] - Check if target lies
	 * in the sorted half, adjust search space accordingly - If target not in sorted
	 * half, search the other half
	 * 
	 * TIME COMPLEXITY: O(log n) - binary search SPACE COMPLEXITY: O(1) - constant
	 * extra space
	 */

	public static void main(String[] args) {

		int index = search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0);
		System.out.println(index == -1 ? "Element not found!" : "Element found at : " + index);

	}

	public static int search(int[] nums, int target) {
		if (nums == null || nums.length == 0)
			return -1;

		int left = 0, right = nums.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (nums[mid] == target) {
				return mid;
			}

			// Check which half is sorted
			if (nums[left] <= nums[mid]) {
				// Left half is sorted
				if (target >= nums[left] && target < nums[mid]) {
					// Target is in sorted left half
					right = mid - 1;
				} else {
					// Target is in right half
					left = mid + 1;
				}
			} else {
				// Right half is sorted
				if (target > nums[mid] && target <= nums[right]) {
					// Target is in sorted right half
					left = mid + 1;
				} else {
					// Target is in left half
					right = mid - 1;
				}
			}
		}

		return -1;
	}

}
