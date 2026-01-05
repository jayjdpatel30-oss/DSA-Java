package Problems;

import java.util.Arrays;

public class P049_split_string {

	// ========================================================================
	// PROBLEM 49: Split String by Space
	// ========================================================================
	/*
	 * Problem Statement:
	 * Given a string, split it by spaces and store each word.
	 *
	 * Example:
	 * Input  : "java is easy"
	 * Output : ["java", "is", "easy"]
	 *
	 * Optimal Approach:
	 * 1. Use split(" ") method to divide string by spaces.
	 * 2. Store the result in a string array.
	 *
	 * Time Complexity:
	 * O(n)
	 *
	 * Space Complexity:
	 * O(n)
	 */

	public static void main(String[] args) {

		String text = "I am a boy";
		splitSting(text);
	}

	private static void splitSting(String text) {

		String[] words = text.split(" ");
		
//		for(String word : words) {
//			System.out.print(word + " ");
//		}
		
		System.out.println(Arrays.toString(words));
	}

}
