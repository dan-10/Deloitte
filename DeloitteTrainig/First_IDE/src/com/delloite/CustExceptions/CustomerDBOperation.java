package com.delloite.CustExceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CustomerDBOperation {
	public static void viewAll() throws ClassNotFoundException, SQLException {
		
		
		Connection con = DBUtility.getMyConnection();
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("Select * From HR.Customer");
		
		while(rs.next()) {
			System.out.println(rs.getString(1) + " : " + rs.getString(2) + " : "+ rs.getString(3)+ " : " + rs.getString(4));
		}
	}
	
	
	public static void insertVal() throws SQLException, ClassNotFoundException {
		
		Connection con = DBUtility.getMyConnection();
		Statement st = con.createStatement();
		
		int n = st.executeUpdate("INSERT INTO HR.Customer VALUES (6,'Raju','Assam',106)");
		System.out.println("The number of rows updated are : " + n);
		System.out.println("After updating the table the tale is as : ");
		viewAll();
	}
	
	public static void insertUserVal() throws SQLException, ClassNotFoundException {
		
		Connection con = DBUtility.getMyConnection();
		Statement st = con.createStatement();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the id : ");
		int id = sc.nextInt();
		
		System.out.print("Enter the Name : ");
		String name = sc.next();
		
		System.out.print("Enter the place : ");
		String place = sc.next();
		
		System.out.print("Enter the id : ");
		int bill = sc.nextInt();
		
		
		int n = st.executeUpdate("INSERT INTO HR.Customer VALUES (" +id+ ", ' " + name+ " ', ' "+place+" ', " +bill+ ")");
		System.out.println("The number of rows updated are : " + n);
		System.out.println("After updating the table the tale is as : ");
		viewAll();
	
}
	
	public static void insertUserValPrep() throws SQLException, ClassNotFoundException {
		
		Connection con = DBUtility.getMyConnection();
		PreparedStatement st = con.prepareStatement("INSERT INTO hr.Customer VALUES(?,?,?,?)");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the id : ");
		int id = sc.nextInt();
		
		System.out.print("Enter the Name : ");
		String name = sc.next();
		
		System.out.print("Enter the place : ");
		String place = sc.next();
		
		System.out.print("Enter the id : ");
		int bill = sc.nextInt();
		
		st.setInt(1, id);
		st.setString(2, name);
		st.setString(3, place);
		st.setInt(4, bill);
		int n = st.executeUpdate();
		System.out.println("The number of rows updated are : " + n);
		System.out.println("After updating the table the tale is as : ");
		viewAll();
	
}
public static void deleteCustID() throws SQLException, ClassNotFoundException {
		
		Connection con = DBUtility.getMyConnection();
		Statement st = con.createStatement();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the id to delete: ");
		int id = sc.nextInt();
		
		int n = st.executeUpdate("Delete from hr.Customer where CustomerID = " + id  );
		System.out.println("The number of rows updated are : " + n);
		System.out.println("After updating the table the tale is as : ");
		viewAll();
	
}
}
