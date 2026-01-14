package Java;

public class FactorialNumber {

	// ========================================================================
	// PROBLEM: Factorial of a Number
	// ========================================================================
	/*
	 * Problem Statement: Calculate factorial of a given number.
	 * Input: 5 Output: 120 (5! = 5*4*3*2*1)
	 * Input: 0 Output: 1 (0! = 1 by definition)
	 * Input: 6 Output: 720 (6! = 6*5*4*3*2*1)
	 * 
	 * Approach: Use loop to multiply all numbers from 1 to n.
	 * Time Complexity: O(n) | Space Complexity: O(1)
	 */
	public static void main(String[] args) {
		int num = 5;
		System.out.println("Factorial of " + num + " is: " + factorial(num));
	}

	private static int factorial(int num) {
		if (num < 0) {
			return -1;
		}
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}
}

