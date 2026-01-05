package Problems;

import java.util.Arrays;

public class P050_concatenate_string {

	// ========================================================================
	// PROBLEM 50: Concatenate Two Strings
	// ========================================================================
	/*
	 * Problem Statement:
	 * Given two strings, concatenate them into a single string.
	 *
	 * Example:
	 * Input  : "java", "dsa"
	 * Output : "javadasa"
	 *
	 * Optimal Approach:
	 * 1. Use StringBuilder for efficient concatenation.
	 * 2. Append both strings.
	 *
	 * Time Complexity:
	 * O(n + m)
	 *
	 * Space Complexity:
	 * O(n + m)
	 */

	public static void main(String[] args) {

		String text1 = "java", text2 = "dsa";
		concatenate(text1, text2);
	}

	private static void concatenate(String text1, String text2) {
		
		StringBuilder sb = new StringBuilder();
		sb.append(text1).append(text2);
		
//		System.out.println(text1.concat(text2));
		
		System.out.println(sb.toString());
	}

}
