package com.delloite.model;

import com.delloite.CustomerApp;
import com.delloite.CustExceptions.InvalidId;

public class Customer {
	public static void main(String args[]) {
		CustomerApp a = new CustomerApp();
		a.setBillNo(100);
		try {
			a.setCustomerId(-1);
			if(a.getCustomerId() < 0) {
				throw new InvalidId("The customerID is invalid");
			}
		}catch(InvalidId e) {
		System.out.println("erroR");
		}
		a.setCustomerName("A");
		System.out.println(a);
	}
}
