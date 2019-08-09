package com.deloitte.cms.dao;

import java.util.Set;

public class EmployeeDetails {
	
	private int employeeId;
	private String employeeName;
	private int employeeSalary;
	private Set employeeAddress;
	
	public EmployeeDetails() {
	// TODO Auto-generated constructor stub
	}

	public EmployeeDetails(int employeeId, String string, int employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = string;
		this.employeeSalary = employeeSalary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public Set getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(Set employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeDetails other = (EmployeeDetails) obj;
		if (employeeAddress == null) {
			if (other.employeeAddress != null)
				return false;
		} else if (!employeeAddress.equals(other.employeeAddress))
			return false;
		if (employeeId != other.employeeId)
			return false;
		if (employeeName != other.employeeName)
			return false;
		if (employeeSalary != other.employeeSalary)
			return false;
		return true;
	}

	public EmployeeDetails(int employeeId, String employeeName, int employeeSalary, Set employeeAddress) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeAddress = employeeAddress;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", employeeAddress=" + employeeAddress + "]";
	}

}
