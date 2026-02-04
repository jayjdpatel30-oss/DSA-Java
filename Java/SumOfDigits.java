package Java;

public class SumOfDigits {
	
	// ========================================================================
	// PROBLEM: Sum of Digits
	// ========================================================================
	/*
	 * Problem Statement: Calculate the sum of all digits in a number.
	 * Extract each digit and add them together.
	 * Input: 123 Output: 6 (1 + 2 + 3)
	 * Input: 456 Output: 15 (4 + 5 + 6)
	 * Input: 999 Output: 27 (9 + 9 + 9)
	 * 
	 * Approach: Extract digits using modulo 10, add them, divide by 10.
	 * Time Complexity: O(log n) | Space Complexity: O(1)
	 */
	public static void main(String[] args) {
		int num = 123;
		int sum = sumOfDigits(num);
		System.out.println("Sum of digits of " + num + " is: " + sum);
	}
	
	private static int sumOfDigits(int num) {
		int sum = 0;
		num = Math.abs(num); // Handle negative numbers
		
		while (num > 0) {
			sum += num % 10;
			num /= 10;
		}
		
		return sum;
	}
}

Output :
Sum of digits of 123 is: 6
