package Java_Streams_Object;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindHigestPaidEmployee {
	
	// ========================================================================
	// PROBLEM : Find Highest Paid Employee
	// ========================================================================
	/*
	 * Problem Statement: Find employee with highest salary.
	 * 
	 * Approach: Use max() with comparator on salary.
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
		
		Employee higestPaid = employees.stream().max(Comparator.comparing(Employee::getSalary)).orElse(null);
		
		System.out.println(higestPaid);
		
	}

}

// Output :
// 6 Arjun IT 40 120000.0
