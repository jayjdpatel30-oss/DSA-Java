package Java_Streams_Object;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TEST_4 {
	
	// ========================================================================
	// TSET 4: Department with Highest Average Salary
	// ========================================================================
	/*
	 * Problem Statement: Find department with highest average salary.
	 *
	 * Approach: groupingBy + averagingDouble + max entry.
	 * Time Complexity: O(n)
	 * Space Complexity: O(k)
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
		
		Map.Entry<String, Double> dept =
                employees.stream()
                         .collect(Collectors.groupingBy(
                                 Employee::getDepartment,
                                 Collectors.averagingDouble(Employee::getSalary)
                         ))
                         .entrySet()
                         .stream()
                         .max(Map.Entry.comparingByValue())
                         .orElse(null);
		
        System.out.println(dept);
	}

}

// Output :
// Finance=87500.0
