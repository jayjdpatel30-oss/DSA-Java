package BinarySearch;

public class FirstBadVersion {

	/**
	 * Problem Statement :
	 * 
	 * You are given n versions [1..n]. A version is bad if it fails quality checks.
	 * You have an API isBadVersion(version) that tells whether a version is bad.
	 * Find the first bad version (smallest index that is bad).
	 * 
	 * Input: n = 5, bad = 4 Output: 4 Explanation: call isBadVersion(3) -> false
	 * call isBadVersion(5) -> true call isBadVersion(4) -> true Then 4 is the first
	 * bad version.
	 * 
	 * Approach
	 * 
	 * Use binary search:
	 * 
	 * If mid is bad → answer is at mid or left, so move right = mid - 1
	 * 
	 * Else → move left = mid + 1
	 * 
	 * Finally left will be the first bad version.
	 * 
	 * Time Complexity → O(log n) Space Complexity → O(1)
	 */

	static int n = 5, bad = 4;

	public static void main(String[] args) {

		System.out.println("First Bad : " + firstBadVersion(n));

	}

	public static int firstBadVersion(int n) {

		int left = 1, right = n;

		while (left < right) {

			int mid = left + (right - left) / 2;

			if (isBadVersion(mid)) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}

		}

		return left;
	}

	public static boolean isBadVersion(int n) {
		return n >= bad;
	}

}
