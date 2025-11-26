package String;

public class LongestCommonPrefix {

	// PROBLEM 3: Longest Common Prefix
	// ========================================================================
	/**
	 * Problem Statement: Write a function to find the longest common prefix string
	 * amongst an array of strings. If there is no common prefix, return an empty
	 * string "".
	 * 
	 * Example: Input: strs = ["flower","flow","flight"] Output: "fl"
	 * 
	 * Input: strs = ["dog","racecar","car"] Output: ""
	 */

	/*
	 * Alternative Approach: Take first string as prefix - Compare with each string
	 * and reduce prefix until it matches
	 * 
	 * Time Complexity: O(S) where S is sum of all characters in all strings Space
	 * Complexity: O(1) - only using index variable
	 */

	public static void main(String[] args) {

		System.out.println("Prefix : " + longestCommonPrefix(new String[] { "flower", "flow", "flight" }));
		System.out.println("Prefix : " + longestCommonPrefix(new String[] { "dog", "racecar", "car" }));

	}

	public static String longestCommonPrefix(String[] strs) {

		if (strs == null) {
			return null;
		}

		String prefix = strs[0];

		for (int i = 1; i < strs.length; i++) {

			if (prefix == "") {
				return "";
			}

			String currentWord = strs[i];
			String newPref = "";

			for (int j = 0; j < Math.min(currentWord.length(), prefix.length()); j++) {
				if (currentWord.charAt(j) == prefix.charAt(j)) {
					newPref += prefix.charAt(j);
				}
			}

			prefix = newPref;

		}

		return prefix;

	}
}
