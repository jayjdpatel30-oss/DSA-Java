package HashMap_Set;

import java.util.HashSet;
import java.util.Arrays;

public class IntersectionArrays {

	// ========================================================================
	// PROBLEM 1: Intersection of Two Arrays
	// ========================================================================
	/**
	 * Problem Statement: Given two integer arrays nums1 and nums2, return an array
	 * of their intersection. Each element in the result must be unique and you may
	 * return the result in any order.
	 * 
	 * Example: Input: nums1 = [1,2,2,1], nums2 = [2,2] Output: [2]
	 * 
	 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4] Output: [9,4] or [4,9]
	 */

	public static void main(String[] args) {

//		int[] nums1 = { 1, 2, 2, 1 };
//		int[] nums2 = { 2, 2 };

		int[] nums1 = { 4, 9, 5 };
		int[] nums2 = { 9, 4, 9, 8, 4 };

		int[] result = intersection(nums1, nums2);
		System.err.println(Arrays.toString(result));

	}

	public static int[] intersection(int[] nums1, int[] nums2) {

		HashSet<Integer> nums1UniqueElements = new HashSet();
		HashSet<Integer> intersection = new HashSet();

		for (int num : nums1) {
			nums1UniqueElements.add(num);
		}

		for (int num : nums2) {
			if (nums1UniqueElements.contains(num)) {
				intersection.add(num);
			}
		}

		int[] result = new int[intersection.size()];
		int index = 0;

		for (int num : intersection) {
			result[index++] = num;
		}

		return result;
	}

}
