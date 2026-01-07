package Arrays;

import java.util.Arrays;

public class LC_189_rotate_array {
	
	 // ========================================================================
    // LeetCode 189: Rotate Array
    // ========================================================================
    /**
     * Problem Statement:
     * Given an integer array nums, rotate the array to the right by k steps, 
     * where k is non-negative.
     * 
     * Example 1:
     * Input: nums = [1,2,3,4,5,6,7], k = 3
     * Output: [5,6,7,1,2,3,4]
     * Explanation:
     * rotate 1 steps: [7,1,2,3,4,5,6]
     * rotate 2 steps: [6,7,1,2,3,4,5]
     * rotate 3 steps: [5,6,7,1,2,3,4]
     * 
     * Example 2:
     * Input: nums = [-1,-100,3,99], k = 2
     * Output: [3,99,-1,-100]
     * 
     * Constraints:
     * - 1 <= nums.length <= 10^5
     * - -2^31 <= nums[i] <= 2^31 - 1
     * - 0 <= k <= 10^5
     * 
     * Follow up: Try to come up with as many solutions as possible. 
     * Could you do it in-place with O(1) extra space?
     * 
     * Approach 1: Using Extra Array (Simple but O(n) space)
     * Approach 2: Cyclic Replacements (i + k) % nums.length
     * 
     * OPTIMAL: Reverse Method
     * Algorithm:
     * 1. Reverse entire array
     * 2. Reverse first k elements
     * 3. Reverse remaining elements
     * 
     * Visualization for k=3:
     * Original:  [1,2,3,4,5,6,7]
     * Reverse:   [7,6,5,4,3,2,1]
     * Reverse first k: [5,6,7,4,3,2,1]
     * Reverse rest:    [5,6,7,1,2,3,4] ✓
     * 
     * Why it works: Reversing puts last k at front, then we fix order!
     * 
     * Time Complexity: O(n) - three passes
     * Space Complexity: O(1) - in-place
     */
	
	public static void main(String[] args) {
		
		int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		
//		System.out.println(Arrays.toString(rotateN(nums, k)));
		
		rotate(nums, k);
		System.out.println(Arrays.toString(nums));
		
	}
	
	
	private static void rotate(int[] nums, int k) {

		if (k == nums.length || nums.length == 0) {
			return;
		}
		
		k = k % nums.length;

		rotateHelper(nums, 0, nums.length - 1);
		rotateHelper(nums, 0, k - 1);
		rotateHelper(nums, k, nums.length - 1);

	}

	private static void rotateHelper(int[] nums, int start, int end) {

		while (start < end) {

			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;

			start++;
			end--;
		}

	}
	
	
	// O(n) space
	private static int[] rotateN(int[] nums, int k) {
		
		if(k == nums.length) {
			return nums;
		}
		
		k = k % nums.length;

		int[] result = new int[nums.length];

//		int index = 0;
//		for (int i = k + 1; i < nums.length; i++) {
//			result[index++] = nums[i];
//		}
//
//		for (int i = 0; i <= k; i++) {
//			result[index++] = nums[i];
//		}
		
		for (int i = 0; i < nums.length; i++) {
            result[(i + k) % nums.length] = nums[i];
        }

		return result;
	}
	

}

// Output : 
// [5, 6, 7, 1, 2, 3, 4]
