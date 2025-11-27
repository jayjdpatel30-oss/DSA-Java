package HashMap_Set;

import java.util.HashSet;

public class ContainsDuplicateII {

	// ========================================================================
	// PROBLEM 5: Contains Duplicate II
	// ========================================================================
	/**
	 * Problem Statement: Given an integer array nums and an integer k, return true
	 * if there are two distinct indices i and j in the array such that nums[i] ==
	 * nums[j] and abs(i - j) <= k.
	 * 
	 * Example: Input: nums = [1,2,3,1], k = 3 Output: true Explanation: nums[0] and
	 * nums[3] are the same value and indices differ by 3
	 * 
	 * Input: nums = [1,0,1,1], k = 1 Output: true Explanation: nums[2] and nums[3]
	 * are same and indices differ by 1
	 * 
	 * Input: nums = [1,2,3,1,2,3], k = 2 Output: false
	 */

	/**
	 * Approach: Use sliding window with HashSet of size k
	 * 
	 * Time Complexity: O(n) - single pass through array Space Complexity: O(min(n,
	 * k)) - HashMap stores at most k+1 elements
	 */
	public static void main(String[] args) {

		int nums[] = { 1, 0, 1, 1 };
		int k = 1;

		System.out.println("Are there duplicates : " + (containDups(nums, k) ? "Yes" : "No"));

	}

	private static boolean containDups(int nums[], int k) {

		HashSet<Integer> window = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			// If set already contains the element, found duplicate within k distance
			if (window.contains(nums[i])) {
				return true;
			}

			// Add current element to window
			window.add(nums[i]);

			// Maintain window size of k
			if (window.size() > k) {
				window.remove(nums[i - k]);
			}
		}

		return false;

	}

}
