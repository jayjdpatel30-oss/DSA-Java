package Recursion;

public class PowerCalculation {

	// ============================================================================
	// PROBLEM 2: POWER CALCULATION
	// ============================================================================
	/**
	 * Problem: Calculate base^exponent using recursion (x^n) Example: 2^5 = 32
	 * 
	 * APPROACH 1 - Simple Recursion: - Base Case: x^0 = 1 - Recursive Case: x^n = x
	 * * x^(n-1)
	 * 
	 * TIME COMPLEXITY: O(n) - n recursive calls SPACE COMPLEXITY: O(n) - recursion
	 * stack depth
	 * 
	 * VISUALIZATION for 2^5:
     *   power(2, 5)
     *   = 2 * power(2, 4)
     *     = 2 * 2 * power(2, 3)
     *       = 2 * 2 * 2 * power(2, 2)
     *         = 2 * 2 * 2 * 2 * power(2, 1)
     *           = 2 * 2 * 2 * 2 * 2 * power(2, 0)
     *             = 2 * 2 * 2 * 2 * 2 * 1
     *   = 32
     */

	
	/**
     * APPROACH 2 - Optimized (Fast Exponentiation / Binary Exponentiation):
     * - If n is even: x^n = (x^(n/2))^2
     * - If n is odd: x^n = x * x^(n-1)
     * 
     * TIME COMPLEXITY: O(log n) - much faster!
     * SPACE COMPLEXITY: O(log n)
     * 
     * EXAMPLE for 2^8:
     *   2^8 = (2^4)^2 = ((2^2)^2)^2 = (((2^1)^2)^2)^2
     *   Only 3 multiplications instead of 7!
     */
	public static void main(String[] args) {

		int base = 2;
		int exp = 5;

		System.out.println(base + " raised to " + exp + " = " + power(base, exp));
		System.out.println("2 ^ 8 = " + powerOptimized(2, 8));
	}

	private static int power(int base, int exp) {

		if (exp == 0) {
			return 1;
		}

		return base * power(base, exp - 1);
	}

	static int powerOptimized(int base, int exp) {

		if (exp == 0) {
			return 1;
		}

		if (exp % 2 == 0) {
			int half = powerOptimized(base, exp / 2);
			return half * half;
		} else {
			return base * powerOptimized(base, exp - 1);
		}

	}

}
