package com.customerservice.controller.registration;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.customerservice.model.registration.Customer;
import com.customerservice.service.registration.CustomerServiceHandler;

/**
 * 
 * Spring Controller to start the service to save the customer
 * @author Srinivas Kondapaneni
 *
 */
@Controller
public class CustomerServiceController {
	
	
	@Autowired
	private CustomerServiceHandler customerServHandler;

		@RequestMapping(value = "/register", method = RequestMethod.POST)
		public ModelAndView controlRegistration(@ModelAttribute("registerPage") Customer customer, ModelMap model) {
		
			String serviceDetails = customerServHandler.sendCustomer(customer);
			
			if (serviceDetails != null) {
				
		        model.addAttribute("serviceDetails",serviceDetails);
		
				return new ModelAndView("register","customer", customer );
			}
			else {
			
				return new ModelAndView("errorPage","customer",customer);
			}
			
		}
		}