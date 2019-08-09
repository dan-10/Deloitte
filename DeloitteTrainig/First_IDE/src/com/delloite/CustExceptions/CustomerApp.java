package com.delloite.CustExceptions;

import java.sql.SQLException;
import java.util.Scanner;
public class CustomerApp {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Options\n1.To view\n2.To Insert\n3To Insert Manually\n4Insert using Prepare Statement");
		System.out.println("5. To Delete");
		int opt = sc.nextInt();
		
		if(opt == 1)
			CustomerDBOperation.viewAll();
		if(opt ==2)
			CustomerDBOperation.insertVal();
		if(opt == 3)
			CustomerDBOperation.insertUserVal();
		if(opt == 4)
			CustomerDBOperation.insertUserValPrep();
		if(opt == 5)
			CustomerDBOperation.deleteCustID();
	}
}
