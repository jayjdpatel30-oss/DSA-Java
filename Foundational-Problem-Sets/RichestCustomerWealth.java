package Foundation_problems;

public class RichestCustomerWealth {

	/**
	 * Problem Statement: You are given an m x n integer grid accounts where
	 * accounts[i][j] is the amount of money the i-th customer has in the j-th bank.
	 * Return the wealth that the richest customer has. A customer's wealth is the
	 * sum of money they have in all their bank accounts.
	 * 
	 * Test Cases: Input: accounts = [[1,2,3],[3,2,1]] Output: 6 Explanation:
	 * Customer 0 has wealth = 6, Customer 1 has wealth = 6. Both have max wealth 6.
	 * 
	 * Input: accounts = [[1,5],[7,3],[3,5]] Output: 10 Explanation: Customer 1 has
	 * wealth = 10.
	 * 
	 * Input: accounts = [[2,8,7],[7,1,3],[1,9,5]] Output: 17
	 * 
	 * Approach: Iterate through each customer's accounts, calculate their total
	 * wealth, and keep track of the maximum wealth found.
	 * 
	 * Time Complexity: O(m × n) where m = customers, n = banks Space Complexity:
	 * O(1)
	 */

	public static void main(String[] args) {

//		int nums[][] = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
		int nums[][] = { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } };
//		int nums[][] = { { 1, 2, 3 }, { 3, 2, 1 } };
		System.out.println("Richest Customer amount : " + reachestCustomer(nums));

	}

	private static int reachestCustomer(int[][] nums) {

		int maxAmount = 0;

		for (int i = 0; i < nums.length; i++) {

			int customerAmount = 0;

			for (int j = 0; j < nums[i].length; j++) {
				customerAmount += nums[i][j];
			}

			maxAmount = Math.max(maxAmount, customerAmount);
		}

		return maxAmount;
	}
}
