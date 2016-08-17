package com.customerservice.customerdetails.webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.jboss.logging.Logger;

import com.customerservice.customerdetails.model.Customer;
import com.customerservice.customerdetails.service.CustomerService;

/**
 *Rest service class
 * @author SrinivasKondapaneni
 *
 */
@Path("/cust")
@Produces("application/json")
public class CustomerServiceWS {

	final static Logger logger = Logger.getLogger(CustomerServiceWS.class);
	
	  @Path("{param}")
	  @GET
	  @Produces("application/json")
	public Customer getCustomerDetails(@PathParam("param") int c_id) {
		  
		logger.info("Invoked rest call");

		CustomerService custService = new CustomerService();

		Customer customer = custService.getCustomerDetails(c_id);
		
		logger.info("Completed Rest Call");
		logger.info(customer);
		
		return customer;
	}
	
}
