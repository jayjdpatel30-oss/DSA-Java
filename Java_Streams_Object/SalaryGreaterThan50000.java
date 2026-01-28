package Java_Streams_Object;

import java.util.List;

public class SalaryGreaterThan50000 {

	// ========================================================================
	// PROBLEM : Employees with Salary > 50000
	// ========================================================================
	/*
	 * Problem Statement: Print employees whose salary is greater than 50,000.
	 * 
	 * Approach: Use filter() on salary field. Time Complexity: O(n) Space
	 * Complexity: O(1)
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

		employees.stream().filter(e -> e.getSalary() > 50000).forEach(System.out::println);
	}

}

// Output :
// 1 Jay IT 25 60000.0
// 3 Neha IT 28 75000.0
// 4 Rahul Finance 35 90000.0
// 6 Arjun IT 40 120000.0
// 7 Sneha Finance 29 85000.0
