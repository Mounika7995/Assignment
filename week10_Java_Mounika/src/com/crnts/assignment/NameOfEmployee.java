package com.crnts.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NameOfEmployee {
	public void nameOfEmployee() {
		 EmployeeDetails.employeeDetails().
				stream().filter(e->e.getYearOfJoining()>2015).forEach(e->System.out.println(e.getName()));

		
		
		
	}
	
	public static void main(String[] args) {
		NameOfEmployee nameOfEmployee = new NameOfEmployee();
		nameOfEmployee.nameOfEmployee();
	}
}
