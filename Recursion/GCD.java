package Recursion;

public class GCD {
	
	 // ============================================================================
    // PROBLEM 3: GCD (GREATEST COMMON DIVISOR) - EUCLIDEAN ALGORITHM
    // ============================================================================
    /**
     * Problem: Find GCD of two numbers using Euclidean algorithm
     * Example: GCD(48, 18) = 6
     * 
     * APPROACH (Euclidean Algorithm):
     * - Base Case: If b == 0, then GCD = a
     * - Recursive Case: GCD(a, b) = GCD(b, a % b)
     * 
     * INTUITION: The GCD of two numbers also divides their remainder
     * 
     * TIME COMPLEXITY: O(log(min(a, b)))
     * SPACE COMPLEXITY: O(log(min(a, b)))
     * 
     * VISUALIZATION for GCD(48, 18):
     *   GCD(48, 18)
     *   = GCD(18, 48 % 18) = GCD(18, 12)
     *     = GCD(12, 18 % 12) = GCD(12, 6)
     *       = GCD(6, 12 % 6) = GCD(6, 0)
     *         = 6 (base case)
     */

	public static void main(String[] args) {

		int a = 48, b = 18;
		System.out.println("GCD of " + a + " and " + b + " is : " + gcd(a, b));

	}

	private static int gcd(int a, int b) {

		if (b == 0) {
			return a;
		}

		return gcd(b, a % b);
	}
	
	/* VISUALIZATION for GCD(18, 48):
	     *   GCD(18, 48)
	     *   = GCD(48, 18 % 48) = GCD(48, 18)
	     *     = GCD(18, 48 % 18) = GCD(18, 12)
	     *       = GCD(12, 18 % 12) = GCD(12, 6)
	     *       	= GCD(6, 0) = GCD(6 , 0)  // b == 0 return a; ans = 6.
	     *         = 6 (base case)
	     */

}
