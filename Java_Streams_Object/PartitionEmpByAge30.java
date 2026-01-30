package Java_Streams_Object;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PartitionEmpByAge30 {
	
	// ========================================================================
	// PROBLEM : Partition Employees by Age (<30 and >=30)
	// ========================================================================
	/*
	 * Problem Statement: Partition employees into two groups:
	 * - Age < 30
	 * - Age >= 30
	 * 
	 * Approach: Use partitioningBy().
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
		
		Map<Boolean, List<Employee>> list = employees.stream().collect(Collectors.partitioningBy(e -> e.getAge() < 30));

		System.out.println(list);
		
	}
	
}

// Output :
// {false=[2 Amit HR 30 40000.0, 4 Rahul Finance 35 90000.0, 6 Arjun IT 40 120000.0], true=[1 Jay IT 25 60000.0, 3 Neha IT 28 75000.0, 5 Priya HR 26 45000.0, 7 Sneha Finance 29 85000.0, 8 Karan IT 23 30000.0]}
