package Problems;

import java.util.Arrays;

public class P015_merge_two_arrays {
	
	// ========================================================================
	// PROBLEM 15: Merge Two Arrays
	// ========================================================================
	/*
	* Given two integer arrays, merge them into a single array.
	 *
	 * Example:
	 * Input  : [1, 2, 3] and [4, 5]
	 * Output : [1, 2, 3, 4, 5]
	 *
	 * Time Complexity:
	 * O(n + m)
	 *
	 * Space Complexity:
	 * O(n + m)
	 */

	public static void main(String[] args) {

//		int[] arr1 = { 1, 5, 9 };
//		int[] arr2 = { 2, 3, 7 };		
		
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 4, 5 };

		System.out.println("Merged Array : " + Arrays.toString(merge(arr1, arr2)));
	}

	private static int[] merge(int[] arr1, int[] arr2) {

		int[] result = new int[arr1.length + arr2.length];

		int index = 0, i = 0, j = 0;

		while (i < arr1.length && j < arr2.length) {

			if (arr1[i] < arr2[j]) {
				result[index++] = arr1[i++];
			} else {
				result[index++] = arr2[j++];
			}
		}

		while (i < arr1.length) {
			result[index++] = arr1[i++];
		}

		while (j < arr2.length) {
			result[index++] = arr2[j++];
		}

		return result;
	}

}
