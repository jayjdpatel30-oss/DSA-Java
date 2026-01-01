package Problems;

public class P039_count_digits {

	// ========================================================================
	// PROBLEM 39: Count Digits
	// ========================================================================
	/*
	 * Problem Statement:
	 * Given a string, count how many digits are present in it.
	 *
	 * Example:
	 * Input  : "java123dsa45"
	 * Output : 5
	 *
	 * Optimal Approach:
	 * 1. Traverse the string character by character.
	 * 2. Check if the character lies between '0' and '9'.
	 * 3. Increment counter for each digit.
	 *
	 * Time Complexity:
	 * O(n)
	 *
	 * Space Complexity:
	 * O(1)
	 */

	
	public static void main(String[] args) {
		
		String text = "java123dsa45";
		System.out.println("Total digits are : " + digitCount(text));
	}
	
	private static int digitCount(String text) {
		
		if(text.length() == 0){
			return 0;
		}
		
		int count = 0;
		
		for(char letter : text.toCharArray()) {
			if(Character.isDigit(letter)) {
				count++;
			}	
		}
		
		return count;
	}

}
