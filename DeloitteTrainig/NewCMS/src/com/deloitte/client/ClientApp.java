package com.deloitte.client;

import java.util.ArrayList;
import java.util.List;

import com.deloitte.cms.dao.Customer;
import com.deloitte.cms.dao.CustomerDAO;
import com.deloitte.cms.dao.impl.CustomerDOAImpl;

public class ClientApp {
public static void main(String[] args) {
	int customer = 100;
	CustomerDAO cd = new CustomerDOAImpl();
	boolean result = cd.isCustomerExists(9);
	/*System.out.println(result);
	
	/*Customer cust = new Customer(10,"New","Dhi",1000);
	result = cd.updateCustomer(cust);
	result = cd.deleteCustomer(10);
	System.out.println(result);
	*/
	/*Customer c = cd.searchCustomerById(2);
	System.out.println(c);*/
	List<Customer> cust = new ArrayList<Customer>();
	cust = cd.getAllCusomers();
	for(Customer cc : cust) {
		System.out.println(cc);
	}
}
}
