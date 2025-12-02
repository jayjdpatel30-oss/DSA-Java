package BinarySearch;

import java.lang.Math;

public class SquareRoot {

	/**
	 * Problem Statement
	 * 
	 * Given a non-negative integer x, return the integer part of the square root of
	 * x (floor value).
	 * 
	 * Input: x = 4 Output: 2 Explanation: The square root of 4 is 2, so we return
	 * 2. Example 2:
	 * 
	 * Input: x = 8 Output: 2 Explanation: The square root of 8 is 2.82842..., and
	 * since we round it down to the nearest integer, 2 is returned.
	 */

	public static void main(String[] args) {

//		System.out.println("Square root is : " + (int) Math.sqrt(8));

		System.out.println("Square root is : " + (int) sqrt(24));

	}

	private static int sqrt(int x) {

		int left = 0, right = x;

		while (left <= right) {

			int mid = left + (right - left) / 2;

			int sq = mid * mid;

			if (sq == x) {
				return (int) mid;
			} else if (sq > x) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}

		}

		return (int) left - 1;
	}

}
