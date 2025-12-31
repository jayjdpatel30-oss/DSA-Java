package Problems;

public class P035_remove_characters {

	// ========================================================================
	// PROBLEM 35: Remove Characters From String
	// ========================================================================
	/*
	 * Problem Statement:
	 * Given a string and a character, remove all occurrences
	 * of that character from the string.
	 *
	 * Example:
	 * Input  : "programming", char = 'g'
	 * Output : "prorammin"
	 *
	 * Optimal Approach:
	 * 1. Use StringBuilder to build the result efficiently.
	 * 2. Traverse the string character by character.
	 * 3. Append characters that do not match the given character.
	 *
	 * Time Complexity:
	 * O(n)
	 *
	 * Space Complexity:
	 * O(n)
	 */
	
	public static void main(String[] args) {
		
		String text = "programming";
		char letterToRemove = 'g';
		
		removeLetter(text, letterToRemove);
	}
	
	private static void removeLetter(String text, char letterToRemove) {
		
		if(text == null || text.isEmpty()) {
			return;
		}
	
		StringBuilder sb = new StringBuilder();
		for(char letter : text.toCharArray()) {
			if(letter != letterToRemove) {
				sb.append(letter);
			}
		}
		
		System.out.println(sb.toString());	
	}
	
}
