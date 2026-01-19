public class CircleArea {
	
	// ========================================================================
	// PROBLEM: Calculate Area of Circle
	// ========================================================================
	/*
	 * Problem Statement: Calculate and print area of circle.
	 * Formula: Area = π * radius²
	 * 
	 * Input: radius = 5
	 * Output: Area of Circle = 78.5
	 */

	public static void main(String[] args) {

		int radius = 5;
		System.out.println("Area of Circle is : " + area(radius));
	}

	private static double area(int radius) {
		return (Math.PI * radius * radius);
	}
}
