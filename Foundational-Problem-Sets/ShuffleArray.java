package Foundation_problems;

import java.util.Arrays;

public class ShuffleArray {

	/**
	 * Shuffle the Array Problem Statement: Given the array nums consisting of 2n
	 * elements in the form [x1,x2,...,xn,y1,y2,...,yn], return the array in the
	 * form [x1,y1,x2,y2,...,xn,yn].
	 * 
	 * Test Cases:
	 * 
	 * Input: nums = [2,5,1,3,4,7], n = 3 Output: [2,3,5,4,1,7] Explanation: x1=2,
	 * x2=5, x3=1, y1=3, y2=4, y3=7. Answer is [x1,y1,x2,y2,x3,y3].
	 * 
	 * Input: nums = [1,2,3,4,4,3,2,1], n = 4 Output: [1,4,2,3,3,2,4,1]
	 * 
	 * Input: nums = [1,1,2,2], n = 2 Output: [1,2,1,2]
	 * 
	 * Approach: Create a new result array. Iterate from 0 to n-1, placing elements
	 * alternately from first half (xi) and second half (yi) of the original array.
	 * 
	 * Time Complexity: O(n) Space Complexity: O(n) - Result array
	 */

	public static void main(String[] args) {

		int[] nums = { 2, 5, 1, 3, 4, 7 };
		int n = 3;
		System.out.println("Shuffled Array : " + Arrays.toString(shuffle(nums, n)));
	}

	public static int[] shuffle(int[] nums, int n) {
		int[] result = new int[2 * n];

		for (int i = 0; i < n; i++) {
			result[2 * i] = nums[i];
			result[2 * i + 1] = nums[n + i];
		}

		return result;
	}

}
