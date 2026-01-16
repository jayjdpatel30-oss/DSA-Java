package Java;

public class GCD {

	// ========================================================================
	// PROBLEM: Find GCD
	// ========================================================================
	/*
	 * Problem Statement: Find GCD of two numbers.
	 * Input: 12, 18 Output: 6
	 * Input: 48, 18 Output: 6
	 * Input: 100, 50 Output: 50
	 * 
	 * Approach: Euclidean Algorithm - gcd(a,b) = gcd(b, a%b)
	 */
	public static void main(String[] args) {
		
		int a = 12, b = 18;
		System.out.println("GCD of " + a + " and " + b + " is: " + findGCD(a, b));
	}

	private static int findGCD(int a, int b) {
		if (b == 0) {
			return a;
		}
		return findGCD(b, a % b);
	}
}
