package com.deloitte.cms.client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.exception.Configurable;


public class ClientApp {
	public static void main(String[] args) {
		Customer cust = new Customer(11,"preti","delhi",10111);
		Configuration config = new Configuration().configure();
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction trans = session.beginTransaction();
		session.save(cust);
		trans.commit();
		session.close();
		factory.close();
		
		System.out.println(cust.getCustomerName() + " your data created ");
	}
}
