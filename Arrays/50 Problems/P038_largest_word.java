package Problems;

public class P038_largest_word {

	// ========================================================================
	// PROBLEM 38: Largest Word in String
	// ========================================================================
	/*
	 * Problem Statement:
	 * Given a string, find the word with the maximum length.
	 *
	 * Example:
	 * Input  : "java is very powerful"
	 * Output : "powerful"
	 *
	 * Optimal Approach:
	 * 1. Split the string into words.
	 * 2. Track the word with the maximum length.
	 * 3. Compare each word length with current maximum.
	 *
	 * Time Complexity:
	 * O(n)
	 *
	 * Space Complexity:
	 * O(n)
	 */

	public static void main(String[] args) {

		String text = "java is very powerful";
		System.out.println("LARGEST WORD IS : " + largest(text));

	}

	private static String largest(String text) {
		
		String largest = "";
		
		int maxLength = 0;
		
		String[] words = text.split(" ");
		
		for(String word : words) {
			
			int currentLength = word.length();
			
			if(currentLength > maxLength) {
				maxLength = currentLength;
				largest = word;
			}
			
		}
	
		return largest;
	}

}
