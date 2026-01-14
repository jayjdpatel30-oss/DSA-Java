package Java;

public class FibonacciSeries {
	
	// ========================================================================
	// PROBLEM: Fibonacci Series
	// ========================================================================
	/*
	 * Problem Statement: Generate first n Fibonacci numbers.
	 * Input: 6 Output: 0, 1, 1, 2, 3, 5
	 * Input: 8 Output: 0, 1, 1, 2, 3, 5, 8, 13
	 * Input: 1 Output: 0
	 * 
	 * Approach: Start with 0 and 1, each next number is sum of previous two.
	 * Time Complexity: O(n) | Space Complexity: O(n)
	 */
	    public static void main(String[] args) {
	        int n = 6;
	        System.out.println("First " + n + " Fibonacci numbers:");
	        generateFibonacci(n);
	    }
	    
	    private static void generateFibonacci(int n) {
	        if (n <= 0) {
	            return;
	        }
	        
	        long a = 0, b = 1;
	        System.out.print(a + ", ");
	        
	        if (n > 1) {
	            System.out.print(b + ", ");
	        }
	        
	        for (int i = 2; i < n; i++) {
	            long c = a + b;
	            System.out.print(c);
	            if (i < n - 1) {
	                System.out.print(", ");
	            }
	            a = b;
	            b = c;
	        }
	        System.out.println();
	    }

}
