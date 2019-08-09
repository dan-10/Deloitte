package com.deloitte.cms.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class NewClient {
public static void main(String[] args) {
	
	Configuration config = new Configuration().configure();
	SessionFactory factory = config.buildSessionFactory();
	Session session = factory.openSession();	
	Transaction trans = session.beginTransaction();
	Set alladdress = new HashSet();
	
	EmployeeDetails emp1 = new EmployeeDetails(1, "Arun", 10000);
	EmployeeDetails emp2 = new EmployeeDetails(2, "Varun", 10000);
	EmployeeDetails emp3 = new EmployeeDetails(3, "Sharun", 10000);

	
	Address ad1 = new Address(1, "Hyd", "Telengana");
	Address ad2 = new Address(2, "Blr", "Karnataka");
	
	alladdress.add(ad1);
	alladdress.add(ad2);
	
	emp1.setEmployeeAddress(alladdress);
	emp2.setEmployeeAddress(alladdress);
	emp3.setEmployeeAddress(alladdress);
	
	session.save(emp1);
	session.save(emp2);
	session.save(emp3);
	
	System.out.println("Its running !!!!!!!!!!!!");
	trans.commit();
	session.close();
	factory.close();
	
}
}
 