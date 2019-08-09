package com.delloite.CustExceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select : 1. For Viewing\n2. For inserting");
		int opt = sc.nextInt();
		
		if(opt == 1)
			selectQuery();
		else if(opt == 2)
			upateQuery();
	}

	private static void selectQuery() throws ClassNotFoundException, SQLException {
		//Load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Create the connection
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system", "system");
		System.out.println("DriverLoaded");
		
		//create statement
		Statement statement = connection.createStatement();
		
		//execute the statement
		ResultSet resultset = statement.executeQuery("select * from HR.mrk");
		while(resultset.next()) {
			System.out.println(resultset.getString(1) + " " + resultset.getString(2));
		}
	}
	
	private static void upateQuery() throws ClassNotFoundException, SQLException {
		//Load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Create the connection
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system", "system");
		System.out.println("DriverLoaded");
		
		//create statement
		Statement statement = connection.createStatement();
		
		int n = statement.executeUpdate("insert into HR.mrk VALUES(1,99)");
		System.out.println("Number of rows affected " + n);
		
	}
	
}
