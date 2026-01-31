package Java_Streams_Object;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TEST_1 {
	
	// ========================================================================
	// TEST 1: Department-wise Employee Count (Sorted by Count DESC)
	// ========================================================================
	/*
	 * Problem Statement: Count employees per department and sort departments
	 * by employee count in descending order.
	 *
	 * Approach: groupingBy + counting + sorting Map entries.
	 * Time Complexity: O(n log k)
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
		
		employees.stream()
					.collect(Collectors.groupingBy(
								Employee::getDepartment, 
								Collectors.counting()))
					.entrySet()
					.stream()
					.sorted(Map.Entry.<String, Long>comparingByValue().reversed())
					.forEach(System.out::println);
		
	}

}

// Output :
// IT=4
// Finance=2
// HR=2
