package com.crnts.assignment;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class EmployeeTestClass {
	public boolean checkName() {
		List<String> collect = EmployeeDetails.employeeDetails().stream().map(Employee::getName).
		collect(Collectors.toList());

		for (String string : collect) {
			if(string.equals("Gopi")) {
				return true;
			}
		}
		return false;
	}
	@Test
	public void testMethod() {
		checkName();
		
	}
}
