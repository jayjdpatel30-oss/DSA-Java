```java

import java.util.Arrays;

public class MoveZeroes {

	// ========================================================================
	// PROBLEM 5: Move Zeroes
	// ========================================================================
	/**
	 * Problem Statement: Given an integer array nums, move all 0's to the end of it
	 * while maintaining the relative order of the non-zero elements. Note: You must
	 * do this in-place without making a copy of the array.
	 * 
	 * Example: Input: nums = [0,1,0,3,12] Output: [1,3,12,0,0]
	 */

	/**
	 * Approach: Use two-pointer technique: - 'left' pointer: tracks position where
	 * next non-zero should be placed - 'right' pointer: iterates through array to
	 * find non-zero elements
	 * 
	 * When we find a non-zero element at 'right', swap it with element at 'left'
	 * and increment 'left'. This pushes all non-zeros to the front and zeros to the
	 * end.
	 * 
	 * Time Complexity: O(n) - single pass through array Space Complexity: O(1) -
	 * only using pointers, modifying in-place
	 * 
	 * Approach 2 has 2 pass approach : In first pass we fill all non zero elements
	 * with index from 0 In second pass we fill zeros from index we have fill non
	 * zero elements.
	 * 
	 * Time Complexity: O(n) two pass 2n but generalized as n. Space Complexity:
	 * O(1) - only using index variable, modifying in-place
	 */

	public static void main(String[] args) {

		int[] nums = { 0, 1, 0, 3, 12 };
//		moveZeroes(nums);
		moveZeroes2p(nums);
		System.out.println(Arrays.toString(nums));

	}

	public static void moveZeroes2p(int[] nums) {

		int left = 0, right = 0;

		while (right < nums.length) {

			if (nums[left] != 0) {
				left++;
				right++;
			} else if (nums[right] == 0) {
				right++;
			} else {

				int temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;

				left++;
				right++;
			}
		}

	}

	public static void moveZeroes(int[] nums) {

		int index = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[index++] = nums[i];
			}
		}

		while (index < nums.length) {
			nums[index++] = 0;
		}

	}

}
```
