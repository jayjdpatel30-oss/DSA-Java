package TwoPointers_SlidingWindow;

public class ContainerWithMostWater {

	// ========================================================================
	// BONUS PROBLEM: Container With Most Water (Classic Two Pointers)
	// ========================================================================
	/**
	 * Problem Statement: Given n non-negative integers representing an elevation
	 * map where the width of each bar is 1, find two lines that together with the
	 * x-axis form a container that holds the most water.
	 * 
	 * Example: Input: height = [1,8,6,2,5,4,8,3,7] Output: 49
	 */

	/**
	 * Approach: Two pointers from both ends: - Area = min(height[left],
	 * height[right]) * (right - left) - Move the pointer with smaller height (only
	 * way to potentially increase area) - Keep track of maximum area seen
	 * 
	 * Greedy choice: Moving smaller height gives us a chance to find taller line
	 * 
	 * Time Complexity: O(n) - single pass Space Complexity: O(1) - only pointers
	 */
	public static void main(String[] args) {

		int[] heights = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println("Max area is : " + maxArea(heights));

	}

	private static int maxArea(int[] heights) {

		int maxArea = 0;
		int left = 0, right = heights.length - 1;

		while (left < right) {

			int width = right - left;
			int length = Math.min(heights[left], heights[right]);

			int currentArea = length * width;

			maxArea = Math.max(maxArea, currentArea);

			if (heights[left] < heights[right]) {
				left++;
			} else {
				right--;
			}

		}

		return maxArea;
	}

}
