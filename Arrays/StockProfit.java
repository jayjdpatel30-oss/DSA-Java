package DAY1;

public class StockProfit {

	// ========================================================================
	// PROBLEM 2: Best Time to Buy and Sell Stock
	// ========================================================================
	/**
	 * Problem Statement: You are given an array prices where prices[i] is the price
	 * of a given stock on the ith day. You want to maximize your profit by choosing
	 * a single day to buy one stock and choosing a different day in the future to
	 * sell that stock. Return the maximum profit you can achieve. If no profit,
	 * return 0.
	 * 
	 * Example: Input: prices = [7,1,5,3,6,4] Output: 5 Explanation: Buy on day 2
	 * (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
	 */

	/**
	 * Approach: Keep track of the minimum price seen so far and the maximum profit.
	 * For each price, calculate profit if we sell at current price (current - min).
	 * Update maxProfit if current profit is higher. Update minPrice if current
	 * price is lower.
	 * 
	 * At first set MinPrice as Integer.MAX_VALUE or prices[0]! do not set 0.
	 * 
	 * Time Complexity: O(n) - single pass through array Space Complexity: O(1) -
	 * only using two variables
	 */

	public static void main(String[] args) {

		System.out.println("Max Profit : " + maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));

	}

	public static int maxProfit(int[] prices) {

		int maxProfit = 0;
		int currentProfit = 0;
		int minPrice = Integer.MAX_VALUE;

		for (int i = 0; i < prices.length; i++) {

			if (prices[i] < minPrice) {
				minPrice = prices[i];
			}

			currentProfit = prices[i] - minPrice;

			maxProfit = Math.max(maxProfit, currentProfit);

		}

		return maxProfit;
	}

}
