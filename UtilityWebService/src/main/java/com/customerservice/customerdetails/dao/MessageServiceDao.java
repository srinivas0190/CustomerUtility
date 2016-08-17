package com.customerservice.customerdetails.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.customerservice.customerdetails.model.Customer;
import com.customerservice.customerdetails.util.HIbernateUtil;


/**
 * JMS service DAO to insert the service id for a given customer id
 * @author Srinivas Kondapaneni
 *
 */
public class MessageServiceDao {
	
	public int saveCustomerService(int c_id, int serv_id){
		
		Session session = HIbernateUtil.getSessionFactory().getCurrentSession();
		
		session.getTransaction().begin();
		int row = 0;
		try {
			
			Customer cust = (Customer)session.get(Customer.class, c_id);
			
	         cust.setServ_id(String.valueOf(serv_id));
	         
	         session.update(cust); 
			
			session.getTransaction().commit();
			
		} catch (HibernateException e) {
			e.printStackTrace();
			
			session.close();
		}
		return row;	
	}
}
