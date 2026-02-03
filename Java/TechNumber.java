package Java;

public class TechNumber {
	
	// ========================================================================
	// PROBLEM: Tech Number
	// ========================================================================
	/*
	 * Problem Statement: Check if a number is a tech number.
	 * A tech number has even digits, can be split in half, and sum of halves squared equals original.
	 * Input: 2025 Output: true (20 + 25 = 45, 45^2 = 2025)
	 * Input: 3025 Output: true (30 + 25 = 55, 55^2 = 3025)
	 * Input: 2026 Output: false
	 * 
	 * Approach: Split number in half, sum the parts, square, and compare.
	 * Time Complexity: O(log n) | Space Complexity: O(1)
	 */
	public static void main(String[] args) {
		int num = 2025;
		if (isTechNumber(num)) {
			System.out.println(num + " is a Tech Number");
		} else {
			System.out.println(num + " is not a Tech Number");
		}
	}
	
	private static boolean isTechNumber(int num) {
		String numStr = String.valueOf(num);
		int length = numStr.length();
		
		// Must have even number of digits
		if (length % 2 != 0) {
			return false;
		}
		
		int mid = length / 2;
		int firstHalf = Integer.parseInt(numStr.substring(0, mid));
		int secondHalf = Integer.parseInt(numStr.substring(mid));
		
		int sum = firstHalf + secondHalf;
		return sum * sum == num;
	}
}

// Output :
// 2025 is a Tech Number
