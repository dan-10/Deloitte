package com.deloitte.cms.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtility {
	public static Connection getMyConnection() {
		Connection con = null;
		FileReader fr = null;
		Properties pr = new Properties();
		try {
			fr = new FileReader("C:\\Users\\matham26\\Documents\\MyDetail.properties");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			pr.load(fr);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String driver = pr.getProperty("driver");
		String url = pr.getProperty("url");
		String username = pr.getProperty("username");
		String password = pr.getProperty("password");
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,username, password);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
	}
}
