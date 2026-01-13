package Foundation_problems;

import java.util.HashMap;

public class FirstElementOccurringKTimes {

	// ========================================================================
	// PROBLEM : First Element Occurring K Times
	// ========================================================================
	/**
	 * Problem Statement: Given an array of integers and an integer k, find the
	 * first element whose frequency becomes exactly k.
	 * 
	 * Example: Input: arr = [1,7,4,3,4,8,7], k = 2 Output: 4
	 */

	/**
	 * Approach: Use HashMap to track frequency. Return immediately when any element
	 * reaches frequency k.
	 * 
	 * Time Complexity: O(n) Space Complexity: O(n)
	 */

	public static void main(String[] args) {

		int[] arr = { 1, 7, 4, 3, 4, 8, 7 };
		int k = 2;

		System.out.println(ocuuredKTimes(arr, k));
	}

	private static int ocuuredKTimes(int[] arr, int k) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int num : arr) {

			map.put(num, map.getOrDefault(num, 0) + 1);

			if (map.get(num) == k) {
				return num;
			}

		}
		return -1;
	}

}
