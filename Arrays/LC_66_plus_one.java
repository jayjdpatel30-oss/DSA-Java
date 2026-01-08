package Arrays;

import java.util.Arrays;

public class LC_66_plus_one {
	
	// ========================================================================
    // LeetCode 66: Plus One
    // ========================================================================
    /**
     * Problem Statement:
     * You are given a large integer represented as an integer array digits, 
     * where each digits[i] is the ith digit of the integer. The digits are 
     * ordered from most significant to least significant in left-to-right order. 
     * The large integer does not contain any leading 0's.
     * Increment the large integer by one and return the resulting array of digits.
     * 
     * Example 1:
     * Input: digits = [1,2,3]
     * Output: [1,2,4]
     * Explanation: 123 + 1 = 124
     * 
     * Example 2:
     * Input: digits = [4,3,2,1]
     * Output: [4,3,2,2]
     * 
     * Example 3:
     * Input: digits = [9]
     * Output: [1,0]
     * 
     * Example 4:
     * Input: digits = [9,9,9]
     * Output: [1,0,0,0]
     * 
     * Constraints:
     * - 1 <= digits.length <= 100
     * - 0 <= digits[i] <= 9
     *
     * Approach:
     * Simulate addition from right to left with carry:
     * 1. Start from rightmost digit
     * 2. while nums[lastIndex] == 9 set it to 0 and decrement index
     * 3. if we reach to index 0 then create new array [size + 1]
     * 4. At index add 1 to the number.
     * 
     * Time Complexity: O(n)
     * Space Complexity: O(1) or O(n) if all 9s
     */
	
	public static void main(String[] args) {
		
		int[] nums = { 4, 3, 2, 1 };
		System.out.println(Arrays.toString(plusOne(nums)));
	}
	
	private static int[] plusOne(int[] nums) {

		int index = nums.length - 1;

		while (nums[index] == 9) {

			if (index == 0) {
				nums = new int[nums.length + 1];
				break;
			}

			nums[index] = 0;
			index--;
		}

		nums[index] += 1;

		return nums;
	}

}

// Output :
// [4, 3, 2, 2]
