package Java;

public class RightTrianglePattern {
	
	//========================================================================
	// PROBLEM: Print Pattern - Right Triangle
	// ========================================================================
	/*
	* Problem Statement: Print right triangle pattern using stars.
	* Input: 5 Output:
	* *
	* * *
	* * * *
	* * * * *
	* * * * * *
	*/
	public static void main(String[] args) {
		
		int n = 5;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
