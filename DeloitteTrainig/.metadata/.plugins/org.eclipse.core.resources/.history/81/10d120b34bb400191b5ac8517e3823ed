


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;


public class CustomerDOAImpl implements CustomerDAO {
	/*private static final String SELECT_CUSTOMER_QUERY = "select * from hr.customer where customerId = ?";
	private static final String SELECT_ALL_CUSTOMER = "select * from hr.customer";
	private static final String INSERT_CUSTOMER = "INSERT INTO hr.customer values(?,?,?,?)";
	private static final String UPDATE_CUSTOMER_ = "update hr.customer set customername = ?, customeraddress = ?, billamount = ? where customerId = ?";
	private static final String DELETE_CUSTOMER = "delete from hr.customer where customerId = ?";
	private static final String SEARCH_CUSTOMER = "select customername, customeraddress, billamount from hr.customer where customerId = ?";*/
	
	Configuration config = new Configuration().configure();
	SessionFactory factory = config.buildSessionFactory();
	
	
	@Override
	public List<Customer> getAllCusomers() {
		Session session = factory.openSession();
		Query query = session.createQuery("from Customer where billAmount > 10000");
		List allcust = query.list();
		/*Iterator<Customer> it = query.iterate();
		List<Customer> allcust = new ArrayList<Customer>();
		while(it.hasNext()) {
			Customer c = it.next();
			allcust.add(c);
		}
	*/
		//return session.createQuery("from Customer").list();
		Criteria criteria = session.createCriteria(Customer.class);
		//criteria.add(Restrictions.like("customerAddress", "Telengana"));
		return criteria.list();
		
	}

	@Override
	public boolean insertCustomer(Customer cust) {
		//Customer cust = new Customer(11,"preti","delhi",10111);
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		session.save(cust);
		trans.commit();
		session.close();
		factory.close();
		return true;
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		session.update(customer);
		trans.commit();
		session.clear();
		return true;
	}

	@Override
	public boolean deleteCustomer(int id) {
		Session session = factory.openSession();
		
		Transaction trans = session.beginTransaction();
		Customer cust = new Customer();
		cust = (Customer)session.get(Customer.class, id);
		session.delete(cust);
		trans.commit();
		session.close();
		return true;
	}

	@Override
	public Customer searchCustomerById(int customerId) {
		Session session = factory.openSession();
		Customer cust = new Customer();
		cust = (Customer)session.get(Customer.class, customerId);
		//System.out.println(cust);
		return cust;
	}

	@Override
	public boolean isCustomerExists(int customerId) {
		Session session = factory.openSession();
		Customer cust = new Customer();
		cust = (Customer)session.get(Customer.class, customerId);
		System.out.println(cust);
		if(cust == null)
			return false;
		return true;
		
	}

}
