package com.deloitte.cms.controller;

import java.util.List;
import java.util.Scanner;

public class NewClient {
public static void main(String[] args) {
	
	CustomerDAO c = new CustomerDOAImpl();
	
	
	System.out.println("M E N U ----");
	Scanner sc = new Scanner(System.in);
	
	System.out.println("1. Insert Customer\n2.Search Customer \n3.IsCustomerExists \n4.Delete\n5.To View all\n6.Update");
	System.out.print("Enter your choice : ");
	
	int opt = sc.nextInt();
	
	switch(opt){
	
		case 1://insert
			Customer cust = new Customer(1000,"Kode","Telengana",12000);
			if(c.insertCustomer(cust))
				System.out.println("Customer added");
			else 
				System.out.println("Customer not added");
			break;
			
		case 2://search
			Customer cust1 = new Customer();
			System.out.println("Enter the ID to be searched : ");
			int id = sc.nextInt();
			cust1 = c.searchCustomerById(id);
			System.out.println(cust1);
			break;
			
		case 3://iscustomer
			System.out.println("Enter the ID to be checked : ");
			int ck = sc.nextInt();
			if(c.isCustomerExists(ck))
				System.out.println("Present");
			else
				System.out.println("Not Present");
			break;
			
		case 4://delete
			System.out.println("Enter the ID to be deleted : ");
			int dl = sc.nextInt();
			if(c.deleteCustomer(dl))
				System.out.println("Deleted");
			else
				System.out.println("Not Deleted");
			break;
			
		case 5://select all
			List<Customer> allcust = c.getAllCusomers();
			for(Customer ac : allcust) {
				System.out.println(ac);
			}
			break;
			
		case 6:
			Customer css = new Customer(1000,"Kode","Chennai",12000);
			if(c.updateCustomer(css))
				System.out.println("Got updated");
			else
				System.out.println("Not updated");
			break;
	}
	
	
}
}
 