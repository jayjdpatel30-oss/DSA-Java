package HashMap_Set;

import java.util.HashSet;

public class HappyNumber {

	// ========================================================================
	// PROBLEM 4: Happy Number
	// ========================================================================
	/**
	 * Problem Statement: A happy number is a number defined by the following
	 * process: - Starting with any positive integer, replace the number by the sum
	 * of the squares of its digits. - Repeat the process until the number equals 1
	 * (where it will stay), or it loops endlessly in a cycle which does not include
	 * 1. - Those numbers for which this process ends in 1 are happy.
	 * 
	 * Return true if n is a happy number, and false if not.
	 * 
	 * Example: Input: n = 19 Output: true Explanation: 1² + 9² = 82 8² + 2² = 68 6²
	 * + 8² = 100 1² + 0² + 0² = 1
	 */

	/**
	 * Approach: Use HashSet to detect cycles: 1. Calculate sum of squares of digits
	 * 2. If sum is 1, return true 3. If sum is already in set, we've found a cycle
	 * - return false 4. Otherwise, add to set and continue
	 * 
	 * Time Complexity: O(log n) - number of digits in n Space Complexity: O(log n)
	 * - HashSet to store intermediate values
	 */

	public static void main(String[] args) {
		int num = 19;
		System.out.println("Is " + num + " is a Happy Number? : " + (happyNumber(num) ? "Yes" : "No"));
	}

	private static boolean happyNumber(int number) {

		HashSet<Integer> seen = new HashSet();

		int digitSum = digitCount(number);

		while (digitSum != 1 && !seen.contains(digitSum)) {

			seen.add(digitSum);

			digitSum = digitCount(digitSum);
		}

		return digitSum == 1;
	}

	public static int digitCount(int num) {

		int sum = 0;

		while (num != 0) {
			int digit = num % 10;
			sum += (digit * digit);
			num /= 10;

		}
		return sum;
	}

}
