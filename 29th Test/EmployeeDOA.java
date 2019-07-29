package com.deloitte.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeDOA {
	
	private static final String SELECT_ALL_EMPLOYEE = "select * from hr.employee";
	private static final String INSERT_EMPLOYEE = "insert into hr.employee values(?,?,?,?,?) ";

	public List<Employee> getAllEmployee() {
		Connection con = DBUtility.getMyConnection();
		PreparedStatement st;
		List<Employee> allemp = new ArrayList<Employee>();
		try {
			st = con.prepareStatement(SELECT_ALL_EMPLOYEE);
			ResultSet rs = st.executeQuery();
			
			
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setFname(rs.getString(1));
				emp.setLastName(rs.getString(2));
				emp.setEmpId(rs.getString(3));
				emp.setDob(rs.getString(4));
				emp.setAddress(rs.getString(5));
				allemp.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allemp;
	}
	
	
	public boolean insertEmployee() {
		Connection con = DBUtility.getMyConnection();
		PreparedStatement st;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Name : ");
		String name = sc.next();
		
		System.out.println("Enter Last Name : ");
		String lname = sc.next();
		
		System.out.println("Enter Dob : ");
		String dob = sc.next();
		
		System.out.println("Enter Address : ");
		String add = sc.next();
		
		String eid = name.substring(0, 2) + lname.substring(0,2) + "00" + Integer.toString(Employee.count);
		
		Employee emp = new Employee(name,lname,eid,dob,add);
		int num = 0;
		try {
			st = con.prepareStatement(INSERT_EMPLOYEE);
			st.setString(1, emp.getFname());
			st.setString(2, emp.getLastName());
			st.setString(3, emp.getEmpId());
			st.setString(4, emp.getDob());
			st.setString(5, emp.getAddress());
			num = st.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		if(num ==0)
			return false;
		return true;
	}
}
