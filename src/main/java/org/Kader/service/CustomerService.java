package org.Kader.service;

import java.util.List;

import org.great.ServerModelClassExample.entities.Customer;

public interface CustomerService {


    Customer save(Customer customer);

    Customer fetchById(int profileId);

    List<Customer> fetchAllProfiles();
}
