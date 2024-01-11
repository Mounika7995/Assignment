package com.crnts.assignment;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NameOfAllEmployee {
	public void namesOfEmployees() {
		 Map<String, List<Employee>> map = EmployeeDetails.employeeDetails().
				 stream().collect(Collectors.groupingBy(Employee::getDepartment));
		 
		 map.entrySet().stream().forEach(e->System.out.println(e.getKey()));
	}
	public static void main(String[] args) {
		NameOfAllEmployee nameOfAllEmployee =new NameOfAllEmployee(); 
		nameOfAllEmployee.namesOfEmployees();
	}
}
