package Sorting;

import java.util.Arrays;

public class SelectionSort {
	
	/**
     * 2. SELECTION SORT
     * 
     * Concept: Find minimum element and place it at beginning.
     * Divide array into sorted and unsorted parts.
     * 
     * Visualization:
     * [5,2,8,1,9]
     *  ^         Find min (1), swap with first → [1,2,8,5,9]
     *    ^       Find min (2), already there   → [1,2,8,5,9]
     *      ^     Find min (5), swap            → [1,2,5,8,9]
     *        ^   Find min (8), already there   → [1,2,5,8,9]
     * 
     * Time Complexity:
     * - Best: O(n²)
     * - Average: O(n²)
     * - Worst: O(n²)
     * Space Complexity: O(1) - in-place
     * 
     * Stable: NO (can be made stable with extra space)
     * When to use: Small datasets, memory writes are expensive
     */

	public static void main(String[] args) {

		int[] numbers = { 5, 2, 8, 1, 9 };
		selectionSort(numbers);
		System.out.println(Arrays.toString(numbers));
	}

	private static void selectionSort(int[] numbers) {

		if (numbers.length <= 1) {
			return;
		}

		for (int i = 0; i < numbers.length; i++) {

			int minIndex = i;

			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[j] < numbers[minIndex]) {
					minIndex = j;
				}
			}

			if (i != minIndex) {
				int temp = numbers[i];
				numbers[i] = numbers[minIndex];
				numbers[minIndex] = temp;
			}
		}
		
	}

}
