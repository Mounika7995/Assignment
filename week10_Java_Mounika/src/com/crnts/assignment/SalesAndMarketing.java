package com.crnts.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SalesAndMarketing {
	public static void main(String[] args) {
		SalesAndMarketing salesAndMarketing = new SalesAndMarketing();
		salesAndMarketing.employeeDetails();
	}

	public void employeeDetails() {
		EmployeeDetails.employeeDetails().stream().filter(e->"Sales".equals(e.getDepartment())||
				"Marketing".equals(e.getDepartment())).
		collect(Collectors.groupingBy(Employee::getGender,Collectors.counting())).
		entrySet().forEach(e->{
			System.out.println(e.getKey()+" --"+e.getValue());
		});
		

	}
}
