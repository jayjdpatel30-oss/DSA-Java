package BinarySearch;

public class SearchInRotatedMatrixII {

	// ============================================================================
	// PROBLEM 4: LeetCode 81 - Search in Rotated Sorted Array II
	// ============================================================================

	/**
	 * PROBLEM STATEMENT: Same as Problem 33, but the array may contain duplicates.
	 * Return true if target exists, false otherwise.
	 * 
	 * Example: Input: nums = [2,5,6,0,0,1,2], target = 0 Output: true
	 * 
	 * APPROACH: - Similar to Problem 33, but handle duplicates - When nums[left] ==
	 * nums[mid] == nums[right], we can't determine which half is sorted - In this
	 * case, increment left and decrement right to skip duplicates - This may
	 * degrade to O(n) in worst case with all duplicates
	 * 
	 * TIME COMPLEXITY: O(log n) average case, O(n) worst case with duplicates SPACE
	 * COMPLEXITY: O(1) - constant extra space
	 */

	public static void main(String[] args) {

		int nums[] = new int[] { 2, 5, 6, 0, 0, 1, 2 };
		int target = 0;
		System.out.println(target + " exists in matrix : " + search(nums, target));

	}

	public static boolean search(int[] nums, int target) {
		if (nums == null || nums.length == 0)
			return false;

		int left = 0, right = nums.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (nums[mid] == target) {
				return true;
			}

			// Handle duplicates - can't determine which side is sorted
			if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
				left++;
				right--;
				continue;
			}

			// Check which half is sorted
			if (nums[left] <= nums[mid]) {
				// Left half is sorted
				if (target >= nums[left] && target < nums[mid]) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			} else {
				// Right half is sorted
				if (target > nums[mid] && target <= nums[right]) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			}
		}

		return false;
	}

}
