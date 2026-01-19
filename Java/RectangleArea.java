public class RectangleArea {

	// ========================================================================
	// PROBLEM: Calculate Area of Rectangle
	// ========================================================================
	/*
	 * Problem Statement: Calculate and print area of rectangle.
	 * Formula: Area = length * width
	 * 
	 * Input: length = 5, width = 4
	 * Output: Area of Rectangle = 20
	 */

	public static void main(String[] args) {

		int lenght = 5;
		int width = 3;
		System.out.println("Area of Circle is : " + area(lenght, width));
	}

	private static double area(int length, int width) {
		return length * width;
	}
}
