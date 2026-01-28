package Java_Streams_Object;

import java.util.List;

public class EmployeeFromItDepartment {

	// ========================================================================
	// PROBLEM : Employees from IT Department
	// ========================================================================
	/*
	 * Problem Statement: Print all employees who belong to IT department.
	 * 
	 * Approach: Filter employees where department equals "IT". Time Complexity:
	 * O(n) Space Complexity: O(1)
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

		employees.stream().filter(e -> e.getDepartment().equalsIgnoreCase("IT")).forEach(System.out::println);
	}

}

// Output :
// 1 Jay IT 25 60000.0
// 3 Neha IT 28 75000.0
// 6 Arjun IT 40 120000.0
// 8 Karan IT 23 30000.0
