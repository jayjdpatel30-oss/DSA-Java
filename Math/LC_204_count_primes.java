package Math;

import java.util.Arrays;
import java.util.Iterator;

public class LC_204_count_primes {
	
	// ========================================================================
    // LeetCode 204: Count Primes
    // ========================================================================
    /**
     * Problem Statement:
     * Given an integer n, return the number of prime numbers that are 
     * strictly less than n.
     * 
     * Example 1:
     * Input: n = 10
     * Output: 4
     * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
     * 
     * Example 2:
     * Input: n = 0
     * Output: 0
     * 
     * Example 3:
     * Input: n = 1
     * Output: 0
     * 
     * Constraints:
     * - 0 <= n <= 5 * 10^6
     *
     * Approach:
     * Sieve of Eratosthenes - CLASSIC algorithm!
     * 1. Create boolean array of size n
     * 2. Mark all numbers as prime initially
     * 3. For each prime i, mark i², i²+i, i²+2i, ... as composite
     * 4. Count remaining primes
     * 
     * Why start from i²? All smaller multiples already marked!
     * 
     * Time Complexity: O(n log log n) - nearly linear!
     * Space Complexity: O(n)
     */
	
	public static void main(String[] args) {

		int n = 10;
		System.out.println(countPrimes(n));
	}

	private static int countPrimes(int n) {

		if (n <= 2) {
			return 0;
		}

		boolean[] primes = new boolean[n + 1];
		Arrays.fill(primes, true);

		primes[0] = primes[1] = false;

		for (int i = 2; i * i <= n; i++) {
			if (primes[i]) {
				for (int j = i * i; j <= n; j += i) {
					primes[j] = false;
				}
			}
		}

		int count = 0;

		for (int i = 2; i <= n; i++) {
			if (primes[i]) {
				count++;
			}
		}

		return count;
	}

}
