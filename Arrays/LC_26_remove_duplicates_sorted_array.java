package Arrays;

public class LC_26_remove_duplicates_sorted_array {
	
	// ========================================================================
	// LeetCode 26: Remove Duplicates from Sorted Array
	// ========================================================================
	/**
     * Problem Statement:
     * Given an integer array nums sorted in non-decreasing order, remove the 
     * duplicates in-place such that each unique element appears only once. 
     * The relative order of the elements should be kept the same. Then return 
     * the number of unique elements in nums.
     * 
     * Consider the number of unique elements of nums to be k, to get accepted, 
     * you need to do the following:
     * - Change the array nums such that the first k elements contain the unique 
     *   elements in the order they were present initially.
     * - The remaining elements are not important as well as the size of nums.
     * - Return k.
     * 
     * Example 1:
     * Input: nums = [1,1,2]
     * Output: 2, nums = [1,2,_]
     * Explanation: Function should return k = 2, with first two elements being 1 and 2.
     * 
     * Example 2:
     * Input: nums = [0,0,1,1,1,2,2,3,3,4]
     * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
     * 
     * Constraints:
     * - 1 <= nums.length <= 3 * 10^4
     * - -100 <= nums[i] <= 100
     * - nums is sorted in non-decreasing order
     *
     * Approach:
     * Two-Pointer Technique (Slow-Fast):
     * - 'uniqueIndex' pointer: tracks position for next unique element
     * - 'i' pointer: scans through array to find unique elements
     * 
     * Visualization:
     * [0,0,1,1,1,2,2,3,3,4]
     *    ui                    nums[uniqueIndex] == nums[i], move i
     *    u   i                 nums[uniqueIndex] == nums[i], move i
     *    u     i               nums[uniqueIndex] != nums[i], uniqueIndex++, copy nums[i] to nums[uniqueIndex]
     * [0,1,1,1,1,2,2,3,3,4]
     *    u     i               nums[uniqueIndex] == nums[i], move i
     *    u       i             nums[uniqueIndex] != nums[i], uniqueIndex++, copy
     * [0,1,2,1,1,2,2,3,3,4]
     *      u       i        Continue...
     * 
     * Key Insight: Since array is SORTED, duplicates are adjacent!
     * 
     * Time Complexity: O(n) - single pass through array
     * Space Complexity: O(1) - only using two pointers, in-place modification
     */
	public static void main(String[] args) {

		// int[] nums = { 1, 1, 2 };
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		System.out.println(removeDuplicates(nums));
	}

	private static int removeDuplicates(int[] nums) {
		
		if(nums == null || nums.length == 0) {
			return 0;
		}

		int uniqueIndex = 1;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1]) {
				nums[uniqueIndex++] = nums[i];
			}
		}

		return uniqueIndex;
	}

}

// Output : 
// 5

