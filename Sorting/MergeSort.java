package Sorting;

import java.util.Arrays;

public class MergeSort {
	
	/**
     * 4. MERGE SORT
     * 
     * Concept: Divide and Conquer
     * - Divide array into two halves
     * - Recursively sort both halves
     * - Merge sorted halves
     * 
     * Visualization:
     * [5,2,8,1,9,3,7,4]
     *     /        \
     * [5,2,8,1]  [9,3,7,4]
     *   /    \      /    \
     * [5,2] [8,1] [9,3] [7,4]
     *  / \   / \   / \   / \
     * [5][2][8][1][9][3][7][4]
     *  \ /   \ /   \ /   \ /
     * [2,5] [1,8] [3,9] [4,7]
     *   \    /      \    /
     * [1,2,5,8]  [3,4,7,9]
     *     \        /
     * [1,2,3,4,5,7,8,9]
     * 
     * Time Complexity:
     * - Best: O(n log n)
     * - Average: O(n log n)
     * - Worst: O(n log n)
     * Space Complexity: O(n) - requires auxiliary array
     * 
     * Stable: YES
     * When to use: Linked lists, guaranteed O(n log n), external sorting
     */

	public static void main(String[] args) {

		int[] numbers = { 5, 2, 8, 1, 9, 3, 7, 4 };
		mergeSort(numbers);
		System.out.println(Arrays.toString(numbers));
	}

	private static void mergeSort(int[] numbers) {

		if (numbers.length <= 1) {
			return;
		}

		int mid = numbers.length / 2;

		int[] leftArr = new int[mid];
		int[] rightArr = new int[numbers.length - mid];

		for (int i = 0; i < mid; i++) {
			leftArr[i] = numbers[i];
		}

		for (int i = mid; i < numbers.length; i++) {
			rightArr[i - mid] = numbers[i];
		}

		// Recursiv call
		mergeSort(leftArr);
		mergeSort(rightArr);

		merge(numbers, leftArr, rightArr);
	}

	private static void merge(int[] numbers, int[] left, int[] right) {
		
		int i = 0, j = 0, k = 0;
		
		while(i < left.length && j < right.length) {
			
			if(left[i] < right[j]) {
				numbers[k++] =  left[i++];
			}else {
				numbers[k++] =  right[j++];
			}
			
		}
		
		while(i < left.length) numbers[k++] = left[i++];
		
		while(j < right.length) numbers[k++] = right[j++];
	}

}
