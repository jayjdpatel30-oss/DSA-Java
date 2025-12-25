package Problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class P012_remove_duplicates {

	// ========================================================================
	// PROBLEM 12: Remove Duplicates
	// ========================================================================
	/*
	 * Given an integer array, remove duplicate elements while maintaining order.
	 *
	 * Example:
	 * Input  : [1, 2, 2, 3, 4, 3]
	 * Output : [1, 2, 3, 4]
	 *
	 * Approach:
	 * 1. Use LinkedHashSet to store elements.
	 * 2. It automatically removes duplicates and preserves insertion order.
	 *
	 * Time Complexity:
	 * O(n)
	 *
	 * Space Complexity:
	 * O(n)
	 */

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 2, 4, 1 };
		System.out.println(Arrays.toString(duplicates(nums)));

		removeDuplicates(nums);
		
		System.out.println(removeDups(nums));
	}

	private static int[] duplicates(int[] nums) {

		if (nums.length <= 1) {
			System.out.println("No duplicates.");
			return nums;
		}

		Set<Integer> set = new HashSet<Integer>();
		int index = 0;
		for (int val : nums) {
			if (set.add(val)) {
				nums[index++] = val;
			}
		}

		nums = Arrays.copyOf(nums, index);

		return nums;
	}

	private static void removeDuplicates(int[] nums) {

		if (nums.length <= 1) {
			return;
		}

		Set<Integer> set = new LinkedHashSet<Integer>();
		for (int val : nums) {
			set.add(val);
		}

		System.out.println(set);
	}
	
	
	// Sorting approach
	private static int removeDups(int[] nums) {
		
		if(nums == null) {
			return 0;
		}
		
		if(nums.length == 1) {
			return 1;
		}
		
		int uniqueIndex = 1;
		Arrays.sort(nums);
		
		for(int i = 1; i < nums.length; i++) {
			
			if(nums[i] != nums[i - 1]) {
				nums[uniqueIndex++] = nums[i];
			}
			
		}
		
		System.out.println(Arrays.toString(Arrays.copyOf(nums, uniqueIndex)));
		
		return uniqueIndex;
	}

}
