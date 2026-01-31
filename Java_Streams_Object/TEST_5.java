package Java_Streams_Object;

import java.util.List;

public class TEST_5 {
	
	// ========================================================================
	// TEST 5: Check If All Employees Earn More Than 25,000
	// ========================================================================
	/*
	 * Problem Statement: Check if all employees earn more than 25k.
	 *
	 * Approach: Use allMatch().
	 * Time Complexity: O(n)
	 * Space Complexity: O(1)
	 */
	
	public static void main(String[] args) {
		
		List<Employee> employees = List.of(
				new Employee(1, "Jay", "IT", 25, 60000),
                new Employee(2, "Amit", "HR", 30, 40000),
                new Employee(3, "Neha", "IT", 28, 75000),
                new Employee(4, "Rahul", "Finance", 35, 90000),
                new Employee(5, "Priya", "HR", 26, 45000),
                new Employee(6, "Arjun", "IT", 40, 120000),
                new Employee(7, "Sneha", "Finance", 29, 85000),
                new Employee(8, "Karan", "IT", 23, 30000)
		);
		
		boolean allAbove25k = 
				employees.stream()
						 .anyMatch(e -> e.getSalary() > 25000);
		
		System.out.println(allAbove25k);
		
	}

}

// Output :
// true
