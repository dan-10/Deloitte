package com.delloite;

import java.util.Comparator;

public class CustomerNameComparator implements Comparator<CustomerApp> {

	@Override
	public int compare(CustomerApp arg0, CustomerApp arg1) {
		if(arg0.getCustomerName().compareTo(arg1.getCustomerName()) < 0)
			return -1;
		return 0;
	}

}
