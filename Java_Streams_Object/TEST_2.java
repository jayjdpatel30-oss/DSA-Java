package Java_Streams_Object;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TEST_2 {

	// ========================================================================
	// TSET 2: Names of Top 3 Highest Paid Employees
	// ========================================================================
	/*
	 * Problem Statement: Get names of top 3 highest paid employees.
	 *
	 * Approach: Sort by salary DESC, limit 3, map to names.
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
		
		 List<String> top3Names =
	                employees.stream()
	                         .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
	                         .limit(3)
	                         .map(Employee::getName)
	                         .toList();
		 
	     System.out.println(top3Names);

	}

}

// Output :
// [Arjun, Rahul, Sneha]
