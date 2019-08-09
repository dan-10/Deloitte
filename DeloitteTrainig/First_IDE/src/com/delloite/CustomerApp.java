package com.delloite;

public class CustomerApp implements Comparable{
	private int customerId;
	private String customerName;
	private int billNo;
	
	
	public CustomerApp() {
	}
	public CustomerApp(int customerId, String customerName, int billNo) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.billNo = billNo;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getBillNo() {
		return billNo;
	}
	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + billNo;
		result = prime * result + customerId;
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerApp other = (CustomerApp) obj;
		if (billNo != other.billNo)
			return false;
		if (customerId != other.customerId)
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CustomerApp [customerId=" + customerId + ", customerName=" + customerName + ", billNo=" + billNo + "]\n";
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}
