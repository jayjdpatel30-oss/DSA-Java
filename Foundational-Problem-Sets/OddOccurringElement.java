package Foundation_problems;

public class OddOccurringElement {

	// ========================================================================
	// PROBLEM: Find the Only Element Occurring Odd Number of Times
	// ========================================================================
	/**
	 * Problem Statement:
	 * 
	 * You are given an integer array where every element appears exactly twice
	 * except one element which appears odd number of times. Your task is to find
	 * that unique element.
	 * 
	 * Example: Input: [2, 3, 5, 4, 5, 3, 4] 
	 * 
	 * Output: 2
	 * 
	 * XOR of a number with itself is 0
	 * 
	 * XOR of a number with 0 is the number itself
	 *  
	 * So, XOR all elements → pairs cancel out → only odd-occurring element remains.
	 * 
	 * Approach :
	 * 
	 * Use bitwise XOR to eliminate duplicates in a single pass.
	 * 
	 * ⏱ Complexity
	 * 
	 * Time: O(n)
	 * 
	 * Space: O(1)
	 */

	public static void main(String[] args) {

		int arr[] = { 2, 3, 5, 4, 5, 3, 4 };
		System.out.println("Odd occurring element: " + findOdd(arr));
	}

	private static int findOdd(int[] arr) {

		int xor = 0;

		for (int num : arr) {
			xor ^= num; // same numbers cancel out
		}

		return xor;
	}
}
