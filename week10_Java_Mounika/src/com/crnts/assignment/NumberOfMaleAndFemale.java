package com.crnts.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NumberOfMaleAndFemale {
	public static void main(String[] args) {
		NumberOfMaleAndFemale numberOfMaleAndFemale = new NumberOfMaleAndFemale();
		numberOfMaleAndFemale.countOfMaleAndFemale();
	}

	

	public void countOfMaleAndFemale() {
		EmployeeDetails.employeeDetails().stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())).
		entrySet().stream().forEach(System.out::println);

	}
}
