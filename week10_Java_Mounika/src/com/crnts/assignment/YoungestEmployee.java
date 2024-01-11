package com.crnts.assignment;

import java.util.Comparator;
import java.util.stream.Collectors;

public class YoungestEmployee {
	public static void main(String[] args) {
		EmployeeDetails.employeeDetails().stream().
		collect(Collectors.groupingBy(Employee::getDepartment)).entrySet().
		forEach(e->{
			System.out.println(e.getKey());
			e.getValue().stream().forEach(e1->System.out.println("Name of employee "+e1.getName()));
		});
	}
}
