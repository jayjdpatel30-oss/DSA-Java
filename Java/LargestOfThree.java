public class LargestOfThree {

	// ========================================================================
	// PROBLEM: Find Largest of Three Numbers
	// ========================================================================
	/*
	 * Problem Statement: Find largest among three numbers. Input: a = 10, b = 20, c
	 * = 15 Output: Largest number is 20
	 * 
	 * Input: a = 50, b = 30, c = 40 Output: Largest number is 50
	 */

	public static void main(String[] args) {

		int a = 50, b = 30, c = 40;

		System.out.format("Largest from %d, %d and %d is : %d.", a, b, c, largest(a, b, c));
	}

	private static int largest(int a, int b, int c) {

		int largest = (a > b) ? ((a > c) ? a : c) : (a > c) ? a : c;

		// using if else blocks
//		int largest = 0;
//		
//		if(a > b) {
//			if(a > c) {
//				largest = a;
//			}else {
//				largest = b;
//			}
//		}else {
//			if(b > c) {
//				largest = b;
//			}else {
//				largest = c;
//			}
//		}

//		if else simplified
//		int largest = 0;
//
//		if (a > b && a > c) {
//			largest = a;
//		} else if (b > a && b > c) {
//			largest = b;
//		} else {
//			largest = c;
//		}

		return largest;
	}

}
