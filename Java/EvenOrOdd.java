package Java;

public class EvenOrOdd {
	
	// ========================================================================
	// PROBLEM: Even or Odd
	// ========================================================================
	/*
	 * Problem Statement: Check if a given number is even or odd.
	 * A number is even if divisible by 2, otherwise odd.
	 * Input: 4 Output: Even
	 * Input: 7 Output: Odd
	 * Input: 0 Output: Even
	 * 
	 * Approach: Use modulo operator to check remainder when divided by 2.
	 * Time Complexity: O(1) | Space Complexity: O(1)
	 */
	public static void main(String[] args) {
		int num = 7;
		if (isEven(num)) {
			System.out.println(num + " is Even");
		} else {
			System.out.println(num + " is Odd");
		}
	}
	
	private static boolean isEven(int num) {
		return num % 2 == 0;
	}
}

Output :
7 is Odd
