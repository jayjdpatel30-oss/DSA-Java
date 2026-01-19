public class PositiveNegative {
	
	// ========================================================================
	// PROBLEM: Check if Number is Positive or Negative
	// ========================================================================
	/*
	 * Problem Statement: Check if number is positive or negative.
	 * Input: 10
	 * Output: 10 is Positive
	 * 
	 * Input: -5
	 * Output: -5 is Negative
	 * 
	 * Input: 0
	 * Output: 0 is Zero
	 */

	public static void main(String[] args) {

		int number = -+-+-4;
		System.out.format("number -> %d is %s.", number, checkNumber(number));
	}

	private static String checkNumber(int number) {

		if (number == 0) {
			return "zero";
		} else if (number < 0) {
			return "Negative";
		} else {
			return "Positive";
		}

	}

}
