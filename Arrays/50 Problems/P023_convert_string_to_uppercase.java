package Problems;

public class P023_convert_string_to_uppercase {

	// ========================================================================
	// PROBLEM 23: Convert String to Uppercase
	// ========================================================================
	/*
	 * Problem Statement:
	 * Given a string, convert all characters to uppercase.
	 *
	 * Example:
	 * Input  : "java"
	 * Output : "JAVA"
	 *
	 * Optimal Approach:
	 * 1. Use Java's built-in toUpperCase() method.
	 * 2. It internally handles character conversion efficiently.
	 *
	 * Time Complexity:
	 * O(n)
	 *
	 * Space Complexity:
	 * O(n) — new string is created.
	 */
	
	public static void main(String[] args) {
		
		String text = "Jay";
		System.out.println("In UpperCase : " + toUpper(text));
	}
	
	private static String toUpper(String text) {
		
		if(text == null) {
			return null;
		}
		
		return text.toUpperCase();	
	}
	
}
