package com.isoft.travellodge.service;

import com.isoft.travellodge.model.Customer;
import com.isoft.travellodge.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    //save the customer
    public void addNewCustomer(Customer customer) {
        customerRepository.save(customer);
    }
}
