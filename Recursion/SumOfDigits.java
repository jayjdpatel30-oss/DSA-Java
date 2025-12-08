package Recursion;

public class SumOfDigits {

	// PROBLEM 1: SUM OF DIGITS
	// ============================================================================
	/**
	 * Problem: Given a number n, find the sum of its digits using recursion
	 * Example: 1234 → 1 + 2 + 3 + 4 = 10
	 * 
	 * APPROACH: - Base Case: If n == 0, return 0 (no digits left) - Recursive Case:
	 * Last digit (n % 10) + sumOfDigits(remaining digits) - Remove last digit by
	 * dividing by 10 (n / 10)
	 * 
	 * TIME COMPLEXITY: O(d) where d = number of digits = O(log₁₀ n) SPACE
	 * COMPLEXITY: O(d) for recursion stack
	 * 
	  * VISUALIZATION for 1234:
     *   sumOfDigits(1234)
     *   = 4 + sumOfDigits(123)
     *     = 4 + 3 + sumOfDigits(12)
     *       = 4 + 3 + 2 + sumOfDigits(1)
     *         = 4 + 3 + 2 + 1 + sumOfDigits(0)
     *           = 4 + 3 + 2 + 1 + 0
     *   = 10
     */

	public static void main(String[] args) {

		int number = 1234;
		System.out.println("Sum of number's digits is : " + digitSum(number));

	}

	private static int digitSum(int number) {

		if (number == 0) {
			return 0;
		}

		return number % 10 + digitSum(number / 10);
	}

}
