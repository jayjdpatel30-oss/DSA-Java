package Recursion;

public class Factorial {

	// ============================================================================
	// PROBLEM 5: FACTORIAL
	// ============================================================================
	/**
	 * Problem: Calculate n! (factorial) using recursion Example: 5! = 5 × 4 × 3 × 2
	 * × 1 = 120
	 * 
	 * APPROACH:
	     * - Base Case: 0! = 1, 1! = 1
	     * - Recursive Case: n! = n × (n-1)!
	     * 
	     * TIME COMPLEXITY: O(n)
	     * SPACE COMPLEXITY: O(n) for recursion stack
	     * 
	     * VISUALIZATION for 5!:
	     *   factorial(5)
	     *   = 5 * factorial(4)
	     *     = 5 * 4 * factorial(3)
	     *       = 5 * 4 * 3 * factorial(2)
	     *         = 5 * 4 * 3 * 2 * factorial(1)
	     *           = 5 * 4 * 3 * 2 * 1
	     *   = 120
	     */

	public static void main(String[] args) {
		
		int number = 5; 
		System.out.println("Factorial of " + number + " is : " + factorial(number));
	}

	private static int factorial(int number) {

		if (number <= 0) {
			return 0;
		}

		if (number == 1) {
			return 1;
		}

		return number * factorial(number - 1);
	}

}
