package com.delloite;

import java.util.Comparator;

public class CustomerIdComparator implements Comparator<CustomerApp> {

	@Override
	public int compare(CustomerApp o1, CustomerApp o2) {
		if(o1.getCustomerId() < o2.getCustomerId())
			return -1;
		return 0;
	}

}
