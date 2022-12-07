package com.Charter.service;

import com.Charter.entity.Customer;
import com.Charter.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RewardsService {
    @Autowired
    CustomerRepository customerRepository;

    public Customer loginCustomer(Customer customer) {return customerRepository.login(customer.getRewards().getUsername(), customer.getRewards().getPassword());}
    public void updateRewardsPoints(Customer customer) {
        customerRepository.updatePoints(customer);}
}
