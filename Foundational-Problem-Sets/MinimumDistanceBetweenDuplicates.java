package Foundation_problems;

import java.util.HashMap;

public class MinimumDistanceBetweenDuplicates {

	// ========================================================================
	// PROBLEM : Minimum Distance Between Same Elements
	// ========================================================================
	/**
	 * Problem Statement:
	 * Find minimum index distance between any two equal elements.
	 * 
	 * Example:
	 * Input: [3,5,4,3,2,5]
	 * Output: 3
	 */

	/**
	 * Approach:
	 * Store last index of each element using HashMap.
	 * 
	 * Time Complexity: O(n)
	 * Space Complexity: O(n)
	 */
	public static void main(String[] args) {

		int arr[] = { 3, 5, 4, 3, 2, 5 };
		System.out.println(minDistance(arr));
	}

	private static int minDistance(int[] arr) {

		int minDist = Integer.MAX_VALUE;

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {

			if (map.containsKey(arr[i])) {
				minDist = Math.min(minDist, i - map.get(arr[i]));
			}

			map.put(arr[i], i);
		}

		return minDist;
	}

}
