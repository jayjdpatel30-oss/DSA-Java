package Recursion;

public class Fibonacci {

	// ============================================================================
    // PROBLEM 6: FIBONACCI - CALCULATE NTH NUMBER
    // ============================================================================
    /**
     * Problem: Find the nth Fibonacci number
     * Sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...
     * Example: fib(6) = 8
     * 
     * APPROACH:
     * - Base Cases: fib(0) = 0, fib(1) = 1
     * - Recursive Case: fib(n) = fib(n-1) + fib(n-2)
     * 
     * TIME COMPLEXITY: O(2^n) - EXPONENTIAL! (Very slow for large n)
     * SPACE COMPLEXITY: O(n) - maximum recursion depth
     * 
     * WHY SO SLOW? Redundant calculations!
     * For fib(5):
     *                    fib(5)
     *                   /      \
     *              fib(4)      fib(3)
     *              /    \      /    \
     *         fib(3)  fib(2) fib(2) fib(1)
     *         /   \    /  \   /  \
     *    fib(2) fib(1) ... ... ...
     * 
     * Notice: fib(3) calculated 2 times, fib(2) calculated 3 times!
     */
	
	public static void main(String[] args) {

		int number = 5;
		System.out.println("Fibonnaci number : " + fibonacci(number) );
	}

	private static int fibonacci(int number) {

		if (number == 0) {
			return 0;
		}

		if (number == 1) {
			return 1;
		}

		return fibonacci(number - 1) + fibonacci(number - 2);
	}

}
