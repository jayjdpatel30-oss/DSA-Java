package Java;

public class AutomorphicNumber {
	
	// ========================================================================
	// PROBLEM: Automorphic Number
	// ========================================================================
	/*
	 * Problem Statement: Check if a number's square ends with the number itself.
	 * An automorphic number is one whose square ends with the same digits as the number.
	 * Input: 5 Output: true (5^2 = 25, ends with 5)
	 * Input: 76 Output: true (76^2 = 5776, ends with 76)
	 * Input: 7 Output: false (7^2 = 49, doesn't end with 7)
	 * 
	 * Approach: Square the number and check if last digits match the original number.
	 * Time Complexity: O(log n) | Space Complexity: O(1)
	 */
	public static void main(String[] args) {
		int num = 76;
		if (isAutomorphic(num)) {
			System.out.println(num + " is an Automorphic Number");
		} else {
			System.out.println(num + " is not an Automorphic Number");
		}
	}
	
	private static boolean isAutomorphic(int num) {
		long square = (long) num * num;
		
		while (num > 0) {
			if (num % 10 != square % 10) {
				return false;
			}
			num /= 10;
			square /= 10;
		}
		
		return true;
	}
}

// Output:
// 76 is an Automorphic Number
