package org.Kader.controller;

import java.util.List;

import org.Kader.service.CustomerService;
import org.great.ServerModelClassExample.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class ProfileController {
	
	    @Autowired
	    CustomerService customerService;

	    @RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
	    public Customer save(@RequestBody Customer customer) {
	        return customerService.save(customer);
	    }

	    @RequestMapping(value = "/getCustomerById", method = RequestMethod.GET)
	    public Customer fetch(@RequestParam int profileId) {
	        return customerService.fetchById(profileId);
	    }

	    @RequestMapping(value = "/getAllCustomers", method = RequestMethod.GET)
	    public List<Customer> fetch() {
	        return customerService.fetchAllProfiles();
	    }

}
