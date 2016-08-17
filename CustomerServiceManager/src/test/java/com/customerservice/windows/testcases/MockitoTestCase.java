package com.customerservice.windows.testcases;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.mockito.Mockito;

import com.customerservice.model.registration.Customer;
import com.customerservice.service.registration.CustomerServiceHandler;


public class MockitoTestCase {
	
	@Test
	public void testGetCustomer() {
		Customer customer = new Customer();
		customer.setUname("srinivas");
		customer.setPassword("srinivas");
		customer.setEmail("srinivas@gmail.com");
		customer.setPhoneNum("123456789");
		
		CustomerServiceHandler custImpl = Mockito.mock(CustomerServiceHandler.class);
		
		when(custImpl.getCustomer(1)).thenReturn(customer);
		
		assertEquals(custImpl.getCustomer(1), customer);
	}

}
