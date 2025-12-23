package Sorting;

import java.util.Arrays;

public class QuickSort {

	/**
	 * 5. QUICK SORT
	 * 
	 * Concept: Divide and Conquer with partitioning - Pick a pivot element -
	 * Partition array: elements < pivot on left, > pivot on right - Recursively
	 * sort both partitions
	 * 
	 * Visualization (pivot = last element): [5,2,8,1,9,3,7,4] pivot=4 Partition:
	 * [2,1,3,4,9,8,7,5] ↑ [2,1,3] | 4 | [9,8,7,5] Recursively sort both sides...
	 * 
	 * Time Complexity: - Best: O(n log n) - balanced partitions - Average: O(n log
	 * n) - Worst: O(n²) - already sorted (with bad pivot) Space Complexity: O(log
	 * n) - recursion stack
	 * 
	 * Stable: NO (can be made stable) When to use: In-place sorting, arrays, good
	 * cache performance
	 */
	
	public static void main(String[] args) {
		
		int[] numbers = {5,2,8,1,9,3,7,4};
		quickSort(numbers);
		System.out.println(Arrays.toString(numbers));
		
	}
	
	public static void quickSort(int[] arr) {
		quickSortHelper(arr, 0, arr.length - 1);
	}

	private static void quickSortHelper(int[] arr, int low, int high) {
		if (low < high) {
			int pi = partition(arr, low, high);

			quickSortHelper(arr, low, pi - 1); // Left partition
			quickSortHelper(arr, pi + 1, high); // Right partition
		}
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1; // Index of smaller element

		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				// Swap
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// Place pivot in correct position
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}

}
