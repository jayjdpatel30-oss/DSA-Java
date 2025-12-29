package Problems;

public class P024_convert_string_to_lowercase {

	// ========================================================================
	// PROBLEM 24: Convert String to Lowercase
	// ========================================================================
	/*
	 * Problem Statement:
	 * Given a string, convert all characters to lowercase.
	 *
	 * Example:
	 * Input  : "java"
	 * Output : "JAVA"
	 *
	 * Optimal Approach:
	 * 1. Use Java's built-in toLowerCase() method.
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
		System.out.println("In LowerCase : " + toLower(text));
	}
	
	private static String toLower(String text) {
		
		if(text == null) {
			return null;
		}
		
		return text.toLowerCase();	
	}
	
}
