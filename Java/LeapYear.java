package Java;

public class LeapYear {
	
	//========================================================================
	// PROBLEM: Check Leap Year
	// ========================================================================
	/*
	 * Problem Statement: Check if a given year is leap year or not.
	 * Input: 2020 Output: "2020 is a Leap Year"
	 * Input: 2019 Output: "2019 is not a Leap Year"
	 * Input: 2000 Output: "2000 is a Leap Year"
	 * 
	 * Rules: Divisible by 4 AND (not divisible by 100 OR divisible by 400)
	 */
	public static void main(String[] args) {
		
		int year = 2026;
		
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year + " is a Leap Year");
		} else {
			System.out.println(year + " is not a Leap Year");
		}
	}

}
