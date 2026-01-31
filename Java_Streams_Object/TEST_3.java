package Java_Streams_Object;

import java.util.List;
import java.util.stream.Collectors;

public class TEST_3 {
	
	// ========================================================================
	// TEST 3: Average Salary of Employees Age > 30
	// ========================================================================
	/*
	 * Problem Statement: Find average salary of employees older than 30.
	 *
	 * Approach: Filter by age, mapToDouble, average.
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
		
		double avg = 
				employees.stream()
				 	.filter(e -> e.getAge() > 30)
				 	.mapToDouble(Employee::getSalary)
				 	.average()
				 	.orElse(0.0);
				 
		System.out.println(avg);
		
	}

}

// Output :
// 105000.0
