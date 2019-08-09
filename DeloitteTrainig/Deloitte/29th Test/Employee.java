package com.deloitte.cms.dao;

public class Employee {
	private String Fname;
	private String LastName;
	private String EmpId;
	private String dob;
	private String Address;
	public static int count = 1;
	
	public Employee() {
		super();
		++count;
	}
	public Employee(String fname, String lastName, String empId, String dob, String address) {
		this();
		Fname = fname;
		LastName = lastName;
		EmpId = empId;
		this.dob = dob;
		Address = address;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmpId() {
		return EmpId;
	}
	public void setEmpId(String empId) {
		EmpId = empId;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Address == null) ? 0 : Address.hashCode());
		result = prime * result + ((EmpId == null) ? 0 : EmpId.hashCode());
		result = prime * result + ((Fname == null) ? 0 : Fname.hashCode());
		result = prime * result + ((LastName == null) ? 0 : LastName.hashCode());
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (Address == null) {
			if (other.Address != null)
				return false;
		} else if (!Address.equals(other.Address))
			return false;
		if (EmpId == null) {
			if (other.EmpId != null)
				return false;
		} else if (!EmpId.equals(other.EmpId))
			return false;
		if (Fname == null) {
			if (other.Fname != null)
				return false;
		} else if (!Fname.equals(other.Fname))
			return false;
		if (LastName == null) {
			if (other.LastName != null)
				return false;
		} else if (!LastName.equals(other.LastName))
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [Fname=" + Fname + ", LastName=" + LastName + ", EmpId=" + EmpId + ", dob=" + dob
				+ ", Address=" + Address + "]";
	}
	
	
	
	
}
