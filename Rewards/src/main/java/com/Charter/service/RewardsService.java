package com.Charter.service;

import com.Charter.entity.Customer;
import com.Charter.repository.RewardsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RewardsService {
    @Autowired
    RewardsRepository rewardsRepository;

    public Customer loginCustomer(Customer customer) {rewardsRepository.login(customer.getUsername(), customer.getPassword());}
    public void updateRewardsPoints(Customer customer) {rewardsRepository.updatePoints(customer);}
}
