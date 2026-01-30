package Java_Streams_Object;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class HighestPaidPerDepartment {
	
	// ========================================================================
	// PROBLEM : Highest Paid Employee per Department
	// ========================================================================
	/*
	 * Problem Statement: Find highest paid employee in each department.
	 * 
	 * Approach: groupingBy() + maxBy().
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
		
		Map<String, Optional<Employee>> result = 
				employees.stream().
				collect(Collectors.groupingBy(
						Employee::getDepartment, 
						Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
		
		System.out.println(result);
		
	}
}

// Output :
// {Finance=Optional[4 Rahul Finance 35 90000.0], HR=Optional[5 Priya HR 26 45000.0], IT=Optional[6 Arjun IT 40 120000.0]}
