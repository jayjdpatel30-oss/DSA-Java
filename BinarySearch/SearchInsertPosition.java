package BinarySearch;

public class SearchInsertPosition {

	/**
	 * Problem Statement
	 * 
	 * Given a sorted array nums and a target value, return the index where the
	 * target is found. If not found, return the index where it should be inserted
	 * to maintain sorting.
	 * 
	 * Input: nums = [1,3,5,6], target = 5 Output: 2
	 * 
	 * Input: nums = [1,3,5,6], target = 2 Output: 1
	 * 
	 * Input: nums = [1,3,5,6], target = 7 Output: 4
	 * 
	 * Approach
	 * 
	 * Binary search to find first index where nums[mid] >= target.
	 * 
	 * Time Complexity → O(log n) Space Complexity → O(1)
	 */

	public static void main(String[] args) {

		int[] nums = { 1, 3, 5, 6 };
		int target = 7;

		System.out.println("Element to insert at : " + searchInsert(nums, target));

	}

	public static int searchInsert(int[] nums, int target) {

		int left = 0, right = nums.length - 1;

		while (left <= right) {

			int mid = left + (right - left) / 2;

			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}

		}

		return left;

	}

}
