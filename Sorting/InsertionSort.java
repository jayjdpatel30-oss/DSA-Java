package Sorting;

import java.util.Arrays;

public class InsertionSort {
	
	/**
     * 3. INSERTION SORT
     * 
     * Concept: Build sorted array one element at a time.
     * Like sorting playing cards in your hand.
     * 
     * Visualization:
     * [5,2,8,1,9]
     * [5] | 2,8,1,9      Insert 2 → [2,5] | 8,1,9
     * [2,5] | 8,1,9      Insert 8 → [2,5,8] | 1,9
     * [2,5,8] | 1,9      Insert 1 → [1,2,5,8] | 9
     * [1,2,5,8] | 9      Insert 9 → [1,2,5,8,9]
     * 
     * Time Complexity:
     * - Best: O(n) - already sorted
     * - Average: O(n²)
     * - Worst: O(n²) - reverse sorted
     * Space Complexity: O(1) - in-place
     * 
     * Stable: YES
     * When to use: Small datasets, nearly sorted data, online sorting
     */

	public static void main(String[] args) {

		int[] numbers = { 5, 2, 8, 1, 9 };
		insertionSort(numbers);
		System.out.println(Arrays.toString(numbers));

	}

	private static void insertionSort(int[] numbers) {

		if (numbers.length <= 1) {
			return;
		}

		for (int i = 1; i < numbers.length; i++) {

			int key = numbers[i];

			int j = i - 1;
			while (j >= 0 && key < numbers[j]) {
				numbers[j + 1] = numbers[j];
				j--;
			}

			numbers[j + 1] = key;
		}

	}

}
