

import java.util.List;
public interface CustomerDAO {
	public List<Customer> getAllCusomers();
	public boolean insertCustomer(Customer customer);
	public boolean updateCustomer(Customer customer);
	public boolean deleteCustomer(int id);
	public Customer searchCustomerById(int customerId);
	public boolean isCustomerExists(int customerId);
	
}
