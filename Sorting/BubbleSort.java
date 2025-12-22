package Sorting;

import java.util.Arrays;

public class BubbleSort {

	/**
     * 1. BUBBLE SORT
     * 
     * Concept: Repeatedly swap adjacent elements if they're in wrong order.
     * "Bubbles" largest element to the end in each pass.
     * 
     * Visualization:
     * Pass 1: [5,2,8,1,9] → [2,5,1,8,9] (9 bubbled to end)
     * Pass 2: [2,5,1,8,9] → [2,1,5,8,9] (8 in place)
     * Pass 3: [2,1,5,8,9] → [1,2,5,8,9] (5 in place)
     * Pass 4: [1,2,5,8,9] → [1,2,5,8,9] (sorted!)
     * 
     * Time Complexity:
     * - Best: O(n) - already sorted (with optimization)
     * - Average: O(n²)
     * - Worst: O(n²) - reverse sorted
     * Space Complexity: O(1) - in-place
     * 
     * Stable: YES
     * When to use: Educational purposes, tiny datasets, nearly sorted data
     */

	public static void main(String[] args) {

//		int[] numbers = { 1, 5, 3, 6, 7, 8, 10, 2, 4, 9 };
		int[] numbers = { 5, 2, 8, 1, 9 };
		bubbleSort(numbers);
		System.out.println(Arrays.toString(numbers));
		Arrays.sort(numbers);
	}

	private static void bubbleSort(int[] numbers) {

		if (numbers.length <= 1) {
			return;
		}

		for (int i = 0; i < numbers.length; i++) {

			boolean isSwapped = false;

			for (int j = 0; j < numbers.length - 1 - i; j++) {
				if (numbers[j] > numbers[j + 1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
					isSwapped = true;
				}
			}

			if (!isSwapped) {
				return;
			}
		}
	}

}
