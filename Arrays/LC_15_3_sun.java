package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_15_3_sun {
	
	// ========================================================================
    // LeetCode 15: 3 Sum
    // ========================================================================
    /**
     * Problem Statement:
     * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] 
     * such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
     * Notice that the solution set must not contain duplicate triplets.
     * 
     * Example 1:
     * Input: nums = [-1,0,1,2,-1,-4]
     * Output: [[-1,-1,2],[-1,0,1]]
     * 
     * Example 2:
     * Input: nums = [0,1,1]
     * Output: []
     * 
     * Example 3:
     * Input: nums = [0,0,0]
     * Output: [[0,0,0]]
     * 
     * Constraints:
     * - 3 <= nums.length <= 3000
     * - -10^5 <= nums[i] <= 10^5
     *
     * Approach:
     * Sort + Two Pointers:
     * 1. Sort the array
     * 2. For each element, use two-pointer to find pair that sums to -element
     * 3. Skip duplicates to avoid duplicate triplets
     * 
     * Time Complexity: O(n²) - O(n log n) sort + O(n) × O(n) two-pointer
     * Space Complexity: O(1) - excluding output
     */
	
	public static void main(String[] args) {
		
		int[] nums = { -1, 0, 1, 2, -1, -4 };
		System.out.println(threeSum(nums));
		
	}
	
	private static List<List<Integer>> threeSum(int[] nums) {

		List<List<Integer>> result = new ArrayList<List<Integer>>();

		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 2; i++) {

			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}

			int left = i + 1, right = nums.length - 1;

			while (left < right) {

				int sum = nums[i] + nums[left] + nums[right];

				if (sum == 0) {
					result.add(Arrays.asList(nums[i], nums[left], nums[right]));

					while (nums[left] == nums[left + 1]) {
						left++;
					}

					while (nums[right] == nums[right - 1]) {
						right--;
					}
					
					left++;
					right--;

				} else if (sum > 0) {
					right--;
				} else {
					left++;
				}

			}

		}
		return result;
	}

}

// Output : 
// [[-1, -1, 2], [-1, 0, 1]]
