package Arrays;

import java.util.*;

public class LC_350_intersection_of_two_arrays_II {
	
	// ========================================================================
    // LeetCode 350 - Intersection of Two Arrays II
    // ========================================================================
    /**
     * Problem Statement:
     * Given two integer arrays nums1 and nums2, return an array of their 
     * intersection. Each element in the result must appear as many times as 
     * it shows in both arrays and you may return the result in any order.
     * 
     * Example 1:
     * Input: nums1 = [1,2,2,1], nums2 = [2,2]
     * Output: [2,2]
     * 
     * Example 2:
     * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
     * Output: [4,9] or [9,4]
     * 
     * Constraints:
     * - 1 <= nums1.length, nums2.length <= 1000
     * - 0 <= nums1[i], nums2[i] <= 1000
     * 
     * Follow-up:
     * - What if the given array is already sorted?
     * - What if nums1's size is small compared to nums2's size?
     * - What if elements of nums2 are stored on disk, and memory is limited?
     *
     * 
     * Approach 1: HashMap (OPTIMAL for unsorted)
     * - Count frequency in nums1
     * - Match with nums2 and decrement count
     * 
     * Approach 2: Two Pointers (OPTIMAL for sorted)
     * - Sort both arrays
     * - Use two pointers to find matches
     * 
     * We'll implement HashMap approach as arrays are unsorted.
     * 
     * Time Complexity: O(n + m) where n, m are lengths
     * Space Complexity: O(min(n, m)) for HashMap
     */
	
	public static void main(String[] args) {
		
//		int[] nums1 = { 1, 2, 2, 1 };
//		int[] nums2 = { 2, 2 };		
//		int[] nums1 = { 4, 9, 5 };
//		int[] nums2 = { 9, 4, 9, 8, 4 };
		
		int[] nums1 = { 4, 5, 9 };
		int[] nums2 = { 4, 8, 9, 9, 9 };
//		System.out.println(Arrays.toString(intersect(nums1,nums2)));
		System.out.println(Arrays.toString(intersection(nums1,nums2)));
		
	}
	
	private static int[] intersection(int[] nums1, int[] nums2) {

		int[] result = new int[Math.min(nums1.length, nums2.length)];

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int val : nums1) {
			map.put(val, map.getOrDefault(val, 0) + 1);
		}

		int index = 0;

		for (int val : nums2) {

			if (map.containsKey(val) && map.get(val) >= 1) {
				result[index++] = val;
				map.put(val, map.getOrDefault(val, 0) - 1);
			}

		}

		return Arrays.copyOf(result, index);
	}
	     
	private static int[] intersect(int[] nums1, int[] nums2) {

		int i = 0, j = 0, index = 0;

		while (i < nums1.length && j < nums2.length) {

			if (nums1[i] == nums2[j]) {
				nums1[index++] = nums1[i];
				i++;
				j++;
			} else if (nums1[i] < nums2[j]) {
				i++;
			} else {
				j++;
			}

		}

		return Arrays.copyOf(nums1, index);
	}

}

// Output :
// [4 , 9]
