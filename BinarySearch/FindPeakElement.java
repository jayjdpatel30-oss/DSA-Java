package BinarySearch;

public class FindPeakElement {

	/**
	 * Problem Statement :
	 * 
	 * A peak element is one that is strictly greater than its neighbors. Given an
	 * array where adjacent elements are not equal, return any one peak index.
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [1,2,3,1] Output: 2 Explanation: 3 is a peak element and your
	 * function should return the index number 2. Example 2:
	 * 
	 * Input: nums = [1,2,1,3,5,6,4] Output: 5 Explanation: Your function can return
	 * either index number 1 where the peak element is 2, or index number 5 where
	 * the peak element is 6.
	 * 
	 * Approach :
	 * 
	 * Binary search using slope logic:
	 * 
	 * If nums[mid] < nums[mid+1] → you are on an increasing slope → go right.
	 * 
	 * Else → peak is at mid or left side → go left.
	 * 
	 * Eventually, left == right → peak index.
	 * 
	 * Time Complexity → O(log n) Space Complexity → O(1)
	 */

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 1 };
		System.out.println("Peak Element at : " + peekElement(nums));

	}

	private static int peekElement(int[] nums) {

		int left = 0, right = nums.length - 1;

		while (left < right) {

			int mid = left + (right - left) / 2;

			if (nums[mid] > nums[mid + 1]) {
				right = mid;
			} else {
				left = mid + 1;
			}

		}

		return left;
	}

}
