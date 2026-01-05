package Problems;

import java.util.Arrays;
import java.util.HashMap;

public class P046_intersection_array {

	// ========================================================================
	// PROBLEM 46: Find Intersection of Arrays
	// ========================================================================
	/*
	 * Problem Statement:
	 * Given two integer arrays, find their intersection
	 * (common elements present in both arrays).
	 *
	 * Example:
	 * Input  : [1, 2, 3, 4] and [3, 4, 5]
	 * Output : 3 4
	 *
	 * Optimal Approach:
	 * 1. Store all elements of the first array in a HashSet.
	 * 2. Traverse the second array.
	 * 3. If an element exists in the set, it is part of the intersection.
	 *
	 * Time Complexity:
	 * O(n + m)
	 *
	 * Space Complexity:
	 * O(n)
	 */

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 3, 4, 5 };
		System.out.println(Arrays.toString(intersection(arr1, arr2)));
	}

	private static int[] intersection(int[] arr1, int[] arr2) {

		if (arr1.length == 0 || arr2.length == 0) {
			return new int[] {};
		}

		int intersection[] = new int[Math.min(arr1.length, arr2.length)];
		int index = 0;

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num : arr1) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		for (int num : arr2) {
			if (map.containsKey(num)) {
				if (map.get(num) >= 1) {
					intersection[index++] = num;
					map.put(num, map.getOrDefault(map, 0) - 1);
				}
			}
		}
		
		intersection = Arrays.copyOf(intersection, index);

		return intersection;
	}

}
