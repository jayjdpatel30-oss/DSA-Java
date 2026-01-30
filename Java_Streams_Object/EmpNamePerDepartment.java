package Java_Streams_Object;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpNamePerDepartment {
	
	// ========================================================================
	// PROBLEM : Employee Names per Department
	// ========================================================================
	/*
	 * Problem Statement: Get employee names grouped by department.
	 * 
	 * Output:
	 * IT -> [Jay, Neha, Arjun, Karan]
	 * 
	 * Approach: groupingBy() + mapping().
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
		
		
		Map<String, List<String>> names = employees.stream().
				collect(Collectors.groupingBy(
							Employee::getDepartment, 
							Collectors.mapping(Employee::getName,Collectors.toList())));
		
		System.out.println(names);
	}

}

// Output : 
// {Finance=[Rahul, Sneha], HR=[Amit, Priya], IT=[Jay, Neha, Arjun, Karan]}
