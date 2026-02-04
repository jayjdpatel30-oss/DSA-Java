package Java;

public class ReverseNumber {
	
	// ========================================================================
	// PROBLEM: Reverse a Number
	// ========================================================================
	/*
	 * Problem Statement: Reverse the digits of a given number.
	 * Take digits from right to left and build the reversed number.
	 * Input: 123 Output: 321
	 * Input: 456 Output: 654
	 * Input: 1200 Output: 21
	 * 
	 * Approach: Extract last digit, add to reversed number, and repeat.
	 * Time Complexity: O(log n) | Space Complexity: O(1)
	 */
	public static void main(String[] args) {
		int num = 123;
		int reversed = reverseNumber(num);
		System.out.println("Reverse of " + num + " is: " + reversed);
	}
	
	private static int reverseNumber(int num) {
		int reversed = 0;
		
		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;
		}
		
		return reversed;
	}
}

Output :
Reverse of 123 is: 321
