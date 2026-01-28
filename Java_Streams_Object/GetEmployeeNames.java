package Java_Streams_Object;

import java.util.List;
import java.util.stream.Collectors;

public class GetEmployeeNames {
	
	// ========================================================================
	// PROBLEM : Get All Employee Names
	// ========================================================================
	/*
	 * Problem Statement: Extract all employee names into a list.
	 * 
	 * Approach: Use map(Employee::getName) and collect.
	 * Time Complexity: O(n)
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
		 
		 List<String> names = employees.stream().map(Employee::getName).collect(Collectors.toList());
		 
		 System.out.println(names);
		 
	}

}

// Output :
// [Jay, Amit, Neha, Rahul, Priya, Arjun, Sneha, Karan]
