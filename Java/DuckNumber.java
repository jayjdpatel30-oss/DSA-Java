package Java;

public class DuckNumber {
	
	// ========================================================================
	// PROBLEM: Duck Number
	// ========================================================================
	/*
	 * Problem Statement: Check if number contains zero but doesn't start with zero.
	 * A duck number has at least one zero but not at the beginning.
	 * Input: 402 Output: true (contains 0, doesn't start with 0)
	 * Input: 3210 Output: true
	 * Input: 304 Output: true
	 * Input: 043 Output: false (starts with 0)
	 * Input: 234 Output: false (no zero)
	 * 
	 * Approach: Check if string contains '0' but doesn't start with it.
	 * Time Complexity: O(log n) | Space Complexity: O(log n)
	 */
	public static void main(String[] args) {
		int num = 402;
		if (isDuckNumber(num)) {
			System.out.println(num + " is a Duck Number");
		} else {
			System.out.println(num + " is not a Duck Number");
		}
	}
	
	private static boolean isDuckNumber(int num) {
		String numStr = String.valueOf(num);
		
		// Cannot start with 0 and must be positive
		if (numStr.charAt(0) == '0' || num <= 0) {
			return false;
		}
		
		// Must contain at least one 0
		return numStr.contains("0");
	}
}

// Output :
// 402 is a Duck Number
