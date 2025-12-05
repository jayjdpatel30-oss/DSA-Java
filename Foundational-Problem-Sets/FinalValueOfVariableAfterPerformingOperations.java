package Foundation_problems;

public class FinalValueOfVariableAfterPerformingOperations {

	/**
	 * Problem Statement: There is a programming language with only four operations
	 * and one variable X:
	 * 
	 * ++X and X++ increments the value of the variable X by 1. --X and X--
	 * decrements the value of the variable X by 1.
	 * 
	 * Initially, the value of X is 0. Given an array of strings operations
	 * containing a list of operations, return the final value of X after performing
	 * all the operations.
	 * 
	 * Input: operations = ["--X","X++","X++"] Output: 1 Explanation: Operations:
	 * --X (X=0-1=-1), X++ (X=-1+1=0), X++ (X=0+1=1)
	 * 
	 * Input: operations = ["++X","++X","X++"] Output: 3
	 * 
	 * Input: operations = ["X++","++X","--X","X--"] Output: 0
	 * 
	 * Approach: Start with X = 0. For each operation, check if it contains '+'
	 * (increment) or '-' (decrement).
	 * 
	 * Time Complexity: O(n) Space Complexity: O(1)
	 */

	public static void main(String[] args) {
		String[] operations = { "--X", "X++", "X++" };
		System.out.println("Value : " + valueAfterOperations(operations));
		System.out.println("Value : " + finalValue(operations));
	}

	private static int valueAfterOperations(String[] operations) {

		int value = 0;

		for (int i = 0; i < operations.length; i++) {

//			if (operations[i].charAt(0) == '+') {
//				value++;
//			} else if (operations[i].charAt(0) == '-') {
//				value--;
//			} else if (operations[i].charAt(0) == 'X' && operations[i].charAt(1) == '+') {
//				value++;
//			} else {
//				value--;
//			}

			if (operations[i] == "++X" || operations[i] == "X++") {
				value++;
			} else {
				value--;
			}

		}

		return value;
	}

	// using contains method
	private static int finalValue(String[] operations) {

		int x = 0;

		for (String op : operations) {
			if (op.contains("+")) {
				x++;
			} else {
				x--;
			}
		}

		return x;
	}

}
