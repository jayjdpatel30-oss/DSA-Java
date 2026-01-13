package Foundation_problems;

public class spliArrayEqualSum {

	// ========================================================================
	// PROBLEM : Split Array into Two Equal Sum Parts
	// ========================================================================

	/**
	 * Approach: 
	 * 
	 * Find total sum, then iterate while keeping prefix sum.
	 * 
	 * Time Complexity: O(n) 
	 * Space Complexity: O(1)
	 */
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 3 };
		System.out.println(canSplit(arr));
	}

	private static boolean canSplit(int[] arr) {

		int total = 0;

		for (int num : arr) {
			total += num;
		}

		int prefix = 0;
		
		for (int num : arr) {
			prefix += num;
			
			if (prefix * 2 == total) {
				return true;
			}
		}
		
		return false;
	}
}
