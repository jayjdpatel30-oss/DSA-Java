package Foundation_problems;

import java.util.Arrays;

public class KidsWithTheGreatestNumberOfCandies {
	/**
	 * Problem Statement: Given the array candies and the integer extraCandies,
	 * where candies[i] represents the number of candies that the i-th kid has. For
	 * each kid, check if there is a way to distribute extraCandies among them such
	 * that they can have the greatest number of candies among all the kids. Notice
	 * that multiple kids can have the greatest number of candies.
	 * 
	 * 
	 * Input: candies = [2,3,5,1,3], extraCandies = 3 Output:
	 * [true,true,true,false,true] Explanation: Max candies currently = 5. With 3
	 * extra: Kid 0:2+3=5, Kid 1:3+3=6, Kid 2:5+3=8, Kid 3:1+3=4, Kid 4:3+3=6
	 * 
	 * Input: candies = [4,2,1,1,2], extraCandies = 1 Output:
	 * [true,false,false,false,false]
	 * 
	 * Input: candies = [12,1,12], extraCandies = 10 Output: [true,false,true]
	 * 
	 * Approach: First, find the maximum candies any kid currently has. Then, for
	 * each kid, check if their candies plus extraCandies is >= the maximum.
	 * 
	 * Time Complexity: O(n) Space Complexity: O(n) - Result list
	 */

	public static void main(String[] args) {

		int[] candies = { 12, 1, 12 };
		int extraCandies = 10;

		System.out.println(Arrays.toString(hasMaxCandies(candies, extraCandies)));

	}

	private static boolean[] hasMaxCandies(int nums[], int extraCandies) {

		boolean[] result = new boolean[nums.length];

		// The first persons candies + extraCandies are the max candies
		// If the current persons candies + extraCandies are more that max. then set
		// true else false

		int maxCandies = nums[0] + extraCandies;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] + extraCandies >= maxCandies) {
				result[i] = true;
			} else {
				result[i] = false;
			}

		}

		return result;
	}
}