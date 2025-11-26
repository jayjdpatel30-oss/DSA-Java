package String;

import java.util.Arrays;

public class reverseString {

	/**
	 * PROBLEM 4: Reverse String //
	 * ======================================================================== /**
	 * Problem Statement: Write a function that reverses a string. The input string
	 * is given as an array of characters s. You must do this by modifying the input
	 * array in-place with O(1) extra memory.
	 * 
	 * Example: Input: s = ["h","e","l","l","o"] Output: ["o","l","l","e","h"]
	 * 
	 * Input: s = ["H","a","n","n","a","h"] Output: ["h","a","n","n","a","H"]
	 */

	/**
	 * Approach: Two-pointer technique: - Use left pointer at start and right
	 * pointer at end - Swap characters at these positions - Move pointers towards
	 * center - Continue until pointers meet
	 * 
	 * Time Complexity: O(n) - iterate through half the array Space Complexity: O(1)
	 * - only using two pointers and temp variable
	 */

	public static void main(String[] args) {

		char[] letters = { 'h', 'e', 'l', 'l', '0' };
		reverseString(letters);
		System.out.println(Arrays.toString(letters));

	}

	public static void reverseString(char[] s) {

		int left = 0, right = s.length - 1;

		while (left < right) {

			char temp = s[left];
			s[left] = s[right];
			s[right] = temp;

			left++;
			right--;
		}

	}

}
