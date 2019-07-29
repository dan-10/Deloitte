package com.deloitte.cms.dao;

import java.util.ArrayList;
import java.util.List;

public class EmployeeApp {
	public static void main(String[] args) {
		EmployeeDOA e = new EmployeeDOA();
		e.insertEmployee();
		List<Employee> allemp = new ArrayList<Employee>();
		allemp = e.getAllEmployee();
		
		for(Employee ep : allemp)
			System.out.println(ep);
	}
}
