package com.customerservice.customerdetails.service;

import com.customerservice.customerdetails.dao.CustomerServiceDao;
import com.customerservice.customerdetails.model.Customer;


/**
 * customer service class to get customer details from DAO 
 * @author Srinivas Kondapaneni
 *
 */
public class CustomerService{
	
	public Customer getCustomerDetails(int c_id){
		
		CustomerServiceDao cust_DAO = new CustomerServiceDao();
		
		Customer cust = cust_DAO.getCustomerDAO(c_id);
		
		return cust;
	}

}
