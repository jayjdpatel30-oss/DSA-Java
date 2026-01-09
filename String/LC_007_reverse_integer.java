package String;

public class LC_007_reverse_integer {
	
	// ========================================================================
    // LeetCode 7: Reverse Integer
    // ========================================================================
    /**
     * Problem Statement:
     * Given a signed 32-bit integer x, return x with its digits reversed. 
     * If reversing x causes the value to go outside the signed 32-bit integer 
     * range [-2^31, 2^31 - 1], then return 0.
     * 
     * Assume the environment does not allow you to store 64-bit integers.
     * 
     * Example 1:
     * Input: x = 123
     * Output: 321
     * 
     * Example 2:
     * Input: x = -123
     * Output: -321
     * 
     * Example 3:
     * Input: x = 120
     * Output: 21
     * 
     * Constraints:
     * - -2^31 <= x <= 2^31 - 1
     *
     * Approach:
     * Pop and push digits while checking for overflow:
     * 1. Pop last digit: digit = x % 10, x = x / 10
     * 2. Push to result: result = result * 10 + digit
     * 3. Check overflow BEFORE pushing
     * 
     * Overflow Detection:
     * - If result > Integer.MAX_VALUE / 10, overflow will occur
     * - If result == Integer.MAX_VALUE / 10, check last digit
     * 
     * Time Complexity: O(log x) - number of digits
     * Space Complexity: O(1)
     */
	
	
	public static void main(String[] args) {
		
		int x = -123;
		System.out.println(reverse(x));		
	}
	
	private static int reverse(int x) {

		if (x == 0) {
			return x;
		}

		int result = 0;

		while (x != 0) {

			int digit = x % 10;
			x /= 10;

			int temp = result * 10 + digit;

			if ((temp - digit) / 10 != result) {
				return 0;
			}

			result = temp;
		}

		return result;
	}

}

// Output : 
// -321
