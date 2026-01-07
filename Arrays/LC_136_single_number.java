package Arrays;

import java.util.*;

public class LC_136_single_number {
	
	// ========================================================================
    // LeetCode 136: Single Number
    // ========================================================================
    /**
     * Problem Statement:
     * Given a non-empty array of integers nums, every element appears twice 
     * except for one. Find that single one.
     * 
     * You must implement a solution with O(n) time and O(1) space complexity.
     * 
     * Example 1:
     * Input: nums = [2,2,1]
     * Output: 1
     * 
     * Example 2:
     * Input: nums = [4,1,2,1,2]
     * Output: 4
     * 
     * Example 3:
     * Input: nums = [1]
     * Output: 1
     * 
     * Constraints:
     * - 1 <= nums.length <= 3 * 10^4
     * - -3 * 10^4 <= nums[i] <= 3 * 10^4
     * - Each element appears twice except for one element which appears once
     *
     *
     * Approach:
     * XOR (Exclusive OR) Bit Manipulation
     * 
     * XOR Properties:
     * - a ^ a = 0 (any number XOR itself is 0)
     * - a ^ 0 = a (any number XOR 0 is itself)
     * - XOR is commutative and associative
     * 
     * Example: [4,1,2,1,2]
     * 4 ^ 1 ^ 2 ^ 1 ^ 2
     * = 4 ^ (1 ^ 1) ^ (2 ^ 2)   [commutative & associative]
     * = 4 ^ 0 ^ 0
     * = 4
     * 
     * All duplicate numbers cancel out to 0, leaving only the unique number!
     * 
     * Time Complexity: O(n) - single pass
     * Space Complexity: O(1) - only one variable
     */
	
	public static void main(String[] args) {
		
//		int[] nums = { 2, 2, 1 };
		int[] nums = { 4, 1, 2, 1, 2 };
//		int[] nums = { 1 };
		System.out.println(singleNumber(nums));
	}
	
	private static int singleNumber(int[] nums) {
		
		if(nums.length == 1) {
			return nums[0];
		}
		
		int result = 0;
		for(int val : nums) {
			result ^= val;
		}
		
		return result;
	}

}

// Output :
// 4
