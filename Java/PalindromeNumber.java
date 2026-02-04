package Java;

public class PalindromeNumber {
	
	// ========================================================================
	// PROBLEM: Palindrome Number
	// ========================================================================
	/*
	 * Problem Statement: Check if a number reads the same forwards and backwards.
	 * A palindrome number is same when reversed.
	 * Input: 121 Output: true (121 reversed is 121)
	 * Input: 12321 Output: true
	 * Input: 123 Output: false (123 reversed is 321)
	 * 
	 * Approach: Reverse the number and compare with original.
	 * Time Complexity: O(log n) | Space Complexity: O(1)
	 */
	public static void main(String[] args) {
		int num = 121;
		if (isPalindrome(num)) {
			System.out.println(num + " is a Palindrome Number");
		} else {
			System.out.println(num + " is not a Palindrome Number");
		}
	}
	
	private static boolean isPalindrome(int num) {
		if (num < 0) return false; // Negative numbers are not palindromes
		
		int original = num;
		int reversed = 0;
		
		while (num > 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;
		}
		
		return original == reversed;
	}
}

Output :
121  is a Palindrome Number
