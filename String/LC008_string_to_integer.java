package String;

public class LC008_string_to_integer {
	
	// ========================================================================
    // LeetCode 8: String to Integer (atoi)
    // ========================================================================
    /**
     * Problem Statement:
     * Implement the myAtoi(string s) function, which converts a string to 
     * a 32-bit signed integer (similar to C/C++'s atoi function).
     * 
     * Algorithm:
     * 1. Read in and ignore any leading whitespace.
     * 2. Check if next character is '-' or '+'. Read this character if it is either.
     * 3. Read in next characters until next non-digit or end of input is reached.
     * 4. Convert these digits into integer.
     * 5. If no digits were read, return 0.
     * 6. If integer out of 32-bit range, clamp to range.
     * 
     * Example 1:
     * Input: s = "42"
     * Output: 42
     * 
     * Example 2:
     * Input: s = "   -42"
     * Output: -42
     * 
     * Example 3:
     * Input: s = "4193 with words"
     * Output: 4193
     * 
     * Example 4:
     * Input: s = "words and 987"
     * Output: 0
     * 
     * Example 5:
     * Input: s = "-91283472332"
     * Output: -2147483648 (clamped to MIN_VALUE)
     * 
     * Constraints:
     * - 0 <= s.length <= 200
     * - s consists of English letters, digits, ' ', '+', '-', and '.'
     *
	 * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
	
	public static void main(String[] args) {
		
		String s = "4193 with words";
		System.out.println(intVal(s));
	}
	
	private static int intVal(String s) {

		s = s.trim();

		if (s.length() == 0) {
			return 0;
		}

		int ans = 0;

		int sign = 1;

		int index = 0;

		if (s.charAt(index) == '-') {
			sign *= -1;
			index++;
		}else if (s.charAt(0) == '+') {
			index++;
		}

		while (index < s.length()) {

			if (!Character.isDigit(s.charAt(index))) {
				return ans;
			} 

			int digit = Integer.parseInt(String.valueOf(s.charAt(index)));
//			int digit = s.charAt(index) - '0';
			
			if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && digit == Integer.MAX_VALUE % 10)) {

				if (sign == -1) {
					return Integer.MIN_VALUE;
				} else {
					return Integer.MAX_VALUE;
				}

			}

			ans = ans * 10 + digit;

			index++;
		}

		return ans * sign;
	}

}

// Output : 
// 4193
