package Math;

public class LC_326_power_of_three {
	
	// ========================================================================
    // LeetCode 326: Power of Three
    // ========================================================================
    /**
     * Problem Statement:
     * Given an integer n, return true if it is a power of three. 
     * Otherwise, return false.
     * An integer n is a power of three, if there exists an integer x such 
     * that n == 3^x.
     * 
     * Example 1:
     * Input: n = 27
     * Output: true
     * Explanation: 27 = 3³
     * 
     * Example 2:
     * Input: n = 0
     * Output: false
     * 
     * Example 3:
     * Input: n = 9
     * Output: true
     * 
     * Example 4:
     * Input: n = 45
     * Output: false
     * 
     * Constraints:
     * - -2^31 <= n <= 2^31 - 1
     *
     * Approach 1: Division Method
     * Keep dividing by 3, check if remainder is 0
     * 
     * Approach 2: Pre-compute all powers (since range is limited)
     * 
     * Approach 3: Math - Check if log₃(n) is integer
     * 
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
	
	public static void main(String[] args) {

		int n = 81;
		System.out.println(powerOf3(n));
		System.out.println(pow3(n));
		
	}

	private static boolean powerOf3(int n) {

//		if (n > 1) {
//			while (n % 3 == 0) {
//				n /= 3;
//			}
//		}
//
//		return n == 1;

		return (Math.log10(n) / Math.log10(3)) % 1 == 0;

	}

	// Pre calculate power of three
	private static boolean pow3(int n) {

		if (n <= 0) {
			return false;
		}

		// find max power of 3
		int maxPower3 = 1;
		while (maxPower3 <= Integer.MAX_VALUE / 3) {
			maxPower3 *= 3;
		}

		return maxPower3 % n == 0;
	}

}
