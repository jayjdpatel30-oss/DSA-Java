package Java_Streams_Object;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeeBySalary {
	
	// ========================================================================
	// PROBLEM : Sort Employees by Salary (Ascending)
	// ========================================================================
	/*
	 * Problem Statement: Sort employees based on salary in ascending order.
	 * 
	 * Approach: Use sorted() with Comparator.comparingDouble().
	 * Time Complexity: O(n log n)
	 * Space Complexity: O(n)
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
	 
		employees.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
	 
	}

}

// Output:
// 8 Karan IT 23 30000.0
// 2 Amit HR 30 40000.0
// 5 Priya HR 26 45000.0
// 1 Jay IT 25 60000.0
// 3 Neha IT 28 75000.0
// 7 Sneha Finance 29 85000.0
// 4 Rahul Finance 35 90000.0
// 6 Arjun IT 40 120000.0
