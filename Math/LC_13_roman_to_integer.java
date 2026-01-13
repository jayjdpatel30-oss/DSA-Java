package Math;

public class LC_13_roman_to_integer {
	
	// ========================================================================
    // LeetCode 13: Roman to Integer
    // ========================================================================
    /**
     * Problem Statement:
     * Roman numerals are represented by seven different symbols:
     * I=1, V=5, X=10, L=50, C=100, D=500, M=1000
     * 
     * Roman numerals are usually written largest to smallest from left to right.
     * However, there are exceptions for subtraction cases:
     * - I before V (5) or X (10) = 4 or 9
     * - X before L (50) or C (100) = 40 or 90
     * - C before D (500) or M (1000) = 400 or 900
     * 
     * Example 1:
     * Input: s = "III"
     * Output: 3
     * 
     * Example 2:
     * Input: s = "LVIII"
     * Output: 58
     * Explanation: L=50, V=5, III=3
     * 
     * Example 3:
     * Input: s = "MCMXCIV"
     * Output: 1994
     * Explanation: M=1000, CM=900, XC=90, IV=4
     * 
     * Constraints:
     * - 1 <= s.length <= 15
     * - s contains only ('I', 'V', 'X', 'L', 'C', 'D', 'M')
     *
     * Approach:
     * Process right to left:
     * - If current value < previous value: subtract (subtraction case)
     * - Otherwise: add
     *      
     * Time Complexity: O(n)
     * Space Complexity: O(1) - fixed size map
     */
	
	public static void main(String[] args) {
		
		String s = "MCMXCIV";
		System.out.println(number(s));
	}
	
	private static int number(String s) {

		if (s.length() == 0) {
			return 0;
		}

		int answer = 0;
		int number = 0;
		int prev = 0;

		for (int i = s.length() - 1; i >= 0; i--) {

			switch (s.charAt(i)) {

			case 'I' -> number = 1;
			case 'V' -> number = 5;
			case 'X' -> number = 10;
			case 'L' -> number = 50;
			case 'C' -> number = 100;
			case 'D' -> number = 500;
			case 'M' -> number = 1000;

			default -> number = 0;
			}

			if (number < prev) {
				answer -= number;
			} else {
				answer += number;
			}

			prev = number;

		}

		return answer;
	}
	
}
